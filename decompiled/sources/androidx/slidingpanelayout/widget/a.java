package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.core.content.C0669d;
import androidx.core.graphics.E;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import androidx.customview.widget.d;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.transition.C0973g;
import androidx.transition.M;
import androidx.window.layout.q;
import androidx.window.layout.x;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class a extends ViewGroup implements androidx.customview.widget.c {

    /* renamed from: i0, reason: collision with root package name */
    private static final String f18404i0 = "SlidingPaneLayout";

    /* renamed from: j0, reason: collision with root package name */
    private static final int f18405j0 = 400;

    /* renamed from: k0, reason: collision with root package name */
    private static final String f18406k0 = "androidx.slidingpanelayout.widget.SlidingPaneLayout";

    /* renamed from: l0, reason: collision with root package name */
    public static final int f18407l0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f18408m0 = 1;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f18409n0 = 2;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f18410o0 = 3;

    /* renamed from: p0, reason: collision with root package name */
    private static boolean f18411p0;

    /* renamed from: E, reason: collision with root package name */
    private int f18412E;

    /* renamed from: F, reason: collision with root package name */
    private int f18413F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f18414G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f18415H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f18416I;

    /* renamed from: J, reason: collision with root package name */
    View f18417J;

    /* renamed from: K, reason: collision with root package name */
    float f18418K;

    /* renamed from: L, reason: collision with root package name */
    private float f18419L;

    /* renamed from: M, reason: collision with root package name */
    int f18420M;

    /* renamed from: N, reason: collision with root package name */
    boolean f18421N;

    /* renamed from: O, reason: collision with root package name */
    private int f18422O;

    /* renamed from: P, reason: collision with root package name */
    private float f18423P;

    /* renamed from: Q, reason: collision with root package name */
    private float f18424Q;

    /* renamed from: R, reason: collision with root package name */
    private final List<f> f18425R;

    /* renamed from: S, reason: collision with root package name */
    @P
    private f f18426S;

    /* renamed from: T, reason: collision with root package name */
    final androidx.customview.widget.d f18427T;

    /* renamed from: U, reason: collision with root package name */
    boolean f18428U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f18429V;

    /* renamed from: W, reason: collision with root package name */
    private final Rect f18430W;

    /* renamed from: a0, reason: collision with root package name */
    final ArrayList<c> f18431a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f18432b0;

    /* renamed from: c0, reason: collision with root package name */
    q f18433c0;

    /* renamed from: d0, reason: collision with root package name */
    private FoldingFeatureObserver.a f18434d0;

    /* renamed from: e0, reason: collision with root package name */
    private FoldingFeatureObserver f18435e0;

    /* renamed from: f0, reason: collision with root package name */
    private Method f18436f0;

    /* renamed from: g0, reason: collision with root package name */
    private Field f18437g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f18438h0;

    /* renamed from: androidx.slidingpanelayout.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0174a implements FoldingFeatureObserver.a {
        C0174a() {
        }

        @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.a
        public void a(@N q qVar) {
            a.this.f18433c0 = qVar;
            C0973g c0973g = new C0973g();
            c0973g.v0(300L);
            c0973g.x0(androidx.core.view.animation.b.b(0.2f, 0.0f, 0.0f, 1.0f));
            M.b(a.this, c0973g);
            a.this.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class b extends C0771a {

        /* renamed from: d, reason: collision with root package name */
        private final Rect f18440d = new Rect();

        b() {
        }

        private void n(androidx.core.view.accessibility.M m4, androidx.core.view.accessibility.M m5) {
            Rect rect = this.f18440d;
            m5.t(rect);
            m4.V0(rect);
            m4.a2(m5.E0());
            m4.A1(m5.O());
            m4.Z0(m5.w());
            m4.d1(m5.A());
            m4.j1(m5.q0());
            m4.a1(m5.l0());
            m4.l1(m5.r0());
            m4.m1(m5.s0());
            m4.R0(m5.i0());
            m4.J1(m5.A0());
            m4.w1(m5.v0());
            m4.a(m5.p());
            m4.y1(m5.M());
        }

        @Override // androidx.core.view.C0771a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(a.f18406k0);
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, androidx.core.view.accessibility.M m4) {
            androidx.core.view.accessibility.M I02 = androidx.core.view.accessibility.M.I0(m4);
            super.g(view, I02);
            n(m4, I02);
            I02.L0();
            m4.Z0(a.f18406k0);
            m4.L1(view);
            Object l02 = C0823k0.l0(view);
            if (l02 instanceof View) {
                m4.C1((View) l02);
            }
            int childCount = a.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = a.this.getChildAt(i4);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    C0823k0.R1(childAt, 1);
                    m4.c(childAt);
                }
            }
        }

        @Override // androidx.core.view.C0771a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!o(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public boolean o(View view) {
            return a.this.m(view);
        }
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final View f18442E;

        c(View view) {
            this.f18442E = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18442E.getParent() == a.this) {
                this.f18442E.setLayerType(0, null);
                a.this.l(this.f18442E);
            }
            a.this.f18431a0.remove(this);
        }
    }

    /* loaded from: classes.dex */
    private class d extends d.c {
        d() {
        }

        private boolean n() {
            a aVar = a.this;
            if (aVar.f18421N || aVar.getLockMode() == 3) {
                return false;
            }
            if (a.this.isOpen() && a.this.getLockMode() == 1) {
                return false;
            }
            if (!a.this.isOpen() && a.this.getLockMode() == 2) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i4, int i5) {
            e eVar = (e) a.this.f18417J.getLayoutParams();
            if (a.this.n()) {
                int width = a.this.getWidth() - ((a.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + a.this.f18417J.getWidth());
                return Math.max(Math.min(i4, width), width - a.this.f18420M);
            }
            int paddingLeft = a.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            return Math.min(Math.max(i4, paddingLeft), a.this.f18420M + paddingLeft);
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            return a.this.f18420M;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i4, int i5) {
            if (!n()) {
                return;
            }
            a aVar = a.this;
            aVar.f18427T.d(aVar.f18417J, i5);
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i4, int i5) {
            if (!n()) {
                return;
            }
            a aVar = a.this;
            aVar.f18427T.d(aVar.f18417J, i5);
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i4) {
            a.this.v();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            if (a.this.f18427T.F() == 0) {
                a aVar = a.this;
                if (aVar.f18418K == 1.0f) {
                    aVar.A(aVar.f18417J);
                    a aVar2 = a.this;
                    aVar2.f(aVar2.f18417J);
                    a.this.f18428U = false;
                    return;
                }
                aVar.g(aVar.f18417J);
                a.this.f18428U = true;
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i4, int i5, int i6, int i7) {
            a.this.q(i4);
            a.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f4, float f5) {
            int paddingLeft;
            e eVar = (e) view.getLayoutParams();
            if (a.this.n()) {
                int paddingRight = a.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                if (f4 < 0.0f || (f4 == 0.0f && a.this.f18418K > 0.5f)) {
                    paddingRight += a.this.f18420M;
                }
                paddingLeft = (a.this.getWidth() - paddingRight) - a.this.f18417J.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + a.this.getPaddingLeft();
                if (f4 > 0.0f || (f4 == 0.0f && a.this.f18418K > 0.5f)) {
                    paddingLeft += a.this.f18420M;
                }
            }
            a.this.f18427T.V(paddingLeft, view.getTop());
            a.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i4) {
            if (!n()) {
                return false;
            }
            return ((e) view.getLayoutParams()).f18447b;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(@N View view, float f4);

        void b(@N View view);

        void c(@N View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g extends androidx.customview.view.a {
        public static final Parcelable.Creator<g> CREATOR = new C0175a();

        /* renamed from: G, reason: collision with root package name */
        boolean f18450G;

        /* renamed from: H, reason: collision with root package name */
        int f18451H;

        /* renamed from: androidx.slidingpanelayout.widget.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0175a implements Parcelable.ClassLoaderCreator<g> {
            C0175a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i4) {
                return new g[i4];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f18450G ? 1 : 0);
            parcel.writeInt(this.f18451H);
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18450G = parcel.readInt() != 0;
            this.f18451H = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static class h implements f {
        @Override // androidx.slidingpanelayout.widget.a.f
        public void a(@N View view, float f4) {
        }

        @Override // androidx.slidingpanelayout.widget.a.f
        public void b(@N View view) {
        }

        @Override // androidx.slidingpanelayout.widget.a.f
        public void c(@N View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends FrameLayout {
        i(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 29) {
            z3 = true;
        } else {
            z3 = false;
        }
        f18411p0 = z3;
    }

    public a(@N Context context) {
        this(context, null);
    }

    private static boolean B(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    private boolean e(int i4) {
        if (!this.f18416I) {
            this.f18428U = false;
        }
        if (!this.f18429V && !y(1.0f, i4)) {
            return false;
        }
        this.f18428U = false;
        return true;
    }

    private E getSystemGestureInsets() {
        Y0 o02;
        if (f18411p0 && (o02 = C0823k0.o0(this)) != null) {
            return o02.n();
        }
        return null;
    }

    @P
    private static Activity i(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect j(@N q qVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i4 = iArr[0];
        Rect rect = new Rect(i4, iArr[1], view.getWidth() + i4, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(qVar.getBounds());
        boolean intersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !intersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int k(View view) {
        if (view instanceof i) {
            return C0823k0.f0(((i) view).getChildAt(0));
        }
        return C0823k0.f0(view);
    }

    private static int p(@N View view, int i4, int i5) {
        e eVar = (e) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) eVar).width == 0 && eVar.f18446a > 0.0f) {
            return ViewGroup.getChildMeasureSpec(i4, i5, ((ViewGroup.MarginLayoutParams) eVar).height);
        }
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private boolean s(int i4) {
        if (!this.f18416I) {
            this.f18428U = true;
        }
        if (!this.f18429V && !y(0.0f, i4)) {
            return false;
        }
        this.f18428U = true;
        return true;
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.f18435e0 = foldingFeatureObserver;
        foldingFeatureObserver.f(this.f18434d0);
    }

    private void t(float f4) {
        boolean n4 = n();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != this.f18417J) {
                float f5 = 1.0f - this.f18419L;
                int i5 = this.f18422O;
                this.f18419L = f4;
                int i6 = ((int) (f5 * i5)) - ((int) ((1.0f - f4) * i5));
                if (n4) {
                    i6 = -i6;
                }
                childAt.offsetLeftAndRight(i6);
            }
        }
    }

    private ArrayList<Rect> z() {
        Rect j4;
        q qVar = this.f18433c0;
        if (qVar == null || !qVar.a() || this.f18433c0.getBounds().left == 0 || this.f18433c0.getBounds().top != 0 || (j4 = j(this.f18433c0, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), j4.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, j4.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    void A(View view) {
        int paddingLeft;
        int width;
        int i4;
        int i5;
        int i6;
        int i7;
        View childAt;
        int i8;
        boolean z3;
        int i9;
        int i10;
        View view2 = view;
        boolean n4 = n();
        if (n4) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (n4) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && B(view)) {
            i4 = view.getLeft();
            i5 = view.getRight();
            i6 = view.getTop();
            i7 = view.getBottom();
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount && (childAt = getChildAt(i11)) != view2) {
            if (childAt.getVisibility() == 8) {
                z3 = n4;
            } else {
                if (n4) {
                    i8 = width;
                } else {
                    i8 = paddingLeft;
                }
                int max = Math.max(i8, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                z3 = n4;
                if (n4) {
                    i9 = paddingLeft;
                } else {
                    i9 = width;
                }
                int min = Math.min(i9, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i4 && max2 >= i6 && min <= i5 && min2 <= i7) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                childAt.setVisibility(i10);
            }
            i11++;
            view2 = view;
            n4 = z3;
        }
    }

    public void a(@N f fVar) {
        this.f18425R.add(fVar);
    }

    @Override // android.view.ViewGroup
    public void addView(@N View view, int i4, @P ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new i(view), i4, layoutParams);
        } else {
            super.addView(view, i4, layoutParams);
        }
    }

    protected boolean b(View view, boolean z3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i9 = i5 + scrollX;
                if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && (i8 = i6 + scrollY) >= childAt.getTop() && i8 < childAt.getBottom() && b(childAt, true, i4, i9 - childAt.getLeft(), i8 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z3) {
            if (n()) {
                i7 = i4;
            } else {
                i7 = -i4;
            }
            if (view.canScrollHorizontally(i7)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean c() {
        return this.f18416I;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f18427T.o(true)) {
            if (!this.f18416I) {
                this.f18427T.a();
            } else {
                C0823k0.n1(this);
            }
        }
    }

    public boolean d() {
        return e(0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i4;
        int i5;
        super.draw(canvas);
        if (n()) {
            drawable = this.f18415H;
        } else {
            drawable = this.f18414G;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (n()) {
                i5 = view.getRight();
                i4 = intrinsicWidth + i5;
            } else {
                int left = view.getLeft();
                int i6 = left - intrinsicWidth;
                i4 = left;
                i5 = i6;
            }
            drawable.setBounds(i5, top, i4, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        if (n() ^ isOpen()) {
            this.f18427T.T(1);
            E systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                androidx.customview.widget.d dVar = this.f18427T;
                dVar.S(Math.max(dVar.A(), systemGestureInsets.f12399a));
            }
        } else {
            this.f18427T.T(2);
            E systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                androidx.customview.widget.d dVar2 = this.f18427T;
                dVar2.S(Math.max(dVar2.A(), systemGestureInsets2.f12401c));
            }
        }
        e eVar = (e) view.getLayoutParams();
        int save = canvas.save();
        if (this.f18416I && !eVar.f18447b && this.f18417J != null) {
            canvas.getClipBounds(this.f18430W);
            if (n()) {
                Rect rect = this.f18430W;
                rect.left = Math.max(rect.left, this.f18417J.getRight());
            } else {
                Rect rect2 = this.f18430W;
                rect2.right = Math.min(rect2.right, this.f18417J.getLeft());
            }
            canvas.clipRect(this.f18430W);
        }
        boolean drawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(save);
        return drawChild;
    }

    void f(@N View view) {
        Iterator<f> it = this.f18425R.iterator();
        while (it.hasNext()) {
            it.next().c(view);
        }
        sendAccessibilityEvent(32);
    }

    void g(@N View view) {
        Iterator<f> it = this.f18425R.iterator();
        while (it.hasNext()) {
            it.next().b(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @InterfaceC0569l
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f18413F;
    }

    public final int getLockMode() {
        return this.f18432b0;
    }

    @U
    public int getParallaxDistance() {
        return this.f18422O;
    }

    @InterfaceC0569l
    @Deprecated
    public int getSliderFadeColor() {
        return this.f18412E;
    }

    void h(@N View view) {
        Iterator<f> it = this.f18425R.iterator();
        while (it.hasNext()) {
            it.next().a(view, this.f18418K);
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        if (this.f18416I && this.f18418K != 0.0f) {
            return false;
        }
        return true;
    }

    void l(View view) {
        C0823k0.V1(view, ((e) view.getLayoutParams()).f18449d);
    }

    boolean m(View view) {
        if (view == null) {
            return false;
        }
        e eVar = (e) view.getLayoutParams();
        if (!this.f18416I || !eVar.f18448c || this.f18418K <= 0.0f) {
            return false;
        }
        return true;
    }

    boolean n() {
        if (C0823k0.Z(this) == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        return this.f18416I;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity i4;
        super.onAttachedToWindow();
        this.f18429V = true;
        if (this.f18435e0 != null && (i4 = i(getContext())) != null) {
            this.f18435e0.e(i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18429V = true;
        FoldingFeatureObserver foldingFeatureObserver = this.f18435e0;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.g();
        }
        int size = this.f18431a0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f18431a0.get(i4).run();
        }
        this.f18431a0.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f18416I && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f18428U = this.f18427T.L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f18416I && (!this.f18421N || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x3 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        float abs = Math.abs(x3 - this.f18423P);
                        float abs2 = Math.abs(y3 - this.f18424Q);
                        if (abs > this.f18427T.E() && abs2 > abs) {
                            this.f18427T.c();
                            this.f18421N = true;
                            return false;
                        }
                    }
                } else {
                    this.f18421N = false;
                    float x4 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    this.f18423P = x4;
                    this.f18424Q = y4;
                    if (this.f18427T.L(this.f18417J, (int) x4, (int) y4) && m(this.f18417J)) {
                        z3 = true;
                        if (this.f18427T.W(motionEvent) && !z3) {
                            return false;
                        }
                    }
                }
                z3 = false;
                return this.f18427T.W(motionEvent) ? true : true;
            }
            this.f18427T.c();
            return false;
        }
        this.f18427T.c();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int paddingLeft;
        int paddingRight;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        float f4;
        boolean n4 = n();
        int i15 = i6 - i4;
        if (n4) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (n4) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f18429V) {
            if (this.f18416I && this.f18428U) {
                f4 = 0.0f;
            } else {
                f4 = 1.0f;
            }
            this.f18418K = f4;
        }
        int i16 = paddingLeft;
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                i8 = i16;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.f18447b) {
                    int i18 = i15 - paddingRight;
                    int min = (Math.min(paddingLeft, i18) - i16) - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    this.f18420M = min;
                    if (n4) {
                        i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    } else {
                        i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    }
                    if (i16 + i14 + min + (measuredWidth / 2) > i18) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    eVar.f18448c = z4;
                    int i19 = (int) (min * this.f18418K);
                    this.f18418K = i19 / min;
                    i8 = i16 + i14 + i19;
                    i9 = 0;
                } else if (this.f18416I && (i10 = this.f18422O) != 0) {
                    i9 = (int) ((1.0f - this.f18418K) * i10);
                    i8 = paddingLeft;
                } else {
                    i8 = paddingLeft;
                    i9 = 0;
                }
                if (n4) {
                    i12 = (i15 - i8) + i9;
                    i11 = i12 - measuredWidth;
                } else {
                    i11 = i8 - i9;
                    i12 = i11 + measuredWidth;
                }
                childAt.layout(i11, paddingTop, i12, childAt.getMeasuredHeight() + paddingTop);
                q qVar = this.f18433c0;
                if (qVar != null && qVar.c() == q.b.f20865c && this.f18433c0.a()) {
                    i13 = this.f18433c0.getBounds().width();
                } else {
                    i13 = 0;
                }
                paddingLeft += childAt.getWidth() + Math.abs(i13);
            }
            i17++;
            i16 = i8;
        }
        if (this.f18429V) {
            if (this.f18416I && this.f18422O != 0) {
                t(this.f18418K);
            }
            A(this.f18417J);
        }
        this.f18429V = false;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int paddingTop;
        int i6;
        int i7;
        int measuredWidth;
        int i8;
        int i9;
        int makeMeasureSpec;
        boolean z3;
        int i10;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        ?? r8 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i6 = 0;
            } else {
                i6 = (size2 - getPaddingTop()) - getPaddingBottom();
            }
            paddingTop = i6;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i6 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(f18404i0, "onMeasure: More than two child views are not supported.");
        }
        this.f18417J = null;
        int i11 = 0;
        boolean z4 = false;
        int i12 = max;
        float f4 = 0.0f;
        while (true) {
            i7 = 8;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int i13 = size;
            if (childAt.getVisibility() == 8) {
                eVar.f18448c = r8;
            } else {
                float f5 = eVar.f18446a;
                if (f5 > 0.0f) {
                    f4 += f5;
                    if (((ViewGroup.MarginLayoutParams) eVar).width == 0) {
                    }
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), (int) r8);
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).width;
                if (i14 == -2) {
                    if (mode == 0) {
                        i10 = mode;
                    } else {
                        i10 = Integer.MIN_VALUE;
                    }
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, i10);
                } else if (i14 == -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, mode);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                }
                childAt.measure(makeMeasureSpec, ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) eVar).height));
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i6) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i6 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i6 = measuredHeight;
                    }
                }
                i12 -= measuredWidth2;
                if (i11 != 0) {
                    if (i12 < 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    eVar.f18447b = z3;
                    z4 |= z3;
                    if (z3) {
                        this.f18417J = childAt;
                    }
                }
            }
            i11++;
            size = i13;
            r8 = 0;
        }
        int i15 = size;
        int i16 = i12;
        if (z4 || f4 > 0.0f) {
            int i17 = 0;
            while (i17 < childCount) {
                View childAt2 = getChildAt(i17);
                if (childAt2.getVisibility() != i7) {
                    e eVar2 = (e) childAt2.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) eVar2).width == 0 && eVar2.f18446a > 0.0f) {
                        measuredWidth = 0;
                    } else {
                        measuredWidth = childAt2.getMeasuredWidth();
                    }
                    if (z4) {
                        i8 = max - (((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                        i9 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    } else if (eVar2.f18446a > 0.0f) {
                        i8 = measuredWidth + ((int) ((eVar2.f18446a * Math.max(0, i16)) / f4));
                        i9 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    } else {
                        i8 = measuredWidth;
                        i9 = 0;
                    }
                    int p4 = p(childAt2, i5, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth != i8) {
                        childAt2.measure(i9, p4);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i6) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 != 0) {
                            }
                            i6 = measuredHeight2;
                        }
                    }
                }
                i17++;
                i7 = 8;
            }
        }
        ArrayList<Rect> z5 = z();
        if (z5 != null && !z4) {
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = z5.get(i18);
                    e eVar3 = (e) childAt3.getLayoutParams();
                    int i19 = ((ViewGroup.MarginLayoutParams) eVar3).leftMargin + ((ViewGroup.MarginLayoutParams) eVar3).rightMargin;
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), makeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) != 1 && (k(childAt3) == 0 || rect.width() >= k(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), makeMeasureSpec2);
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i19, 1073741824), makeMeasureSpec2);
                        if (i18 != 0) {
                            eVar3.f18447b = true;
                            this.f18417J = childAt3;
                            z4 = true;
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i15, i6 + getPaddingTop() + getPaddingBottom());
        this.f18416I = z4;
        if (this.f18427T.F() != 0 && !z4) {
            this.f18427T.a();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        if (gVar.f18450G) {
            r();
        } else {
            d();
        }
        this.f18428U = gVar.f18450G;
        setLockMode(gVar.f18451H);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z3;
        g gVar = new g(super.onSaveInstanceState());
        if (o()) {
            z3 = isOpen();
        } else {
            z3 = this.f18428U;
        }
        gVar.f18450G = z3;
        gVar.f18451H = this.f18432b0;
        return gVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            this.f18429V = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f18416I) {
            return super.onTouchEvent(motionEvent);
        }
        this.f18427T.M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && m(this.f18417J)) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                float f4 = x3 - this.f18423P;
                float f5 = y3 - this.f18424Q;
                int E3 = this.f18427T.E();
                if ((f4 * f4) + (f5 * f5) < E3 * E3 && this.f18427T.L(this.f18417J, (int) x3, (int) y3)) {
                    e(0);
                }
            }
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.f18423P = x4;
            this.f18424Q = y4;
        }
        return true;
    }

    @Override // androidx.customview.widget.c
    public void open() {
        r();
    }

    void q(int i4) {
        int paddingLeft;
        int i5;
        if (this.f18417J == null) {
            this.f18418K = 0.0f;
            return;
        }
        boolean n4 = n();
        e eVar = (e) this.f18417J.getLayoutParams();
        int width = this.f18417J.getWidth();
        if (n4) {
            i4 = (getWidth() - i4) - width;
        }
        if (n4) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (n4) {
            i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        } else {
            i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        }
        float f4 = (i4 - (paddingLeft + i5)) / this.f18420M;
        this.f18418K = f4;
        if (this.f18422O != 0) {
            t(f4);
        }
        h(this.f18417J);
    }

    public boolean r() {
        return s(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@N View view) {
        if (view.getParent() instanceof i) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z3;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f18416I) {
            if (view == this.f18417J) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f18428U = z3;
        }
    }

    @Deprecated
    public void setCoveredFadeColor(@InterfaceC0569l int i4) {
        this.f18413F = i4;
    }

    public final void setLockMode(int i4) {
        this.f18432b0 = i4;
    }

    @Deprecated
    public void setPanelSlideListener(@P f fVar) {
        f fVar2 = this.f18426S;
        if (fVar2 != null) {
            u(fVar2);
        }
        if (fVar != null) {
            a(fVar);
        }
        this.f18426S = fVar;
    }

    public void setParallaxDistance(@U int i4) {
        this.f18422O = i4;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@P Drawable drawable) {
        this.f18414G = drawable;
    }

    public void setShadowDrawableRight(@P Drawable drawable) {
        this.f18415H = drawable;
    }

    @Deprecated
    public void setShadowResource(@InterfaceC0578v int i4) {
        setShadowDrawableLeft(getResources().getDrawable(i4));
    }

    public void setShadowResourceLeft(int i4) {
        setShadowDrawableLeft(C0669d.i(getContext(), i4));
    }

    public void setShadowResourceRight(int i4) {
        setShadowDrawableRight(C0669d.i(getContext(), i4));
    }

    @Deprecated
    public void setSliderFadeColor(@InterfaceC0569l int i4) {
        this.f18412E = i4;
    }

    public void u(@N f fVar) {
        this.f18425R.remove(fVar);
    }

    void v() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void w() {
        d();
    }

    @Deprecated
    public void x() {
        r();
    }

    boolean y(float f4, int i4) {
        int paddingLeft;
        if (!this.f18416I) {
            return false;
        }
        boolean n4 = n();
        e eVar = (e) this.f18417J.getLayoutParams();
        if (n4) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + (f4 * this.f18420M)) + this.f18417J.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + (f4 * this.f18420M));
        }
        androidx.customview.widget.d dVar = this.f18427T;
        View view = this.f18417J;
        if (!dVar.X(view, paddingLeft, view.getTop())) {
            return false;
        }
        v();
        C0823k0.n1(this);
        return true;
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        private static final int[] f18445e = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public float f18446a;

        /* renamed from: b, reason: collision with root package name */
        boolean f18447b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18448c;

        /* renamed from: d, reason: collision with root package name */
        Paint f18449d;

        public e() {
            super(-1, -1);
            this.f18446a = 0.0f;
        }

        public e(int i4, int i5) {
            super(i4, i5);
            this.f18446a = 0.0f;
        }

        public e(@N ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f18446a = 0.0f;
        }

        public e(@N ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f18446a = 0.0f;
        }

        public e(@N e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f18446a = 0.0f;
            this.f18446a = eVar.f18446a;
        }

        public e(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f18446a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f18445e);
            this.f18446a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public a(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f18412E = 0;
        this.f18418K = 1.0f;
        this.f18425R = new CopyOnWriteArrayList();
        this.f18429V = true;
        this.f18430W = new Rect();
        this.f18431a0 = new ArrayList<>();
        this.f18434d0 = new C0174a();
        float f4 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C0823k0.B1(this, new b());
        C0823k0.R1(this, 1);
        androidx.customview.widget.d p4 = androidx.customview.widget.d.p(this, 0.5f, new d());
        this.f18427T = p4;
        p4.U(f4 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(x.c(context), C0669d.l(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }
}
