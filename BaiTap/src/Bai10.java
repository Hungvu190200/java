import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int n;
        int tong=0;

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while (n>0) {
            tong+=n%10;
            n= n/10;
        }
        System.out.println("tong cac chu so cua n la: "+tong);
    }
}
