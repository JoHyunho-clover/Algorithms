package sortingalgorithms;

public class Merge_Sort {
    private static int[] sorted;

    public static void sort(int []a) {
        sorted=new int[a.length];
        divideandconquer(a,0,a.length-1);
        sorted=null;
    }

    private static void divideandconquer(int []a, int left,int right) {
        int mid;
        if(left<right) {
            mid=(left+right)/2;

            divideandconquer(a,left,mid);
            divideandconquer(a,mid+1,right);

            merge(a,left,mid,right);
        }
    }

    private static void merge(int []a, int left,int mid,int right) {
        int l=left;
        int r=mid+1;
        int idx=left; //새로운배열에 넣기 위함

        while(l<=mid && r<=right) {
            if(a[l]<=a[r]) {
                sorted[idx]=a[l++];
            }else {
                sorted[idx]=a[r++];
            }
            idx++;
        }

        if(l>mid) {
            while(r<=right) {
                sorted[idx++]=a[r++];
            }
        }else {
            while(l<=mid) {
                sorted[idx++]=a[l++];
            }
        }

        for(int i=left; i<=right; i++) {
            a[i]=sorted[i];
        }


    }
}
