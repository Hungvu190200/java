import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;
        for (;b>0;b--){
            result*=a;
        }
        System.out.println("gia thua la: "+result);
    }
}
