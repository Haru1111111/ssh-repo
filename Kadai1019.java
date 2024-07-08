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

    if(str.indexOf(s_in)!=-1){
        cnt++;
    }
    }
    System.out.println(" "+s_in+"の個数は "+cnt+"個です");
  }
}