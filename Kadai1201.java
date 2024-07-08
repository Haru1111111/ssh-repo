import java.util.Scanner;

class Kadai1201
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double r, h;

    System.out.print("半径を入力(実数値)--> ");
    r = sc.nextDouble(); // 半径を入力

    System.out.print("高さを入力(実数値)--> ");
    h = sc.nextDouble(); // 高さを入力

    System.out.println(" 円柱の体積 = " + Math.pow(r,2)*Math.PI*h);
    System.out.println(" 円すいの体積 = " + Math.pow(r,2)*Math.PI/3*h);
  }
}