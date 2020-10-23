package Day1023;


public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(12);
        s1.setGrade(6);
        s1.setGender("男");

        System.out.println("姓名是："+s1.name+"，年龄是："+s1.getAge()+",性别是："+s1.getGender()+",年级是："+s1.getGrade());
        s1.study();
    }
}
