class Sports
{
  int person;  // チームの人数（人）
  double time; // 試合時間（分）
  static int p_sum = 0; // 全てのインスタンスのチーム合計人数

  public Sports(int p, double t){ // 人数、時間を指定
    person = p;
    time = t;
    Sports.p_sum+=1; // クラス変数に加算
  }

  public Sports(int p){ // 人数のみ指定
    this(p,0.0); // 他のコンストラクタを呼び出す
  }

  public Sports(){ // 指定なし
    this(1,0.0);   // 他のコンストラクタを呼び出す
  }

  public void showData(){
    System.out.println(" 人数 = "+ person + ", 時間 = " + time );
  }

  static public void showGoukei(){ // クラスメソッド
    System.out.println(" 合計人数 = " + p_sum );
  }
}

class Ensyu1006
{
  public static void main(String[] args)
  {
    Sports soccor = new Sports( 11, 90.0 ); // サッカー
    Sports rugby = new Sports( 15, 80.0 ); // ラグビー
    Sports baseball = new Sports( 9 ); // 野球
    Sports tennis = new Sports(); // テニス

    soccor.showData();
    rugby.showData();
    baseball.showData();
    tennis.showData();

    Sports.showGoukei(); // すべての合計人数を表示
  }
}