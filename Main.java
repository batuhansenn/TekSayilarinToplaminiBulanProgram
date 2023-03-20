import javax.net.ssl.SSLContextSpi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Lütfen sayı giriniz: ");
            n = inp.nextInt();
            if (n %  4 == 0 && n % 2 == 0){
                total += n;
            }
        }while (n > 0);

        System.out.println(total);
    }

}