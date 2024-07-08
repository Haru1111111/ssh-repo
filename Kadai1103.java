import java.util.Scanner;

class Kadai1103
{
  public static void main(String[] args)
  {
    int cnt = 0; // 含まれている文字列の個数
    Scanner sc = new Scanner(System.in);

    System.out.print("文字列を入力-->");
    String str = sc.next(); // 文字列を入力
    System.out.print("検索文字列を入力-->");
    String s_in = sc.next(); // 文字列を入力

    int a=s_in.length();
    for(int i=0;i<str.length()-a+1;i++){
        String b=str.substring(i,i+a);
        if(b.equals(s_in))cnt++;
    }
    System.out.println(" "+s_in+"の個数は "+cnt+"個です");
  }
}