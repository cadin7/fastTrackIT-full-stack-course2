package ro.fasttrackit.course2;

abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract Pet friend();

    public abstract String makeSound();
}
