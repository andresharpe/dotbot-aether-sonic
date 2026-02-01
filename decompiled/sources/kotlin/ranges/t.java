package kotlin.ranges;

import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class t {
    public static final void a(boolean z3, @l3.d Number step) {
        F.p(step, "step");
        if (z3) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/g<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final boolean b(g gVar, Object obj) {
        F.p(gVar, "<this>");
        if (obj != null && gVar.b((Comparable) obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/r<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final boolean c(r rVar, Object obj) {
        F.p(rVar, "<this>");
        if (obj != null && rVar.b((Comparable) obj)) {
            return true;
        }
        return false;
    }

    @l3.d
    @Y(version = "1.1")
    public static final f<Double> d(double d4, double d5) {
        return new d(d4, d5);
    }

    @l3.d
    @Y(version = "1.1")
    public static final f<Float> e(float f4, float f5) {
        return new e(f4, f5);
    }

    @l3.d
    public static final <T extends Comparable<? super T>> g<T> f(@l3.d T t3, @l3.d T that) {
        F.p(t3, "<this>");
        F.p(that, "that");
        return new i(t3, that);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.9")
    public static final r<Double> g(double d4, double d5) {
        return new p(d4, d5);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.9")
    public static final r<Float> h(float f4, float f5) {
        return new q(f4, f5);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.9")
    public static final <T extends Comparable<? super T>> r<T> i(@l3.d T t3, @l3.d T that) {
        F.p(t3, "<this>");
        F.p(that, "that");
        return new h(t3, that);
    }
}
