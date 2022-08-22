public class Apartment {
    private String type;
    private Room room1;
    private Room room2;
    private Room room3;

    public Apartment(String type, Room room1, Room room2, Room room3) {
        this.type = type;
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
    }


    public void printDescription(){
        System.out.println("Type: " + this.type);
        this.room1.printDescription();
        this.room2.printDescription();
        this.room3.printDescription();
    }
}
