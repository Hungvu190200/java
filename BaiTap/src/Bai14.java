
import java.util.Scanner;
public class Bai14 {
    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }
    public static void inMT(int[][] A, int n, int m){
        int i,j;
        for(i=0 ; i<n ; i++){
            System.out.print("\n");
            for(j=0 ; j<m ; j++) System.out.print(" "+A[i][j]);
        }
    }
    public static int findMaxMT(int[][] A, int n, int m){
        int Max= A[0][0];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(Max<A[i][j]) Max= A[i][j];
            }
        }
        return (Max);
    }
    public static void main(String[] args) {
        System.out.print("Nhập số hàng n=");
        int n= nhap();
        System.out.print("Nhập số cột m=");
        int m= nhap();
        int [][] A= new int[n][m];
        int i,j;
        for(i=0 ; i<n ; i++){
            for(j=0 ; j<m ; j++){
                System.out.println("Nhập phần tử thứ A["+(i+1)+"]["+(j+1)+"]= ");
                A[i][j]= nhap();
            }
        }
        //In ra ma tran nhap vao
        System.out.println("Ma trận đầu vào: ");
        inMT(A, n, m);
        //Tim phan tu max
        for(i=0 ; i<n ; i++){
            for(j=0 ; j<m ; j++){
                if(A[i][j]==findMaxMT(A, n, m))System.out.println("\nPhần tử ở hàng "+i+" cột "+j+" đạt Max: A["+i+"]["+j+"]= "+A[i][j]);
            }
        }
    }
}