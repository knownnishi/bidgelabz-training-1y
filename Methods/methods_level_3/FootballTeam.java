import java.util.*;

public class FootballTeam {

    // Generate random heights between 150-250 cms
    static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }
        return heights;
    }

    static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest : " + findShortest(heights) + " cm");
        System.out.println("Tallest  : " + findTallest(heights) + " cm");
        System.out.printf("Mean     : %.2f cm%n", findMean(heights));
    }
}