import java.util.Random;

public class Surrounding {
    private Solution[] list_of_perms;
    int[][] matrix_of_points;
    int lenght;
    //pomysl: trzymajmy permutacje w hashmape wraz z funkcja celu jako klucz, mozemy na biezaco sortowac i miec na wierzchu najlepsze rozwiazanie
    public Surrounding(Solution solution, int lenght) {    //pytanie w jakiej strukturze chcemy trzymac rozwiazanie. mozemy pozostac przy dwuwymairowej macierzy odleglosci chociaz to skomplikuje funkcje invert
        this.matrix_of_points = solution.getMatrix_of_distances();
        this.lenght = lenght;
        Random rand = new Random();
        list_of_perms = new Solution[20];
        for (int i = 0; i < 20; i++) {

            int tmp = rand.nextInt(lenght - 4);
            list_of_perms[i] = new Solution(invert(tmp, tmp + 4), lenght);

            //invert ma odwrocic kolejnosc elementow od i do j, w macierzy 2D musimy zdefuniowac jakis porzadek na elementach
        }
        //na bazie danej permutacji generuj otoczenie typu invert
    }
    public void changeSurrounding(int[][] matrix, int lenght) {
        this.matrix_of_points = matrix;
        this.lenght = lenght;
        Random rand = new Random();
        list_of_perms = new Solution[20];
        for (int i = 0; i < 20; i++) {

            int tmp = rand.nextInt(lenght - 1);
            list_of_perms[i] = new Solution(invert(tmp, tmp + 4), lenght);

            //invert ma odwrocic kolejnosc elementow od i do j, w macierzy 2D musimy zdefuniowac jakis porzadek na elementach
        }

    }

    public int[][] invert(int i, int j) {
        int[][]matrix = matrix_of_points;
        int q = j;
        for (int p = i; p <= j/2; p++) {

            int tmp1 = matrix[p][0];
            int tmp2 = matrix[p][1];
            matrix[p][0] = matrix[q][0];
            matrix[p][1] = matrix[q][1];
            matrix[q][0] = tmp1;
            matrix[q][1] = tmp2;
            q--;

        }
        return matrix;
    }
    public void printSurrounding() {
        for (int i = 0; i < 20; i++) {
            System.out.println("kolejna permutacja:");
            list_of_perms[i].printSolution();
        }
    }

}
