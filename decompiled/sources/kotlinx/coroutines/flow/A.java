package kotlinx.coroutines.flow;

import kotlin.H0;

/* loaded from: classes2.dex */
public final class A extends kotlinx.coroutines.flow.internal.c<y<?>> {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    public long f53473a = -1;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.e
    public kotlin.coroutines.c<? super H0> f53474b;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@l3.d y<?> yVar) {
        if (this.f53473a >= 0) {
            return false;
        }
        this.f53473a = yVar.f0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @l3.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.c<H0>[] b(@l3.d y<?> yVar) {
        long j4 = this.f53473a;
        this.f53473a = -1L;
        this.f53474b = null;
        return yVar.e0(j4);
    }
}
