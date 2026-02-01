package f3;

import W2.i;
import java.time.Duration;
import kotlin.K0;
import kotlin.Y;
import kotlin.internal.f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.g;
import kotlin.time.k;

@i(name = "DurationConversionsJDK8Kt")
@U({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
/* loaded from: classes2.dex */
public final class d {
    @K0(markerClass = {k.class})
    @Y(version = "1.6")
    @f
    private static final Duration a(long j4) {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(e.P(j4), e.T(j4));
        F.o(ofSeconds, "toComponents-impl(...)");
        return ofSeconds;
    }

    @K0(markerClass = {k.class})
    @Y(version = "1.6")
    @f
    private static final long b(Duration duration) {
        long seconds;
        int nano;
        F.p(duration, "<this>");
        seconds = duration.getSeconds();
        long n02 = g.n0(seconds, DurationUnit.SECONDS);
        nano = duration.getNano();
        return e.h0(n02, g.m0(nano, DurationUnit.NANOSECONDS));
    }
}
