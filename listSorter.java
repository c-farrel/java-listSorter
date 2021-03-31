import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Arrays;

public class listSorter {

    public static void main(String[] args){
        //create unsorted array
        Integer[] ints = {4, 6, 7, 3, 2, 9, 8, 1, 5};

        //create list from array
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(ints));

        sortList(list);

    }

    public static void sortList(List<Integer> list) {
        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}
