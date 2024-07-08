class Wizard extends Brave
{
  private int mp; // マジックポイント

  public Wizard( String n, int h, int m ){ // コンストラクタ
    super(n,h);
    mp=m;
    
  }

/*（※２）*/
}
class Brave
{
  protected String name;
  private int hp;

  public Brave( String n, int h ){
    name = new String(n);
    hp = h;
  }
  public void attack(){ // 攻撃の表示
    int dmg = (int)(Math.random()*100);
    System.out.print(" 勇者" + name + "の攻撃 " + dmg + " のダメージ！");
    System.out.println(" (残りhp=" + (hp-dmg) + ")");
  }
}
class Ensyu1305
{
  public static void main(String[] args)
  {
    Brave [] ch = new Brave[5];

    ch[0] = new Brave( "ichiro", 157 );
    ch[1] = new Wizard( "jiro", 298, 120 );
    ch[2] = new Wizard( "saburo", 107, 100 );
    ch[3] = new Brave( "shiro", 353 );
    ch[4] = new Wizard( "goro", 216, 110 );

    for(int i=0;i<ch.length;i++) ch[i].attack();
  }
}