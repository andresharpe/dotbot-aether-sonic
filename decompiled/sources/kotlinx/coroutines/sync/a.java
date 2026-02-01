package kotlinx.coroutines.sync;

import kotlin.H0;
import kotlinx.coroutines.AbstractC2329o;

/* loaded from: classes2.dex */
final class a extends AbstractC2329o {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final i f54687E;

    /* renamed from: F, reason: collision with root package name */
    private final int f54688F;

    public a(@l3.d i iVar, int i4) {
        this.f54687E = iVar;
        this.f54688F = i4;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ H0 C(Throwable th) {
        c(th);
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.AbstractC2331p
    public void c(@l3.e Throwable th) {
        this.f54687E.s(this.f54688F);
    }

    @l3.d
    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f54687E + ", " + this.f54688F + ']';
    }
}
