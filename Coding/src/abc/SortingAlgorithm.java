// This is for Bubble sort Algorithm
package abc;

public class SortingAlgorithm {

  public static void main(String[] args) {
    /*
    // Example for Bubble Sort
    int [] arr = {554,544,687,325,40,78,900,100};
    System.out.println("Unsorted Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] +" ");
    }
    
    bubbleSort(arr); // Bubble Sorting method
    System.out.println();
    
    System.out.println("Sorted Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }*/
    
    //Example for Insertion
    System.out.println();
    int[] arr1 = {9,14,3,2,43,11,58,22};    
    System.out.println("Before Insertion Sort");    
    for(int i:arr1){    
        System.out.print(i+" ");    
    }    
    System.out.println();    
        
    insertionSort(arr1);//sorting array using insertion sort    
       
    System.out.println("After Insertion Sort");    
    for(int i:arr1){    
        System.out.print(i+" ");    
    }    
  }

  // Bubble Sort 
  public static int[] bubbleSort (int[] list) {
    int i,j, temp = 0;
    for (i=0;i < list.length -1;i++) {
      for(j=0;j < list.length - 1 -i; j++) {
        if (list[j]>list[j+1]) {
          temp= list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
    }
    return list;
  }
  
  //Insertion Sort
  public static void insertionSort(int array[]) 
  {  
    int n = array.length;  
    for (int j = 1; j < n; j++) {  
        int key = array[j];  
        int i = j-1;  
        while ( (i > -1) && ( array [i] > key ) ) {  
            array [i+1] = array [i];  
            i--;  
        }  
        array[i+1] = key;  
      }  
    }  
}
