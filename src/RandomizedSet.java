import java.util.*;

public class RandomizedSet {

    private Map<Integer, Integer> valueToIndex;
    private List<Integer> values;
    private Random random;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        valueToIndex = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (valueToIndex.containsKey(val)) {
            return false;
        }
        values.add(val);
        valueToIndex.put(val, values.size() - 1);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (valueToIndex.containsKey(val)) {
            int valueIndex = valueToIndex.get(val);
            if (values.size() > 1) {
                int swapIndex = values.size() - 1;
                int swapValue = values.get(swapIndex);

                Collections.swap(values, valueIndex, swapIndex);
                valueToIndex.put(swapValue, valueIndex);
                values.remove(swapIndex);
            }
            valueToIndex.remove(val);
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        if (values.isEmpty()) {
            return 0;
        }
        int index = random.nextInt(values.size());
        return values.get(index);
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */