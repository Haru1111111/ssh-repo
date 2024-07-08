interface iSeiseki // インターフェイス
{
  void show(); // すべてのデータを表示
  void showAverage(); // 平均を表示
  String getBestName(); // 一番良い結果の人の名前を返す
}
class Ten3 implements iSeiseki
{
  String [] name; // 名前
  int [] koku; // 国語
  int [] suu; // 数学
  int [] ei; // 英語
  double [] ave; // 平均点

  // コンストラクタ　n:名前　k:国語　s:数学　e:英語
  public Ten3( String [] n, int [] k, int [] s, int [] e ){
    int num = n.length; // 人数
    name = new String [num];
    koku = new int [num];
    suu = new int [num];
    ei = new int [num];
    ave = new double [num];
    for(int i=0;i<num;i++){
      name[i] = new String( n[i] );
      koku[i] = k[i]; suu[i] = s[i]; ei[i] = e[i];
      ave[i] = (k[i] + s[i] + e[i])/3.0;
    }
  }

  public void show(){
    for(int i=0;i<4;i++){
        System.out.print(name[i]+"、国：数：英＝");
        System.out.println(koku[i]+":"+suu[i]+":"+ei[i]);

    }

  }
  public void showAverage(){
    double Ave=0;
    double sum=0;
    for(int i=0;i<4;i++){
        sum+=ave[i];
    }
    Ave=sum/4;
    System.out.println("　平均 ＝ "+Ave+"点");
  }
  public String getBestName(){
    String bname=name[0];
    double bscore=ave[0];
    for(int i=0;i<4;i++){
        if(ave[i]>bscore){
            bname=name[i];
        }
    }
    return bname;
  }

}
class Kadai1402
{
  public static void main(String[] args)
  {
    String [] na = {"中村","山田","杉本","近藤"};
    int [] kokugo = { 68, 95, 85, 68 };
    int [] suugaku = { 90, 87, 66, 72 };
    int [] eigo = { 82, 59, 71, 87 };

    Ten3 ten = new Ten3( na, kokugo, suugaku, eigo );

    ten.show();
    ten.showAverage();
    System.out.println("  ベスト = " + ten.getBestName() );
  }
}