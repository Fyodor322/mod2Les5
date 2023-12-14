package entity;

public class Income {

    private int id;
    private String name;
    private int sum;

    public Income(int id, String name, int sum) {
        this.id = id;
        this.name = name;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSum() {
        return sum;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }


    public int costOfWork(){
        return sum;
    }
}
