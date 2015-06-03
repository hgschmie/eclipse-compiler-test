package ect.broken;

import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import static ect.broken.Test5.RetryDriver.retry;
import static java.util.Locale.ENGLISH;

public class Test5
{
    public Map<String, String> loadAllSchemas()
            throws Exception
    {
        List<String> schemas = null;
        return retry()
                .stopOnIllegalExceptions()
                .run("getAllSchemas", () -> Maps.uniqueIndex(schemas, Test5::toLowerCase));
    }

    private static String toLowerCase(String value)
    {
        return value.toLowerCase(ENGLISH);
    }

    public static class RetryDriver
    {
        public static RetryDriver retry()
        {
            return new RetryDriver();
        }

        private RetryDriver()
        {
        }

        public RetryDriver stopOnIllegalExceptions()
        {
            return this;
        }

        public <V> V run(String callableName, Callable<V> callable)
                throws Exception
        {
            return callable.call();
        }
    }
}