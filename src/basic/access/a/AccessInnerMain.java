package basic.access.a;

public class AccessInnerMain {
  public static void main(String[] args) {
    AccessData data = new AccessData();

    //퍼블릭
    data.publicField = 1;
    data.PublicField();

    //디폴트
    data.defaultField = 1;
    data.DefaultField();

    //프라이빗
//    data.privateField = 1;
//    data.privateField();


    data.innerAccess();

  }
}
