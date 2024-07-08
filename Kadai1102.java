class Kadai1102
{
  public static void main(String[] args)
  {
    String str = "(^-^) ";

    System.out.println(repeatStr(str,3));//strを3個連結して表示
    System.out.println(repeatStr(str,7));//strを7個連結して表示
  }

  static String repeatStr(String x,int y ){
    StringBuffer sb = new StringBuffer();
    for(int i=0;i<y;i++){
        sb.append(x);
    }
    String ret=sb.toString();
    return ret;

  }
}