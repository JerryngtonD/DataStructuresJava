import java.util.Collections;

public class Stack extends DataStructure {

    @Override
    public void doPush(Integer item) {
        storage.add(item);
    }

    @Override
    public Integer pop() {
        int lastItemIdx = storage.size() - 1;
        Integer orderedItem = storage.get(lastItemIdx);
        storage.remove(lastItemIdx);

        maxItem = Collections.max(storage);
        minItem = Collections.min(storage);

        return orderedItem;
    }
}
