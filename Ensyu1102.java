class Ensyu1102
{
  public static void main(String[] args)
  {
    String str1 = "Good ";
    String str2 = "morning";
    String str3 = "evening";

    System.out.println( add(str1,str2) );
    System.out.println( add(str1,str3) );
  }

  // s1 と s2 を連結して ret で返す
  static String add( String s1, String s2 ){
    StringBuffer sb = new StringBuffer();
    sb.append(s1);
    sb.append(s2);
    String ret=sb.toString();
    return ret;
    
  }
}