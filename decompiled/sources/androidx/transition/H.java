package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class H extends t0 {

    /* renamed from: K0, reason: collision with root package name */
    private static final String f19826K0 = "android:slide:screenPosition";

    /* renamed from: G0, reason: collision with root package name */
    private g f19833G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f19834H0;

    /* renamed from: I0, reason: collision with root package name */
    private static final TimeInterpolator f19824I0 = new DecelerateInterpolator();

    /* renamed from: J0, reason: collision with root package name */
    private static final TimeInterpolator f19825J0 = new AccelerateInterpolator();

    /* renamed from: L0, reason: collision with root package name */
    private static final g f19827L0 = new a();

    /* renamed from: M0, reason: collision with root package name */
    private static final g f19828M0 = new b();

    /* renamed from: N0, reason: collision with root package name */
    private static final g f19829N0 = new c();

    /* renamed from: O0, reason: collision with root package name */
    private static final g f19830O0 = new d();

    /* renamed from: P0, reason: collision with root package name */
    private static final g f19831P0 = new e();

    /* renamed from: Q0, reason: collision with root package name */
    private static final g f19832Q0 = new f();

    /* loaded from: classes.dex */
    class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.H.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.H.g
        public float b(ViewGroup viewGroup, View view) {
            if (C0823k0.Z(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.H.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.H.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.H.g
        public float b(ViewGroup viewGroup, View view) {
            if (C0823k0.Z(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.H.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* loaded from: classes.dex */
    private static abstract class h implements g {
        private h() {
        }

        @Override // androidx.transition.H.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class i implements g {
        private i() {
        }

        @Override // androidx.transition.H.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface j {
    }

    public H() {
        this.f19833G0 = f19832Q0;
        this.f19834H0 = 80;
        O0(80);
    }

    private void E0(S s4) {
        int[] iArr = new int[2];
        s4.f19960b.getLocationOnScreen(iArr);
        s4.f19959a.put(f19826K0, iArr);
    }

    @Override // androidx.transition.t0
    @androidx.annotation.P
    public Animator I0(ViewGroup viewGroup, View view, S s4, S s5) {
        if (s5 == null) {
            return null;
        }
        int[] iArr = (int[]) s5.f19959a.get(f19826K0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return U.a(view, s5, iArr[0], iArr[1], this.f19833G0.b(viewGroup, view), this.f19833G0.a(viewGroup, view), translationX, translationY, f19824I0, this);
    }

    @Override // androidx.transition.t0
    @androidx.annotation.P
    public Animator K0(ViewGroup viewGroup, View view, S s4, S s5) {
        if (s4 == null) {
            return null;
        }
        int[] iArr = (int[]) s4.f19959a.get(f19826K0);
        return U.a(view, s4, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f19833G0.b(viewGroup, view), this.f19833G0.a(viewGroup, view), f19825J0, this);
    }

    public int N0() {
        return this.f19834H0;
    }

    public void O0(int i4) {
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 48) {
                    if (i4 != 80) {
                        if (i4 != 8388611) {
                            if (i4 == 8388613) {
                                this.f19833G0 = f19831P0;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.f19833G0 = f19828M0;
                        }
                    } else {
                        this.f19833G0 = f19832Q0;
                    }
                } else {
                    this.f19833G0 = f19829N0;
                }
            } else {
                this.f19833G0 = f19830O0;
            }
        } else {
            this.f19833G0 = f19827L0;
        }
        this.f19834H0 = i4;
        G g4 = new G();
        g4.k(i4);
        A0(g4);
    }

    @Override // androidx.transition.t0, androidx.transition.J
    public void l(@androidx.annotation.N S s4) {
        super.l(s4);
        E0(s4);
    }

    @Override // androidx.transition.t0, androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        super.p(s4);
        E0(s4);
    }

    public H(int i4) {
        this.f19833G0 = f19832Q0;
        this.f19834H0 = 80;
        O0(i4);
    }

    @SuppressLint({"RestrictedApi"})
    public H(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19833G0 = f19832Q0;
        this.f19834H0 = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19842h);
        int k4 = androidx.core.content.res.n.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        O0(k4);
    }
}
