package java.com.prog4.TD1P1;


public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String description;

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }
}
