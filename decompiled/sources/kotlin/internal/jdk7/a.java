package kotlin.internal.jdk7;

import W2.f;
import java.util.List;
import kotlin.collections.C2100o;
import kotlin.internal.l;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public class a extends l {

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: kotlin.internal.jdk7.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0463a {

        /* renamed from: a, reason: collision with root package name */
        @d
        public static final C0463a f52091a = new C0463a();

        /* renamed from: b, reason: collision with root package name */
        @f
        @e
        public static final Integer f52092b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f52092b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f52092b = num2;
        }

        private C0463a() {
        }
    }

    private final boolean e(int i4) {
        Integer num = C0463a.f52092b;
        if (num != null && num.intValue() < i4) {
            return false;
        }
        return true;
    }

    @Override // kotlin.internal.l
    public void a(@d Throwable cause, @d Throwable exception) {
        F.p(cause, "cause");
        F.p(exception, "exception");
        if (e(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // kotlin.internal.l
    @d
    public List<Throwable> d(@d Throwable exception) {
        List<Throwable> t3;
        F.p(exception, "exception");
        if (e(19)) {
            Throwable[] suppressed = exception.getSuppressed();
            F.o(suppressed, "getSuppressed(...)");
            t3 = C2100o.t(suppressed);
            return t3;
        }
        return super.d(exception);
    }
}
