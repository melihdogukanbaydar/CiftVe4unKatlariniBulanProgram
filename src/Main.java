import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int toplam =0;

        Scanner inp = new Scanner( System.in);

        do {
            System.out.println("Sayı Giriniz :");
            n = inp.nextInt();
            if (n % 4 == 0){
                toplam += n;
            } else if ( n % 2 == 1) {
                System.out.println("Tek Sayı Girdiniz");
                break;
            }
        }while (n > 0);

        System.out.println("Toplam : " + toplam);




    }
}