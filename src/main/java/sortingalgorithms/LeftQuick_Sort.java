package sortingalgorithms;

public class LeftQuick_Sort {
    public static void sort(int []a) {
        mergesort(a,0,a.length-1);
    }

    public static void mergesort(int []a, int left, int right) {

        if(left>=right)
            return;

        int pivot_index=subsort(a,left,right);
        mergesort(a,left,pivot_index-1);
        mergesort(a,pivot_index+1,right);


    }

    public static int subsort(int []a,int left, int right) {
        int pivot=a[left];
        int i=left;
        int j=right;

        while(i<j) {
            while(i<j&&a[j]>pivot) {
                j--;}
            while(i<j&&a[i]<=pivot) {
                i++;}
            //if(i<j) - 필요가 없다.
            swap(a,i,j);

        }
        swap(a,left,i);

        return i;
    }


    public static void swap(int []a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
