package PeopleQueue;

public class PeopleQueue extends Thread {
    private String[] names;

    public PeopleQueue(String ... names) {
        this.names = names;
    }

    @Override
    public void run() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Обработываю докуметны :" + names[i]);
            int random = (int) (Math.random()*10);
            if (random<=5){
                System.out.println("Пью чай............");}
            else {
                System.out.println("Фууу...... у меня перекур....");
            }
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}