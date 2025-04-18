import java.util.Scanner;

public class Login {
    public boolean login(Account account){

        Scanner scanner = new Scanner(System.in);

        String username_id;
        String password;

        System.out.print("Please Login Your Username : ");
        username_id = scanner.nextLine();
        System.out.print("Please Login Your Password : ");
        password = scanner.nextLine();

        if (account.getUsername_id().equals(username_id) && account.getPassword().equals(password)){

            return true;
        }else {
            return false;
        }
    }
}
