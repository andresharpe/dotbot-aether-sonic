package kotlin.jvm.internal;

import java.util.List;
import kotlin.collections.C2108v;
import kotlin.reflect.KVariance;

@kotlin.Y(version = "1.4")
@U({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes2.dex */
public final class Y implements kotlin.reflect.s {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f52311J = new a(null);

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final Object f52312E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final String f52313F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final KVariance f52314G;

    /* renamed from: H, reason: collision with root package name */
    private final boolean f52315H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private volatile List<? extends kotlin.reflect.r> f52316I;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: kotlin.jvm.internal.Y$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0467a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52317a;

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
                f52317a = iArr;
            }
        }

        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a(@l3.d kotlin.reflect.s typeParameter) {
            F.p(typeParameter, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i4 = C0467a.f52317a[typeParameter.n().ordinal()];
            if (i4 != 2) {
                if (i4 == 3) {
                    sb.append("out ");
                }
            } else {
                sb.append("in ");
            }
            sb.append(typeParameter.getName());
            String sb2 = sb.toString();
            F.o(sb2, "toString(...)");
            return sb2;
        }

        private a() {
        }
    }

    public Y(@l3.e Object obj, @l3.d String name, @l3.d KVariance variance, boolean z3) {
        F.p(name, "name");
        F.p(variance, "variance");
        this.f52312E = obj;
        this.f52313F = name;
        this.f52314G = variance;
        this.f52315H = z3;
    }

    public static /* synthetic */ void a() {
    }

    public final void b(@l3.d List<? extends kotlin.reflect.r> upperBounds) {
        F.p(upperBounds, "upperBounds");
        if (this.f52316I == null) {
            this.f52316I = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof Y) {
            Y y3 = (Y) obj;
            if (F.g(this.f52312E, y3.f52312E) && F.g(getName(), y3.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.s
    public boolean g() {
        return this.f52315H;
    }

    @Override // kotlin.reflect.s
    @l3.d
    public String getName() {
        return this.f52313F;
    }

    @Override // kotlin.reflect.s
    @l3.d
    public List<kotlin.reflect.r> getUpperBounds() {
        List<kotlin.reflect.r> k4;
        List list = this.f52316I;
        if (list == null) {
            k4 = C2108v.k(N.n(Object.class));
            this.f52316I = k4;
            return k4;
        }
        return list;
    }

    public int hashCode() {
        int i4;
        Object obj = this.f52312E;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return (i4 * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.s
    @l3.d
    public KVariance n() {
        return this.f52314G;
    }

    @l3.d
    public String toString() {
        return f52311J.a(this);
    }
}
