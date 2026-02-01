package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.C0967a;
import androidx.transition.D;
import androidx.transition.J;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class t0 extends J {

    /* renamed from: C0, reason: collision with root package name */
    private static final String f20166C0 = "android:visibility:screenLocation";

    /* renamed from: D0, reason: collision with root package name */
    public static final int f20167D0 = 1;

    /* renamed from: E0, reason: collision with root package name */
    public static final int f20168E0 = 2;

    /* renamed from: z0, reason: collision with root package name */
    private int f20170z0;

    /* renamed from: A0, reason: collision with root package name */
    static final String f20164A0 = "android:visibility:visibility";

    /* renamed from: B0, reason: collision with root package name */
    private static final String f20165B0 = "android:visibility:parent";

    /* renamed from: F0, reason: collision with root package name */
    private static final String[] f20169F0 = {f20164A0, f20165B0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends L {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f20172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f20173c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f20171a = viewGroup;
            this.f20172b = view;
            this.f20173c = view2;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void b(@androidx.annotation.N J j4) {
            a0.b(this.f20171a).d(this.f20172b);
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            this.f20173c.setTag(D.g.f19208Z0, null);
            a0.b(this.f20171a).d(this.f20172b);
            j4.m0(this);
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void e(@androidx.annotation.N J j4) {
            if (this.f20172b.getParent() == null) {
                a0.b(this.f20171a).c(this.f20172b);
            } else {
                t0.this.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements J.h, C0967a.InterfaceC0180a {

        /* renamed from: a, reason: collision with root package name */
        private final View f20175a;

        /* renamed from: b, reason: collision with root package name */
        private final int f20176b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f20177c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f20178d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20179e;

        /* renamed from: f, reason: collision with root package name */
        boolean f20180f = false;

        b(View view, int i4, boolean z3) {
            this.f20175a = view;
            this.f20176b = i4;
            this.f20177c = (ViewGroup) view.getParent();
            this.f20178d = z3;
            g(true);
        }

        private void f() {
            if (!this.f20180f) {
                f0.i(this.f20175a, this.f20176b);
                ViewGroup viewGroup = this.f20177c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z3) {
            ViewGroup viewGroup;
            if (this.f20178d && this.f20179e != z3 && (viewGroup = this.f20177c) != null) {
                this.f20179e = z3;
                a0.d(viewGroup, z3);
            }
        }

        @Override // androidx.transition.J.h
        public void a(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void b(@androidx.annotation.N J j4) {
            g(false);
        }

        @Override // androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            f();
            j4.m0(this);
        }

        @Override // androidx.transition.J.h
        public void d(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void e(@androidx.annotation.N J j4) {
            g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20180f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C0967a.InterfaceC0180a
        public void onAnimationPause(Animator animator) {
            if (!this.f20180f) {
                f0.i(this.f20175a, this.f20176b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C0967a.InterfaceC0180a
        public void onAnimationResume(Animator animator) {
            if (!this.f20180f) {
                f0.i(this.f20175a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        boolean f20181a;

        /* renamed from: b, reason: collision with root package name */
        boolean f20182b;

        /* renamed from: c, reason: collision with root package name */
        int f20183c;

        /* renamed from: d, reason: collision with root package name */
        int f20184d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f20185e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f20186f;

        d() {
        }
    }

    public t0() {
        this.f20170z0 = 3;
    }

    private void E0(S s4) {
        s4.f19959a.put(f20164A0, Integer.valueOf(s4.f19960b.getVisibility()));
        s4.f19959a.put(f20165B0, s4.f19960b.getParent());
        int[] iArr = new int[2];
        s4.f19960b.getLocationOnScreen(iArr);
        s4.f19959a.put(f20166C0, iArr);
    }

    private d G0(S s4, S s5) {
        d dVar = new d();
        dVar.f20181a = false;
        dVar.f20182b = false;
        if (s4 != null && s4.f19959a.containsKey(f20164A0)) {
            dVar.f20183c = ((Integer) s4.f19959a.get(f20164A0)).intValue();
            dVar.f20185e = (ViewGroup) s4.f19959a.get(f20165B0);
        } else {
            dVar.f20183c = -1;
            dVar.f20185e = null;
        }
        if (s5 != null && s5.f19959a.containsKey(f20164A0)) {
            dVar.f20184d = ((Integer) s5.f19959a.get(f20164A0)).intValue();
            dVar.f20186f = (ViewGroup) s5.f19959a.get(f20165B0);
        } else {
            dVar.f20184d = -1;
            dVar.f20186f = null;
        }
        if (s4 != null && s5 != null) {
            int i4 = dVar.f20183c;
            int i5 = dVar.f20184d;
            if (i4 == i5 && dVar.f20185e == dVar.f20186f) {
                return dVar;
            }
            if (i4 != i5) {
                if (i4 == 0) {
                    dVar.f20182b = false;
                    dVar.f20181a = true;
                } else if (i5 == 0) {
                    dVar.f20182b = true;
                    dVar.f20181a = true;
                }
            } else if (dVar.f20186f == null) {
                dVar.f20182b = false;
                dVar.f20181a = true;
            } else if (dVar.f20185e == null) {
                dVar.f20182b = true;
                dVar.f20181a = true;
            }
        } else if (s4 == null && dVar.f20184d == 0) {
            dVar.f20182b = true;
            dVar.f20181a = true;
        } else if (s5 == null && dVar.f20183c == 0) {
            dVar.f20182b = false;
            dVar.f20181a = true;
        }
        return dVar;
    }

    public int F0() {
        return this.f20170z0;
    }

    public boolean H0(S s4) {
        if (s4 == null) {
            return false;
        }
        int intValue = ((Integer) s4.f19959a.get(f20164A0)).intValue();
        View view = (View) s4.f19959a.get(f20165B0);
        if (intValue != 0 || view == null) {
            return false;
        }
        return true;
    }

    @androidx.annotation.P
    public Animator I0(ViewGroup viewGroup, View view, S s4, S s5) {
        return null;
    }

    @androidx.annotation.P
    public Animator J0(ViewGroup viewGroup, S s4, int i4, S s5, int i5) {
        if ((this.f20170z0 & 1) != 1 || s5 == null) {
            return null;
        }
        if (s4 == null) {
            View view = (View) s5.f19960b.getParent();
            if (G0(O(view, false), Z(view, false)).f20181a) {
                return null;
            }
        }
        return I0(viewGroup, s5.f19960b, s4, s5);
    }

    @androidx.annotation.P
    public Animator K0(ViewGroup viewGroup, View view, S s4, S s5) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r10.f19906Z != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator L0(android.view.ViewGroup r11, androidx.transition.S r12, int r13, androidx.transition.S r14, int r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.t0.L0(android.view.ViewGroup, androidx.transition.S, int, androidx.transition.S, int):android.animation.Animator");
    }

    public void M0(int i4) {
        if ((i4 & (-4)) == 0) {
            this.f20170z0 = i4;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // androidx.transition.J
    @androidx.annotation.P
    public String[] Y() {
        return f20169F0;
    }

    @Override // androidx.transition.J
    public boolean a0(@androidx.annotation.P S s4, @androidx.annotation.P S s5) {
        if (s4 == null && s5 == null) {
            return false;
        }
        if (s4 != null && s5 != null && s5.f19959a.containsKey(f20164A0) != s4.f19959a.containsKey(f20164A0)) {
            return false;
        }
        d G02 = G0(s4, s5);
        if (!G02.f20181a) {
            return false;
        }
        if (G02.f20183c != 0 && G02.f20184d != 0) {
            return false;
        }
        return true;
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
        d G02 = G0(s4, s5);
        if (G02.f20181a) {
            if (G02.f20185e != null || G02.f20186f != null) {
                if (G02.f20182b) {
                    return J0(viewGroup, s4, G02.f20183c, s5, G02.f20184d);
                }
                return L0(viewGroup, s4, G02.f20183c, s5, G02.f20184d);
            }
            return null;
        }
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public t0(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20170z0 = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19839e);
        int k4 = androidx.core.content.res.n.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k4 != 0) {
            M0(k4);
        }
    }
}
