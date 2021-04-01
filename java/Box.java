import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> box;

    public Box() {
        box = new ArrayList<>();
    }

    public float getWeight() {
        float weight = box.size() * box.get(0).getWeight();
        return weight;
    }

    public boolean add(T fruit) {
        return box.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> secondBox) {
        return this.getWeight() == secondBox.getWeight();
    }

    public T get(int i){
        try {
            return box.get(i);
        }catch (IndexOutOfBoundsException a){
            System.out.println("такого элемента нет");
        }
        return null;
    }

    public void toAnotherBox(Box<T> a){
        for (int i = 0; i < box.size(); i++) {
            a.add(box.get(i));
        }
        box.removeAll(this.box);
    }

}
