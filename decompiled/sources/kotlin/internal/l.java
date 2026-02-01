package kotlin.internal;

import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.random.Random;

@U({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes2.dex */
public class l {

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f52095a = new a();

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.e
        public static final Method f52096b;

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.e
        public static final Method f52097c;

        static {
            Method method;
            Method method2;
            Object At;
            Method[] methods = Throwable.class.getMethods();
            F.m(methods);
            int length = methods.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                method = null;
                if (i5 < length) {
                    method2 = methods[i5];
                    if (F.g(method2.getName(), "addSuppressed")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        F.o(parameterTypes, "getParameterTypes(...)");
                        At = C2101p.At(parameterTypes);
                        if (F.g(At, Throwable.class)) {
                            break;
                        }
                    }
                    i5++;
                } else {
                    method2 = null;
                    break;
                }
            }
            f52096b = method2;
            int length2 = methods.length;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                Method method3 = methods[i4];
                if (F.g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i4++;
            }
            f52097c = method;
        }

        private a() {
        }
    }

    public void a(@l3.d Throwable cause, @l3.d Throwable exception) {
        F.p(cause, "cause");
        F.p(exception, "exception");
        Method method = a.f52096b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @l3.d
    public Random b() {
        return new kotlin.random.b();
    }

    @l3.e
    public kotlin.text.k c(@l3.d MatchResult matchResult, @l3.d String name) {
        F.p(matchResult, "matchResult");
        F.p(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r3 = kotlin.collections.C2100o.t((java.lang.Throwable[]) r3);
     */
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.Throwable> d(@l3.d java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.F.p(r3, r0)
            java.lang.reflect.Method r0 = kotlin.internal.l.a.f52097c
            if (r0 == 0) goto L1a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L1a
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = kotlin.collections.C2097l.t(r3)
            if (r3 != 0) goto L1e
        L1a:
            java.util.List r3 = kotlin.collections.C2107u.H()
        L1e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.l.d(java.lang.Throwable):java.util.List");
    }
}
