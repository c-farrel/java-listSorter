import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Arrays;
import java.util.Comparator;

public class listSorter {

    public static void main(String[] args){
        //create unsorted array
        Integer[] ints = {4, 6, 7, 3, 2, 9, 8, 1, 5};

        //create list from array
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(ints));

        System.out.println("Sorted in Ascending Order:");
        sortListAscending(list);

        System.out.println("Sorted in Descending Order: ");
        sortListDescending(list);

    }

    public static void sortListAscending(List<Integer> list) {
        list.stream()
            .sorted()
            .forEach(System.out::println);
    }

    public static void sortListDescending(List<Integer> list) {
        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }
}
