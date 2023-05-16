public class overloading{

        void m1(int x, int y){
            int z=x+y;
            System.out.println(z);
}
        void m11(int a, int b,int c){
            int h=a+b+c;
            System.out.println(h);
        }

    public static void main(String[]args){
        overloading jd=new overloading();
             jd.m1(10,20);
             jd.m11(10,20,40);
    }
}
