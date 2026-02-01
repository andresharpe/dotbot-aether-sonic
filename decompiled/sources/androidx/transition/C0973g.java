package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0823k0;
import java.util.Map;

/* renamed from: androidx.transition.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0973g extends J {

    /* renamed from: C0, reason: collision with root package name */
    private static final String f20010C0 = "android:changeBounds:bounds";

    /* renamed from: D0, reason: collision with root package name */
    private static final String f20011D0 = "android:changeBounds:clip";

    /* renamed from: E0, reason: collision with root package name */
    private static final String f20012E0 = "android:changeBounds:parent";

    /* renamed from: F0, reason: collision with root package name */
    private static final String f20013F0 = "android:changeBounds:windowX";

    /* renamed from: G0, reason: collision with root package name */
    private static final String f20014G0 = "android:changeBounds:windowY";

    /* renamed from: H0, reason: collision with root package name */
    private static final String[] f20015H0 = {f20010C0, f20011D0, f20012E0, f20013F0, f20014G0};

    /* renamed from: I0, reason: collision with root package name */
    private static final Property<Drawable, PointF> f20016I0 = new b(PointF.class, "boundsOrigin");

    /* renamed from: J0, reason: collision with root package name */
    private static final Property<k, PointF> f20017J0 = new c(PointF.class, "topLeft");

    /* renamed from: K0, reason: collision with root package name */
    private static final Property<k, PointF> f20018K0 = new d(PointF.class, "bottomRight");

    /* renamed from: L0, reason: collision with root package name */
    private static final Property<View, PointF> f20019L0 = new e(PointF.class, "bottomRight");

    /* renamed from: M0, reason: collision with root package name */
    private static final Property<View, PointF> f20020M0 = new f(PointF.class, "topLeft");

    /* renamed from: N0, reason: collision with root package name */
    private static final Property<View, PointF> f20021N0 = new C0181g(PointF.class, "position");

    /* renamed from: O0, reason: collision with root package name */
    private static E f20022O0 = new E();

    /* renamed from: A0, reason: collision with root package name */
    private boolean f20023A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f20024B0;

    /* renamed from: z0, reason: collision with root package name */
    private int[] f20025z0;

    /* renamed from: androidx.transition.g$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f20027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f20028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f20029d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f4) {
            this.f20026a = viewGroup;
            this.f20027b = bitmapDrawable;
            this.f20028c = view;
            this.f20029d = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f0.b(this.f20026a).b(this.f20027b);
            f0.h(this.f20028c, this.f20029d);
        }
    }

    /* renamed from: androidx.transition.g$b */
    /* loaded from: classes.dex */
    class b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f20031a;

        b(Class cls, String str) {
            super(cls, str);
            this.f20031a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f20031a);
            Rect rect = this.f20031a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f20031a);
            this.f20031a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f20031a);
        }
    }

    /* renamed from: androidx.transition.g$c */
    /* loaded from: classes.dex */
    class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: androidx.transition.g$d */
    /* loaded from: classes.dex */
    class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: androidx.transition.g$e */
    /* loaded from: classes.dex */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            f0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.g$f */
    /* loaded from: classes.dex */
    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            f0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.g$g, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0181g extends Property<View, PointF> {
        C0181g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            f0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.g$h */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f20032a;
        private k mViewBounds;

        h(k kVar) {
            this.f20032a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: androidx.transition.g$i */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f20034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f20035b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f20036c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20037d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f20038e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f20039f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f20040g;

        i(View view, Rect rect, int i4, int i5, int i6, int i7) {
            this.f20035b = view;
            this.f20036c = rect;
            this.f20037d = i4;
            this.f20038e = i5;
            this.f20039f = i6;
            this.f20040g = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20034a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f20034a) {
                C0823k0.M1(this.f20035b, this.f20036c);
                f0.g(this.f20035b, this.f20037d, this.f20038e, this.f20039f, this.f20040g);
            }
        }
    }

    /* renamed from: androidx.transition.g$j */
    /* loaded from: classes.dex */
    class j extends L {

        /* renamed from: a, reason: collision with root package name */
        boolean f20042a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20043b;

        j(ViewGroup viewGroup) {
            this.f20043b = viewGroup;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void b(@androidx.annotation.N J j4) {
            a0.d(this.f20043b, false);
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            if (!this.f20042a) {
                a0.d(this.f20043b, false);
            }
            j4.m0(this);
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void d(@androidx.annotation.N J j4) {
            a0.d(this.f20043b, false);
            this.f20042a = true;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void e(@androidx.annotation.N J j4) {
            a0.d(this.f20043b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.g$k */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f20045a;

        /* renamed from: b, reason: collision with root package name */
        private int f20046b;

        /* renamed from: c, reason: collision with root package name */
        private int f20047c;

        /* renamed from: d, reason: collision with root package name */
        private int f20048d;

        /* renamed from: e, reason: collision with root package name */
        private View f20049e;

        /* renamed from: f, reason: collision with root package name */
        private int f20050f;

        /* renamed from: g, reason: collision with root package name */
        private int f20051g;

        k(View view) {
            this.f20049e = view;
        }

        private void b() {
            f0.g(this.f20049e, this.f20045a, this.f20046b, this.f20047c, this.f20048d);
            this.f20050f = 0;
            this.f20051g = 0;
        }

        void a(PointF pointF) {
            this.f20047c = Math.round(pointF.x);
            this.f20048d = Math.round(pointF.y);
            int i4 = this.f20051g + 1;
            this.f20051g = i4;
            if (this.f20050f == i4) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f20045a = Math.round(pointF.x);
            this.f20046b = Math.round(pointF.y);
            int i4 = this.f20050f + 1;
            this.f20050f = i4;
            if (i4 == this.f20051g) {
                b();
            }
        }
    }

    public C0973g() {
        this.f20025z0 = new int[2];
        this.f20023A0 = false;
        this.f20024B0 = false;
    }

    private void E0(S s4) {
        View view = s4.f19960b;
        if (C0823k0.U0(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            s4.f19959a.put(f20010C0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            s4.f19959a.put(f20012E0, s4.f19960b.getParent());
            if (this.f20024B0) {
                s4.f19960b.getLocationInWindow(this.f20025z0);
                s4.f19959a.put(f20013F0, Integer.valueOf(this.f20025z0[0]));
                s4.f19959a.put(f20014G0, Integer.valueOf(this.f20025z0[1]));
            }
            if (this.f20023A0) {
                s4.f19959a.put(f20011D0, C0823k0.P(view));
            }
        }
    }

    private boolean G0(View view, View view2) {
        if (!this.f20024B0) {
            return true;
        }
        S O3 = O(view, true);
        if (O3 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == O3.f19960b) {
            return true;
        }
        return false;
    }

    public boolean F0() {
        return this.f20023A0;
    }

    public void H0(boolean z3) {
        this.f20023A0 = z3;
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public String[] Y() {
        return f20015H0;
    }

    @Override // androidx.transition.J
    public void l(@androidx.annotation.N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    @androidx.annotation.P
    public Animator t(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P S s4, @androidx.annotation.P S s5) {
        int i4;
        View view;
        int i5;
        ObjectAnimator objectAnimator;
        Animator c4;
        if (s4 == null || s5 == null) {
            return null;
        }
        Map<String, Object> map = s4.f19959a;
        Map<String, Object> map2 = s5.f19959a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f20012E0);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f20012E0);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = s5.f19960b;
        if (G0(viewGroup2, viewGroup3)) {
            Rect rect = (Rect) s4.f19959a.get(f20010C0);
            Rect rect2 = (Rect) s5.f19959a.get(f20010C0);
            int i6 = rect.left;
            int i7 = rect2.left;
            int i8 = rect.top;
            int i9 = rect2.top;
            int i10 = rect.right;
            int i11 = rect2.right;
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i10 - i6;
            int i15 = i12 - i8;
            int i16 = i11 - i7;
            int i17 = i13 - i9;
            Rect rect3 = (Rect) s4.f19959a.get(f20011D0);
            Rect rect4 = (Rect) s5.f19959a.get(f20011D0);
            if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
                i4 = 0;
            } else {
                i4 = (i6 == i7 && i8 == i9) ? 0 : 1;
                if (i10 != i11 || i12 != i13) {
                    i4++;
                }
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i4++;
            }
            if (i4 <= 0) {
                return null;
            }
            if (!this.f20023A0) {
                view = view2;
                f0.g(view, i6, i8, i10, i12);
                if (i4 == 2) {
                    if (i14 == i16 && i15 == i17) {
                        c4 = C0990y.a(view, f20021N0, Q().a(i6, i8, i7, i9));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a4 = C0990y.a(kVar, f20017J0, Q().a(i6, i8, i7, i9));
                        ObjectAnimator a5 = C0990y.a(kVar, f20018K0, Q().a(i10, i12, i11, i13));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a4, a5);
                        animatorSet.addListener(new h(kVar));
                        c4 = animatorSet;
                    }
                } else if (i6 == i7 && i8 == i9) {
                    c4 = C0990y.a(view, f20019L0, Q().a(i10, i12, i11, i13));
                } else {
                    c4 = C0990y.a(view, f20020M0, Q().a(i6, i8, i7, i9));
                }
            } else {
                view = view2;
                f0.g(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
                ObjectAnimator a6 = (i6 == i7 && i8 == i9) ? null : C0990y.a(view, f20021N0, Q().a(i6, i8, i7, i9));
                if (rect3 == null) {
                    i5 = 0;
                    rect3 = new Rect(0, 0, i14, i15);
                } else {
                    i5 = 0;
                }
                Rect rect5 = rect4 == null ? new Rect(i5, i5, i16, i17) : rect4;
                if (rect3.equals(rect5)) {
                    objectAnimator = null;
                } else {
                    C0823k0.M1(view, rect3);
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", f20022O0, rect3, rect5);
                    ofObject.addListener(new i(view, rect4, i7, i9, i11, i13));
                    objectAnimator = ofObject;
                }
                c4 = Q.c(a6, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                a0.d(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return c4;
        }
        int intValue = ((Integer) s4.f19959a.get(f20013F0)).intValue();
        int intValue2 = ((Integer) s4.f19959a.get(f20014G0)).intValue();
        int intValue3 = ((Integer) s5.f19959a.get(f20013F0)).intValue();
        int intValue4 = ((Integer) s5.f19959a.get(f20014G0)).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f20025z0);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c5 = f0.c(view2);
        f0.h(view2, 0.0f);
        f0.b(viewGroup).a(bitmapDrawable);
        AbstractC0991z Q3 = Q();
        int[] iArr = this.f20025z0;
        int i18 = iArr[0];
        int i19 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C.a(f20016I0, Q3.a(intValue - i18, intValue2 - i19, intValue3 - i18, intValue4 - i19)));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c5));
        return ofPropertyValuesHolder;
    }

    @SuppressLint({"RestrictedApi"})
    public C0973g(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20025z0 = new int[2];
        this.f20023A0 = false;
        this.f20024B0 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19838d);
        boolean e4 = androidx.core.content.res.n.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        H0(e4);
    }
}
