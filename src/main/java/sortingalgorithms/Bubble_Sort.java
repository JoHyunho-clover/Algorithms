package sortingalgorithms;

public class Bubble_Sort {
    public static void bubble_sort(int []a) {
        for(int i=1; i<a.length;i++) {
            for(int j=0;j<a.length-i;j++) {
                if(a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                }
            }
        }
    }

    public static void swap(int []a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
