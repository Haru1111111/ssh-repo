class Cal
{
  int a,b;
  void setVal(int x,int y){
      a=x;
      b=y;
}
  int plus(){
      return a+b;
  }
  int minus(){
      return  a-b;
  }

}

class Kadai0803
{
  public static void main(String[] args)
  {
    int r1,r2;
    Cal c = new Cal();

    c.setVal( 7, 3 ); // 7と3をセット
    r1 = c.plus(); // 足し算の結果をr1へ代入
    r2 = c.minus(); // 引き算の結果をr2へ代入
    System.out.println("plus = " + r1);
    System.out.println("minus = " + r2);
  }
}