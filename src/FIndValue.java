import java.util.Scanner;

public class FIndValue {
    public static int Fac(int n) {
        if(n<3){ return 1;}
        return (Fac(n - 2) + Fac(n - 1));
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int value = Fac(n);
        System.out.println("Gia tri: "+ value);
    }
}
