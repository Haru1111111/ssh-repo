import java.util.Scanner;

class Ensyu1204
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int small,big,rnd;

    System.out.print("最小値を入力(整数値)--> ");
    small = sc.nextInt(); // 整数値を入力
    System.out.print("最大値を入力(整数値)--> ");
    big = sc.nextInt(); // 整数値を入力

    for(int i=0;i<100;i++){
        rnd = (int)(Math.random()*(big-small+1))+small;
        System.out.print(" " + rnd );
    }
  }
}