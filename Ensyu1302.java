class Oyu extends Water // お湯クラス
{
  int temp = 100; // 温度

  // 量vと温度tを指定するコンストラクタ
  public Oyu( double v, int t ){
    super(v);
    temp=t;

  }
  void showTemp(){ // 温度を表示
    System.out.println(" 温度＝"+temp);
  }
}
class Water // 水クラス
{
  double vol = 0.0; // 体積(cc)

  public Water( double v ){ // 体積を指定するコンストラクタ
    vol = v;
  }
  public void showVol(){ // 体積を表示
    System.out.println(" 体積 = " + vol + " cc" );
  }
}
class Ensyu1302
{
  public static void main(String[] args)
  {
    // お湯クラスのオブジェクト
    System.out.println("- お湯 ----");
    Oyu oy = new Oyu( 180.0, 85 );
    oy.showTemp();
    oy.showVol();
  }
}