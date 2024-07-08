import java.util.Scanner;

class Bunsuu // 分数を扱うクラス
{
    private int bunshi;
    private int bunbo;
    public double getVal(){ // 分数を数値で返す
      return (double)bunshi/bunbo;
  }
  public void setBunshi(int a)
  {
      bunshi=a;
      if(bunshi==0){
          System.out.println("エラー");
      }
  }
  public void setBunbo(int b)
  {
      bunbo=b;
      if(bunbo==0){
          System.out.println("【警告】分母は０を設定できません");
      }
  }
}

class Ensyu0902
{
  public static void main(String[] args)
  {
    int a,b;
    Bunsuu v = new Bunsuu();
    Scanner sc = new Scanner(System.in);

    System.out.print("分子-->");
    a = sc.nextInt();
    System.out.print("分母-->");
    b = sc.nextInt();

    //v.bunshi = a;
    //v.bunbo = b;
    v.setBunshi(a);
    v.setBunbo(b);
    System.out.println(a+"/"+b+" = "+v.getVal());
  }
}