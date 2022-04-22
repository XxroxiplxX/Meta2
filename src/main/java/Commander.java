public class Commander {
    Tabu tabu;
    //tutaj uruchamiamy watki
    //mozemy na kilku watkach odpalic ten sam algorytm startujacy od roznych losowych rozwiazan
    //niech kazdy watek konczy pracy albo przy osiagnieciu stagnacji (np po 10k probach nie odnalazl lepszego rozwiazania) albo po przekroczeniu sztucznie narzuconej liczby iteracji
    public Commander() {
        this.tabu = new Tabu();
    }
}
