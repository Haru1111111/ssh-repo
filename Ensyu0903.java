import java.util.Scanner;

class Bunsuu // 分数を扱うクラス
{
  private int bunshi;
  private int bunbo;
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
  }
  public void setNum(){
      bunshi=1;
      bunbo=10;
  }
  public void setNum(int s){
      bunshi=s;
      bunbo=10;
  }
  public void setNum(int s,int t){
      bunshi=s;
      bunbo=t;
      if(bunbo==0){
          System.out.println("【警告】分母は０を設定できません");
      }
  }

  public double getVal(){ // 分数を数値で返す
    return (double)bunshi/bunbo;
  }
}

class Ensyu0903
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

    v.setNum(); // 指定なし
    System.out.println(" (1) "+v.getVal());
    v.setNum(a); // 分子のみ指定
    System.out.println(" (2) "+v.getVal());
    v.setNum(a,b); // 分子、分母を指定
    System.out.println(" (3) "+v.getVal());
  }
}