public class Main {
    public static void main(String[] args) {
        Frog jerret = new Frog("green");
        Frog james = new Frog("yellow", 2);

        System.out.println(String.format("Jerret and James are two frogs. Jerrit is %s, James is %s.",
                jerret.get_age(), james.get_age()));
        System.out.println("\nA year passes.\n");
        Frog.age();
        System.out.println(String.format("Jerret is now dead (jerret.dead = %s) and James is %s.",
                jerret.is_dead(), james.get_age()));

    }
}
