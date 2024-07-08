class Student
{
  String name; // 名前
  int no; // 学籍番号

  void setData(String x,int y){
    name=x;
    no=y;
  }
  void show(){
    System.out.println("名前；"+name+"、学生番号；"+no);
  }

}

class Ensyu1101
{
  public static void main(String[] args)
  {
    Student st1 = new Student();
    Student st2 = new Student();

    st1.setData("鈴木", 5401232);
    st2.setData("佐藤", 3602081);

    st1.show();
    st2.show();
  }
}