package basic.access.a;

public class AccessData {


  public int publicField;
  int defaultField;
  private int privateField;

  public void PublicField() {
    System.out.println("퍼블릭 메소드 호출: "+publicField);
  }

  void DefaultField() {
    System.out.println("디폴트 메소드 호출: "+defaultField);
  }

  private void PrivateField() {
    System.out.println("프라이빗 메소드 호출: "+privateField);
  }

  public void innerAccess(){
    System.out.println("내부 호출");
    publicField = 100;
    defaultField = 200;
    privateField = 300;
    PublicField();
    DefaultField();
    PrivateField();
  }

}
