package shubham;

public class BalloonTest {
    public static void main(String[] args) {
        Balloon red = new Balloon("Red");   // Memory reference = 50.
        Balloon blue = new Balloon("Blue");  // Memory reference = 100.

        System.out.println("Initial Values of colors");
        System.out.println(" Balloon with `red` color value = " + red.getColor());
        System.out.println(" Balloon with `blue` color value = " + blue.getColor());

        swap(red, blue); // Swapping the balloon objects

        System.out.println("After the swap method executes:");
        System.out.println(" Balloon with `red` color value = " + red.getColor());
        System.out.println(" Balloon with `blue` color value = " + blue.getColor());

        changeValue(blue);

        System.out.println("After the changeValue method executes:");
        System.out.println(" Balloon with `blue` color value = " + blue.getColor());
    }

    /*
     * Generic swap method.
     * The references of the two objects are swapped.
     */
    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1 = o2;
        o2 = temp; // References are changed but it has no effect on the original references passed.
    }

    private static void changeValue(Balloon balloon) {
        // balloon = 100
        balloon.setColor("Red");  // This is the balloon with reference 100.
        balloon = new Balloon("Orange");  // A new balloon with reference 200.
        balloon.setColor("Pink");  // Working on the balloon with reference 200.
    }
}
