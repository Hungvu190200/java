import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số : ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " Là số nguyên tố");
        } else {
            System.out.println(n + " Không là số nguyên tố");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
