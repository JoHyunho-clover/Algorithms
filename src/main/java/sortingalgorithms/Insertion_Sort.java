package sortingalgorithms;

public class Insertion_Sort {
    public static void sort(int []a){
        for(int i=1;i<a.length;i++) {
            int target=a[i];
            int j=i-1;
            //자바의 &&연산자는 먼저 fasle가 되는 것을 좌측에 놔야 에러가 안생김.
            while(j>=0&&target<a[j]) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=target;
        }
    }

    public static void swap(int []a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
