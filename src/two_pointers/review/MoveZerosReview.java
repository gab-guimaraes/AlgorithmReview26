package two_pointers.review;

public class MoveZerosReview {
    public static int[] moveZeros(int[] arr) {
        //right: explore, check the all array
        //left: keep the free position
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                //swap right com left
                int aux = arr[right];
                arr[right] = arr[left];
                arr[left] = aux;
                left++;
            }
        }
        return arr;
    }
}
