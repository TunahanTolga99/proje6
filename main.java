import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Sayı Giriniz !");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0){;
                total += n;
            }
        }while (n % 2 == 0);
        System.out.println("Toptlam : " + total);
    }
}



