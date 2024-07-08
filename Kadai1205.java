class Ensyu1206
{
  public static void main(String[] args)
  {
    Point [] pt = new Point[5];

    pt[0] = new Point("名古屋", 688.7, 161.3 );
    pt[1] = new Point("大阪", 534.0, 103.5 );
    pt[2] = new Point("岡山", 356.1, 100.1 );
    pt[3] = new Point("広島", 193.6, 70.1 );
    pt[4] = new Point("北九州", 18.9, 14.5 );

    for(int i=0;i<5;i++){
        double sum=0;
        show( pt[i] );
        System.out.print(pt[i].name+"~"+pt[i+1].name);
        sum+=pt.[i].x-pt.[i+1].x;
        sum+=pt.[i].y-pt.[i+1].y;
        System.out.println("="+sum+"km");
  }
  // 内容を表示
  public static void show( Point p ){
    System.out.println( p.name + " [" + p.x + ", " + p.y + "]" );
  }
}

class Point
{
  String name; // 都市名
  double x, y; // 座標(位置)

  public Point( String s, double dx, double dy ){ // コンストラクタ
    name = new String( s );
    x = dx;
    y = dy;
  }
}