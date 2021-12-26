import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            sum+=(float) 1/i;
        }
        System.out.println("tong: "+sum);
    }
}
