class NotePC
{
  int mem; // メモリー(GB)
  int hdd; // ストレージ(GB)
  double disp; // 画面の大きさ(inch)

  // mem,hdd,dispに値を設定する
  void setSpec( int m, int h, double d ){
      mem=m;
      hdd=h;
      disp=d;

  }

  // 内容を表示する
  void show(){
     System.out.println("メモリ："+mem+"GB,  "+"HDD："+hdd+"GB,  "+"画面の大きさ："+disp+"インチ,  ");

  }
}

class Kadai0802
{
  public static void main(String[] args)
  {
    NotePC lavie = new NotePC();
    NotePC dynabook = new NotePC();
    NotePC vaio = new NotePC();

    lavie.setSpec(  8,  256, 12.5 );
    dynabook.setSpec( 16,  512, 13.3 );
    vaio.setSpec( 32, 1024, 14.0 );

    System.out.println("<LAVIE>");
    lavie.show();
    System.out.println("<dynabook>");
    dynabook.show();
    System.out.println("<VAIO>");
    vaio.show();
  }
}