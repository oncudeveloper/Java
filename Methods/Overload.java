package Methods;

public class Overload {
    //method signature
    public static int sum(int i,int j){
        return i+j;
    }
    public static double sum(double i,double j){
        return i+j;
    }
    public static String sum(String i,String j){
        return i+j;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.2,1.3));
        System.out.println(sum("Hello ","World"));
    }
}
