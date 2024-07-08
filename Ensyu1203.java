import java.util.Scanner;

class Ensyu1203{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        int n;
        double x;
        System.out.print("nを入力（整数値）-->");
        n=sc.nextInt();
        x=Math.pow(2,n);
        System.out.println(" 2の "+n+" 乗＝ "+x);

    }
}