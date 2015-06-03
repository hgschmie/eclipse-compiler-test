package ect.compile;

import java.util.Iterator;

import static com.google.common.collect.Iterators.concat;
import static com.google.common.collect.Iterators.transform;

public class Test4
{
    public static <T> Iterator<T> flatten(Iterator<Iterable<T>> iterator)
    {
        return concat(transform(iterator, Iterable<T>::iterator));
    }
}
    
