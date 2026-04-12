package slidingwindow;

public class AVGMaxSubArray {

    public static double maxSub(int[] nums, int k) {
        //k = tamanho da janela
        //sum = soma para dividir em k
        //vou dividir quando a janela bater k
        int left = 0;
        int sum = 0;
        double maxAvg = 0;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            if (right - left + 1 > k) {
                sum = sum - nums[left];
                left++;
            }

            if (right - left + 1 == k) {
              maxAvg = Math.max(maxAvg, (double)sum/k);
            }
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println(maxSub(new int[] {1,12,-5,-6,50,3},4));
    }
}
