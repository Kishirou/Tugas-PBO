package Life;

class Human extends Lifeform {
    public Human(String name) {
        super(name);
    }

    @Override
    public String info() {
        return "Category: Human, Name: " + name;
    }
}
class Male extends Human {
    public Male(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Male";
    }
}

class Female extends Human {
    public Female(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Female";
    }
}
class Father extends Male {
    private int age;
    private int children;

    public Father(String name, int age, int children) {
        super(name);
        this.age = age;
        this.children = children;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Father, Age: " + age + ", Children: " + children;
    }
}

class Son extends Male {
    private int age;
    

    public Son(String name, int age) {
        super(name);
        this.age = age;
        
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Son, Age: " + age;
    }
}

class GrandFather extends Male {
    private int age;
    private int children;
    private int grandchildren;

    public GrandFather(String name, int age, int children, int grandchild) {
        super(name);
        this.age = age;
        this.children = children;
        this.grandchildren = grandchild;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Grandfather, Age: " + age + ", Children: " + children + ", Grandchildren: " + grandchildren;
    }
}

class Mother extends Female {
    private int age;
    private int children;

    public Mother(String name, int age, int children) {
        super(name);
        this.age = age;
        this.children = children;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Mother, Age: " + age + ", Children: " + children;
    }
}

class Daughter extends Female {
    private int age;
    

    public Daughter(String name, int age) {
        super(name);
        this.age = age;
        
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Daughter, Age: " + age;
    }
}

class GrandMother extends Female {
    private int age;
    private int children;
    private int grandchildren;

    public GrandMother(String name, int age, int children, int grandchild) {
        super(name);
        this.age = age;
        this.children = children;
        this.grandchildren = grandchild;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Mother, Age: " + age + ", Children: " + children + "Grandchildren:" + grandchildren;
    }
}