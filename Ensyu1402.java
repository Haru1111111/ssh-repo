interface iSeiseki
{
  void show(); // すべてのデータを表示
  void showAverage(); // 平均を表示
  String getBestName(); // 一番良い結果の人の名前を返す
}

class Dash100 implements iSeiseki
{
  String [] name; // 名前
  double [] time; // タイム(秒)

  // コンストラクタ　n:名前  t:タイム
  public Dash100( String [] n, double [] t ){
    int num = n.length; // 人数
    name = new String [num];
    time = new double [num];
    for(int i=0;i<num;i++){
      name[i] = new String( n[i] );
      time[i] = t[i];
    }
  }
  public void show(){ // 全員の名前とタイムを表示
    for(int i=0;i<5;i++){
        System.out.println(name[i]+"、time ="+time[i]+"秒");
    }

  }
  public void showAverage(){ // 平均タイムを計算・表示
    double ave,sum=0;
    for(int i=0;i<5;i++){
        sum+=time[i];
    }
    ave=sum/5;
    System.out.println("　平均 = "+ave);
    

  }
  public String getBestName(){ // ベストタイムの人の名前を返す
    String bname=name[0];
    for(int i=0;i<4;i++){
        for(int j=1;j<5;j++){
            if(time[i]>time[j]){
                bname=name[j];
            }
            else{
                bname=name[i];
            }
        }
    }
    return bname;

  }
}
class Ensyu1402
{
  public static void main(String[] args)
  {
    String [] na = {"一郎","二郎","三郎","四郎","五郎"};
    double [] t = { 12.8, 11.9, 12.2, 11.5, 13.1 };

    Dash100 d = new Dash100( na, t );

    d.show();
    d.showAverage();
    System.out.println("  ベスト = " + d.getBestName() );
  }
}