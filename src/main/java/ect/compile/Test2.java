package ect.compile;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

import static com.google.common.util.concurrent.Futures.transform;

public class Test2
{
    private final SettableFuture<SharedLookupSource> lookupSourceFuture = SettableFuture.create();

    public ListenableFuture<LookupSource> getLookupSource()
    {
        return transform(lookupSourceFuture, (AsyncFunction<SharedLookupSource, LookupSource>) Futures::<LookupSource>immediateFuture);
    }

    public interface LookupSource
    {
    }

    public class SharedLookupSource
            implements LookupSource
    {

    }
}
