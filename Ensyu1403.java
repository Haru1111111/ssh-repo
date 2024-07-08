class Ensyu1403
{
  public static void main(String[] args)
  {
    int [] cnt = new int [30];
    int num = 1000;
    int i;

    for(i=0;i<30;i++) cnt[i] = 0;
    for(i=0;i<num;i++){
      int x = (int)(Math.random()*31.0); // 0～30の乱数を発生
      try{
        cnt[x]++;
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.print("*");
      }
    }
    // 結果表示
    System.out.println("");
    for(i=0;i<30;i++){
      System.out.print(i + "-" + cnt[i] + " " );
    }
    System.out.println("");
  }
}