import java.util.Scanner;

public class RemoteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] array;
        System.out.println("Enter a size: ");
        size = sc.nextInt();
        while (size <= 0){
            System.out.println("Input size Array");
            size++;
        }
        array = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("Enter Element: " + (i+1) + "\t");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Show Array");
        for (i = 0 ; i < array.length ; i++){
            System.out.println(array[i] +"\t");
        }
        System.out.println("Input element that need move: ");
        int location = sc.nextInt();
        for (i = array.length -1 ; i > location ; i--){
            array[i] = array[i];
        }
        System.out.println("Value import index arr: ");
        int value = sc.nextInt();
        array[location] = value;
        for (i = 0 ; i < array.length ; i++){
            System.out.println(" " + array[i]);
        }
    }
}
