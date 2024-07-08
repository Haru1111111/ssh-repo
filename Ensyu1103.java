import java.util.Scanner;

class Ensyu1103
{
  public static void main(String[] args)
  {
    int cnt = 0; // 含まれる個数
    Scanner sc = new Scanner(System.in);

    System.out.print("文字列を入力-->");
    String str = sc.next(); // 文字列を入力
    System.out.print("文字を1文字入力-->");
    char ch = (sc.next()).charAt(0); // １文字を入力

    for(int i=0;i<str.length();i++){
      if( str.charAt(i)==ch)cnt++; // 文字が一致した
    }
    System.out.println(" " + ch + "の個数は " + cnt + "個です" );
  }
}