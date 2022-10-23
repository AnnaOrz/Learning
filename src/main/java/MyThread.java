
class MyThread implements Runnable{
    private String name;
    MyThread(String name){
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("\n" + name + " rozpoczyna działanie");
        try{
            for(int i=0; i<=10; i++) {
                Thread.sleep(1000);
                System.out.println("\n" + name + " " + i);
            }
        } catch(InterruptedException ex) {
            System.out.println("\n" + name + " został przerwany" );
        }
        System.out.println("\n" + name + " zakończył działanie" );
    }
}
