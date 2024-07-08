import java.util.Scanner;

class Ensyu1205
{
  public static void main(String[] args)
  {
    Meibo [] mb = new Meibo[5];
    Scanner sc = new Scanner(System.in);

    for(int i=0;i<mb.length;i++){
      System.out.print("名前を入力--> ");
      String s = sc.next(); // 文字列を入力
      mb[i] = s;
    }

    for(int i=0;i<mb.length;i++){ // 名前を表示
      System.out.println(" 名前：" + mb[i] );
    }
  }
}

class Meibo
{
  String name; // 名前

  public Meibo( String s ){ // コンストラクタ
    name = new String( s );
  }
}