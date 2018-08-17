package Exercise1;

import java.util.Scanner;

public class StudentPoints {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert name student: ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.print("Biology Point: ");
        double biology = scanner.nextDouble();

        System.out.println();
        System.out.print("Geometry Point: ");
        double geometry = scanner.nextDouble();

        System.out.println();
        System.out.print("Math Point: ");
        double math = scanner.nextDouble();

        System.out.println();
        System.out.println("Student name: "+name+ " Biology: "+biology+" Geometry: "+geometry+" Math: "+math);
    }
}
