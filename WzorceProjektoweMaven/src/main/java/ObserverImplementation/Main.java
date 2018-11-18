package ObserverImplementation;

public class Main {
    public static void main(String[] args) {

        Observable tomek = new SubsriberObservable("Tomek");
        Observable łukasz = new SubsriberObservable("Łukasz");
        Observable jarosław = new SubsriberObservable("Jarosław");

        Observable akira = new SubscriberObservableVIP("Akira", "Torisama");
        Observable czarnocki = new SubscriberObservableVIP("Wojciech", "Czarnocki");
        Observable kwasniewski = new SubscriberObservableVIP("Aleksander", "Kwaśniewski");

        Observer ckm = new CKMObserver();

        ckm.subscribe(tomek);
        ckm.subscribe(łukasz);
        ckm.subscribe(jarosław);

        ckm.subscribe(akira);
        ckm.subscribe(czarnocki);
        ckm.subscribe(kwasniewski);

        ckm.sendToAll();

        Observer playboyRedaction = new PlayboyObserver();
        playboyRedaction.subscribe(czarnocki);
        playboyRedaction.subscribe(kwasniewski);
        playboyRedaction.subscribe(akira);

        playboyRedaction.sendToAll();
    }
}
