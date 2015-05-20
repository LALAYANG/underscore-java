package com.github.underscore;

import java.util.HashMap;
import java.util.Map;

public abstract class MemoizeFunction1<T> implements Function1<T, T> {
    private Map<T, T> cache = new HashMap<T, T>();
    public abstract T calc(final T n);

    public T apply(final T key) {
        if (!$.has(cache, key)) {
            cache.put(key, calc(key));
        }
        return cache.get(key);
    }
}
