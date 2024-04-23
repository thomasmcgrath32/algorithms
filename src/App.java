import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        add();
        subtract();

    }

    static void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = Integer.parseInt(in.nextLine());
        System.out.println("Enter Y:");
        int y = Integer.parseInt(in.nextLine());

        int total = x + y;
        System.out.println(total);
    }

    static void subtract() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = Integer.parseInt(in.nextLine());
        System.out.println("Enter Y:");
        int y = Integer.parseInt(in.nextLine());

        int total = x - y;
        System.out.println(total);
    }
    
    static void GCF() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = Integer.parseInt(in.nextLine());
        System.out.println("Enter Y:");
        int y = Integer.parseInt(in.nextLine());

        
    }
}
