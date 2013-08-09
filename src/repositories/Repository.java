package repositories;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Repository<T> implements Iterator {
    
    private List<T> items;
    private Integer index;
    
    public Repository()
    {
        items = new ArrayList<T>();
        index = 0;
    }

    public void add(T item)
    {
        items.add(item);
    }
    
    public Boolean remove(T item)
    {
        return items.remove(item);
    }
    
    public void rewind()
    {
        index = 0;
    }
    
    private Integer getNextIndex()
    {
        return getNextIndex(1);
    }
    
    private Integer getPreviousIndex()
    {
        return getNextIndex(-1);
    }
    
    private Integer getNextIndex(Integer increment)
    {
        Integer tmpIndex = index + 1;
        if (tmpIndex > items.size()) return -1;
        return tmpIndex;
    }

    @Override
    public boolean hasNext() {
        return (getNextIndex() != -1);
    }

    @Override
    public T next() {
        Integer nowIndex = index;
        index = getNextIndex();
        if (nowIndex == -1) {
            throw new NoSuchElementException();
        }
        return items.get(nowIndex);
    }

    @Override
    public void remove() {
        items.remove(++index);
        --index;
    }
    
}
