import java.util.Scanner;

class Ensyu1202
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double angle,rad;

    System.out.print("角度を入力(実数値)--> ");
    angle = sc.nextDouble(); // 実数値を入力

    rad = angle/180*Math.PI ;// ラジアン度数に変換
    System.out.println(" sin(" + angle + ") = " + Math.sin(rad) );
    System.out.println(" cos(" + angle + ") = " + Math.cos(rad) );
  }
}