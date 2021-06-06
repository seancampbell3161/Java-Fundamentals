public class AnimalTest {

    public static void main(String[] args) {
        AnimalList list = new AnimalList();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        list.add(cat2);
        list.add(dog1);
        list.add(dog2);
        list.add(cat1);
    }
}
