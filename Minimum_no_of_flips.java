import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Ones_on_left_again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size;
        System.out.println("Enter the size of Array");
        arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("enter Elements in array");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        int Ones_counter =0;
        for(int values : arr)
        {
            if(values == 1)
            {
                Ones_counter++;
            }
        }
        System.out.print("Total ones : ");
        System.out.println(Ones_counter);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < Ones_counter; i++) {
            list.add(1);
        }
        for (int i = Ones_counter; i <arr_size ; i++) {
            list.add(0);
        }

        int flip_counter =0;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i]!= list.get(i))
            {
                flip_counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
       // System.out.println(list);
        System.out.println();
        System.out.println("Minimum number of flip required are : " + flip_counter);


    }
}
