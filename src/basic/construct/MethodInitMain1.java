package basic.construct;

public class MethodInitMain1  {

  public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
    member1.name = "user1";
    member1.age = 20;
    member1.grade = 50;

    MemberInit member2 = new MemberInit();
    member2.name = "user2";
    member2.age = 30;
    member2.grade = 60;

    MemberInit[] members = {member1, member2};

    for (MemberInit member : members) {
      System.out.printf(" 이름: %s\n 나이: %s \n 성적: %s \n", member.name, member.age, member.grade);
    }
  }
}
