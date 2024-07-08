class Keisan
{
    int val;

    void setVal(int v){
        val=v;
    }
    void addVal(int v){
        val+=v;
    }
    void getval(){
        
    }
}


class Ensyu0805
{
    public static void main(String[] args)
    {
        Keisan a=new Keisan();

        a.setVal(5);
        System.out.println("(1) val="+a.getval());

        a.setVal(10);
        System.out.println("(2) val="+a.getval());
    }
}