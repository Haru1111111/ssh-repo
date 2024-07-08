class iPhone
{
    int storage;
    int weight;
    double disp_size;
}

class Ensyu0801
{
    public static void main(String[] args)
    {
        iPhone ipSE=new iPhone();
        iPhone ip13=new iPhone();

        System.out.println("<iPhoneSE>");
        ipSE.storage=256;
        ipSE.weight=144;
        ipSE.disp_size=4.7;
        System.out.println("容量は"+ipSE.storage);
        System.out.println("重さは"+ipSE.weight);
        System.out.println("画面の大きさは"+ipSE.disp_size);

        System.out.println("\n<iPhone13>");
        ip13.storage=512;
        ip13.weight=173;
        ip13.disp_size=6.1;
        System.out.println("容量は"+ip13.storage);
        System.out.println("重さは"+ip13.weight);
        System.out.println("画面の大きさは"+ip13.disp_size);
    }
}