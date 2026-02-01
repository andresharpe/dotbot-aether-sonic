package kotlinx.coroutines.internal;

import kotlin.C2210p;
import kotlin.H0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class I {

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.l<E, H0> f54444F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ E f54445G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.f f54446H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(X2.l<? super E, H0> lVar, E e4, kotlin.coroutines.f fVar) {
            super(1);
            this.f54444F = lVar;
            this.f54445G = e4;
            this.f54446H = fVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.d Throwable th) {
            I.b(this.f54444F, this.f54445G, this.f54446H);
        }
    }

    @l3.d
    public static final <E> X2.l<Throwable, H0> a(@l3.d X2.l<? super E, H0> lVar, E e4, @l3.d kotlin.coroutines.f fVar) {
        return new a(lVar, e4, fVar);
    }

    public static final <E> void b(@l3.d X2.l<? super E, H0> lVar, E e4, @l3.d kotlin.coroutines.f fVar) {
        UndeliveredElementException c4 = c(lVar, e4, null);
        if (c4 != null) {
            kotlinx.coroutines.Q.b(fVar, c4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    public static final <E> UndeliveredElementException c(@l3.d X2.l<? super E, H0> lVar, E e4, @l3.e UndeliveredElementException undeliveredElementException) {
        try {
            lVar.C(e4);
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                C2210p.a(undeliveredElementException, th);
            } else {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e4, th);
            }
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(X2.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
