package basic.access;

public class BankAccount {

  private int balance;

  public BankAccount() {
    balance = 0;
  }

  //public 메서드 : 입금

  public void deposit(int amount) {
    if (isAmountValid(amount)) {
      balance += amount;
    } else {
      System.out.println("유효하지않은 금액");
    }
  }

  public void withdraw(int amount) {
    if (isAmountValid(amount) && balance - amount >= 0) {
      balance -= amount;
    } else {
      System.out.println("유효하지않은 금액");
    }
  }

  public int getBalance() {
    return balance;
  }

  private boolean isAmountValid(int amount) {
    return amount > 0;
  }

}
