public class Surrounding {
    private Solution[] list_of_perms;
    //pomysl: trzymajmy permutacje w hashmape wraz z funkcja celu jako klucz, mozemy na biezaco sortowac i miec na wierzchu najlepsze rozwiazanie
    public Surrounding(int[][] matrix) {    //pytanie w jakiej strukturze chcemy trzymac rozwiazanie. mozemy pozostac przy dwuwymairowej macierzy odleglosci chociaz to skomplikuje funkcje invert
        this.invert(matrix, 1, 2);  //invert ma odwrocic kolejnosc elementow od i do j, w macierzy 2D musimy zdefuniowac jakis porzadek na elementach
        //na bazie danej permutacji generuj otoczenie typu invert
    }

    public void invert(int[][] matrix, int i, int j) {

    }

}
