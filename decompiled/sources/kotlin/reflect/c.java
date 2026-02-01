package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.Y;

/* loaded from: classes2.dex */
public interface c<R> extends b {

    /* loaded from: classes2.dex */
    public static final class a {
        @kotlin.internal.g
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

        @Y(version = "1.3")
        public static /* synthetic */ void g() {
        }
    }

    R R(@l3.d Map<KParameter, ? extends Object> map);

    @l3.e
    KVisibility c();

    boolean d();

    @l3.d
    List<KParameter> e();

    @l3.d
    List<s> f();

    @l3.d
    String getName();

    boolean isOpen();

    boolean j();

    @l3.d
    r j0();

    boolean l();

    R t0(@l3.d Object... objArr);
}
