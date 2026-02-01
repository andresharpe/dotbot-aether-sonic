package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;
import kotlin.U;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@Y(version = "1.1")
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f52508c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final t f52509d = new t(null, null);

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final KVariance f52510a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final r f52511b;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @U
        public static /* synthetic */ void d() {
        }

        @W2.n
        @l3.d
        public final t a(@l3.d r type) {
            F.p(type, "type");
            return new t(KVariance.IN, type);
        }

        @W2.n
        @l3.d
        public final t b(@l3.d r type) {
            F.p(type, "type");
            return new t(KVariance.OUT, type);
        }

        @l3.d
        public final t c() {
            return t.f52509d;
        }

        @W2.n
        @l3.d
        public final t e(@l3.d r type) {
            F.p(type, "type");
            return new t(KVariance.INVARIANT, type);
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52512a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52512a = iArr;
        }
    }

    public t(@l3.e KVariance kVariance, @l3.e r rVar) {
        boolean z3;
        String str;
        this.f52510a = kVariance;
        this.f52511b = rVar;
        if (kVariance == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == (rVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @W2.n
    @l3.d
    public static final t c(@l3.d r rVar) {
        return f52508c.a(rVar);
    }

    public static /* synthetic */ t e(t tVar, KVariance kVariance, r rVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            kVariance = tVar.f52510a;
        }
        if ((i4 & 2) != 0) {
            rVar = tVar.f52511b;
        }
        return tVar.d(kVariance, rVar);
    }

    @W2.n
    @l3.d
    public static final t f(@l3.d r rVar) {
        return f52508c.b(rVar);
    }

    @W2.n
    @l3.d
    public static final t i(@l3.d r rVar) {
        return f52508c.e(rVar);
    }

    @l3.e
    public final KVariance a() {
        return this.f52510a;
    }

    @l3.e
    public final r b() {
        return this.f52511b;
    }

    @l3.d
    public final t d(@l3.e KVariance kVariance, @l3.e r rVar) {
        return new t(kVariance, rVar);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f52510a == tVar.f52510a && F.g(this.f52511b, tVar.f52511b);
    }

    @l3.e
    public final r g() {
        return this.f52511b;
    }

    @l3.e
    public final KVariance h() {
        return this.f52510a;
    }

    public int hashCode() {
        KVariance kVariance = this.f52510a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        r rVar = this.f52511b;
        return hashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    @l3.d
    public String toString() {
        int i4;
        KVariance kVariance = this.f52510a;
        if (kVariance == null) {
            i4 = -1;
        } else {
            i4 = b.f52512a[kVariance.ordinal()];
        }
        if (i4 != -1) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return "out " + this.f52511b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "in " + this.f52511b;
            }
            return String.valueOf(this.f52511b);
        }
        return "*";
    }
}
