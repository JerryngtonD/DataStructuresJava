import java.util.Collections;

public class Queue extends DataStructure {
    @Override
    public void doPush(Integer item) {
        storage.add(0, item);
    }

    @Override
    public Integer pop() {
        Integer orderedItem = storage.get(0);
        storage.remove(0);

        maxItem = Collections.max(storage);
        minItem = Collections.min(storage);

        return orderedItem;
    }
}
