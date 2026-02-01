package androidx.arch.core.internal;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.b;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: I, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f6377I = new HashMap<>();

    public boolean contains(K k4) {
        return this.f6377I.containsKey(k4);
    }

    @Override // androidx.arch.core.internal.b
    @P
    protected b.c<K, V> d(K k4) {
        return this.f6377I.get(k4);
    }

    @Override // androidx.arch.core.internal.b
    public V k(@N K k4, @N V v3) {
        b.c<K, V> d4 = d(k4);
        if (d4 != null) {
            return d4.f6383F;
        }
        this.f6377I.put(k4, j(k4, v3));
        return null;
    }

    @Override // androidx.arch.core.internal.b
    public V l(@N K k4) {
        V v3 = (V) super.l(k4);
        this.f6377I.remove(k4);
        return v3;
    }

    @P
    public Map.Entry<K, V> m(K k4) {
        if (contains(k4)) {
            return this.f6377I.get(k4).f6385H;
        }
        return null;
    }
}
