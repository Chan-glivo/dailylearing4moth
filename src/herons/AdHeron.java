package herons;

public class AdHeron extends Heron {
    public AdHeron(String name) {
        super(name);
    }

    @Override
    public void one() {
        System.out.println("射手的一技能");
    }

    @Override
    public void two() {
        System.out.println("射手的二技能");
    }

    @Override
    public void three() {
        System.out.println("射手的三技能");
    }
}
