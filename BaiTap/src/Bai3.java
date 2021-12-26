import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt() ;
        int b = sc.nextInt();
        double nghiem ;
        System.out.println("nhập số a: "+ a);
        System.out.println("nhập số b: "+ b);
        System.out.println("Phương trình bạn vừa nhập là: "+a+"x + "+b+"=0 ");
        if (a==0){
            if (b==0){
                System.out.println("phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            nghiem = (double) -b / a;
            System.out.println("Phương trình có nghiệm là: "+ nghiem);
        }

    }
}
