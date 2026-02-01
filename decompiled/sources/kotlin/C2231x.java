package kotlin;

import kotlin.jvm.internal.C2197u;

@Y(version = "1.1")
/* renamed from: kotlin.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2231x implements Comparable<C2231x> {

    /* renamed from: J, reason: collision with root package name */
    public static final int f52898J = 255;

    /* renamed from: E, reason: collision with root package name */
    private final int f52900E;

    /* renamed from: F, reason: collision with root package name */
    private final int f52901F;

    /* renamed from: G, reason: collision with root package name */
    private final int f52902G;

    /* renamed from: H, reason: collision with root package name */
    private final int f52903H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f52897I = new a(null);

    /* renamed from: K, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final C2231x f52899K = C2232y.a();

    /* renamed from: kotlin.x$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public C2231x(int i4, int i5, int i6) {
        this.f52900E = i4;
        this.f52901F = i5;
        this.f52902G = i6;
        this.f52903H = k(i4, i5, i6);
    }

    private final int k(int i4, int i5, int i6) {
        if (new kotlin.ranges.l(0, 255).q(i4) && new kotlin.ranges.l(0, 255).q(i5) && new kotlin.ranges.l(0, 255).q(i6)) {
            return (i4 << 16) + (i5 << 8) + i6;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + '.' + i5 + '.' + i6).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@l3.d C2231x other) {
        kotlin.jvm.internal.F.p(other, "other");
        return this.f52903H - other.f52903H;
    }

    public final int e() {
        return this.f52900E;
    }

    public boolean equals(@l3.e Object obj) {
        C2231x c2231x;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2231x) {
            c2231x = (C2231x) obj;
        } else {
            c2231x = null;
        }
        if (c2231x != null && this.f52903H == c2231x.f52903H) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f52901F;
    }

    public final int g() {
        return this.f52902G;
    }

    public int hashCode() {
        return this.f52903H;
    }

    public final boolean i(int i4, int i5) {
        int i6 = this.f52900E;
        if (i6 <= i4 && (i6 != i4 || this.f52901F < i5)) {
            return false;
        }
        return true;
    }

    public final boolean j(int i4, int i5, int i6) {
        int i7;
        int i8 = this.f52900E;
        if (i8 <= i4 && (i8 != i4 || ((i7 = this.f52901F) <= i5 && (i7 != i5 || this.f52902G < i6)))) {
            return false;
        }
        return true;
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52900E);
        sb.append('.');
        sb.append(this.f52901F);
        sb.append('.');
        sb.append(this.f52902G);
        return sb.toString();
    }

    public C2231x(int i4, int i5) {
        this(i4, i5, 0);
    }
}
