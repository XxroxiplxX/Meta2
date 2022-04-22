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
                {78,123}
        };
        solution = new Solution(matrix, 4);
        surrounding = new Surrounding(solution, 4);

    }


    @Override
    public synchronized void run() {
        int c = 500;
        while (c > 0) {


            System.out.println("dziala");
            c--;
        }
        thread.stop();
    }
}
