import java.util.Scanner;

class Kadai1105
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in,"UTF-8");
        int sum=0;
        System.out.print("ひらがなを入力-->");
        String word1=sc.next();
        StringBuffer word2=new StringBuffer();
        int sum=0;
        


        while(true){
            System.out.print("ひらがなを入力-->");
            String word=new StringBuffer();
            int len=word.length();
            if(word2.charAt(0)==word.charAt(len)){
                if(word.charAt(len)!='ん'){
                    sum+=1;
                    System.out.println(word);
                    word2=word;
                }
                else{
                    break;
                }
            }
             else{
                    System.out.print("終了、"+sum+"回続きました");
                    break;
                }
            
        }
    }
}
