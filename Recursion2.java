public class Recursion2 {

    public static void printRevr(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        printRevr(str, idx-1);

    }

    public static void main(String args[]){
        String str = "aman";
        printRevr(str, str.length()-1);

    }
}
