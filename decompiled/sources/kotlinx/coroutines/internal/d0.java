package kotlinx.coroutines.internal;

import kotlinx.coroutines.p1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.d
    public final kotlin.coroutines.f f54477a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Object[] f54478b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final p1<Object>[] f54479c;

    /* renamed from: d, reason: collision with root package name */
    private int f54480d;

    public d0(@l3.d kotlin.coroutines.f fVar, int i4) {
        this.f54477a = fVar;
        this.f54478b = new Object[i4];
        this.f54479c = new p1[i4];
    }

    public final void a(@l3.d p1<?> p1Var, @l3.e Object obj) {
        Object[] objArr = this.f54478b;
        int i4 = this.f54480d;
        objArr[i4] = obj;
        p1<Object>[] p1VarArr = this.f54479c;
        this.f54480d = i4 + 1;
        p1VarArr[i4] = p1Var;
    }

    public final void b(@l3.d kotlin.coroutines.f fVar) {
        int length = this.f54479c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = length - 1;
            p1<Object> p1Var = this.f54479c[length];
            kotlin.jvm.internal.F.m(p1Var);
            p1Var.B0(fVar, this.f54478b[length]);
            if (i4 >= 0) {
                length = i4;
            } else {
                return;
            }
        }
    }
}
