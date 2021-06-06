public class AnimalList {

    private Animal[] list = new Animal[4];
    private int index = 0;

    public void add(Animal a) {
        if(index < list.length) {
            list[index] = a;
            System.out.println("Animal " + a + " has been added to the list");
            index++;
        }
    }
}
