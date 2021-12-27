import java.util.ArrayList;

// This file is adapted from what I submitted to 5.5, but I added a lot more that I had been planning to do previously

public class Frog {
    // Static Stuff
    private static ArrayList<Frog> frog_list = new ArrayList<>();
    public static final int max_age = 3;
    /**
     * Age every frog as if a year has past
     * @return none
     */
    public static void age() {
        for (Frog frog: frog_list) {
            frog.age(1);
            if (frog.is_dead())
                frog_list.remove(frog);
        }
    }
    // getter/setter (modified because this is a list)
    public static Frog frog_list_get(int index) {
        return frog_list.get(index);
    }
    public static void frog_list_edit(int index) {
        frog_list.remove(index);
    }
    public static void frog_list_edit(int index, Frog new_val) {
        frog_list.set(index, new_val);
    }

    private String[] legs;
    private boolean fried;
    private boolean dead;
    private int age;
    private String color;

    public Frog(String color, int age) {
        legs = new String[]{"/", "/", "\\", "\\"};
        fried = false;
        dead = false;
        this.age = age;
        this.color = color;
        frog_list.add(this);
    }
    public Frog(String color) {
        legs = new String[]{"/", "/", "\\", "\\"};
        fried = false;
        dead = false;
        age = 0;
        this.color = color;
        frog_list.add(this);
    }

    // mutators
    public String[] get_legs() {
        return legs;
    }
    public void set_legs(String[] legs) {
        this.legs = legs;
    }
    public boolean is_fried() {
        return fried;
    }
    public void set_fried(boolean fried) {
        this.fried = fried;
    }
    public int get_age() {
        return age;
    }
    public boolean is_dead() {
        return dead;
    }
    public void age(int age) {
        this.age += Math.abs(age);  // you can't cheat time
        if (this.age >= max_age)          // death is inevitable
            dead = true;
    }
}
