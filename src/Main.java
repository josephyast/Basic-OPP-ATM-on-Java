public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Account account = new Account("Bank User","12345",2000);
        atm.run(account);
        System.out.println("Exiting The Program");
    }
}
