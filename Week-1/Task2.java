import java.util.Scanner;
class Task2{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int[] a= {1,2,3,4};
      System.out.println("Enter the index to access number:");
      int index =sc.nextInt();
      if (index>=0 && index<a.length){
        System.out.println("Enter the index "+index +" is "+a[index]);

      }
      else{
        System.out.println("select index value in the input given range upto"+(a.length-1));
      }
      
      System.out.println(a[3]);
  }
}