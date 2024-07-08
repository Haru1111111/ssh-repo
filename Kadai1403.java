import java.util.Scanner;

class Kadai1403
{
  public static void main(String[] args)
  {
    int a,b;

    Scanner sc = new Scanner(System.in);

    System.out.print("文字列を入力-->");
    String str = sc.next();
    System.out.print("何文字目から？-->");
    a = sc.nextInt();
    System.out.print("文字数は？-->");
    b = sc.nextInt();

    // a文字目からb文字だけ一文字ずつ表示する
    try{
      for(int i=a-1;i<a-1+b;i++){
        char ch = str.charAt(i);
        System.out.print( ch + " " );
      }
    }catch(Exception e){
      System.out.println("【エラー】文字列の範囲を超えました");
    }
  }
}