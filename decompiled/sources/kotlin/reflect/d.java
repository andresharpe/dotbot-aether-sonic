package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.Y;

/* loaded from: classes2.dex */
public interface d<T> extends h, b, g {

    /* loaded from: classes2.dex */
    public static final class a {
        @Y(version = "1.3")
        public static /* synthetic */ void a() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void b() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void c() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void d() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void e() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void f() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void g() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void h() {
        }

        @Y(version = "1.4")
        public static /* synthetic */ void i() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void j() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void k() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void l() {
        }

        @Y(version = "1.5")
        public static /* synthetic */ void m() {
        }
    }

    @l3.d
    List<d<? extends T>> D();

    boolean H();

    boolean I();

    @l3.e
    String J();

    @l3.d
    List<r> L();

    @l3.e
    T O();

    boolean T();

    boolean X();

    @l3.e
    KVisibility c();

    boolean d();

    boolean equals(@l3.e Object obj);

    @l3.d
    List<s> f();

    @Y(version = "1.1")
    boolean g0(@l3.e Object obj);

    int hashCode();

    boolean isOpen();

    boolean j();

    @Override // kotlin.reflect.h
    @l3.d
    Collection<c<?>> m();

    @l3.e
    String o();

    @l3.d
    Collection<d<?>> q();

    boolean u0();

    @l3.d
    Collection<i<T>> v();

    boolean y();
}
