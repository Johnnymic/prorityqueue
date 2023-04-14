package model;

public class Applicants extends Person{
    private int age;
    private String qualification;

    public Applicants(String name, int age,String qualification) {
        super(name);
        this.age= age;
        this.qualification=qualification;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Applicants{" +
                "age=" + age +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
