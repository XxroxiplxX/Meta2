public class Solution {

    private int[][] matrix_of_distances;
    int length;

    public Solution(int[][] matrix, int length) {
        this.matrix_of_distances = matrix;
        this.length = length;
    }
    public void getZero() {
        //losowa permutacja jako rozwiazanie poczatkowe
    }
    public void printSolution() {
        for (int i = 0; i < length; i++) {
            System.out.println("Lp: " + i + " x: " + matrix_of_distances[i][0] + " y: " + matrix_of_distances[i][1]);
        }
    }
    public int[][] getMatrix_of_distances() {
        return this.matrix_of_distances;
    }
    public double getObjectiveFunction() {
        double sum = 0;
        for (int i = 0; i < this.length - 1; i++) {
            sum += distance(this.matrix_of_distances[i][0], this.matrix_of_distances[i][1],
                    this.matrix_of_distances[i + 1][0], this.matrix_of_distances[i + 1][1]);
        }
        return sum;
    }
    private double distance(int ax, int ay, int bx, int by) {
        return Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
    }
}
