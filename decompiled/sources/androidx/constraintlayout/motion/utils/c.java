package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class c extends androidx.constraintlayout.core.motion.utils.h {

    /* renamed from: i, reason: collision with root package name */
    private static final String f8427i = "ViewOscillator";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends c {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setAlpha(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: j, reason: collision with root package name */
        float[] f8428j = new float[1];

        /* renamed from: k, reason: collision with root package name */
        protected ConstraintAttribute f8429k;

        b() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        protected void e(Object obj) {
            this.f8429k = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            this.f8428j[0] = a(f4);
            androidx.constraintlayout.motion.utils.a.b(this.f8429k, view, this.f8428j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.utils.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0064c extends c {
        C0064c() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setElevation(a(f4));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
        }

        public void n(View view, float f4, double d4, double d5) {
            view.setRotation(a(f4) + ((float) Math.toDegrees(Math.atan2(d5, d4))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends c {

        /* renamed from: j, reason: collision with root package name */
        boolean f8430j = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            Method method;
            if (view instanceof s) {
                ((s) view).setProgress(a(f4));
                return;
            }
            if (this.f8430j) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f8430j = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f4)));
                } catch (IllegalAccessException e4) {
                    Log.e(c.f8427i, "unable to setProgress", e4);
                } catch (InvocationTargetException e5) {
                    Log.e(c.f8427i, "unable to setProgress", e5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f extends c {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setRotation(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g extends c {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setRotationX(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends c {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setRotationY(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i extends c {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setScaleX(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j extends c {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setScaleY(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends c {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setTranslationX(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l extends c {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setTranslationY(a(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m extends c {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f4) {
            view.setTranslationZ(a(f4));
        }
    }

    public static c l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f8538i)) {
                    c4 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c4 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c4 = '\r';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new C0064c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f4);
}
