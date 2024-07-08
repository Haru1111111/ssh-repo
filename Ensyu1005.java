class DNumbers2
{
  double [] val; // データ
  int num; // 要素数

  // 配列を引数で受け取るコンストラクタ
  public DNumbers2(double [] v){
    num=v.length;   // 配列vの要素数を代入
    val = new double[num];  // 要素領域の確保
    for(int i=0;i<num;i++) val[i] = v[i];
  }

  public void showData(){
    for(int i=0;i<num;i++){
      System.out.printf("%5.1f",val[i]);
    }
    System.out.println();
  }
}

class Ensyu1005
{
  public static void main(String[] args)
  {
    double [] data = {10.0, 20.8, 30.3, 40.5};
    DNumbers2 d = new DNumbers2(data);

    d.showData();
  }
}