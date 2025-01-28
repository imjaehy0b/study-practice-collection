package basic.ref.ex;

import basic.class1.ex.ProductOrder;
import java.util.Scanner;

public class ProductOrderMain3 {

  public static void main(String[] args) {
    //여러 상품의 주문 정보를 담을 배열 생성
    //메소드를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장'
    //메소드를 사용해서 상품 주문 정보 출력
    //메소드를 사용해서 총 결제 금액 계산
    //총 결제금액 출력

    Scanner sc = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요 : ");
    int cnt = sc.nextInt();
    sc.nextLine();
    ProductOrder[] orders = new ProductOrder[cnt];
    for (int i = 0; i < cnt; i++) {
      System.out.println((i+1)+"번째 주문정보를 입력하세요.");
      System.out.print("상품명 : ");
      String productName = sc.nextLine();
      System.out.print("가격 : ");
      int price = sc.nextInt();
      System.out.print("수량 : ");
      int quantity = sc.nextInt();
      orders[i] = createOrder(productName, price, quantity);
      sc.nextLine();


    }
    printOrders(orders);
    getTotalAmount(orders);
  }



  static ProductOrder createOrder(String ProductName, int price, int quantity){
    ProductOrder order = new ProductOrder();
    order.productName = ProductName;
    order.price = price;
    order.quantity = quantity;

    return order;
  }

  static void printOrders(ProductOrder[] orders){
    for(ProductOrder order : orders){
      System.out.println("상품명: "+order.productName+" 가격:"+order.price+" 수량:"+order.quantity);
    }
  }

  static void getTotalAmount(ProductOrder[] orders){
    int total = 0;
    for (ProductOrder order : orders) {
      total += order.price * order.quantity;
    }
    System.out.println(total);
  }
}
