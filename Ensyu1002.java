class DNumbers
{
  double [] val; // データ
  int num; // 要素数

  public DNumbers(double v){ // vを10個代入する（演習２）
    num=10;
    val=new double[num];
    for(int i=0;i<num;i++)val[i]=v;
  }

  public DNumbers(){ // 99.9を10個代入する
    num = 10;
    val = new double [num];
    for(int i=0;i<num;i++) val[i] = 99.9;
  }

  public void showData(){
    for(int i=0;i<num;i++){
      System.out.printf("%5.1f",val[i]);
    }
    System.out.println();
  }
}

class Ensyu1002
{
  public static void main(String[] args)
  {
    DNumbers d1 = new DNumbers();
    DNumbers d2 = new DNumbers(35.6);

    d1.showData();
    d2.showData();
  }
}