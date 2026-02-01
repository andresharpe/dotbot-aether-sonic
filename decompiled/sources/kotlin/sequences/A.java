package kotlin.sequences;

import java.util.Iterator;
import kotlin.D0;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.p0;
import kotlin.t0;
import kotlin.x0;

/* loaded from: classes2.dex */
class A {
    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUByte")
    @Y(version = "1.5")
    public static final int a(@l3.d m<p0> mVar) {
        F.p(mVar, "<this>");
        Iterator<p0> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = t0.l(i4 + t0.l(it.next().j0() & 255));
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @Y(version = "1.5")
    public static final int b(@l3.d m<t0> mVar) {
        F.p(mVar, "<this>");
        Iterator<t0> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = t0.l(i4 + it.next().l0());
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @Y(version = "1.5")
    public static final long c(@l3.d m<x0> mVar) {
        F.p(mVar, "<this>");
        Iterator<x0> it = mVar.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 = x0.l(j4 + it.next().l0());
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUShort")
    @Y(version = "1.5")
    public static final int d(@l3.d m<D0> mVar) {
        F.p(mVar, "<this>");
        Iterator<D0> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = t0.l(i4 + t0.l(it.next().j0() & D0.f51794H));
        }
        return i4;
    }
}
