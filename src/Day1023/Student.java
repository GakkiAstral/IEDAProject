package Day1023;

class Student {
    String name;
    int age;
    String gender;
    int grade;


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
        if (age >0 && age <200) {
            this.age = age;
        } else {
            System.out.println("输入的年龄有误！");
        }

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

    public void study() {
        System.out.println("我现在正在进步");
    }
}
