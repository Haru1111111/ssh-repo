import java.util.Scanner;

class Student
{
  public String name;
  public int no;

  public void show(){
    System.out.println(" 名前:" + name + ", 学籍番号:" + no );
  }
}

class Kadai1405
{
  public static void main(String[] args)
  {
    Student [] st = new Student [5];
    int num;

    Scanner sc = new Scanner(System.in);

    System.out.print("人数を入力-->");
    num = sc.nextInt();
 try{
    for(int i=0;i<num;i++){
      st[i] = new Student();
      System.out.print(" 名前と学籍番号を入力-->");
      String s = sc.next();
      st[i].name = new String( s );
      int n = sc.nextInt();
      st[i].no = n;
    }
  
    // 表示

    System.out.println("");
    for(int i=0;i<5;i++) st[i].show();
    System.out.println("");
    }catch(NullPointerException e){
        System.out.println("【エラー】NULLのオブジェクトを参照しようとしました");
    }catch(InputMismatchException n){
        System.out.println("エラー】配列の範囲指定が不正です");
    }
  }
}