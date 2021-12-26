import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        double a,b,c,x1,x2, x,delta;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("nhap a: "+ a);
        System.out.println("nhap b: "+ b);
        System.out.println("nhap c: "+c);
        System.out.println("phương trình vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c +" =0");

        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0){
            System.out.println("phương trình vô nghiệm");
        }else if (delta == 0){
            x = -b/ (2*a);
            System.out.println("Phương trình có 2 nghiệm x1,x2 = "+ x);
        }else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt x1: "+ x1+" và "+",x2: "+x2);
        }
    }
}
