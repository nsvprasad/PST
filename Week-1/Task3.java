import java.util.Arrays;
import java.util.Scanner;
// Search for a given element in a sorted array using Binary Search. 
class Task3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr = {1,5,7,45,9,99};
    System.out.println("enter the required number:");
    int number = sc.nextInt();
    Arrays.sort(arr);
    int result = Arrays.binarySearch(arr,number);
    if (result>=0){
      System.out.println("Element is found at index"+result);

    }
    else{
      System.out.println("the result is not found in the given Array");
    }
    }
    
  }