package sortingalgorithms;

public class Selection_Sort {
    public static void selection_sort(int[] a) {
        selection_sort(a, a.length);
    }
	/*
	public void sort(int []a, int size) {
		for(int i : a) {
			int minvalue_index=i;

			for(int j=i+1; j<size;j++) {
				if(a[i]>a[j]) {
					minvalue_index=j;
				}
			}
			swap(a,i,minvalue_index);
		}
	}

	public void swap(int []a, int origin_index,int minvalue_index) {
		int temp=a[origin_index];
		a[origin_index]=a[minvalue_index];
		a[minvalue_index]=temp;
	}
	*/

    private static void selection_sort(int[] a, int size) {

        for(int i = 0; i < size - 1; i++) {
            int min_index = i;

            // 최솟값을 갖고있는 인덱스 찾기
            for(int j = i + 1; j < size; j++) {
                if(a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            // i번째 값과 찾은 최솟값을 서로 교환
            swap(a, min_index, i);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
