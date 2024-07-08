class Television // テレビのクラス
{
  private int disp_size; // 画面のサイズ(インチ)
  private int price; // 価格(円)
  public void setTelevision(int a,int b){
    disp_size=a;
    price=b;

  }
 
  public void showTelevision(){
    System.out.println("画面＝"+disp_size+",価格＝"+price);
  }
}

class Kadai0901
{
  public static void main(String[] args)
  {
    Television viera = new Television();
    Television regza = new Television();

    viera.setTelevision (55,125400);
    regza.setTelevision (60,146000);
 


    System.out.print("＜VIERA＞" );
    viera.showTelevision();
    System.out.print("＜REGZA＞ ");
    regza.showTelevision();
  }
}