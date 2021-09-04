import sortingalgorithms.*;

public class Main {

    public static void main(String []Args){
        int []arr= new int[]{10,4,30,20,9,6,22,1,88,48,23,45};
        //Selection_Sort.selection_sort(arr);

        //Bubble_Sort.bubble_sort(arr);

        //Insertion_Sort.sort(arr);

        //LeftQuick_Sort.sort(arr);

        //MediumQuick_Sort.sort(arr);

        Merge_Sort.sort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println();
    }
}
