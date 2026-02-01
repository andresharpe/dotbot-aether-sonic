package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.C1815b;
import com.google.firebase.crashlytics.internal.model.c;
import com.google.firebase.crashlytics.internal.model.d;
import com.google.firebase.crashlytics.internal.model.e;
import com.google.firebase.crashlytics.internal.model.f;
import com.google.firebase.crashlytics.internal.model.g;
import com.google.firebase.crashlytics.internal.model.h;
import com.google.firebase.crashlytics.internal.model.i;
import com.google.firebase.crashlytics.internal.model.j;
import com.google.firebase.crashlytics.internal.model.k;
import com.google.firebase.crashlytics.internal.model.l;
import com.google.firebase.crashlytics.internal.model.m;
import com.google.firebase.crashlytics.internal.model.n;
import com.google.firebase.crashlytics.internal.model.o;
import com.google.firebase.crashlytics.internal.model.p;
import com.google.firebase.crashlytics.internal.model.q;
import com.google.firebase.crashlytics.internal.model.r;
import com.google.firebase.crashlytics.internal.model.s;
import com.google.firebase.crashlytics.internal.model.t;
import com.google.firebase.crashlytics.internal.model.u;
import com.google.firebase.crashlytics.internal.model.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import w1.InterfaceC2431a;

@AutoValue
@InterfaceC2431a
/* loaded from: classes2.dex */
public abstract class CrashlyticsReport {

    /* renamed from: a, reason: collision with root package name */
    public static final String f35267a = "Unity";

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f35268b = Charset.forName("UTF-8");

    /* loaded from: classes2.dex */
    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @AutoValue
    /* loaded from: classes2.dex */
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static abstract class AbstractC0314a {
            @N
            public abstract a a();

            @N
            public abstract AbstractC0314a b(@N int i4);

            @N
            public abstract AbstractC0314a c(@N int i4);

            @N
            public abstract AbstractC0314a d(@N String str);

            @N
            public abstract AbstractC0314a e(@N long j4);

            @N
            public abstract AbstractC0314a f(@N int i4);

            @N
            public abstract AbstractC0314a g(@N long j4);

            @N
            public abstract AbstractC0314a h(@N long j4);

            @N
            public abstract AbstractC0314a i(@P String str);
        }

        @N
        public static AbstractC0314a a() {
            return new c.b();
        }

        @N
        public abstract int b();

        @N
        public abstract int c();

        @N
        public abstract String d();

        @N
        public abstract long e();

        @N
        public abstract int f();

        @N
        public abstract long g();

        @N
        public abstract long h();

        @P
        public abstract String i();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {

        /* renamed from: L, reason: collision with root package name */
        public static final int f35269L = 5;

        /* renamed from: M, reason: collision with root package name */
        public static final int f35270M = 6;

        /* renamed from: N, reason: collision with root package name */
        public static final int f35271N = 9;

        /* renamed from: O, reason: collision with root package name */
        public static final int f35272O = 0;

        /* renamed from: P, reason: collision with root package name */
        public static final int f35273P = 1;

        /* renamed from: Q, reason: collision with root package name */
        public static final int f35274Q = 7;
    }

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class c {
        @N
        public abstract CrashlyticsReport a();

        @N
        public abstract c b(@N String str);

        @N
        public abstract c c(@N String str);

        @N
        public abstract c d(@N String str);

        @N
        public abstract c e(@N String str);

        @N
        public abstract c f(e eVar);

        @N
        public abstract c g(int i4);

        @N
        public abstract c h(@N String str);

        @N
        public abstract c i(@N f fVar);
    }

    @AutoValue
    /* loaded from: classes2.dex */
    public static abstract class d {

        @AutoValue.Builder
        /* loaded from: classes2.dex */
        public static abstract class a {
            @N
            public abstract d a();

            @N
            public abstract a b(@N String str);

            @N
            public abstract a c(@N String str);
        }

