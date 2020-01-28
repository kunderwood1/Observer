public class TestSauronEye {
    public static void main(String[] args) {
        EyeOfSauron eye = new EyeOfSauron();
        BadGuy saruman = new BadGuy(eye, "Saruman");
        BadGuy witchKing = new BadGuy(eye, "Witch King");
        int hobbits = 1;
        int elves = 1;
        int dwarves = 2;
        int men = 0;
        eye.setEnemies(hobbits, elves, dwarves, men);
        saruman.defeated();
        hobbits = 4;
        elves = 2;
        dwarves = 2;
        men = 100;
        eye.setEnemies(hobbits, elves, dwarves, men);
    }//end main
}//end class
