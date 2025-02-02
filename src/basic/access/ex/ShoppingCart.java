package basic.access.ex;

import java.text.Format;

public class ShoppingCart {

  private Item[] items = new Item[10];
  private int cnt = 0;

  public void addCart(Item item) {
    if (this.cnt >= items.length) {
      System.out.println("장바구니가 가득 찼습니다.");
      return;
    }
    items[cnt++] = item;
  }

  public void displayItems() {
//    int total = 0;
    for (int i = 0; i < cnt; i++) {
      System.out.println("상품명: " + items[i].getProductName() + " 합계: " + items[i].getTotalPrice());
//      total += items[i].getTotalPrice();
    }
//    System.out.println("총합계 : " + total);
    System.out.println("전체 가격 합 : " + calculateTotalPrice());
  }

  private int calculateTotalPrice() {
    int totalPrice = 0;
    for (int i = 0; i < cnt; i++) {
      totalPrice += items[i].getTotalPrice();
    }
    return totalPrice;
  }
}
