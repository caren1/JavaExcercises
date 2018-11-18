package ObserverImplementation;

public class SubscriberObservableVIP implements Observable {


    public SubscriberObservableVIP(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public void readNewspaper(String name) {
        System.out.println(this.firstName + " " + this.lastName + " " + " is reading " + name + " newspaper. Hard newspaper.");
    }

    public void playDvd(){
        System.out.println(this.firstName + " Is playin the movie Game Of Thrones.");
    }
}
