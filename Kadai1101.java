class Shinkansen // 新幹線を扱うクラス
{
  private int ryou_num; // 車両数(8両 or 16両)
  private double time; // 東京～新大阪 所要時間(h)
  private String name; // 車名（追加）

  public void setData( String a, int x, double y ){
    ryou_num = x;
    time = y;
    name=a; // 追加
  }
  public void showData(){ // データを表示する
    System.out.print(name+"："); // 追加
    System.out.println(" 車両="+ryou_num+"両、所要時間="+time+"(h)");
  }
}

class Kadai1101
{
  public static void main(String[] args)
  {
    Shinkansen nozomi = new Shinkansen();
    Shinkansen kodama = new Shinkansen();

    nozomi.setData( "のぞみ", 16, 2.5 );
    kodama.setData( "こだま", 8, 4.0 );

    nozomi.showData();
    kodama.showData();
  }
}