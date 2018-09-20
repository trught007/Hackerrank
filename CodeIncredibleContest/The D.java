import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k;
        int n = sc.nextInt();
        if(n%2==0){
            
        }
        else{
            if(n>=1){
                int cnt=1;
                for(i=0;i<n;i++){
                    if(i>=(n+1)/2)
                    { 
                      for(j=0;j<cnt;j++){
                        System.out.print("*");
                         
                    }
                    for(k=(2*(n-i))-1;k>0;k--){
                        System.out.print("D");
                    }
                    for(j=0;j<cnt;j++){
                        System.out.print("*");
                         
                    }
                      cnt++;
                    }
                    else{
                        for(j=0;j<((n-1)/2)-i;j++){
                        System.out.print("*");
                    }
                    for(k=0;k<(2*i)+1;k++){
                        System.out.print("D");
                    }
                    for(j=0;j<((n-1)/2)-i;j++){
                        System.out.print("*");
                    }
                    }

                    System.out.println();
                    
                    
                 }
            }
            
        }
        
    }
}
