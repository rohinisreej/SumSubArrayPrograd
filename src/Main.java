import java.util.Scanner;

class Sumsubarray{
    public void calculateSubarraySum(int[] array) {
        int n = array.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i] * (i + 1) * (n - i);
        }

        System.out.println(sum);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Sumsubarray ss=new Sumsubarray();
        ss.calculateSubarraySum(arr);

    }
}