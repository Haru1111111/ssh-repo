class Numbers // 数値を扱うクラス
{
  private int [] val; // 配列変数
  private int num; // 要素の個数

  // 10個の要素を確保、1,2,3・・・を代入する(このメソッドを削除する)
  public Numbers(){
    num = 10;
    val = new int [num]; // 要素数numの領域を確保
    for(int i=0;i<num;i++) val[i] = i+1; // 値を代入
  }
  public void showData(){ // データを表示する
    for(int i=0;i<num;i++){
      System.out.print(" " + val[i]);
    }
    System.out.println("");
  }
}

class Ensyu0905
{
  public static void main(String[] args)
  {
    Numbers nm = new Numbers();

    nm.showData();
  }
}