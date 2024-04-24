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
        givenSum();
        looper();
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
    /** Find a pair with the given sum in an array
     * nums = [8, 7, 2, 5, 3, 1] target = 10
     */
    public static void givenSum() {
        int [] nums  = {8,7,2,5,3,1};
        int target = 10;
         
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length - 1; j++) {
                if(i != j && !(i > j)) {
                    if (nums[i] + nums[j] == target) {
                        System.out.println(nums[i] + ","+ nums[j]);
                    }
                }
            }
        }
    }    

    public static void looper() {
        boolean check = true;
        int count = 0;
        while (check) {
            count += 1;

            if(count == 69 || count == 420) {
                System.out.println("69420");
            } else if (count == 500) {
                check = false;
                System.out.println("Thats 500");
            }
        }
    }
}
