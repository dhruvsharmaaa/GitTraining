package ThreadTraining;


public class JavaInterruptExp1 extends Thread {
    public void run() {
        try {
            System.out.println("something..");
            Thread.currentThread().interrupt();
            System.out.println("State:"+ Thread.currentThread().getState());
                Thread.sleep(1);
            while(true) {
                if(false) {
                    break;
                }
            }
//
//            try{
//
//            }catch (Exception e){
//                System.out.println("Sleep Exception cached.");
//            }
            Thread.sleep(1);

            System.out.println("something here..");
            int a = 0;
            for (int i = 0; i < 1000000; i++) {
                for (int j = 0; j < 10000; j++) {
                    a = a + 1;
                }
            }
            System.out.println("In new thread ");

        } catch (Exception e) {
//            What if this is handled here?
            throw new RuntimeException("Thread interrupted..." + e);

        }
        System.out.println("In new thread running.... ");

    }

    public static void main(String args[]) {
        JavaInterruptExp1 t1 = new JavaInterruptExp1();

        try {
            //t1.interrupt();
            t1.start();
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }
        System.out.println("here");
    }
}