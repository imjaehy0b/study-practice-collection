package basic.oop1;

public class MusicPlayerMain1 {

  public static void main(String[] args) {
    //음악 키고 끄기
    //볼륨 증가, 감소
    //상태 확인
    int volume = 0;
    boolean isOn = false;

    //음악 플레이어 켜기
    isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");

    //볼륨 증가
    volume++;
    System.out.println("볼륨:"+volume);
    //볼륨 증가
    volume++;
    System.out.println("볼륨:"+volume);
    //볼륨 감소
    volume--;
    System.out.println("볼륨:"+volume);
    //플레이어 상태 확인
    if(isOn){
      System.out.println("상태 : 켜짐");
    }else{
      System.out.println("상태 : 꺼짐");
    }
    //플레이어 종료
    isOn = false;
  }
}
