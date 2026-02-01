package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.e
    public final Object f52926a;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.d
    public final X2.l<Throwable, kotlin.H0> f52927b;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@l3.e Object obj, @l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        this.f52926a = obj;
        this.f52927b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ F d(F f4, Object obj, X2.l lVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = f4.f52926a;
        }
        if ((i4 & 2) != 0) {
            lVar = f4.f52927b;
        }
        return f4.c(obj, lVar);
    }

    @l3.e
    public final Object a() {
        return this.f52926a;
    }

    @l3.d
    public final X2.l<Throwable, kotlin.H0> b() {
        return this.f52927b;
    }

    @l3.d
    public final F c(@l3.e Object obj, @l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        return new F(obj, lVar);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return kotlin.jvm.internal.F.g(this.f52926a, f4.f52926a) && kotlin.jvm.internal.F.g(this.f52927b, f4.f52927b);
    }

    public int hashCode() {
        Object obj = this.f52926a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f52927b.hashCode();
    }

    @l3.d
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f52926a + ", onCancellation=" + this.f52927b + ')';
    }
}
