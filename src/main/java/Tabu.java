import java.util.ArrayList;

public class Tabu extends Algorythm{
    private ArrayList<Surrounding> tabulist;    //zorbimy hashmape
    Thread thread;
    Surrounding surrounding;
    Solution solution;
    public Tabu() {
        this.thread = new Thread(this);
        thread.start();
        int matrix[][] = {
                {1,5},
                {3,456},
                {2,345},
                {78,123},
                {324,786},
                {142,3456},
                {75,90}
        };
        solution = new Solution(matrix, 6);
        solution.printSolution();
        surrounding = new Surrounding(solution, 6);
        surrounding.printSurrounding();

    }


    @Override
    public synchronized void run() {
        int c = 500;
        while (c > 0) {


            //System.out.println("dziala");
            c--;
        }
        thread.stop();
    }
}
