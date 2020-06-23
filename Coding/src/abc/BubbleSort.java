package abc;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = {4,3,10,2,8,1,0,9};
    bubbleSort(arr);
  }

  public static void bubbleSort (int[] arr) {
    int j;
    boolean flag = true;   
    int temp;   
    
    while (flag) {
        flag = false;    
        for(j = 0;  j < arr.length - 1;  j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];                
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                flag = true; 
            } 
        } 
    } 
}
}
