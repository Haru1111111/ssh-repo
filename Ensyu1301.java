class Origami extends Paper
{
  String col; // 色
  public void setColor(String a){
    col=a;
  }
  public void showColor(){
    System.out.println(" 色＝"+col);
  }

}

class Paper
{
  double width;  // 幅(cm)
  double height; // 高さ(cm)

  public void setSize( double w, double h ){ // サイズを設定する
    width = w;
    height = h;
  }
  public void showSize(){ // サイズを表示する
    System.out.println(" (幅,高さ) = " + width + ", " + height );
  }
}

class Ensyu1301
{
  public static void main(String[] args)
  {
   
    // 紙クラスのオブジェクト
    System.out.println("\n- 紙 ----");
    Paper pp = new Paper();
    pp.setSize( 21.0, 29.7 );
    pp.showSize();

    // おりがみクラスのオブジェクト
    System.out.println("\n- おりがみ ----");
    Origami og = new Origami();
    og.setSize( 15.0, 15.0 );
    og.showSize();
    og.setColor("赤色");
    og.showColor();
  }
}