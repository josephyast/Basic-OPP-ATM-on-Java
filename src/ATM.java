import java.util.Scanner;

public class ATM {

    public void run(Account account){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Bank");

        System.out.println("**************************");
        System.out.println("User Login");
        System.out.println("**************************");

        int login_attempts = 3;
        while (true){
            if (login.login(account)){
                System.out.println("Login Successful");
                break;
            }else {
                System.out.println("Login Unsuccessful");
                login_attempts -=1;
                System.out.println("Remaining Login Attempts : "+ login_attempts);
            }
            if (login_attempts == 0){
                System.out.println("You are Out of Login Attemps");

                return;
            }

        }
        System.out.println("*************************");
        String processes = "1.Current Balance\n"+"2.Deposit Money\n"+"3.Withdraw Money\n"+"To Exit Please Press q";
        System.out.println(processes);
        System.out.println("*************************");

        while (true){
            System.out.print("Choose The Process : ");
            String process = scanner.nextLine();
            if (process.equals("q")){
                break;
            } else if (process.equals("1")) {
                System.out.println("Your Balance : "+ account.getBalance());
            }else if (process.equals("2")) {
                System.out.print("Requested Deposit Amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                account.moneyDeposit(amount);

            }else if (process.equals("3")) {
                System.out.print("Requested Withdraw Amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                account.moneyWithdraw(amount);
            }else {
                System.out.println("Non-funktional process");
            }
        }
    }
}
