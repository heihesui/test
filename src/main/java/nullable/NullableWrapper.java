package nullable;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class NullableWrapper<T> {
    private final Supplier<T> supplier;
    private T defaultValue = null;

    public NullableWrapper(Supplier<T> supplier) {
        this.supplier = Optional.ofNullable(supplier).orElse(() -> null);
    }

    public NullableWrapper(Supplier<T> supplier, T defaultValue) {
        this.supplier = Optional.ofNullable(supplier).orElse(() -> null);
        this.defaultValue = defaultValue;
    }

    public T get() {
        return getOrElse(defaultValue);
    }

    private T getOrElse(T newDefault) {
        if (supplier == null) {
            return newDefault;
        }
        T evaluated;
        try {
            evaluated = supplier.get();
        } catch (NullPointerException | NoSuchElementException e) {
            return newDefault;
        }
        return Optional.ofNullable(evaluated).orElse(newDefault);
    }
}