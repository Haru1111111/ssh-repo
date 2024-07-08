class DNumbers
{
  double [] val; // データ
  int num; // 要素数

  public DNumbers(double v, int n){ // vをn個代入する（演習３）
    num=n;
    val=new double[num];
    for(int i=0;i<num;i++)val[i]=v;
  }

  public DNumbers(double v){ // vを10個代入する（演習２）
    this(35.6,10);
  }

  public DNumbers(){ // 99.9を10個代入する
    this(99.9,10);
  }

  public void showData(){
    for(int i=0;i<num;i++){
      System.out.printf("%5.1f",val[i]);
    }
    System.out.println();
  }
}

class Ensyu1004
{
  public static void main(String[] args)
  {
    DNumbers d1 = new DNumbers();
    DNumbers d2 = new DNumbers(35.6);
    DNumbers d3 = new DNumbers(72.1, 6);

    d1.showData();
    d2.showData();
    d3.showData();
  }
}