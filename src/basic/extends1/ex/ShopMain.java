package basic.extends1.ex;

public class ShopMain {

  public static void main(String[] args) {
    Book book = new Book("JAVA", 10000, "han", "12345");
    Album album = new Album("앨범1", 15550, "seo");
    Movie movie = new Movie("영화1", 16000, "감독1", "배우1");

    book.print();
    album.print();
    movie.print();

    int sum = book.getPrice() + album.getPrice() + movie.getPrice();
    System.out.println("가격의 합 : " + sum);
  }
}
