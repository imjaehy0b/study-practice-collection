package basic.oop1;

public class MusicPlayerMain2 {
  public static void main(String[] args) {
    MusicPlayerData data = new MusicPlayerData();

    //음악 플레이어 켜기
    data.isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");

    //볼륨 증가
    data.volume++;
    System.out.println("볼륨:" + data.volume);
    //볼륨 증가
    data.volume++;
    System.out.println("볼륨:" + data.volume);
    //볼륨 감소
    data.volume--;
    System.out.println("볼륨:" + data.volume);
    //플레이어 상태 확인
    if (data.isOn) {
      System.out.println("상태 : 켜짐");
    } else {
      System.out.println("상태 : 꺼짐");
    }
    //플레이어 종료
    data.isOn = false;
  }
}
