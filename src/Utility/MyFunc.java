package Utility;

public class MyFunc {

    public static void bekle(int sn){
        try {
            Thread.sleep(sn*3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
