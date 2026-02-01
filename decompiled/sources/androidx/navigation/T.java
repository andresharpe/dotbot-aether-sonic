package androidx.navigation;

import androidx.annotation.InterfaceC0558a;
import androidx.annotation.InterfaceC0559b;
import kotlin.InterfaceC2205l;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16334a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16335b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.D
    private final int f16336c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16337d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16338e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16339f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16340g;

    /* renamed from: h, reason: collision with root package name */
    private final int f16341h;

    /* renamed from: i, reason: collision with root package name */
    private final int f16342i;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private String f16343j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f16344a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16345b;

        /* renamed from: d, reason: collision with root package name */
        @l3.e
        private String f16347d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16348e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16349f;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.D
        private int f16346c = -1;

        /* renamed from: g, reason: collision with root package name */
        @InterfaceC0558a
        @InterfaceC0559b
        private int f16350g = -1;

        /* renamed from: h, reason: collision with root package name */
        @InterfaceC0558a
        @InterfaceC0559b
        private int f16351h = -1;

        /* renamed from: i, reason: collision with root package name */
        @InterfaceC0558a
        @InterfaceC0559b
        private int f16352i = -1;

        /* renamed from: j, reason: collision with root package name */
        @InterfaceC0558a
        @InterfaceC0559b
        private int f16353j = -1;

        public static /* synthetic */ a k(a aVar, int i4, boolean z3, boolean z4, int i5, Object obj) {
            if ((i5 & 4) != 0) {
                z4 = false;
            }
            return aVar.h(i4, z3, z4);
        }

        public static /* synthetic */ a l(a aVar, String str, boolean z3, boolean z4, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                z4 = false;
            }
            return aVar.j(str, z3, z4);
        }

        @l3.d
        public final T a() {
            String str = this.f16347d;
            if (str != null) {
                return new T(this.f16344a, this.f16345b, str, this.f16348e, this.f16349f, this.f16350g, this.f16351h, this.f16352i, this.f16353j);
            }
            return new T(this.f16344a, this.f16345b, this.f16346c, this.f16348e, this.f16349f, this.f16350g, this.f16351h, this.f16352i, this.f16353j);
        }

        @l3.d
        public final a b(@InterfaceC0558a @InterfaceC0559b int i4) {
            this.f16350g = i4;
            return this;
        }

        @l3.d
        public final a c(@InterfaceC0558a @InterfaceC0559b int i4) {
            this.f16351h = i4;
            return this;
        }

        @l3.d
        public final a d(boolean z3) {
            this.f16344a = z3;
            return this;
        }

        @l3.d
        public final a e(@InterfaceC0558a @InterfaceC0559b int i4) {
            this.f16352i = i4;
            return this;
        }

        @l3.d
        public final a f(@InterfaceC0558a @InterfaceC0559b int i4) {
            this.f16353j = i4;
            return this;
        }

        @W2.j
        @l3.d
        public final a g(@androidx.annotation.D int i4, boolean z3) {
            return k(this, i4, z3, false, 4, null);
        }

        @W2.j
        @l3.d
        public final a h(@androidx.annotation.D int i4, boolean z3, boolean z4) {
            this.f16346c = i4;
            this.f16347d = null;
            this.f16348e = z3;
            this.f16349f = z4;
            return this;
        }

        @W2.j
        @l3.d
        public final a i(@l3.e String str, boolean z3) {
            return l(this, str, z3, false, 4, null);
        }

        @W2.j
        @l3.d
        public final a j(@l3.e String str, boolean z3, boolean z4) {
            this.f16347d = str;
            this.f16346c = -1;
            this.f16348e = z3;
            this.f16349f = z4;
            return this;
        }

        @l3.d
        public final a m(boolean z3) {
            this.f16345b = z3;
            return this;
        }
    }

    public T(boolean z3, boolean z4, @androidx.annotation.D int i4, boolean z5, boolean z6, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        this.f16334a = z3;
        this.f16335b = z4;
        this.f16336c = i4;
        this.f16337d = z5;
        this.f16338e = z6;
        this.f16339f = i5;
        this.f16340g = i6;
        this.f16341h = i7;
        this.f16342i = i8;
    }

    @InterfaceC0558a
    @InterfaceC0559b
    public final int a() {
        return this.f16339f;
    }

    @InterfaceC0558a
    @InterfaceC0559b
    public final int b() {
        return this.f16340g;
    }

    @InterfaceC0558a
    @InterfaceC0559b
    public final int c() {
        return this.f16341h;
    }

    @InterfaceC0558a
    @InterfaceC0559b
    public final int d() {
        return this.f16342i;
    }

    @androidx.annotation.D
    @InterfaceC2205l(message = "Use popUpToId instead.", replaceWith = @kotlin.V(expression = "popUpToId", imports = {}))
    public final int e() {
        return this.f16336c;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.F.g(T.class, obj.getClass())) {
            return false;
        }
        T t3 = (T) obj;
        if (this.f16334a == t3.f16334a && this.f16335b == t3.f16335b && this.f16336c == t3.f16336c && kotlin.jvm.internal.F.g(this.f16343j, t3.f16343j) && this.f16337d == t3.f16337d && this.f16338e == t3.f16338e && this.f16339f == t3.f16339f && this.f16340g == t3.f16340g && this.f16341h == t3.f16341h && this.f16342i == t3.f16342i) {
            return true;
        }
        return false;
    }

    @androidx.annotation.D
    public final int f() {
        return this.f16336c;
    }

    @l3.e
    public final String g() {
        return this.f16343j;
    }

    public final boolean h() {
        return this.f16337d;
    }

    public int hashCode() {
        int hashCode;
        int i4 = (((((i() ? 1 : 0) * 31) + (k() ? 1 : 0)) * 31) + this.f16336c) * 31;
        String str = this.f16343j;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((((((i4 + hashCode) * 31) + (h() ? 1 : 0)) * 31) + (j() ? 1 : 0)) * 31) + this.f16339f) * 31) + this.f16340g) * 31) + this.f16341h) * 31) + this.f16342i;
    }

    public final boolean i() {
        return this.f16334a;
    }

    public final boolean j() {
        return this.f16338e;
    }

    public final boolean k() {
        return this.f16335b;
    }

    public T(boolean z3, boolean z4, @l3.e String str, boolean z5, boolean z6, int i4, int i5, int i6, int i7) {
        this(z3, z4, F.f16277N.a(str).hashCode(), z5, z6, i4, i5, i6, i7);
        this.f16343j = str;
    }
}
