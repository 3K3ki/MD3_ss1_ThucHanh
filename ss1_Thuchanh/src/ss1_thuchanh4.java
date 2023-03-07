import java.util.Scanner;

public class ss1_thuchanh4 {
    public static void main(String[] args) {
        System.out.println("Giai pt bac 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();
        if(a!=0){
            double x = (c-b)/a;
            System.out.println("x"+x);
        }else {
            if (b==c){
                System.out.println("al x");
            } else {
                System.out.println("no solution");
            }
        }
    }
}
