class Yama
{
  int height;  // 高さ(m)
  boolean active; // 活火山=true 休火山=false

  public Yama(int h, boolean a){ // 高さ、火山活動有無を指定
    height=h;
    active=a;

  }

  public Yama(int h){ // 高さのみ指定（火山活動有無は休火山にする）
    this(h,false);
    

  }

  public void showData(){
    System.out.print("高さ＝"+height);
    if(active=true)System.out.println(", 活火山");
    else{
        System.out.println(", 休火山");
    }

  }
}

class Kadai1002
{
  public static void main(String[] args)
  {
    Yama fujisan = new Yama( 3776, true );
    Yama asozan = new Yama( 1592, true );
    Yama daisen = new Yama( 1709 );
    Yama tateyama = new Yama( 3015, false );

    System.out.print("富士山："); fujisan.showData();
    System.out.print("阿蘇山："); asozan.showData();
    System.out.print("大山："); daisen.showData();
    System.out.print("立山："); tateyama.showData();
  }
}