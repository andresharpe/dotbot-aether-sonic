package com.harman.jbl.partybox.ui.lightshowbutton;

import com.harman.jbl.partybox.j;
import com.harman.sdk.utils.LightPattern;
import f2.C2054a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final d f44050a = new d();

    private d() {
    }

    private final List<C2054a> a() {
        List<C2054a> O3;
        O3 = CollectionsKt__CollectionsKt.O(new C2054a(LightPattern.ROCK, j.m.c9, j.f.w7, true), new C2054a(LightPattern.FLOW, j.m.y7, j.f.o7, true), new C2054a(LightPattern.CROSS, j.m.J6, j.f.g7, true), new C2054a(LightPattern.RIPPLE, j.m.b9, j.f.s7, true), new C2054a(LightPattern.FLASH, j.m.x7, j.f.k7, true));
        return O3;
    }

    private final List<C2054a> b() {
        List<C2054a> O3;
        O3 = CollectionsKt__CollectionsKt.O(new C2054a(LightPattern.NEON, j.m.f41797o1, j.f.B5, true), new C2054a(LightPattern.LOOP, j.m.f41792n1, j.f.A5, true), new C2054a(LightPattern.BOUNCE, j.m.f41782l1, j.f.y5, true), new C2054a(LightPattern.TRIM, j.m.f41807q1, j.f.D5, true), new C2054a(LightPattern.SWITCH, j.m.f41802p1, j.f.C5, true), new C2054a(LightPattern.FREEZE, j.m.f41787m1, j.f.z5, true));
        return O3;
    }

    private final List<C2054a> c() {
        List<C2054a> O3;
        O3 = CollectionsKt__CollectionsKt.O(new C2054a(LightPattern.NEON, j.m.f41797o1, j.f.B5, true), new C2054a(LightPattern.LOOP, j.m.f41792n1, j.f.A5, true), new C2054a(LightPattern.BOUNCE, j.m.f41782l1, j.f.y5, true), new C2054a(LightPattern.TRIM, j.m.f41807q1, j.f.D5, true), new C2054a(LightPattern.SWITCH, j.m.f41802p1, j.f.C5, true), new C2054a(LightPattern.FREEZE, j.m.f41787m1, j.f.z5, true));
        return O3;
    }

    private final List<C2054a> d() {
        List<C2054a> O3;
        O3 = CollectionsKt__CollectionsKt.O(new C2054a(LightPattern.ROCK, j.m.c9, j.f.x7, true), new C2054a(LightPattern.FLOW, j.m.y7, j.f.p7, true), new C2054a(LightPattern.CROSS, j.m.J6, j.f.h7, true), new C2054a(LightPattern.RIPPLE, j.m.b9, j.f.t7, true), new C2054a(LightPattern.FLASH, j.m.x7, j.f.l7, true));
        return O3;
    }

    private final List<C2054a> e() {
        List<C2054a> O3;
        O3 = CollectionsKt__CollectionsKt.O(new C2054a(LightPattern.ROCK, j.m.c9, j.f.y7, true), new C2054a(LightPattern.FLOW, j.m.y7, j.f.q7, true), new C2054a(LightPattern.CROSS, j.m.J6, j.f.i7, true), new C2054a(LightPattern.RIPPLE, j.m.b9, j.f.u7, true), new C2054a(LightPattern.FLASH, j.m.x7, j.f.m7, true));
        return O3;
    }

    private final List<C2054a> f() {
        List<C2054a> O3;
        O3 = CollectionsKt__CollectionsKt.O(new C2054a(LightPattern.ROCK, j.m.c9, j.f.z7, true), new C2054a(LightPattern.FLOW, j.m.y7, j.f.r7, true), new C2054a(LightPattern.CROSS, j.m.J6, j.f.j7, true), new C2054a(LightPattern.RIPPLE, j.m.b9, j.f.v7, true), new C2054a(LightPattern.FLASH, j.m.x7, j.f.n7, true));
        return O3;
    }

    @l3.d
    public final List<C2054a> g(int i4) {
        List<C2054a> H3;
        if (i4 != 8031) {
            if (i4 != 8033) {
                if (i4 != 8413 && i4 != 8418 && i4 != 8472 && i4 != 8480 && i4 != 8494 && i4 != 8534 && i4 != 8539) {
                    if (i4 != 8290) {
                        if (i4 != 8291) {
                            H3 = CollectionsKt__CollectionsKt.H();
                            return H3;
                        }
                        return f();
                    }
                    return e();
                }
                return c();
            }
            return d();
        }
        return a();
    }
}
