import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hinh chu nhat");
        System.out.println("2. Hinh tam giac vuong");
        System.out.println("3. Hinh tam giac can");
        System.out.println("0. Exit");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Nhập chiều dài của hình chữ nhật: ");
                int height = scanner.nextInt();

                System.out.println("Nhập chiều rộng của hình chữ nhật: ");
                int width = scanner.nextInt();

                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Nhập chiều cao của tam giác vuông: ");
                int height1 = scanner.nextInt();

                for (int i = 1; i <= height1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Nhập chiều cao tam giác: ");
                int chieuCao = scanner.nextInt();

                for (int i = 0; i < chieuCao; i++) {
                    for (int j = 0; j < chieuCao - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
