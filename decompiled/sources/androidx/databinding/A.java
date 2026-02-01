package androidx.databinding;

import androidx.annotation.N;
import androidx.databinding.i;
import androidx.databinding.u;

/* loaded from: classes.dex */
public class A extends i<u.a, u, Void> {

    /* renamed from: K, reason: collision with root package name */
    private static final i.a<u.a, u, Void> f13930K = new a();

    /* loaded from: classes.dex */
    class a extends i.a<u.a, u, Void> {
        a() {
        }

        @Override // androidx.databinding.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u.a aVar, u uVar, int i4, Void r4) {
            aVar.f(uVar, i4);
        }
    }

    public A() {
        super(f13930K);
    }

    public void r(@N u uVar, int i4) {
        i(uVar, i4, null);
    }
}
