package Day1026;

public class Student {
    String name;
    int age;
    String gender;
    int grade;

    public Student(){
        name = "初始化姓名";
        age = 0;
        gender = "男";
        grade = 0;
    }

    public Student(String name,int age,String gender,int grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "[姓名是：" + name + ",年龄是：" + age + ",性别是" + gender + ",年级是" + grade + "]";
    }
}
