import java.util.Scanner;

class Ensyu1104
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int bin = 1;

    System.out.print("４桁の２進数を入力-->");
    String str = sc.next(); // 文字列を入力

    if( str.charAt(3)=='1' ) sum += bin; //4文字目が'1'なら +(2の0乗)
    bin *= 2;
    if(str.charAt(2)=='1' ) sum += bin; //3文字目が'1'なら +(2の1乗)
    bin *= 2;
    if( str.charAt(1)=='1' ) sum += bin; //2文字目が'1'なら +(2の2乗)
    bin *= 2;
    if( str.charAt(0)=='1' ) sum += bin; //1文字目が'1'なら +(2の3乗)

    System.out.println(str + "の10進数は " + sum + " です" );
  }
}