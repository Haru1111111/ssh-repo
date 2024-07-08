import java.util.Scanner;

class Kadai1204
{
  public static void main(String[] args)
  {
    Ranking [] rk = new Ranking[5];
    Scanner sc = new Scanner(System.in);

    //（１）５人分のデータをキーボードから入力
    for(int i=0;i<rk.length;i++){
      System.out.print("名前,スコアを入力--> ");
      String s = sc.next(); // 名前を入力
      int n = sc.nextInt(); // スコアを入力
      rk[i] = new Ranking( s, n );
    }

    //（２）スコアの大きい順に並び替え
        for(int i=0;i<rk.length;i++){
            for(int j=i+1;j<rk.length;j++){
                if(rk[i].sc<rk[j].sc){
                    String kpname;
                    int kpscore;
                    kpname=rk[i].name;
                    kpscore=rk[i].sc;
                    rk[i].name= rk[j].name;
                    rk[i].sc=rk[j].sc;
                    rk[j].name=kpname;
                    rk[j].sc=kpscore; 
                }
            }
        }
        


    //（３）名前とスコアを表示
    for(int i=0;i<rk.length;i++){
        System.out.print(i+1+".　");
        rk[i].show();
    }
  }
}

class Ranking
{
  String name; // 名前
  int sc; // スコア

  public Ranking( String s, int score ){ // コンストラクタ
        name=s;
        sc=score;
  }
  public void show(){ // 表示
    System.out.println(" " + name + " : " + sc);
  }
}