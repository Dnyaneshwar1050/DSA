public class Sorting {

    public static void printSortedArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};

        //bouble sort 
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printSortedArr(arr);
    }
}



class Sorting1 {

    public static void printSortedArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};

        //selection sort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printSortedArr(arr);
    }
}


class Sorting2 {

    public static void printSortedArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};

        //insertion sort
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement 
            arr[j+1] = current;
        }
        printSortedArr(arr);
    }
}
