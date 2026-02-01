package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AbstractC0583a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0823k0;
import androidx.lifecycle.Lifecycle;
import d.C2042a;
import e.C2046a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.J {

    /* renamed from: B0, reason: collision with root package name */
    private static final String f5922B0 = "Toolbar";

    /* renamed from: A0, reason: collision with root package name */
    private final Runnable f5923A0;

    /* renamed from: E, reason: collision with root package name */
    ActionMenuView f5924E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f5925F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f5926G;

    /* renamed from: H, reason: collision with root package name */
    private ImageButton f5927H;

    /* renamed from: I, reason: collision with root package name */
    private ImageView f5928I;

    /* renamed from: J, reason: collision with root package name */
    private Drawable f5929J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence f5930K;

    /* renamed from: L, reason: collision with root package name */
    ImageButton f5931L;

    /* renamed from: M, reason: collision with root package name */
    View f5932M;

    /* renamed from: N, reason: collision with root package name */
    private Context f5933N;

    /* renamed from: O, reason: collision with root package name */
    private int f5934O;

    /* renamed from: P, reason: collision with root package name */
    private int f5935P;

    /* renamed from: Q, reason: collision with root package name */
    private int f5936Q;

    /* renamed from: R, reason: collision with root package name */
    int f5937R;

    /* renamed from: S, reason: collision with root package name */
    private int f5938S;

    /* renamed from: T, reason: collision with root package name */
    private int f5939T;

    /* renamed from: U, reason: collision with root package name */
    private int f5940U;

    /* renamed from: V, reason: collision with root package name */
    private int f5941V;

    /* renamed from: W, reason: collision with root package name */
    private int f5942W;

    /* renamed from: a0, reason: collision with root package name */
    private X f5943a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f5944b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f5945c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f5946d0;

    /* renamed from: e0, reason: collision with root package name */
    private CharSequence f5947e0;

    /* renamed from: f0, reason: collision with root package name */
    private CharSequence f5948f0;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f5949g0;

    /* renamed from: h0, reason: collision with root package name */
    private ColorStateList f5950h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f5951i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f5952j0;

    /* renamed from: k0, reason: collision with root package name */
    private final ArrayList<View> f5953k0;

    /* renamed from: l0, reason: collision with root package name */
    private final ArrayList<View> f5954l0;

    /* renamed from: m0, reason: collision with root package name */
    private final int[] f5955m0;

    /* renamed from: n0, reason: collision with root package name */
    final androidx.core.view.M f5956n0;

    /* renamed from: o0, reason: collision with root package name */
    private ArrayList<MenuItem> f5957o0;

    /* renamed from: p0, reason: collision with root package name */
    h f5958p0;

    /* renamed from: q0, reason: collision with root package name */
    private final ActionMenuView.e f5959q0;

    /* renamed from: r0, reason: collision with root package name */
    private j0 f5960r0;

    /* renamed from: s0, reason: collision with root package name */
    private C0590c f5961s0;

    /* renamed from: t0, reason: collision with root package name */
    private f f5962t0;

    /* renamed from: u0, reason: collision with root package name */
    private n.a f5963u0;

    /* renamed from: v0, reason: collision with root package name */
    g.a f5964v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f5965w0;

    /* renamed from: x0, reason: collision with root package name */
    private OnBackInvokedCallback f5966x0;

    /* renamed from: y0, reason: collision with root package name */
    private OnBackInvokedDispatcher f5967y0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f5968z0;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f5956n0.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f5958p0;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.N androidx.appcompat.view.menu.g gVar, @androidx.annotation.N MenuItem menuItem) {
            g.a aVar = Toolbar.this.f5964v0;
            if (aVar != null && aVar.a(gVar, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.N androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f5924E.N()) {
                Toolbar.this.f5956n0.k(gVar);
            }
            g.a aVar = Toolbar.this.f5964v0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(33)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @androidx.annotation.P
        @InterfaceC0577u
        static OnBackInvokedDispatcher a(@androidx.annotation.N View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @InterfaceC0577u
        @androidx.annotation.N
        static OnBackInvokedCallback b(@androidx.annotation.N Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.m(runnable);
        }

        @InterfaceC0577u
        static void c(@androidx.annotation.N Object obj, @androidx.annotation.N Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(kotlin.time.g.f52879a, (OnBackInvokedCallback) obj2);
        }

        @InterfaceC0577u
        static void d(@androidx.annotation.N Object obj, @androidx.annotation.N Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.n {

        /* renamed from: E, reason: collision with root package name */
        androidx.appcompat.view.menu.g f5973E;

        /* renamed from: F, reason: collision with root package name */
        androidx.appcompat.view.menu.j f5974F;

        f() {
        }

        @Override // androidx.appcompat.view.menu.n
        public void b(androidx.appcompat.view.menu.g gVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void d(boolean z3) {
            if (this.f5974F != null) {
                androidx.appcompat.view.menu.g gVar = this.f5973E;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (this.f5973E.getItem(i4) == this.f5974F) {
                            return;
                        }
                    }
                }
                f(this.f5973E, this.f5974F);
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            KeyEvent.Callback callback = Toolbar.this.f5932M;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f5932M);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f5931L);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f5932M = null;
            toolbar3.a();
            this.f5974F = null;
            Toolbar.this.requestLayout();
            jVar.t(false);
            Toolbar.this.Z();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar.this.i();
            ViewParent parent = Toolbar.this.f5931L.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f5931L);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f5931L);
            }
            Toolbar.this.f5932M = jVar.getActionView();
            this.f5974F = jVar;
            ViewParent parent2 = Toolbar.this.f5932M.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f5932M);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f4816a = (toolbar4.f5937R & 112) | androidx.core.view.C.f13101b;
                generateDefaultLayoutParams.f5979b = 2;
                toolbar4.f5932M.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f5932M);
            }
            Toolbar.this.O();
            Toolbar.this.requestLayout();
            jVar.t(true);
            KeyEvent.Callback callback = Toolbar.this.f5932M;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).b();
            }
            Toolbar.this.Z();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n
        public void h(n.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.f5973E;
            if (gVar2 != null && (jVar = this.f5974F) != null) {
                gVar2.g(jVar);
            }
            this.f5973E = gVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public void j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean l(androidx.appcompat.view.menu.s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public androidx.appcompat.view.menu.o m(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public Parcelable n() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class i extends androidx.customview.view.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        int f5980G;

        /* renamed from: H, reason: collision with root package name */
        boolean f5981H;

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

        public i(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f5980G);
            parcel.writeInt(this.f5981H ? 1 : 0);
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5980G = parcel.readInt();
            this.f5981H = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(@androidx.annotation.N Context context) {
        this(context, null);
    }

    private boolean E(View view) {
        if (view.getParent() != this && !this.f5954l0.contains(view)) {
            return false;
        }
        return true;
    }

    private int I(View view, int i4, int[] iArr, int i5) {
        g gVar = (g) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i4 + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        int s4 = s(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, s4, max + measuredWidth, view.getMeasuredHeight() + s4);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int J(View view, int i4, int[] iArr, int i5) {
        g gVar = (g) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int s4 = s(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, s4, max, view.getMeasuredHeight() + s4);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int K(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void L(View view, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void M() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f5956n0.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f5957o0 = currentMenuItems2;
    }

    private void N() {
        removeCallbacks(this.f5923A0);
        post(this.f5923A0);
    }

    private boolean W() {
        if (!this.f5965w0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (X(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean X(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void c(List<View> list, int i4) {
        boolean z3;
        if (C0823k0.Z(this) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int childCount = getChildCount();
        int d4 = androidx.core.view.C.d(i4, C0823k0.Z(this));
        list.clear();
        if (z3) {
            for (int i5 = childCount - 1; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f5979b == 0 && X(childAt) && r(gVar.f4816a) == d4) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f5979b == 0 && X(childAt2) && r(gVar2.f4816a) == d4) {
                list.add(childAt2);
            }
        }
    }

    private void d(View view, boolean z3) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f5979b = 1;
        if (z3 && this.f5932M != null) {
            view.setLayoutParams(gVar);
            this.f5954l0.add(view);
        } else {
            addView(view, gVar);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void j() {
        if (this.f5943a0 == null) {
            this.f5943a0 = new X();
        }
    }

    private void k() {
        if (this.f5928I == null) {
            this.f5928I = new AppCompatImageView(getContext());
        }
    }

    private void l() {
        m();
        if (this.f5924E.R() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f5924E.getMenu();
            if (this.f5962t0 == null) {
                this.f5962t0 = new f();
            }
            this.f5924E.setExpandedActionViewsExclusive(true);
            gVar.c(this.f5962t0, this.f5933N);
            Z();
        }
    }

    private void m() {
        if (this.f5924E == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f5924E = actionMenuView;
            actionMenuView.setPopupTheme(this.f5934O);
            this.f5924E.setOnMenuItemClickListener(this.f5959q0);
            this.f5924E.S(this.f5963u0, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f4816a = (this.f5937R & 112) | androidx.core.view.C.f13102c;
            this.f5924E.setLayoutParams(generateDefaultLayoutParams);
            d(this.f5924E, false);
        }
    }

    private void n() {
        if (this.f5927H == null) {
            this.f5927H = new AppCompatImageButton(getContext(), null, C2042a.b.T3);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f4816a = (this.f5937R & 112) | androidx.core.view.C.f13101b;
            this.f5927H.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int r(int i4) {
        int Z3 = C0823k0.Z(this);
        int d4 = androidx.core.view.C.d(i4, Z3) & 7;
        if (d4 != 1 && d4 != 3 && d4 != 5) {
            if (Z3 != 1) {
                return 3;
            }
            return 5;
        }
        return d4;
    }

    private int s(View view, int i4) {
        int i5;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i4 > 0) {
            i5 = (measuredHeight - i4) / 2;
        } else {
            i5 = 0;
        }
        int t3 = t(gVar.f4816a);
        if (t3 != 48) {
            if (t3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i7 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i6 < i7) {
                    i6 = i7;
                } else {
                    int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
                    int i9 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i8 < i9) {
                        i6 = Math.max(0, i6 - (i9 - i8));
                    }
                }
                return paddingTop + i6;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i5;
        }
        return getPaddingTop() - i5;
    }

    private int t(int i4) {
        int i5 = i4 & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            return this.f5946d0 & 112;
        }
        return i5;
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.H.c(marginLayoutParams) + androidx.core.view.H.b(marginLayoutParams);
    }

    private int v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int w(List<View> list, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            View view = list.get(i6);
            g gVar = (g) view.getLayoutParams();
            int i8 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i4;
            int i9 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i5;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, i9);
            int max3 = Math.max(0, -i8);
            int max4 = Math.max(0, -i9);
            i7 += max + view.getMeasuredWidth() + max2;
            i6++;
            i5 = max4;
            i4 = max3;
        }
        return i7;
    }

    @Override // androidx.core.view.J
    @androidx.annotation.K
    public void A() {
        Iterator<MenuItem> it = this.f5957o0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        M();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null && actionMenuView.L()) {
            return true;
        }
        return false;
    }

    public void C(@androidx.annotation.L int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public boolean D() {
        return this.f5968z0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean F() {
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null && actionMenuView.M()) {
            return true;
        }
        return false;
    }

    public boolean G() {
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null && actionMenuView.N()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean H() {
        Layout layout;
        TextView textView = this.f5925F;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i4 = 0; i4 < lineCount; i4++) {
            if (layout.getEllipsisCount(i4) > 0) {
                return true;
            }
        }
        return false;
    }

    void O() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f5979b != 2 && childAt != this.f5924E) {
                removeViewAt(childCount);
                this.f5954l0.add(childAt);
            }
        }
    }

    public void P(int i4, int i5) {
        j();
        this.f5943a0.e(i4, i5);
    }

    public void Q(int i4, int i5) {
        j();
        this.f5943a0.g(i4, i5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void R(androidx.appcompat.view.menu.g gVar, C0590c c0590c) {
        if (gVar == null && this.f5924E == null) {
            return;
        }
        m();
        androidx.appcompat.view.menu.g R3 = this.f5924E.R();
        if (R3 == gVar) {
            return;
        }
        if (R3 != null) {
            R3.S(this.f5961s0);
            R3.S(this.f5962t0);
        }
        if (this.f5962t0 == null) {
            this.f5962t0 = new f();
        }
        c0590c.K(true);
        if (gVar != null) {
            gVar.c(c0590c, this.f5933N);
            gVar.c(this.f5962t0, this.f5933N);
        } else {
            c0590c.i(this.f5933N, null);
            this.f5962t0.i(this.f5933N, null);
            c0590c.d(true);
            this.f5962t0.d(true);
        }
        this.f5924E.setPopupTheme(this.f5934O);
        this.f5924E.setPresenter(c0590c);
        this.f5961s0 = c0590c;
        Z();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void S(n.a aVar, g.a aVar2) {
        this.f5963u0 = aVar;
        this.f5964v0 = aVar2;
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null) {
            actionMenuView.S(aVar, aVar2);
        }
    }

    public void T(Context context, @androidx.annotation.d0 int i4) {
        this.f5936Q = i4;
        TextView textView = this.f5926G;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void U(int i4, int i5, int i6, int i7) {
        this.f5939T = i4;
        this.f5941V = i5;
        this.f5940U = i6;
        this.f5942W = i7;
        requestLayout();
    }

    public void V(Context context, @androidx.annotation.d0 int i4) {
        this.f5935P = i4;
        TextView textView = this.f5925F;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public boolean Y() {
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null && actionMenuView.T()) {
            return true;
        }
        return false;
    }

    void Z() {
        boolean z3;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a4 = e.a(this);
            if (z() && a4 != null && C0823k0.O0(this) && this.f5968z0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.f5967y0 == null) {
                if (this.f5966x0 == null) {
                    this.f5966x0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.g();
                        }
                    });
                }
                e.c(a4, this.f5966x0);
                this.f5967y0 = a4;
                return;
            }
            if (!z3 && (onBackInvokedDispatcher = this.f5967y0) != null) {
                e.d(onBackInvokedDispatcher, this.f5966x0);
                this.f5967y0 = null;
            }
        }
    }

    void a() {
        for (int size = this.f5954l0.size() - 1; size >= 0; size--) {
            addView(this.f5954l0.get(size));
        }
        this.f5954l0.clear();
    }

    @Override // androidx.core.view.J
    @androidx.annotation.K
    public void b(@androidx.annotation.N androidx.core.view.P p4, @androidx.annotation.N androidx.lifecycle.E e4) {
        this.f5956n0.d(p4, e4);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.J
    @androidx.annotation.K
    public void e(@androidx.annotation.N androidx.core.view.P p4) {
        this.f5956n0.l(p4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean f() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.f5924E) != null && actionMenuView.O()) {
            return true;
        }
        return false;
    }

    public void g() {
        androidx.appcompat.view.menu.j jVar;
        f fVar = this.f5962t0;
        if (fVar == null) {
            jVar = null;
        } else {
            jVar = fVar.f5974F;
        }
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    @androidx.annotation.P
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f5931L;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.P
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f5931L;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        X x3 = this.f5943a0;
        if (x3 != null) {
            return x3.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f5945c0;
        if (i4 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i4;
    }

    public int getContentInsetLeft() {
        X x3 = this.f5943a0;
        if (x3 != null) {
            return x3.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        X x3 = this.f5943a0;
        if (x3 != null) {
            return x3.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        X x3 = this.f5943a0;
        if (x3 != null) {
            return x3.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f5944b0;
        if (i4 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i4;
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g R3;
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null && (R3 = actionMenuView.R()) != null && R3.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f5945c0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C0823k0.Z(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0823k0.Z(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f5944b0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f5928I;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f5928I;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        l();
        return this.f5924E.getMenu();
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.TESTS})
    View getNavButtonView() {
        return this.f5927H;
    }

    @androidx.annotation.P
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f5927H;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.P
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f5927H;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0590c getOuterActionMenuPresenter() {
        return this.f5961s0;
    }

    @androidx.annotation.P
    public Drawable getOverflowIcon() {
        l();
        return this.f5924E.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f5933N;
    }

    @androidx.annotation.d0
    public int getPopupTheme() {
        return this.f5934O;
    }

    public CharSequence getSubtitle() {
        return this.f5948f0;
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.TESTS})
    final TextView getSubtitleTextView() {
        return this.f5926G;
    }

    public CharSequence getTitle() {
        return this.f5947e0;
    }

    public int getTitleMarginBottom() {
        return this.f5942W;
    }

    public int getTitleMarginEnd() {
        return this.f5940U;
    }

    public int getTitleMarginStart() {
        return this.f5939T;
    }

    public int getTitleMarginTop() {
        return this.f5941V;
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.TESTS})
    final TextView getTitleTextView() {
        return this.f5925F;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public G getWrapper() {
        if (this.f5960r0 == null) {
            this.f5960r0 = new j0(this, true);
        }
        return this.f5960r0;
    }

    public void h() {
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null) {
            actionMenuView.F();
        }
    }

    void i() {
        if (this.f5931L == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C2042a.b.T3);
            this.f5931L = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f5929J);
            this.f5931L.setContentDescription(this.f5930K);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f4816a = (this.f5937R & 112) | androidx.core.view.C.f13101b;
            generateDefaultLayoutParams.f5979b = 2;
            this.f5931L.setLayoutParams(generateDefaultLayoutParams);
            this.f5931L.setOnClickListener(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5923A0);
        Z();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5952j0 = false;
        }
        if (!this.f5952j0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f5952j0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5952j0 = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a1 A[LOOP:0: B:41:0x029f->B:42:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3 A[LOOP:1: B:45:0x02c1->B:46:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[LOOP:2: B:54:0x02fa->B:55:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f5955m0;
        boolean b4 = q0.b(this);
        int i13 = 0;
        int i14 = !b4 ? 1 : 0;
        if (X(this.f5927H)) {
            L(this.f5927H, i4, 0, i5, 0, this.f5938S);
            i6 = this.f5927H.getMeasuredWidth() + u(this.f5927H);
            i7 = Math.max(0, this.f5927H.getMeasuredHeight() + v(this.f5927H));
            i8 = View.combineMeasuredStates(0, this.f5927H.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (X(this.f5931L)) {
            L(this.f5931L, i4, 0, i5, 0, this.f5938S);
            i6 = this.f5931L.getMeasuredWidth() + u(this.f5931L);
            i7 = Math.max(i7, this.f5931L.getMeasuredHeight() + v(this.f5931L));
            i8 = View.combineMeasuredStates(i8, this.f5931L.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        iArr[b4 ? 1 : 0] = Math.max(0, currentContentInsetStart - i6);
        if (X(this.f5924E)) {
            L(this.f5924E, i4, max, i5, 0, this.f5938S);
            i9 = this.f5924E.getMeasuredWidth() + u(this.f5924E);
            i7 = Math.max(i7, this.f5924E.getMeasuredHeight() + v(this.f5924E));
            i8 = View.combineMeasuredStates(i8, this.f5924E.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i9);
        iArr[i14] = Math.max(0, currentContentInsetEnd - i9);
        if (X(this.f5932M)) {
            max2 += K(this.f5932M, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f5932M.getMeasuredHeight() + v(this.f5932M));
            i8 = View.combineMeasuredStates(i8, this.f5932M.getMeasuredState());
        }
        if (X(this.f5928I)) {
            max2 += K(this.f5928I, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f5928I.getMeasuredHeight() + v(this.f5928I));
            i8 = View.combineMeasuredStates(i8, this.f5928I.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((g) childAt.getLayoutParams()).f5979b == 0 && X(childAt)) {
                max2 += K(childAt, i4, max2, i5, 0, iArr);
                i7 = Math.max(i7, childAt.getMeasuredHeight() + v(childAt));
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
        }
        int i16 = this.f5941V + this.f5942W;
        int i17 = this.f5939T + this.f5940U;
        if (X(this.f5925F)) {
            K(this.f5925F, i4, max2 + i17, i5, i16, iArr);
            int measuredWidth = this.f5925F.getMeasuredWidth() + u(this.f5925F);
            i10 = this.f5925F.getMeasuredHeight() + v(this.f5925F);
            i11 = View.combineMeasuredStates(i8, this.f5925F.getMeasuredState());
            i12 = measuredWidth;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (X(this.f5926G)) {
            i12 = Math.max(i12, K(this.f5926G, i4, max2 + i17, i5, i10 + i16, iArr));
            i10 += this.f5926G.getMeasuredHeight() + v(this.f5926G);
            i11 = View.combineMeasuredStates(i11, this.f5926G.getMeasuredState());
        }
        int max3 = Math.max(i7, i10);
        int paddingLeft = max2 + i12 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4, (-16777216) & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, i11 << 16);
        if (!W()) {
            i13 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.g gVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f5924E;
        if (actionMenuView != null) {
            gVar = actionMenuView.R();
        } else {
            gVar = null;
        }
        int i4 = iVar.f5980G;
        if (i4 != 0 && this.f5962t0 != null && gVar != null && (findItem = gVar.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f5981H) {
            N();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        j();
        X x3 = this.f5943a0;
        boolean z3 = true;
        if (i4 != 1) {
            z3 = false;
        }
        x3.f(z3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f5962t0;
        if (fVar != null && (jVar = fVar.f5974F) != null) {
            iVar.f5980G = jVar.getItemId();
        }
        iVar.f5981H = G();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5951i0 = false;
        }
        if (!this.f5951i0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f5951i0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5951i0 = false;
        }
        return true;
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
        if (layoutParams instanceof AbstractC0583a.b) {
            return new g((AbstractC0583a.b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f5968z0 != z3) {
            this.f5968z0 = z3;
            Z();
        }
    }

    public void setCollapseContentDescription(@androidx.annotation.c0 int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(@InterfaceC0578v int i4) {
        setCollapseIcon(C2046a.b(getContext(), i4));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z3) {
        this.f5965w0 = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f5945c0) {
            this.f5945c0 = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f5944b0) {
            this.f5944b0 = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@InterfaceC0578v int i4) {
        setLogo(C2046a.b(getContext(), i4));
    }

    public void setLogoDescription(@androidx.annotation.c0 int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(@androidx.annotation.c0 int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(@InterfaceC0578v int i4) {
        setNavigationIcon(C2046a.b(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        n();
        this.f5927H.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f5958p0 = hVar;
    }

    public void setOverflowIcon(@androidx.annotation.P Drawable drawable) {
        l();
        this.f5924E.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@androidx.annotation.d0 int i4) {
        if (this.f5934O != i4) {
            this.f5934O = i4;
            if (i4 == 0) {
                this.f5933N = getContext();
            } else {
                this.f5933N = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(@androidx.annotation.c0 int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(@InterfaceC0569l int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(@androidx.annotation.c0 int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f5942W = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f5940U = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f5939T = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f5941V = i4;
        requestLayout();
    }

    public void setTitleTextColor(@InterfaceC0569l int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    @Override // androidx.core.view.J
    @SuppressLint({"LambdaLast"})
    @androidx.annotation.K
    public void x(@androidx.annotation.N androidx.core.view.P p4, @androidx.annotation.N androidx.lifecycle.E e4, @androidx.annotation.N Lifecycle.State state) {
        this.f5956n0.e(p4, e4, state);
    }

    @Override // androidx.core.view.J
    @androidx.annotation.K
    public void y(@androidx.annotation.N androidx.core.view.P p4) {
        this.f5956n0.c(p4);
    }

    public boolean z() {
        f fVar = this.f5962t0;
        if (fVar != null && fVar.f5974F != null) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class g extends AbstractC0583a.b {

        /* renamed from: c, reason: collision with root package name */
        static final int f5976c = 0;

        /* renamed from: d, reason: collision with root package name */
        static final int f5977d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f5978e = 2;

        /* renamed from: b, reason: collision with root package name */
        int f5979b;

        public g(@androidx.annotation.N Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5979b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i4, int i5) {
            super(i4, i5);
            this.f5979b = 0;
            this.f4816a = 8388627;
        }

        public g(int i4, int i5, int i6) {
            super(i4, i5);
            this.f5979b = 0;
            this.f4816a = i6;
        }

        public g(int i4) {
            this(-2, -1, i4);
        }

        public g(g gVar) {
            super((AbstractC0583a.b) gVar);
            this.f5979b = 0;
            this.f5979b = gVar.f5979b;
        }

        public g(AbstractC0583a.b bVar) {
            super(bVar);
            this.f5979b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5979b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5979b = 0;
        }
    }

    public Toolbar(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.U3);
    }

    public void setCollapseContentDescription(@androidx.annotation.P CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageButton imageButton = this.f5931L;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@androidx.annotation.P Drawable drawable) {
        if (drawable != null) {
            i();
            this.f5931L.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f5931L;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f5929J);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            k();
            if (!E(this.f5928I)) {
                d(this.f5928I, true);
            }
        } else {
            ImageView imageView = this.f5928I;
            if (imageView != null && E(imageView)) {
                removeView(this.f5928I);
                this.f5954l0.remove(this.f5928I);
            }
        }
        ImageView imageView2 = this.f5928I;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            k();
        }
        ImageView imageView = this.f5928I;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@androidx.annotation.P CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            n();
        }
        ImageButton imageButton = this.f5927H;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            k0.a(this.f5927H, charSequence);
        }
    }

    public void setNavigationIcon(@androidx.annotation.P Drawable drawable) {
        if (drawable != null) {
            n();
            if (!E(this.f5927H)) {
                d(this.f5927H, true);
            }
        } else {
            ImageButton imageButton = this.f5927H;
            if (imageButton != null && E(imageButton)) {
                removeView(this.f5927H);
                this.f5954l0.remove(this.f5927H);
            }
        }
        ImageButton imageButton2 = this.f5927H;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f5926G == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f5926G = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f5926G.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f5936Q;
                if (i4 != 0) {
                    this.f5926G.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f5950h0;
                if (colorStateList != null) {
                    this.f5926G.setTextColor(colorStateList);
                }
            }
            if (!E(this.f5926G)) {
                d(this.f5926G, true);
            }
        } else {
            TextView textView = this.f5926G;
            if (textView != null && E(textView)) {
                removeView(this.f5926G);
                this.f5954l0.remove(this.f5926G);
            }
        }
        TextView textView2 = this.f5926G;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f5948f0 = charSequence;
    }

    public void setSubtitleTextColor(@androidx.annotation.N ColorStateList colorStateList) {
        this.f5950h0 = colorStateList;
        TextView textView = this.f5926G;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f5925F == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f5925F = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f5925F.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f5935P;
                if (i4 != 0) {
                    this.f5925F.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f5949g0;
                if (colorStateList != null) {
                    this.f5925F.setTextColor(colorStateList);
                }
            }
            if (!E(this.f5925F)) {
                d(this.f5925F, true);
            }
        } else {
            TextView textView = this.f5925F;
            if (textView != null && E(textView)) {
                removeView(this.f5925F);
                this.f5954l0.remove(this.f5925F);
            }
        }
        TextView textView2 = this.f5925F;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f5947e0 = charSequence;
    }

    public void setTitleTextColor(@androidx.annotation.N ColorStateList colorStateList) {
        this.f5949g0 = colorStateList;
        TextView textView = this.f5925F;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5946d0 = 8388627;
        this.f5953k0 = new ArrayList<>();
        this.f5954l0 = new ArrayList<>();
        this.f5955m0 = new int[2];
        this.f5956n0 = new androidx.core.view.M(new Runnable() { // from class: androidx.appcompat.widget.i0
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.A();
            }
        });
        this.f5957o0 = new ArrayList<>();
        this.f5959q0 = new a();
        this.f5923A0 = new b();
        g0 G3 = g0.G(getContext(), attributeSet, C2042a.m.f6, i4, 0);
        C0823k0.z1(this, context, C2042a.m.f6, attributeSet, G3.B(), i4, 0);
        this.f5935P = G3.u(C2042a.m.I6, 0);
        this.f5936Q = G3.u(C2042a.m.z6, 0);
        this.f5946d0 = G3.p(C2042a.m.g6, this.f5946d0);
        this.f5937R = G3.p(C2042a.m.i6, 48);
        int f4 = G3.f(C2042a.m.C6, 0);
        f4 = G3.C(C2042a.m.H6) ? G3.f(C2042a.m.H6, f4) : f4;
        this.f5942W = f4;
        this.f5941V = f4;
        this.f5940U = f4;
        this.f5939T = f4;
        int f5 = G3.f(C2042a.m.F6, -1);
        if (f5 >= 0) {
            this.f5939T = f5;
        }
        int f6 = G3.f(C2042a.m.E6, -1);
        if (f6 >= 0) {
            this.f5940U = f6;
        }
        int f7 = G3.f(C2042a.m.G6, -1);
        if (f7 >= 0) {
            this.f5941V = f7;
        }
        int f8 = G3.f(C2042a.m.D6, -1);
        if (f8 >= 0) {
            this.f5942W = f8;
        }
        this.f5938S = G3.g(C2042a.m.t6, -1);
        int f9 = G3.f(C2042a.m.p6, Integer.MIN_VALUE);
        int f10 = G3.f(C2042a.m.l6, Integer.MIN_VALUE);
        int g4 = G3.g(C2042a.m.n6, 0);
        int g5 = G3.g(C2042a.m.o6, 0);
        j();
        this.f5943a0.e(g4, g5);
        if (f9 != Integer.MIN_VALUE || f10 != Integer.MIN_VALUE) {
            this.f5943a0.g(f9, f10);
        }
        this.f5944b0 = G3.f(C2042a.m.q6, Integer.MIN_VALUE);
        this.f5945c0 = G3.f(C2042a.m.m6, Integer.MIN_VALUE);
        this.f5929J = G3.h(C2042a.m.k6);
        this.f5930K = G3.x(C2042a.m.j6);
        CharSequence x3 = G3.x(C2042a.m.B6);
        if (!TextUtils.isEmpty(x3)) {
            setTitle(x3);
        }
        CharSequence x4 = G3.x(C2042a.m.y6);
        if (!TextUtils.isEmpty(x4)) {
            setSubtitle(x4);
        }
        this.f5933N = getContext();
        setPopupTheme(G3.u(C2042a.m.x6, 0));
        Drawable h4 = G3.h(C2042a.m.w6);
        if (h4 != null) {
            setNavigationIcon(h4);
        }
        CharSequence x5 = G3.x(C2042a.m.v6);
        if (!TextUtils.isEmpty(x5)) {
            setNavigationContentDescription(x5);
        }
        Drawable h5 = G3.h(C2042a.m.r6);
        if (h5 != null) {
            setLogo(h5);
        }
        CharSequence x6 = G3.x(C2042a.m.s6);
        if (!TextUtils.isEmpty(x6)) {
            setLogoDescription(x6);
        }
        if (G3.C(C2042a.m.J6)) {
            setTitleTextColor(G3.d(C2042a.m.J6));
        }
        if (G3.C(C2042a.m.A6)) {
            setSubtitleTextColor(G3.d(C2042a.m.A6));
        }
        if (G3.C(C2042a.m.u6)) {
            C(G3.u(C2042a.m.u6, 0));
        }
        G3.I();
    }
}
