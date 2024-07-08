class Room
{
  int adult;  // 大人の人数
  int child;  // 子供の人数
  static int all = 0; // 合計人数
  
  public Room(int a,int b){
    adult=a;
    child=b;
    Room.all+=a;
    Room.all+=b;
  }
  public Room(int b){
    this(2,b);
  }
  public Room(){
    this(2,2);
  }
  void showOneRoom(){
    System.out.println("大人　"+adult+"人、　子ども　"+child+"人");
  }
  static public void showTotal(){
    System.out.print("　全ての合計人数＝"+Room.all);
  }


}

class Kadai1003
{
  public static void main(String[] args)
  {
    Room r1 = new Room(); // 部屋１(デフォルト)
    Room r2 = new Room( 4 ); // 部屋２(大人2,子供4)
    Room r3 = new Room( 4, 2 ); // 部屋３(大人4,子供2)
    Room r4 = new Room( 1, 3 ); // 部屋４(大人1,子供3)
    Room r5 = new Room( 2, 1 ); // 部屋４(大人2,子供1)

    System.out.print("部屋１："); r1.showOneRoom();
    System.out.print("部屋２："); r2.showOneRoom();
    System.out.print("部屋３："); r3.showOneRoom();
    System.out.print("部屋４："); r4.showOneRoom();
    System.out.print("部屋５："); r5.showOneRoom();

    Room.showTotal(); // ５部屋の合計人数を表示
  }
}