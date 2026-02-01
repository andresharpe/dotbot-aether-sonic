package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.widget.h;
import androidx.core.view.C0823k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.InterfaceMenuC2377a;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: g0, reason: collision with root package name */
    public static final String f9434g0 = "ConstraintLayout-2.2.0-alpha03";

    /* renamed from: h0, reason: collision with root package name */
    private static final String f9435h0 = "ConstraintLayout";

    /* renamed from: i0, reason: collision with root package name */
    private static final boolean f9436i0 = true;

    /* renamed from: j0, reason: collision with root package name */
    private static final boolean f9437j0 = false;

    /* renamed from: k0, reason: collision with root package name */
    private static final boolean f9438k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    private static final boolean f9439l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    private static final boolean f9440m0 = false;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f9441n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    private static j f9442o0;

    /* renamed from: E, reason: collision with root package name */
    SparseArray<View> f9443E;

    /* renamed from: F, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.a> f9444F;

    /* renamed from: G, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.d f9445G;

    /* renamed from: H, reason: collision with root package name */
    private int f9446H;

    /* renamed from: I, reason: collision with root package name */
    private int f9447I;

    /* renamed from: J, reason: collision with root package name */
    private int f9448J;

    /* renamed from: K, reason: collision with root package name */
    private int f9449K;

    /* renamed from: L, reason: collision with root package name */
    protected boolean f9450L;

    /* renamed from: M, reason: collision with root package name */
    private int f9451M;

    /* renamed from: N, reason: collision with root package name */
    private androidx.constraintlayout.widget.d f9452N;

    /* renamed from: O, reason: collision with root package name */
    protected androidx.constraintlayout.widget.b f9453O;

    /* renamed from: P, reason: collision with root package name */
    private int f9454P;

    /* renamed from: Q, reason: collision with root package name */
    private HashMap<String, Integer> f9455Q;

    /* renamed from: R, reason: collision with root package name */
    private int f9456R;

    /* renamed from: S, reason: collision with root package name */
    private int f9457S;

    /* renamed from: T, reason: collision with root package name */
    int f9458T;

    /* renamed from: U, reason: collision with root package name */
    int f9459U;

    /* renamed from: V, reason: collision with root package name */
    int f9460V;

    /* renamed from: W, reason: collision with root package name */
    int f9461W;

    /* renamed from: a0, reason: collision with root package name */
    private SparseArray<ConstraintWidget> f9462a0;

    /* renamed from: b0, reason: collision with root package name */
    private androidx.constraintlayout.core.f f9463b0;

    /* renamed from: c0, reason: collision with root package name */
    c f9464c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f9465d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f9466e0;

    /* renamed from: f0, reason: collision with root package name */
    private ArrayList<d> f9467f0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9468a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f9468a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9468a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9468a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9468a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0060b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f9629a;

        /* renamed from: b, reason: collision with root package name */
        int f9630b;

        /* renamed from: c, reason: collision with root package name */
        int f9631c;

        /* renamed from: d, reason: collision with root package name */
        int f9632d;

        /* renamed from: e, reason: collision with root package name */
        int f9633e;

        /* renamed from: f, reason: collision with root package name */
        int f9634f;

        /* renamed from: g, reason: collision with root package name */
        int f9635g;

        c(ConstraintLayout constraintLayout) {
            this.f9629a = constraintLayout;
        }

        private boolean d(int i4, int i5, int i6) {
            if (i4 == i5) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i4);
            View.MeasureSpec.getSize(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i6 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0060b
        public final void a() {
            int childCount = this.f9629a.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.f9629a.getChildAt(i4);
                if (childAt instanceof g) {
                    ((g) childAt).b(this.f9629a);
                }
            }
            int size = this.f9629a.f9444F.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    ((androidx.constraintlayout.widget.a) this.f9629a.f9444F.get(i5)).G(this.f9629a);
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0060b
        @SuppressLint({"WrongCall"})
        public final void b(ConstraintWidget constraintWidget, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            int baseline;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.l0() == 8 && !constraintWidget.C0()) {
                aVar.f8052e = 0;
                aVar.f8053f = 0;
                aVar.f8054g = 0;
                return;
            }
            if (constraintWidget.U() == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f8048a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f8049b;
            int i9 = aVar.f8050c;
            int i10 = aVar.f8051d;
            int i11 = this.f9630b + this.f9631c;
            int i12 = this.f9632d;
            View view = (View) constraintWidget.w();
            int[] iArr = a.f9468a;
            int i13 = iArr[dimensionBehaviour.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            makeMeasureSpec = 0;
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9634f, i12, -2);
                            if (constraintWidget.f8013w == 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            int i14 = aVar.f8057j;
                            if (i14 == b.a.f8046l || i14 == b.a.f8047m) {
                                if (view.getMeasuredHeight() == constraintWidget.D()) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (aVar.f8057j == b.a.f8047m || !z13 || ((z13 && z14) || (view instanceof g) || constraintWidget.G0())) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.m0(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9634f, i12 + constraintWidget.I(), -1);
                    }
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9634f, i12, -2);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            }
            int i15 = iArr[dimensionBehaviour2.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 4) {
                            makeMeasureSpec2 = 0;
                        } else {
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9635g, i11, -2);
                            if (constraintWidget.f8015x == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int i16 = aVar.f8057j;
                            if (i16 == b.a.f8046l || i16 == b.a.f8047m) {
                                if (view.getMeasuredWidth() == constraintWidget.m0()) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (aVar.f8057j == b.a.f8047m || !z11 || ((z11 && z12) || (view instanceof g) || constraintWidget.H0())) {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.D(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9635g, i11 + constraintWidget.k0(), -1);
                    }
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9635g, i11, -2);
                }
            } else {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            }
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.U();
            if (dVar != null && androidx.constraintlayout.core.widgets.i.b(ConstraintLayout.this.f9451M, 256) && view.getMeasuredWidth() == constraintWidget.m0() && view.getMeasuredWidth() < dVar.m0() && view.getMeasuredHeight() == constraintWidget.D() && view.getMeasuredHeight() < dVar.D() && view.getBaseline() == constraintWidget.t() && !constraintWidget.F0() && d(constraintWidget.J(), makeMeasureSpec, constraintWidget.m0()) && d(constraintWidget.K(), makeMeasureSpec2, constraintWidget.D())) {
                aVar.f8052e = constraintWidget.m0();
                aVar.f8053f = constraintWidget.D();
                aVar.f8054g = constraintWidget.t();
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dimensionBehaviour2 == dimensionBehaviour3) {
                z4 = true;
            } else {
                z4 = false;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 != dimensionBehaviour4 && dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.FIXED) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (dimensionBehaviour != dimensionBehaviour4 && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.FIXED) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z3 && constraintWidget.f7980f0 > 0.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z4 && constraintWidget.f7980f0 > 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (view == null) {
                return;
            }
            b bVar = (b) view.getLayoutParams();
            int i17 = aVar.f8057j;
            if (i17 != b.a.f8046l && i17 != b.a.f8047m && z3 && constraintWidget.f8013w == 0 && z4 && constraintWidget.f8015x == 0) {
                i8 = -1;
                i6 = 0;
                baseline = 0;
                i4 = 0;
            } else {
                if ((view instanceof l) && (constraintWidget instanceof androidx.constraintlayout.core.widgets.l)) {
                    ((l) view).L((androidx.constraintlayout.core.widgets.l) constraintWidget, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                constraintWidget.J1(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i18 = constraintWidget.f8019z;
                if (i18 > 0) {
                    i4 = Math.max(i18, measuredWidth);
                } else {
                    i4 = measuredWidth;
                }
                int i19 = constraintWidget.f7923A;
                if (i19 > 0) {
                    i4 = Math.min(i19, i4);
                }
                int i20 = constraintWidget.f7927C;
                if (i20 > 0) {
                    i6 = Math.max(i20, measuredHeight);
                    i5 = makeMeasureSpec;
                } else {
                    i5 = makeMeasureSpec;
                    i6 = measuredHeight;
                }
                int i21 = constraintWidget.f7929D;
                if (i21 > 0) {
                    i6 = Math.min(i21, i6);
                }
                if (!androidx.constraintlayout.core.widgets.i.b(ConstraintLayout.this.f9451M, 1)) {
                    if (z7 && z5) {
                        i4 = (int) ((i6 * constraintWidget.f7980f0) + 0.5f);
                    } else if (z8 && z6) {
                        i6 = (int) ((i4 / constraintWidget.f7980f0) + 0.5f);
                    }
                }
                if (measuredWidth != i4 || measuredHeight != i6) {
                    if (measuredWidth != i4) {
                        i7 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        i7 = i5;
                    }
                    if (measuredHeight != i6) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    }
                    view.measure(i7, makeMeasureSpec2);
                    constraintWidget.J1(i7, makeMeasureSpec2);
                    i4 = view.getMeasuredWidth();
                    i6 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i8 = -1;
            }
            if (baseline != i8) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i4 == aVar.f8050c && i6 == aVar.f8051d) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar.f8056i = z10;
            if (bVar.f9532g0) {
                z9 = true;
            }
            if (z9 && baseline != -1 && constraintWidget.t() != baseline) {
                aVar.f8056i = true;
            }
            aVar.f8052e = i4;
            aVar.f8053f = i6;
            aVar.f8055h = z9;
            aVar.f8054g = baseline;
        }

        public void c(int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f9630b = i6;
            this.f9631c = i7;
            this.f9632d = i8;
            this.f9633e = i9;
            this.f9634f = i4;
            this.f9635g = i5;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(int i4, int i5, int i6, View view, b bVar);
    }

    public ConstraintLayout(@N Context context) {
        super(context);
        this.f9443E = new SparseArray<>();
        this.f9444F = new ArrayList<>(4);
        this.f9445G = new androidx.constraintlayout.core.widgets.d();
        this.f9446H = 0;
        this.f9447I = 0;
        this.f9448J = Integer.MAX_VALUE;
        this.f9449K = Integer.MAX_VALUE;
        this.f9450L = true;
        this.f9451M = 257;
        this.f9452N = null;
        this.f9453O = null;
        this.f9454P = -1;
        this.f9455Q = new HashMap<>();
        this.f9456R = -1;
        this.f9457S = -1;
        this.f9458T = -1;
        this.f9459U = -1;
        this.f9460V = 0;
        this.f9461W = 0;
        this.f9462a0 = new SparseArray<>();
        this.f9464c0 = new c(this);
        this.f9465d0 = 0;
        this.f9466e0 = 0;
        x(null, 0, 0);
    }

    private void A() {
        this.f9450L = true;
        this.f9456R = -1;
        this.f9457S = -1;
        this.f9458T = -1;
        this.f9459U = -1;
        this.f9460V = 0;
        this.f9461W = 0;
    }

    private void F() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ConstraintWidget w3 = w(getChildAt(i4));
            if (w3 != null) {
                w3.R0();
            }
        }
        if (isInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    G(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    p(childAt.getId()).j1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f9454P != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getId() == this.f9454P && (childAt2 instanceof e)) {
                    this.f9452N = ((e) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.d dVar = this.f9452N;
        if (dVar != null) {
            dVar.t(this, true);
        }
        this.f9445G.p2();
        int size = this.f9444F.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f9444F.get(i7).J(this);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt3 = getChildAt(i8);
            if (childAt3 instanceof g) {
                ((g) childAt3).c(this);
            }
        }
        this.f9462a0.clear();
        this.f9462a0.put(0, this.f9445G);
        this.f9462a0.put(getId(), this.f9445G);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt4 = getChildAt(i9);
            this.f9462a0.put(childAt4.getId(), w(childAt4));
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt5 = getChildAt(i10);
            ConstraintWidget w4 = w(childAt5);
            if (w4 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f9445G.b(w4);
                j(isInEditMode, childAt5, w4, bVar, this.f9462a0);
            }
        }
    }

    private void J(ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray, int i4, ConstraintAnchor.Type type) {
        View view = this.f9443E.get(i4);
        ConstraintWidget constraintWidget2 = sparseArray.get(i4);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f9532g0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                b bVar2 = (b) view.getLayoutParams();
                bVar2.f9532g0 = true;
                bVar2.f9562v0.x1(true);
            }
            constraintWidget.r(type2).b(constraintWidget2.r(type), bVar.f9496D, bVar.f9495C, true);
            constraintWidget.x1(true);
            constraintWidget.r(ConstraintAnchor.Type.TOP).x();
            constraintWidget.r(ConstraintAnchor.Type.BOTTOM).x();
        }
    }

    private boolean K() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (getChildAt(i4).isLayoutRequested()) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3) {
            F();
        }
        return z3;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static j getSharedValues() {
        if (f9442o0 == null) {
            f9442o0 = new j();
        }
        return f9442o0;
    }

    private ConstraintWidget p(int i4) {
        if (i4 == 0) {
            return this.f9445G;
        }
        View view = this.f9443E.get(i4);
        if (view == null && (view = findViewById(i4)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f9445G;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f9562v0;
    }

    private void x(AttributeSet attributeSet, int i4, int i5) {
        this.f9445G.h1(this);
        this.f9445G.U2(this.f9464c0);
        this.f9443E.put(getId(), this);
        this.f9452N = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.x6, i4, i5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.m.O6) {
                    this.f9446H = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9446H);
                } else if (index == h.m.P6) {
                    this.f9447I = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9447I);
                } else if (index == h.m.M6) {
                    this.f9448J = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9448J);
                } else if (index == h.m.N6) {
                    this.f9449K = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9449K);
                } else if (index == h.m.H8) {
                    this.f9451M = obtainStyledAttributes.getInt(index, this.f9451M);
                } else if (index == h.m.C7) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            B(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f9453O = null;
                        }
                    }
                } else if (index == h.m.g7) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f9452N = dVar;
                        dVar.y0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f9452N = null;
                    }
                    this.f9454P = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f9445G.V2(this.f9451M);
    }

    protected void B(int i4) {
        this.f9453O = new androidx.constraintlayout.widget.b(getContext(), this, i4);
    }

    void C(d dVar) {
        if (dVar == null) {
            return;
        }
        this.f9467f0.remove(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
        c cVar = this.f9464c0;
        int i8 = cVar.f9633e;
        int resolveSizeAndState = View.resolveSizeAndState(i6 + cVar.f9632d, i4, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i7 + i8, i5, 0);
        int i9 = resolveSizeAndState & C0823k0.f13588s;
        int i10 = resolveSizeAndState2 & C0823k0.f13588s;
        int min = Math.min(this.f9448J, i9);
        int min2 = Math.min(this.f9449K, i10);
        if (z3) {
            min |= 16777216;
        }
        if (z4) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f9456R = min;
        this.f9457S = min2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E(androidx.constraintlayout.core.widgets.d dVar, int i4, int i5, int i6) {
        int i7;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i8 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f9464c0.c(i5, i6, max, max2, paddingWidth, i8);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i7 = Math.max(0, getPaddingLeft());
        } else if (y()) {
            i7 = max4;
        } else {
            i7 = max3;
        }
        int i9 = size - paddingWidth;
        int i10 = size2 - i8;
        H(dVar, mode, i9, mode2, i10);
        dVar.Q2(i4, mode, i9, mode2, i10, this.f9456R, this.f9457S, i7, max);
    }

    public void G(int i4, Object obj, Object obj2) {
        if (i4 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f9455Q == null) {
                this.f9455Q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f9455Q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    protected void H(androidx.constraintlayout.core.widgets.d dVar, int i4, int i5, int i6, int i7) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        c cVar = this.f9464c0;
        int i8 = cVar.f9633e;
        int i9 = cVar.f9632d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i4 != Integer.MIN_VALUE) {
            if (i4 != 0) {
                if (i4 != 1073741824) {
                    dimensionBehaviour = dimensionBehaviour2;
                    i5 = 0;
                } else {
                    i5 = Math.min(this.f9448J - i9, i5);
                    dimensionBehaviour = dimensionBehaviour2;
                }
            } else {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i5 = Math.max(0, this.f9446H);
                }
                i5 = 0;
            }
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.f9446H);
            }
        }
        if (i6 != Integer.MIN_VALUE) {
            if (i6 != 0) {
                if (i6 == 1073741824) {
                    i7 = Math.min(this.f9449K - i8, i7);
                }
                i7 = 0;
            } else {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i7 = Math.max(0, this.f9447I);
                }
                i7 = 0;
            }
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i7 = Math.max(0, this.f9447I);
            }
        }
        if (i5 != dVar.m0() || i7 != dVar.D()) {
            dVar.M2();
        }
        dVar.f2(0);
        dVar.g2(0);
        dVar.M1(this.f9448J - i9);
        dVar.L1(this.f9449K - i8);
        dVar.P1(0);
        dVar.O1(0);
        dVar.D1(dimensionBehaviour);
        dVar.c2(i5);
        dVar.Y1(dimensionBehaviour2);
        dVar.y1(i7);
        dVar.P1(this.f9446H - i9);
        dVar.O1(this.f9447I - i8);
    }

    public void I(int i4, int i5, int i6) {
        androidx.constraintlayout.widget.b bVar = this.f9453O;
        if (bVar != null) {
            bVar.e(i4, i5, i6);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f9444F;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f9444F.get(i4).H(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((parseInt / 1080.0f) * width);
                        int i7 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(InterfaceMenuC2377a.f55290c);
                        float f4 = i6;
                        float f5 = i7;
                        float f6 = i6 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f4, f5, f6, f5, paint);
                        float parseInt4 = i7 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f4, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f4, f5, f6, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f6, f5, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        A();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f9449K;
    }

    public int getMaxWidth() {
        return this.f9448J;
    }

    public int getMinHeight() {
        return this.f9447I;
    }

    public int getMinWidth() {
        return this.f9446H;
    }

    public int getOptimizationLevel() {
        return this.f9445G.H2();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f9445G.f7997o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f9445G.f7997o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f9445G.f7997o = "parent";
            }
        }
        if (this.f9445G.y() == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f9445G;
            dVar.j1(dVar.f7997o);
            Log.v(f9435h0, " setDebugName " + this.f9445G.y());
        }
        Iterator<ConstraintWidget> it = this.f9445G.l2().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.w();
            if (view != null) {
                if (next.f7997o == null && (id = view.getId()) != -1) {
                    next.f7997o = getContext().getResources().getResourceEntryName(id);
                }
                if (next.y() == null) {
                    next.j1(next.f7997o);
                    Log.v(f9435h0, " setDebugName " + next.y());
                }
            }
        }
        this.f9445G.b0(sb);
        return sb.toString();
    }

    public void i(d dVar) {
        if (this.f9467f0 == null) {
            this.f9467f0 = new ArrayList<>();
        }
        this.f9467f0.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(boolean z3, View view, ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i4;
        bVar.e();
        bVar.f9564w0 = false;
        constraintWidget.b2(view.getVisibility());
        if (bVar.f9538j0) {
            constraintWidget.H1(true);
            constraintWidget.b2(8);
        }
        constraintWidget.h1(view);
        if (view instanceof androidx.constraintlayout.widget.a) {
            ((androidx.constraintlayout.widget.a) view).D(constraintWidget, this.f9445G.O2());
        }
        if (bVar.f9534h0) {
            androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
            int i5 = bVar.f9556s0;
            int i6 = bVar.f9558t0;
            float f4 = bVar.f9560u0;
            if (f4 != -1.0f) {
                fVar.z2(f4);
                return;
            } else if (i5 != -1) {
                fVar.x2(i5);
                return;
            } else {
                if (i6 != -1) {
                    fVar.y2(i6);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.f9542l0;
        int i8 = bVar.f9544m0;
        int i9 = bVar.f9546n0;
        int i10 = bVar.f9548o0;
        int i11 = bVar.f9550p0;
        int i12 = bVar.f9552q0;
        float f5 = bVar.f9554r0;
        int i13 = bVar.f9549p;
        if (i13 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i13);
            if (constraintWidget6 != null) {
                constraintWidget.m(constraintWidget6, bVar.f9553r, bVar.f9551q);
            }
        } else {
            if (i7 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i7);
                if (constraintWidget7 != null) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.v0(type, constraintWidget7, type, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i11);
                }
            } else if (i8 != -1 && (constraintWidget2 = sparseArray.get(i8)) != null) {
                constraintWidget.v0(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i11);
            }
            if (i9 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i9);
                if (constraintWidget8 != null) {
                    constraintWidget.v0(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i12);
                }
            } else if (i10 != -1 && (constraintWidget3 = sparseArray.get(i10)) != null) {
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.v0(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i12);
            }
            int i14 = bVar.f9535i;
            if (i14 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i14);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                    constraintWidget.v0(type3, constraintWidget9, type3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f9565x);
                }
            } else {
                int i15 = bVar.f9537j;
                if (i15 != -1 && (constraintWidget4 = sparseArray.get(i15)) != null) {
                    constraintWidget.v0(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f9565x);
                }
            }
            int i16 = bVar.f9539k;
            if (i16 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i16);
                if (constraintWidget10 != null) {
                    constraintWidget.v0(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f9567z);
                }
            } else {
                int i17 = bVar.f9541l;
                if (i17 != -1 && (constraintWidget5 = sparseArray.get(i17)) != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.v0(type4, constraintWidget5, type4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f9567z);
                }
            }
            int i18 = bVar.f9543m;
            if (i18 != -1) {
                J(constraintWidget, bVar, sparseArray, i18, ConstraintAnchor.Type.BASELINE);
            } else {
                int i19 = bVar.f9545n;
                if (i19 != -1) {
                    J(constraintWidget, bVar, sparseArray, i19, ConstraintAnchor.Type.TOP);
                } else {
                    int i20 = bVar.f9547o;
                    if (i20 != -1) {
                        J(constraintWidget, bVar, sparseArray, i20, ConstraintAnchor.Type.BOTTOM);
                    }
                }
            }
            if (f5 >= 0.0f) {
                constraintWidget.A1(f5);
            }
            float f6 = bVar.f9500H;
            if (f6 >= 0.0f) {
                constraintWidget.V1(f6);
            }
        }
        if (z3 && ((i4 = bVar.f9516X) != -1 || bVar.f9517Y != -1)) {
            constraintWidget.R1(i4, bVar.f9517Y);
        }
        if (!bVar.f9528e0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.f9520a0) {
                    constraintWidget.D1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.D1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.r(ConstraintAnchor.Type.LEFT).f7886g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                constraintWidget.r(ConstraintAnchor.Type.RIGHT).f7886g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.c2(0);
            }
        } else {
            constraintWidget.D1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.c2(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        if (!bVar.f9530f0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.f9522b0) {
                    constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.r(ConstraintAnchor.Type.TOP).f7886g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                constraintWidget.r(ConstraintAnchor.Type.BOTTOM).f7886g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.y1(0);
            }
        } else {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.y1(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        constraintWidget.n1(bVar.f9501I);
        constraintWidget.F1(bVar.f9504L);
        constraintWidget.a2(bVar.f9505M);
        constraintWidget.B1(bVar.f9506N);
        constraintWidget.W1(bVar.f9507O);
        constraintWidget.e2(bVar.f9526d0);
        constraintWidget.E1(bVar.f9508P, bVar.f9510R, bVar.f9512T, bVar.f9514V);
        constraintWidget.Z1(bVar.f9509Q, bVar.f9511S, bVar.f9513U, bVar.f9515W);
    }

    protected boolean k(int i4, int i5) {
        boolean z3 = false;
        if (this.f9467f0 == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        Iterator<d> it = this.f9467f0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            Iterator<ConstraintWidget> it2 = this.f9445G.l2().iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next().w();
                z3 |= next.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return z3;
    }

    public void l(androidx.constraintlayout.core.f fVar) {
        this.f9463b0 = fVar;
        this.f9445G.E2(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object o(int i4, Object obj) {
        if (i4 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f9455Q;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f9455Q.get(str);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.f9562v0;
            if ((childAt.getVisibility() != 8 || bVar.f9534h0 || bVar.f9536i0 || bVar.f9540k0 || isInEditMode) && !bVar.f9538j0) {
                int o02 = constraintWidget.o0();
                int p02 = constraintWidget.p0();
                int m02 = constraintWidget.m0() + o02;
                int D3 = constraintWidget.D() + p02;
                childAt.layout(o02, p02, m02, D3);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o02, p02, m02, D3);
                }
            }
        }
        int size = this.f9444F.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                this.f9444F.get(i9).F(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        boolean k4 = this.f9450L | k(i4, i5);
        this.f9450L = k4;
        if (this.f9465d0 == i4) {
            int i6 = this.f9466e0;
        }
        if (!k4) {
            int childCount = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                if (getChildAt(i7).isLayoutRequested()) {
                    this.f9450L = true;
                    break;
                }
                i7++;
            }
        }
        this.f9465d0 = i4;
        this.f9466e0 = i5;
        this.f9445G.Y2(y());
        if (this.f9450L) {
            this.f9450L = false;
            if (K()) {
                this.f9445G.a3();
            }
        }
        E(this.f9445G, this.f9451M, i4, i5);
        D(i4, i5, this.f9445G.m0(), this.f9445G.D(), this.f9445G.P2(), this.f9445G.N2());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget w3 = w(view);
        if ((view instanceof Guideline) && !(w3 instanceof androidx.constraintlayout.core.widgets.f)) {
            b bVar = (b) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.f fVar = new androidx.constraintlayout.core.widgets.f();
            bVar.f9562v0 = fVar;
            bVar.f9534h0 = true;
            fVar.C2(bVar.f9518Z);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) view;
            aVar.K();
            ((b) view.getLayoutParams()).f9536i0 = true;
            if (!this.f9444F.contains(aVar)) {
                this.f9444F.add(aVar);
            }
        }
        this.f9443E.put(view.getId(), view);
        this.f9450L = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f9443E.remove(view.getId());
        this.f9445G.o2(w(view));
        this.f9444F.remove(view);
        this.f9450L = true;
    }

    public View q(int i4) {
        return this.f9443E.get(i4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        A();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.d dVar) {
        this.f9452N = dVar;
    }

    @Override // android.view.View
    public void setId(int i4) {
        this.f9443E.remove(getId());
        super.setId(i4);
        this.f9443E.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.f9449K) {
            return;
        }
        this.f9449K = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f9448J) {
            return;
        }
        this.f9448J = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f9447I) {
            return;
        }
        this.f9447I = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f9446H) {
            return;
        }
        this.f9446H = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.b bVar = this.f9453O;
        if (bVar != null) {
            bVar.d(fVar);
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f9451M = i4;
        this.f9445G.V2(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ConstraintWidget w(View view) {
        if (view == this) {
            return this.f9445G;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f9562v0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f9562v0;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean y() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    public void z(int i4) {
        if (i4 != 0) {
            try {
                this.f9453O = new androidx.constraintlayout.widget.b(getContext(), this, i4);
                return;
            } catch (Resources.NotFoundException unused) {
                this.f9453O = null;
                return;
            }
        }
        this.f9453O = null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9443E = new SparseArray<>();
        this.f9444F = new ArrayList<>(4);
        this.f9445G = new androidx.constraintlayout.core.widgets.d();
        this.f9446H = 0;
        this.f9447I = 0;
        this.f9448J = Integer.MAX_VALUE;
        this.f9449K = Integer.MAX_VALUE;
        this.f9450L = true;
        this.f9451M = 257;
        this.f9452N = null;
        this.f9453O = null;
        this.f9454P = -1;
        this.f9455Q = new HashMap<>();
        this.f9456R = -1;
        this.f9457S = -1;
        this.f9458T = -1;
        this.f9459U = -1;
        this.f9460V = 0;
        this.f9461W = 0;
        this.f9462a0 = new SparseArray<>();
        this.f9464c0 = new c(this);
        this.f9465d0 = 0;
        this.f9466e0 = 0;
        x(attributeSet, 0, 0);
    }

    public ConstraintLayout(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9443E = new SparseArray<>();
        this.f9444F = new ArrayList<>(4);
        this.f9445G = new androidx.constraintlayout.core.widgets.d();
        this.f9446H = 0;
        this.f9447I = 0;
        this.f9448J = Integer.MAX_VALUE;
        this.f9449K = Integer.MAX_VALUE;
        this.f9450L = true;
        this.f9451M = 257;
        this.f9452N = null;
        this.f9453O = null;
        this.f9454P = -1;
        this.f9455Q = new HashMap<>();
        this.f9456R = -1;
        this.f9457S = -1;
        this.f9458T = -1;
        this.f9459U = -1;
        this.f9460V = 0;
        this.f9461W = 0;
        this.f9462a0 = new SparseArray<>();
        this.f9464c0 = new c(this);
        this.f9465d0 = 0;
        this.f9466e0 = 0;
        x(attributeSet, i4, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f9443E = new SparseArray<>();
        this.f9444F = new ArrayList<>(4);
        this.f9445G = new androidx.constraintlayout.core.widgets.d();
        this.f9446H = 0;
        this.f9447I = 0;
        this.f9448J = Integer.MAX_VALUE;
        this.f9449K = Integer.MAX_VALUE;
        this.f9450L = true;
        this.f9451M = 257;
        this.f9452N = null;
        this.f9453O = null;
        this.f9454P = -1;
        this.f9455Q = new HashMap<>();
        this.f9456R = -1;
        this.f9457S = -1;
        this.f9458T = -1;
        this.f9459U = -1;
        this.f9460V = 0;
        this.f9461W = 0;
        this.f9462a0 = new SparseArray<>();
        this.f9464c0 = new c(this);
        this.f9465d0 = 0;
        this.f9466e0 = 0;
        x(attributeSet, i4, i5);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A0, reason: collision with root package name */
        public static final int f9469A0 = Integer.MIN_VALUE;

        /* renamed from: B0, reason: collision with root package name */
        public static final int f9470B0 = 0;

        /* renamed from: C0, reason: collision with root package name */
        public static final int f9471C0 = 1;

        /* renamed from: D0, reason: collision with root package name */
        public static final int f9472D0 = 1;

        /* renamed from: E0, reason: collision with root package name */
        public static final int f9473E0 = 2;

        /* renamed from: F0, reason: collision with root package name */
        public static final int f9474F0 = 3;

        /* renamed from: G0, reason: collision with root package name */
        public static final int f9475G0 = 4;

        /* renamed from: H0, reason: collision with root package name */
        public static final int f9476H0 = 5;

        /* renamed from: I0, reason: collision with root package name */
        public static final int f9477I0 = 6;

        /* renamed from: J0, reason: collision with root package name */
        public static final int f9478J0 = 7;

        /* renamed from: K0, reason: collision with root package name */
        public static final int f9479K0 = 8;

        /* renamed from: L0, reason: collision with root package name */
        public static final int f9480L0 = 1;

        /* renamed from: M0, reason: collision with root package name */
        public static final int f9481M0 = 0;

        /* renamed from: N0, reason: collision with root package name */
        public static final int f9482N0 = 2;

        /* renamed from: O0, reason: collision with root package name */
        public static final int f9483O0 = 0;

        /* renamed from: P0, reason: collision with root package name */
        public static final int f9484P0 = 1;

        /* renamed from: Q0, reason: collision with root package name */
        public static final int f9485Q0 = 2;

        /* renamed from: R0, reason: collision with root package name */
        public static final int f9486R0 = 0;

        /* renamed from: S0, reason: collision with root package name */
        public static final int f9487S0 = 1;

        /* renamed from: T0, reason: collision with root package name */
        public static final int f9488T0 = 2;

        /* renamed from: U0, reason: collision with root package name */
        public static final int f9489U0 = 3;

        /* renamed from: x0, reason: collision with root package name */
        public static final int f9490x0 = 0;

        /* renamed from: y0, reason: collision with root package name */
        public static final int f9491y0 = 0;

        /* renamed from: z0, reason: collision with root package name */
        public static final int f9492z0 = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f9493A;

        /* renamed from: B, reason: collision with root package name */
        public int f9494B;

        /* renamed from: C, reason: collision with root package name */
        public int f9495C;

        /* renamed from: D, reason: collision with root package name */
        public int f9496D;

        /* renamed from: E, reason: collision with root package name */
        boolean f9497E;

        /* renamed from: F, reason: collision with root package name */
        boolean f9498F;

        /* renamed from: G, reason: collision with root package name */
        public float f9499G;

        /* renamed from: H, reason: collision with root package name */
        public float f9500H;

        /* renamed from: I, reason: collision with root package name */
        public String f9501I;

        /* renamed from: J, reason: collision with root package name */
        float f9502J;

        /* renamed from: K, reason: collision with root package name */
        int f9503K;

        /* renamed from: L, reason: collision with root package name */
        public float f9504L;

        /* renamed from: M, reason: collision with root package name */
        public float f9505M;

        /* renamed from: N, reason: collision with root package name */
        public int f9506N;

        /* renamed from: O, reason: collision with root package name */
        public int f9507O;

        /* renamed from: P, reason: collision with root package name */
        public int f9508P;

        /* renamed from: Q, reason: collision with root package name */
        public int f9509Q;

        /* renamed from: R, reason: collision with root package name */
        public int f9510R;

        /* renamed from: S, reason: collision with root package name */
        public int f9511S;

        /* renamed from: T, reason: collision with root package name */
        public int f9512T;

        /* renamed from: U, reason: collision with root package name */
        public int f9513U;

        /* renamed from: V, reason: collision with root package name */
        public float f9514V;

        /* renamed from: W, reason: collision with root package name */
        public float f9515W;

        /* renamed from: X, reason: collision with root package name */
        public int f9516X;

        /* renamed from: Y, reason: collision with root package name */
        public int f9517Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f9518Z;

        /* renamed from: a, reason: collision with root package name */
        public int f9519a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f9520a0;

        /* renamed from: b, reason: collision with root package name */
        public int f9521b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f9522b0;

        /* renamed from: c, reason: collision with root package name */
        public float f9523c;

        /* renamed from: c0, reason: collision with root package name */
        public String f9524c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9525d;

        /* renamed from: d0, reason: collision with root package name */
        public int f9526d0;

        /* renamed from: e, reason: collision with root package name */
        public int f9527e;

        /* renamed from: e0, reason: collision with root package name */
        boolean f9528e0;

        /* renamed from: f, reason: collision with root package name */
        public int f9529f;

        /* renamed from: f0, reason: collision with root package name */
        boolean f9530f0;

        /* renamed from: g, reason: collision with root package name */
        public int f9531g;

        /* renamed from: g0, reason: collision with root package name */
        boolean f9532g0;

        /* renamed from: h, reason: collision with root package name */
        public int f9533h;

        /* renamed from: h0, reason: collision with root package name */
        boolean f9534h0;

        /* renamed from: i, reason: collision with root package name */
        public int f9535i;

        /* renamed from: i0, reason: collision with root package name */
        boolean f9536i0;

        /* renamed from: j, reason: collision with root package name */
        public int f9537j;

        /* renamed from: j0, reason: collision with root package name */
        boolean f9538j0;

        /* renamed from: k, reason: collision with root package name */
        public int f9539k;

        /* renamed from: k0, reason: collision with root package name */
        boolean f9540k0;

        /* renamed from: l, reason: collision with root package name */
        public int f9541l;

        /* renamed from: l0, reason: collision with root package name */
        int f9542l0;

        /* renamed from: m, reason: collision with root package name */
        public int f9543m;

        /* renamed from: m0, reason: collision with root package name */
        int f9544m0;

        /* renamed from: n, reason: collision with root package name */
        public int f9545n;

        /* renamed from: n0, reason: collision with root package name */
        int f9546n0;

        /* renamed from: o, reason: collision with root package name */
        public int f9547o;

        /* renamed from: o0, reason: collision with root package name */
        int f9548o0;

        /* renamed from: p, reason: collision with root package name */
        public int f9549p;

        /* renamed from: p0, reason: collision with root package name */
        int f9550p0;

        /* renamed from: q, reason: collision with root package name */
        public int f9551q;

        /* renamed from: q0, reason: collision with root package name */
        int f9552q0;

        /* renamed from: r, reason: collision with root package name */
        public float f9553r;

        /* renamed from: r0, reason: collision with root package name */
        float f9554r0;

        /* renamed from: s, reason: collision with root package name */
        public int f9555s;

        /* renamed from: s0, reason: collision with root package name */
        int f9556s0;

        /* renamed from: t, reason: collision with root package name */
        public int f9557t;

        /* renamed from: t0, reason: collision with root package name */
        int f9558t0;

        /* renamed from: u, reason: collision with root package name */
        public int f9559u;

        /* renamed from: u0, reason: collision with root package name */
        float f9560u0;

        /* renamed from: v, reason: collision with root package name */
        public int f9561v;

        /* renamed from: v0, reason: collision with root package name */
        ConstraintWidget f9562v0;

        /* renamed from: w, reason: collision with root package name */
        public int f9563w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f9564w0;

        /* renamed from: x, reason: collision with root package name */
        public int f9565x;

        /* renamed from: y, reason: collision with root package name */
        public int f9566y;

        /* renamed from: z, reason: collision with root package name */
        public int f9567z;

        /* loaded from: classes.dex */
        private static class a {

            /* renamed from: A, reason: collision with root package name */
            public static final int f9568A = 26;

            /* renamed from: B, reason: collision with root package name */
            public static final int f9569B = 27;

            /* renamed from: C, reason: collision with root package name */
            public static final int f9570C = 28;

            /* renamed from: D, reason: collision with root package name */
            public static final int f9571D = 29;

            /* renamed from: E, reason: collision with root package name */
            public static final int f9572E = 30;

            /* renamed from: F, reason: collision with root package name */
            public static final int f9573F = 31;

            /* renamed from: G, reason: collision with root package name */
            public static final int f9574G = 32;

            /* renamed from: H, reason: collision with root package name */
            public static final int f9575H = 33;

            /* renamed from: I, reason: collision with root package name */
            public static final int f9576I = 34;

            /* renamed from: J, reason: collision with root package name */
            public static final int f9577J = 35;

            /* renamed from: K, reason: collision with root package name */
            public static final int f9578K = 36;

            /* renamed from: L, reason: collision with root package name */
            public static final int f9579L = 37;

            /* renamed from: M, reason: collision with root package name */
            public static final int f9580M = 38;

            /* renamed from: N, reason: collision with root package name */
            public static final int f9581N = 39;

            /* renamed from: O, reason: collision with root package name */
            public static final int f9582O = 40;

            /* renamed from: P, reason: collision with root package name */
            public static final int f9583P = 41;

            /* renamed from: Q, reason: collision with root package name */
            public static final int f9584Q = 42;

            /* renamed from: R, reason: collision with root package name */
            public static final int f9585R = 43;

            /* renamed from: S, reason: collision with root package name */
            public static final int f9586S = 44;

            /* renamed from: T, reason: collision with root package name */
            public static final int f9587T = 45;

            /* renamed from: U, reason: collision with root package name */
            public static final int f9588U = 46;

            /* renamed from: V, reason: collision with root package name */
            public static final int f9589V = 47;

            /* renamed from: W, reason: collision with root package name */
            public static final int f9590W = 48;

            /* renamed from: X, reason: collision with root package name */
            public static final int f9591X = 49;

            /* renamed from: Y, reason: collision with root package name */
            public static final int f9592Y = 50;

            /* renamed from: Z, reason: collision with root package name */
            public static final int f9593Z = 51;

            /* renamed from: a, reason: collision with root package name */
            public static final int f9594a = 0;

            /* renamed from: a0, reason: collision with root package name */
            public static final int f9595a0 = 52;

            /* renamed from: b, reason: collision with root package name */
            public static final int f9596b = 1;

            /* renamed from: b0, reason: collision with root package name */
            public static final int f9597b0 = 53;

            /* renamed from: c, reason: collision with root package name */
            public static final int f9598c = 2;

            /* renamed from: c0, reason: collision with root package name */
            public static final int f9599c0 = 54;

            /* renamed from: d, reason: collision with root package name */
            public static final int f9600d = 3;

            /* renamed from: d0, reason: collision with root package name */
            public static final int f9601d0 = 55;

            /* renamed from: e, reason: collision with root package name */
            public static final int f9602e = 4;

            /* renamed from: e0, reason: collision with root package name */
            public static final int f9603e0 = 64;

            /* renamed from: f, reason: collision with root package name */
            public static final int f9604f = 5;

            /* renamed from: f0, reason: collision with root package name */
            public static final int f9605f0 = 65;

            /* renamed from: g, reason: collision with root package name */
            public static final int f9606g = 6;

            /* renamed from: g0, reason: collision with root package name */
            public static final int f9607g0 = 66;

            /* renamed from: h, reason: collision with root package name */
            public static final int f9608h = 7;

            /* renamed from: h0, reason: collision with root package name */
            public static final int f9609h0 = 67;

            /* renamed from: i, reason: collision with root package name */
            public static final int f9610i = 8;

            /* renamed from: i0, reason: collision with root package name */
            public static final SparseIntArray f9611i0;

            /* renamed from: j, reason: collision with root package name */
            public static final int f9612j = 9;

            /* renamed from: k, reason: collision with root package name */
            public static final int f9613k = 10;

            /* renamed from: l, reason: collision with root package name */
            public static final int f9614l = 11;

            /* renamed from: m, reason: collision with root package name */
            public static final int f9615m = 12;

            /* renamed from: n, reason: collision with root package name */
            public static final int f9616n = 13;

            /* renamed from: o, reason: collision with root package name */
            public static final int f9617o = 14;

            /* renamed from: p, reason: collision with root package name */
            public static final int f9618p = 15;

            /* renamed from: q, reason: collision with root package name */
            public static final int f9619q = 16;

            /* renamed from: r, reason: collision with root package name */
            public static final int f9620r = 17;

            /* renamed from: s, reason: collision with root package name */
            public static final int f9621s = 18;

            /* renamed from: t, reason: collision with root package name */
            public static final int f9622t = 19;

            /* renamed from: u, reason: collision with root package name */
            public static final int f9623u = 20;

            /* renamed from: v, reason: collision with root package name */
            public static final int f9624v = 21;

            /* renamed from: w, reason: collision with root package name */
            public static final int f9625w = 22;

            /* renamed from: x, reason: collision with root package name */
            public static final int f9626x = 23;

            /* renamed from: y, reason: collision with root package name */
            public static final int f9627y = 24;

            /* renamed from: z, reason: collision with root package name */
            public static final int f9628z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f9611i0 = sparseIntArray;
                sparseIntArray.append(h.m.s8, 64);
                sparseIntArray.append(h.m.V7, 65);
                sparseIntArray.append(h.m.e8, 8);
                sparseIntArray.append(h.m.f8, 9);
                sparseIntArray.append(h.m.h8, 10);
                sparseIntArray.append(h.m.i8, 11);
                sparseIntArray.append(h.m.o8, 12);
                sparseIntArray.append(h.m.n8, 13);
                sparseIntArray.append(h.m.L7, 14);
                sparseIntArray.append(h.m.K7, 15);
                sparseIntArray.append(h.m.G7, 16);
                sparseIntArray.append(h.m.I7, 52);
                sparseIntArray.append(h.m.H7, 53);
                sparseIntArray.append(h.m.M7, 2);
                sparseIntArray.append(h.m.O7, 3);
                sparseIntArray.append(h.m.N7, 4);
                sparseIntArray.append(h.m.x8, 49);
                sparseIntArray.append(h.m.y8, 50);
                sparseIntArray.append(h.m.S7, 5);
                sparseIntArray.append(h.m.T7, 6);
                sparseIntArray.append(h.m.U7, 7);
                sparseIntArray.append(h.m.B7, 67);
                sparseIntArray.append(h.m.y6, 1);
                sparseIntArray.append(h.m.j8, 17);
                sparseIntArray.append(h.m.k8, 18);
                sparseIntArray.append(h.m.R7, 19);
                sparseIntArray.append(h.m.Q7, 20);
                sparseIntArray.append(h.m.C8, 21);
                sparseIntArray.append(h.m.F8, 22);
                sparseIntArray.append(h.m.D8, 23);
                sparseIntArray.append(h.m.A8, 24);
                sparseIntArray.append(h.m.E8, 25);
                sparseIntArray.append(h.m.B8, 26);
                sparseIntArray.append(h.m.z8, 55);
                sparseIntArray.append(h.m.G8, 54);
                sparseIntArray.append(h.m.a8, 29);
                sparseIntArray.append(h.m.p8, 30);
                sparseIntArray.append(h.m.P7, 44);
                sparseIntArray.append(h.m.c8, 45);
                sparseIntArray.append(h.m.r8, 46);
                sparseIntArray.append(h.m.b8, 47);
                sparseIntArray.append(h.m.q8, 48);
                sparseIntArray.append(h.m.E7, 27);
                sparseIntArray.append(h.m.D7, 28);
                sparseIntArray.append(h.m.t8, 31);
                sparseIntArray.append(h.m.W7, 32);
                sparseIntArray.append(h.m.v8, 33);
                sparseIntArray.append(h.m.u8, 34);
                sparseIntArray.append(h.m.w8, 35);
                sparseIntArray.append(h.m.Y7, 36);
                sparseIntArray.append(h.m.X7, 37);
                sparseIntArray.append(h.m.Z7, 38);
                sparseIntArray.append(h.m.d8, 39);
                sparseIntArray.append(h.m.m8, 40);
                sparseIntArray.append(h.m.g8, 41);
                sparseIntArray.append(h.m.J7, 42);
                sparseIntArray.append(h.m.F7, 43);
                sparseIntArray.append(h.m.l8, 51);
                sparseIntArray.append(h.m.I8, 66);
            }

            private a() {
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9519a = -1;
            this.f9521b = -1;
            this.f9523c = -1.0f;
            this.f9525d = true;
            this.f9527e = -1;
            this.f9529f = -1;
            this.f9531g = -1;
            this.f9533h = -1;
            this.f9535i = -1;
            this.f9537j = -1;
            this.f9539k = -1;
            this.f9541l = -1;
            this.f9543m = -1;
            this.f9545n = -1;
            this.f9547o = -1;
            this.f9549p = -1;
            this.f9551q = 0;
            this.f9553r = 0.0f;
            this.f9555s = -1;
            this.f9557t = -1;
            this.f9559u = -1;
            this.f9561v = -1;
            this.f9563w = Integer.MIN_VALUE;
            this.f9565x = Integer.MIN_VALUE;
            this.f9566y = Integer.MIN_VALUE;
            this.f9567z = Integer.MIN_VALUE;
            this.f9493A = Integer.MIN_VALUE;
            this.f9494B = Integer.MIN_VALUE;
            this.f9495C = Integer.MIN_VALUE;
            this.f9496D = 0;
            this.f9497E = true;
            this.f9498F = true;
            this.f9499G = 0.5f;
            this.f9500H = 0.5f;
            this.f9501I = null;
            this.f9502J = 0.0f;
            this.f9503K = 1;
            this.f9504L = -1.0f;
            this.f9505M = -1.0f;
            this.f9506N = 0;
            this.f9507O = 0;
            this.f9508P = 0;
            this.f9509Q = 0;
            this.f9510R = 0;
            this.f9511S = 0;
            this.f9512T = 0;
            this.f9513U = 0;
            this.f9514V = 1.0f;
            this.f9515W = 1.0f;
            this.f9516X = -1;
            this.f9517Y = -1;
            this.f9518Z = -1;
            this.f9520a0 = false;
            this.f9522b0 = false;
            this.f9524c0 = null;
            this.f9526d0 = 0;
            this.f9528e0 = true;
            this.f9530f0 = true;
            this.f9532g0 = false;
            this.f9534h0 = false;
            this.f9536i0 = false;
            this.f9538j0 = false;
            this.f9540k0 = false;
            this.f9542l0 = -1;
            this.f9544m0 = -1;
            this.f9546n0 = -1;
            this.f9548o0 = -1;
            this.f9550p0 = Integer.MIN_VALUE;
            this.f9552q0 = Integer.MIN_VALUE;
            this.f9554r0 = 0.5f;
            this.f9562v0 = new ConstraintWidget();
            this.f9564w0 = false;
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f9519a = bVar.f9519a;
                this.f9521b = bVar.f9521b;
                this.f9523c = bVar.f9523c;
                this.f9525d = bVar.f9525d;
                this.f9527e = bVar.f9527e;
                this.f9529f = bVar.f9529f;
                this.f9531g = bVar.f9531g;
                this.f9533h = bVar.f9533h;
                this.f9535i = bVar.f9535i;
                this.f9537j = bVar.f9537j;
                this.f9539k = bVar.f9539k;
                this.f9541l = bVar.f9541l;
                this.f9543m = bVar.f9543m;
                this.f9545n = bVar.f9545n;
                this.f9547o = bVar.f9547o;
                this.f9549p = bVar.f9549p;
                this.f9551q = bVar.f9551q;
                this.f9553r = bVar.f9553r;
                this.f9555s = bVar.f9555s;
                this.f9557t = bVar.f9557t;
                this.f9559u = bVar.f9559u;
                this.f9561v = bVar.f9561v;
                this.f9563w = bVar.f9563w;
                this.f9565x = bVar.f9565x;
                this.f9566y = bVar.f9566y;
                this.f9567z = bVar.f9567z;
                this.f9493A = bVar.f9493A;
                this.f9494B = bVar.f9494B;
                this.f9495C = bVar.f9495C;
                this.f9496D = bVar.f9496D;
                this.f9499G = bVar.f9499G;
                this.f9500H = bVar.f9500H;
                this.f9501I = bVar.f9501I;
                this.f9502J = bVar.f9502J;
                this.f9503K = bVar.f9503K;
                this.f9504L = bVar.f9504L;
                this.f9505M = bVar.f9505M;
                this.f9506N = bVar.f9506N;
                this.f9507O = bVar.f9507O;
                this.f9520a0 = bVar.f9520a0;
                this.f9522b0 = bVar.f9522b0;
                this.f9508P = bVar.f9508P;
                this.f9509Q = bVar.f9509Q;
                this.f9510R = bVar.f9510R;
                this.f9512T = bVar.f9512T;
                this.f9511S = bVar.f9511S;
                this.f9513U = bVar.f9513U;
                this.f9514V = bVar.f9514V;
                this.f9515W = bVar.f9515W;
                this.f9516X = bVar.f9516X;
                this.f9517Y = bVar.f9517Y;
                this.f9518Z = bVar.f9518Z;
                this.f9528e0 = bVar.f9528e0;
                this.f9530f0 = bVar.f9530f0;
                this.f9532g0 = bVar.f9532g0;
                this.f9534h0 = bVar.f9534h0;
                this.f9542l0 = bVar.f9542l0;
                this.f9544m0 = bVar.f9544m0;
                this.f9546n0 = bVar.f9546n0;
                this.f9548o0 = bVar.f9548o0;
                this.f9550p0 = bVar.f9550p0;
                this.f9552q0 = bVar.f9552q0;
                this.f9554r0 = bVar.f9554r0;
                this.f9524c0 = bVar.f9524c0;
                this.f9526d0 = bVar.f9526d0;
                this.f9562v0 = bVar.f9562v0;
                this.f9497E = bVar.f9497E;
                this.f9498F = bVar.f9498F;
            }
        }

        public String a() {
            return this.f9524c0;
        }

        public ConstraintWidget b() {
            return this.f9562v0;
        }

        public void c() {
            ConstraintWidget constraintWidget = this.f9562v0;
            if (constraintWidget != null) {
                constraintWidget.R0();
            }
        }

        public void d(String str) {
            this.f9562v0.j1(str);
        }

        public void e() {
            this.f9534h0 = false;
            this.f9528e0 = true;
            this.f9530f0 = true;
            int i4 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i4 == -2 && this.f9520a0) {
                this.f9528e0 = false;
                if (this.f9508P == 0) {
                    this.f9508P = 1;
                }
            }
            int i5 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i5 == -2 && this.f9522b0) {
                this.f9530f0 = false;
                if (this.f9509Q == 0) {
                    this.f9509Q = 1;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.f9528e0 = false;
                if (i4 == 0 && this.f9508P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f9520a0 = true;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.f9530f0 = false;
                if (i5 == 0 && this.f9509Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f9522b0 = true;
                }
            }
            if (this.f9523c != -1.0f || this.f9519a != -1 || this.f9521b != -1) {
                this.f9534h0 = true;
                this.f9528e0 = true;
                this.f9530f0 = true;
                if (!(this.f9562v0 instanceof androidx.constraintlayout.core.widgets.f)) {
                    this.f9562v0 = new androidx.constraintlayout.core.widgets.f();
                }
                ((androidx.constraintlayout.core.widgets.f) this.f9562v0).C2(this.f9518Z);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9519a = -1;
            this.f9521b = -1;
            this.f9523c = -1.0f;
            this.f9525d = true;
            this.f9527e = -1;
            this.f9529f = -1;
            this.f9531g = -1;
            this.f9533h = -1;
            this.f9535i = -1;
            this.f9537j = -1;
            this.f9539k = -1;
            this.f9541l = -1;
            this.f9543m = -1;
            this.f9545n = -1;
            this.f9547o = -1;
            this.f9549p = -1;
            this.f9551q = 0;
            this.f9553r = 0.0f;
            this.f9555s = -1;
            this.f9557t = -1;
            this.f9559u = -1;
            this.f9561v = -1;
            this.f9563w = Integer.MIN_VALUE;
            this.f9565x = Integer.MIN_VALUE;
            this.f9566y = Integer.MIN_VALUE;
            this.f9567z = Integer.MIN_VALUE;
            this.f9493A = Integer.MIN_VALUE;
            this.f9494B = Integer.MIN_VALUE;
            this.f9495C = Integer.MIN_VALUE;
            this.f9496D = 0;
            this.f9497E = true;
            this.f9498F = true;
            this.f9499G = 0.5f;
            this.f9500H = 0.5f;
            this.f9501I = null;
            this.f9502J = 0.0f;
            this.f9503K = 1;
            this.f9504L = -1.0f;
            this.f9505M = -1.0f;
            this.f9506N = 0;
            this.f9507O = 0;
            this.f9508P = 0;
            this.f9509Q = 0;
            this.f9510R = 0;
            this.f9511S = 0;
            this.f9512T = 0;
            this.f9513U = 0;
            this.f9514V = 1.0f;
            this.f9515W = 1.0f;
            this.f9516X = -1;
            this.f9517Y = -1;
            this.f9518Z = -1;
            this.f9520a0 = false;
            this.f9522b0 = false;
            this.f9524c0 = null;
            this.f9526d0 = 0;
            this.f9528e0 = true;
            this.f9530f0 = true;
            this.f9532g0 = false;
            this.f9534h0 = false;
            this.f9536i0 = false;
            this.f9538j0 = false;
            this.f9540k0 = false;
            this.f9542l0 = -1;
            this.f9544m0 = -1;
            this.f9546n0 = -1;
            this.f9548o0 = -1;
            this.f9550p0 = Integer.MIN_VALUE;
            this.f9552q0 = Integer.MIN_VALUE;
            this.f9554r0 = 0.5f;
            this.f9562v0 = new ConstraintWidget();
            this.f9564w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = a.f9611i0.get(index);
                switch (i5) {
                    case 1:
                        this.f9518Z = obtainStyledAttributes.getInt(index, this.f9518Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f9549p);
                        this.f9549p = resourceId;
                        if (resourceId == -1) {
                            this.f9549p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f9551q = obtainStyledAttributes.getDimensionPixelSize(index, this.f9551q);
                        break;
                    case 4:
                        float f4 = obtainStyledAttributes.getFloat(index, this.f9553r) % 360.0f;
                        this.f9553r = f4;
                        if (f4 < 0.0f) {
                            this.f9553r = (360.0f - f4) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f9519a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9519a);
                        break;
                    case 6:
                        this.f9521b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9521b);
                        break;
                    case 7:
                        this.f9523c = obtainStyledAttributes.getFloat(index, this.f9523c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f9527e);
                        this.f9527e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f9527e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f9529f);
                        this.f9529f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f9529f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f9531g);
                        this.f9531g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f9531g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f9533h);
                        this.f9533h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f9533h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f9535i);
                        this.f9535i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f9535i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f9537j);
                        this.f9537j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f9537j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f9539k);
                        this.f9539k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f9539k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f9541l);
                        this.f9541l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f9541l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f9543m);
                        this.f9543m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f9543m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f9555s);
                        this.f9555s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f9555s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f9557t);
                        this.f9557t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f9557t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f9559u);
                        this.f9559u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f9559u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f9561v);
                        this.f9561v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f9561v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f9563w = obtainStyledAttributes.getDimensionPixelSize(index, this.f9563w);
                        break;
                    case 22:
                        this.f9565x = obtainStyledAttributes.getDimensionPixelSize(index, this.f9565x);
                        break;
                    case 23:
                        this.f9566y = obtainStyledAttributes.getDimensionPixelSize(index, this.f9566y);
                        break;
                    case 24:
                        this.f9567z = obtainStyledAttributes.getDimensionPixelSize(index, this.f9567z);
                        break;
                    case 25:
                        this.f9493A = obtainStyledAttributes.getDimensionPixelSize(index, this.f9493A);
                        break;
                    case 26:
                        this.f9494B = obtainStyledAttributes.getDimensionPixelSize(index, this.f9494B);
                        break;
                    case 27:
                        this.f9520a0 = obtainStyledAttributes.getBoolean(index, this.f9520a0);
                        break;
                    case 28:
                        this.f9522b0 = obtainStyledAttributes.getBoolean(index, this.f9522b0);
                        break;
                    case a.f9571D /* 29 */:
                        this.f9499G = obtainStyledAttributes.getFloat(index, this.f9499G);
                        break;
                    case 30:
                        this.f9500H = obtainStyledAttributes.getFloat(index, this.f9500H);
                        break;
                    case a.f9573F /* 31 */:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.f9508P = i6;
                        if (i6 == 1) {
                            Log.e(ConstraintLayout.f9435h0, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i7 = obtainStyledAttributes.getInt(index, 0);
                        this.f9509Q = i7;
                        if (i7 == 1) {
                            Log.e(ConstraintLayout.f9435h0, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f9510R = obtainStyledAttributes.getDimensionPixelSize(index, this.f9510R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f9510R) == -2) {
                                this.f9510R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f9512T = obtainStyledAttributes.getDimensionPixelSize(index, this.f9512T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f9512T) == -2) {
                                this.f9512T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f9514V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f9514V));
                        this.f9508P = 2;
                        break;
                    case 36:
                        try {
                            this.f9511S = obtainStyledAttributes.getDimensionPixelSize(index, this.f9511S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f9511S) == -2) {
                                this.f9511S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f9513U = obtainStyledAttributes.getDimensionPixelSize(index, this.f9513U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f9513U) == -2) {
                                this.f9513U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f9515W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f9515W));
                        this.f9509Q = 2;
                        break;
                    default:
                        switch (i5) {
                            case 44:
                                androidx.constraintlayout.widget.d.F0(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f9504L = obtainStyledAttributes.getFloat(index, this.f9504L);
                                break;
                            case 46:
                                this.f9505M = obtainStyledAttributes.getFloat(index, this.f9505M);
                                break;
                            case 47:
                                this.f9506N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f9507O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f9516X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9516X);
                                break;
                            case 50:
                                this.f9517Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9517Y);
                                break;
                            case 51:
                                this.f9524c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f9545n);
                                this.f9545n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f9545n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f9547o);
                                this.f9547o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f9547o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f9496D = obtainStyledAttributes.getDimensionPixelSize(index, this.f9496D);
                                break;
                            case a.f9601d0 /* 55 */:
                                this.f9495C = obtainStyledAttributes.getDimensionPixelSize(index, this.f9495C);
                                break;
                            default:
                                switch (i5) {
                                    case 64:
                                        androidx.constraintlayout.widget.d.D0(this, obtainStyledAttributes, index, 0);
                                        this.f9497E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.d.D0(this, obtainStyledAttributes, index, 1);
                                        this.f9498F = true;
                                        break;
                                    case 66:
                                        this.f9526d0 = obtainStyledAttributes.getInt(index, this.f9526d0);
                                        break;
                                    case a.f9609h0 /* 67 */:
                                        this.f9525d = obtainStyledAttributes.getBoolean(index, this.f9525d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            e();
        }

        public b(int i4, int i5) {
            super(i4, i5);
            this.f9519a = -1;
            this.f9521b = -1;
            this.f9523c = -1.0f;
            this.f9525d = true;
            this.f9527e = -1;
            this.f9529f = -1;
            this.f9531g = -1;
            this.f9533h = -1;
            this.f9535i = -1;
            this.f9537j = -1;
            this.f9539k = -1;
            this.f9541l = -1;
            this.f9543m = -1;
            this.f9545n = -1;
            this.f9547o = -1;
            this.f9549p = -1;
            this.f9551q = 0;
            this.f9553r = 0.0f;
            this.f9555s = -1;
            this.f9557t = -1;
            this.f9559u = -1;
            this.f9561v = -1;
            this.f9563w = Integer.MIN_VALUE;
            this.f9565x = Integer.MIN_VALUE;
            this.f9566y = Integer.MIN_VALUE;
            this.f9567z = Integer.MIN_VALUE;
            this.f9493A = Integer.MIN_VALUE;
            this.f9494B = Integer.MIN_VALUE;
            this.f9495C = Integer.MIN_VALUE;
            this.f9496D = 0;
            this.f9497E = true;
            this.f9498F = true;
            this.f9499G = 0.5f;
            this.f9500H = 0.5f;
            this.f9501I = null;
            this.f9502J = 0.0f;
            this.f9503K = 1;
            this.f9504L = -1.0f;
            this.f9505M = -1.0f;
            this.f9506N = 0;
            this.f9507O = 0;
            this.f9508P = 0;
            this.f9509Q = 0;
            this.f9510R = 0;
            this.f9511S = 0;
            this.f9512T = 0;
            this.f9513U = 0;
            this.f9514V = 1.0f;
            this.f9515W = 1.0f;
            this.f9516X = -1;
            this.f9517Y = -1;
            this.f9518Z = -1;
            this.f9520a0 = false;
            this.f9522b0 = false;
            this.f9524c0 = null;
            this.f9526d0 = 0;
            this.f9528e0 = true;
            this.f9530f0 = true;
            this.f9532g0 = false;
            this.f9534h0 = false;
            this.f9536i0 = false;
            this.f9538j0 = false;
            this.f9540k0 = false;
            this.f9542l0 = -1;
            this.f9544m0 = -1;
            this.f9546n0 = -1;
            this.f9548o0 = -1;
            this.f9550p0 = Integer.MIN_VALUE;
            this.f9552q0 = Integer.MIN_VALUE;
            this.f9554r0 = 0.5f;
            this.f9562v0 = new ConstraintWidget();
            this.f9564w0 = false;
        }
    }
}
