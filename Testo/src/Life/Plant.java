package Life;

class Plant extends Lifeform {
    public Plant(String name) {
        super(name);
    }

    @Override
    public String info() {
        return "Category: Plant, Name: " + name;
    }
}
class Tree extends Plant {
    public Tree(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Tree";
    }
}

class Flower extends Plant {
    public Flower(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Flower";
    }
}

class Shrub extends Plant {
    public Shrub(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Shrub";
    }
}
class FruitTree extends Tree {
    private int age;
    private String fruitType;

    public FruitTree(String name, int age, String fruitType) {
        super(name);
        this.age = age;
        this.fruitType = fruitType;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Fruit Tree, Age: " + age + ", Fruit: " + fruitType;
    }
}

class DecorationTree extends Tree {
    private int age;
    private String decorationType;

    public DecorationTree(String name, int age, String decorationType) {
        super(name);
        this.age = age;
        this.decorationType = decorationType;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Decoration Tree, Age: " + age + ", Decoration type: " + decorationType;
    }
}

class Rose extends Flower {
    private int age;
    private String color;

    public Rose(String name, int age, String color) {
        super(name);
        this.age = age;
        this.color = color;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Rose, Age: " + age + ", Color: " + color;
    }
}

class Rafflesia extends Flower {
    private int age;
    private String color;
    private String odor;

    public Rafflesia(String name, int age, String color, String odor) {
        super(name);
        this.age = age;
        this.color = color;
        this.odor = odor;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Orchid, Age: " + age + ", Color: " + color + ", odor: " + odor;
    }
}

class Bush extends Shrub {
    private int age;

    public Bush(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Bush, Age: " + age;
    }
}

class Tumbleweed extends Shrub {
    private int age;
    private String speed;

    public Tumbleweed(String name, int age, String speed) {
        super(name);
        this.age = age;
        this.speed = speed;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Tumbleweed, Age: " + age + ", tumbling speed: " + speed;
    }
}