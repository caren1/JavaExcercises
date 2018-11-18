public final class Singleton { // <- final ; blokuje dziedziczenie

    private String login;
    private String password;
    private static Singleton instance = new Singleton(); // tworzymy instancje ; możemy zamiennie podawać dane w parametrach


    private Singleton() { // private blokuje możliwośc stworzenia New Singleton();
        this("caren", "123456");

    }

    private Singleton(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static Singleton getInstance() { // zwraca instancje Singleton'a ; zawsze odniesiemy się do tego samego miejsca w pamięci
        return instance;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
