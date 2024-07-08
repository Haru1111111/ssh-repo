class Kaisuu extends Ziyuu // 回数券クラス
{
  public Kaisuu(){ // 引数なしコンストラクタ
    super(); // 1枚あたりのprice
    price-=360;
  }
  void showGoukei(){ // 合計を表示
    System.out.println(" 6枚綴りの価格 = " + price *6+ "円");
  }
}
class Ziyuu // 自由席クラス
{
  int price; // 料金

  public Ziyuu(){ // 引数なしコンストラクタ
    price = 5500; // 新大阪～岡山 自由席料金
  }
  public void showPrice(){ // 料金を表示
    System.out.println(" 料金 = " + price + " 円" );
  }
}
class Ensyu1304
{
  public static void main(String[] args)
  {
    // 自由席クラスのオブジェクト
    System.out.println("- 自由席 ----");
    Ziyuu zi = new Ziyuu();
    zi.showPrice();

    // 回数券クラスのオブジェクト
    System.out.println("- 回数券 ----");
    Kaisuu ka = new Kaisuu();
    ka.showPrice();
    ka.showGoukei();
  }
}