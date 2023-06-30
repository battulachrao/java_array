package org.example;
import java.util.*;

public class QickSort {

    static int partition(int[] a, int lb, int ub){
        int start=lb,end=ub;
        int pivot=a[lb];
        while(start<end){
            while(a[start]<=pivot){
                start++;
            }
            while(a[end]>pivot){
                end--;
            }
            if(end>start){
                swap(a,start,end);
            }

        }

            swap(a,lb,end);


        return end;

    }
    static int[] QickSort(int[] a, int lb, int ub){
        if(lb<ub){
            int loc=partition(a,lb,ub);
            QickSort(a,lb,loc-1);
            QickSort(a,loc+1,ub);
        }
        return a;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
