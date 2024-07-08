class Shinkansen // 新幹線を扱うクラス
{
    int car;
    double hour;
    void setData(int a,double b){
        car=a;
        hour=b;
    }
    void showData(){
        System.out.println("車両＝"+car+"両、所要時間＝"+hour+"（ｈ）");
    }

}

class Ensyu0904
{
  public static void main(String[] args)
  {
    Shinkansen nozomi = new Shinkansen();
    Shinkansen kodama = new Shinkansen();

    nozomi.setData( 16, 2.5 );
    kodama.setData( 8, 4.0 );

    System.out.print("のぞみ：");
    nozomi.showData();
    System.out.print("こだま：");
    kodama.showData();
  }
}