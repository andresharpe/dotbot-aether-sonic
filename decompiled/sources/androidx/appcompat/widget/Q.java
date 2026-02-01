package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0823k0;
import d.C2042a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class Q implements androidx.appcompat.view.menu.q {

    /* renamed from: k0, reason: collision with root package name */
    private static final String f5728k0 = "ListPopupWindow";

    /* renamed from: l0, reason: collision with root package name */
    private static final boolean f5729l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    static final int f5730m0 = 250;

    /* renamed from: n0, reason: collision with root package name */
    private static Method f5731n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    private static Method f5732o0 = null;

    /* renamed from: p0, reason: collision with root package name */
    private static Method f5733p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f5734q0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f5735r0 = 1;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f5736s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f5737t0 = -2;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f5738u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f5739v0 = 1;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f5740w0 = 2;

    /* renamed from: E, reason: collision with root package name */
    private Context f5741E;

    /* renamed from: F, reason: collision with root package name */
    private ListAdapter f5742F;

    /* renamed from: G, reason: collision with root package name */
    M f5743G;

    /* renamed from: H, reason: collision with root package name */
    private int f5744H;

    /* renamed from: I, reason: collision with root package name */
    private int f5745I;

    /* renamed from: J, reason: collision with root package name */
    private int f5746J;

    /* renamed from: K, reason: collision with root package name */
    private int f5747K;

    /* renamed from: L, reason: collision with root package name */
    private int f5748L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f5749M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f5750N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f5751O;

    /* renamed from: P, reason: collision with root package name */
    private int f5752P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f5753Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f5754R;

    /* renamed from: S, reason: collision with root package name */
    int f5755S;

    /* renamed from: T, reason: collision with root package name */
    private View f5756T;

    /* renamed from: U, reason: collision with root package name */
    private int f5757U;

    /* renamed from: V, reason: collision with root package name */
    private DataSetObserver f5758V;

    /* renamed from: W, reason: collision with root package name */
    private View f5759W;

    /* renamed from: X, reason: collision with root package name */
    private Drawable f5760X;

    /* renamed from: Y, reason: collision with root package name */
    private AdapterView.OnItemClickListener f5761Y;

    /* renamed from: Z, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f5762Z;

    /* renamed from: a0, reason: collision with root package name */
    final j f5763a0;

    /* renamed from: b0, reason: collision with root package name */
    private final i f5764b0;

    /* renamed from: c0, reason: collision with root package name */
    private final h f5765c0;

    /* renamed from: d0, reason: collision with root package name */
    private final f f5766d0;

    /* renamed from: e0, reason: collision with root package name */
    private Runnable f5767e0;

    /* renamed from: f0, reason: collision with root package name */
    final Handler f5768f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Rect f5769g0;

    /* renamed from: h0, reason: collision with root package name */
    private Rect f5770h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f5771i0;

    /* renamed from: j0, reason: collision with root package name */
    PopupWindow f5772j0;

    /* loaded from: classes.dex */
    class a extends P {
        a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.P
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Q b() {
            return Q.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View v3 = Q.this.v();
            if (v3 != null && v3.getWindowToken() != null) {
                Q.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            M m4;
            if (i4 != -1 && (m4 = Q.this.f5743G) != null) {
                m4.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(24)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @InterfaceC0577u
        static int a(PopupWindow popupWindow, View view, int i4, boolean z3) {
            return popupWindow.getMaxAvailableHeight(view, i4, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @InterfaceC0577u
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @InterfaceC0577u
        static void b(PopupWindow popupWindow, boolean z3) {
            popupWindow.setIsClippedToScreen(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Q.this.s();
        }
    }

    /* loaded from: classes.dex */
    private class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (Q.this.c()) {
                Q.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            Q.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h implements AbsListView.OnScrollListener {
        h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 == 1 && !Q.this.K() && Q.this.f5772j0.getContentView() != null) {
                Q q4 = Q.this;
                q4.f5768f0.removeCallbacks(q4.f5763a0);
                Q.this.f5763a0.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i implements View.OnTouchListener {
        i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = Q.this.f5772j0) != null && popupWindow.isShowing() && x3 >= 0 && x3 < Q.this.f5772j0.getWidth() && y3 >= 0 && y3 < Q.this.f5772j0.getHeight()) {
                Q q4 = Q.this;
                q4.f5768f0.postDelayed(q4.f5763a0, 250L);
                return false;
            }
            if (action == 1) {
                Q q5 = Q.this;
                q5.f5768f0.removeCallbacks(q5.f5763a0);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            M m4 = Q.this.f5743G;
            if (m4 != null && C0823k0.O0(m4) && Q.this.f5743G.getCount() > Q.this.f5743G.getChildCount()) {
                int childCount = Q.this.f5743G.getChildCount();
                Q q4 = Q.this;
                if (childCount <= q4.f5755S) {
                    q4.f5772j0.setInputMethodMode(2);
                    Q.this.a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f5731n0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(f5728k0, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f5733p0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(f5728k0, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public Q(@androidx.annotation.N Context context) {
        this(context, null, C2042a.b.f49193Z1);
    }

    private int A(View view, int i4, boolean z3) {
        return d.a(this.f5772j0, view, i4, z3);
    }

    private static boolean I(int i4) {
        return i4 == 66 || i4 == 23;
    }

    private void R() {
        View view = this.f5756T;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5756T);
            }
        }
    }

    private void i0(boolean z3) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f5731n0;
            if (method != null) {
                try {
                    method.invoke(this.f5772j0, Boolean.valueOf(z3));
                    return;
                } catch (Exception unused) {
                    Log.i(f5728k0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        e.b(this.f5772j0, z3);
    }

    private int r() {
        int i4;
        int i5;
        int makeMeasureSpec;
        int i6;
        boolean z3 = true;
        if (this.f5743G == null) {
            Context context = this.f5741E;
            this.f5767e0 = new b();
            M u3 = u(context, !this.f5771i0);
            this.f5743G = u3;
            Drawable drawable = this.f5760X;
            if (drawable != null) {
                u3.setSelector(drawable);
            }
            this.f5743G.setAdapter(this.f5742F);
            this.f5743G.setOnItemClickListener(this.f5761Y);
            this.f5743G.setFocusable(true);
            this.f5743G.setFocusableInTouchMode(true);
            this.f5743G.setOnItemSelectedListener(new c());
            this.f5743G.setOnScrollListener(this.f5765c0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f5762Z;
            if (onItemSelectedListener != null) {
                this.f5743G.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f5743G;
            View view2 = this.f5756T;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i7 = this.f5757U;
                if (i7 != 0) {
                    if (i7 != 1) {
                        Log.e(f5728k0, "Invalid hint position " + this.f5757U);
                    } else {
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                    }
                } else {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                }
                int i8 = this.f5745I;
                if (i8 >= 0) {
                    i6 = Integer.MIN_VALUE;
                } else {
                    i8 = 0;
                    i6 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i8, i6), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i4 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i4 = 0;
            }
            this.f5772j0.setContentView(view);
        } else {
            View view3 = this.f5756T;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i4 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i4 = 0;
            }
        }
        Drawable background = this.f5772j0.getBackground();
        if (background != null) {
            background.getPadding(this.f5769g0);
            Rect rect = this.f5769g0;
            int i9 = rect.top;
            i5 = rect.bottom + i9;
            if (!this.f5749M) {
                this.f5747K = -i9;
            }
        } else {
            this.f5769g0.setEmpty();
            i5 = 0;
        }
        if (this.f5772j0.getInputMethodMode() != 2) {
            z3 = false;
        }
        int A3 = A(v(), this.f5747K, z3);
        if (!this.f5753Q && this.f5744H != -1) {
            int i10 = this.f5745I;
            if (i10 != -2) {
                if (i10 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    int i11 = this.f5741E.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f5769g0;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i12 = this.f5741E.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f5769g0;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int e4 = this.f5743G.e(makeMeasureSpec, 0, -1, A3 - i4, -1);
            if (e4 > 0) {
                i4 += i5 + this.f5743G.getPaddingTop() + this.f5743G.getPaddingBottom();
            }
            return e4 + i4;
        }
        return A3 + i5;
    }

    public int B() {
        return this.f5757U;
    }

    @androidx.annotation.P
    public Object C() {
        if (!c()) {
            return null;
        }
        return this.f5743G.getSelectedItem();
    }

    public long D() {
        if (!c()) {
            return Long.MIN_VALUE;
        }
        return this.f5743G.getSelectedItemId();
    }

    public int E() {
        if (!c()) {
            return -1;
        }
        return this.f5743G.getSelectedItemPosition();
    }

    @androidx.annotation.P
    public View F() {
        if (!c()) {
            return null;
        }
        return this.f5743G.getSelectedView();
    }

    public int G() {
        return this.f5772j0.getSoftInputMode();
    }

    public int H() {
        return this.f5745I;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean J() {
        return this.f5753Q;
    }

    public boolean K() {
        if (this.f5772j0.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean L() {
        return this.f5771i0;
    }

    public boolean M(int i4, @androidx.annotation.N KeyEvent keyEvent) {
        int i5;
        int i6;
        if (c() && i4 != 62 && (this.f5743G.getSelectedItemPosition() >= 0 || !I(i4))) {
            int selectedItemPosition = this.f5743G.getSelectedItemPosition();
            boolean z3 = !this.f5772j0.isAboveAnchor();
            ListAdapter listAdapter = this.f5742F;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i5 = 0;
                } else {
                    i5 = this.f5743G.d(0, true);
                }
                if (areAllItemsEnabled) {
                    i6 = listAdapter.getCount() - 1;
                } else {
                    i6 = this.f5743G.d(listAdapter.getCount() - 1, false);
                }
            } else {
                i5 = Integer.MAX_VALUE;
                i6 = Integer.MIN_VALUE;
            }
            if ((z3 && i4 == 19 && selectedItemPosition <= i5) || (!z3 && i4 == 20 && selectedItemPosition >= i6)) {
                s();
                this.f5772j0.setInputMethodMode(1);
                a();
                return true;
            }
            this.f5743G.setListSelectionHidden(false);
            if (this.f5743G.onKeyDown(i4, keyEvent)) {
                this.f5772j0.setInputMethodMode(2);
                this.f5743G.requestFocusFromTouch();
                a();
                if (i4 == 19 || i4 == 20 || i4 == 23 || i4 == 66) {
                    return true;
                }
            } else if (z3 && i4 == 20) {
                if (selectedItemPosition == i6) {
                    return true;
                }
            } else if (!z3 && i4 == 19 && selectedItemPosition == i5) {
                return true;
            }
        }
        return false;
    }

    public boolean N(int i4, @androidx.annotation.N KeyEvent keyEvent) {
        if (i4 == 4 && c()) {
            View view = this.f5759W;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    dismiss();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean O(int i4, @androidx.annotation.N KeyEvent keyEvent) {
        if (c() && this.f5743G.getSelectedItemPosition() >= 0) {
            boolean onKeyUp = this.f5743G.onKeyUp(i4, keyEvent);
            if (onKeyUp && I(i4)) {
                dismiss();
            }
            return onKeyUp;
        }
        return false;
    }

    public boolean P(int i4) {
        if (c()) {
            if (this.f5761Y != null) {
                M m4 = this.f5743G;
                this.f5761Y.onItemClick(m4, m4.getChildAt(i4 - m4.getFirstVisiblePosition()), i4, m4.getAdapter().getItemId(i4));
                return true;
            }
            return true;
        }
        return false;
    }

    public void Q() {
        this.f5768f0.post(this.f5767e0);
    }

    public void S(@androidx.annotation.P View view) {
        this.f5759W = view;
    }

    public void T(@androidx.annotation.d0 int i4) {
        this.f5772j0.setAnimationStyle(i4);
    }

    public void U(int i4) {
        Drawable background = this.f5772j0.getBackground();
        if (background != null) {
            background.getPadding(this.f5769g0);
            Rect rect = this.f5769g0;
            this.f5745I = rect.left + rect.right + i4;
            return;
        }
        n0(i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void V(boolean z3) {
        this.f5753Q = z3;
    }

    public void W(int i4) {
        this.f5752P = i4;
    }

    public void X(@androidx.annotation.P Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.f5770h0 = rect2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void Y(boolean z3) {
        this.f5754R = z3;
    }

    public void Z(int i4) {
        if (i4 < 0 && -2 != i4 && -1 != i4) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f5744H = i4;
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int r4 = r();
        boolean K3 = K();
        androidx.core.widget.p.d(this.f5772j0, this.f5748L);
        boolean z4 = true;
        if (this.f5772j0.isShowing()) {
            if (!C0823k0.O0(v())) {
                return;
            }
            int i8 = this.f5745I;
            if (i8 == -1) {
                i8 = -1;
            } else if (i8 == -2) {
                i8 = v().getWidth();
            }
            int i9 = this.f5744H;
            if (i9 == -1) {
                if (!K3) {
                    r4 = -1;
                }
                if (K3) {
                    PopupWindow popupWindow = this.f5772j0;
                    if (this.f5745I == -1) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    popupWindow.setWidth(i7);
                    this.f5772j0.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.f5772j0;
                    if (this.f5745I == -1) {
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    popupWindow2.setWidth(i6);
                    this.f5772j0.setHeight(-1);
                }
            } else if (i9 != -2) {
                r4 = i9;
            }
            PopupWindow popupWindow3 = this.f5772j0;
            if (this.f5754R || this.f5753Q) {
                z4 = false;
            }
            popupWindow3.setOutsideTouchable(z4);
            PopupWindow popupWindow4 = this.f5772j0;
            View v3 = v();
            int i10 = this.f5746J;
            int i11 = this.f5747K;
            if (i8 < 0) {
                i4 = -1;
            } else {
                i4 = i8;
            }
            if (r4 < 0) {
                i5 = -1;
            } else {
                i5 = r4;
            }
            popupWindow4.update(v3, i10, i11, i4, i5);
            return;
        }
        int i12 = this.f5745I;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = v().getWidth();
        }
        int i13 = this.f5744H;
        if (i13 == -1) {
            r4 = -1;
        } else if (i13 != -2) {
            r4 = i13;
        }
        this.f5772j0.setWidth(i12);
        this.f5772j0.setHeight(r4);
        i0(true);
        PopupWindow popupWindow5 = this.f5772j0;
        if (!this.f5754R && !this.f5753Q) {
            z3 = true;
        } else {
            z3 = false;
        }
        popupWindow5.setOutsideTouchable(z3);
        this.f5772j0.setTouchInterceptor(this.f5764b0);
        if (this.f5751O) {
            androidx.core.widget.p.c(this.f5772j0, this.f5750N);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f5733p0;
            if (method != null) {
                try {
                    method.invoke(this.f5772j0, this.f5770h0);
                } catch (Exception e4) {
                    Log.e(f5728k0, "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            e.a(this.f5772j0, this.f5770h0);
        }
        androidx.core.widget.p.e(this.f5772j0, v(), this.f5746J, this.f5747K, this.f5752P);
        this.f5743G.setSelection(-1);
        if (!this.f5771i0 || this.f5743G.isInTouchMode()) {
            s();
        }
        if (!this.f5771i0) {
            this.f5768f0.post(this.f5766d0);
        }
    }

    public void a0(int i4) {
        this.f5772j0.setInputMethodMode(i4);
    }

    public void b(@androidx.annotation.P Drawable drawable) {
        this.f5772j0.setBackgroundDrawable(drawable);
    }

    void b0(int i4) {
        this.f5755S = i4;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean c() {
        return this.f5772j0.isShowing();
    }

    public void c0(Drawable drawable) {
        this.f5760X = drawable;
    }

    public int d() {
        return this.f5746J;
    }

    public void d0(boolean z3) {
        this.f5771i0 = z3;
        this.f5772j0.setFocusable(z3);
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        this.f5772j0.dismiss();
        R();
        this.f5772j0.setContentView(null);
        this.f5743G = null;
        this.f5768f0.removeCallbacks(this.f5763a0);
    }

    public void e0(@androidx.annotation.P PopupWindow.OnDismissListener onDismissListener) {
        this.f5772j0.setOnDismissListener(onDismissListener);
    }

    public void f(int i4) {
        this.f5746J = i4;
    }

    public void f0(@androidx.annotation.P AdapterView.OnItemClickListener onItemClickListener) {
        this.f5761Y = onItemClickListener;
    }

    public void g0(@androidx.annotation.P AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f5762Z = onItemSelectedListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void h0(boolean z3) {
        this.f5751O = true;
        this.f5750N = z3;
    }

    @androidx.annotation.P
    public Drawable i() {
        return this.f5772j0.getBackground();
    }

    public void j0(int i4) {
        this.f5757U = i4;
    }

    @Override // androidx.appcompat.view.menu.q
    @androidx.annotation.P
    public ListView k() {
        return this.f5743G;
    }

    public void k0(@androidx.annotation.P View view) {
        boolean c4 = c();
        if (c4) {
            R();
        }
        this.f5756T = view;
        if (c4) {
            a();
        }
    }

    public void l(int i4) {
        this.f5747K = i4;
        this.f5749M = true;
    }

    public void l0(int i4) {
        M m4 = this.f5743G;
        if (c() && m4 != null) {
            m4.setListSelectionHidden(false);
            m4.setSelection(i4);
            if (m4.getChoiceMode() != 0) {
                m4.setItemChecked(i4, true);
            }
        }
    }

    public void m0(int i4) {
        this.f5772j0.setSoftInputMode(i4);
    }

    public void n0(int i4) {
        this.f5745I = i4;
    }

    public int o() {
        if (!this.f5749M) {
            return 0;
        }
        return this.f5747K;
    }

    public void o0(int i4) {
        this.f5748L = i4;
    }

    public void q(@androidx.annotation.P ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f5758V;
        if (dataSetObserver == null) {
            this.f5758V = new g();
        } else {
            ListAdapter listAdapter2 = this.f5742F;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5742F = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5758V);
        }
        M m4 = this.f5743G;
        if (m4 != null) {
            m4.setAdapter(this.f5742F);
        }
    }

    public void s() {
        M m4 = this.f5743G;
        if (m4 != null) {
            m4.setListSelectionHidden(true);
            m4.requestLayout();
        }
    }

    public View.OnTouchListener t(View view) {
        return new a(view);
    }

    @androidx.annotation.N
    M u(Context context, boolean z3) {
        return new M(context, z3);
    }

    @androidx.annotation.P
    public View v() {
        return this.f5759W;
    }

    @androidx.annotation.d0
    public int w() {
        return this.f5772j0.getAnimationStyle();
    }

    @androidx.annotation.P
    public Rect x() {
        if (this.f5770h0 != null) {
            return new Rect(this.f5770h0);
        }
        return null;
    }

    public int y() {
        return this.f5744H;
    }

    public int z() {
        return this.f5772j0.getInputMethodMode();
    }

    public Q(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49193Z1);
    }

    public Q(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        this(context, attributeSet, i4, 0);
    }

    public Q(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, @InterfaceC0563f int i4, @androidx.annotation.d0 int i5) {
        this.f5744H = -2;
        this.f5745I = -2;
        this.f5748L = 1002;
        this.f5752P = 0;
        this.f5753Q = false;
        this.f5754R = false;
        this.f5755S = Integer.MAX_VALUE;
        this.f5757U = 0;
        this.f5763a0 = new j();
        this.f5764b0 = new i();
        this.f5765c0 = new h();
        this.f5766d0 = new f();
        this.f5769g0 = new Rect();
        this.f5741E = context;
        this.f5768f0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.a4, i4, i5);
        this.f5746J = obtainStyledAttributes.getDimensionPixelOffset(C2042a.m.b4, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C2042a.m.c4, 0);
        this.f5747K = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5749M = true;
        }
        obtainStyledAttributes.recycle();
        C0605s c0605s = new C0605s(context, attributeSet, i4, i5);
        this.f5772j0 = c0605s;
        c0605s.setInputMethodMode(1);
    }
}
