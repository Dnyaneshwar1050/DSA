public class Recursion2 {

    public static void printRevr(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRevr(str, idx-1);

    }

    public static void main(String args[]){
        String str = "abcd";
        printRevr(str, str.length()-1);

    }
}


// find first and last occurance of an element in string 
class Recursion213 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }

    public static void main(String arg[]){
        String str = "abaacdaefaah";

        findOccurance(str, 0, 'a');

    }
}
