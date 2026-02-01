package androidx.recyclerview.widget;

import androidx.annotation.N;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956b implements u {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final RecyclerView.Adapter f17952a;

    public C0956b(@N RecyclerView.Adapter adapter) {
        this.f17952a = adapter;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i4, int i5) {
        this.f17952a.v(i4, i5);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i4, int i5) {
        this.f17952a.y(i4, i5);
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i4, int i5) {
        this.f17952a.z(i4, i5);
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i4, int i5, Object obj) {
        this.f17952a.x(i4, i5, obj);
    }
}
