import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter apartment type (A, B, C):");
        String type = scanner.nextLine();
        System.out.println("Enter rooms in the apartment:");
        String roomsString = scanner.nextLine();

        List<Room> roomList = new ArrayList<>();
        String[] rooms = roomsString.split("&");
        for (String roomString : rooms) {
            roomString = roomString.trim();
            String[] roomInfo = roomString.split(" ");
            Room room = new Room(roomInfo[0],Integer.parseInt(roomInfo[1]) ,Integer.parseInt(roomInfo[2]));
            roomList.add(room);
        }

        if (roomList.size() > 2) {
            Apartment apartment = new Apartment(type, roomList.get(0), roomList.get(1), roomList.get(2));
            apartment.printDescription();
        }
        else {
            System.out.println("Less than three rooms in input, apartment needs at least 3 rooms!");
        }
    }
}
