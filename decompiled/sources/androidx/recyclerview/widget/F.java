package androidx.recyclerview.widget;

import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class F<T2> extends E.b<T2> {

    /* renamed from: a, reason: collision with root package name */
    final RecyclerView.Adapter f17458a;

    public F(RecyclerView.Adapter adapter) {
        this.f17458a = adapter;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i4, int i5) {
        this.f17458a.v(i4, i5);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i4, int i5) {
        this.f17458a.y(i4, i5);
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i4, int i5) {
        this.f17458a.z(i4, i5);
    }

    @Override // androidx.recyclerview.widget.E.b, androidx.recyclerview.widget.u
    public void d(int i4, int i5, Object obj) {
        this.f17458a.x(i4, i5, obj);
    }

    @Override // androidx.recyclerview.widget.E.b
    public void h(int i4, int i5) {
        this.f17458a.w(i4, i5);
    }
}
