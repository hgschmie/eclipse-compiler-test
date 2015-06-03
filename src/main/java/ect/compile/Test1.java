package ect.compile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class Test1
{
    public void test1(ConnectorMetadata metadata, Optional<Set<ColumnHandle>> stuff)
    {
        List<ConnectorTableLayoutResult> layouts = null;
        TupleDomain<ColumnHandle> summary = null;
        ConnectorTableHandle connectorTable = null;
        Predicate<Map<ColumnHandle, ?>> predicate = getPredicate();
        layouts = metadata.getTableLayouts(connectorTable, new Constraint<ColumnHandle>(summary, predicate::test), stuff);
        System.out.println(layouts);
    }

    private Predicate<Map<ColumnHandle, ?>> getPredicate()
    {
        return new Predicate<Map<ColumnHandle, ?>>()
        {
            @Override
            public boolean test(Map<ColumnHandle, ?> columnHandleMap)
            {
                return false;
            }
        };
    }

    public static class ConnectorTableLayoutResult
    {
    }

    public static class ColumnHandle
    {
    }

    public static class TupleDomain<T>
    {
    }

    public static interface ConnectorTableHandle
    {
    }

    public interface ConnectorMetadata
    {
        default List<ConnectorTableLayoutResult> getTableLayouts(ConnectorTableHandle arg1, Constraint<ColumnHandle> constraint, Optional<Set<ColumnHandle>> barTypes)
        {
            throw new UnsupportedOperationException();
        }
    }

    public class Constraint<T>
    {
        public Constraint(TupleDomain<T> baz, Predicate<Map<T, ?>> predicate)
        {
        }
    }
}
