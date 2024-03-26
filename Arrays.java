import java.util.ArrayList;
public class Arrays {
    public <T1 extends ArrayList<Integer>, T2 extends ArrayList<Integer>> boolean compareArrays(T1 t1, T2 t2) {
        for (int i = 0; i < t1.size(); i++) {
            if(!t1.get(i).equals(t2.get(i))){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(2);
        array2.add(3);

        Arrays arrays = new Arrays();
        arrays.compareArrays(array1, array2);

    }
}
