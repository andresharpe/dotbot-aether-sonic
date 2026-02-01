package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
class I<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f17485a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a<T>> f17486b = new SparseArray<>(10);

    /* renamed from: c, reason: collision with root package name */
    a<T> f17487c;

    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f17488a;

        /* renamed from: b, reason: collision with root package name */
        public int f17489b;

        /* renamed from: c, reason: collision with root package name */
        public int f17490c;

        /* renamed from: d, reason: collision with root package name */
        a<T> f17491d;

        public a(Class<T> cls, int i4) {
            this.f17488a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i4));
        }

        boolean a(int i4) {
            int i5 = this.f17489b;
            if (i5 <= i4 && i4 < i5 + this.f17490c) {
                return true;
            }
            return false;
        }

        T b(int i4) {
            return this.f17488a[i4 - this.f17489b];
        }
    }

    public I(int i4) {
        this.f17485a = i4;
    }

    public a<T> a(a<T> aVar) {
        int indexOfKey = this.f17486b.indexOfKey(aVar.f17489b);
        if (indexOfKey < 0) {
            this.f17486b.put(aVar.f17489b, aVar);
            return null;
        }
        a<T> valueAt = this.f17486b.valueAt(indexOfKey);
        this.f17486b.setValueAt(indexOfKey, aVar);
        if (this.f17487c == valueAt) {
            this.f17487c = aVar;
        }
        return valueAt;
    }

    public void b() {
        this.f17486b.clear();
    }

    public a<T> c(int i4) {
        if (i4 >= 0 && i4 < this.f17486b.size()) {
            return this.f17486b.valueAt(i4);
        }
        return null;
    }

    public T d(int i4) {
        a<T> aVar = this.f17487c;
        if (aVar == null || !aVar.a(i4)) {
            int indexOfKey = this.f17486b.indexOfKey(i4 - (i4 % this.f17485a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f17487c = this.f17486b.valueAt(indexOfKey);
        }
        return this.f17487c.b(i4);
    }

    public a<T> e(int i4) {
        a<T> aVar = this.f17486b.get(i4);
        if (this.f17487c == aVar) {
            this.f17487c = null;
        }
        this.f17486b.delete(i4);
        return aVar;
    }

    public int f() {
        return this.f17486b.size();
    }
}
