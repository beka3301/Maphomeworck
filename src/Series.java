public class Series {
    private String model;
    private int age;
    private int prize;

    public Series(String model, int age, int prize) {
        this.model = model;
        this.age = age;
        this.prize = prize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Series{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", prize=" + prize +
                '}';
    }
}
