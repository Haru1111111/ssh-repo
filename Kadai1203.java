class Kadai1203{
    public static void main(String args[]){

        double angle;
        double x;
        double y;
        double kodo;
        double sum;

        for(int i=0;i<12;i++){
            angle=(Math.random()*181)-90;
            kodo=angle/180*Math.PI;
            x=Math.sin(kodo);
            y=Math.cos(kodo);
            sum=Math.pow(x,2)+Math.pow(y,2);


            System.out.printf("角度 ＝ %6.2f",angle);
            System.out.println("の時、sinの2乗 ＋ cosの2乗 ＝ "+sum);
        }
    }
}