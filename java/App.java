import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
//-----------------------------1 и 2 задание----------------------------------------------------
        Integer[] arr1 = {1,2,3,4,5,6};
        App app = new App();
        app.arr(arr1, 0, 1);
        app.toArrayList(arr1);
//-----------------------------------3 задание------------------------------------------------------
      Box<Orange> box1 = new Box<>();
      Box<Apple> box2 = new Box<>();

      box1.add(new Orange());
      box1.add(new Orange());
      box2.add(new Apple());
      box2.add(new Apple());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        // box2.add(new Apple());
        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box1.toAnotherBox(box3);

    }

    public static <T> void arr(T [] array, int index1, int index2){
        System.out.println(Arrays.toString(array) + " - до перемены элементов: [0], [1]");
        if (array[index1] != array[index2]){
            T a = array[index1];
            array[index1] = array[index2];
            array[index2] = a;
        }
        System.out.println(Arrays.toString(array));
    }

    public static <E> void toArrayList(E [] a){
        ArrayList<E> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        list.toString();
        System.out.println(list);
        //Arrays.asList(a);  как еще один вариант.
    }
}
