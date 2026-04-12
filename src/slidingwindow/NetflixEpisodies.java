package slidingwindow;

public class NetflixEpisodies {
    public static int bestEpisodies(String scores, int k) {
        int sum = 0;
        int maxScores = 0;
        int left = 0;
        for (int right = 0; right < scores.length(); right++) {
            sum = sum + getScore(scores.charAt(right));
            if (right - left + 1 > k) {
                sum = sum - getScore(scores.charAt(left));
                left++;
            }
            if (right - left + 1 == k) {
                maxScores = Math.max(maxScores, sum);
            }
        }
        return maxScores;
    }

    public static int getScore(char c) {
        if (c == 'G') return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(bestEpisodies("GBGGGBBGG",4));
    }
}
