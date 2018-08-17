package Exercise2;

import java.util.Scanner;

public class ConvertDegree {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Celsius: ");
        float celsius = scanner.nextFloat();

        System.out.println();
        System.out.print("Convert from celsius to fahrenheit: ");
        float fahrenheit = ((9*celsius)/5) + 32;
        System.out.print(fahrenheit);
    }
}