        @N
        public static a a() {
            return new d.b();
        }

        @N
        public abstract String b();

        @N
        public abstract String c();
    }

    @AutoValue
    /* loaded from: classes2.dex */
    public static abstract class e {

        @AutoValue.Builder
        /* loaded from: classes2.dex */
        public static abstract class a {
            public abstract e a();

            public abstract a b(A<b> a4);

            public abstract a c(String str);
        }

        @AutoValue
        /* loaded from: classes2.dex */
        public static abstract class b {

            @AutoValue.Builder
            /* loaded from: classes2.dex */
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            @N
            public static a a() {
                return new f.b();
            }

            @N
            public abstract byte[] b();

            @N
            public abstract String c();
        }

        @N
        public static a a() {
            return new e.b();
        }

        @N
        public abstract A<b> b();

        @P
        public abstract String c();

        abstract a d();
    }

    @AutoValue
    /* loaded from: classes2.dex */
    public static abstract class f {

        @AutoValue
        /* loaded from: classes2.dex */
        public static abstract class a {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static abstract class AbstractC0315a {
                @N
                public abstract a a();

                @N
                public abstract AbstractC0315a b(@P String str);

                @N
                public abstract AbstractC0315a c(@P String str);

                @N
                public abstract AbstractC0315a d(@N String str);

                @N
                public abstract AbstractC0315a e(@N String str);

                @N
                public abstract AbstractC0315a f(@N String str);

                @N
                public abstract AbstractC0315a g(@N b bVar);

                @N
                public abstract AbstractC0315a h(@N String str);
            }

            @AutoValue
            /* loaded from: classes2.dex */
            public static abstract class b {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static abstract class AbstractC0316a {
                    @N
                    public abstract b a();

                    @N
                    public abstract AbstractC0316a b(@N String str);
                }

                @N
                public static AbstractC0316a a() {
                    return new i.b();
                }

                @N
                public abstract String b();

                @N
                protected abstract AbstractC0316a c();
            }

            @N
            public static AbstractC0315a a() {
                return new h.b();
            }

            @P
            public abstract String b();

            @P
            public abstract String c();

            @P
            public abstract String d();

            @N
            public abstract String e();

            @P
            public abstract String f();

            @P
            public abstract b g();

            @N
            public abstract String h();

            @N
            protected abstract AbstractC0315a i();

            @N
            a j(@N String str) {
                b.AbstractC0316a a4;
                b g4 = g();
                if (g4 != null) {
                    a4 = g4.c();
                } else {
                    a4 = b.a();
                }
                return i().g(a4.b(str).a()).a();
            }
        }

        @AutoValue.Builder
        /* loaded from: classes2.dex */
        public static abstract class b {
            @N
            public abstract f a();

            @N
            public abstract b b(@N a aVar);

            @N
            public abstract b c(boolean z3);

            @N
            public abstract b d(@N c cVar);

            @N
            public abstract b e(@N Long l4);

            @N
            public abstract b f(@N A<d> a4);

            @N
            public abstract b g(@N String str);

            @N
            public abstract b h(int i4);

            @N
            public abstract b i(@N String str);

            @N
            public b j(@N byte[] bArr) {
                return i(new String(bArr, CrashlyticsReport.f35268b));
            }

            @N
            public abstract b k(@N e eVar);

            @N
            public abstract b l(long j4);

            @N
            public abstract b m(@N AbstractC0328f abstractC0328f);
        }

        @AutoValue
        /* loaded from: classes2.dex */
        public static abstract class c {

            @AutoValue.Builder
            /* loaded from: classes2.dex */
            public static abstract class a {
                @N
                public abstract c a();

                @N
                public abstract a b(int i4);

                @N
                public abstract a c(int i4);

                @N
                public abstract a d(long j4);

                @N
                public abstract a e(@N String str);

                @N
                public abstract a f(@N String str);

                @N
                public abstract a g(@N String str);

