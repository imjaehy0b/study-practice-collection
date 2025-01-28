package basic.ref.ex;

import basic.class1.ex.ProductOrder;

public class ProductOrderMain2 {

  public static void main(String[] args) {
    //여러 상품의 주문 정보를 담을 배열 생성
    //메소드를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장'
    //메소드를 사용해서 상품 주문 정보 출력
    //메소드를 사용해서 총 결제 금액 계산
    //총 결제금액 출력
    ProductOrder order1 = createOrder("과자",5000,4);
    ProductOrder order2 = createOrder("음료수",2500,3);
    ProductOrder order3 = createOrder("라면",3000,2);
    ProductOrder[] orders = {order1, order2, order3};

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
