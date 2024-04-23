import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = Integer.parseInt(in.nextLine());
        System.out.println("Enter Y:");
        int y = Integer.parseInt(in.nextLine());
        System.out.println("Addition: " + add(x,y));
        System.out.println("Subtraction: " + subtract(x,y));
        System.out.println("GCF: " + GCF(x,y));
        in.close();
    }

    static int add(int x, int y) {
        int total = x + y;
        return total;
    }

    static int subtract(int x, int y) {
        int total = x - y;
        return total;
    }
    
    static int GCF(int x, int y) {
        int GCF = 0; 
        for(int i = 1; i <= x && i <= y; i++) {
            if(x % i == 0 && y % i == 0) {
                GCF = i;
            }
        }
        return GCF;    
    }
    
}
