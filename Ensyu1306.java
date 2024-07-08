class F1Car extends RacingCar // F1クラス
{
  public String team; // チーム名

  // コンストラクタ n:番号、g:ガソリン、c:コース数、t:チーム名
  public F1Car( int n, double g, int c, String t ){
    super(n,g,c);
    team = new String( t );
  }
  public void show(){
    super.show(); // スーパークラスの表示を呼び出す
    System.out.println(" チーム = " + team);
  }
}
class RacingCar extends Car // RacingCarクラス
{
  public int course; // コース数

  // コンストラクタ n:番号、g:ガソリン、c:コース数
  public RacingCar( int n, double g, int c ){
    super(n,g);
    course = c;
  }
  public void show(){
    super.show(); // スーパークラスの表示を呼び出す
    System.out.println(" コース = " + course);
  }
}
class Car // Carクラス
{
  public int num; // ナンバー
  public double gas; // ガソリン

  // コンストラクタ n:番号、g:ガソリン
  public Car( int n, double g ){
    num = n;
    gas = g;
  }
  public void show(){
    System.out.println(" ナンバー = " + num + " ガソリン = " + gas);
  }
}
class Ensyu1306
{
  public static void main(String[] args)
  {
    // Carクラスのオブジェクト
    System.out.println("\n- Carクラス ----");
    Car c = new Car( 1234, 55.0 );
    c.show();

    // RacingCarクラスのオブジェクト
    System.out.println("\n- RacingCarクラス ----");
    RacingCar rc = new RacingCar( 5678, 85.0, 8 );
    rc.show();

    // F1クラスのオブジェクト
    System.out.println("\n- F1クラス ----");
    F1Car f1 = new F1Car( 9999, 110.0, 15, "フェラーリ" );
    f1.show();
  }
}