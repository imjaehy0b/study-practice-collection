package basic.oop1.ex;

public class Rectangle {
  int width = 0;
  int height = 0;


  void isSquare() {
    if(width == height) {
      System.out.println("정사각형입니다.");
    }else{
      System.out.println("정사각형이 아닙니다.");
    }
  }

  void calculatePerimeter() {
    System.out.println("둘레 길이 : " + 2*(width+height));
  }

  void calculateArea() {
    System.out.println("넓이 : "+width*height);
  }

}
