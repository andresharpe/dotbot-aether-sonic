package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.N;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
interface L {

    /* loaded from: classes.dex */
    public static class a implements L {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<w> f17533a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        int f17534b = 0;

        /* renamed from: androidx.recyclerview.widget.L$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0166a implements c {

            /* renamed from: a, reason: collision with root package name */
            private SparseIntArray f17535a = new SparseIntArray(1);

            /* renamed from: b, reason: collision with root package name */
            private SparseIntArray f17536b = new SparseIntArray(1);

            /* renamed from: c, reason: collision with root package name */
            final w f17537c;

            C0166a(w wVar) {
                this.f17537c = wVar;
            }

            @Override // androidx.recyclerview.widget.L.c
            public void f() {
                a.this.d(this.f17537c);
            }

            @Override // androidx.recyclerview.widget.L.c
            public int g(int i4) {
                int indexOfKey = this.f17536b.indexOfKey(i4);
                if (indexOfKey >= 0) {
                    return this.f17536b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i4 + " does not belong to the adapter:" + this.f17537c.f18351c);
            }

            @Override // androidx.recyclerview.widget.L.c
            public int h(int i4) {
                int indexOfKey = this.f17535a.indexOfKey(i4);
                if (indexOfKey > -1) {
                    return this.f17535a.valueAt(indexOfKey);
                }
                int c4 = a.this.c(this.f17537c);
                this.f17535a.put(i4, c4);
                this.f17536b.put(c4, i4);
                return c4;
            }
        }

        @Override // androidx.recyclerview.widget.L
        @N
        public w a(int i4) {
            w wVar = this.f17533a.get(i4);
            if (wVar != null) {
                return wVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i4);
        }

        @Override // androidx.recyclerview.widget.L
        @N
        public c b(@N w wVar) {
            return new C0166a(wVar);
        }

        int c(w wVar) {
            int i4 = this.f17534b;
            this.f17534b = i4 + 1;
            this.f17533a.put(i4, wVar);
            return i4;
        }

        void d(@N w wVar) {
            for (int size = this.f17533a.size() - 1; size >= 0; size--) {
                if (this.f17533a.valueAt(size) == wVar) {
                    this.f17533a.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements L {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<List<w>> f17539a = new SparseArray<>();

        /* loaded from: classes.dex */
        class a implements c {

            /* renamed from: a, reason: collision with root package name */
            final w f17540a;

            a(w wVar) {
                this.f17540a = wVar;
            }

            @Override // androidx.recyclerview.widget.L.c
            public void f() {
                b.this.c(this.f17540a);
            }

            @Override // androidx.recyclerview.widget.L.c
            public int g(int i4) {
                return i4;
            }

            @Override // androidx.recyclerview.widget.L.c
            public int h(int i4) {
                List<w> list = b.this.f17539a.get(i4);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.f17539a.put(i4, list);
                }
                if (!list.contains(this.f17540a)) {
                    list.add(this.f17540a);
                }
                return i4;
            }
        }

        @Override // androidx.recyclerview.widget.L
        @N
        public w a(int i4) {
            List<w> list = this.f17539a.get(i4);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i4);
        }

        @Override // androidx.recyclerview.widget.L
        @N
        public c b(@N w wVar) {
            return new a(wVar);
        }

        void c(@N w wVar) {
            for (int size = this.f17539a.size() - 1; size >= 0; size--) {
                List<w> valueAt = this.f17539a.valueAt(size);
                if (valueAt.remove(wVar) && valueAt.isEmpty()) {
                    this.f17539a.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void f();

        int g(int i4);

        int h(int i4);
    }

    @N
    w a(int i4);

    @N
    c b(@N w wVar);
}
