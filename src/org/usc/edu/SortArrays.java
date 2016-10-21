package org.usc.edu;

public class SortArrays {
    public static void merge(int A[], int m, int B[], int n) {
 
        while(m > 0 && n > 0){
            if(A[m-1] > B[n-1]){
                A[m+n-1] = A[m-1];
                m--;
            }else{
                A[m+n-1] = B[n-1];
                n--;
            }
        }
 
        while(n > 0){
            A[m+n-1] = B[n-1];
            n--;
        }
        
        for(int i=0;i<m+n;i++){
        	System.out.println(A[i]);
        }
    }
    
}
