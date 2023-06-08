package Methods;

public class Main {
    public static int add(int i,int j){
        int k = i+j;
        return k;
    }
    public static String name(String n,String s){
        String ns = n+s;
        return ns;
    }
    public static void evenOdd(int[] arr){
        for(int i : arr){
            if(i % 2 == 0){
                System.out.println("Even : "+i);
            }else if(i % 1 == 0){
                System.out.println("Odd :"+i);
            }
            
        }
    }
    public static int rec(int i){
        if(i>0){
            return i + rec(i-1);
        }else{
            return 0;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(name("Jack","Sparrow"));
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        evenOdd(array);
        System.out.println(rec(10));

    }
}
