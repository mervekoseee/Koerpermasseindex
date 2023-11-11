import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kilo, boy, sonuc;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        sonuc = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + sonuc);
    }
}