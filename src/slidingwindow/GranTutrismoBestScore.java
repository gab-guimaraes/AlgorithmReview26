package slidingwindow;

public class GranTutrismoBestScore {
    public static int bestScore(int[] scores, int k) {
        int sum = 0;
        int bestScoreInK = 0;
        int left = 0;
        for (int right = 0; right < scores.length; right++) {
            sum = sum + scores[right];
            if (right - left + 1 > k) {
                sum = sum - scores[left];
                left++;
            }
            if (right - left + 1 == k) {
                bestScoreInK = Math.max(bestScoreInK, sum);
            }
        }
        return bestScoreInK;
    }

    public static void main(String[] args) {
        System.out.println(bestScore(new int[] {10,15,7,20,12,5,18}, 3));
    }
}
