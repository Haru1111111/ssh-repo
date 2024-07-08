import java.util.Scanner;

class Kadai1404
{
  public static void main(String[] args)
  {
    double bmi;
    double height,weight;

    Scanner sc = new Scanner(System.in);
    while(true){
        try{
          System.out.print("身長を入力(cm,実数)-->");
          height = sc.nextDouble();
        }catch(Exception e){
            System.out.println("【エラー】数値でありません");
            String s=sc.next();
            continue;
        }
        break;
    }
    while(true){
        try{
          System.out.print("体重を入力(kg,実数)-->");
          weight = sc.nextDouble();
        }catch(Exception n){
            System.out.println("【エラー】数値でありません");
            String s=sc.next();
            continue;
        }
        break;
    }
    // 結果表示
    height *= 0.01; // 単位をmにする
    bmi = weight/(height*height);
    System.out.println(" BMI = " + bmi);
  }
}