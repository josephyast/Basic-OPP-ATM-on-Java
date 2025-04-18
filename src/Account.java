public class Account {

    private String username_id;
    private String password;
    private int balance;

    public Account(String username_id, String password, int balance) {
        this.username_id = username_id;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername_id() {
        return username_id;
    }

    public void setUsername_id(String username_id) {
        this.username_id = username_id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void moneyDeposit(int amount){
        balance += amount;
        System.out.println("Your New Balance : "+balance);
    }

    public void moneyWithdraw(int amount){
        if ((balance-amount) < 0){
            System.out.println("You Don't Have Enough Balance");
        } else {
            balance -= amount;
            System.out.println("Your New Balance : " + balance);
        }
    }
}
