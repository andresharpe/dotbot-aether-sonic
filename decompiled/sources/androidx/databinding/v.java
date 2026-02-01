package androidx.databinding;

import androidx.databinding.x;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v<K, V> extends androidx.collection.a<K, V> implements x<K, V> {

    /* renamed from: R, reason: collision with root package name */
    private transient t f14123R;

    private void v(Object obj) {
        t tVar = this.f14123R;
        if (tVar != null) {
            tVar.i(this, 0, obj);
        }
    }

    @Override // androidx.databinding.x
    public void b(x.a<? extends x<K, V>, K, V> aVar) {
        if (this.f14123R == null) {
            this.f14123R = new t();
        }
        this.f14123R.a(aVar);
    }

    @Override // androidx.collection.l, java.util.Map
    public void clear() {
        if (!isEmpty()) {
            super.clear();
            v(null);
        }
    }

    @Override // androidx.databinding.x
    public void d(x.a<? extends x<K, V>, K, V> aVar) {
        t tVar = this.f14123R;
        if (tVar != null) {
            tVar.o(aVar);
        }
    }

    @Override // androidx.collection.l
    public V o(int i4) {
        K m4 = m(i4);
        V v3 = (V) super.o(i4);
        if (v3 != null) {
            v(m4);
        }
        return v3;
    }

    @Override // androidx.collection.l
    public V p(int i4, V v3) {
        K m4 = m(i4);
        V v4 = (V) super.p(i4, v3);
        v(m4);
        return v4;
    }

    @Override // androidx.collection.l, java.util.Map
    public V put(K k4, V v3) {
        super.put(k4, v3);
        v(k4);
        return v3;
    }

    @Override // androidx.collection.a
    public boolean t(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            int j4 = j(it.next());
            if (j4 >= 0) {
                o(j4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // androidx.collection.a
    public boolean u(Collection<?> collection) {
        boolean z3 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(m(size))) {
                o(size);
                z3 = true;
            }
        }
        return z3;
    }
}
