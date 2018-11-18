package ObserverImplementation;

public class SubsriberObservable implements Observable {
    //będzie oczekiwał, że będzie miał prenumaratę
    private String name;

    public SubsriberObservable(String name) {
        this.name = name;
    }
    public void readNewspaper(String name){
        System.out.println(this.name + " is reading the " + name + " newspaper from subscription");

    }
}
