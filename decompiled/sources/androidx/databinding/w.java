package androidx.databinding;

import java.util.List;

/* loaded from: classes.dex */
public interface w<T> extends List<T> {

    /* loaded from: classes.dex */
    public static abstract class a<T extends w> {
        public abstract void a(T sender);

        public abstract void f(T sender, int positionStart, int itemCount);

        public abstract void g(T sender, int positionStart, int itemCount);

        public abstract void h(T sender, int fromPosition, int toPosition, int itemCount);

        public abstract void i(T sender, int positionStart, int itemCount);
    }

    void G(a<? extends w<T>> callback);

    void h(a<? extends w<T>> callback);
}
