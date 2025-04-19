import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What problem?: ");
    int num = sc.nextInt();
    sc.nextLine();

    switch(num){
      case 1:
        String input = "";
        ArrayList<String> arr1 = new ArrayList<>();

        System.out.println("Please enter words, enter STOP to stop the loop.");
        while (!input.equals("STOP"))
        {
          input = sc.nextLine();
          arr1.add(input);
        }
        arr1.remove(arr1.size()-1); // removes the word STOP

        System.out.print("[");
        for (String n : arr1){
          System.out.print(n);
          if (n != arr1.get(arr1.size()-1)){  // checking if n is the last word
            System.out.print(", ");
          }
        }
        System.out.println("]");

        int i = arr1.size()-1;
        for (String n : arr1){
          System.out.println(arr1.get(i)+n);
          i--;
        }
        break;
      case 2:
        Integer x = 0;
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("How many Integers are in your ArrayList?: ");
        int j = sc.nextInt();
        System.out.println("Enter array of Integers: ");
        while (j > 0)
        {
          x = sc.nextInt();
          arr2.add(x);
          j--;
        }
        System.out.println(highestNum(arr2));
        break;
      case 3:
        Integer y = 0;
        ArrayList<Integer> arr3 = new ArrayList<>();
        System.out.println("How many Integers are in your ArrayList?: ");
        int q = sc.nextInt();
        System.out.println("Enter array of Integers: ");
        while (q > 0)
        {
          y = sc.nextInt();
          arr3.add(y);
          q--;
        }
        for (Integer n : getEvens(arr3)){
          System.out.print(n + " ");
        }
        break;
      default:
        System.out.println("error");
        break;
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    Integer largest = arr.get(0);
    for (Integer n : arr){
      if (n > largest){
        largest = n;
      }
    }
    return largest;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> newList = new ArrayList<>();
    for (Integer n : arr){
      if (n % 2 == 0){
        newList.add(n);
      }
    }
    return newList;
  }
}
