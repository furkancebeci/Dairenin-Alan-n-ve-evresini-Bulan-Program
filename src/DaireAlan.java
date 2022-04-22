import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double r;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yari capini giriniz: ");
        r = input.nextDouble();

        double field = (Math.PI * r * r);
        double perimeter = (2 * Math.PI * r);

        System.out.println("Dairenin alani = " + field);
        System.out.println("Dairenin cevresi = " + perimeter);

        System.out.println(Math.PI * (r*r) );
    }
}
