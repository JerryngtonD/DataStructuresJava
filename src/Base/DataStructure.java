import java.util.ArrayList;
import java.util.List;

public abstract class DataStructure  {
    protected List<Integer> storage = new ArrayList<>();
    protected Integer maxItem = null;
    protected Integer minItem = null;

    public abstract Integer pop();
    public abstract void doPush(Integer item);

    protected void push(Integer item) {
        if (maxItem == null && minItem == null) {
            maxItem = item;
            minItem = item;
        }

        doPush(item);
        setMaxItem(item);
        setMinItem(item);
    };


    public  Integer getMax() {
        return maxItem;
    };

    public  Integer getMin() {
        return minItem;
    };


    public List<Integer> getAll() {
        return storage;
    }

    private void setMaxItem(Integer item) {
        if (item > maxItem) {
            maxItem = item;
        }
    }

    private void setMinItem(Integer item) {
        if (item < minItem) {
            minItem = item;
        }
    }
}
