public class UseThread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Wątek główny zaczyna działanie");
        MyThread myLittleThread = new MyThread("wątek potomny");
        Thread Thrd = new Thread(myLittleThread);
        Thrd.start();

        for(int i = 0; i<=50; i++){
            System.out.print("A");
            try{
                Thread.sleep(100);
            } catch (InterruptedException exception){
                System.out.println("Wątek główny przerwany");
            }
        }
        System.out.println("\n" + "Wątek główny skończył zadanie");
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }
}
