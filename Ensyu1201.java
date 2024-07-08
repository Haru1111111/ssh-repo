import java.util.Scanner;

class Ensyu1201
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double radius;

    System.out.print("半径入力(実数値)--> ");
    radius = sc.nextDouble(); // 実数値を入力

    System.out.println(" 円周の長さ = " + Math.PI*radius*2);
  }
}