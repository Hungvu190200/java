import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        int thuong = a/b;
        System.out.println("tong: "+tong);
        System.out.println("hieu: "+hieu);
        System.out.println("tich: "+tich);
        System.out.println("thuong: "+thuong);
    }
}
