package androidx.recyclerview.widget;

import androidx.recyclerview.widget.I;

/* loaded from: classes.dex */
interface H<T> {

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(int i4, int i5, int i6, int i7, int i8);

        void b(I.a<T> aVar);

        void c(int i4, int i5);

        void d(int i4);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(int i4, I.a<T> aVar);

        void b(int i4, int i5);

        void c(int i4, int i5);
    }

    a<T> a(a<T> aVar);

    b<T> b(b<T> bVar);
}
