import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NextTasks {

    /*2. Напишите метод, который получает на вход Map<K, V> и возвращает
    Map, где ключи и значения поменяны местами. Для упрощения задачи
    мапа должна быть с ключами типа String и значениями типа Integer.*/
    public Map<Integer, String> Map_swap(Map<String, Integer> map) {
    Map<Integer, String> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    return swapped;
    }

    /*3. Написать свой итератор по массиву.*/
    public void iterator()
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        for(int index = 0; index < arr.length ; index++) {
            System.out.println(arr[index]);
        }
    }

    /*4. Напишите метод, который на вход получает коллекцию объектов, а
    возвращает коллекцию уже без дубликатов.*/
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    /*5. Напишите метод fill, который принимает массив объектов, и
    реализацию интерфейса Function
    Метод fill должен заполнить массив, получая новое значение по
    индексу с помощью реализации интерфейса Function.*/
    public static <T> void fill(T[] objects, Function<Integer, ? extends T> function) {
        for(int i = 0; i < objects.length; i++){
            objects[i] = function.apply(i);
        }
    }
}
