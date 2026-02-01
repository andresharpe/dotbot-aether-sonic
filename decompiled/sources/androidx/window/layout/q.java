package androidx.window.layout;

import kotlin.jvm.internal.C2197u;

/* loaded from: classes.dex */
public interface q extends l {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final C0189a f20860b = new C0189a(null);

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final a f20861c = new a("NONE");

        /* renamed from: d, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final a f20862d = new a("FULL");

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final String f20863a;

        /* renamed from: androidx.window.layout.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0189a {
            public /* synthetic */ C0189a(C2197u c2197u) {
                this();
            }

            private C0189a() {
            }
        }

        private a(String str) {
            this.f20863a = str;
        }

        @l3.d
        public String toString() {
            return this.f20863a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final a f20864b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final b f20865c = new b("VERTICAL");

        /* renamed from: d, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final b f20866d = new b("HORIZONTAL");

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final String f20867a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            private a() {
            }
        }

        private b(String str) {
            this.f20867a = str;
        }

        @l3.d
        public String toString() {
            return this.f20867a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final a f20868b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final c f20869c = new c("FLAT");

        /* renamed from: d, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final c f20870d = new c("HALF_OPENED");

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final String f20871a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            private a() {
            }
        }

        private c(String str) {
            this.f20871a = str;
        }

        @l3.d
        public String toString() {
            return this.f20871a;
        }
    }

    boolean a();

    @l3.d
    a b();

    @l3.d
    b c();

    @l3.d
    c getState();
}
