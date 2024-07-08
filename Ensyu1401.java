abstract class Camera // 抽象クラス
{
  int weight; // 重さ
  String maker; // メーカー名

  // コンストラクタ　w:重さ m:メーカー名
  public Camera( int w, String m ){
    weight = w;
    maker = new String(m);
  }
  abstract void show(); // 内容の表示
  abstract void satsuei(); // 撮影処理
}

class IchganRef extends Camera
{
  int num; // 撮影可能枚数

  // コンストラクタ　w:重さ m:メーカー名 n:撮影可能枚数
  public IchganRef( int w, String m, int n ){
    super( w, m );
    num = n;
  }
  
    public void show(){
        System.out.println("メーカー："+maker+"、重さ："+weight+"ｇ"+"残り枚数："+num+"枚");
    }
    public void satsuei(){
        num-=1;
        System.out.println("1枚撮影しました");
    }

}
class Ensyu1401
{
  public static void main(String[] args)
  {
    IchganRef ir = new IchganRef( 724, "Canon", 1630 );

    ir.satsuei(); // 撮影処理、撮影可能枚数を１枚減らす
    ir.show();
  }
}