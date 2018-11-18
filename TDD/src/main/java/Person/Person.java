package Person;

public class Person {

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Person() {
        this.discount = true;
    }

    public Person(byte age) {
        this.age = age;
        this.discount = true;
    }

    private byte age;

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    private boolean discount;


    public void assignDiscount(Person person) {
        if (person.getAge() > 6 && person.getAge() < 65) {
            setDiscount(false);
        } else {
            setDiscount(true);
        } if (person.getAge() == 0){
            setDiscount(false);
        }
    }
}

