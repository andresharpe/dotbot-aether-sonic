package kotlinx.coroutines;

import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.e
    public final Object f52918a;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.e
    public final AbstractC2329o f52919b;

    /* renamed from: c, reason: collision with root package name */
    @W2.f
    @l3.e
    public final X2.l<Throwable, kotlin.H0> f52920c;

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    @l3.e
    public final Object f52921d;

    /* renamed from: e, reason: collision with root package name */
    @W2.f
    @l3.e
    public final Throwable f52922e;

    public /* synthetic */ D(Object obj, AbstractC2329o abstractC2329o, X2.l lVar, Object obj2, Throwable th, int i4, C2197u c2197u) {
        this(obj, (i4 & 2) != 0 ? null : abstractC2329o, (i4 & 4) != 0 ? null : lVar, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ D g(D d4, Object obj, AbstractC2329o abstractC2329o, X2.l lVar, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = d4.f52918a;
        }
        if ((i4 & 2) != 0) {
            abstractC2329o = d4.f52919b;
        }
        AbstractC2329o abstractC2329o2 = abstractC2329o;
        if ((i4 & 4) != 0) {
            lVar = d4.f52920c;
        }
        X2.l lVar2 = lVar;
        if ((i4 & 8) != 0) {
            obj2 = d4.f52921d;
        }
        Object obj4 = obj2;
        if ((i4 & 16) != 0) {
            th = d4.f52922e;
        }
        return d4.f(obj, abstractC2329o2, lVar2, obj4, th);
    }

    @l3.e
    public final Object a() {
        return this.f52918a;
    }

    @l3.e
    public final AbstractC2329o b() {
        return this.f52919b;
    }

    @l3.e
    public final X2.l<Throwable, kotlin.H0> c() {
        return this.f52920c;
    }

    @l3.e
    public final Object d() {
        return this.f52921d;
    }

    @l3.e
    public final Throwable e() {
        return this.f52922e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return kotlin.jvm.internal.F.g(this.f52918a, d4.f52918a) && kotlin.jvm.internal.F.g(this.f52919b, d4.f52919b) && kotlin.jvm.internal.F.g(this.f52920c, d4.f52920c) && kotlin.jvm.internal.F.g(this.f52921d, d4.f52921d) && kotlin.jvm.internal.F.g(this.f52922e, d4.f52922e);
    }

    @l3.d
    public final D f(@l3.e Object obj, @l3.e AbstractC2329o abstractC2329o, @l3.e X2.l<? super Throwable, kotlin.H0> lVar, @l3.e Object obj2, @l3.e Throwable th) {
        return new D(obj, abstractC2329o, lVar, obj2, th);
    }

    public final boolean h() {
        if (this.f52922e != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f52918a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC2329o abstractC2329o = this.f52919b;
        int hashCode2 = (hashCode + (abstractC2329o == null ? 0 : abstractC2329o.hashCode())) * 31;
        X2.l<Throwable, kotlin.H0> lVar = this.f52920c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f52921d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f52922e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void i(@l3.d r<?> rVar, @l3.d Throwable th) {
        AbstractC2329o abstractC2329o = this.f52919b;
        if (abstractC2329o != null) {
            rVar.n(abstractC2329o, th);
        }
        X2.l<Throwable, kotlin.H0> lVar = this.f52920c;
        if (lVar != null) {
            rVar.r(lVar, th);
        }
    }

    @l3.d
    public String toString() {
        return "CompletedContinuation(result=" + this.f52918a + ", cancelHandler=" + this.f52919b + ", onCancellation=" + this.f52920c + ", idempotentResume=" + this.f52921d + ", cancelCause=" + this.f52922e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D(@l3.e Object obj, @l3.e AbstractC2329o abstractC2329o, @l3.e X2.l<? super Throwable, kotlin.H0> lVar, @l3.e Object obj2, @l3.e Throwable th) {
        this.f52918a = obj;
        this.f52919b = abstractC2329o;
        this.f52920c = lVar;
        this.f52921d = obj2;
        this.f52922e = th;
    }
}
