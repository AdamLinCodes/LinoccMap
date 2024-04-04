import java.util.ArrayList;
import java.util.HashMap;

public class LinoccMap<T> {
    private int size = 0;
    private HashMap<T, Integer> keys;
    private ArrayList<Integer> values;


    public LinoccMap() {
        keys = new HashMap<>();
        values = new ArrayList<>();
    }

    public void add(T key) {
        if (!keys.containsKey(key)) {
            keys.put(key, this.size);
            values.add(1);
            this.size++;
        }
        else {
            int i = keys.get(key);
            values.set(i, values.get(i) + 1);
        }
    }

    public int occurrences(T key) {
        if (keys.containsKey(key)) {
            return values.get(keys.get(key));
        }
        return 0;
    }

    public void display() {
        for (HashMap.Entry<T, Integer> entry : keys.entrySet()) {
            T key = entry.getKey();
            Integer value = values.get(entry.getValue());
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public void displayKeys() {
        for (HashMap.Entry<T, Integer> entry : keys.entrySet()) {
            T key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
