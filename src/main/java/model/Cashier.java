package model;

public class Cashier extends Staff{





    public Cashier(String name, String id) {
        super(name, id);

    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getId() {
        return super.getId();
    }



    @Override
    public String toString() {
        return "Cashier{" +
                "absentCount=" +  +
                '}';
    }


}
