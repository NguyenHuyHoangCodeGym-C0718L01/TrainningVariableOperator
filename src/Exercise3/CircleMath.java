package Exercise3;

import java.util.Scanner;

public class CircleMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert radius: ");
        float radius = scanner.nextFloat();

        System.out.println();
        System.out.print("perimeter of circle: ");
        System.out.print(3.14*2*radius);

        System.out.println();
        System.out.print("area of circle: ");
        System.out.print(3.14*radius*radius);
    }
}
