public class Pair <T, V> {

    private T t;
    private V v;

    public Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getFirst() {
        return t;
    }

    public V getSecond() {
        return v;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "t = " + t.getClass().getName() +
                ", v = " + v.getClass().getName() +
                '}';
    }

    public static void main(String[] args) {
        Pair pair = new Pair(5, 7);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
