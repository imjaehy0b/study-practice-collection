package basic.oop1.ex;

public class Account {
  int balance = 0;


  void deposit(int amount) {
    balance += amount;
    System.out.println("입금 완료");
    System.out.println("잔고 : " + balance);
  }

  void withdraw(int amount) {
    if(balance >= amount) {
      balance -= amount;
      System.out.println("출금 완료");
      System.out.println("잔고 : " + balance);
    }else{
      System.out.println("잔액 부족");
      System.out.println("잔고 : "+balance);
    }
  }
}
