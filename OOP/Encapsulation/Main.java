public class Main {
  public static void main(String[] args) {
    var account = new Account();
    account.deposit(12);
    account.withdraw(3);
    System.out.println(account.getBalance());
  }
}

public class Account {
  private float balance;

  public void deposit(float amount) {
    if (amount > 0)
      this.balance += amount;
  }

  public void withdraw(float amount) {
    if (amount > 0)
      this.balance -= amount;
  }

  public void setBalance(float balance) {
    if (balance > 0) {
      this.balance = balance;
    }
  }

  public float getBalance() {
    return balance;
  }

}
