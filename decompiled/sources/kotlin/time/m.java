package kotlin.time;

import kotlin.H0;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.time.r;

@U({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"})
/* loaded from: classes2.dex */
public final class m {
    @K0(markerClass = {k.class})
    @Y(version = "1.9")
    public static final long a(@l3.d X2.a<H0> block) {
        F.p(block, "block");
        long b4 = r.b.f52890b.b();
        block.n();
        return r.b.a.l(b4);
    }

    @K0(markerClass = {k.class})
    @Y(version = "1.9")
    public static final long b(@l3.d r.b bVar, @l3.d X2.a<H0> block) {
        F.p(bVar, "<this>");
        F.p(block, "block");
        long b4 = bVar.b();
        block.n();
        return r.b.a.l(b4);
    }

    @K0(markerClass = {k.class})
    @Y(version = "1.9")
    public static final long c(@l3.d r rVar, @l3.d X2.a<H0> block) {
        F.p(rVar, "<this>");
        F.p(block, "block");
        q a4 = rVar.a();
        block.n();
        return a4.e();
    }

    @l3.d
    @K0(markerClass = {k.class})
    @Y(version = "1.9")
    public static final <T> s<T> d(@l3.d X2.a<? extends T> block) {
        F.p(block, "block");
        return new s<>(block.n(), r.b.a.l(r.b.f52890b.b()), null);
    }

    @l3.d
    @K0(markerClass = {k.class})
    @Y(version = "1.9")
    public static final <T> s<T> e(@l3.d r.b bVar, @l3.d X2.a<? extends T> block) {
        F.p(bVar, "<this>");
        F.p(block, "block");
        return new s<>(block.n(), r.b.a.l(bVar.b()), null);
    }

    @l3.d
    @K0(markerClass = {k.class})
    @Y(version = "1.9")
    public static final <T> s<T> f(@l3.d r rVar, @l3.d X2.a<? extends T> block) {
        F.p(rVar, "<this>");
        F.p(block, "block");
        return new s<>(block.n(), rVar.a().e(), null);
    }
}
