import java.util.Scanner;

public class MineralWater {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Money (RM): ");
        double money = Double.parseDouble(in.nextLine());
        System.out.println("----------------------------------------------------------------");
        double balance = money;
        int quantity = 0;
        int set = 0;
        int bottle = 0;
        double total = 0;
        if (money >= 12) {
            set = (int) ((money / 12) - (money % 12) / 12);
            balance = money % 12;
            quantity = set * 24;
            total = set * 12;
            System.out.println(set + " set (" + quantity + " bottles) x 12 -> RM" + total + "0");
        }
        if (balance >= 8) {
            set = (int) (balance / 8);
            balance = balance % 8;
            quantity += set * 10;
            total += set * 8;
        }
        if (balance >= 1) {
            bottle = (int) (balance / 1);
            balance = balance % 1;
            quantity += bottle;
            total += bottle;
        }
        System.out.println(bottle + " bottles x RM1.00 -> RM" + bottle + ".00");
        System.out.println("Total: RM" + total + "0");
        System.out.println("Balance: RM" + balance + "0");
        System.out.println("----------------------------------------------------------------\n");
        System.out.print("Quantity (bottles): ");
        quantity = Integer.parseInt(in.nextLine());
        System.out.println("----------------------------------------------------------------");
        set = quantity / 24;
        quantity = quantity % 24;
        total = set * 12;
        System.out.println(set + " set (" + (set * 24) + " bottles) -> RM" + total + "0");
        if (quantity >= 10) {
            set = (int) (quantity / 10);
            quantity = quantity % 10;
            total += set * 8;
            System.out.println(set + "0 bottles -> RM" + set * 8 + ".00");
        }
        if (quantity >= 1 && quantity < 10) {
            bottle = (int) (quantity / 1);
            quantity = quantity % 1;
            total += bottle;
        }
        System.out.println(bottle + " bottles -> RM" + bottle + ".00");
        System.out.println("Total: RM" + total + "0");
        System.out.println("----------------------------------------------------------------");
        in.close();

    }
}




