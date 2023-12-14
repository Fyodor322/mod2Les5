package entity;

import entity.Income;

public class Service extends Income {
    private int quantity;

    public Service(int id, String name, int sum, int quantity) {
        super(id, name, sum);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int costOfWork(){
        return getSum() * quantity;
    }
}
