package androidx.databinding;

import java.util.Map;

/* loaded from: classes.dex */
public interface x<K, V> extends Map<K, V> {

    /* loaded from: classes.dex */
    public static abstract class a<T extends x<K, V>, K, V> {
        public abstract void a(T sender, K key);
    }

    void b(a<? extends x<K, V>, K, V> callback);

    void d(a<? extends x<K, V>, K, V> callback);
}
