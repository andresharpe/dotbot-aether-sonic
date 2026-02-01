package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0823k0;
import androidx.transition.D;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0977k extends J {

    /* renamed from: E0, reason: collision with root package name */
    private static final String f20069E0 = "android:changeTransform:parent";

    /* renamed from: G0, reason: collision with root package name */
    private static final String f20071G0 = "android:changeTransform:intermediateParentMatrix";

    /* renamed from: H0, reason: collision with root package name */
    private static final String f20072H0 = "android:changeTransform:intermediateMatrix";

    /* renamed from: A0, reason: collision with root package name */
    private boolean f20077A0;

    /* renamed from: B0, reason: collision with root package name */
    private Matrix f20078B0;

    /* renamed from: z0, reason: collision with root package name */
    boolean f20079z0;

    /* renamed from: C0, reason: collision with root package name */
    private static final String f20067C0 = "android:changeTransform:matrix";

    /* renamed from: D0, reason: collision with root package name */
    private static final String f20068D0 = "android:changeTransform:transforms";

    /* renamed from: F0, reason: collision with root package name */
    private static final String f20070F0 = "android:changeTransform:parentMatrix";

    /* renamed from: I0, reason: collision with root package name */
    private static final String[] f20073I0 = {f20067C0, f20068D0, f20070F0};

    /* renamed from: J0, reason: collision with root package name */
    private static final Property<e, float[]> f20074J0 = new a(float[].class, "nonTranslations");

    /* renamed from: K0, reason: collision with root package name */
    private static final Property<e, PointF> f20075K0 = new b(PointF.class, "translations");

    /* renamed from: L0, reason: collision with root package name */
    private static final boolean f20076L0 = true;

    /* renamed from: androidx.transition.k$a */
    /* loaded from: classes.dex */
    class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    /* renamed from: androidx.transition.k$b */
    /* loaded from: classes.dex */
    class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.k$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f20080a;

        /* renamed from: b, reason: collision with root package name */
        private Matrix f20081b = new Matrix();

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f20082c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f20083d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f20084e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f20085f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f20086g;

        c(boolean z3, Matrix matrix, View view, f fVar, e eVar) {
            this.f20082c = z3;
            this.f20083d = matrix;
            this.f20084e = view;
            this.f20085f = fVar;
            this.f20086g = eVar;
        }

        private void a(Matrix matrix) {
            this.f20081b.set(matrix);
            this.f20084e.setTag(D.g.f19197V1, this.f20081b);
            this.f20085f.a(this.f20084e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20080a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f20080a) {
                if (this.f20082c && C0977k.this.f20079z0) {
                    a(this.f20083d);
                } else {
                    this.f20084e.setTag(D.g.f19197V1, null);
                    this.f20084e.setTag(D.g.f19184R0, null);
                }
            }
            f0.f(this.f20084e, null);
            this.f20085f.a(this.f20084e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f20086g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            C0977k.K0(this.f20084e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.k$d */
    /* loaded from: classes.dex */
    public static class d extends L {

        /* renamed from: a, reason: collision with root package name */
        private View f20088a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0983q f20089b;

        d(View view, InterfaceC0983q interfaceC0983q) {
            this.f20088a = view;
            this.f20089b = interfaceC0983q;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void b(@androidx.annotation.N J j4) {
            this.f20089b.setVisibility(4);
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            j4.m0(this);
            C0986u.b(this.f20088a);
            this.f20088a.setTag(D.g.f19197V1, null);
            this.f20088a.setTag(D.g.f19184R0, null);
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void e(@androidx.annotation.N J j4) {
            this.f20089b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.k$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Matrix f20090a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        private final View f20091b;

        /* renamed from: c, reason: collision with root package name */
        private final float[] f20092c;

        /* renamed from: d, reason: collision with root package name */
        private float f20093d;

        /* renamed from: e, reason: collision with root package name */
        private float f20094e;

        e(View view, float[] fArr) {
            this.f20091b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f20092c = fArr2;
            this.f20093d = fArr2[2];
            this.f20094e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f20092c;
            fArr[2] = this.f20093d;
            fArr[5] = this.f20094e;
            this.f20090a.setValues(fArr);
            f0.f(this.f20091b, this.f20090a);
        }

        Matrix a() {
            return this.f20090a;
        }

        void c(PointF pointF) {
            this.f20093d = pointF.x;
            this.f20094e = pointF.y;
            b();
        }

        void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f20092c, 0, fArr.length);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.k$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final float f20095a;

        /* renamed from: b, reason: collision with root package name */
        final float f20096b;

        /* renamed from: c, reason: collision with root package name */
        final float f20097c;

        /* renamed from: d, reason: collision with root package name */
        final float f20098d;

        /* renamed from: e, reason: collision with root package name */
        final float f20099e;

        /* renamed from: f, reason: collision with root package name */
        final float f20100f;

        /* renamed from: g, reason: collision with root package name */
        final float f20101g;

        /* renamed from: h, reason: collision with root package name */
        final float f20102h;

        f(View view) {
            this.f20095a = view.getTranslationX();
            this.f20096b = view.getTranslationY();
            this.f20097c = C0823k0.A0(view);
            this.f20098d = view.getScaleX();
            this.f20099e = view.getScaleY();
            this.f20100f = view.getRotationX();
            this.f20101g = view.getRotationY();
            this.f20102h = view.getRotation();
        }

        public void a(View view) {
            C0977k.O0(view, this.f20095a, this.f20096b, this.f20097c, this.f20098d, this.f20099e, this.f20100f, this.f20101g, this.f20102h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.f20095a != this.f20095a || fVar.f20096b != this.f20096b || fVar.f20097c != this.f20097c || fVar.f20098d != this.f20098d || fVar.f20099e != this.f20099e || fVar.f20100f != this.f20100f || fVar.f20101g != this.f20101g || fVar.f20102h != this.f20102h) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            float f4 = this.f20095a;
            int i11 = 0;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = i4 * 31;
            float f5 = this.f20096b;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f20097c;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f20098d;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f20099e;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            } else {
                i8 = 0;
            }
            int i16 = (i15 + i8) * 31;
            float f9 = this.f20100f;
            if (f9 != 0.0f) {
                i9 = Float.floatToIntBits(f9);
            } else {
                i9 = 0;
            }
            int i17 = (i16 + i9) * 31;
            float f10 = this.f20101g;
            if (f10 != 0.0f) {
                i10 = Float.floatToIntBits(f10);
            } else {
                i10 = 0;
            }
            int i18 = (i17 + i10) * 31;
            float f11 = this.f20102h;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            }
            return i18 + i11;
        }
    }

    public C0977k() {
        this.f20079z0 = true;
        this.f20077A0 = true;
        this.f20078B0 = new Matrix();
    }

    private void E0(S s4) {
        Matrix matrix;
        View view = s4.f19960b;
        if (view.getVisibility() == 8) {
            return;
        }
        s4.f19959a.put(f20069E0, view.getParent());
        s4.f19959a.put(f20068D0, new f(view));
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix = new Matrix(matrix2);
        } else {
            matrix = null;
        }
        s4.f19959a.put(f20067C0, matrix);
        if (this.f20077A0) {
            Matrix matrix3 = new Matrix();
            f0.j((ViewGroup) view.getParent(), matrix3);
            matrix3.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            s4.f19959a.put(f20070F0, matrix3);
            s4.f19959a.put(f20072H0, view.getTag(D.g.f19197V1));
            s4.f19959a.put(f20071G0, view.getTag(D.g.f19184R0));
        }
    }

    private void F0(ViewGroup viewGroup, S s4, S s5) {
        View view = s5.f19960b;
        Matrix matrix = new Matrix((Matrix) s5.f19959a.get(f20070F0));
        f0.k(viewGroup, matrix);
        InterfaceC0983q a4 = C0986u.a(view, viewGroup, matrix);
        if (a4 == null) {
            return;
        }
        a4.a((ViewGroup) s4.f19959a.get(f20069E0), s4.f19960b);
        J j4 = this;
        while (true) {
            J j5 = j4.f19902V;
            if (j5 == null) {
                break;
            } else {
                j4 = j5;
            }
        }
        j4.a(new d(view, a4));
        if (f20076L0) {
            View view2 = s4.f19960b;
            if (view2 != s5.f19960b) {
                f0.h(view2, 0.0f);
            }
            f0.h(view, 1.0f);
        }
    }

    private ObjectAnimator G0(S s4, S s5, boolean z3) {
        Matrix matrix = (Matrix) s4.f19959a.get(f20067C0);
        Matrix matrix2 = (Matrix) s5.f19959a.get(f20067C0);
        if (matrix == null) {
            matrix = C0989x.f20195a;
        }
        if (matrix2 == null) {
            matrix2 = C0989x.f20195a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) s5.f19959a.get(f20068D0);
        View view = s5.f19960b;
        K0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(f20074J0, new C0981o(new float[9]), fArr, fArr2), C.a(f20075K0, Q().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z3, matrix3, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C0967a.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r4 == r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5 == r4.f19960b) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean J0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.c0(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r3.c0(r5)
            if (r0 != 0) goto Lf
            goto L1d
        Lf:
            androidx.transition.S r4 = r3.O(r4, r1)
            if (r4 == 0) goto L20
            android.view.View r4 = r4.f19960b
            if (r5 != r4) goto L1a
            goto L1b
        L1a:
            r1 = r2
        L1b:
            r2 = r1
            goto L20
        L1d:
            if (r4 != r5) goto L1a
            goto L1b
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C0977k.J0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    static void K0(View view) {
        O0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void L0(S s4, S s5) {
        Matrix matrix = (Matrix) s5.f19959a.get(f20070F0);
        s5.f19960b.setTag(D.g.f19184R0, matrix);
        Matrix matrix2 = this.f20078B0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) s4.f19959a.get(f20067C0);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            s4.f19959a.put(f20067C0, matrix3);
        }
        matrix3.postConcat((Matrix) s4.f19959a.get(f20070F0));
        matrix3.postConcat(matrix2);
    }

    static void O0(View view, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        C0823k0.w2(view, f6);
        view.setScaleX(f7);
        view.setScaleY(f8);
        view.setRotationX(f9);
        view.setRotationY(f10);
        view.setRotation(f11);
    }

    public boolean H0() {
        return this.f20077A0;
    }

    public boolean I0() {
        return this.f20079z0;
    }

    public void M0(boolean z3) {
        this.f20077A0 = z3;
    }

    public void N0(boolean z3) {
        this.f20079z0 = z3;
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public String[] Y() {
        return f20073I0;
    }

    @Override // androidx.transition.J
    public void l(@androidx.annotation.N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        E0(s4);
        if (!f20076L0) {
            ((ViewGroup) s4.f19960b.getParent()).startViewTransition(s4.f19960b);
        }
    }

    @Override // androidx.transition.J
    @androidx.annotation.P
    public Animator t(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P S s4, @androidx.annotation.P S s5) {
        boolean z3;
        if (s4 != null && s5 != null && s4.f19959a.containsKey(f20069E0) && s5.f19959a.containsKey(f20069E0)) {
            ViewGroup viewGroup2 = (ViewGroup) s4.f19959a.get(f20069E0);
            ViewGroup viewGroup3 = (ViewGroup) s5.f19959a.get(f20069E0);
            if (this.f20077A0 && !J0(viewGroup2, viewGroup3)) {
                z3 = true;
            } else {
                z3 = false;
            }
            Matrix matrix = (Matrix) s4.f19959a.get(f20072H0);
            if (matrix != null) {
                s4.f19959a.put(f20067C0, matrix);
            }
            Matrix matrix2 = (Matrix) s4.f19959a.get(f20071G0);
            if (matrix2 != null) {
                s4.f19959a.put(f20070F0, matrix2);
            }
            if (z3) {
                L0(s4, s5);
            }
            ObjectAnimator G02 = G0(s4, s5, z3);
            if (z3 && G02 != null && this.f20079z0) {
                F0(viewGroup, s4, s5);
            } else if (!f20076L0) {
                viewGroup2.endViewTransition(s4.f19960b);
            }
            return G02;
        }
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public C0977k(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20079z0 = true;
        this.f20077A0 = true;
        this.f20078B0 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19841g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f20079z0 = androidx.core.content.res.n.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f20077A0 = androidx.core.content.res.n.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
