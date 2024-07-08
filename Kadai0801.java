import java.util.Scanner;

class Kadai0801
{
    public static void main(String[] args)
    {
        int ans=1;
        System.out.print("aを入力--->");
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("nを入力--->");
        sc =new Scanner(System.in);
        int y=sc.nextInt();

        for(int i=0;i<y;i++){
            ans*=x;
        }
        System.out.println("aのn乗="+ans);
    }
}