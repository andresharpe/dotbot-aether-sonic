package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class d extends androidx.constraintlayout.core.motion.utils.o {

    /* renamed from: g, reason: collision with root package name */
    private static final String f8431g = "ViewSpline";

    /* loaded from: classes.dex */
    static class a extends d {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setAlpha(a(f4));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: h, reason: collision with root package name */
        String f8432h;

        /* renamed from: i, reason: collision with root package name */
        SparseArray<ConstraintAttribute> f8433i;

        /* renamed from: j, reason: collision with root package name */
        float[] f8434j;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f8432h = str.split(",")[1];
            this.f8433i = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void g(int i4, float f4) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void j(int i4) {
            int size = this.f8433i.size();
            int p4 = this.f8433i.valueAt(0).p();
            double[] dArr = new double[size];
            this.f8434j = new float[p4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, p4);
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.f8433i.keyAt(i5);
                ConstraintAttribute valueAt = this.f8433i.valueAt(i5);
                dArr[i5] = keyAt * 0.01d;
                valueAt.l(this.f8434j);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f8434j.length) {
                        dArr2[i5][i6] = r6[i6];
                        i6++;
                    }
                }
            }
            this.f7267a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            this.f7267a.e(f4, this.f8434j);
            androidx.constraintlayout.motion.utils.a.b(this.f8433i.valueAt(0), view, this.f8434j);
        }

        public void n(int i4, ConstraintAttribute constraintAttribute) {
            this.f8433i.append(i4, constraintAttribute);
        }
    }

    /* loaded from: classes.dex */
    static class c extends d {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setElevation(a(f4));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0065d extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
        }

        public void n(View view, float f4, double d4, double d5) {
            view.setRotation(a(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }
    }

    /* loaded from: classes.dex */
    static class e extends d {
        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setPivotX(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class f extends d {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setPivotY(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class g extends d {

        /* renamed from: h, reason: collision with root package name */
        boolean f8435h = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            Method method;
            if (view instanceof s) {
                ((s) view).setProgress(a(f4));
                return;
            }
            if (this.f8435h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f8435h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f4)));
                } catch (IllegalAccessException e4) {
                    Log.e(d.f8431g, "unable to setProgress", e4);
                } catch (InvocationTargetException e5) {
                    Log.e(d.f8431g, "unable to setProgress", e5);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class h extends d {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setRotation(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class i extends d {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setRotationX(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class j extends d {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setRotationY(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class k extends d {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setScaleX(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class l extends d {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setScaleY(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class m extends d {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setTranslationX(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class n extends d {
        n() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setTranslationY(a(f4));
        }
    }

    /* loaded from: classes.dex */
    static class o extends d {
        o() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f4) {
            view.setTranslationZ(a(f4));
        }
    }

    public static d k(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static d l(String str) {
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
            case -797520672:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f8549t)) {
                    c4 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f8541l)) {
                    c4 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f8542m)) {
                    c4 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f8538i)) {
                    c4 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c4 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c4 = 15;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new a();
            case '\t':
                return new e();
            case '\n':
                return new f();
            case 11:
                return new h();
            case '\f':
                return new c();
            case '\r':
                return new C0065d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f4);
}
