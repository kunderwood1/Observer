import java.util.Observable;
import java.util.Observer;

public class BadGuy implements Observer {
    private String name;
    private EyeOfSauron eye;

    BadGuy(EyeOfSauron eye, String name) {
        this.name = name;
        this.eye = eye;
        this.eye.addObserver(this);
    }

    void defeated() {
        System.out.println(name + " was defeated");
        eye.deleteObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        eye = (EyeOfSauron) observable;
        System.out.println("I, " + name + " see the " + eye.getHobbits() +
                " hobbit('s), " + eye.getElves() + " elves, " + eye.getDwarves() +
                " dwarve('s), and " + eye.getMen() + " men.");

    }
}
