package basic.oop1;

public class MusicPlayerData {
  int volume = 0;
  boolean isOn = false;

  static void on(MusicPlayerData data) {
    //음악 플레이어 켜기
    data.isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");
  }
  static void off(MusicPlayerData data) {
    System.out.println("음악 플레이어를 종료합니다.");
    data.isOn = false;
  }
  static void volumeUp(MusicPlayerData data) {
    //볼륨 증가
    data.volume++;
    System.out.println("볼륨:" + data.volume);
  }
  static void volumeDown(MusicPlayerData data) {
    //볼륨 감소
    data.volume--;
    System.out.println("볼륨:" + data.volume);
  }

  static void isStatus(MusicPlayerData data) {
    if (data.isOn) {
      System.out.println("상태 : 켜짐");
    } else {
      System.out.println("상태 : 꺼짐");
    }
  }
}
