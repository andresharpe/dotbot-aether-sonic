package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.KVariance;

@kotlin.Y(version = "1.4")
/* loaded from: classes2.dex */
public final class Z implements kotlin.reflect.r {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f52318I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    public static final int f52319J = 1;

    /* renamed from: K, reason: collision with root package name */
    public static final int f52320K = 2;

    /* renamed from: L, reason: collision with root package name */
    public static final int f52321L = 4;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.reflect.g f52322E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final List<kotlin.reflect.t> f52323F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private final kotlin.reflect.r f52324G;

    /* renamed from: H, reason: collision with root package name */
    private final int f52325H;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52326a;

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
            f52326a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<kotlin.reflect.t, CharSequence> {
        c() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence C(@l3.d kotlin.reflect.t it) {
            F.p(it, "it");
            return Z.this.n(it);
        }
    }

    @kotlin.Y(version = "1.6")
    public Z(@l3.d kotlin.reflect.g classifier, @l3.d List<kotlin.reflect.t> arguments, @l3.e kotlin.reflect.r rVar, int i4) {
        F.p(classifier, "classifier");
        F.p(arguments, "arguments");
        this.f52322E = classifier;
        this.f52323F = arguments;
        this.f52324G = rVar;
        this.f52325H = i4;
    }

    @kotlin.Y(version = "1.6")
    public static /* synthetic */ void B() {
    }

    @kotlin.Y(version = "1.6")
    public static /* synthetic */ void E() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(kotlin.reflect.t tVar) {
        Z z3;
        String valueOf;
        if (tVar.h() == null) {
            return "*";
        }
        kotlin.reflect.r g4 = tVar.g();
        if (g4 instanceof Z) {
            z3 = (Z) g4;
        } else {
            z3 = null;
        }
        if (z3 == null || (valueOf = z3.p(true)) == null) {
            valueOf = String.valueOf(tVar.g());
        }
        int i4 = b.f52326a[tVar.h().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return "out " + valueOf;
                }
                throw new NoWhenBranchMatchedException();
            }
            return "in " + valueOf;
        }
        return valueOf;
    }

    private final String p(boolean z3) {
        kotlin.reflect.d dVar;
        String name;
        String m32;
        kotlin.reflect.g e02 = e0();
        Class<?> cls = null;
        if (e02 instanceof kotlin.reflect.d) {
            dVar = (kotlin.reflect.d) e02;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            cls = W2.b.e(dVar);
        }
        if (cls == null) {
            name = e0().toString();
        } else if ((this.f52325H & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            name = t(cls);
        } else if (z3 && cls.isPrimitive()) {
            kotlin.reflect.g e03 = e0();
            F.n(e03, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = W2.b.g((kotlin.reflect.d) e03).getName();
        } else {
            name = cls.getName();
        }
        String str = "";
        if (!h().isEmpty()) {
            m32 = kotlin.collections.D.m3(h(), ", ", "<", ">", 0, null, new c(), 24, null);
        } else {
            m32 = "";
        }
        if (A()) {
            str = "?";
        }
        String str2 = name + m32 + str;
        kotlin.reflect.r rVar = this.f52324G;
        if (rVar instanceof Z) {
            String p4 = ((Z) rVar).p(true);
            if (!F.g(p4, str2)) {
                if (F.g(p4, str2 + '?')) {
                    return str2 + '!';
                }
                return '(' + str2 + ".." + p4 + ')';
            }
            return str2;
        }
        return str2;
    }

    private final String t(Class<?> cls) {
        if (F.g(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (F.g(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (F.g(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (F.g(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (F.g(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (F.g(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (F.g(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        if (F.g(cls, double[].class)) {
            return "kotlin.DoubleArray";
        }
        return "kotlin.Array";
    }

    @Override // kotlin.reflect.r
    public boolean A() {
        if ((this.f52325H & 1) != 0) {
            return true;
        }
        return false;
    }

    @l3.e
    public final kotlin.reflect.r C() {
        return this.f52324G;
    }

    @Override // kotlin.reflect.r
    @l3.d
    public kotlin.reflect.g e0() {
        return this.f52322E;
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof Z) {
            Z z3 = (Z) obj;
            if (F.g(e0(), z3.e0()) && F.g(h(), z3.h()) && F.g(this.f52324G, z3.f52324G) && this.f52325H == z3.f52325H) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.r
    @l3.d
    public List<kotlin.reflect.t> h() {
        return this.f52323F;
    }

    public int hashCode() {
        return (((e0().hashCode() * 31) + h().hashCode()) * 31) + Integer.hashCode(this.f52325H);
    }

    @Override // kotlin.reflect.b
    @l3.d
    public List<Annotation> i() {
        List<Annotation> H3;
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @l3.d
    public String toString() {
        return p(false) + " (Kotlin reflection is not available)";
    }

    public final int z() {
        return this.f52325H;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z(@l3.d kotlin.reflect.g classifier, @l3.d List<kotlin.reflect.t> arguments, boolean z3) {
        this(classifier, arguments, null, z3 ? 1 : 0);
        F.p(classifier, "classifier");
        F.p(arguments, "arguments");
    }
}
