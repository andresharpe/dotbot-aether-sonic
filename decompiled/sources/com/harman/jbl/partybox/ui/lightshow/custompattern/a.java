package com.harman.jbl.partybox.ui.lightshow.custompattern;

import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.CustomLightPattern;
import com.harman.sdk.utils.LightElements;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.random.Random;
import kotlin.ranges.l;
import kotlin.ranges.u;
import l3.d;
import l3.e;

@U({"SMAP\nCustomLightPatternGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomLightPatternGenerator.kt\ncom/harman/jbl/partybox/ui/lightshow/custompattern/CustomLightPatternGenerator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n766#2:261\n857#2,2:262\n661#2,11:264\n661#2,11:275\n*S KotlinDebug\n*F\n+ 1 CustomLightPatternGenerator.kt\ncom/harman/jbl/partybox/ui/lightshow/custompattern/CustomLightPatternGenerator\n*L\n14#1:261\n14#1:262,2\n46#1:264,11\n75#1:275,11\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final C0384a f44010a = new C0384a(null);

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final l f44011b = new l(0, 360);

    /* renamed from: c, reason: collision with root package name */
    @d
    private static final Color f44012c = new Color(255, 255, 255);

    /* renamed from: d, reason: collision with root package name */
    @d
    private static final Color f44013d = new Color(0, 0, 0);

    /* renamed from: com.harman.jbl.partybox.ui.lightshow.custompattern.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0384a {
        public /* synthetic */ C0384a(C2197u c2197u) {
            this();
        }

        private C0384a() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        if (r1 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0053, code lost:
    
        if (r6 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.harman.sdk.utils.CustomLightPattern> a(com.harman.sdk.utils.Color r12, java.util.List<com.harman.sdk.utils.CustomLightPattern> r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.lightshow.custompattern.a.a(com.harman.sdk.utils.Color, java.util.List):java.util.List");
    }

    private final List<CustomLightPattern> b(Color color) {
        List<LightElements> O3;
        O3 = CollectionsKt__CollectionsKt.O(LightElements.LIGHT_STAR, LightElements.LIGHT_STROBE_UP, LightElements.LIGHT_STROBE_DOWN);
        b<Integer> bVar = new b<>();
        bVar.a(0, 0.5d);
        bVar.a(1, 0.5d);
        ArrayList arrayList = new ArrayList();
        for (LightElements lightElements : O3) {
            arrayList.add(new CustomLightPattern(lightElements, i(lightElements.j()), h(bVar, color)));
        }
        return arrayList;
    }

    private final int[] c(l lVar) {
        int i4 = 0;
        if (lVar.m() < lVar.l()) {
            return new int[0];
        }
        int[] iArr = new int[(lVar.m() - lVar.l()) + 1];
        int l4 = lVar.l();
        int m4 = lVar.m();
        if (l4 <= m4) {
            while (true) {
                int i5 = i4 + 1;
                iArr[i4] = l4;
                if (l4 == m4) {
                    break;
                }
                l4++;
                i4 = i5;
            }
        }
        return iArr;
    }

    private final Color d(int i4) {
        int HSVToColor = android.graphics.Color.HSVToColor(new float[]{k(i4), 100.0f, 100.0f});
        return new Color((16711680 & HSVToColor) >> 16, (65280 & HSVToColor) >> 8, HSVToColor & 255);
    }

    private final Color e() {
        b bVar = new b();
        bVar.a(0, 0.5d);
        bVar.a(1, 0.5d);
        if (((Number) bVar.c()).intValue() == 0) {
            return f44013d;
        }
        return f();
    }

    private final Color f() {
        int g12;
        g12 = u.g1(f44011b, Random.f52425E);
        return d(g12);
    }

    private final float g(Color color) {
        float[] fArr = new float[3];
        android.graphics.Color.RGBToHSV(color.h(), color.g(), color.f(), fArr);
        return fArr[0];
    }

    private final Color h(b<Integer> bVar, Color color) {
        return o(bVar.c().intValue(), color);
    }

    private final int i(int i4) {
        l W12;
        int g12;
        W12 = u.W1(1, i4);
        g12 = u.g1(W12, Random.f52425E);
        return g12;
    }

    private final float k(int i4) {
        if (i4 < 0) {
            i4 = 360 - Math.abs(i4);
        } else if (i4 > 360) {
            i4 -= 360;
        }
        return i4;
    }

    private final Color n(Color color) {
        int g12;
        float g4 = g(color);
        g12 = u.g1(new l(0, 90), Random.f52425E);
        return d((int) (g4 + g12));
    }

    private final Color o(int i4, Color color) {
        if (i4 == 0) {
            return f44012c;
        }
        return color;
    }

    private final Color p(int i4, Color color, Color color2) {
        int u3;
        int B3;
        if (i4 == 0) {
            return f44012c;
        }
        if (!F.g(color, f44013d)) {
            int g4 = (int) g(color2);
            l lVar = f44011b;
            u3 = u.u(g4 - 45, lVar.l());
            B3 = u.B(g4 + 45, lVar.m());
            int[] c4 = c(new l(u3, B3));
            return d(m(lVar, Arrays.copyOf(c4, c4.length)));
        }
        return color;
    }

    public final int j(int i4, int i5) {
        l W12;
        W12 = u.W1(1, i4);
        return m(W12, i5);
    }

    @d
    public final List<CustomLightPattern> l(@e List<CustomLightPattern> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                CustomLightPattern customLightPattern = (CustomLightPattern) obj;
                if (customLightPattern.g() == LightElements.LIGHT_EIGHT || customLightPattern.g() == LightElements.LIGHT_STRIPE) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        Color e4 = e();
        arrayList2.addAll(b(e4));
        arrayList2.addAll(a(e4, arrayList));
        return arrayList2;
    }

    public final int m(@d l range, @d int... excludeRows) {
        boolean q8;
        F.p(range, "range");
        F.p(excludeRows, "excludeRows");
        java.util.Random random = new java.util.Random();
        int m4 = (range.m() - range.l()) + 1;
        int nextInt = random.nextInt(m4);
        while (true) {
            int i4 = nextInt + 1;
            q8 = C2101p.q8(excludeRows, i4);
            if (q8) {
                nextInt = random.nextInt(m4);
            } else {
                return i4;
            }
        }
    }
}
