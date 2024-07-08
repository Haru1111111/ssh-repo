class Fruits
{
  int price; // １個の価格
  int num; // 個数

  public Fruits(){// デフォルトコンストラクタ
    price=110;
    num=1;
  }

  // 引数ありのコンストラクタ
  public Fruits(int p, int n){
    price=p;
    num=n;
  }
  // 合計金額を返す
  int getTotal(){
    return price*num;
  }
}

class Kadai1001
{
  public static void main(String [] args)
  {
    Fruits orange = new Fruits();
    Fruits apple = new Fruits(157,3);

    System.out.println(" Orange = " + orange.getTotal() + " yen");
    System.out.println(" Apple = " + apple.getTotal() + " yen");
  }
}