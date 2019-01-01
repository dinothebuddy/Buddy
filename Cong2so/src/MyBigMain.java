import java.util.Scanner;

public class MyBigMain implements IReceiver {

    public static void main(String[] args) {
        
        String dodai1 = "";
        String dodai2 = "";
        Scanner sc = new Scanner(System.in);
        MyBigMain main = new MyBigMain();
        MyBigNumber num = new MyBigNumber(main);

        try {
            if (args.length > 0) {
                dodai1 = args[0];
                dodai2 = args[1];
            } else {
                dodai1 = "0";
                dodai2 = "0";
            }
            System.out.println("Ta duoc ket qua : " + num.sum(dodai1, dodai2) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    public void sendStep(String step) {
        System.out.println(step);
    }

}
