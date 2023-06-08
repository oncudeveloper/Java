package Strings;

public class Stringbuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb);
        System.out.println(sb.reverse());
        
        if(sb.equals(sb.reverse())){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not a Palindrome!");
        }

        //StringBuilder --> Not thread safe faster than StringBuffer
        //StringBuffer --> Thread safe
    }
}
