abstract class Camera // 抽象クラス
{
  int weight; // 重さ
  String maker; // メーカー名

  // コンストラクタ　w:重さ m:メーカー名
  public Camera( int w, String m ){
    weight = w;
    maker = new String(m);
  }
  abstract void show();
  abstract void satsuei();
}
class VideoCamera extends Camera
{
  int time; // 撮影可能時間(分)

  // コンストラクタ　w:重さ m:メーカー名 t:撮影可能時間(分)


    public VideoCamera(int x,String y,int z){
        super(x,y);
        time=z;
    }
    public void show(){
        System.out.println("メーカー:"+maker+"、重さ:"+weight+"g、残り時間:"+time+"分");
        System.out.println("");
    }
    public void satsuei(){
         time-=5;
         System.out.println("５分間撮影しました");
    }


}
class Kadai1401
{
  public static void main(String[] args)
  {
    VideoCamera vc = new VideoCamera( 355, "Sony", 98 );

    vc.show();
    vc.satsuei(); // 撮影可能時間が５分減る
    vc.show();
    vc.satsuei(); // 撮影可能時間が５分減る
    vc.show();
  }
}