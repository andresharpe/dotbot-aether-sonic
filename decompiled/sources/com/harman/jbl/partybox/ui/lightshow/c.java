package com.harman.jbl.partybox.ui.lightshow;

import android.graphics.Color;
import c2.C1008a;
import com.harman.jbl.partybox.j;
import com.harman.log.f;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.LightPattern;
import f2.C2054a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;
import l3.d;

@U({"SMAP\nLightShowCardProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowCardProvider.kt\ncom/harman/jbl/partybox/ui/lightshow/LightShowCardProvider\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n13316#2,2:374\n819#3:376\n847#3,2:377\n1549#3:379\n1620#3,2:380\n1622#3:383\n1#4:382\n*S KotlinDebug\n*F\n+ 1 LightShowCardProvider.kt\ncom/harman/jbl/partybox/ui/lightshow/LightShowCardProvider\n*L\n160#1:374,2\n265#1:376\n265#1:377,2\n267#1:379\n267#1:380,2\n267#1:383\n*E\n"})
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: o, reason: collision with root package name */
    @d
    private static final String f43995o = "LightShowCardProvider";

    /* renamed from: a, reason: collision with root package name */
    @d
    private final C1008a f43997a = new C1008a(LightPattern.ROCK, j.m.c9, j.f.Y7, j.l.f41605k, new int[]{Color.parseColor("#FF00B6C1"), Color.parseColor("#FF00B2FF")}, false, 32, null);

    /* renamed from: b, reason: collision with root package name */
    @d
    private final C1008a f43998b = new C1008a(LightPattern.NEON, j.m.k8, j.f.U7, j.l.f41602h, new int[]{Color.parseColor("#FF649AFF"), Color.parseColor("#FFA5DCD2")}, false, 32, null);

    /* renamed from: c, reason: collision with root package name */
    @d
    private final C1008a f43999c = new C1008a(LightPattern.FLOW, j.m.y7, j.f.T7, j.l.f41601g, new int[]{Color.parseColor("#FFFE5762"), Color.parseColor("#FFEC7D50")}, false, 32, null);

    /* renamed from: d, reason: collision with root package name */
    @d
    private final C1008a f44000d = new C1008a(LightPattern.CLUB, j.m.C6, j.f.Q7, j.l.f41598d, new int[]{Color.parseColor("#FFFF409C"), Color.parseColor("#FF2C80FF")}, false, 32, null);

    /* renamed from: e, reason: collision with root package name */
    @d
    private final C1008a f44001e = new C1008a(LightPattern.CROSS, j.m.J6, j.f.R7, j.l.f41599e, new int[]{Color.parseColor("#FFFF409C"), Color.parseColor("#FF2C80FF")}, false, 32, null);

    /* renamed from: f, reason: collision with root package name */
    @d
    private final C1008a f44002f = new C1008a(LightPattern.RIPPLE, j.m.b9, j.f.X7, j.l.f41604j, new int[]{Color.parseColor("#FFF87255"), Color.parseColor("#FFECD350")}, false, 32, null);

    /* renamed from: g, reason: collision with root package name */
    @d
    private final C1008a f44003g = new C1008a(LightPattern.FLASH, j.m.x7, j.f.S7, j.l.f41600f, new int[]{Color.parseColor("#FF649AFF"), Color.parseColor("#FFA5DCD2")}, false, 32, null);

    /* renamed from: h, reason: collision with root package name */
    @d
    private final C1008a f44004h = new C1008a(LightPattern.CUSTOM, j.m.S8, j.f.V7, j.l.f41603i, new int[]{Color.parseColor("#6B96FF"), Color.parseColor("#D75AAD"), Color.parseColor("#F9BA18")}, false, 32, null);

    /* renamed from: i, reason: collision with root package name */
    @d
    private final C1008a f44005i = new C1008a(LightPattern.LOOP, j.m.f41792n1, j.f.A5, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 32, null);

    /* renamed from: j, reason: collision with root package name */
    @d
    private final C1008a f44006j = new C1008a(LightPattern.BOUNCE, j.m.f41782l1, j.f.y5, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 32, null);

    /* renamed from: k, reason: collision with root package name */
    @d
    private final C1008a f44007k = new C1008a(LightPattern.TRIM, j.m.f41807q1, j.f.D5, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 32, null);

    /* renamed from: l, reason: collision with root package name */
    @d
    private final C1008a f44008l = new C1008a(LightPattern.SWITCH, j.m.f41802p1, j.f.C5, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 32, null);

    /* renamed from: m, reason: collision with root package name */
    @d
    private final C1008a f44009m = new C1008a(LightPattern.FREEZE, j.m.f41787m1, j.f.z5, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 32, null);

    /* renamed from: n, reason: collision with root package name */
    @d
    public static final a f43994n = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @d
    private static final c f43996p = new c();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final c a() {
            return c.f43996p;
        }

        private a() {
        }
    }

    private c() {
    }

    private final List<C1008a> d() {
        List<C1008a> O3;
        O3 = CollectionsKt__CollectionsKt.O(this.f43997a, this.f43999c, this.f44001e, this.f44002f, this.f44003g);
        return O3;
    }

    private final List<C1008a> e() {
        List<C1008a> O3;
        O3 = CollectionsKt__CollectionsKt.O(this.f43997a, this.f43998b, this.f44000d, this.f43999c, this.f44002f);
        return O3;
    }

    private final List<C1008a> f() {
        List<C1008a> O3;
        O3 = CollectionsKt__CollectionsKt.O(C1008a.h(this.f43998b, null, j.m.f41797o1, j.f.B5, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 33, null), this.f44005i, this.f44006j, this.f44007k, this.f44008l, this.f44009m);
        return O3;
    }

    private final List<C1008a> g() {
        List<C1008a> O3;
        O3 = CollectionsKt__CollectionsKt.O(this.f43997a, this.f43999c, this.f44001e, this.f44002f, this.f44003g, this.f44004h);
        return O3;
    }

    private final List<C1008a> h() {
        List<C1008a> O3;
        O3 = CollectionsKt__CollectionsKt.O(this.f43997a, this.f43999c, this.f44001e, this.f44002f, this.f44003g);
        return O3;
    }

    private final List<C1008a> i() {
        List<C1008a> O3;
        O3 = CollectionsKt__CollectionsKt.O(this.f43997a, this.f43999c, this.f44001e, this.f44002f, this.f44003g);
        return O3;
    }

    private final List<C1008a> j(String str) {
        T1.a.a("LightShowCardProvider getLightShowCardListFromSupportPatternId " + str);
        byte[] l4 = l(str);
        ArrayList arrayList = new ArrayList();
        for (byte b4 : l4) {
            if (b4 == LightPattern.ROCK.g()) {
                arrayList.add(this.f43997a);
            } else if (b4 == LightPattern.NEON.g()) {
                arrayList.add(C1008a.h(this.f43998b, null, j.m.f41797o1, j.f.B5, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 33, null));
            } else if (b4 == LightPattern.CLUB.g()) {
                arrayList.add(this.f44000d);
            } else if (b4 == LightPattern.FLOW.g()) {
                arrayList.add(this.f43999c);
            } else if (b4 == LightPattern.RIPPLE.g()) {
                arrayList.add(this.f44002f);
            } else if (b4 == LightPattern.CROSS.g()) {
                arrayList.add(this.f44001e);
            } else if (b4 == LightPattern.FLASH.g()) {
                arrayList.add(this.f44003g);
            } else if (b4 == LightPattern.CUSTOM.g()) {
                arrayList.add(C1008a.h(this.f44004h, null, 0, j.f.W7, 0, new int[]{Color.parseColor("#FF212736"), Color.parseColor("#FF212736")}, false, 35, null));
            } else if (b4 == LightPattern.LOOP.g()) {
                arrayList.add(this.f44005i);
            } else if (b4 == LightPattern.BOUNCE.g()) {
                arrayList.add(this.f44006j);
            } else if (b4 == LightPattern.TRIM.g()) {
                arrayList.add(this.f44007k);
            } else if (b4 == LightPattern.SWITCH.g()) {
                arrayList.add(this.f44008l);
            } else if (b4 == LightPattern.FREEZE.g()) {
                arrayList.add(this.f44009m);
            }
        }
        T1.a.a("LightShowCardProvider getLightShowCardListFromSupportPatternId return " + arrayList);
        return arrayList;
    }

    private final List<C1008a> k(int i4) {
        T1.a.a("LightShowCardProvider getSupportedLightShowCards " + i4);
        if (i4 != 8029) {
            if (i4 != 8031) {
                if (i4 != 8033) {
                    if (i4 != 8413 && i4 != 8418 && i4 != 8472 && i4 != 8480 && i4 != 8494 && i4 != 8534 && i4 != 8539) {
                        if (i4 != 8290) {
                            if (i4 != 8291) {
                                return f();
                            }
                            return i();
                        }
                        return h();
                    }
                    return f();
                }
                return g();
            }
            return d();
        }
        return e();
    }

    private final byte[] l(String str) {
        int a4;
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            String substring = str.substring(i5, i5 + 2);
            F.o(substring, "substring(...)");
            a4 = C2220b.a(16);
            bArr[i4] = (byte) Integer.parseInt(substring, a4);
        }
        return bArr;
    }

    @d
    public final List<C2054a> b(@d PartyBoxDevice device) {
        int a4;
        List<C1008a> k4;
        int b02;
        List<C2054a> Y5;
        C2054a c2054a;
        List<LightPattern> f4;
        Object obj;
        String n4;
        F.p(device, "device");
        f.a(f43995o, "getLightShowButtonData called ");
        PartyBoxLightShowSettings h12 = device.h1();
        if (h12 == null || (n4 = h12.n()) == null || (k4 = j(n4)) == null) {
            String q4 = device.q();
            a4 = C2220b.a(16);
            k4 = k(Integer.parseInt(q4, a4));
        }
        ArrayList<C1008a> arrayList = new ArrayList();
        for (Object obj2 : k4) {
            if (((C1008a) obj2).j() != LightPattern.CUSTOM) {
                arrayList.add(obj2);
            }
        }
        b02 = C2109w.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (C1008a c1008a : arrayList) {
            if (h12 != null && (f4 = h12.f()) != null) {
                Iterator<T> it = f4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((LightPattern) obj) == c1008a.j()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (((LightPattern) obj) != null) {
                    c2054a = new C2054a(c1008a.j(), c1008a.m(), c1008a.l(), false);
                    arrayList2.add(c2054a);
                }
            }
            c2054a = new C2054a(c1008a.j(), c1008a.m(), c1008a.l(), true);
            arrayList2.add(c2054a);
        }
        Y5 = D.Y5(arrayList2);
        return Y5;
    }

    @d
    public final List<C1008a> c(@d PartyBoxDevice device) {
        int a4;
        String n4;
        List<C1008a> j4;
        F.p(device, "device");
        f.a(f43995o, "getLightShowCardList called ");
        PartyBoxLightShowSettings h12 = device.h1();
        if (h12 == null || (n4 = h12.n()) == null || (j4 = j(n4)) == null) {
            String q4 = device.q();
            a4 = C2220b.a(16);
            return k(Integer.parseInt(q4, a4));
        }
        return j4;
    }
}
