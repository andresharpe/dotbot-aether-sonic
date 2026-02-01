package kotlinx.coroutines;

import kotlin.C2210p;
import kotlinx.coroutines.O;

/* loaded from: classes2.dex */
public final class Q {

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements O {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.p<kotlin.coroutines.f, Throwable, kotlin.H0> f52954F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(X2.p<? super kotlin.coroutines.f, ? super Throwable, kotlin.H0> pVar, O.b bVar) {
            super(bVar);
            this.f52954F = pVar;
        }

        @Override // kotlinx.coroutines.O
        public void Y0(@l3.d kotlin.coroutines.f fVar, @l3.d Throwable th) {
            this.f52954F.c0(fVar, th);
        }
    }

    @l3.d
    public static final O a(@l3.d X2.p<? super kotlin.coroutines.f, ? super Throwable, kotlin.H0> pVar) {
        return new a(pVar, O.f52951v);
    }

    @G0
    public static final void b(@l3.d kotlin.coroutines.f fVar, @l3.d Throwable th) {
        try {
            O o4 = (O) fVar.a(O.f52951v);
            if (o4 != null) {
                o4.Y0(fVar, th);
            } else {
                P.a(fVar, th);
            }
        } catch (Throwable th2) {
            P.a(fVar, c(th, th2));
        }
    }

    @l3.d
    public static final Throwable c(@l3.d Throwable th, @l3.d Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C2210p.a(runtimeException, th);
        return runtimeException;
    }
}
