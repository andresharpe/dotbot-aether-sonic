package com.harman.jbl.partybox.ui.lightcontrol;

import a2.AbstractC0557b;
import a2.C0556a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0669d;
import com.harman.jbl.partybox.j;
import com.harman.sdk.utils.LightElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2108v;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;

@U({"SMAP\nLightElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightElementProvider.kt\ncom/harman/jbl/partybox/ui/lightcontrol/LightElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1855#2,2:355\n*S KotlinDebug\n*F\n+ 1 LightElementProvider.kt\ncom/harman/jbl/partybox/ui/lightcontrol/LightElementProvider\n*L\n120#1:355,2\n*E\n"})
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    @d
    public static final a f43945j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @d
    private static final String f43946k = "LightElementProvider";

    /* renamed from: a, reason: collision with root package name */
    @d
    private final a2.c f43947a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final a2.c f43948b;

    /* renamed from: c, reason: collision with root package name */
    @d
    private final a2.c f43949c;

    /* renamed from: d, reason: collision with root package name */
    @d
    private final a2.c f43950d;

    /* renamed from: e, reason: collision with root package name */
    @d
    private final a2.c f43951e;

    /* renamed from: f, reason: collision with root package name */
    @d
    private final a2.c f43952f;

    /* renamed from: g, reason: collision with root package name */
    @d
    private final a2.c f43953g;

    /* renamed from: h, reason: collision with root package name */
    @d
    private final a2.c f43954h;

    /* renamed from: i, reason: collision with root package name */
    @d
    private final a2.c f43955i;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43956a;

        static {
            int[] iArr = new int[LightElements.values().length];
            try {
                iArr[LightElements.LIGHT_EIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LightElements.LIGHT_STRIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LightElements.LIGHT_SIDE_RING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LightElements.LIGHT_STAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f43956a = iArr;
        }
    }

    public c() {
        LightElements lightElements = LightElements.LIGHT_EIGHT;
        this.f43947a = new a2.c(lightElements, j.f.U6, false);
        this.f43948b = new a2.c(lightElements, j.f.S6, false);
        this.f43949c = new a2.c(LightElements.LIGHT_SIDE_RING, j.f.V6, false);
        this.f43950d = new a2.c(LightElements.LIGHT_STRIPE, j.f.W6, false);
        this.f43951e = new a2.c(LightElements.LIGHT_STAR, j.f.Y6, false);
        this.f43952f = new a2.c(LightElements.LIGHT_STROBE, j.f.a7, false);
        this.f43953g = new a2.c(LightElements.LIGHT_STROBE_UP, j.f.f7, false);
        this.f43954h = new a2.c(LightElements.LIGHT_STROBE_DOWN, j.f.b7, false);
        this.f43955i = new a2.c(LightElements.LIGHT_EDGE, j.f.O6, false);
    }

    private final Drawable a(Context context, int i4) {
        T1.a.a("LightElementProvider getDeviceLightBody " + i4);
        if (i4 != 8029) {
            if (i4 != 8031) {
                if (i4 != 8033) {
                    if (i4 != 8290) {
                        if (i4 != 8291) {
                            return null;
                        }
                        return C0669d.i(context, j.f.J9);
                    }
                    return C0669d.i(context, j.f.I9);
                }
                return C0669d.i(context, j.f.C9);
            }
            return C0669d.i(context, j.f.v9);
        }
        return C0669d.i(context, j.f.z9);
    }

    private final Drawable c(Context context, int i4) {
        T1.a.a("LightElementProvider getDeviceLightElementRing " + i4);
        if (i4 != 8029) {
            if (i4 != 8031) {
                if (i4 != 8033) {
                    if (i4 != 8290) {
                        if (i4 != 8291) {
                            return null;
                        }
                        return C0669d.i(context, j.f.L9);
                    }
                    return C0669d.i(context, j.f.L9);
                }
                return C0669d.i(context, j.f.D9);
            }
            return C0669d.i(context, j.f.w9);
        }
        return C0669d.i(context, j.f.A9);
    }

    private final Drawable d(Context context, int i4) {
        if (i4 == 8031) {
            return C0669d.i(context, j.f.x9);
        }
        return null;
    }

    private final Drawable e(Context context, int i4) {
        if (i4 == 8033) {
            return C0669d.i(context, j.f.F9);
        }
        return null;
    }

    private final Drawable f(Context context, int i4) {
        if (i4 != 8033) {
            if (i4 != 8290) {
                return null;
            }
            return C0669d.i(context, j.f.M9);
        }
        return C0669d.i(context, j.f.E9);
    }

    private final Drawable g(Context context, int i4) {
        T1.a.a("LightElementProvider getDeviceLightElementStrobe " + i4);
        if (i4 != 8029) {
            if (i4 != 8031) {
                if (i4 != 8290) {
                    if (i4 != 8291) {
                        return null;
                    }
                    return C0669d.i(context, j.f.K9);
                }
                return C0669d.i(context, j.f.N9);
            }
            return C0669d.i(context, j.f.y9);
        }
        return C0669d.i(context, j.f.B9);
    }

    private final Drawable h(Context context, int i4) {
        if (i4 == 8033) {
            return C0669d.i(context, j.f.G9);
        }
        return null;
    }

    private final Drawable i(Context context, int i4) {
        if (i4 == 8033) {
            return C0669d.i(context, j.f.H9);
        }
        return null;
    }

    private final List<AbstractC0557b> j() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(a2.c.e(this.f43948b, null, j.f.M6, false, 5, null), a2.c.e(this.f43952f, null, j.f.c7, false, 5, null), a2.c.e(this.f43955i, null, j.f.P6, false, 5, null));
        return s4;
    }

    private final List<AbstractC0557b> k() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(a2.c.e(this.f43948b, null, j.f.M6, false, 5, null), a2.c.e(this.f43952f, null, j.f.c7, false, 5, null));
        return s4;
    }

    private final List<AbstractC0557b> l() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(a2.c.e(this.f43948b, null, j.f.N6, false, 5, null), a2.c.e(this.f43952f, null, j.f.e7, false, 5, null), a2.c.e(this.f43955i, null, j.f.R6, false, 5, null));
        return s4;
    }

    private final List<AbstractC0557b> m() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(this.f43948b, this.f43949c, this.f43952f);
        return s4;
    }

    private final List<AbstractC0557b> n() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(C0556a.f3837a, this.f43947a, this.f43952f);
        return s4;
    }

    private final List<AbstractC0557b> o() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(a2.c.e(this.f43948b, null, j.f.T6, false, 5, null), a2.c.e(this.f43949c, null, j.f.Z6, false, 5, null), a2.c.e(this.f43952f, null, j.f.d7, false, 5, null), a2.c.e(this.f43955i, null, j.f.Q6, false, 5, null));
        return s4;
    }

    private final List<AbstractC0557b> p() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(C0556a.f3837a, this.f43948b, this.f43950d, this.f43951e, this.f43953g, this.f43954h);
        return s4;
    }

    private final List<AbstractC0557b> q() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(a2.c.e(this.f43948b, null, j.f.T6, false, 5, null), a2.c.e(this.f43949c, null, j.f.Z6, false, 5, null), a2.c.e(this.f43952f, null, j.f.d7, false, 5, null), a2.c.e(this.f43955i, null, j.f.Q6, false, 5, null), a2.c.e(this.f43950d, null, j.f.X6, false, 5, null));
        return s4;
    }

    private final List<AbstractC0557b> r() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(this.f43947a, this.f43950d, this.f43952f);
        return s4;
    }

    private final List<AbstractC0557b> s() {
        ArrayList s4;
        s4 = CollectionsKt__CollectionsKt.s(C0556a.f3837a, this.f43947a, this.f43952f);
        return s4;
    }

    @d
    public final List<Drawable> b(@d Context context, int i4, @d List<? extends LightElements> lightElements) {
        List<Drawable> s22;
        F.p(context, "context");
        F.p(lightElements, "lightElements");
        T1.a.a("LightElementProvider getDeviceLightElementDrawable " + i4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(context, i4));
        if (!lightElements.isEmpty()) {
            Iterator<T> it = lightElements.iterator();
            while (it.hasNext()) {
                switch (b.f43956a[((LightElements) it.next()).ordinal()]) {
                    case 1:
                        arrayList.add(c(context, i4));
                        break;
                    case 2:
                        arrayList.add(g(context, i4));
                        break;
                    case 3:
                        arrayList.add(f(context, i4));
                        break;
                    case 4:
                        arrayList.add(d(context, i4));
                        break;
                    case 5:
                        arrayList.add(e(context, i4));
                        break;
                    case 6:
                        arrayList.add(i(context, i4));
                        break;
                    case 7:
                        arrayList.add(h(context, i4));
                        break;
                }
            }
        }
        s22 = D.s2(arrayList);
        return s22;
    }

    @d
    public final List<AbstractC0557b> t(int i4) {
        List<AbstractC0557b> k4;
        T1.a.a("LightElementProvider getSupportedLightElements " + i4);
        switch (i4) {
            case com.harman.sdk.utils.c.f48435d /* 8029 */:
                return n();
            case com.harman.sdk.utils.c.f48434c /* 8031 */:
                return m();
            case com.harman.sdk.utils.c.f48436e /* 8033 */:
                return p();
            case com.harman.sdk.utils.c.f48437f /* 8290 */:
                return r();
            case com.harman.sdk.utils.c.f48438g /* 8291 */:
                return s();
            case com.harman.sdk.utils.c.f48439h /* 8413 */:
            case com.harman.sdk.utils.c.f48440i /* 8418 */:
            case com.harman.sdk.utils.c.f48444m /* 8480 */:
                return o();
            case com.harman.sdk.utils.c.f48442k /* 8472 */:
            case com.harman.sdk.utils.c.f48447p /* 8563 */:
                return j();
            case com.harman.sdk.utils.c.f48443l /* 8494 */:
                return k();
            case com.harman.sdk.utils.c.f48445n /* 8534 */:
                return q();
            case com.harman.sdk.utils.c.f48446o /* 8539 */:
            case com.harman.sdk.utils.c.f48448q /* 8554 */:
                return l();
            default:
                k4 = C2108v.k(C0556a.f3837a);
                return k4;
        }
    }
}
