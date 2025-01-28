package basic.oop1;

public class MusicPlayer {
  int volume = 0;
  boolean isOn = false;

    void on() {
      //음악 플레이어 켜기
      isOn = true;
      System.out.println("음악 플레이어를 시작합니다.");
    }
    void off() {
      System.out.println("음악 플레이어를 종료합니다.");
      isOn = false;
    }
    void volumeUp() {
      //볼륨 증가
      volume++;
      System.out.println("볼륨:" + volume);
    }
    void volumeDown() {
      //볼륨 감소
      volume--;
      System.out.println("볼륨:" + volume);
    }

    void isStatus() {
      if (isOn) {
        System.out.println("상태 : 켜짐");
      } else {
        System.out.println("상태 : 꺼짐");
      }
    }
  }


