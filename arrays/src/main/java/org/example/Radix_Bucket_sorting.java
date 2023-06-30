package org.example;

public class Radix_Bucket_sorting {
    static int max(int[] a){
        int temp=a[0];
        for (int i=1;i<a.length;i++){
            if(temp<a[i]) {
                temp = a[i];
            }
        }
        return temp;
    }
    static int length(int k){
        int i=0;
        while(k!=0){
            i++;
            k=k/10;
        }
        return i;
    }
    static int[] radix(int[] a){
        int k=max(a);
        int l=length(k);
        int base= 10;
        int m=1;
        int n=a.length;
        int[] b = new int[n];
        for(int p=0;p<l;p++) {
            int[] count = new int[10];

            for (int i = 0; i < a.length; i++) {
                count[(a[i]/m) % base]++;
            }
            for (int i = 1; i <=  9; i++) {
                count[i] = count[i] + count[i - 1];
            }

            for (int i = n-1; i >= 0; i--) {
                b[--count[(a[i]/m)%base]] = a[i];
            }
            for(int i=0;i<n;i++){
                a[i]=b[i];
            }
            m=m*10;
        }
        return a;
    }
}
