package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.InterfaceC0577u;
import androidx.core.os.C0738a;
import androidx.core.view.C0850t0;
import d.C2042a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class M extends ListView {

    /* renamed from: R, reason: collision with root package name */
    public static final int f5695R = -1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f5696S = -1;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f5697E;

    /* renamed from: F, reason: collision with root package name */
    private int f5698F;

    /* renamed from: G, reason: collision with root package name */
    private int f5699G;

    /* renamed from: H, reason: collision with root package name */
    private int f5700H;

    /* renamed from: I, reason: collision with root package name */
    private int f5701I;

    /* renamed from: J, reason: collision with root package name */
    private int f5702J;

    /* renamed from: K, reason: collision with root package name */
    private d f5703K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f5704L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f5705M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f5706N;

    /* renamed from: O, reason: collision with root package name */
    private C0850t0 f5707O;

    /* renamed from: P, reason: collision with root package name */
    private androidx.core.widget.m f5708P;

    /* renamed from: Q, reason: collision with root package name */
    f f5709Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(View view, float f4, float f5) {
            view.drawableHotspotChanged(f4, f5);
        }
    }

    @androidx.annotation.W(30)
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f5710a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f5711b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f5712c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f5713d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f5710a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f5711b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f5712c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f5713d = true;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
        }

        private b() {
        }

        static boolean a() {
            return f5713d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        static void b(M m4, int i4, View view) {
            try {
                f5710a.invoke(m4, Integer.valueOf(i4), view, Boolean.FALSE, -1, -1);
                f5711b.invoke(m4, Integer.valueOf(i4));
                f5712c.invoke(m4, Integer.valueOf(i4));
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(33)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @InterfaceC0577u
        static void b(AbsListView absListView, boolean z3) {
            absListView.setSelectedChildViewEnabled(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends androidx.appcompat.graphics.drawable.c {

        /* renamed from: F, reason: collision with root package name */
        private boolean f5714F;

        d(Drawable drawable) {
            super(drawable);
            this.f5714F = true;
        }

        void c(boolean z3) {
            this.f5714F = z3;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f5714F) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspot(float f4, float f5) {
            if (this.f5714F) {
                super.setHotspot(f4, f5);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            if (this.f5714F) {
                super.setHotspotBounds(i4, i5, i6, i7);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f5714F) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z3, boolean z4) {
            if (this.f5714F) {
                return super.setVisible(z3, z4);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f5715a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
            }
            f5715a = field;
        }

        private e() {
        }

        static boolean a(AbsListView absListView) {
            Field field = f5715a;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        static void b(AbsListView absListView, boolean z3) {
            Field field = f5715a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z3));
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        public void a() {
            M m4 = M.this;
            m4.f5709Q = null;
            m4.removeCallbacks(this);
        }

        public void b() {
            M.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            M m4 = M.this;
            m4.f5709Q = null;
            m4.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(@androidx.annotation.N Context context, boolean z3) {
        super(context, null, C2042a.b.f49272p1);
        this.f5697E = new Rect();
        this.f5698F = 0;
        this.f5699G = 0;
        this.f5700H = 0;
        this.f5701I = 0;
        this.f5705M = z3;
        setCacheColorHint(0);
    }

    private void a() {
        this.f5706N = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f5702J - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0850t0 c0850t0 = this.f5707O;
        if (c0850t0 != null) {
            c0850t0.d();
            this.f5707O = null;
        }
    }

    private void b(View view, int i4) {
        performItemClick(view, i4, getItemIdAtPosition(i4));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (!this.f5697E.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f5697E);
            selector.draw(canvas);
        }
    }

    private void g(int i4, View view) {
        Rect rect = this.f5697E;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f5698F;
        rect.top -= this.f5699G;
        rect.right += this.f5700H;
        rect.bottom += this.f5701I;
        boolean l4 = l();
        if (view.isEnabled() != l4) {
            m(!l4);
            if (i4 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void h(int i4, View view) {
        boolean z3;
        Drawable selector = getSelector();
        boolean z4 = true;
        if (selector != null && i4 != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            selector.setVisible(false, false);
        }
        g(i4, view);
        if (z3) {
            Rect rect = this.f5697E;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z4 = false;
            }
            selector.setVisible(z4, false);
            androidx.core.graphics.drawable.d.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void i(int i4, View view, float f4, float f5) {
        h(i4, view);
        Drawable selector = getSelector();
        if (selector != null && i4 != -1) {
            androidx.core.graphics.drawable.d.k(selector, f4, f5);
        }
    }

    private void j(View view, int i4, float f4, float f5) {
        View childAt;
        this.f5706N = true;
        a.a(this, f4, f5);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i5 = this.f5702J;
        if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f5702J = i4;
        a.a(view, f4 - view.getLeft(), f5 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i4, view, f4, f5);
        k(false);
        refreshDrawableState();
    }

    private void k(boolean z3) {
        d dVar = this.f5703K;
        if (dVar != null) {
            dVar.c(z3);
        }
    }

    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    private boolean l() {
        if (C0738a.k()) {
            return c.a(this);
        }
        return e.a(this);
    }

    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    private void m(boolean z3) {
        if (C0738a.k()) {
            c.b(this, z3);
        } else {
            e.b(this, z3);
        }
    }

    private boolean n() {
        return this.f5706N;
    }

    private void o() {
        Drawable selector = getSelector();
        if (selector != null && n() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i4, boolean z3) {
        int min;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z3) {
                    min = Math.max(0, i4);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i4, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            }
            if (i4 >= 0 && i4 < count) {
                return i4;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f5709Q != null) {
            return;
        }
        super.drawableStateChanged();
        k(true);
        o();
    }

    public int e(int i4, int i5, int i6, int i7, int i8) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i10 = 0;
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            if (i13 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i4, makeMeasureSpec);
            view.forceLayout();
            if (i12 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i7) {
                if (i8 >= 0 && i12 > i8 && i11 > 0 && i9 != i7) {
                    return i11;
                }
                return i7;
            }
            if (i8 >= 0 && i12 >= i8) {
                i11 = i9;
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.j(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.m r9 = r7.f5708P
            if (r9 != 0) goto L5a
            androidx.core.widget.m r9 = new androidx.core.widget.m
            r9.<init>(r7)
            r7.f5708P = r9
        L5a:
            androidx.core.widget.m r9 = r7.f5708P
            r9.o(r1)
            androidx.core.widget.m r9 = r7.f5708P
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.m r8 = r7.f5708P
            if (r8 == 0) goto L6c
            r8.o(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.M.f(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (!this.f5705M && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (!this.f5705M && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (!this.f5705M && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if ((this.f5705M && this.f5704L) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f5709Q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@androidx.annotation.N MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5709Q == null) {
            f fVar = new f();
            this.f5709Q = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i4 >= 30 && b.a()) {
                        b.b(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                o();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5702J = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f5709Q;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z3) {
        this.f5704L = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
        } else {
            dVar = null;
        }
        this.f5703K = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5698F = rect.left;
        this.f5699G = rect.top;
        this.f5700H = rect.right;
        this.f5701I = rect.bottom;
    }
}
