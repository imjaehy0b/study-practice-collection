package basic.construct;

public class MethodInitMain2 {

  public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
    initMember(member1,"user1",20,50);

    MemberInit member2 = new MemberInit();
    initMember(member2,"user2",20,70);

    MemberInit[] members = {member1, member2};

    for (MemberInit member : members) {
      System.out.printf(" 이름: %s\n 나이: %s \n 성적: %s \n", member.name, member.age, member.grade);
    }
  }

  static void initMember(MemberInit member, String name, int age, int grade) {
    member.name = name;
    member.age = age;
    member.grade = grade;
  }
}
