package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.core.content.C0669d;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;
import androidx.core.view.accessibility.M;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class d extends ViewGroup {

    /* renamed from: M0, reason: collision with root package name */
    private static final String f20509M0 = "ViewPager";

    /* renamed from: N0, reason: collision with root package name */
    private static final boolean f20510N0 = false;

    /* renamed from: O0, reason: collision with root package name */
    private static final boolean f20511O0 = false;

    /* renamed from: P0, reason: collision with root package name */
    private static final int f20512P0 = 1;

    /* renamed from: Q0, reason: collision with root package name */
    private static final int f20513Q0 = 600;

    /* renamed from: R0, reason: collision with root package name */
    private static final int f20514R0 = 25;

    /* renamed from: S0, reason: collision with root package name */
    private static final int f20515S0 = 16;

    /* renamed from: T0, reason: collision with root package name */
    private static final int f20516T0 = 400;

    /* renamed from: X0, reason: collision with root package name */
    private static final int f20520X0 = -1;

    /* renamed from: Y0, reason: collision with root package name */
    private static final int f20521Y0 = 2;

    /* renamed from: Z0, reason: collision with root package name */
    private static final int f20522Z0 = 0;

    /* renamed from: a1, reason: collision with root package name */
    private static final int f20523a1 = 1;

    /* renamed from: b1, reason: collision with root package name */
    private static final int f20524b1 = 2;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f20526d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f20527e1 = 1;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f20528f1 = 2;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f20529A0;

    /* renamed from: B0, reason: collision with root package name */
    private int f20530B0;

    /* renamed from: C0, reason: collision with root package name */
    private List<j> f20531C0;

    /* renamed from: D0, reason: collision with root package name */
    private j f20532D0;

    /* renamed from: E, reason: collision with root package name */
    private int f20533E;

    /* renamed from: E0, reason: collision with root package name */
    private j f20534E0;

    /* renamed from: F, reason: collision with root package name */
    private final ArrayList<f> f20535F;

    /* renamed from: F0, reason: collision with root package name */
    private List<i> f20536F0;

    /* renamed from: G, reason: collision with root package name */
    private final f f20537G;

    /* renamed from: G0, reason: collision with root package name */
    private k f20538G0;

    /* renamed from: H, reason: collision with root package name */
    private final Rect f20539H;

    /* renamed from: H0, reason: collision with root package name */
    private int f20540H0;

    /* renamed from: I, reason: collision with root package name */
    androidx.viewpager.widget.a f20541I;

    /* renamed from: I0, reason: collision with root package name */
    private int f20542I0;

    /* renamed from: J, reason: collision with root package name */
    int f20543J;

    /* renamed from: J0, reason: collision with root package name */
    private ArrayList<View> f20544J0;

    /* renamed from: K, reason: collision with root package name */
    private int f20545K;

    /* renamed from: K0, reason: collision with root package name */
    private final Runnable f20546K0;

    /* renamed from: L, reason: collision with root package name */
    private Parcelable f20547L;

    /* renamed from: L0, reason: collision with root package name */
    private int f20548L0;

    /* renamed from: M, reason: collision with root package name */
    private ClassLoader f20549M;

    /* renamed from: N, reason: collision with root package name */
    private Scroller f20550N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f20551O;

    /* renamed from: P, reason: collision with root package name */
    private l f20552P;

    /* renamed from: Q, reason: collision with root package name */
    private int f20553Q;

    /* renamed from: R, reason: collision with root package name */
    private Drawable f20554R;

    /* renamed from: S, reason: collision with root package name */
    private int f20555S;

    /* renamed from: T, reason: collision with root package name */
    private int f20556T;

    /* renamed from: U, reason: collision with root package name */
    private float f20557U;

    /* renamed from: V, reason: collision with root package name */
    private float f20558V;

    /* renamed from: W, reason: collision with root package name */
    private int f20559W;

    /* renamed from: a0, reason: collision with root package name */
    private int f20560a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f20561b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f20562c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f20563d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f20564e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f20565f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f20566g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f20567h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f20568i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f20569j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f20570k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f20571l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f20572m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f20573n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f20574o0;

    /* renamed from: p0, reason: collision with root package name */
    private VelocityTracker f20575p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f20576q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f20577r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f20578s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f20579t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f20580u0;

    /* renamed from: v0, reason: collision with root package name */
    private long f20581v0;

    /* renamed from: w0, reason: collision with root package name */
    private EdgeEffect f20582w0;

    /* renamed from: x0, reason: collision with root package name */
    private EdgeEffect f20583x0;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f20584y0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f20585z0;

    /* renamed from: U0, reason: collision with root package name */
    static final int[] f20517U0 = {R.attr.layout_gravity};

    /* renamed from: V0, reason: collision with root package name */
    private static final Comparator<f> f20518V0 = new a();

    /* renamed from: W0, reason: collision with root package name */
    private static final Interpolator f20519W0 = new b();

    /* renamed from: c1, reason: collision with root package name */
    private static final o f20525c1 = new o();

    /* loaded from: classes.dex */
    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f20590b - fVar2.f20590b;
        }
    }

    /* loaded from: classes.dex */
    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.setScrollState(0);
            d.this.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0186d implements InterfaceC0772a0 {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f20587a = new Rect();

        C0186d() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, Y0 y02) {
            Y0 g12 = C0823k0.g1(view, y02);
            if (g12.A()) {
                return g12;
            }
            Rect rect = this.f20587a;
            rect.left = g12.p();
            rect.top = g12.r();
            rect.right = g12.q();
            rect.bottom = g12.o();
            int childCount = d.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                Y0 p4 = C0823k0.p(d.this.getChildAt(i4), g12);
                rect.left = Math.min(p4.p(), rect.left);
                rect.top = Math.min(p4.r(), rect.top);
                rect.right = Math.min(p4.q(), rect.right);
                rect.bottom = Math.min(p4.o(), rect.bottom);
            }
            return g12.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f20589a;

        /* renamed from: b, reason: collision with root package name */
        int f20590b;

        /* renamed from: c, reason: collision with root package name */
        boolean f20591c;

        /* renamed from: d, reason: collision with root package name */
        float f20592d;

        /* renamed from: e, reason: collision with root package name */
        float f20593e;

        f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends C0771a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = d.this.f20541I;
            if (aVar != null && aVar.e() > 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.C0771a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(d.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = d.this.f20541I) != null) {
                accessibilityEvent.setItemCount(aVar.e());
                accessibilityEvent.setFromIndex(d.this.f20543J);
                accessibilityEvent.setToIndex(d.this.f20543J);
            }
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.Z0(d.class.getName());
            m4.I1(n());
            if (d.this.canScrollHorizontally(1)) {
                m4.a(4096);
            }
            if (d.this.canScrollHorizontally(-1)) {
                m4.a(8192);
            }
        }

        @Override // androidx.core.view.C0771a
        public boolean j(View view, int i4, Bundle bundle) {
            if (super.j(view, i4, bundle)) {
                return true;
            }
            if (i4 != 4096) {
                if (i4 != 8192 || !d.this.canScrollHorizontally(-1)) {
                    return false;
                }
                d dVar = d.this;
                dVar.setCurrentItem(dVar.f20543J - 1);
                return true;
            }
            if (!d.this.canScrollHorizontally(1)) {
                return false;
            }
            d dVar2 = d.this;
            dVar2.setCurrentItem(dVar2.f20543J + 1);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void b(@N d dVar, @P androidx.viewpager.widget.a aVar, @P androidx.viewpager.widget.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(int i4, float f4, @U int i5);

        void c(int i4);

        void d(int i4);
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(@N View view, float f4);
    }

    /* loaded from: classes.dex */
    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            d.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            d.this.j();
        }
    }

    /* loaded from: classes.dex */
    public static class m extends androidx.customview.view.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        int f20602G;

        /* renamed from: H, reason: collision with root package name */
        Parcelable f20603H;

        /* renamed from: I, reason: collision with root package name */
        ClassLoader f20604I;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i4) {
                return new m[i4];
            }
        }

        public m(@N Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f20602G + "}";
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f20602G);
            parcel.writeParcelable(this.f20603H, i4);
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f20602G = parcel.readInt();
            this.f20603H = parcel.readParcelable(classLoader);
            this.f20604I = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements j {
        @Override // androidx.viewpager.widget.d.j
        public void a(int i4, float f4, int i5) {
        }

        @Override // androidx.viewpager.widget.d.j
        public void c(int i4) {
        }

        @Override // androidx.viewpager.widget.d.j
        public void d(int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o implements Comparator<View> {
        o() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z3 = gVar.f20594a;
            if (z3 != gVar2.f20594a) {
                if (z3) {
                    return 1;
                }
                return -1;
            }
            return gVar.f20598e - gVar2.f20598e;
        }
    }

    public d(@N Context context) {
        super(context);
        this.f20535F = new ArrayList<>();
        this.f20537G = new f();
        this.f20539H = new Rect();
        this.f20545K = -1;
        this.f20547L = null;
        this.f20549M = null;
        this.f20557U = -3.4028235E38f;
        this.f20558V = Float.MAX_VALUE;
        this.f20564e0 = 1;
        this.f20574o0 = -1;
        this.f20584y0 = true;
        this.f20585z0 = false;
        this.f20546K0 = new c();
        this.f20548L0 = 0;
        z();
    }

    private static boolean A(@N View view) {
        if (view.getClass().getAnnotation(e.class) != null) {
            return true;
        }
        return false;
    }

    private boolean C(float f4, float f5) {
        if ((f4 < this.f20568i0 && f5 > 0.0f) || (f4 > getWidth() - this.f20568i0 && f5 < 0.0f)) {
            return true;
        }
        return false;
    }

    private void E(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f20574o0) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f20570k0 = motionEvent.getX(i4);
            this.f20574o0 = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f20575p0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean H(int i4) {
        if (this.f20535F.size() == 0) {
            if (this.f20584y0) {
                return false;
            }
            this.f20529A0 = false;
            D(0, 0.0f, 0);
            if (this.f20529A0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f x3 = x();
        int clientWidth = getClientWidth();
        int i5 = this.f20553Q;
        int i6 = clientWidth + i5;
        float f4 = clientWidth;
        int i7 = x3.f20590b;
        float f5 = ((i4 / f4) - x3.f20593e) / (x3.f20592d + (i5 / f4));
        this.f20529A0 = false;
        D(i7, f5, (int) (i6 * f5));
        if (this.f20529A0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean I(float f4) {
        boolean z3;
        boolean z4;
        float f5 = this.f20570k0 - f4;
        this.f20570k0 = f4;
        float scrollX = getScrollX() + f5;
        float clientWidth = getClientWidth();
        float f6 = this.f20557U * clientWidth;
        float f7 = this.f20558V * clientWidth;
        boolean z5 = false;
        f fVar = this.f20535F.get(0);
        ArrayList<f> arrayList = this.f20535F;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f20590b != 0) {
            f6 = fVar.f20593e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (fVar2.f20590b != this.f20541I.e() - 1) {
            f7 = fVar2.f20593e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (scrollX < f6) {
            if (z3) {
                this.f20582w0.onPull(Math.abs(f6 - scrollX) / clientWidth);
                z5 = true;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z4) {
                this.f20583x0.onPull(Math.abs(scrollX - f7) / clientWidth);
                z5 = true;
            }
            scrollX = f7;
        }
        int i4 = (int) scrollX;
        this.f20570k0 += scrollX - i4;
        scrollTo(i4, getScrollY());
        H(i4);
        return z5;
    }

    private void L(int i4, int i5, int i6, int i7) {
        float f4;
        if (i5 > 0 && !this.f20535F.isEmpty()) {
            if (!this.f20550N.isFinished()) {
                this.f20550N.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i5 - getPaddingLeft()) - getPaddingRight()) + i7)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i6)), getScrollY());
            return;
        }
        f y3 = y(this.f20543J);
        if (y3 != null) {
            f4 = Math.min(y3.f20593e, this.f20558V);
        } else {
            f4 = 0.0f;
        }
        int paddingLeft = (int) (f4 * ((i4 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            i(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private void M() {
        int i4 = 0;
        while (i4 < getChildCount()) {
            if (!((g) getChildAt(i4).getLayoutParams()).f20594a) {
                removeViewAt(i4);
                i4--;
            }
            i4++;
        }
    }

    private void P(boolean z3) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z3);
        }
    }

    private boolean Q() {
        this.f20574o0 = -1;
        q();
        this.f20582w0.onRelease();
        this.f20583x0.onRelease();
        if (!this.f20582w0.isFinished() && !this.f20583x0.isFinished()) {
            return false;
        }
        return true;
    }

    private void R(int i4, boolean z3, int i5, boolean z4) {
        int i6;
        f y3 = y(i4);
        if (y3 != null) {
            i6 = (int) (getClientWidth() * Math.max(this.f20557U, Math.min(y3.f20593e, this.f20558V)));
        } else {
            i6 = 0;
        }
        if (z3) {
            Z(i6, 0, i5);
            if (z4) {
                m(i4);
                return;
            }
            return;
        }
        if (z4) {
            m(i4);
        }
        i(false);
        scrollTo(i6, 0);
        H(i6);
    }

    private void a0() {
        if (this.f20542I0 != 0) {
            ArrayList<View> arrayList = this.f20544J0;
            if (arrayList == null) {
                this.f20544J0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.f20544J0.add(getChildAt(i4));
            }
            Collections.sort(this.f20544J0, f20525c1);
        }
    }

    private void f(f fVar, int i4, f fVar2) {
        float f4;
        float f5;
        float f6;
        int i5;
        int i6;
        f fVar3;
        f fVar4;
        int e4 = this.f20541I.e();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f4 = this.f20553Q / clientWidth;
        } else {
            f4 = 0.0f;
        }
        if (fVar2 != null) {
            int i7 = fVar2.f20590b;
            int i8 = fVar.f20590b;
            if (i7 < i8) {
                float f7 = fVar2.f20593e + fVar2.f20592d + f4;
                int i9 = i7 + 1;
                int i10 = 0;
                while (i9 <= fVar.f20590b && i10 < this.f20535F.size()) {
                    f fVar5 = this.f20535F.get(i10);
                    while (true) {
                        fVar4 = fVar5;
                        if (i9 <= fVar4.f20590b || i10 >= this.f20535F.size() - 1) {
                            break;
                        }
                        i10++;
                        fVar5 = this.f20535F.get(i10);
                    }
                    while (i9 < fVar4.f20590b) {
                        f7 += this.f20541I.h(i9) + f4;
                        i9++;
                    }
                    fVar4.f20593e = f7;
                    f7 += fVar4.f20592d + f4;
                    i9++;
                }
            } else if (i7 > i8) {
                int size = this.f20535F.size() - 1;
                float f8 = fVar2.f20593e;
                while (true) {
                    i7--;
                    if (i7 < fVar.f20590b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f20535F.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i7 >= fVar3.f20590b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f20535F.get(size);
                    }
                    while (i7 > fVar3.f20590b) {
                        f8 -= this.f20541I.h(i7) + f4;
                        i7--;
                    }
                    f8 -= fVar3.f20592d + f4;
                    fVar3.f20593e = f8;
                }
            }
        }
        int size2 = this.f20535F.size();
        float f9 = fVar.f20593e;
        int i11 = fVar.f20590b;
        int i12 = i11 - 1;
        if (i11 == 0) {
            f5 = f9;
        } else {
            f5 = -3.4028235E38f;
        }
        this.f20557U = f5;
        int i13 = e4 - 1;
        if (i11 == i13) {
            f6 = (fVar.f20592d + f9) - 1.0f;
        } else {
            f6 = Float.MAX_VALUE;
        }
        this.f20558V = f6;
        int i14 = i4 - 1;
        while (i14 >= 0) {
            f fVar7 = this.f20535F.get(i14);
            while (true) {
                i6 = fVar7.f20590b;
                if (i12 <= i6) {
                    break;
                }
                f9 -= this.f20541I.h(i12) + f4;
                i12--;
            }
            f9 -= fVar7.f20592d + f4;
            fVar7.f20593e = f9;
            if (i6 == 0) {
                this.f20557U = f9;
            }
            i14--;
            i12--;
        }
        float f10 = fVar.f20593e + fVar.f20592d + f4;
        int i15 = fVar.f20590b + 1;
        int i16 = i4 + 1;
        while (i16 < size2) {
            f fVar8 = this.f20535F.get(i16);
            while (true) {
                i5 = fVar8.f20590b;
                if (i15 >= i5) {
                    break;
                }
                f10 += this.f20541I.h(i15) + f4;
                i15++;
            }
            if (i5 == i13) {
                this.f20558V = (fVar8.f20592d + f10) - 1.0f;
            }
            fVar8.f20593e = f10;
            f10 += fVar8.f20592d + f4;
            i16++;
            i15++;
        }
        this.f20585z0 = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i(boolean z3) {
        boolean z4;
        if (this.f20548L0 == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setScrollingCacheEnabled(false);
            if (!this.f20550N.isFinished()) {
                this.f20550N.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f20550N.getCurrX();
                int currY = this.f20550N.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.f20563d0 = false;
        for (int i4 = 0; i4 < this.f20535F.size(); i4++) {
            f fVar = this.f20535F.get(i4);
            if (fVar.f20591c) {
                fVar.f20591c = false;
                z4 = true;
            }
        }
        if (z4) {
            if (z3) {
                C0823k0.p1(this, this.f20546K0);
            } else {
                this.f20546K0.run();
            }
        }
    }

    private int k(int i4, float f4, int i5, int i6) {
        float f5;
        if (Math.abs(i6) > this.f20578s0 && Math.abs(i5) > this.f20576q0) {
            if (i5 <= 0) {
                i4++;
            }
        } else {
            if (i4 >= this.f20543J) {
                f5 = 0.4f;
            } else {
                f5 = 0.6f;
            }
            i4 += (int) (f4 + f5);
        }
        if (this.f20535F.size() > 0) {
            return Math.max(this.f20535F.get(0).f20590b, Math.min(i4, this.f20535F.get(r4.size() - 1).f20590b));
        }
        return i4;
    }

    private void l(int i4, float f4, int i5) {
        j jVar = this.f20532D0;
        if (jVar != null) {
            jVar.a(i4, f4, i5);
        }
        List<j> list = this.f20531C0;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar2 = this.f20531C0.get(i6);
                if (jVar2 != null) {
                    jVar2.a(i4, f4, i5);
                }
            }
        }
        j jVar3 = this.f20534E0;
        if (jVar3 != null) {
            jVar3.a(i4, f4, i5);
        }
    }

    private void m(int i4) {
        j jVar = this.f20532D0;
        if (jVar != null) {
            jVar.d(i4);
        }
        List<j> list = this.f20531C0;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                j jVar2 = this.f20531C0.get(i5);
                if (jVar2 != null) {
                    jVar2.d(i4);
                }
            }
        }
        j jVar3 = this.f20534E0;
        if (jVar3 != null) {
            jVar3.d(i4);
        }
    }

    private void n(int i4) {
        j jVar = this.f20532D0;
        if (jVar != null) {
            jVar.c(i4);
        }
        List<j> list = this.f20531C0;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                j jVar2 = this.f20531C0.get(i5);
                if (jVar2 != null) {
                    jVar2.c(i4);
                }
            }
        }
        j jVar3 = this.f20534E0;
        if (jVar3 != null) {
            jVar3.c(i4);
        }
    }

    private void p(boolean z3) {
        int i4;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (z3) {
                i4 = this.f20540H0;
            } else {
                i4 = 0;
            }
            getChildAt(i5).setLayerType(i4, null);
        }
    }

    private void q() {
        this.f20565f0 = false;
        this.f20566g0 = false;
        VelocityTracker velocityTracker = this.f20575p0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20575p0 = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.f20562c0 != z3) {
            this.f20562c0 = z3;
        }
    }

    private Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f x() {
        float f4;
        float f5;
        int i4;
        int clientWidth = getClientWidth();
        float f6 = 0.0f;
        if (clientWidth > 0) {
            f4 = getScrollX() / clientWidth;
        } else {
            f4 = 0.0f;
        }
        if (clientWidth > 0) {
            f5 = this.f20553Q / clientWidth;
        } else {
            f5 = 0.0f;
        }
        int i5 = 0;
        boolean z3 = true;
        f fVar = null;
        int i6 = -1;
        float f7 = 0.0f;
        while (i5 < this.f20535F.size()) {
            f fVar2 = this.f20535F.get(i5);
            if (!z3 && fVar2.f20590b != (i4 = i6 + 1)) {
                fVar2 = this.f20537G;
                fVar2.f20593e = f6 + f7 + f5;
                fVar2.f20590b = i4;
                fVar2.f20592d = this.f20541I.h(i4);
                i5--;
            }
            f fVar3 = fVar2;
            f6 = fVar3.f20593e;
            float f8 = fVar3.f20592d + f6 + f5;
            if (!z3 && f4 < f6) {
                return fVar;
            }
            if (f4 >= f8 && i5 != this.f20535F.size() - 1) {
                int i7 = fVar3.f20590b;
                float f9 = fVar3.f20592d;
                i5++;
                z3 = false;
                i6 = i7;
                f7 = f9;
                fVar = fVar3;
            } else {
                return fVar3;
            }
        }
        return fVar;
    }

    public boolean B() {
        return this.f20580u0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    @androidx.annotation.InterfaceC0566i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void D(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f20530B0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.d$g r9 = (androidx.viewpager.widget.d.g) r9
            boolean r10 = r9.f20594a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.f20595b
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            r12.l(r13, r14, r15)
            androidx.viewpager.widget.d$k r13 = r12.f20538G0
            if (r13 == 0) goto La0
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7b:
            if (r1 >= r14) goto La0
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.d$g r0 = (androidx.viewpager.widget.d.g) r0
            boolean r0 = r0.f20594a
            if (r0 == 0) goto L8c
            goto L9d
        L8c:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.d$k r3 = r12.f20538G0
            r3.a(r15, r0)
        L9d:
            int r1 = r1 + 1
            goto L7b
        La0:
            r12.f20529A0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.d.D(int, float, int):void");
    }

    boolean F() {
        int i4 = this.f20543J;
        if (i4 > 0) {
            S(i4 - 1, true);
            return true;
        }
        return false;
    }

    boolean G() {
        androidx.viewpager.widget.a aVar = this.f20541I;
        if (aVar != null && this.f20543J < aVar.e() - 1) {
            S(this.f20543J + 1, true);
            return true;
        }
        return false;
    }

    void J() {
        K(this.f20543J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void K(int r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.d.K(int):void");
    }

    public void N(@N i iVar) {
        List<i> list = this.f20536F0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void O(@N j jVar) {
        List<j> list = this.f20531C0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void S(int i4, boolean z3) {
        this.f20563d0 = false;
        T(i4, z3, false);
    }

    void T(int i4, boolean z3, boolean z4) {
        U(i4, z3, z4, 0);
    }

    void U(int i4, boolean z3, boolean z4, int i5) {
        androidx.viewpager.widget.a aVar = this.f20541I;
        boolean z5 = false;
        if (aVar != null && aVar.e() > 0) {
            if (!z4 && this.f20543J == i4 && this.f20535F.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i4 < 0) {
                i4 = 0;
            } else if (i4 >= this.f20541I.e()) {
                i4 = this.f20541I.e() - 1;
            }
            int i6 = this.f20564e0;
            int i7 = this.f20543J;
            if (i4 > i7 + i6 || i4 < i7 - i6) {
                for (int i8 = 0; i8 < this.f20535F.size(); i8++) {
                    this.f20535F.get(i8).f20591c = true;
                }
            }
            if (this.f20543J != i4) {
                z5 = true;
            }
            if (this.f20584y0) {
                this.f20543J = i4;
                if (z5) {
                    m(i4);
                }
                requestLayout();
                return;
            }
            K(i4);
            R(i4, z3, i5, z5);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j V(j jVar) {
        j jVar2 = this.f20534E0;
        this.f20534E0 = jVar;
        return jVar2;
    }

    public void W(boolean z3, @P k kVar) {
        X(z3, kVar, 2);
    }

    public void X(boolean z3, @P k kVar, int i4) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i5 = 1;
        if (kVar != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f20538G0 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 != z5) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f20538G0 = kVar;
        setChildrenDrawingOrderEnabled(z4);
        if (z4) {
            if (z3) {
                i5 = 2;
            }
            this.f20542I0 = i5;
            this.f20540H0 = i4;
        } else {
            this.f20542I0 = 0;
        }
        if (z6) {
            J();
        }
    }

    void Y(int i4, int i5) {
        Z(i4, i5, 0);
    }

    void Z(int i4, int i5, int i6) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f20550N;
        if (scroller != null && !scroller.isFinished()) {
            if (this.f20551O) {
                scrollX = this.f20550N.getCurrX();
            } else {
                scrollX = this.f20550N.getStartX();
            }
            this.f20550N.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i7 = scrollX;
        int scrollY = getScrollY();
        int i8 = i4 - i7;
        int i9 = i5 - scrollY;
        if (i8 == 0 && i9 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f4 = clientWidth;
        float f5 = i10;
        float o4 = f5 + (o(Math.min(1.0f, (Math.abs(i8) * 1.0f) / f4)) * f5);
        int abs2 = Math.abs(i6);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(o4 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i8) / ((f4 * this.f20541I.h(this.f20543J)) + this.f20553Q)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f20551O = false;
        this.f20550N.startScroll(i7, scrollY, i8, i9, min);
        C0823k0.n1(this);
    }

    f a(int i4, int i5) {
        f fVar = new f();
        fVar.f20590b = i4;
        fVar.f20589a = this.f20541I.j(this, i4);
        fVar.f20592d = this.f20541I.h(i4);
        if (i5 >= 0 && i5 < this.f20535F.size()) {
            this.f20535F.add(i5, fVar);
        } else {
            this.f20535F.add(fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        f w3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0 && (w3 = w(childAt)) != null && w3.f20590b == this.f20543J) {
                    childAt.addFocusables(arrayList, i4, i5);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i5 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f w3;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (w3 = w(childAt)) != null && w3.f20590b == this.f20543J) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean A3 = gVar.f20594a | A(view);
        gVar.f20594a = A3;
        if (this.f20561b0) {
            if (!A3) {
                gVar.f20597d = true;
                addViewInLayout(view, i4, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i4, layoutParams);
    }

    public void b(@N i iVar) {
        if (this.f20536F0 == null) {
            this.f20536F0 = new ArrayList();
        }
        this.f20536F0.add(iVar);
    }

    public void c(@N j jVar) {
        if (this.f20531C0 == null) {
            this.f20531C0 = new ArrayList();
        }
        this.f20531C0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.f20541I == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i4 < 0) {
            if (scrollX <= ((int) (clientWidth * this.f20557U))) {
                return false;
            }
            return true;
        }
        if (i4 <= 0 || scrollX >= ((int) (clientWidth * this.f20558V))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof g) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f20551O = true;
        if (!this.f20550N.isFinished() && this.f20550N.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f20550N.getCurrX();
            int currY = this.f20550N.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!H(currX)) {
                    this.f20550N.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C0823k0.n1(this);
            return;
        }
        i(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.f20539H
            android.graphics.Rect r2 = r4.u(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f20539H
            android.graphics.Rect r3 = r4.u(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.F()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.f20539H
            android.graphics.Rect r2 = r4.u(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f20539H
            android.graphics.Rect r3 = r4.u(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.G()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.G()
            goto Lca
        Lc6:
            boolean r0 = r4.F()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.d.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !s(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f w3;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (w3 = w(childAt)) != null && w3.f20590b == this.f20543J && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z3;
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f20541I) == null || aVar.e() <= 1)) {
            this.f20582w0.finish();
            this.f20583x0.finish();
            return;
        }
        if (!this.f20582w0.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.f20557U * width);
            this.f20582w0.setSize(height, width);
            z3 = this.f20582w0.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z3 = false;
        }
        if (!this.f20583x0.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f20558V + 1.0f)) * width2);
            this.f20583x0.setSize(height2, width2);
            z3 |= this.f20583x0.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z3) {
            C0823k0.n1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f20554R;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean e() {
        if (this.f20565f0) {
            return false;
        }
        this.f20580u0 = true;
        setScrollState(1);
        this.f20570k0 = 0.0f;
        this.f20572m0 = 0.0f;
        VelocityTracker velocityTracker = this.f20575p0;
        if (velocityTracker == null) {
            this.f20575p0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f20575p0.addMovement(obtain);
        obtain.recycle();
        this.f20581v0 = uptimeMillis;
        return true;
    }

    protected boolean g(View view, boolean z3, int i4, int i5, int i6) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i8 = i5 + scrollX;
                if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && (i7 = i6 + scrollY) >= childAt.getTop() && i7 < childAt.getBottom() && g(childAt, true, i4, i8 - childAt.getLeft(), i7 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z3 && view.canScrollHorizontally(-i4)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @P
    public androidx.viewpager.widget.a getAdapter() {
        return this.f20541I;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        if (this.f20542I0 == 2) {
            i5 = (i4 - 1) - i5;
        }
        return ((g) this.f20544J0.get(i5).getLayoutParams()).f20599f;
    }

    public int getCurrentItem() {
        return this.f20543J;
    }

    public int getOffscreenPageLimit() {
        return this.f20564e0;
    }

    public int getPageMargin() {
        return this.f20553Q;
    }

    public void h() {
        List<j> list = this.f20531C0;
        if (list != null) {
            list.clear();
        }
    }

    void j() {
        boolean z3;
        int e4 = this.f20541I.e();
        this.f20533E = e4;
        if (this.f20535F.size() < (this.f20564e0 * 2) + 1 && this.f20535F.size() < e4) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = this.f20543J;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < this.f20535F.size()) {
            f fVar = this.f20535F.get(i5);
            int f4 = this.f20541I.f(fVar.f20589a);
            if (f4 != -1) {
                if (f4 == -2) {
                    this.f20535F.remove(i5);
                    i5--;
                    if (!z4) {
                        this.f20541I.t(this);
                        z4 = true;
                    }
                    this.f20541I.b(this, fVar.f20590b, fVar.f20589a);
                    int i6 = this.f20543J;
                    if (i6 == fVar.f20590b) {
                        i4 = Math.max(0, Math.min(i6, e4 - 1));
                    }
                } else {
                    int i7 = fVar.f20590b;
                    if (i7 != f4) {
                        if (i7 == this.f20543J) {
                            i4 = f4;
                        }
                        fVar.f20590b = f4;
                    }
                }
                z3 = true;
            }
            i5++;
        }
        if (z4) {
            this.f20541I.d(this);
        }
        Collections.sort(this.f20535F, f20518V0);
        if (z3) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                g gVar = (g) getChildAt(i8).getLayoutParams();
                if (!gVar.f20594a) {
                    gVar.f20596c = 0.0f;
                }
            }
            T(i4, false, true);
            requestLayout();
        }
    }

    float o(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20584y0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f20546K0);
        Scroller scroller = this.f20550N;
        if (scroller != null && !scroller.isFinished()) {
            this.f20550N.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        float f4;
        float f5;
        super.onDraw(canvas);
        if (this.f20553Q > 0 && this.f20554R != null && this.f20535F.size() > 0 && this.f20541I != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f6 = this.f20553Q / width;
            int i5 = 0;
            f fVar = this.f20535F.get(0);
            float f7 = fVar.f20593e;
            int size = this.f20535F.size();
            int i6 = fVar.f20590b;
            int i7 = this.f20535F.get(size - 1).f20590b;
            while (i6 < i7) {
                while (true) {
                    i4 = fVar.f20590b;
                    if (i6 <= i4 || i5 >= size) {
                        break;
                    }
                    i5++;
                    fVar = this.f20535F.get(i5);
                }
                if (i6 == i4) {
                    float f8 = fVar.f20593e;
                    float f9 = fVar.f20592d;
                    f4 = (f8 + f9) * width;
                    f7 = f8 + f9 + f6;
                } else {
                    float h4 = this.f20541I.h(i6);
                    f4 = (f7 + h4) * width;
                    f7 += h4 + f6;
                }
                if (this.f20553Q + f4 > scrollX) {
                    f5 = f6;
                    this.f20554R.setBounds(Math.round(f4), this.f20555S, Math.round(this.f20553Q + f4), this.f20556T);
                    this.f20554R.draw(canvas);
                } else {
                    f5 = f6;
                }
                if (f4 <= scrollX + r2) {
                    i6++;
                    f6 = f5;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f4;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f20565f0) {
                    return true;
                }
                if (this.f20566g0) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        E(motionEvent);
                    }
                } else {
                    int i4 = this.f20574o0;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float f5 = x3 - this.f20570k0;
                        float abs = Math.abs(f5);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.f20573n0);
                        if (f5 != 0.0f && !C(this.f20570k0, f5) && g(this, false, (int) f5, (int) x3, (int) y3)) {
                            this.f20570k0 = x3;
                            this.f20571l0 = y3;
                            this.f20566g0 = true;
                            return false;
                        }
                        int i5 = this.f20569j0;
                        if (abs > i5 && abs * 0.5f > abs2) {
                            this.f20565f0 = true;
                            P(true);
                            setScrollState(1);
                            float f6 = this.f20572m0;
                            float f7 = this.f20569j0;
                            if (f5 > 0.0f) {
                                f4 = f6 + f7;
                            } else {
                                f4 = f6 - f7;
                            }
                            this.f20570k0 = f4;
                            this.f20571l0 = y3;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i5) {
                            this.f20566g0 = true;
                        }
                        if (this.f20565f0 && I(x3)) {
                            C0823k0.n1(this);
                        }
                    }
                }
            } else {
                float x4 = motionEvent.getX();
                this.f20572m0 = x4;
                this.f20570k0 = x4;
                float y4 = motionEvent.getY();
                this.f20573n0 = y4;
                this.f20571l0 = y4;
                this.f20574o0 = motionEvent.getPointerId(0);
                this.f20566g0 = false;
                this.f20551O = true;
                this.f20550N.computeScrollOffset();
                if (this.f20548L0 == 2 && Math.abs(this.f20550N.getFinalX() - this.f20550N.getCurrX()) > this.f20579t0) {
                    this.f20550N.abortAnimation();
                    this.f20563d0 = false;
                    J();
                    this.f20565f0 = true;
                    P(true);
                    setScrollState(1);
                } else {
                    i(false);
                    this.f20565f0 = false;
                }
            }
            if (this.f20575p0 == null) {
                this.f20575p0 = VelocityTracker.obtain();
            }
            this.f20575p0.addMovement(motionEvent);
            return this.f20565f0;
        }
        Q();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.d.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        g gVar;
        g gVar2;
        boolean z3;
        int i6;
        setMeasuredDimension(View.getDefaultSize(0, i4), View.getDefaultSize(0, i5));
        int measuredWidth = getMeasuredWidth();
        this.f20568i0 = Math.min(measuredWidth / 10, this.f20567h0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z4 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f20594a) {
                int i9 = gVar2.f20595b;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                if (i11 != 48 && i11 != 80) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i10 != 3 && i10 != 5) {
                    z4 = false;
                }
                int i12 = Integer.MIN_VALUE;
                if (z3) {
                    i6 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else if (z4) {
                    i6 = 1073741824;
                } else {
                    i6 = Integer.MIN_VALUE;
                }
                int i13 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i13 != -2) {
                    if (i13 == -1) {
                        i13 = paddingLeft;
                    }
                    i12 = 1073741824;
                } else {
                    i13 = paddingLeft;
                }
                int i14 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i14 != -2) {
                    if (i14 == -1) {
                        i14 = measuredHeight;
                    }
                } else {
                    i14 = measuredHeight;
                    i8 = i6;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i12), View.MeasureSpec.makeMeasureSpec(i14, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z4) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
        }
        this.f20559W = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f20560a0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f20561b0 = true;
        J();
        this.f20561b0 = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f20594a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f20596c), 1073741824), this.f20560a0);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i5;
        int i6;
        int i7;
        f w3;
        int childCount = getChildCount();
        if ((i4 & 2) != 0) {
            i6 = childCount;
            i5 = 0;
            i7 = 1;
        } else {
            i5 = childCount - 1;
            i6 = -1;
            i7 = -1;
        }
        while (i5 != i6) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (w3 = w(childAt)) != null && w3.f20590b == this.f20543J && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i5 += i7;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        androidx.viewpager.widget.a aVar = this.f20541I;
        if (aVar != null) {
            aVar.n(mVar.f20603H, mVar.f20604I);
            T(mVar.f20602G, false, true);
        } else {
            this.f20545K = mVar.f20602G;
            this.f20547L = mVar.f20603H;
            this.f20549M = mVar.f20604I;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f20602G = this.f20543J;
        androidx.viewpager.widget.a aVar = this.f20541I;
        if (aVar != null) {
            mVar.f20603H = aVar.o();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            int i8 = this.f20553Q;
            L(i4, i6, i8, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void r() {
        if (this.f20580u0) {
            if (this.f20541I != null) {
                VelocityTracker velocityTracker = this.f20575p0;
                velocityTracker.computeCurrentVelocity(1000, this.f20577r0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f20574o0);
                this.f20563d0 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f x3 = x();
                U(k(x3.f20590b, ((scrollX / clientWidth) - x3.f20593e) / x3.f20592d, xVelocity, (int) (this.f20570k0 - this.f20572m0)), true, true, xVelocity);
            }
            q();
            this.f20580u0 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f20561b0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@N KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return G();
                    }
                    return d(66);
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return F();
                }
                return d(17);
            }
        }
        return false;
    }

    public void setAdapter(@P androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f20541I;
        if (aVar2 != null) {
            aVar2.r(null);
            this.f20541I.t(this);
            for (int i4 = 0; i4 < this.f20535F.size(); i4++) {
                f fVar = this.f20535F.get(i4);
                this.f20541I.b(this, fVar.f20590b, fVar.f20589a);
            }
            this.f20541I.d(this);
            this.f20535F.clear();
            M();
            this.f20543J = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f20541I;
        this.f20541I = aVar;
        this.f20533E = 0;
        if (aVar != null) {
            if (this.f20552P == null) {
                this.f20552P = new l();
            }
            this.f20541I.r(this.f20552P);
            this.f20563d0 = false;
            boolean z3 = this.f20584y0;
            this.f20584y0 = true;
            this.f20533E = this.f20541I.e();
            if (this.f20545K >= 0) {
                this.f20541I.n(this.f20547L, this.f20549M);
                T(this.f20545K, false, true);
                this.f20545K = -1;
                this.f20547L = null;
                this.f20549M = null;
            } else if (!z3) {
                J();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.f20536F0;
        if (list != null && !list.isEmpty()) {
            int size = this.f20536F0.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f20536F0.get(i5).b(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i4) {
        this.f20563d0 = false;
        T(i4, !this.f20584y0, false);
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1) {
            Log.w(f20509M0, "Requested offscreen page limit " + i4 + " too small; defaulting to 1");
            i4 = 1;
        }
        if (i4 != this.f20564e0) {
            this.f20564e0 = i4;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f20532D0 = jVar;
    }

    public void setPageMargin(int i4) {
        int i5 = this.f20553Q;
        this.f20553Q = i4;
        int width = getWidth();
        L(width, width, i4, i5);
        requestLayout();
    }

    public void setPageMarginDrawable(@P Drawable drawable) {
        this.f20554R = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i4) {
        boolean z3;
        if (this.f20548L0 == i4) {
            return;
        }
        this.f20548L0 = i4;
        if (this.f20538G0 != null) {
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            p(z3);
        }
        n(i4);
    }

    public void t(float f4) {
        if (this.f20580u0) {
            if (this.f20541I == null) {
                return;
            }
            this.f20570k0 += f4;
            float scrollX = getScrollX() - f4;
            float clientWidth = getClientWidth();
            float f5 = this.f20557U * clientWidth;
            float f6 = this.f20558V * clientWidth;
            f fVar = this.f20535F.get(0);
            f fVar2 = this.f20535F.get(r4.size() - 1);
            if (fVar.f20590b != 0) {
                f5 = fVar.f20593e * clientWidth;
            }
            if (fVar2.f20590b != this.f20541I.e() - 1) {
                f6 = fVar2.f20593e * clientWidth;
            }
            if (scrollX < f5) {
                scrollX = f5;
            } else if (scrollX > f6) {
                scrollX = f6;
            }
            int i4 = (int) scrollX;
            this.f20570k0 += scrollX - i4;
            scrollTo(i4, getScrollY());
            H(i4);
            MotionEvent obtain = MotionEvent.obtain(this.f20581v0, SystemClock.uptimeMillis(), 2, this.f20570k0, 0.0f, 0);
            this.f20575p0.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    f v(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return w(view);
            }
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f20554R) {
            return false;
        }
        return true;
    }

    f w(View view) {
        for (int i4 = 0; i4 < this.f20535F.size(); i4++) {
            f fVar = this.f20535F.get(i4);
            if (this.f20541I.k(view, fVar.f20589a)) {
                return fVar;
            }
        }
        return null;
    }

    f y(int i4) {
        for (int i5 = 0; i5 < this.f20535F.size(); i5++) {
            f fVar = this.f20535F.get(i5);
            if (fVar.f20590b == i4) {
                return fVar;
            }
        }
        return null;
    }

    void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f20550N = new Scroller(context, f20519W0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f20569j0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f20576q0 = (int) (400.0f * f4);
        this.f20577r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20582w0 = new EdgeEffect(context);
        this.f20583x0 = new EdgeEffect(context);
        this.f20578s0 = (int) (25.0f * f4);
        this.f20579t0 = (int) (2.0f * f4);
        this.f20567h0 = (int) (f4 * 16.0f);
        C0823k0.B1(this, new h());
        if (C0823k0.V(this) == 0) {
            C0823k0.R1(this, 1);
        }
        C0823k0.a2(this, new C0186d());
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20594a;

        /* renamed from: b, reason: collision with root package name */
        public int f20595b;

        /* renamed from: c, reason: collision with root package name */
        float f20596c;

        /* renamed from: d, reason: collision with root package name */
        boolean f20597d;

        /* renamed from: e, reason: collision with root package name */
        int f20598e;

        /* renamed from: f, reason: collision with root package name */
        int f20599f;

        public g() {
            super(-1, -1);
            this.f20596c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20596c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f20517U0);
            this.f20595b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@InterfaceC0578v int i4) {
        setPageMarginDrawable(C0669d.i(getContext(), i4));
    }

    public d(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20535F = new ArrayList<>();
        this.f20537G = new f();
        this.f20539H = new Rect();
        this.f20545K = -1;
        this.f20547L = null;
        this.f20549M = null;
        this.f20557U = -3.4028235E38f;
        this.f20558V = Float.MAX_VALUE;
        this.f20564e0 = 1;
        this.f20574o0 = -1;
        this.f20584y0 = true;
        this.f20585z0 = false;
        this.f20546K0 = new c();
        this.f20548L0 = 0;
        z();
    }
}
