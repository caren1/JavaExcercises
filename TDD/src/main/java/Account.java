public class Account {

    public int value;

    public Account() {
        this.value = 0;
    }

    public Account(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int deposit(int amount) {
        if (amount < 0) {
            System.out.println("You're trying to deposit (-) amount of money");

        } else if (amount >= 0) {
            value += amount;
        }
        return value;
    }

    public int withdraw(int amount) {
        if (amount > getValue()){
            System.out.println("Your trying to withdraw too high amount of money. " + "Your balance is : " + value);
        }
        if (amount < getValue()){
            value -= amount;
        }else{
            System.out.println("There is not enough money. ");
        }
        return value;
    }
}
