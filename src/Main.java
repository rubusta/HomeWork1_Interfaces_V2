import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Houses house1 = new Houses();
        house1.color = "White";
        house1.number = "123";

        Houses house2 = new Houses();
        house2.color = "Yellow";
        house2.number = "234";

        List<Houses> houses = new ArrayList<>();
//добавление элементов массива
// adding house1, house2 to the array
        houses.add(house1);
        houses.add(house2);
        System.out.println(houses);

//установка значения 1 элемента массива
//setting the value of the first element of the array
        houses.set(1, new Houses());
        System.out.println(houses);

//удаление 1 элемента массива
//removing 1 array element
        houses.remove(1);
        System.out.println(house1);

//удаление 2 элемента массива
//deleting 2 array element
        houses.clear();
        System.out.println(house2);

//проверка списка, является ли он пустым
// checking if the list is empty
        System.out.println(houses.isEmpty());

//вычисление размера листа
//sheet size list
        System.out.println(houses.size());

  //      System.out.println(houses.subList(new ));
    }

}
//к сожалению 2 метода вызвать не получилось
//  boolean removeByValue(int value);
///   IntList subList(int fromIndex, int toIndex);
