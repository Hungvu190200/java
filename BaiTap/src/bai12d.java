import java.util.Scanner;

public class bai12d {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        /*khởi tạo mảng
         */
        a = new int[n];
        nhap(a,n);
        xuat(a,n);
        /*In ra min max
         */


        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<n;i++) {
            if (check(a[i])  )
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        /**gọi hàm sắp xếp
         * in hàm sau khi sắp xếp
         */

    }
    public static void nhap(int a[],int n){
        Scanner scanner = new Scanner(System.in);
        // tạo đối tượng scanner để nhập
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();

    }
    public static void xuat(int a[],int n){
        for (int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println(""); //dùng để xuống hàng
    }


    public static boolean check(int n){
        if(n<=1) return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
            if(n%i==0) return false;
        //Nếu không chia hết thì trả về true
        return true;
    }



}
