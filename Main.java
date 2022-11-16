import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kilo, boy, index;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilo: ");
        kilo = input.nextDouble();

        System.out.print("Boy: ");
        boy = input.nextDouble();

        index = (kilo/(boy*boy));

        System.out.println("Index ="+ index);

    }
}