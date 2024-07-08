import java.util.Scanner;

class Kadai1104
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int bin = 1;

    System.out.print("２進数を入力-->");
    String str = sc.next(); // 文字列を入力

    int len =str.length();

    for(int i=len-1;i>-1;i--){
        if(str.charAt(i)=='0'){
            bin*=2;
        }
        else{
            sum+=bin;
            bin*=2;
        }
    }
    System.out.println(str + "の10進数は " + sum + " です" );
  }
}