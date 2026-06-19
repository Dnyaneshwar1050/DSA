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
