package org.example;

public class MergeSort {
    static void merge(int[] a, int lb, int mid, int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int[] b=new int[ub+1];

        while(i<=mid && j<=ub){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid) {
            while (j <= ub) {
                b[k] = a[j];
                j++;
                k++;
            }
        } else {
            while(i<=mid){
                b[k]=a[i];
                i++;
                j++;
            }

        }

        for(int n=lb;n<=ub;n++){
            a[n]=b[n];
        }

    }
    static int[] mergeSort(int[] a, int lb, int ub){
        int mid=(lb+ub)/2;
        if(lb<ub){
            mergeSort(a, lb, mid);
            mergeSort(a,mid+1,ub);
            merge(a,lb,mid,ub);
        }
        return a;
    }

}
