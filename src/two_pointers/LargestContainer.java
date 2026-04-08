package two_pointers;

public class LargestContainer {
    /*
    Time complexity: O(N)
    Space complexity: O(1)
     */
    public static int maxWater(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maiorAltura = -1;
        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = (right - left);
            int area = height * width;
            if (area > maiorAltura) {
                maiorAltura = area;
            }
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maiorAltura;
    }

    public static void main(String[] args) {
        System.out.println(maxWater(new int[] {3,3,3, 3}));
    }
}
