package org.example;
import java.util.*;

public class CountSort {
    static int[] countSort(int[] a){
        int n=a.length;
        int k=max(a);
        int[] count= new int[k+1];
        for(int i=0;i<n;i++)
        {
            count[a[i]]++;
        }
        for(int i=1;i<=k;i++){
            count[i]=count[i]+count[i-1];
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[--count[a[i]]]=a[i];
        }

            return b;

    }
    static int max(int[] a){
        int temp=a[0];
        for (int i=1;i<a.length;i++){
            if(temp<a[i]) {
                temp = a[i];
            }
        }
        return temp;
    }
}
