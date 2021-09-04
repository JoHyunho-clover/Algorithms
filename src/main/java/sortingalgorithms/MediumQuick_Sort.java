package sortingalgorithms;

public class MediumQuick_Sort {public static void sort(int []a) {
    mergesort(a,0,a.length-1);
}

    public static void mergesort(int []a, int left, int right) {

        if(left>=right)
            return;

        int pivot_index=subsort(a,left,right);
        mergesort(a,left,pivot_index);
        mergesort(a,pivot_index+1,right);


    }


    public static int subsort(int []a,int left, int right) {
        int pivot_index=(left+right)/2;
        int pivot=a[pivot_index];
        int i=left;
        int j=right;

        while(i<j) {
            while(a[i]<pivot)
                i++;
            while(a[j]>pivot&&i<j)
                j--;



            swap(a,i,j);
        }
        return i;
    }


    public static void swap(int []a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
