class Numbers // 数値を扱うクラス
{
    private int [] val;
    private int num;

    public Numbers(){
        num=10;
        val=new int [num];
        for(int i=0;i<num;i++){
            int r=(int)(Math.random()*10);
            val[i]=r;
        }
    }
    public void showData(){
        for(int i=0;i<num;i++){
            System.out.print(" "+val[i]);
        }
        System.out.println("");
    }
    public void showData(int a){
        for(int i=0;i<a;i++){
            System.out.print(" "+val[i]);
        }
        System.out.println("");
    }
    public void showData(int a,int b){
        for(int i=a-1;i<b;i++){
            System.out.print(" "+val[i]);
        }
        System.out.println("");
    }
}

class Kadai0902
{
  public static void main(String[] args)
  {
    Numbers nm=new Numbers();

    System.out.print("＜初期データ＞\n ");
    nm.showData();
    System.out.print("＜6個目まで表示＞\n ");
    nm.showData(6);
    System.out.print("＜インデックス2から7まで表示＞\n ");
    nm.showData(2,7);
  }
}