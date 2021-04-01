import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
//-----------------------------1 и 2 задание----------------------------------------------------
      App app = new App();
      app.arr();
      int[] arr1 = {1,2,3,4,5,6};
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

    public void arr(){
        int [] array  = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array) + " - до перемены элементов: [0], [1]");
        if (array[0] != array[1]){
            int a = array[0];
            array[0] = array[1];
            array[1] = a;
        }
        System.out.println(Arrays.toString(array));
    }

    public void toArrayList(int [] a){
        ArrayList list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        list.toString();
        System.out.println(list);
    }
}
