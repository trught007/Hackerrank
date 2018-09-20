import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        if(n>=2){
            int i , j ,k=0;
            for (i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(i=0;i<n-1;i++){
                for(j=i+1;j<n;j++){
                    if(a[i]+a[j]==m){
                        System.out.println("True");
                        k=k+1;
System.exit(0);
                    }
                    
                }
               
                
            }
            if(k==0){
                System.out.println("False");
            }
            
        }
    }
}
