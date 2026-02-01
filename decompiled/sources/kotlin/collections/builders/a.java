package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.AbstractC2093h;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC2093h<E> {
    public final boolean c(@l3.d E element) {
        F.p(element, "element");
        return d(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return c((Map.Entry) obj);
    }

    public abstract boolean d(@l3.d Map.Entry<? extends K, ? extends V> entry);

    public /* bridge */ boolean j(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return j((Map.Entry) obj);
    }
}
