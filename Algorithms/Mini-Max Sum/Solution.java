import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long min = 0;
        long max = 0;
        long x=0;
        int cnt=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            x=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    x=arr[j]+x;
                }
            }
                if(cnt==0){
                    max = x;
                    min=x;
                    cnt=1;
                }
                if(min>=x){
                    min=x;
                }
                if(max<=x){
                    max=x;
                }
                
            
        }
        System.out.println(min +" "+max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

