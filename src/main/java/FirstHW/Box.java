package FirstHW;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> box;

    public Box() {
        box = new ArrayList<T>();
    }

    public float getWeight() {
        if (box.isEmpty()) {
            return 0;
        } else {
            return box.size() * box.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> another) {
// return this.getWeight() == box.getWeight();//Сравнение чисел с плавающей точкой. Будут ложноотрицательные срабатывания
        return Math.abs(getWeight()- another.getWeight()) < 0.0001;
    }

    public void addFruit(T frt, int num) {
        for (int i = 1; i <= num; i++) {
            box.add(frt);
        }
    }

    public void transferAll (Box <? super T> another) {
        if (this == another) return;
        another.box.addAll(box);
        box.clear();
    }

}
