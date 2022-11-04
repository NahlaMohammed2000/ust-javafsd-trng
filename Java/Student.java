import java.util.Objects;

public class Student {
    String name;
    int age,rollNo;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getrollNo() {
        return rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && rollNo == student.rollNo && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rollNo);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setrollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
