import java.util.Scanner;

class Ensyu1404
{
  public static void main(String[] args)
  {
    String str;
    int num;

    Scanner sc = new Scanner(System.in);

    System.out.print("文字列を入力-->");
    str = sc.next();
    try{
        System.out.print("整数値を入力-->");
        num = sc.nextInt();
    }
    catch(InputMismatchException e){
        System.out.println("【エラー】　数値ではありません");
        num = sc.nextInt();
    }
    // 結果表示
    System.out.println("");
    for(int i=0;i<num;i++){
      System.out.print(str);
    }
    System.out.println("");
  }
}