/* Write a program to print A for Apple,B for Boy,C for cat,D for Dog,E for Elephant using switch case. */

public class CharacterPrinter {
    public static void main(String[] args) {
        char character = 'C';

        switch (character) {
            case 'A':
                System.out.println("A for Apple");
                break;
            case 'B':
                System.out.println("B for Boy");
                break;
            case 'C':
                System.out.println("C for Cat");
                break;
            case 'D':
                System.out.println("D for Dog");
                break;
            case 'E':
                System.out.println("E for Elephant");
                break;
            default:
                System.out.println("Unknown character");
        }
    }
}
