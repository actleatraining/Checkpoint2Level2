public class Room {

    private String name;
    private int width;
    private int depth;

    public Room(String name, int width, int depth) {
        this.name = name;
        this.width = width;
        this.depth = depth;
    }

    public void printDescription() {
        System.out.println("Room: " + this.name);
        System.out.println("Width and depth: " + this.width + " x " + this.depth +" m");
        System.out.println("Area: " + (this.width * this.depth) + " m2");
    }
}
