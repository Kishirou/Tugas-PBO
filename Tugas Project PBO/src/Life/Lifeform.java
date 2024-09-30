package Life;

abstract class Lifeform {
    protected String name;

    public Lifeform(String name) {
        this.name = name;
    }

    public abstract String info();
}
