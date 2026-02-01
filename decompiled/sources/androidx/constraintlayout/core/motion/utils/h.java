package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.v;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: h, reason: collision with root package name */
    private static final String f7181h = "KeyCycleOscillator";

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f7182a;

    /* renamed from: b, reason: collision with root package name */
    private c f7183b;

    /* renamed from: c, reason: collision with root package name */
    private String f7184c;

    /* renamed from: d, reason: collision with root package name */
    private int f7185d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f7186e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f7187f = 0;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<e> f7188g = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Comparator<e> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            return Integer.compare(eVar.f7212a, eVar2.f7212a);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends h {

        /* renamed from: i, reason: collision with root package name */
        String f7190i;

        /* renamed from: j, reason: collision with root package name */
        int f7191j;

        b(String str) {
            this.f7190i = str;
            this.f7191j = v.c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        public void h(androidx.constraintlayout.core.motion.e eVar, float f4) {
            eVar.c(this.f7191j, a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: q, reason: collision with root package name */
        static final int f7192q = -1;

        /* renamed from: r, reason: collision with root package name */
        private static final String f7193r = "CycleOscillator";

        /* renamed from: a, reason: collision with root package name */
        private final int f7194a;

        /* renamed from: b, reason: collision with root package name */
        l f7195b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7196c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7197d;

        /* renamed from: e, reason: collision with root package name */
        private final int f7198e;

        /* renamed from: f, reason: collision with root package name */
        float[] f7199f;

        /* renamed from: g, reason: collision with root package name */
        double[] f7200g;

        /* renamed from: h, reason: collision with root package name */
        float[] f7201h;

        /* renamed from: i, reason: collision with root package name */
        float[] f7202i;

        /* renamed from: j, reason: collision with root package name */
        float[] f7203j;

        /* renamed from: k, reason: collision with root package name */
        float[] f7204k;

        /* renamed from: l, reason: collision with root package name */
        int f7205l;

        /* renamed from: m, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.b f7206m;

        /* renamed from: n, reason: collision with root package name */
        double[] f7207n;

        /* renamed from: o, reason: collision with root package name */
        double[] f7208o;

        /* renamed from: p, reason: collision with root package name */
        float f7209p;

        c(int i4, String str, int i5, int i6) {
            l lVar = new l();
            this.f7195b = lVar;
            this.f7196c = 0;
            this.f7197d = 1;
            this.f7198e = 2;
            this.f7205l = i4;
            this.f7194a = i5;
            lVar.g(i4, str);
            this.f7199f = new float[i6];
            this.f7200g = new double[i6];
            this.f7201h = new float[i6];
            this.f7202i = new float[i6];
            this.f7203j = new float[i6];
            this.f7204k = new float[i6];
        }

        public double a() {
            return this.f7207n[1];
        }

        public double b(float f4) {
            androidx.constraintlayout.core.motion.utils.b bVar = this.f7206m;
            if (bVar != null) {
                double d4 = f4;
                bVar.g(d4, this.f7208o);
                this.f7206m.d(d4, this.f7207n);
            } else {
                double[] dArr = this.f7208o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d5 = f4;
            double e4 = this.f7195b.e(d5, this.f7207n[1]);
            double d6 = this.f7195b.d(d5, this.f7207n[1], this.f7208o[1]);
            double[] dArr2 = this.f7208o;
            return dArr2[0] + (e4 * dArr2[2]) + (d6 * this.f7207n[2]);
        }

        public double c(float f4) {
            androidx.constraintlayout.core.motion.utils.b bVar = this.f7206m;
            if (bVar != null) {
                bVar.d(f4, this.f7207n);
            } else {
                double[] dArr = this.f7207n;
                dArr[0] = this.f7202i[0];
                dArr[1] = this.f7203j[0];
                dArr[2] = this.f7199f[0];
            }
            double[] dArr2 = this.f7207n;
            return dArr2[0] + (this.f7195b.e(f4, dArr2[1]) * this.f7207n[2]);
        }

        public void d(int i4, int i5, float f4, float f5, float f6, float f7) {
            this.f7200g[i4] = i5 / 100.0d;
            this.f7201h[i4] = f4;
            this.f7202i[i4] = f5;
            this.f7203j[i4] = f6;
            this.f7199f[i4] = f7;
        }

        public void e(float f4) {
            this.f7209p = f4;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f7200g.length, 3);
            float[] fArr = this.f7199f;
            this.f7207n = new double[fArr.length + 2];
            this.f7208o = new double[fArr.length + 2];
            if (this.f7200g[0] > com.google.firebase.remoteconfig.l.f37524n) {
                this.f7195b.a(com.google.firebase.remoteconfig.l.f37524n, this.f7201h[0]);
            }
            double[] dArr2 = this.f7200g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f7195b.a(1.0d, this.f7201h[length]);
            }
            for (int i4 = 0; i4 < dArr.length; i4++) {
                double[] dArr3 = dArr[i4];
                dArr3[0] = this.f7202i[i4];
                dArr3[1] = this.f7203j[i4];
                dArr3[2] = this.f7199f[i4];
                this.f7195b.a(this.f7200g[i4], this.f7201h[i4]);
            }
            this.f7195b.f();
            double[] dArr4 = this.f7200g;
            if (dArr4.length > 1) {
                this.f7206m = androidx.constraintlayout.core.motion.utils.b.a(0, dArr4, dArr);
            } else {
                this.f7206m = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends h {

        /* renamed from: i, reason: collision with root package name */
        String f7210i;

        /* renamed from: j, reason: collision with root package name */
        int f7211j;

        public d(String str) {
            this.f7210i = str;
            this.f7211j = v.c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        public void h(androidx.constraintlayout.core.motion.e eVar, float f4) {
            eVar.c(this.f7211j, a(f4));
        }

        public void l(androidx.constraintlayout.core.motion.e eVar, float f4, double d4, double d5) {
            eVar.R(a(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        int f7212a;

        /* renamed from: b, reason: collision with root package name */
        float f7213b;

        /* renamed from: c, reason: collision with root package name */
        float f7214c;

        /* renamed from: d, reason: collision with root package name */
        float f7215d;

        /* renamed from: e, reason: collision with root package name */
        float f7216e;

        e(int i4, float f4, float f5, float f6, float f7) {
            this.f7212a = i4;
            this.f7213b = f7;
            this.f7214c = f5;
            this.f7215d = f4;
            this.f7216e = f6;
        }
    }

    public static h d(String str) {
        if (str.equals("pathRotate")) {
            return new d(str);
        }
        return new b(str);
    }

    public float a(float f4) {
        return (float) this.f7183b.c(f4);
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f7182a;
    }

    public float c(float f4) {
        return (float) this.f7183b.b(f4);
    }

    protected void e(Object obj) {
    }

    public void f(int i4, int i5, String str, int i6, float f4, float f5, float f6, float f7) {
        this.f7188g.add(new e(i4, f4, f5, f6, f7));
        if (i6 != -1) {
            this.f7187f = i6;
        }
        this.f7185d = i5;
        this.f7186e = str;
    }

    public void g(int i4, int i5, String str, int i6, float f4, float f5, float f6, float f7, Object obj) {
        this.f7188g.add(new e(i4, f4, f5, f6, f7));
        if (i6 != -1) {
            this.f7187f = i6;
        }
        this.f7185d = i5;
        e(obj);
        this.f7186e = str;
    }

    public void h(androidx.constraintlayout.core.motion.e eVar, float f4) {
    }

    public void i(String str) {
        this.f7184c = str;
    }

    public void j(float f4) {
        int size = this.f7188g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f7188g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f7183b = new c(this.f7185d, this.f7186e, this.f7187f, size);
        Iterator<e> it = this.f7188g.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            e next = it.next();
            float f5 = next.f7215d;
            dArr[i4] = f5 * 0.01d;
            double[] dArr3 = dArr2[i4];
            float f6 = next.f7213b;
            dArr3[0] = f6;
            float f7 = next.f7214c;
            dArr3[1] = f7;
            float f8 = next.f7216e;
            dArr3[2] = f8;
            this.f7183b.d(i4, next.f7212a, f5, f7, f8, f6);
            i4++;
        }
        this.f7183b.e(f4);
        this.f7182a = androidx.constraintlayout.core.motion.utils.b.a(0, dArr, dArr2);
    }

    public boolean k() {
        if (this.f7187f == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.f7184c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<e> it = this.f7188g.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f7212a + " , " + decimalFormat.format(r3.f7213b) + "] ";
        }
        return str;
    }
}
