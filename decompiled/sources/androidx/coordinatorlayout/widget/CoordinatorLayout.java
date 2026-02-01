package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.core.content.C0669d;
import androidx.core.util.p;
import androidx.core.util.t;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.W;
import androidx.core.view.X;
import androidx.core.view.Y0;
import androidx.core.view.Z;
import com.google.firebase.remoteconfig.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.C2352a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements W, X {

    /* renamed from: a0, reason: collision with root package name */
    static final String f11451a0 = "CoordinatorLayout";

    /* renamed from: b0, reason: collision with root package name */
    static final String f11452b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f11453c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f11454d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    static final Class<?>[] f11455e0;

    /* renamed from: f0, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f11456f0;

    /* renamed from: g0, reason: collision with root package name */
    static final int f11457g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    static final int f11458h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    static final int f11459i0 = 2;

    /* renamed from: j0, reason: collision with root package name */
    static final Comparator<View> f11460j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final t.a<Rect> f11461k0;

    /* renamed from: E, reason: collision with root package name */
    private final List<View> f11462E;

    /* renamed from: F, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f11463F;

    /* renamed from: G, reason: collision with root package name */
    private final List<View> f11464G;

    /* renamed from: H, reason: collision with root package name */
    private Paint f11465H;

    /* renamed from: I, reason: collision with root package name */
    private final int[] f11466I;

    /* renamed from: J, reason: collision with root package name */
    private final int[] f11467J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f11468K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f11469L;

    /* renamed from: M, reason: collision with root package name */
    private int[] f11470M;

    /* renamed from: N, reason: collision with root package name */
    private View f11471N;

    /* renamed from: O, reason: collision with root package name */
    private View f11472O;

    /* renamed from: P, reason: collision with root package name */
    private h f11473P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f11474Q;

    /* renamed from: R, reason: collision with root package name */
    private Y0 f11475R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f11476S;

    /* renamed from: T, reason: collision with root package name */
    private Drawable f11477T;

    /* renamed from: U, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f11478U;

    /* renamed from: V, reason: collision with root package name */
    private InterfaceC0772a0 f11479V;

    /* renamed from: W, reason: collision with root package name */
    private final Z f11480W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0772a0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, Y0 y02) {
            return CoordinatorLayout.this.e0(y02);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @N
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public static void F(@N View view, @P Object obj) {
            ((g) view.getLayoutParams()).f11500r = obj;
        }

        @P
        public static Object e(@N View view) {
            return ((g) view.getLayoutParams()).f11500r;
        }

        @Deprecated
        public boolean A(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, @N View view2, int i4) {
            return false;
        }

        public boolean B(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, @N View view2, int i4, int i5) {
            if (i5 == 0) {
                return A(coordinatorLayout, v3, view, view2, i4);
            }
            return false;
        }

        @Deprecated
        public void C(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view) {
        }

        public void D(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4) {
            if (i4 == 0) {
                C(coordinatorLayout, v3, view);
            }
        }

        public boolean E(@N CoordinatorLayout coordinatorLayout, @N V v3, @N MotionEvent motionEvent) {
            return false;
        }

        public boolean a(@N CoordinatorLayout coordinatorLayout, @N V v3) {
            if (d(coordinatorLayout, v3) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean b(@N CoordinatorLayout coordinatorLayout, @N V v3, @N Rect rect) {
            return false;
        }

        @InterfaceC0569l
        public int c(@N CoordinatorLayout coordinatorLayout, @N V v3) {
            return C0823k0.f13589t;
        }

        @InterfaceC0580x(from = l.f37524n, to = 1.0d)
        public float d(@N CoordinatorLayout coordinatorLayout, @N V v3) {
            return 0.0f;
        }

        public boolean f(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view) {
            return false;
        }

        @N
        public Y0 g(@N CoordinatorLayout coordinatorLayout, @N V v3, @N Y0 y02) {
            return y02;
        }

        public void h(@N g gVar) {
        }

        public boolean i(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view) {
            return false;
        }

        public void j(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view) {
        }

        public void k() {
        }

        public boolean l(@N CoordinatorLayout coordinatorLayout, @N V v3, @N MotionEvent motionEvent) {
            return false;
        }

        public boolean m(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4) {
            return false;
        }

        public boolean n(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4, int i5, int i6, int i7) {
            return false;
        }

        public boolean o(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, float f4, float f5, boolean z3) {
            return false;
        }

        public boolean p(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, float f4, float f5) {
            return false;
        }

        @Deprecated
        public void q(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, @N int[] iArr) {
        }

        public void r(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, @N int[] iArr, int i6) {
            if (i6 == 0) {
                q(coordinatorLayout, v3, view, i4, i5, iArr);
            }
        }

        @Deprecated
        public void s(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, int i6, int i7) {
        }

        @Deprecated
        public void t(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, int i6, int i7, int i8) {
            if (i8 == 0) {
                s(coordinatorLayout, v3, view, i4, i5, i6, i7);
            }
        }

        public void u(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, int i6, int i7, int i8, @N int[] iArr) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
            t(coordinatorLayout, v3, view, i4, i5, i6, i7, i8);
        }

        @Deprecated
        public void v(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, @N View view2, int i4) {
        }

        public void w(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, @N View view2, int i4, int i5) {
            if (i5 == 0) {
                v(coordinatorLayout, v3, view, view2, i4);
            }
        }

        public boolean x(@N CoordinatorLayout coordinatorLayout, @N V v3, @N Rect rect, boolean z3) {
            return false;
        }

        public void y(@N CoordinatorLayout coordinatorLayout, @N V v3, @N Parcelable parcelable) {
        }

        @P
        public Parcelable z(@N CoordinatorLayout coordinatorLayout, @N V v3) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    private class f implements ViewGroup.OnHierarchyChangeListener {
        f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f11478U;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.O(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f11478U;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements ViewTreeObserver.OnPreDrawListener {
        h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.O(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class j implements Comparator<View> {
        j() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float F02 = C0823k0.F0(view);
            float F03 = C0823k0.F0(view2);
            if (F02 > F03) {
                return -1;
            }
            if (F02 < F03) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f11452b0 = str;
        f11460j0 = new j();
        f11455e0 = new Class[]{Context.class, AttributeSet.class};
        f11456f0 = new ThreadLocal<>();
        f11461k0 = new t.c(12);
    }

    public CoordinatorLayout(@N Context context) {
        this(context, null);
    }

    private void B(int i4, Rect rect, Rect rect2, g gVar, int i5, int i6) {
        int width;
        int height;
        int d4 = C.d(Z(gVar.f11485c), i4);
        int d5 = C.d(a0(gVar.f11486d), i4);
        int i7 = d4 & 7;
        int i8 = d4 & 112;
        int i9 = d5 & 7;
        int i10 = d5 & 112;
        if (i9 != 1) {
            if (i9 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i10 != 16) {
            if (i10 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i7 != 1) {
            if (i7 != 5) {
                width -= i5;
            }
        } else {
            width -= i5 / 2;
        }
        if (i8 != 16) {
            if (i8 != 80) {
                height -= i6;
            }
        } else {
            height -= i6 / 2;
        }
        rect2.set(width, height, i5 + width, i6 + height);
    }

    private int C(int i4) {
        int[] iArr = this.f11470M;
        if (iArr == null) {
            Log.e(f11451a0, "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e(f11451a0, "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    private void F(List<View> list) {
        int i4;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            if (isChildrenDrawingOrderEnabled) {
                i4 = getChildDrawingOrder(childCount, i5);
            } else {
                i4 = i5;
            }
            list.add(getChildAt(i4));
        }
        Comparator<View> comparator = f11460j0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean G(View view) {
        return this.f11463F.k(view);
    }

    private void I(View view, int i4) {
        g gVar = (g) view.getLayoutParams();
        Rect f4 = f();
        f4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.f11475R != null && C0823k0.U(this) && !C0823k0.U(view)) {
            f4.left += this.f11475R.p();
            f4.top += this.f11475R.r();
            f4.right -= this.f11475R.q();
            f4.bottom -= this.f11475R.o();
        }
        Rect f5 = f();
        C.b(a0(gVar.f11485c), view.getMeasuredWidth(), view.getMeasuredHeight(), f4, f5, i4);
        view.layout(f5.left, f5.top, f5.right, f5.bottom);
        W(f4);
        W(f5);
    }

    private void J(View view, View view2, int i4) {
        Rect f4 = f();
        Rect f5 = f();
        try {
            z(view2, f4);
            A(view, i4, f4, f5);
            view.layout(f5.left, f5.top, f5.right, f5.bottom);
        } finally {
            W(f4);
            W(f5);
        }
    }

    private void K(View view, int i4, int i5) {
        int i6;
        g gVar = (g) view.getLayoutParams();
        int d4 = C.d(b0(gVar.f11485c), i5);
        int i7 = d4 & 7;
        int i8 = d4 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i5 == 1) {
            i4 = width - i4;
        }
        int C3 = C(i4) - measuredWidth;
        if (i7 != 1) {
            if (i7 == 5) {
                C3 += measuredWidth;
            }
        } else {
            C3 += measuredWidth / 2;
        }
        if (i8 != 16) {
            if (i8 != 80) {
                i6 = 0;
            } else {
                i6 = measuredHeight;
            }
        } else {
            i6 = measuredHeight / 2;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(C3, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private MotionEvent L(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private void M(View view, Rect rect, int i4) {
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        if (C0823k0.U0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c f4 = gVar.f();
            Rect f5 = f();
            Rect f6 = f();
            f6.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f4 != null && f4.b(this, view, f5)) {
                if (!f6.contains(f5)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + f5.toShortString() + " | Bounds:" + f6.toShortString());
                }
            } else {
                f5.set(f6);
            }
            W(f6);
            if (f5.isEmpty()) {
                W(f5);
                return;
            }
            int d4 = C.d(gVar.f11490h, i4);
            boolean z4 = true;
            if ((d4 & 48) == 48 && (i9 = (f5.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.f11492j) < (i10 = rect.top)) {
                d0(view, i10 - i9);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((d4 & 80) == 80 && (height = ((getHeight() - f5.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.f11492j) < (i8 = rect.bottom)) {
                d0(view, height - i8);
            } else if (!z3) {
                d0(view, 0);
            }
            if ((d4 & 3) == 3 && (i6 = (f5.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.f11491i) < (i7 = rect.left)) {
                c0(view, i7 - i6);
            } else {
                z4 = false;
            }
            if ((d4 & 5) == 5 && (width = ((getWidth() - f5.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.f11491i) < (i5 = rect.right)) {
                c0(view, width - i5);
            } else if (!z4) {
                c0(view, 0);
            }
            W(f5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c R(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f11452b0;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f11456f0;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f11455e0);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e4) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e4);
        }
    }

    private boolean S(c cVar, View view, MotionEvent motionEvent, int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                return cVar.E(this, view, motionEvent);
            }
            throw new IllegalArgumentException();
        }
        return cVar.l(this, view, motionEvent);
    }

    private boolean T(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f11464G;
        F(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            g gVar = (g) view.getLayoutParams();
            c f4 = gVar.f();
            if ((z3 || z4) && actionMasked != 0) {
                if (f4 != null) {
                    if (motionEvent2 == null) {
                        motionEvent2 = L(motionEvent);
                    }
                    S(f4, view, motionEvent2, i4);
                }
            } else {
                if (!z4 && !z3 && f4 != null && (z3 = S(f4, view, motionEvent, i4))) {
                    this.f11471N = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i6 = 0; i6 < i5; i6++) {
                            View view2 = list.get(i6);
                            c f5 = ((g) view2.getLayoutParams()).f();
                            if (f5 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = L(motionEvent);
                                }
                                S(f5, view2, motionEvent2, i4);
                            }
                        }
                    }
                }
                boolean c4 = gVar.c();
                boolean j4 = gVar.j(this, view);
                if (j4 && !c4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (j4 && !z4) {
                    break;
                }
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z3;
    }

    private void U() {
        this.f11462E.clear();
        this.f11463F.c();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            g E3 = E(childAt);
            E3.d(this, childAt);
            this.f11463F.b(childAt);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (E3.b(this, childAt, childAt2)) {
                        if (!this.f11463F.d(childAt2)) {
                            this.f11463F.b(childAt2);
                        }
                        this.f11463F.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f11462E.addAll(this.f11463F.j());
        Collections.reverse(this.f11462E);
    }

    private static void W(@N Rect rect) {
        rect.setEmpty();
        f11461k0.a(rect);
    }

    private void Y() {
        View view = this.f11471N;
        if (view != null) {
            c f4 = ((g) view.getLayoutParams()).f();
            if (f4 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                f4.E(this, this.f11471N, obtain);
                obtain.recycle();
            }
            this.f11471N = null;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((g) getChildAt(i4).getLayoutParams()).n();
        }
        this.f11468K = false;
    }

    private static int Z(int i4) {
        if (i4 == 0) {
            return 17;
        }
        return i4;
    }

    private static int a0(int i4) {
        if ((i4 & 7) == 0) {
            i4 |= C.f13101b;
        }
        return (i4 & 112) == 0 ? i4 | 48 : i4;
    }

    private static int b0(int i4) {
        if (i4 == 0) {
            return 8388661;
        }
        return i4;
    }

    private void c0(View view, int i4) {
        g gVar = (g) view.getLayoutParams();
        int i5 = gVar.f11491i;
        if (i5 != i4) {
            C0823k0.e1(view, i4 - i5);
            gVar.f11491i = i4;
        }
    }

    private void d0(View view, int i4) {
        g gVar = (g) view.getLayoutParams();
        int i5 = gVar.f11492j;
        if (i5 != i4) {
            C0823k0.f1(view, i4 - i5);
            gVar.f11492j = i4;
        }
    }

    @N
    private static Rect f() {
        Rect b4 = f11461k0.b();
        if (b4 == null) {
            return new Rect();
        }
        return b4;
    }

    private void f0() {
        if (C0823k0.U(this)) {
            if (this.f11479V == null) {
                this.f11479V = new a();
            }
            C0823k0.a2(this, this.f11479V);
            setSystemUiVisibility(1280);
            return;
        }
        C0823k0.a2(this, null);
    }

    private void h() {
        int childCount = getChildCount();
        MotionEvent motionEvent = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            c f4 = ((g) childAt.getLayoutParams()).f();
            if (f4 != null) {
                if (motionEvent == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                f4.l(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private static int i(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    private void j(g gVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
    }

    private Y0 k(Y0 y02) {
        c f4;
        if (y02.A()) {
            return y02;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (C0823k0.U(childAt) && (f4 = ((g) childAt.getLayoutParams()).f()) != null) {
                y02 = f4.g(this, childAt, y02);
                if (y02.A()) {
                    break;
                }
            }
        }
        return y02;
    }

    void A(View view, int i4, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        B(i4, rect, rect2, gVar, measuredWidth, measuredHeight);
        j(gVar, rect2, measuredWidth, measuredHeight);
    }

    void D(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    g E(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.f11484b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(f11451a0, "Attached behavior class is null");
                }
                gVar.q(behavior);
                gVar.f11484b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.q(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e4) {
                        Log.e(f11451a0, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                    }
                }
                gVar.f11484b = true;
            }
        }
        return gVar;
    }

    public boolean H(@N View view, int i4, int i5) {
        Rect f4 = f();
        z(view, f4);
        try {
            return f4.contains(i4, i5);
        } finally {
            W(f4);
        }
    }

    void N(View view, int i4) {
        c f4;
        g gVar = (g) view.getLayoutParams();
        if (gVar.f11493k != null) {
            Rect f5 = f();
            Rect f6 = f();
            Rect f7 = f();
            z(gVar.f11493k, f5);
            boolean z3 = false;
            w(view, false, f6);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            B(i4, f5, f7, gVar, measuredWidth, measuredHeight);
            if (f7.left != f6.left || f7.top != f6.top) {
                z3 = true;
            }
            j(gVar, f7, measuredWidth, measuredHeight);
            int i5 = f7.left - f6.left;
            int i6 = f7.top - f6.top;
            if (i5 != 0) {
                C0823k0.e1(view, i5);
            }
            if (i6 != 0) {
                C0823k0.f1(view, i6);
            }
            if (z3 && (f4 = gVar.f()) != null) {
                f4.i(this, view, gVar.f11493k);
            }
            W(f5);
            W(f6);
            W(f7);
        }
    }

    final void O(int i4) {
        boolean z3;
        int Z3 = C0823k0.Z(this);
        int size = this.f11462E.size();
        Rect f4 = f();
        Rect f5 = f();
        Rect f6 = f();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f11462E.get(i5);
            g gVar = (g) view.getLayoutParams();
            if (i4 != 0 || view.getVisibility() != 8) {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (gVar.f11494l == this.f11462E.get(i6)) {
                        N(view, Z3);
                    }
                }
                w(view, true, f5);
                if (gVar.f11489g != 0 && !f5.isEmpty()) {
                    int d4 = C.d(gVar.f11489g, Z3);
                    int i7 = d4 & 112;
                    if (i7 != 48) {
                        if (i7 == 80) {
                            f4.bottom = Math.max(f4.bottom, getHeight() - f5.top);
                        }
                    } else {
                        f4.top = Math.max(f4.top, f5.bottom);
                    }
                    int i8 = d4 & 7;
                    if (i8 != 3) {
                        if (i8 == 5) {
                            f4.right = Math.max(f4.right, getWidth() - f5.left);
                        }
                    } else {
                        f4.left = Math.max(f4.left, f5.right);
                    }
                }
                if (gVar.f11490h != 0 && view.getVisibility() == 0) {
                    M(view, f4, Z3);
                }
                if (i4 != 2) {
                    D(view, f6);
                    if (!f6.equals(f5)) {
                        V(view, f5);
                    }
                }
                for (int i9 = i5 + 1; i9 < size; i9++) {
                    View view2 = this.f11462E.get(i9);
                    g gVar2 = (g) view2.getLayoutParams();
                    c f7 = gVar2.f();
                    if (f7 != null && f7.f(this, view2, view)) {
                        if (i4 == 0 && gVar2.g()) {
                            gVar2.l();
                        } else {
                            if (i4 != 2) {
                                z3 = f7.i(this, view2, view);
                            } else {
                                f7.j(this, view2, view);
                                z3 = true;
                            }
                            if (i4 == 1) {
                                gVar2.r(z3);
                            }
                        }
                    }
                }
            }
        }
        W(f4);
        W(f5);
        W(f6);
    }

    public void P(@N View view, int i4) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.a()) {
            View view2 = gVar.f11493k;
            if (view2 != null) {
                J(view, view2, i4);
                return;
            }
            int i5 = gVar.f11487e;
            if (i5 >= 0) {
                K(view, i5, i4);
                return;
            } else {
                I(view, i4);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void Q(View view, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    void V(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    void X() {
        if (this.f11469L && this.f11473P != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f11473P);
        }
        this.f11474Q = false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof g) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.f11483a;
        if (cVar != null) {
            float d4 = cVar.d(this, view);
            if (d4 > 0.0f) {
                if (this.f11465H == null) {
                    this.f11465H = new Paint();
                }
                this.f11465H.setColor(gVar.f11483a.c(this, view));
                this.f11465H.setAlpha(i(Math.round(d4 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f11465H);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11477T;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // androidx.core.view.X
    public void e(@N View view, int i4, int i5, int i6, int i7, int i8, @N int[] iArr) {
        c f4;
        int min;
        boolean z3;
        int min2;
        int childCount = getChildCount();
        boolean z4 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i8) && (f4 = gVar.f()) != null) {
                    int[] iArr2 = this.f11466I;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f4.u(this, childAt, view, i4, i5, i6, i7, i8, iArr2);
                    if (i6 > 0) {
                        min = Math.max(i9, this.f11466I[0]);
                    } else {
                        min = Math.min(i9, this.f11466I[0]);
                    }
                    i9 = min;
                    if (i7 > 0) {
                        z3 = true;
                        min2 = Math.max(i10, this.f11466I[1]);
                    } else {
                        z3 = true;
                        min2 = Math.min(i10, this.f11466I[1]);
                    }
                    i10 = min2;
                    z4 = z3;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z4) {
            O(1);
        }
    }

    final Y0 e0(Y0 y02) {
        boolean z3;
        if (!p.a(this.f11475R, y02)) {
            this.f11475R = y02;
            boolean z4 = false;
            if (y02 != null && y02.r() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f11476S = z3;
            if (!z3 && getBackground() == null) {
                z4 = true;
            }
            setWillNotDraw(z4);
            Y0 k4 = k(y02);
            requestLayout();
            return k4;
        }
        return y02;
    }

    void g() {
        if (this.f11469L) {
            if (this.f11473P == null) {
                this.f11473P = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f11473P);
        }
        this.f11474Q = true;
    }

    @i0
    final List<View> getDependencySortedChildren() {
        U();
        return Collections.unmodifiableList(this.f11462E);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Y0 getLastWindowInsets() {
        return this.f11475R;
    }

    @Override // android.view.ViewGroup, androidx.core.view.Y
    public int getNestedScrollAxes() {
        return this.f11480W.a();
    }

    @P
    public Drawable getStatusBarBackground() {
        return this.f11477T;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void l(@N View view) {
        ArrayList<View> h4 = this.f11463F.h(view);
        if (h4 != null && !h4.isEmpty()) {
            for (int i4 = 0; i4 < h4.size(); i4++) {
                View view2 = h4.get(i4);
                c f4 = ((g) view2.getLayoutParams()).f();
                if (f4 != null) {
                    f4.i(this, view2, view);
                }
            }
        }
    }

    public boolean m(@N View view, @N View view2) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect f4 = f();
        if (view.getParent() != this) {
            z3 = true;
        } else {
            z3 = false;
        }
        w(view, z3, f4);
        Rect f5 = f();
        if (view2.getParent() != this) {
            z4 = true;
        } else {
            z4 = false;
        }
        w(view2, z4, f5);
        try {
            if (f4.left <= f5.right && f4.top <= f5.bottom && f4.right >= f5.left) {
                if (f4.bottom >= f5.top) {
                    z5 = true;
                }
            }
            return z5;
        } finally {
            W(f4);
            W(f5);
        }
    }

    void n() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (G(getChildAt(i4))) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3 != this.f11474Q) {
            if (z3) {
                g();
            } else {
                X();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y();
        if (this.f11474Q) {
            if (this.f11473P == null) {
                this.f11473P = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f11473P);
        }
        if (this.f11475R == null && C0823k0.U(this)) {
            C0823k0.v1(this);
        }
        this.f11469L = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Y();
        if (this.f11474Q && this.f11473P != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f11473P);
        }
        View view = this.f11472O;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f11469L = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        if (this.f11476S && this.f11477T != null) {
            Y0 y02 = this.f11475R;
            if (y02 != null) {
                i4 = y02.r();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f11477T.setBounds(0, 0, getWidth(), i4);
                this.f11477T.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Y();
        }
        boolean T3 = T(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11471N = null;
            Y();
        }
        return T3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        c f4;
        int Z3 = C0823k0.Z(this);
        int size = this.f11462E.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = this.f11462E.get(i8);
            if (view.getVisibility() != 8 && ((f4 = ((g) view.getLayoutParams()).f()) == null || !f4.m(this, view, Z3))) {
                P(view, Z3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if (r0.n(r30, r20, r11, r21, r23, 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        c f6;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f6 = gVar.f()) != null) {
                    z4 |= f6.o(this, childAt, view, f4, f5, z3);
                }
            }
        }
        if (z4) {
            O(1);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedPreFling(View view, float f4, float f5) {
        c f6;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f6 = gVar.f()) != null) {
                    z3 |= f6.p(this, childAt, view, f4, f5);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        v(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        r(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        t(view, view2, i4, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        SparseArray<Parcelable> sparseArray = iVar.f11502G;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            c f4 = E(childAt).f();
            if (id != -1 && f4 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f4.y(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable z3;
        i iVar = new i(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            c f4 = ((g) childAt.getLayoutParams()).f();
            if (id != -1 && f4 != null && (z3 = f4.z(this, childAt)) != null) {
                sparseArray.append(id, z3);
            }
        }
        iVar.f11502G = sparseArray;
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return s(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onStopNestedScroll(View view) {
        u(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean T3;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f11471N;
        boolean z3 = false;
        if (view != null) {
            c f4 = ((g) view.getLayoutParams()).f();
            T3 = f4 != null ? f4.E(this, this.f11471N, motionEvent) : false;
        } else {
            T3 = T(motionEvent, 1);
            if (actionMasked != 0 && T3) {
                z3 = true;
            }
        }
        if (this.f11471N != null && actionMasked != 3) {
            if (z3) {
                MotionEvent L3 = L(motionEvent);
                super.onTouchEvent(L3);
                L3.recycle();
            }
        } else {
            T3 |= super.onTouchEvent(motionEvent);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11471N = null;
            Y();
        }
        return T3;
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    @Override // androidx.core.view.W
    public void r(View view, int i4, int i5, int i6, int i7, int i8) {
        e(view, i4, i5, i6, i7, 0, this.f11467J);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        c f4 = ((g) view.getLayoutParams()).f();
        if (f4 != null && f4.x(this, view, rect, z3)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (z3 && !this.f11468K) {
            if (this.f11471N == null) {
                h();
            }
            Y();
            this.f11468K = true;
        }
    }

    @Override // androidx.core.view.W
    public boolean s(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c f4 = gVar.f();
                if (f4 != null) {
                    boolean B3 = f4.B(this, childAt, view, view2, i4, i5);
                    z3 |= B3;
                    gVar.t(i5, B3);
                } else {
                    gVar.t(i5, false);
                }
            }
        }
        return z3;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        f0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f11478U = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@P Drawable drawable) {
        boolean z3;
        Drawable drawable2 = this.f11477T;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f11477T = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f11477T.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.f11477T, C0823k0.Z(this));
                Drawable drawable4 = this.f11477T;
                if (getVisibility() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawable4.setVisible(z3, false);
                this.f11477T.setCallback(this);
            }
            C0823k0.n1(this);
        }
    }

    public void setStatusBarBackgroundColor(@InterfaceC0569l int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(@InterfaceC0578v int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0669d.i(getContext(), i4);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z3;
        super.setVisibility(i4);
        if (i4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f11477T;
        if (drawable != null && drawable.isVisible() != z3) {
            this.f11477T.setVisible(z3, false);
        }
    }

    @Override // androidx.core.view.W
    public void t(View view, View view2, int i4, int i5) {
        c f4;
        this.f11480W.c(view, view2, i4, i5);
        this.f11472O = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i5) && (f4 = gVar.f()) != null) {
                f4.w(this, childAt, view, view2, i4, i5);
            }
        }
    }

    @Override // androidx.core.view.W
    public void u(View view, int i4) {
        this.f11480W.e(view, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i4)) {
                c f4 = gVar.f();
                if (f4 != null) {
                    f4.D(this, childAt, view, i4);
                }
                gVar.m(i4);
                gVar.l();
            }
        }
        this.f11472O = null;
    }

    @Override // androidx.core.view.W
    public void v(View view, int i4, int i5, int[] iArr, int i6) {
        c f4;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i6) && (f4 = gVar.f()) != null) {
                    int[] iArr2 = this.f11466I;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f4.r(this, childAt, view, i4, i5, iArr2, i6);
                    if (i4 > 0) {
                        min = Math.max(i7, this.f11466I[0]);
                    } else {
                        min = Math.min(i7, this.f11466I[0]);
                    }
                    i7 = min;
                    if (i5 > 0) {
                        min2 = Math.max(i8, this.f11466I[1]);
                    } else {
                        min2 = Math.min(i8, this.f11466I[1]);
                    }
                    i8 = min2;
                    z3 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z3) {
            O(1);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f11477T) {
            return false;
        }
        return true;
    }

    void w(View view, boolean z3, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z3) {
                z(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @N
    public List<View> x(@N View view) {
        List<View> i4 = this.f11463F.i(view);
        if (i4 == null) {
            return Collections.emptyList();
        }
        return i4;
    }

    @N
    public List<View> y(@N View view) {
        List<View> g4 = this.f11463F.g(view);
        if (g4 == null) {
            return Collections.emptyList();
        }
        return g4;
    }

    void z(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    public CoordinatorLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, C2352a.C0509a.f54767a);
    }

    public CoordinatorLayout(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes;
        this.f11462E = new ArrayList();
        this.f11463F = new androidx.coordinatorlayout.widget.a<>();
        this.f11464G = new ArrayList();
        this.f11466I = new int[2];
        this.f11467J = new int[2];
        this.f11480W = new Z(this);
        if (i4 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2352a.d.f54784a, 0, C2352a.c.f54783a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2352a.d.f54784a, i4, 0);
        }
        if (i4 == 0) {
            C0823k0.z1(this, context, C2352a.d.f54784a, attributeSet, obtainStyledAttributes, 0, C2352a.c.f54783a);
        } else {
            C0823k0.z1(this, context, C2352a.d.f54784a, attributeSet, obtainStyledAttributes, i4, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C2352a.d.f54785b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f11470M = resources.getIntArray(resourceId);
            float f4 = resources.getDisplayMetrics().density;
            int length = this.f11470M.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.f11470M[i5] = (int) (r12[i5] * f4);
            }
        }
        this.f11477T = obtainStyledAttributes.getDrawable(C2352a.d.f54786c);
        obtainStyledAttributes.recycle();
        f0();
        super.setOnHierarchyChangeListener(new f());
        if (C0823k0.V(this) == 0) {
            C0823k0.R1(this, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class i extends androidx.customview.view.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        SparseArray<Parcelable> f11502G;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i4) {
                return new i[i4];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f11502G = new SparseArray<>(readInt);
            for (int i4 = 0; i4 < readInt; i4++) {
                this.f11502G.append(iArr[i4], readParcelableArray[i4]);
            }
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            int i5;
            super.writeToParcel(parcel, i4);
            SparseArray<Parcelable> sparseArray = this.f11502G;
            if (sparseArray != null) {
                i5 = sparseArray.size();
            } else {
                i5 = 0;
            }
            parcel.writeInt(i5);
            int[] iArr = new int[i5];
            Parcelable[] parcelableArr = new Parcelable[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                iArr[i6] = this.f11502G.keyAt(i6);
                parcelableArr[i6] = this.f11502G.valueAt(i6);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f11483a;

        /* renamed from: b, reason: collision with root package name */
        boolean f11484b;

        /* renamed from: c, reason: collision with root package name */
        public int f11485c;

        /* renamed from: d, reason: collision with root package name */
        public int f11486d;

        /* renamed from: e, reason: collision with root package name */
        public int f11487e;

        /* renamed from: f, reason: collision with root package name */
        int f11488f;

        /* renamed from: g, reason: collision with root package name */
        public int f11489g;

        /* renamed from: h, reason: collision with root package name */
        public int f11490h;

        /* renamed from: i, reason: collision with root package name */
        int f11491i;

        /* renamed from: j, reason: collision with root package name */
        int f11492j;

        /* renamed from: k, reason: collision with root package name */
        View f11493k;

        /* renamed from: l, reason: collision with root package name */
        View f11494l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f11495m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f11496n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f11497o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f11498p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f11499q;

        /* renamed from: r, reason: collision with root package name */
        Object f11500r;

        public g(int i4, int i5) {
            super(i4, i5);
            this.f11484b = false;
            this.f11485c = 0;
            this.f11486d = 0;
            this.f11487e = -1;
            this.f11488f = -1;
            this.f11489g = 0;
            this.f11490h = 0;
            this.f11499q = new Rect();
        }

        private void o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f11488f);
            this.f11493k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f11494l = null;
                        this.f11493k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f11494l = null;
                            this.f11493k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = parent;
                    }
                }
                this.f11494l = findViewById;
                return;
            }
            if (coordinatorLayout.isInEditMode()) {
                this.f11494l = null;
                this.f11493k = null;
                return;
            }
            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f11488f) + " to anchor view " + view);
        }

        private boolean u(View view, int i4) {
            int d4 = C.d(((g) view.getLayoutParams()).f11489g, i4);
            if (d4 != 0 && (C.d(this.f11490h, i4) & d4) == d4) {
                return true;
            }
            return false;
        }

        private boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f11493k.getId() != this.f11488f) {
                return false;
            }
            View view2 = this.f11493k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                } else {
                    this.f11494l = null;
                    this.f11493k = null;
                    return false;
                }
            }
            this.f11494l = view2;
            return true;
        }

        boolean a() {
            if (this.f11493k == null && this.f11488f != -1) {
                return true;
            }
            return false;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            if (view2 != this.f11494l && !u(view2, C0823k0.Z(coordinatorLayout)) && ((cVar = this.f11483a) == null || !cVar.f(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        boolean c() {
            if (this.f11483a == null) {
                this.f11495m = false;
            }
            return this.f11495m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f11488f == -1) {
                this.f11494l = null;
                this.f11493k = null;
                return null;
            }
            if (this.f11493k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f11493k;
        }

        @D
        public int e() {
            return this.f11488f;
        }

        @P
        public c f() {
            return this.f11483a;
        }

        boolean g() {
            return this.f11498p;
        }

        Rect h() {
            return this.f11499q;
        }

        void i() {
            this.f11494l = null;
            this.f11493k = null;
        }

        boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z3;
            boolean z4 = this.f11495m;
            if (z4) {
                return true;
            }
            c cVar = this.f11483a;
            if (cVar != null) {
                z3 = cVar.a(coordinatorLayout, view);
            } else {
                z3 = false;
            }
            boolean z5 = z3 | z4;
            this.f11495m = z5;
            return z5;
        }

        boolean k(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    return false;
                }
                return this.f11497o;
            }
            return this.f11496n;
        }

        void l() {
            this.f11498p = false;
        }

        void m(int i4) {
            t(i4, false);
        }

        void n() {
            this.f11495m = false;
        }

        public void p(@D int i4) {
            i();
            this.f11488f = i4;
        }

        public void q(@P c cVar) {
            c cVar2 = this.f11483a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.k();
                }
                this.f11483a = cVar;
                this.f11500r = null;
                this.f11484b = true;
                if (cVar != null) {
                    cVar.h(this);
                }
            }
        }

        void r(boolean z3) {
            this.f11498p = z3;
        }

        void s(Rect rect) {
            this.f11499q.set(rect);
        }

        void t(int i4, boolean z3) {
            if (i4 != 0) {
                if (i4 == 1) {
                    this.f11497o = z3;
                    return;
                }
                return;
            }
            this.f11496n = z3;
        }

        g(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11484b = false;
            this.f11485c = 0;
            this.f11486d = 0;
            this.f11487e = -1;
            this.f11488f = -1;
            this.f11489g = 0;
            this.f11490h = 0;
            this.f11499q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2352a.d.f54787d);
            this.f11485c = obtainStyledAttributes.getInteger(C2352a.d.f54788e, 0);
            this.f11488f = obtainStyledAttributes.getResourceId(C2352a.d.f54789f, -1);
            this.f11486d = obtainStyledAttributes.getInteger(C2352a.d.f54790g, 0);
            this.f11487e = obtainStyledAttributes.getInteger(C2352a.d.f54794k, -1);
            this.f11489g = obtainStyledAttributes.getInt(C2352a.d.f54793j, 0);
            this.f11490h = obtainStyledAttributes.getInt(C2352a.d.f54792i, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C2352a.d.f54791h);
            this.f11484b = hasValue;
            if (hasValue) {
                this.f11483a = CoordinatorLayout.R(context, attributeSet, obtainStyledAttributes.getString(C2352a.d.f54791h));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f11483a;
            if (cVar != null) {
                cVar.h(this);
            }
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.f11484b = false;
            this.f11485c = 0;
            this.f11486d = 0;
            this.f11487e = -1;
            this.f11488f = -1;
            this.f11489g = 0;
            this.f11490h = 0;
            this.f11499q = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11484b = false;
            this.f11485c = 0;
            this.f11486d = 0;
            this.f11487e = -1;
            this.f11488f = -1;
            this.f11489g = 0;
            this.f11490h = 0;
            this.f11499q = new Rect();
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11484b = false;
            this.f11485c = 0;
            this.f11486d = 0;
            this.f11487e = -1;
            this.f11488f = -1;
            this.f11489g = 0;
            this.f11490h = 0;
            this.f11499q = new Rect();
        }
    }
}
