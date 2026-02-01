package kotlin.internal.jdk8;

import W2.f;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.random.Random;
import kotlin.ranges.l;
import kotlin.text.k;
import l3.e;

/* loaded from: classes2.dex */
public class d extends kotlin.internal.jdk7.a {

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f52093a = new a();

        /* renamed from: b, reason: collision with root package name */
        @f
        @e
        public static final Integer f52094b;

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
                f52094b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f52094b = num2;
        }

        private a() {
        }
    }

    private final boolean e(int i4) {
        Integer num = a.f52094b;
        if (num != null && num.intValue() < i4) {
            return false;
        }
        return true;
    }

    @Override // kotlin.internal.l
    @l3.d
    public Random b() {
        if (e(34)) {
            return new c3.a();
        }
        return super.b();
    }

    @Override // kotlin.internal.l
    @e
    public k c(@l3.d MatchResult matchResult, @l3.d String name) {
        Matcher matcher;
        int start;
        int end;
        String group;
        F.p(matchResult, "matchResult");
        F.p(name, "name");
        if (matchResult instanceof Matcher) {
            matcher = (Matcher) matchResult;
        } else {
            matcher = null;
        }
        if (matcher != null) {
            start = matcher.start(name);
            end = matcher.end(name);
            l lVar = new l(start, end - 1);
            if (lVar.c().intValue() >= 0) {
                group = matcher.group(name);
                F.o(group, "group(...)");
                return new k(group, lVar);
            }
            return null;
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
