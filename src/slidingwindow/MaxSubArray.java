package slidingwindow;

/* Dado um array, encontre a soma máxima de um subarray de tamanho k */
public class MaxSubArray {
    public int maxSubArray(int[] nums, int k) {
        // k e o tamanho da minha janela
        int left = 0;
        int sum = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {

            //1. adiciona elemento da direita
            sum = sum + nums[right];

            //2. se passou, remove da esquerda
            if (right - left + 1 > k) {
                sum = sum - nums[left];
                left++;
            }

            //3. se tem tamanho k, procesa
            if (right - left + 1 == k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
