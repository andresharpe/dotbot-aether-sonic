package androidx.window.core;

import W2.n;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.A;
import kotlin.C;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.text.z;

/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f20742J = new a(null);

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final h f20743K = new h(0, 0, 0, "");

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private static final h f20744L = new h(0, 1, 0, "");

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private static final h f20745M;

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private static final h f20746N;

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final String f20747O = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* renamed from: E, reason: collision with root package name */
    private final int f20748E;

    /* renamed from: F, reason: collision with root package name */
    private final int f20749F;

    /* renamed from: G, reason: collision with root package name */
    private final int f20750G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final String f20751H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final A f20752I;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final h a() {
            return h.f20746N;
        }

        @l3.d
        public final h b() {
            return h.f20743K;
        }

        @l3.d
        public final h c() {
            return h.f20744L;
        }

        @l3.d
        public final h d() {
            return h.f20745M;
        }

        @n
        @l3.e
        public final h e(@l3.e String str) {
            boolean S12;
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            String str2;
            if (str != null) {
                S12 = z.S1(str);
                if (!S12) {
                    Matcher matcher = Pattern.compile(h.f20747O).matcher(str);
                    if (!matcher.matches()) {
                        return null;
                    }
                    String group = matcher.group(1);
                    if (group == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(Integer.parseInt(group));
                    }
                    if (valueOf == null) {
                        return null;
                    }
                    int intValue = valueOf.intValue();
                    String group2 = matcher.group(2);
                    if (group2 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(Integer.parseInt(group2));
                    }
                    if (valueOf2 == null) {
                        return null;
                    }
                    int intValue2 = valueOf2.intValue();
                    String group3 = matcher.group(3);
                    if (group3 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(Integer.parseInt(group3));
                    }
                    if (valueOf3 == null) {
                        return null;
                    }
                    int intValue3 = valueOf3.intValue();
                    if (matcher.group(4) != null) {
                        str2 = matcher.group(4);
                    } else {
                        str2 = "";
                    }
                    String description = str2;
                    F.o(description, "description");
                    return new h(intValue, intValue2, intValue3, description, null);
                }
            }
            return null;
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Lambda implements X2.a<BigInteger> {
        b() {
            super(0);
        }

        @Override // X2.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final BigInteger n() {
            return BigInteger.valueOf(h.this.l()).shiftLeft(32).or(BigInteger.valueOf(h.this.m())).shiftLeft(32).or(BigInteger.valueOf(h.this.n()));
        }
    }

    static {
        h hVar = new h(1, 0, 0, "");
        f20745M = hVar;
        f20746N = hVar;
    }

    public /* synthetic */ h(int i4, int i5, int i6, String str, C2197u c2197u) {
        this(i4, i5, i6, str);
    }

    private final BigInteger j() {
        Object value = this.f20752I.getValue();
        F.o(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @n
    @l3.e
    public static final h o(@l3.e String str) {
        return f20742J.e(str);
    }

    public boolean equals(@l3.e Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f20748E != hVar.f20748E || this.f20749F != hVar.f20749F || this.f20750G != hVar.f20750G) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.f20748E) * 31) + this.f20749F) * 31) + this.f20750G;
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(@l3.d h other) {
        F.p(other, "other");
        return j().compareTo(other.j());
    }

    @l3.d
    public final String k() {
        return this.f20751H;
    }

    public final int l() {
        return this.f20748E;
    }

    public final int m() {
        return this.f20749F;
    }

    public final int n() {
        return this.f20750G;
    }

    @l3.d
    public String toString() {
        boolean S12;
        String str;
        S12 = z.S1(this.f20751H);
        if (!S12) {
            str = F.C("-", this.f20751H);
        } else {
            str = "";
        }
        return this.f20748E + '.' + this.f20749F + '.' + this.f20750G + str;
    }

    private h(int i4, int i5, int i6, String str) {
        A a4;
        this.f20748E = i4;
        this.f20749F = i5;
        this.f20750G = i6;
        this.f20751H = str;
        a4 = C.a(new b());
        this.f20752I = a4;
    }
}
