class Sub_A extends Super_A // サブクラス（子クラス）
{
  public Sub_A(){ // 引数なしコンストラクタ
    System.out.println("コンスト at Sub_A");
    super.num+=25; // numに25を加算する
  }
}
class Super_A // スーパークラス（親クラス）
{
  int num;

  public Super_A(){ // 引数なしコンストラクタ
    System.out.println("コンスト at Super_A");
    num=10; // numに10を代入する
  }
  public void show(){
    System.out.println(" > num = " + num + "  at Super_A" );
  }
}
class Ensyu1303
{
  public static void main(String[] args)
  {
    // Super_Aクラスのオブジェクト
    System.out.println("\n- Super_Aのオブジェクト ----");
    Super_A oya = new Super_A();
    oya.show();

    // Sub_Aクラスのオブジェクト
    System.out.println("\n- Sub_Aのオブジェクト ----");
    Sub_A ko = new Sub_A();
    ko.show();
  }
}