package shubham;

public class Example {
    public static void main(String[] args) {
        // Create variables
        int a = 3;
        int var;

        // Print the initial value of 'a'
        System.out.println("a = " + a);

        // Assign value using =
        var = a;
        System.out.println("var using = " + var);

        // Assign value using +=
        var += a;
        System.out.println("var using += " + var);

        // Assign value using -=
        var -= a;
        System.out.println("var using -= " + var);

        // Assign value using *=
        var *= a;
        System.out.println("var using *= " + var);

        // Assign value using /=
        var /= a;
        System.out.println("var using /= " + var);

        // Assign value using %=
        var %= a;
        System.out.println("var using %= " + var);
    }
}
