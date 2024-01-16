import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>(List.of(12, 15, -3, 22, -27, -81, 99));


        System.out.println(removeNegNumber(list));

        list.add(1, 9);
        System.out.println(list);
        System.out.println(list.contains(195));
    }

    public static ArrayList<Integer> removeNegNumber(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0){
                result.add(list.get(i));
            }
        }

        return result;
    }
}