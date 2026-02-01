package kotlin.text;

import java.util.List;

/* loaded from: classes2.dex */
public interface n {

    /* loaded from: classes2.dex */
    public static final class a {
        @l3.d
        public static b a(@l3.d n nVar) {
            return new b(nVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final n f52847a;

        public b(@l3.d n match) {
            kotlin.jvm.internal.F.p(match, "match");
            this.f52847a = match;
        }

        @kotlin.internal.f
        private final String a() {
            return k().b().get(1);
        }

        @kotlin.internal.f
        private final String b() {
            return k().b().get(10);
        }

        @kotlin.internal.f
        private final String c() {
            return k().b().get(2);
        }

        @kotlin.internal.f
        private final String d() {
            return k().b().get(3);
        }

        @kotlin.internal.f
        private final String e() {
            return k().b().get(4);
        }

        @kotlin.internal.f
        private final String f() {
            return k().b().get(5);
        }

        @kotlin.internal.f
        private final String g() {
            return k().b().get(6);
        }

        @kotlin.internal.f
        private final String h() {
            return k().b().get(7);
        }

        @kotlin.internal.f
        private final String i() {
            return k().b().get(8);
        }

        @kotlin.internal.f
        private final String j() {
            return k().b().get(9);
        }

        @l3.d
        public final n k() {
            return this.f52847a;
        }

        @l3.d
        public final List<String> l() {
            return this.f52847a.b().subList(1, this.f52847a.b().size());
        }
    }

    @l3.d
    b a();

    @l3.d
    List<String> b();

    @l3.d
    l c();

    @l3.d
    kotlin.ranges.l d();

    @l3.d
    String getValue();

    @l3.e
    n next();
}
