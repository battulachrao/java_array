package org.example;
import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors


    public class Main {
        static int[] bubbleSort(int[] a){
            for(int i=0;i<=a.length-2;i++){
                for(int j=0;j<a.length-i-1;j++){
                    if(a[j]>a[j+1]){
                        int b=a[j];
                        a[j]=a[j+1];
                        a[j+1]=b;
                    }
                }
            }
            return a;
        }
        static int[]  insertionSort(int[] a){
            for(int i=1;i<a.length;i++){
                int flag=0;
                for(int j=i;j>0;j--){
                    if(a[j]<a[j-1]){
                        int temp=a[j-1];
                        a[j-1]=a[j];
                        a[j]=temp;
                        flag=1;
                    }
                    if(flag==0)
                        break;
                }
            }
            return a;
        }
        static int[] selectionSort(int[] a){
            for(int i=0;i<a.length-1;i++){
                int k=i;
                for(int j=i+1;j<a.length;j++){
                    if(a[k] > a[j]){
                        k=j;
                        a[k]=a[j];
                    }
                }
                int temp=0;
                if(k!=i){
                    temp=a[i];
                    a[i]=a[k];
                    a[k]=temp;
                }

            }
            return a;
        }
        static int[] shellsort(int[] a) {
            for (int gap = a.length / 2; gap >= 1;gap=gap/2) {
                for(int j=gap;j<a.length;j++){
                    for(int i=j-gap;i>=0;i=i-gap){
                        if(a[i]>a[i+gap]){
                            int tem=a[i];
                            a[i]=a[i+gap];
                            a[i+gap]=tem;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
            return a;
        }

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int[] a={56,4,105,1,6,2};
            QickSort obj=new QickSort();
            MergeSort obj1=new MergeSort();

            Radix_Bucket_sorting obj2=new Radix_Bucket_sorting();
            CountSort obj3=new CountSort();
            a=obj2.radix(a);
            int k=obj2.max(a);
            for(int i=0;i<=a.length-1;i++){

                System.out.println(a[i]);
            }
            System.out.println((int)Math.floor(9/2));
        }
    }
