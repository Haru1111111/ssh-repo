class Word
{
  char [] ch;  // 文字の配列
  int len;  // 文字数
  static int wnum = 0; // 作成されたインスタンスの個数　クラス変数
  static char [] heads = new char [100]; // 頭文字を集めた文字列　クラス変数

  public Word(char [] c){ // コンストラクタ
    len=c.length;
    ch=new char[len];
    for(int i=0;i<len;i++)ch[i]=c[i];
    Word.heads[wnum]=ch[0];;
    wnum+=1;
  }

  public void showWord(){ // インスタンスメソッド
    for(int i=0;i<ch.length;i++) System.out.print(ch[i]);
    System.out.println("");

  }

  public static void showHeads(){ // クラスメソッド
    System.out.print("  ------> ");
    for(int i=0;i<wnum;i++) System.out.print(heads[i]);
    System.out.println("");
  }
}

class Kadai1004
{
  public static void main(String[] args)
  {
    char [] cs1 = {'H','y','p','e','r'};
    char [] cs2 = {'T','e','x','t'};
    char [] cs3 = {'M','a','r','k','u','p'};
    char [] cs4 = {'L','a','n','g','u','a','g','e'};

    Word w1 = new Word( cs1 );
    Word w2 = new Word( cs2 );
    Word w3 = new Word( cs3 );
    Word w4 = new Word( cs4 );

    w1.showWord();
    w2.showWord();
    w3.showWord();
    w4.showWord();

    Word.showHeads();  // 頭文字を集めた文字列の表示

  }
}