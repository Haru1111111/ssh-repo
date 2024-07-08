class iPhone
{
    int storage;
    int weight;
    double disp_size;

    void setStorage(int x)
    {
        storage=x;
    }
     void setWeight(int y)
    {
        weight=y;
    }
     void setDisp_size(double z)
    {
        disp_size=z;
    }
    void show()
    {
        System.out.println("容量は"+storage);
        System.out.println("重さは"+weight);
        System.out.println("画面の大きさは"+disp_size);

    }
    
}

class Ensyu0803
{
    public static void main(String[] args)
    {
        iPhone ipSE=new iPhone();
        iPhone ip13=new iPhone();

        System.out.println("<iPhoneSE>");
        ipSE.setStorage(256);
        ipSE.setWeight(144);
        ipSE.setDisp_size(4.7);
        ipSE.show();

        System.out.println("\n<iPhone13>");
        ip13.setStorage(512);
        ip13.setWeight(173);
        ip13.setDisp_size(6.1);
        ip13.show();
    }
}