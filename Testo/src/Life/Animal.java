package Life;

class Animal extends Lifeform {
    public Animal(String name) {
        super(name);
    }

    @Override
    public String info() {
        return "Category: Animal, Name: " + name;
    }
}
class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Mammal";
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Bird";
    }
}

class Reptile extends Animal {
    public Reptile(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() + ", Type: Reptile";
    }
}
class Dog extends Mammal {
    private int age;
    private String breed;
    private String bark;

    public Dog(String name, int age, String breed, String bark) {
        super(name);
        this.age = age;
        this.breed = breed;
        this.bark = bark;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Dog, Age: " + age + ", Breed: " + breed + ", Bark: " + bark;
    }
}

class Cat extends Mammal {
    private int age;
    private String breed;
    private String meow;

    public Cat(String name, int age, String breed, String meow) {
        super(name);
        this.age = age;
        this.breed = breed;
        this.meow = meow;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Cat, Age: " + age + ", Breed: " + breed + ", Meow: " + meow;
    }
}

class Rabbit extends Mammal {
    private int age;
    private String breed;
    private String jump;

    public Rabbit(String name, int age, String breed, String jump) {
        super(name);
        this.age = age;
        this.breed = breed;
        this.jump = jump;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Rabbit, Age: " + age + ", Breed: " + breed + "' Jump: " + jump;
    }
}

class Parrot extends Bird {
    private int age;
    private double wingspan;
    private String copying;

    public Parrot(String name, int age, double wingspan, String copying) {
        super(name);
        this.age = age;
        this.wingspan = wingspan;
        this.copying = copying;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Parrot, Age: " + age + ", Wingspan: " + wingspan + " meters" + "' mimicking voice: " + copying;
    }
}

class Eagle extends Bird {
    private int age;
    private double wingspan;
    private String hunting;

    public Eagle(String name, int age, double wingspan, String hunting) {
        super(name);
        this.age = age;
        this.wingspan = wingspan;
        this.hunting = hunting;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Eagle, Age: " + age + ", Wingspan: " + wingspan + " meters" + "' Hunting skill: " + hunting;
    }
}

class Macaw extends Bird {
    private int age;
    private double wingspan;
    private String feather;

    public Macaw(String name, int age, double wingspan, String feather) {
        super(name);
        this.age = age;
        this.wingspan = wingspan;
        this.feather = feather;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Macaw, Age: " + age + ", Wingspan: " + wingspan + " meters" + "' Feather color: " + feather;
    }
}

class Lizard extends Reptile {
    private int age;
    private int tail;

    public Lizard(String name, int age, int tail) {
        super(name);
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Lizard, Age: " + age + "', Tailspan: " + tail;
    }
}

class Snake extends Reptile {
    private int age;
    private int speed;

    public Snake(String name, int age, int speed) {
        super(name);
        this.age = age;
        this.speed = speed;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Snake, Age: " + age + "' speed: " + speed;
    }
}

class Chameleon extends Reptile {
    private int age;
    private String camo;

    public Chameleon(String name, int age, String camo) {
        super(name);
        this.age = age;
        this.camo = camo;
    }

    @Override
    public String info() {
        return super.info() + ", Subtype: Chameleon, Age: " + age + "' Camouflaging skill: " + camo;
    }
}