import java.util.Observable;

class EyeOfSauron extends Observable {
    private int hobbits;
    private int elves;
    private int dwarves;
    private int men;

    EyeOfSauron() {
        hobbits = 0;
        elves = 0;
        dwarves = 0;
        men = 0;
    }

    int getHobbits() {
        return hobbits;
    }

    int getElves() {
        return elves;
    }

    int getDwarves() {
        return dwarves;
    }

    int getMen() {
        return men;
    }

    void setEnemies(int hobbits, int elves, int dwarves, int men) {
        this.hobbits = hobbits;
        this.elves = elves;
        this.dwarves = dwarves;
        this.men = men;
        setChanged();
        notifyObservers();
    }
}
