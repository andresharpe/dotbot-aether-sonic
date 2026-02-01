package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class f extends t {

    /* renamed from: p, reason: collision with root package name */
    private static final String f8441p = "ViewTimeCycle";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends f {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setAlpha(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: q, reason: collision with root package name */
        String f8442q;

        /* renamed from: r, reason: collision with root package name */
        SparseArray<ConstraintAttribute> f8443r;

        /* renamed from: s, reason: collision with root package name */
        SparseArray<float[]> f8444s = new SparseArray<>();

        /* renamed from: t, reason: collision with root package name */
        float[] f8445t;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f8442q = str.split(",")[1];
            this.f8443r = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i4) {
            int size = this.f8443r.size();
            int p4 = this.f8443r.valueAt(0).p();
            double[] dArr = new double[size];
            int i5 = p4 + 2;
            this.f8445t = new float[i5];
            this.f7321g = new float[p4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i5);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.f8443r.keyAt(i6);
                ConstraintAttribute valueAt = this.f8443r.valueAt(i6);
                float[] valueAt2 = this.f8444s.valueAt(i6);
                dArr[i6] = keyAt * 0.01d;
                valueAt.l(this.f8445t);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f8445t.length) {
                        dArr2[i6][i7] = r7[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i6];
                dArr3[p4] = valueAt2[0];
                dArr3[p4 + 1] = valueAt2[1];
            }
            this.f7315a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            boolean z3;
            this.f7315a.e(f4, this.f8445t);
            float[] fArr = this.f8445t;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            long j5 = j4 - this.f7323i;
            if (Float.isNaN(this.f7324j)) {
                float a4 = gVar.a(view, this.f8442q, 0);
                this.f7324j = a4;
                if (Float.isNaN(a4)) {
                    this.f7324j = 0.0f;
                }
            }
            float f7 = (float) ((this.f7324j + ((j5 * 1.0E-9d) * f5)) % 1.0d);
            this.f7324j = f7;
            this.f7323i = j4;
            float a5 = a(f7);
            this.f7322h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f7321g;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.f7322h;
                float f8 = this.f8445t[i4];
                if (f8 != com.google.firebase.remoteconfig.l.f37524n) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f7322h = z4 | z3;
                fArr2[i4] = (f8 * a5) + f6;
                i4++;
            }
            androidx.constraintlayout.motion.utils.a.b(this.f8443r.valueAt(0), view, this.f7321g);
            if (f5 != 0.0f) {
                this.f7322h = true;
            }
            return this.f7322h;
        }

        public void k(int i4, ConstraintAttribute constraintAttribute, float f4, int i5, float f5) {
            this.f8443r.append(i4, constraintAttribute);
            this.f8444s.append(i4, new float[]{f4, f5});
            this.f7316b = Math.max(this.f7316b, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends f {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setElevation(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            return this.f7322h;
        }

        public boolean k(View view, androidx.constraintlayout.core.motion.utils.g gVar, float f4, long j4, double d4, double d5) {
            view.setRotation(g(f4, j4, view, gVar) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: q, reason: collision with root package name */
        boolean f8446q = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            Method method;
            if (view instanceof s) {
                ((s) view).setProgress(g(f4, j4, view, gVar));
            } else {
                if (this.f8446q) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f8446q = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(g(f4, j4, view, gVar)));
                    } catch (IllegalAccessException e4) {
                        Log.e(f.f8441p, "unable to setProgress", e4);
                    } catch (InvocationTargetException e5) {
                        Log.e(f.f8441p, "unable to setProgress", e5);
                    }
                }
            }
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.utils.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0066f extends f {
        C0066f() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotation(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g extends f {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationX(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends f {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationY(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i extends f {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleX(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j extends f {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleY(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends f {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationX(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l extends f {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationY(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m extends f {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationZ(g(f4, j4, view, gVar));
            return this.f7322h;
        }
    }

    public static f h(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x009c. Please report as an issue. */
    public static f i(String str, long j4) {
        f gVar;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c4 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c4 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c4 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c4 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c4 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f8538i)) {
                    c4 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = 11;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                gVar = new g();
                gVar.d(j4);
                return gVar;
            case 1:
                gVar = new h();
                gVar.d(j4);
                return gVar;
            case 2:
                gVar = new k();
                gVar.d(j4);
                return gVar;
            case 3:
                gVar = new l();
                gVar.d(j4);
                return gVar;
            case 4:
                gVar = new m();
                gVar.d(j4);
                return gVar;
            case 5:
                gVar = new e();
                gVar.d(j4);
                return gVar;
            case 6:
                gVar = new i();
                gVar.d(j4);
                return gVar;
            case 7:
                gVar = new j();
                gVar.d(j4);
                return gVar;
            case '\b':
                gVar = new C0066f();
                gVar.d(j4);
                return gVar;
            case '\t':
                gVar = new c();
                gVar.d(j4);
                return gVar;
            case '\n':
                gVar = new d();
                gVar.d(j4);
                return gVar;
            case 11:
                gVar = new a();
                gVar.d(j4);
                return gVar;
            default:
                return null;
        }
    }

    public float g(float f4, long j4, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
        boolean z3;
        this.f7315a.e(f4, this.f7321g);
        float[] fArr = this.f7321g;
        float f5 = fArr[1];
        if (f5 == 0.0f) {
            this.f7322h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f7324j)) {
            float a4 = gVar.a(view, this.f7320f, 0);
            this.f7324j = a4;
            if (Float.isNaN(a4)) {
                this.f7324j = 0.0f;
            }
        }
        float f6 = (float) ((this.f7324j + (((j4 - this.f7323i) * 1.0E-9d) * f5)) % 1.0d);
        this.f7324j = f6;
        gVar.b(view, this.f7320f, 0, f6);
        this.f7323i = j4;
        float f7 = this.f7321g[0];
        float a5 = (a(this.f7324j) * f7) + this.f7321g[2];
        if (f7 == 0.0f && f5 == 0.0f) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f7322h = z3;
        return a5;
    }

    public abstract boolean j(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar);
}
