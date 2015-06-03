package ect.compile;

import com.google.common.collect.ImmutableList;

import java.util.stream.Collector;

public class Test3
{
    public static <T> Collector<T, ?, ImmutableList<T>> toImmutableList()
    {
        return Collector.<T, ImmutableList.Builder<T>, ImmutableList<T>>of(
                ImmutableList.Builder<T>::new,
                ImmutableList.Builder<T>::add,
                (left, right) -> {
                    left.addAll(right.build());
                    return left;
                },
                ImmutableList.Builder::build);
    }
}
