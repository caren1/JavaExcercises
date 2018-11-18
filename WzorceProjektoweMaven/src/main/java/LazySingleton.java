public final class LazySingleton { // robi sie tak wtedy kiedy inicjacja jest "droga", zajmuje duzo miejsca w pamięci
    // ten sposób do aplikacji wielowątkowych

    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        return null == instance ? new LazySingleton() : instance;
        // po lewej stronie warunek( to co dla prawdy) / po prawej to co dla fałszu
    }
//        if (null == instance) { //obie formy poprawne, zapis w celu nie popełniania błędu
//            return new LazySingleton();
//        }
//        return instance;
//    }
}
