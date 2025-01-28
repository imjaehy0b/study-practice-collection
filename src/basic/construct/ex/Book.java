package basic.construct.ex;

public class Book {
  String title;
  String author;
  int page;


  Book(){
    this("","",0);
  }

  Book(String title, String author){
    this(title, author, 0);
  }

  Book(String title, String author, int page) {
    this.title = title;
    this.author = author;
    this.page = page;
  }

  void displayInfo(){
    System.out.printf("제목: %s 작가: %s 페이지수: %s\n", title, author, page);
  }
}
