package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {

    private T instance;
    private Supplier<T> supplier;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {

        if (instance == null) {
            instance = supplier.get();
        }
      
        return instance;
    }


}
