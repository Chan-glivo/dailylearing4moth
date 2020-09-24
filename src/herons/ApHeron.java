package herons;

public class ApHeron extends  Heron{
    public ApHeron(String name) {
        super(name);
    }

    @Override
    public void one() {
        System.out.println("法师的一技能");
    }

    @Override
    public void two() {
        System.out.println("法师的二技能");
    }

    @Override
    public void three() {
        System.out.println("法师的三技能");
    }
}