                @N
                public abstract a h(long j4);

                @N
                public abstract a i(boolean z3);

                @N
                public abstract a j(int i4);
            }

            @N
            public static a a() {
                return new j.b();
            }

            @N
            public abstract int b();

            public abstract int c();

            public abstract long d();

            @N
            public abstract String e();

            @N
            public abstract String f();

            @N
            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @AutoValue
        /* loaded from: classes2.dex */
        public static abstract class d {

            @AutoValue
            /* loaded from: classes2.dex */
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$a, reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static abstract class AbstractC0317a {
                    @N
                    public abstract a a();

                    @N
                    public abstract AbstractC0317a b(@P Boolean bool);

                    @N
                    public abstract AbstractC0317a c(@N A<d> a4);

                    @N
                    public abstract AbstractC0317a d(@N b bVar);

                    @N
                    public abstract AbstractC0317a e(@N A<d> a4);

                    @N
                    public abstract AbstractC0317a f(int i4);
                }

                @AutoValue
                /* loaded from: classes2.dex */
                public static abstract class b {

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$a, reason: collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static abstract class AbstractC0318a {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$a$a, reason: collision with other inner class name */
                        /* loaded from: classes2.dex */
                        public static abstract class AbstractC0319a {
                            @N
                            public abstract AbstractC0318a a();

                            @N
                            public abstract AbstractC0319a b(long j4);

                            @N
                            public abstract AbstractC0319a c(@N String str);

                            @N
                            public abstract AbstractC0319a d(long j4);

                            @N
                            public abstract AbstractC0319a e(@P String str);

                            @N
                            public AbstractC0319a f(@N byte[] bArr) {
                                return e(new String(bArr, CrashlyticsReport.f35268b));
                            }
                        }

                        @N
                        public static AbstractC0319a a() {
                            return new n.b();
                        }

                        @N
                        public abstract long b();

                        @N
                        public abstract String c();

                        public abstract long d();

                        @P
                        @InterfaceC2431a.b
                        public abstract String e();

                        @P
                        @InterfaceC2431a.InterfaceC0549a(name = "uuid")
                        public byte[] f() {
                            String e4 = e();
                            if (e4 != null) {
                                return e4.getBytes(CrashlyticsReport.f35268b);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$b, reason: collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static abstract class AbstractC0320b {
                        @N
                        public abstract b a();

                        @N
                        public abstract AbstractC0320b b(@N a aVar);

                        @N
                        public abstract AbstractC0320b c(@N A<AbstractC0318a> a4);

                        @N
                        public abstract AbstractC0320b d(@N c cVar);

                        @N
                        public abstract AbstractC0320b e(@N AbstractC0322d abstractC0322d);

                        @N
                        public abstract AbstractC0320b f(@N A<e> a4);
                    }

                    @AutoValue
                    /* loaded from: classes2.dex */
                    public static abstract class c {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$c$a, reason: collision with other inner class name */
                        /* loaded from: classes2.dex */
                        public static abstract class AbstractC0321a {
                            @N
                            public abstract c a();

                            @N
                            public abstract AbstractC0321a b(@N c cVar);

                            @N
                            public abstract AbstractC0321a c(@N A<e.AbstractC0325b> a4);

                            @N
                            public abstract AbstractC0321a d(int i4);

                            @N
                            public abstract AbstractC0321a e(@N String str);

                            @N
                            public abstract AbstractC0321a f(@N String str);
                        }

                        @N
                        public static AbstractC0321a a() {
                            return new o.b();
                        }

                        @P
                        public abstract c b();

                        @N
                        public abstract A<e.AbstractC0325b> c();

                        public abstract int d();

                        @P
                        public abstract String e();

                        @N
                        public abstract String f();
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d, reason: collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static abstract class AbstractC0322d {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d$a, reason: collision with other inner class name */
                        /* loaded from: classes2.dex */
                        public static abstract class AbstractC0323a {
                            @N
                            public abstract AbstractC0322d a();

                            @N
                            public abstract AbstractC0323a b(long j4);

                            @N
                            public abstract AbstractC0323a c(@N String str);

                            @N
                            public abstract AbstractC0323a d(@N String str);
                        }

                        @N
                        public static AbstractC0323a a() {
                            return new p.b();
                        }

                        @N
                        public abstract long b();

                        @N
                        public abstract String c();

                        @N
                        public abstract String d();
                    }

                    @AutoValue
                    /* loaded from: classes2.dex */
                    public static abstract class e {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$a, reason: collision with other inner class name */
                        /* loaded from: classes2.dex */
                        public static abstract class AbstractC0324a {
                            @N
                            public abstract e a();

                            @N
                            public abstract AbstractC0324a b(@N A<AbstractC0325b> a4);

                            @N
                            public abstract AbstractC0324a c(int i4);

                            @N
                            public abstract AbstractC0324a d(@N String str);
                        }

                        @AutoValue
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$b, reason: collision with other inner class name */
                        /* loaded from: classes2.dex */
                        public static abstract class AbstractC0325b {

                            @AutoValue.Builder
                            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$b$a, reason: collision with other inner class name */
                            /* loaded from: classes2.dex */
                            public static abstract class AbstractC0326a {
                                @N
                                public abstract AbstractC0325b a();

                                @N
                                public abstract AbstractC0326a b(@N String str);

                                @N
                                public abstract AbstractC0326a c(int i4);

                                @N
                                public abstract AbstractC0326a d(long j4);

                                @N
                                public abstract AbstractC0326a e(long j4);

                                @N
                                public abstract AbstractC0326a f(@N String str);
                            }

                            @N
                            public static AbstractC0326a a() {
                                return new r.b();
                            }

                            @P
                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            @N
                            public abstract String f();
                        }

                        @N
                        public static AbstractC0324a a() {
                            return new q.b();
                        }

                        @N
                        public abstract A<AbstractC0325b> b();

                        public abstract int c();

                        @N
                        public abstract String d();
                    }

                    @N
                    public static AbstractC0320b a() {
                        return new m.b();
                    }

                    @P
                    public abstract a b();

                    @N
                    public abstract A<AbstractC0318a> c();

                    @P
                    public abstract c d();

                    @N
                    public abstract AbstractC0322d e();

                    @P
                    public abstract A<e> f();
                }

                @N
                public static AbstractC0317a a() {
                    return new l.b();
                }

                @P
                public abstract Boolean b();

                @P
                public abstract A<d> c();

                @N
                public abstract b d();

                @P
                public abstract A<d> e();

                public abstract int f();

                @N
                public abstract AbstractC0317a g();
            }

            @AutoValue.Builder
            /* loaded from: classes2.dex */
            public static abstract class b {
                @N
                public abstract d a();

                @N
                public abstract b b(@N a aVar);

                @N
                public abstract b c(@N c cVar);

                @N
                public abstract b d(@N AbstractC0327d abstractC0327d);

                @N
                public abstract b e(long j4);

                @N
                public abstract b f(@N String str);
            }

            @AutoValue
            /* loaded from: classes2.dex */
            public static abstract class c {

                @AutoValue.Builder
                /* loaded from: classes2.dex */
                public static abstract class a {
                    @N
                    public abstract c a();

                    @N
                    public abstract a b(Double d4);

                    @N
                    public abstract a c(int i4);

                    @N
                    public abstract a d(long j4);

                    @N
                    public abstract a e(int i4);

                    @N
                    public abstract a f(boolean z3);

                    @N
                    public abstract a g(long j4);
                }

                @N
                public static a a() {
                    return new s.b();
                }

                @P
                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$d, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static abstract class AbstractC0327d {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$d$a */
                /* loaded from: classes2.dex */
                public static abstract class a {
                    @N
                    public abstract AbstractC0327d a();

                    @N
                    public abstract a b(@N String str);
                }

                @N
                public static a a() {
                    return new t.b();
                }

                @N
                public abstract String b();
            }

            @N
            public static b a() {
                return new k.b();
            }

            @N
            public abstract a b();

            @N
            public abstract c c();

            @P
            public abstract AbstractC0327d d();

            public abstract long e();

            @N
            public abstract String f();

            @N
            public abstract b g();
        }

        @AutoValue
        /* loaded from: classes2.dex */
        public static abstract class e {

            @AutoValue.Builder
            /* loaded from: classes2.dex */
            public static abstract class a {
                @N
                public abstract e a();

                @N
                public abstract a b(@N String str);

                @N
                public abstract a c(boolean z3);

                @N
                public abstract a d(int i4);

                @N
                public abstract a e(@N String str);
            }

            @N
            public static a a() {
                return new u.b();
            }

            @N
            public abstract String b();

            public abstract int c();

            @N
            public abstract String d();

            public abstract boolean e();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static abstract class AbstractC0328f {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f$a */
            /* loaded from: classes2.dex */
            public static abstract class a {
                @N
                public abstract AbstractC0328f a();

                @N
                public abstract a b(@N String str);
            }

            @N
            public static a a() {
                return new v.b();
            }

            @N
            public abstract String b();
        }

        @N
        public static b a() {
            return new g.b().c(false);
        }

        @N
        public abstract a b();

        @P
        public abstract c c();

        @P
        public abstract Long d();

        @P
        public abstract A<d> e();

        @N
        public abstract String f();

        public abstract int g();

        @N
        @InterfaceC2431a.b
        public abstract String h();

        @InterfaceC2431a.InterfaceC0549a(name = "identifier")
        @N
        public byte[] i() {
            return h().getBytes(CrashlyticsReport.f35268b);
        }

        @P
        public abstract e j();

        public abstract long k();

        @P
        public abstract AbstractC0328f l();

        public abstract boolean m();

        @N
        public abstract b n();

        @N
        f o(@N A<d> a4) {
            return n().f(a4).a();
        }

        @N
        f p(@N String str) {
            return n().b(b().j(str)).a();
        }

        @N
        f q(long j4, boolean z3, @P String str) {
            b n4 = n();
            n4.e(Long.valueOf(j4));
            n4.c(z3);
            if (str != null) {
                n4.m(AbstractC0328f.a().b(str).a()).a();
            }
            return n4.a();
        }
    }

    @N
    public static c b() {
        return new C1815b.C0330b();
    }

    @N
    public abstract String c();

    @N
    public abstract String d();

    @N
    public abstract String e();

    @N
    public abstract String f();

    @P
    public abstract e g();

    public abstract int h();

    @N
    public abstract String i();

    @P
    public abstract f j();

    @InterfaceC2431a.b
    public Type k() {
        if (j() != null) {
            return Type.JAVA;
        }
        if (g() != null) {
            return Type.NATIVE;
        }
        return Type.INCOMPLETE;
    }

    @N
    protected abstract c l();

    @N
    public CrashlyticsReport m(@N A<f.d> a4) {
        if (j() != null) {
            return l().i(j().o(a4)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @N
    public CrashlyticsReport n(@N e eVar) {
        return l().i(null).f(eVar).a();
    }

    @N
    public CrashlyticsReport o(@N String str) {
        c l4 = l();
        e g4 = g();
        if (g4 != null) {
            l4.f(g4.d().c(str).a());
        }
        f j4 = j();
        if (j4 != null) {
            l4.i(j4.p(str));
        }
        return l4.a();
    }

    @N
    public CrashlyticsReport p(long j4, boolean z3, @P String str) {
        c l4 = l();
        if (j() != null) {
            l4.i(j().q(j4, z3, str));
        }
        return l4.a();
    }
}
