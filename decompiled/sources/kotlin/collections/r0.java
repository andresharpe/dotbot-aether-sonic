package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.D0;
import kotlin.E0;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.t0;
import kotlin.u0;
import kotlin.x0;
import kotlin.y0;

/* loaded from: classes2.dex */
class r0 {
    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUByte")
    @kotlin.Y(version = "1.5")
    public static final int a(@l3.d Iterable<kotlin.p0> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<kotlin.p0> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = t0.l(i4 + t0.l(it.next().j0() & 255));
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.Y(version = "1.5")
    public static final int b(@l3.d Iterable<t0> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<t0> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = t0.l(i4 + it.next().l0());
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.Y(version = "1.5")
    public static final long c(@l3.d Iterable<x0> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<x0> it = iterable.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 = x0.l(j4 + it.next().l0());
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUShort")
    @kotlin.Y(version = "1.5")
    public static final int d(@l3.d Iterable<D0> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<D0> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = t0.l(i4 + t0.l(it.next().j0() & D0.f51794H));
        }
        return i4;
    }

    @l3.d
    @InterfaceC2218t
    @kotlin.Y(version = "1.3")
    public static final byte[] e(@l3.d Collection<kotlin.p0> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        byte[] d4 = kotlin.q0.d(collection.size());
        Iterator<kotlin.p0> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            kotlin.q0.w(d4, i4, it.next().j0());
            i4++;
        }
        return d4;
    }

    @l3.d
    @InterfaceC2218t
    @kotlin.Y(version = "1.3")
    public static final int[] f(@l3.d Collection<t0> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        int[] d4 = u0.d(collection.size());
        Iterator<t0> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            u0.w(d4, i4, it.next().l0());
            i4++;
        }
        return d4;
    }

    @l3.d
    @InterfaceC2218t
    @kotlin.Y(version = "1.3")
    public static final long[] g(@l3.d Collection<x0> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        long[] d4 = y0.d(collection.size());
        Iterator<x0> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            y0.w(d4, i4, it.next().l0());
            i4++;
        }
        return d4;
    }

    @l3.d
    @InterfaceC2218t
    @kotlin.Y(version = "1.3")
    public static final short[] h(@l3.d Collection<D0> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        short[] d4 = E0.d(collection.size());
        Iterator<D0> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            E0.w(d4, i4, it.next().j0());
            i4++;
        }
        return d4;
    }
}
