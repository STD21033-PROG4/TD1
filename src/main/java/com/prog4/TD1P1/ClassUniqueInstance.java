package java.com.prog4.TD1P1;

public class ClassUniqueInstance {
    INSTANCE()

    private int click;

    private ClassUniqueInstance(int click) {
        this.click = click
    }

    public ClassUniqueInstance getInstance() {
        return INSTANCE;
    }
}
