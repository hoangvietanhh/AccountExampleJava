import java.util.Scanner;

public class AccountExampleTest {
    public static void main(String[] args) {

        AccountExample accountExample = new AccountExample();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập account để kiểm tra: ");
            String name = scanner.nextLine();
            boolean isValidate = accountExample.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isValidate);
        }
    }
}
