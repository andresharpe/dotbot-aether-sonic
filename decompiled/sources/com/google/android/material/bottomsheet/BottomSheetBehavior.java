package com.google.android.material.bottomsheet;

import T0.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.annotation.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.U;
import androidx.customview.widget.d;
import com.google.android.material.internal.E;
import com.google.android.material.shape.o;
import com.google.firebase.remoteconfig.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import q.C2394a;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: d0, reason: collision with root package name */
    public static final int f31550d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f31551e0 = 2;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f31552f0 = 3;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f31553g0 = 4;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f31554h0 = 5;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f31555i0 = 6;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f31556j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f31557k0 = 1;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f31558l0 = 2;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f31559m0 = 4;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f31560n0 = 8;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f31561o0 = -1;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f31562p0 = 0;

    /* renamed from: q0, reason: collision with root package name */
    private static final String f31563q0 = "BottomSheetBehavior";

    /* renamed from: r0, reason: collision with root package name */
    private static final int f31564r0 = 500;

    /* renamed from: s0, reason: collision with root package name */
    private static final float f31565s0 = 0.5f;

    /* renamed from: t0, reason: collision with root package name */
    private static final float f31566t0 = 0.1f;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f31567u0 = 500;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f31568v0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f31569w0 = a.n.ce;

    /* renamed from: A, reason: collision with root package name */
    @P
    private ValueAnimator f31570A;

    /* renamed from: B, reason: collision with root package name */
    int f31571B;

    /* renamed from: C, reason: collision with root package name */
    int f31572C;

    /* renamed from: D, reason: collision with root package name */
    int f31573D;

    /* renamed from: E, reason: collision with root package name */
    float f31574E;

    /* renamed from: F, reason: collision with root package name */
    int f31575F;

    /* renamed from: G, reason: collision with root package name */
    float f31576G;

    /* renamed from: H, reason: collision with root package name */
    boolean f31577H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f31578I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f31579J;

    /* renamed from: K, reason: collision with root package name */
    int f31580K;

    /* renamed from: L, reason: collision with root package name */
    int f31581L;

    /* renamed from: M, reason: collision with root package name */
    @P
    androidx.customview.widget.d f31582M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f31583N;

    /* renamed from: O, reason: collision with root package name */
    private int f31584O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f31585P;

    /* renamed from: Q, reason: collision with root package name */
    private int f31586Q;

    /* renamed from: R, reason: collision with root package name */
    int f31587R;

    /* renamed from: S, reason: collision with root package name */
    int f31588S;

    /* renamed from: T, reason: collision with root package name */
    @P
    WeakReference<V> f31589T;

    /* renamed from: U, reason: collision with root package name */
    @P
    WeakReference<View> f31590U;

    /* renamed from: V, reason: collision with root package name */
    @N
    private final ArrayList<f> f31591V;

    /* renamed from: W, reason: collision with root package name */
    @P
    private VelocityTracker f31592W;

    /* renamed from: X, reason: collision with root package name */
    int f31593X;

    /* renamed from: Y, reason: collision with root package name */
    private int f31594Y;

    /* renamed from: Z, reason: collision with root package name */
    boolean f31595Z;

    /* renamed from: a, reason: collision with root package name */
    private int f31596a;

    /* renamed from: a0, reason: collision with root package name */
    @P
    private Map<View, Integer> f31597a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31598b;

    /* renamed from: b0, reason: collision with root package name */
    private int f31599b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31600c;

    /* renamed from: c0, reason: collision with root package name */
    private final d.c f31601c0;

    /* renamed from: d, reason: collision with root package name */
    private float f31602d;

    /* renamed from: e, reason: collision with root package name */
    private int f31603e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31604f;

    /* renamed from: g, reason: collision with root package name */
    private int f31605g;

    /* renamed from: h, reason: collision with root package name */
    private int f31606h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.android.material.shape.j f31607i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private ColorStateList f31608j;

    /* renamed from: k, reason: collision with root package name */
    private int f31609k;

    /* renamed from: l, reason: collision with root package name */
    private int f31610l;

    /* renamed from: m, reason: collision with root package name */
    private int f31611m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f31612n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f31613o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f31614p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f31615q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f31616r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31617s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f31618t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f31619u;

    /* renamed from: v, reason: collision with root package name */
    private int f31620v;

    /* renamed from: w, reason: collision with root package name */
    private int f31621w;

    /* renamed from: x, reason: collision with root package name */
    private o f31622x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f31623y;

    /* renamed from: z, reason: collision with root package name */
    private final BottomSheetBehavior<V>.k f31624z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f31625E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f31626F;

        a(View view, int i4) {
            this.f31625E = view;
            this.f31626F = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f1(this.f31625E, this.f31626F, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f31607i != null) {
                BottomSheetBehavior.this.f31607i.p0(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements E.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31629a;

        c(boolean z3) {
            this.f31629a = z3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        
            if (r6 != false) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
        @Override // com.google.android.material.internal.E.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.Y0 a(android.view.View r11, androidx.core.view.Y0 r12, com.google.android.material.internal.E.f r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.Y0.m.i()
                androidx.core.graphics.E r0 = r12.f(r0)
                int r1 = androidx.core.view.Y0.m.f()
                androidx.core.graphics.E r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f12400b
                com.google.android.material.bottomsheet.BottomSheetBehavior.P(r2, r3)
                boolean r2 = com.google.android.material.internal.E.k(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.o()
                com.google.android.material.bottomsheet.BottomSheetBehavior.S(r3, r6)
                int r3 = r13.f32518d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f32517c
                goto L50
            L4e:
                int r4 = r13.f32515a
            L50:
                int r6 = r0.f12399a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f32515a
                goto L62
            L60:
                int r13 = r13.f32517c
            L62:
                int r2 = r0.f12401c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r2)
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f12399a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r6
                goto L81
            L80:
                r2 = r7
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.W(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f12401c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                goto L93
            L92:
                r6 = r2
            L93:
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.H(r2)
                if (r2 == 0) goto La4
                int r2 = r13.topMargin
                int r0 = r0.f12400b
                if (r2 == r0) goto La4
                r13.topMargin = r0
                goto La6
            La4:
                if (r6 == 0) goto La9
            La6:
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f31629a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f12402d
                com.google.android.material.bottomsheet.BottomSheetBehavior.I(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f31629a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.J(r11, r7)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.Y0, com.google.android.material.internal.E$f):androidx.core.view.Y0");
        }
    }

    /* loaded from: classes2.dex */
    class d extends d.c {

        /* renamed from: a, reason: collision with root package name */
        private long f31631a;

        d() {
        }

        private boolean n(@N View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f31588S + bottomSheetBehavior.k0()) / 2) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@N View view, int i4, int i5) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.d.c
        public int b(@N View view, int i4, int i5) {
            int i6;
            int k02 = BottomSheetBehavior.this.k0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f31577H) {
                i6 = bottomSheetBehavior.f31588S;
            } else {
                i6 = bottomSheetBehavior.f31575F;
            }
            return C2394a.e(i4, k02, i6);
        }

        @Override // androidx.customview.widget.d.c
        public int e(@N View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f31577H) {
                return bottomSheetBehavior.f31588S;
            }
            return bottomSheetBehavior.f31575F;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            if (i4 == 1 && BottomSheetBehavior.this.f31579J) {
                BottomSheetBehavior.this.X0(1);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@N View view, int i4, int i5, int i6, int i7) {
            BottomSheetBehavior.this.g0(i5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            if (r7.f31632b.a1(r0, (r9 * 100.0f) / r10.f31588S) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        
            if (r9 > r7.f31632b.f31573D) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f31632b.k0()) < java.lang.Math.abs(r8.getTop() - r7.f31632b.f31573D)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        
            if (r7.f31632b.d1() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f31632b.f31572C) < java.lang.Math.abs(r9 - r7.f31632b.f31575F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
        
            if (r7.f31632b.d1() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
        
            if (r7.f31632b.d1() == false) goto L63;
         */
        @Override // androidx.customview.widget.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(@androidx.annotation.N android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@N View view, int i4) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i5 = bottomSheetBehavior.f31580K;
            if (i5 == 1 || bottomSheetBehavior.f31595Z) {
                return false;
            }
            if (i5 == 3 && bottomSheetBehavior.f31593X == i4) {
                WeakReference<View> weakReference = bottomSheetBehavior.f31590U;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f31631a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f31589T;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements U {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31633a;

        e(int i4) {
            this.f31633a = i4;
        }

        @Override // androidx.core.view.accessibility.U
        public boolean a(@N View view, @P U.a aVar) {
            BottomSheetBehavior.this.W0(this.f31633a);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f {
        void a(@N View view) {
        }

        public abstract void b(@N View view, float f4);

        public abstract void c(@N View view, int i4);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface g {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class h extends androidx.customview.view.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        final int f31635G;

        /* renamed from: H, reason: collision with root package name */
        int f31636H;

        /* renamed from: I, reason: collision with root package name */
        boolean f31637I;

        /* renamed from: J, reason: collision with root package name */
        boolean f31638J;

        /* renamed from: K, reason: collision with root package name */
        boolean f31639K;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @P
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@N Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i4) {
                return new h[i4];
            }
        }

        public h(@N Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f31635G);
            parcel.writeInt(this.f31636H);
            parcel.writeInt(this.f31637I ? 1 : 0);
            parcel.writeInt(this.f31638J ? 1 : 0);
            parcel.writeInt(this.f31639K ? 1 : 0);
        }

        public h(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31635G = parcel.readInt();
            this.f31636H = parcel.readInt();
            this.f31637I = parcel.readInt() == 1;
            this.f31638J = parcel.readInt() == 1;
            this.f31639K = parcel.readInt() == 1;
        }

        public h(Parcelable parcelable, @N BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f31635G = bottomSheetBehavior.f31580K;
            this.f31636H = ((BottomSheetBehavior) bottomSheetBehavior).f31603e;
            this.f31637I = ((BottomSheetBehavior) bottomSheetBehavior).f31598b;
            this.f31638J = bottomSheetBehavior.f31577H;
            this.f31639K = ((BottomSheetBehavior) bottomSheetBehavior).f31578I;
        }

        @Deprecated
        public h(Parcelable parcelable, int i4) {
            super(parcelable);
            this.f31635G = i4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface j {
    }

    public BottomSheetBehavior() {
        this.f31596a = 0;
        this.f31598b = true;
        this.f31600c = false;
        this.f31609k = -1;
        this.f31610l = -1;
        this.f31624z = new k(this, null);
        this.f31574E = 0.5f;
        this.f31576G = -1.0f;
        this.f31579J = true;
        this.f31580K = 4;
        this.f31581L = 4;
        this.f31591V = new ArrayList<>();
        this.f31599b0 = -1;
        this.f31601c0 = new d();
    }

    private boolean B0(V v3) {
        ViewParent parent = v3.getParent();
        if (parent != null && parent.isLayoutRequested() && C0823k0.O0(v3)) {
            return true;
        }
        return false;
    }

    private void E0(V v3, M.a aVar, int i4) {
        C0823k0.u1(v3, aVar, null, c0(i4));
    }

    private void F0() {
        this.f31593X = -1;
        VelocityTracker velocityTracker = this.f31592W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f31592W = null;
        }
    }

    private void G0(@N h hVar) {
        int i4 = this.f31596a;
        if (i4 == 0) {
            return;
        }
        if (i4 == -1 || (i4 & 1) == 1) {
            this.f31603e = hVar.f31636H;
        }
        if (i4 == -1 || (i4 & 2) == 2) {
            this.f31598b = hVar.f31637I;
        }
        if (i4 == -1 || (i4 & 4) == 4) {
            this.f31577H = hVar.f31638J;
        }
        if (i4 == -1 || (i4 & 8) == 8) {
            this.f31578I = hVar.f31639K;
        }
    }

    private void H0(V v3, Runnable runnable) {
        if (B0(v3)) {
            v3.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int X(V v3, @c0 int i4, int i5) {
        return C0823k0.c(v3, v3.getResources().getString(i4), c0(i5));
    }

    private void Z() {
        int b02 = b0();
        if (this.f31598b) {
            this.f31575F = Math.max(this.f31588S - b02, this.f31572C);
        } else {
            this.f31575F = this.f31588S - b02;
        }
    }

    private void Z0(@N View view) {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 29 && !z0() && !this.f31604f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.f31613o && !this.f31614p && !this.f31615q && !this.f31617s && !this.f31618t && !this.f31619u && !z3) {
            return;
        }
        E.d(view, new c(z3));
    }

    private void a0() {
        this.f31573D = (int) (this.f31588S * (1.0f - this.f31574E));
    }

    private int b0() {
        int i4;
        if (this.f31604f) {
            return Math.min(Math.max(this.f31605g, this.f31588S - ((this.f31587R * 9) / 16)), this.f31586Q) + this.f31620v;
        }
        if (!this.f31612n && !this.f31613o && (i4 = this.f31611m) > 0) {
            return Math.max(this.f31603e, i4 + this.f31606h);
        }
        return this.f31603e + this.f31620v;
    }

    private boolean b1() {
        if (this.f31582M != null && (this.f31579J || this.f31580K == 1)) {
            return true;
        }
        return false;
    }

    private U c0(int i4) {
        return new e(i4);
    }

    private void d0(@N Context context) {
        if (this.f31622x == null) {
            return;
        }
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(this.f31622x);
        this.f31607i = jVar;
        jVar.Z(context);
        ColorStateList colorStateList = this.f31608j;
        if (colorStateList != null) {
            this.f31607i.o0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f31607i.setTint(typedValue.data);
    }

    private void e0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f31570A = ofFloat;
        ofFloat.setDuration(500L);
        this.f31570A.addUpdateListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(View view, int i4, boolean z3) {
        int v02 = v0(i4);
        androidx.customview.widget.d dVar = this.f31582M;
        if (dVar != null && (!z3 ? dVar.X(view, view.getLeft(), v02) : dVar.V(view.getLeft(), v02))) {
            X0(2);
            h1(i4);
            this.f31624z.c(i4);
            return;
        }
        X0(i4);
    }

    private void g1() {
        V v3;
        WeakReference<V> weakReference = this.f31589T;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        C0823k0.r1(v3, 524288);
        C0823k0.r1(v3, 262144);
        C0823k0.r1(v3, 1048576);
        int i4 = this.f31599b0;
        if (i4 != -1) {
            C0823k0.r1(v3, i4);
        }
        int i5 = 6;
        if (!this.f31598b && this.f31580K != 6) {
            this.f31599b0 = X(v3, a.m.f3043D, 6);
        }
        if (this.f31577H && this.f31580K != 5) {
            E0(v3, M.a.f13391z, 5);
        }
        int i6 = this.f31580K;
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 == 6) {
                    E0(v3, M.a.f13390y, 4);
                    E0(v3, M.a.f13389x, 3);
                    return;
                }
                return;
            }
            if (this.f31598b) {
                i5 = 3;
            }
            E0(v3, M.a.f13389x, i5);
            return;
        }
        if (this.f31598b) {
            i5 = 4;
        }
        E0(v3, M.a.f13390y, i5);
    }

    private void h1(int i4) {
        boolean z3;
        ValueAnimator valueAnimator;
        float f4;
        if (i4 == 2) {
            return;
        }
        if (i4 == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f31623y != z3) {
            this.f31623y = z3;
            if (this.f31607i != null && (valueAnimator = this.f31570A) != null) {
                if (valueAnimator.isRunning()) {
                    this.f31570A.reverse();
                    return;
                }
                if (z3) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                this.f31570A.setFloatValues(1.0f - f4, f4);
                this.f31570A.start();
            }
        }
    }

    @N
    public static <V extends View> BottomSheetBehavior<V> i0(@N V v3) {
        ViewGroup.LayoutParams layoutParams = v3.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f4 = ((CoordinatorLayout.g) layoutParams).f();
            if (f4 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f4;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void i1(boolean z3) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f31589T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z3) {
            if (this.f31597a0 == null) {
                this.f31597a0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = coordinatorLayout.getChildAt(i4);
            if (childAt != this.f31589T.get()) {
                if (z3) {
                    this.f31597a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.f31600c) {
                        C0823k0.R1(childAt, 4);
                    }
                } else if (this.f31600c && (map = this.f31597a0) != null && map.containsKey(childAt)) {
                    C0823k0.R1(childAt, this.f31597a0.get(childAt).intValue());
                }
            }
        }
        if (!z3) {
            this.f31597a0 = null;
        } else if (this.f31600c) {
            this.f31589T.get().sendAccessibilityEvent(8);
        }
    }

    private int j0(int i4, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i6 = Math.min(size, i6);
            }
            return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(boolean z3) {
        V v3;
        if (this.f31589T != null) {
            Z();
            if (this.f31580K == 4 && (v3 = this.f31589T.get()) != null) {
                if (z3) {
                    W0(4);
                } else {
                    v3.requestLayout();
                }
            }
        }
    }

    private int v0(int i4) {
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    if (i4 == 6) {
                        return this.f31573D;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i4);
                }
                return this.f31588S;
            }
            return this.f31575F;
        }
        return k0();
    }

    private float w0() {
        VelocityTracker velocityTracker = this.f31592W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f31602d);
        return this.f31592W.getYVelocity(this.f31593X);
    }

    public boolean A0() {
        return this.f31577H;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean B(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, @N View view2, int i4, int i5) {
        this.f31584O = 0;
        this.f31585P = false;
        if ((i4 & 2) == 0) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean C0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.f31573D) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f31572C) < java.lang.Math.abs(r3 - r2.f31575F)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (d1() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f31575F)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f31573D) < java.lang.Math.abs(r3 - r2.f31575F)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(@androidx.annotation.N androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.N V r4, @androidx.annotation.N android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.k0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.X0(r0)
            return
        Lf:
            boolean r3 = r2.C0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f31590U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f31585P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f31584O
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f31598b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f31573D
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f31577H
            if (r3 == 0) goto L49
            float r3 = r2.w0()
            boolean r3 = r2.c1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f31584O
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f31598b
            if (r1 == 0) goto L68
            int r5 = r2.f31572C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f31575F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f31573D
            if (r3 >= r1) goto L7e
            int r1 = r2.f31575F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.d1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f31575F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f31598b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f31573D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f31575F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.f1(r4, r0, r3)
            r2.f31585P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void D0(@N f fVar) {
        this.f31591V.remove(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@N CoordinatorLayout coordinatorLayout, @N V v3, @N MotionEvent motionEvent) {
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f31580K == 1 && actionMasked == 0) {
            return true;
        }
        if (b1()) {
            this.f31582M.M(motionEvent);
        }
        if (actionMasked == 0) {
            F0();
        }
        if (this.f31592W == null) {
            this.f31592W = VelocityTracker.obtain();
        }
        this.f31592W.addMovement(motionEvent);
        if (b1() && actionMasked == 2 && !this.f31583N && Math.abs(this.f31594Y - motionEvent.getY()) > this.f31582M.E()) {
            this.f31582M.d(v3, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f31583N;
    }

    @Deprecated
    public void I0(f fVar) {
        Log.w(f31563q0, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f31591V.clear();
        if (fVar != null) {
            this.f31591V.add(fVar);
        }
    }

    public void J0(boolean z3) {
        this.f31579J = z3;
    }

    public void K0(int i4) {
        if (i4 >= 0) {
            this.f31571B = i4;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void L0(boolean z3) {
        int i4;
        if (this.f31598b == z3) {
            return;
        }
        this.f31598b = z3;
        if (this.f31589T != null) {
            Z();
        }
        if (this.f31598b && this.f31580K == 6) {
            i4 = 3;
        } else {
            i4 = this.f31580K;
        }
        X0(i4);
        g1();
    }

    public void M0(boolean z3) {
        this.f31612n = z3;
    }

    public void N0(@InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f4) {
        if (f4 > 0.0f && f4 < 1.0f) {
            this.f31574E = f4;
            if (this.f31589T != null) {
                a0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void O0(boolean z3) {
        if (this.f31577H != z3) {
            this.f31577H = z3;
            if (!z3 && this.f31580K == 5) {
                W0(4);
            }
            g1();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void P0(boolean z3) {
        this.f31577H = z3;
    }

    public void Q0(@androidx.annotation.U int i4) {
        this.f31610l = i4;
    }

    public void R0(@androidx.annotation.U int i4) {
        this.f31609k = i4;
    }

    public void S0(int i4) {
        T0(i4, false);
    }

    public final void T0(int i4, boolean z3) {
        if (i4 == -1) {
            if (!this.f31604f) {
                this.f31604f = true;
            } else {
                return;
            }
        } else if (this.f31604f || this.f31603e != i4) {
            this.f31604f = false;
            this.f31603e = Math.max(0, i4);
        } else {
            return;
        }
        j1(z3);
    }

    public void U0(int i4) {
        this.f31596a = i4;
    }

    public void V0(boolean z3) {
        this.f31578I = z3;
    }

    public void W0(int i4) {
        String str;
        int i5;
        if (i4 != 1 && i4 != 2) {
            if (!this.f31577H && i4 == 5) {
                Log.w(f31563q0, "Cannot set state: " + i4);
                return;
            }
            if (i4 == 6 && this.f31598b && v0(i4) <= this.f31572C) {
                i5 = 3;
            } else {
                i5 = i4;
            }
            WeakReference<V> weakReference = this.f31589T;
            if (weakReference != null && weakReference.get() != null) {
                V v3 = this.f31589T.get();
                H0(v3, new a(v3, i5));
                return;
            } else {
                X0(i4);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        if (i4 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    void X0(int i4) {
        V v3;
        if (this.f31580K == i4) {
            return;
        }
        this.f31580K = i4;
        if (i4 == 4 || i4 == 3 || i4 == 6 || (this.f31577H && i4 == 5)) {
            this.f31581L = i4;
        }
        WeakReference<V> weakReference = this.f31589T;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        if (i4 == 3) {
            i1(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            i1(false);
        }
        h1(i4);
        for (int i5 = 0; i5 < this.f31591V.size(); i5++) {
            this.f31591V.get(i5).c(v3, i4);
        }
        g1();
    }

    public void Y(@N f fVar) {
        if (!this.f31591V.contains(fVar)) {
            this.f31591V.add(fVar);
        }
    }

    public void Y0(boolean z3) {
        this.f31600c = z3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean a1(long j4, @InterfaceC0580x(from = 0.0d, to = 100.0d) float f4) {
        return false;
    }

    boolean c1(@N View view, float f4) {
        if (this.f31578I) {
            return true;
        }
        if (view.getTop() < this.f31575F) {
            return false;
        }
        if (Math.abs((view.getTop() + (f4 * 0.1f)) - this.f31575F) / b0() > 0.5f) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean d1() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean e1() {
        return true;
    }

    @i0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f0() {
        this.f31570A = null;
    }

    void g0(int i4) {
        float f4;
        float f5;
        V v3 = this.f31589T.get();
        if (v3 != null && !this.f31591V.isEmpty()) {
            int i5 = this.f31575F;
            if (i4 <= i5 && i5 != k0()) {
                int i6 = this.f31575F;
                f4 = i6 - i4;
                f5 = i6 - k0();
            } else {
                int i7 = this.f31575F;
                f4 = i7 - i4;
                f5 = this.f31588S - i7;
            }
            float f6 = f4 / f5;
            for (int i8 = 0; i8 < this.f31591V.size(); i8++) {
                this.f31591V.get(i8).b(v3, f6);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void h(@N CoordinatorLayout.g gVar) {
        super.h(gVar);
        this.f31589T = null;
        this.f31582M = null;
    }

    @P
    @i0
    View h0(View view) {
        if (C0823k0.W0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View h02 = h0(viewGroup.getChildAt(i4));
                if (h02 != null) {
                    return h02;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k() {
        super.k();
        this.f31589T = null;
        this.f31582M = null;
    }

    public int k0() {
        int i4;
        if (this.f31598b) {
            return this.f31572C;
        }
        int i5 = this.f31571B;
        if (this.f31616r) {
            i4 = 0;
        } else {
            i4 = this.f31621w;
        }
        return Math.max(i5, i4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@N CoordinatorLayout coordinatorLayout, @N V v3, @N MotionEvent motionEvent) {
        boolean z3;
        View view;
        androidx.customview.widget.d dVar;
        if (v3.isShown() && this.f31579J) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                F0();
            }
            if (this.f31592W == null) {
                this.f31592W = VelocityTracker.obtain();
            }
            this.f31592W.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f31595Z = false;
                    this.f31593X = -1;
                    if (this.f31583N) {
                        this.f31583N = false;
                        return false;
                    }
                }
            } else {
                int x3 = (int) motionEvent.getX();
                this.f31594Y = (int) motionEvent.getY();
                if (this.f31580K != 2) {
                    WeakReference<View> weakReference = this.f31590U;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.H(view, x3, this.f31594Y)) {
                        this.f31593X = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f31595Z = true;
                    }
                }
                if (this.f31593X == -1 && !coordinatorLayout.H(v3, x3, this.f31594Y)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f31583N = z3;
            }
            if (!this.f31583N && (dVar = this.f31582M) != null && dVar.W(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.f31590U;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.f31583N || this.f31580K == 1 || coordinatorLayout.H(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f31582M == null || Math.abs(this.f31594Y - motionEvent.getY()) <= this.f31582M.E()) {
                return false;
            }
            return true;
        }
        this.f31583N = true;
        return false;
    }

    @InterfaceC0580x(from = l.f37524n, to = 1.0d)
    public float l0() {
        return this.f31574E;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4) {
        boolean z3;
        float f4;
        if (C0823k0.U(coordinatorLayout) && !C0823k0.U(v3)) {
            v3.setFitsSystemWindows(true);
        }
        if (this.f31589T == null) {
            this.f31605g = coordinatorLayout.getResources().getDimensionPixelSize(a.f.f2384e1);
            Z0(v3);
            this.f31589T = new WeakReference<>(v3);
            com.google.android.material.shape.j jVar = this.f31607i;
            if (jVar != null) {
                C0823k0.I1(v3, jVar);
                com.google.android.material.shape.j jVar2 = this.f31607i;
                float f5 = this.f31576G;
                if (f5 == -1.0f) {
                    f5 = C0823k0.R(v3);
                }
                jVar2.n0(f5);
                if (this.f31580K == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f31623y = z3;
                com.google.android.material.shape.j jVar3 = this.f31607i;
                if (z3) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                jVar3.p0(f4);
            } else {
                ColorStateList colorStateList = this.f31608j;
                if (colorStateList != null) {
                    C0823k0.J1(v3, colorStateList);
                }
            }
            g1();
            if (C0823k0.V(v3) == 0) {
                C0823k0.R1(v3, 1);
            }
        }
        if (this.f31582M == null) {
            this.f31582M = androidx.customview.widget.d.q(coordinatorLayout, this.f31601c0);
        }
        int top = v3.getTop();
        coordinatorLayout.P(v3, i4);
        this.f31587R = coordinatorLayout.getWidth();
        this.f31588S = coordinatorLayout.getHeight();
        int height = v3.getHeight();
        this.f31586Q = height;
        int i5 = this.f31588S;
        int i6 = i5 - height;
        int i7 = this.f31621w;
        if (i6 < i7) {
            if (this.f31616r) {
                this.f31586Q = i5;
            } else {
                this.f31586Q = i5 - i7;
            }
        }
        this.f31572C = Math.max(0, i5 - this.f31586Q);
        a0();
        Z();
        int i8 = this.f31580K;
        if (i8 == 3) {
            C0823k0.f1(v3, k0());
        } else if (i8 == 6) {
            C0823k0.f1(v3, this.f31573D);
        } else if (this.f31577H && i8 == 5) {
            C0823k0.f1(v3, this.f31588S);
        } else if (i8 == 4) {
            C0823k0.f1(v3, this.f31575F);
        } else if (i8 == 1 || i8 == 2) {
            C0823k0.f1(v3, top - v3.getTop());
        }
        this.f31590U = new WeakReference<>(h0(v3));
        for (int i9 = 0; i9 < this.f31591V.size(); i9++) {
            this.f31591V.get(i9).a(v3);
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int m0() {
        return this.f31581L;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3.getLayoutParams();
        v3.measure(j0(i4, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f31609k, marginLayoutParams.width), j0(i6, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, this.f31610l, marginLayoutParams.height));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.shape.j n0() {
        return this.f31607i;
    }

    @androidx.annotation.U
    public int o0() {
        return this.f31610l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, float f4, float f5) {
        WeakReference<View> weakReference;
        if (!C0() || (weakReference = this.f31590U) == null || view != weakReference.get()) {
            return false;
        }
        if (this.f31580K == 3 && !super.p(coordinatorLayout, v3, view, f4, f5)) {
            return false;
        }
        return true;
    }

    @androidx.annotation.U
    public int p0() {
        return this.f31609k;
    }

    public int q0() {
        if (this.f31604f) {
            return -1;
        }
        return this.f31603e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, @N int[] iArr, int i6) {
        View view2;
        if (i6 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f31590U;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (C0() && view != view2) {
            return;
        }
        int top = v3.getTop();
        int i7 = top - i5;
        if (i5 > 0) {
            if (i7 < k0()) {
                int k02 = top - k0();
                iArr[1] = k02;
                C0823k0.f1(v3, -k02);
                X0(3);
            } else {
                if (!this.f31579J) {
                    return;
                }
                iArr[1] = i5;
                C0823k0.f1(v3, -i5);
                X0(1);
            }
        } else if (i5 < 0 && !view.canScrollVertically(-1)) {
            int i8 = this.f31575F;
            if (i7 > i8 && !this.f31577H) {
                int i9 = top - i8;
                iArr[1] = i9;
                C0823k0.f1(v3, -i9);
                X0(4);
            } else {
                if (!this.f31579J) {
                    return;
                }
                iArr[1] = i5;
                C0823k0.f1(v3, -i5);
                X0(1);
            }
        }
        g0(v3.getTop());
        this.f31584O = i5;
        this.f31585P = true;
    }

    @i0
    int r0() {
        return this.f31605g;
    }

    public int s0() {
        return this.f31596a;
    }

    public boolean t0() {
        return this.f31578I;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, int i6, int i7, int i8, @N int[] iArr) {
    }

    public int u0() {
        return this.f31580K;
    }

    public boolean x0() {
        return this.f31579J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void y(@N CoordinatorLayout coordinatorLayout, @N V v3, @N Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.y(coordinatorLayout, v3, hVar.a());
        G0(hVar);
        int i4 = hVar.f31635G;
        if (i4 != 1 && i4 != 2) {
            this.f31580K = i4;
            this.f31581L = i4;
        } else {
            this.f31580K = 4;
            this.f31581L = 4;
        }
    }

    public boolean y0() {
        return this.f31598b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @N
    public Parcelable z(@N CoordinatorLayout coordinatorLayout, @N V v3) {
        return new h(super.z(coordinatorLayout, v3), (BottomSheetBehavior<?>) this);
    }

    public boolean z0() {
        return this.f31612n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class k {

        /* renamed from: a, reason: collision with root package name */
        private int f31640a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31641b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f31642c;

        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f31641b = false;
                androidx.customview.widget.d dVar = BottomSheetBehavior.this.f31582M;
                if (dVar != null && dVar.o(true)) {
                    k kVar = k.this;
                    kVar.c(kVar.f31640a);
                    return;
                }
                k kVar2 = k.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f31580K == 2) {
                    bottomSheetBehavior.X0(kVar2.f31640a);
                }
            }
        }

        private k() {
            this.f31642c = new a();
        }

        void c(int i4) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f31589T;
            if (weakReference != null && weakReference.get() != null) {
                this.f31640a = i4;
                if (!this.f31641b) {
                    C0823k0.p1(BottomSheetBehavior.this.f31589T.get(), this.f31642c);
                    this.f31641b = true;
                }
            }
        }

        /* synthetic */ k(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        int i4;
        this.f31596a = 0;
        this.f31598b = true;
        this.f31600c = false;
        this.f31609k = -1;
        this.f31610l = -1;
        this.f31624z = new k(this, null);
        this.f31574E = 0.5f;
        this.f31576G = -1.0f;
        this.f31579J = true;
        this.f31580K = 4;
        this.f31581L = 4;
        this.f31591V = new ArrayList<>();
        this.f31599b0 = -1;
        this.f31601c0 = new d();
        this.f31606h = context.getResources().getDimensionPixelSize(a.f.n8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.J4);
        if (obtainStyledAttributes.hasValue(a.o.N4)) {
            this.f31608j = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.N4);
        }
        if (obtainStyledAttributes.hasValue(a.o.e5)) {
            this.f31622x = o.e(context, attributeSet, a.c.f1870R0, f31569w0).m();
        }
        d0(context);
        e0();
        this.f31576G = obtainStyledAttributes.getDimension(a.o.M4, -1.0f);
        if (obtainStyledAttributes.hasValue(a.o.K4)) {
            R0(obtainStyledAttributes.getDimensionPixelSize(a.o.K4, -1));
        }
        if (obtainStyledAttributes.hasValue(a.o.L4)) {
            Q0(obtainStyledAttributes.getDimensionPixelSize(a.o.L4, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(a.o.T4);
        if (peekValue != null && (i4 = peekValue.data) == -1) {
            S0(i4);
        } else {
            S0(obtainStyledAttributes.getDimensionPixelSize(a.o.T4, -1));
        }
        O0(obtainStyledAttributes.getBoolean(a.o.S4, false));
        M0(obtainStyledAttributes.getBoolean(a.o.W4, false));
        L0(obtainStyledAttributes.getBoolean(a.o.Q4, true));
        V0(obtainStyledAttributes.getBoolean(a.o.V4, false));
        J0(obtainStyledAttributes.getBoolean(a.o.O4, true));
        U0(obtainStyledAttributes.getInt(a.o.U4, 0));
        N0(obtainStyledAttributes.getFloat(a.o.R4, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(a.o.P4);
        if (peekValue2 != null && peekValue2.type == 16) {
            K0(peekValue2.data);
        } else {
            K0(obtainStyledAttributes.getDimensionPixelOffset(a.o.P4, 0));
        }
        this.f31613o = obtainStyledAttributes.getBoolean(a.o.a5, false);
        this.f31614p = obtainStyledAttributes.getBoolean(a.o.b5, false);
        this.f31615q = obtainStyledAttributes.getBoolean(a.o.c5, false);
        this.f31616r = obtainStyledAttributes.getBoolean(a.o.d5, true);
        this.f31617s = obtainStyledAttributes.getBoolean(a.o.X4, false);
        this.f31618t = obtainStyledAttributes.getBoolean(a.o.Y4, false);
        this.f31619u = obtainStyledAttributes.getBoolean(a.o.Z4, false);
        obtainStyledAttributes.recycle();
        this.f31602d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
