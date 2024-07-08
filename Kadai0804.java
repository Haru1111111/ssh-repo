import java.util.Scanner;

class SUM
{
    int a,ans;
    void setSum(int x){
        ans=x;
    }
    void addVal(int y){
        a=y;
    }
    int getSum(){
        ans+=a;
        return ans;
    }

}

class Kadai0804
{
  public static void main(String[] args)
  {
    int a,b;
    SUM v = new SUM();
    Scanner sc = new Scanner(System.in);

    v.setSum( 0 ); // 初期値を0に設定

    while( true ){ // 無限ループ
      System.out.print("数値を入力-->");
      a = sc.nextInt(); // キーボードからint型の数値を入力
      v.addVal( a );
      b = v.getSum(); // 現在の合計値を取得
      System.out.println("  累計 = " + b);
      if( b>100 ) break; // 合計が100を超えたのでbreak
    }
  }
}