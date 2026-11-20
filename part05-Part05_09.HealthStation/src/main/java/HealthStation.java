
public class HealthStation {
    private int weighings = 0;

    public void setWeighings(int weighings) {
        this.weighings = weighings;
    }

    public int getWeighings() {
        return this.weighings;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighings = this.weighings + 1;
        return person.getWeight();

    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.getWeighings();
    }
}
