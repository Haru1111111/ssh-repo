class iPhone
{
    int storage;
    int weight;
    double disp_size;

    void setSpec(int x,int y, double z)
    {
        storage=x;
        weight=y;
        disp_size=z;
    }

    void show()
    {
        System.out.println("容量は"+storage);
        System.out.println("重さは"+weight);
        System.out.println("画面の大きさは"+disp_size);

    }
    
}

class Ensyu0804
{
    public static void main(String[] args)
    {
        iPhone ipSE=new iPhone();
        iPhone ip13=new iPhone();

        System.out.println("<iPhoneSE>");
        ipSE.setSpec(256,144,4.7);
        ipSE.show();

        System.out.println("\n<iPhone13>");
        ip13.setSpec(512,173,6.1);
        ip13.show();
    }
}