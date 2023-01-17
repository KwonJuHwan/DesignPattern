package home3;
import java.util.ArrayList;

public class PrimeObservableThread implements Runnable, Subject {
    private static final int SLEEPTIME = 500;
    private ArrayList<Observer> observers = new ArrayList<>();

    private int primeNumber;
    private int numCount = 1;
    private boolean stopRunning = false;

    public int getPrimeNumber() { return primeNumber; }

    public void stopRunning() { stopRunning = true; }

    public void startRunning() {
        stopRunning = false;
        run();
    }


    private void generatePrimeNumber() {
        primeNumber = 2;
        System.out.println(primeNumber);
        while (stopRunning == false) {
            numCount += 2; // 2瑜� �젣�쇅�븳 吏앹닔�뒗 �냼�닔媛� �맆 �닔 �뾾�쓬. �뵲�씪�꽌 ���닔留� 寃��궗
            if (isPrimeNumber(numCount)) {
                primeNumber = numCount;
                System.out.println(primeNumber);
                notifyObservers();
            }
            try {
                Thread.sleep(SLEEPTIME); // 1珥� �돹
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() { generatePrimeNumber(); }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(primeNumber);
        }
    }
}
