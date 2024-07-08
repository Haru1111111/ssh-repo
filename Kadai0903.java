import java.util.Scanner;

class Measure // 長さを扱うクラス
{
  private int len; // 長さ(cm)
  private int sum;
  private double c=0;
  public Measure(){
    sum=0;
  }
  public void addLen(int a){
    sum+=a;
  }
  public void addLen(double b){
    c=b*2.54;
    sum+=c;
  }
  int getLen(){
    return sum;
  }
  boolean isCarryOn(){
    return sum<115;
  }

}

class Kadai0903
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Measure m1 = new Measure();
    Measure m2 = new Measure();

    // inchで入力
    System.out.println("＜inchで入力(double型)＞");
    for(int i=0;i<3;i++){
      System.out.print(" " + (i+1) + "つ目の長さ--> ");
      double d = sc.nextDouble(); // キーボードからDouble型で入力
      m1.addLen(d); // dを加算
    }
    System.out.print("  合計 = " + m1.getLen() + "cm, 機内持ち込み" );
    if( m1.isCarryOn()==true ){
      System.out.println("OK");
    }else{
      System.out.println("NG");
    }

    // cmで入力
    System.out.println("\n＜cmで入力(int型)＞");
    for(int i=0;i<3;i++){
      System.out.print(" " + (i+1) + "つ目の長さ--> ");
      int a = sc.nextInt(); // キーボードからint型で入力
      m2.addLen(a); // aを加算
    }
    System.out.print("  合計 = " + m2.getLen() + "cm, 機内持ち込み" );
    if( m2.isCarryOn()==true ){
      System.out.println("OK");
    }else{
      System.out.println("NG");
    }
  }
}