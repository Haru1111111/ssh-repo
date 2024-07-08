// 第11回 課題４の解答例
import java.util.Scanner;

class Kadai1202
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    

    System.out.print("２進数を入力-->");
    String str = sc.next(); // 文字列を入力

    int len = str.length();
    for(int i=0;i<len;i++){
      if( str.charAt(len-i-1)=='1' ){ // 1だった
        sum+=Math.pow(2,i);
      }
    }
    System.out.println(str + "の10進数は " + sum + " です" );
  }
}