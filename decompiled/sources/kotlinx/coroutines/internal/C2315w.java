package kotlinx.coroutines.internal;

import kotlin.H0;

/* renamed from: kotlinx.coroutines.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2315w extends C2317y {
    @Override // kotlinx.coroutines.internal.C2317y
    public boolean N0() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.C2317y
    @l3.e
    protected C2317y P0() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.C2317y
    public /* bridge */ /* synthetic */ boolean Q0() {
        return ((Boolean) Z0()).booleanValue();
    }

    public final /* synthetic */ <T extends C2317y> void X0(X2.l<? super T, H0> lVar) {
        for (C2317y c2317y = (C2317y) I0(); !kotlin.jvm.internal.F.g(c2317y, this); c2317y = c2317y.J0()) {
            kotlin.jvm.internal.F.y(3, androidx.exifinterface.media.a.f5);
            if (c2317y instanceof C2317y) {
                lVar.C(c2317y);
            }
        }
    }

    public final boolean Y0() {
        if (I0() == this) {
            return true;
        }
        return false;
    }

    @l3.d
    public final Void Z0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.y] */
    public final void a1() {
        C2315w c2315w = this;
        C2315w c2315w2 = (C2317y) I0();
        while (!kotlin.jvm.internal.F.g(c2315w2, this)) {
            C2317y J02 = c2315w2.J0();
            c2315w2.W0(c2315w, J02);
            c2315w = c2315w2;
            c2315w2 = J02;
        }
        W0(c2315w, (C2317y) I0());
    }
}
