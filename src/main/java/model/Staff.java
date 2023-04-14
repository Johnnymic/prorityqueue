package model;

public class Staff  extends Person{
    private  String id;

    public Staff(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getId() {
        return id;

    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                '}';
    }
}
