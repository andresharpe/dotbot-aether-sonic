package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.M;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: X, reason: collision with root package name */
    private static final boolean f17466X = false;

    /* renamed from: Y, reason: collision with root package name */
    private static final String f17467Y = "GridLayoutManager";

    /* renamed from: Z, reason: collision with root package name */
    public static final int f17468Z = -1;

    /* renamed from: O, reason: collision with root package name */
    boolean f17469O;

    /* renamed from: P, reason: collision with root package name */
    int f17470P;

    /* renamed from: Q, reason: collision with root package name */
    int[] f17471Q;

    /* renamed from: R, reason: collision with root package name */
    View[] f17472R;

    /* renamed from: S, reason: collision with root package name */
    final SparseIntArray f17473S;

    /* renamed from: T, reason: collision with root package name */
    final SparseIntArray f17474T;

    /* renamed from: U, reason: collision with root package name */
    c f17475U;

    /* renamed from: V, reason: collision with root package name */
    final Rect f17476V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f17477W;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i4, int i5) {
            return i4 % i5;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i4) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f17481a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f17482b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f17483c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17484d = false;

        static int a(SparseIntArray sparseIntArray, int i4) {
            int size = sparseIntArray.size() - 1;
            int i5 = 0;
            while (i5 <= size) {
                int i6 = (i5 + size) >>> 1;
                if (sparseIntArray.keyAt(i6) < i4) {
                    i5 = i6 + 1;
                } else {
                    size = i6 - 1;
                }
            }
            int i7 = i5 - 1;
            if (i7 >= 0 && i7 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i7);
            }
            return -1;
        }

        int b(int i4, int i5) {
            if (!this.f17484d) {
                return d(i4, i5);
            }
            int i6 = this.f17482b.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int d4 = d(i4, i5);
            this.f17482b.put(i4, d4);
            return d4;
        }

        int c(int i4, int i5) {
            if (!this.f17483c) {
                return e(i4, i5);
            }
            int i6 = this.f17481a.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int e4 = e(i4, i5);
            this.f17481a.put(i4, e4);
            return e4;
        }

        public int d(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int a4;
            if (this.f17484d && (a4 = a(this.f17482b, i4)) != -1) {
                i6 = this.f17482b.get(a4);
                i7 = a4 + 1;
                i8 = c(a4, i5) + f(a4);
                if (i8 == i5) {
                    i6++;
                    i8 = 0;
                }
            } else {
                i6 = 0;
                i7 = 0;
                i8 = 0;
            }
            int f4 = f(i4);
            while (i7 < i4) {
                int f5 = f(i7);
                i8 += f5;
                if (i8 == i5) {
                    i6++;
                    i8 = 0;
                } else if (i8 > i5) {
                    i6++;
                    i8 = f5;
                }
                i7++;
            }
            if (i8 + f4 > i5) {
                return i6 + 1;
            }
            return i6;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f17483c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f17481a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f17481a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i4);

        public void g() {
            this.f17482b.clear();
        }

        public void h() {
            this.f17481a.clear();
        }

        public boolean i() {
            return this.f17484d;
        }

        public boolean j() {
            return this.f17483c;
        }

        public void k(boolean z3) {
            if (!z3) {
                this.f17482b.clear();
            }
            this.f17484d = z3;
        }

        public void l(boolean z3) {
            if (!z3) {
                this.f17482b.clear();
            }
            this.f17483c = z3;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f17469O = false;
        this.f17470P = -1;
        this.f17473S = new SparseIntArray();
        this.f17474T = new SparseIntArray();
        this.f17475U = new a();
        this.f17476V = new Rect();
        M3(RecyclerView.o.t0(context, attributeSet, i4, i5).f17837b);
    }

    private void A3(RecyclerView.w wVar, RecyclerView.C c4, LinearLayoutManager.a aVar, int i4) {
        boolean z3;
        if (i4 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int F3 = F3(wVar, c4, aVar.f17565b);
        if (z3) {
            while (F3 > 0) {
                int i5 = aVar.f17565b;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    aVar.f17565b = i6;
                    F3 = F3(wVar, c4, i6);
                } else {
                    return;
                }
            }
            return;
        }
        int d4 = c4.d() - 1;
        int i7 = aVar.f17565b;
        while (i7 < d4) {
            int i8 = i7 + 1;
            int F32 = F3(wVar, c4, i8);
            if (F32 <= F3) {
                break;
            }
            i7 = i8;
            F3 = F32;
        }
        aVar.f17565b = i7;
    }

    private void B3() {
        View[] viewArr = this.f17472R;
        if (viewArr == null || viewArr.length != this.f17470P) {
            this.f17472R = new View[this.f17470P];
        }
    }

    private int E3(RecyclerView.w wVar, RecyclerView.C c4, int i4) {
        if (!c4.j()) {
            return this.f17475U.b(i4, this.f17470P);
        }
        int g4 = wVar.g(i4);
        if (g4 == -1) {
            Log.w(f17467Y, "Cannot find span size for pre layout position. " + i4);
            return 0;
        }
        return this.f17475U.b(g4, this.f17470P);
    }

    private int F3(RecyclerView.w wVar, RecyclerView.C c4, int i4) {
        if (!c4.j()) {
            return this.f17475U.c(i4, this.f17470P);
        }
        int i5 = this.f17474T.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int g4 = wVar.g(i4);
        if (g4 == -1) {
            Log.w(f17467Y, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
            return 0;
        }
        return this.f17475U.c(g4, this.f17470P);
    }

    private int G3(RecyclerView.w wVar, RecyclerView.C c4, int i4) {
        if (!c4.j()) {
            return this.f17475U.f(i4);
        }
        int i5 = this.f17473S.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int g4 = wVar.g(i4);
        if (g4 == -1) {
            Log.w(f17467Y, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
            return 1;
        }
        return this.f17475U.f(g4);
    }

    private void I3(float f4, int i4) {
        v3(Math.max(Math.round(f4 * this.f17470P), i4));
    }

    private void K3(View view, int i4, boolean z3) {
        int i5;
        int i6;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f17841b;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int C3 = C3(bVar.f17479e, bVar.f17480f);
        if (this.f17556s == 1) {
            i6 = RecyclerView.o.R(C3, i4, i8, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i5 = RecyclerView.o.R(this.f17558u.o(), f0(), i7, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int R3 = RecyclerView.o.R(C3, i4, i7, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int R4 = RecyclerView.o.R(this.f17558u.o(), A0(), i8, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i5 = R3;
            i6 = R4;
        }
        L3(view, i6, i5, z3);
    }

    private void L3(View view, int i4, int i5, boolean z3) {
        boolean c22;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z3) {
            c22 = e2(view, i4, i5, pVar);
        } else {
            c22 = c2(view, i4, i5, pVar);
        }
        if (c22) {
            view.measure(i4, i5);
        }
    }

    private void P3() {
        int e02;
        int r02;
        if (M2() == 1) {
            e02 = z0() - p0();
            r02 = o0();
        } else {
            e02 = e0() - m0();
            r02 = r0();
        }
        v3(e02 - r02);
    }

    private void t3(RecyclerView.w wVar, RecyclerView.C c4, int i4, boolean z3) {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (z3) {
            i7 = 1;
            i6 = i4;
            i5 = 0;
        } else {
            i5 = i4 - 1;
            i6 = -1;
            i7 = -1;
        }
        while (i5 != i6) {
            View view = this.f17472R[i5];
            b bVar = (b) view.getLayoutParams();
            int G3 = G3(wVar, c4, s0(view));
            bVar.f17480f = G3;
            bVar.f17479e = i8;
            i8 += G3;
            i5 += i7;
        }
    }

    private void u3() {
        int Q3 = Q();
        for (int i4 = 0; i4 < Q3; i4++) {
            b bVar = (b) P(i4).getLayoutParams();
            int d4 = bVar.d();
            this.f17473S.put(d4, bVar.k());
            this.f17474T.put(d4, bVar.j());
        }
    }

    private void v3(int i4) {
        this.f17471Q = w3(this.f17471Q, this.f17470P, i4);
    }

    static int[] w3(int[] iArr, int i4, int i5) {
        int i6;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i5) {
            iArr = new int[i4 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i5 / i4;
        int i9 = i5 % i4;
        int i10 = 0;
        for (int i11 = 1; i11 <= i4; i11++) {
            i7 += i9;
            if (i7 > 0 && i4 - i7 < i9) {
                i6 = i8 + 1;
                i7 -= i4;
            } else {
                i6 = i8;
            }
            i10 += i6;
            iArr[i11] = i10;
        }
        return iArr;
    }

    private void x3() {
        this.f17473S.clear();
        this.f17474T.clear();
    }

    private int y3(RecyclerView.C c4) {
        int max;
        if (Q() != 0 && c4.d() != 0) {
            r2();
            boolean R22 = R2();
            View w22 = w2(!R22, true);
            View v22 = v2(!R22, true);
            if (w22 != null && v22 != null) {
                int b4 = this.f17475U.b(s0(w22), this.f17470P);
                int b5 = this.f17475U.b(s0(v22), this.f17470P);
                int min = Math.min(b4, b5);
                int max2 = Math.max(b4, b5);
                int b6 = this.f17475U.b(c4.d() - 1, this.f17470P) + 1;
                if (this.f17561x) {
                    max = Math.max(0, (b6 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!R22) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.f17558u.d(v22) - this.f17558u.g(w22)) / ((this.f17475U.b(s0(v22), this.f17470P) - this.f17475U.b(s0(w22), this.f17470P)) + 1))) + (this.f17558u.n() - this.f17558u.g(w22)));
            }
        }
        return 0;
    }

    private int z3(RecyclerView.C c4) {
        if (Q() != 0 && c4.d() != 0) {
            r2();
            View w22 = w2(!R2(), true);
            View v22 = v2(!R2(), true);
            if (w22 != null && v22 != null) {
                if (!R2()) {
                    return this.f17475U.b(c4.d() - 1, this.f17470P) + 1;
                }
                int d4 = this.f17558u.d(v22) - this.f17558u.g(w22);
                int b4 = this.f17475U.b(s0(w22), this.f17470P);
                return (int) ((d4 / ((this.f17475U.b(s0(v22), this.f17470P) - b4) + 1)) * (this.f17475U.b(c4.d() - 1, this.f17470P) + 1));
            }
        }
        return 0;
    }

    int C3(int i4, int i5) {
        if (this.f17556s == 1 && Q2()) {
            int[] iArr = this.f17471Q;
            int i6 = this.f17470P;
            return iArr[i6 - i4] - iArr[(i6 - i4) - i5];
        }
        int[] iArr2 = this.f17471Q;
        return iArr2[i5 + i4] - iArr2[i4];
    }

    public int D3() {
        return this.f17470P;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View F2(RecyclerView.w wVar, RecyclerView.C c4, boolean z3, boolean z4) {
        int i4;
        int i5;
        int Q3 = Q();
        int i6 = 1;
        if (z4) {
            i5 = Q() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = Q3;
            i5 = 0;
        }
        int d4 = c4.d();
        r2();
        int n4 = this.f17558u.n();
        int i7 = this.f17558u.i();
        View view = null;
        View view2 = null;
        while (i5 != i4) {
            View P3 = P(i5);
            int s02 = s0(P3);
            if (s02 >= 0 && s02 < d4 && F3(wVar, c4, s02) == 0) {
                if (((RecyclerView.p) P3.getLayoutParams()).g()) {
                    if (view2 == null) {
                        view2 = P3;
                    }
                } else {
                    if (this.f17558u.g(P3) < i7 && this.f17558u.d(P3) >= n4) {
                        return P3;
                    }
                    if (view == null) {
                        view = P3;
                    }
                }
            }
            i5 += i6;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public c H3() {
        return this.f17475U;
    }

    public boolean J3() {
        return this.f17477W;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        if (this.f17556s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public void M3(int i4) {
        if (i4 == this.f17470P) {
            return;
        }
        this.f17469O = true;
        if (i4 >= 1) {
            this.f17470P = i4;
            this.f17475U.h();
            N1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
    }

    public void N3(c cVar) {
        this.f17475U = cVar;
    }

    public void O3(boolean z3) {
        this.f17477W = z3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        P3();
        B3();
        return super.Q1(i4, wVar, c4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int S1(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        P3();
        B3();
        return super.S1(i4, wVar, c4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f17570b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void S2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.C r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$C, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V(RecyclerView.w wVar, RecyclerView.C c4) {
        if (this.f17556s == 1) {
            return this.f17470P;
        }
        if (c4.d() < 1) {
            return 0;
        }
        return E3(wVar, c4, c4.d() - 1) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void V2(RecyclerView.w wVar, RecyclerView.C c4, LinearLayoutManager.a aVar, int i4) {
        super.V2(wVar, c4, aVar, i4);
        P3();
        if (c4.d() > 0 && !c4.j()) {
            A3(wVar, c4, aVar, i4);
        }
        B3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y1(Rect rect, int i4, int i5) {
        int q4;
        int q5;
        if (this.f17471Q == null) {
            super.Y1(rect, i4, i5);
        }
        int o02 = o0() + p0();
        int r02 = r0() + m0();
        if (this.f17556s == 1) {
            q5 = RecyclerView.o.q(i5, rect.height() + r02, k0());
            int[] iArr = this.f17471Q;
            q4 = RecyclerView.o.q(i4, iArr[iArr.length - 1] + o02, l0());
        } else {
            q4 = RecyclerView.o.q(i4, rect.width() + o02, l0());
            int[] iArr2 = this.f17471Q;
            q5 = RecyclerView.o.q(i5, iArr2[iArr2.length - 1] + r02, k0());
        }
        X1(q4, q5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r13 == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r13 == r10) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View a1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.C r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$C):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(RecyclerView.w wVar, RecyclerView.C c4, View view, M m4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.f1(view, m4);
            return;
        }
        b bVar = (b) layoutParams;
        int E3 = E3(wVar, c4, bVar.d());
        if (this.f17556s == 0) {
            m4.c1(M.d.h(bVar.j(), bVar.k(), E3, 1, false, false));
        } else {
            m4.c1(M.d.h(E3, 1, bVar.j(), bVar.k(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(RecyclerView recyclerView, int i4, int i5) {
        this.f17475U.h();
        this.f17475U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(RecyclerView recyclerView) {
        this.f17475U.h();
        this.f17475U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        if (this.f17551D == null && !this.f17469O) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void j3(boolean z3) {
        if (!z3) {
            super.j3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k1(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.f17475U.h();
        this.f17475U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView recyclerView, int i4, int i5) {
        this.f17475U.h();
        this.f17475U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void l2(RecyclerView.C c4, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i4 = this.f17470P;
        for (int i5 = 0; i5 < this.f17470P && cVar.c(c4) && i4 > 0; i5++) {
            int i6 = cVar.f17583d;
            cVar2.a(i6, Math.max(0, cVar.f17586g));
            i4 -= this.f17475U.f(i6);
            cVar.f17583d += cVar.f17584e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i4, int i5, Object obj) {
        this.f17475U.h();
        this.f17475U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.C c4) {
        if (c4.j()) {
            u3();
        }
        super.o1(wVar, c4);
        x3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.C c4) {
        super.p1(c4);
        this.f17469O = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.C c4) {
        if (this.f17477W) {
            return y3(c4);
        }
        return super.u(c4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.C c4) {
        if (this.f17477W) {
            return z3(c4);
        }
        return super.v(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v0(RecyclerView.w wVar, RecyclerView.C c4) {
        if (this.f17556s == 0) {
            return this.f17470P;
        }
        if (c4.d() < 1) {
            return 0;
        }
        return E3(wVar, c4, c4.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.C c4) {
        if (this.f17477W) {
            return y3(c4);
        }
        return super.x(c4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.C c4) {
        if (this.f17477W) {
            return z3(c4);
        }
        return super.y(c4);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.p {

        /* renamed from: g, reason: collision with root package name */
        public static final int f17478g = -1;

        /* renamed from: e, reason: collision with root package name */
        int f17479e;

        /* renamed from: f, reason: collision with root package name */
        int f17480f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17479e = -1;
            this.f17480f = 0;
        }

        public int j() {
            return this.f17479e;
        }

        public int k() {
            return this.f17480f;
        }

        public b(int i4, int i5) {
            super(i4, i5);
            this.f17479e = -1;
            this.f17480f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17479e = -1;
            this.f17480f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17479e = -1;
            this.f17480f = 0;
        }

        public b(RecyclerView.p pVar) {
            super(pVar);
            this.f17479e = -1;
            this.f17480f = 0;
        }
    }

    public GridLayoutManager(Context context, int i4) {
        super(context);
        this.f17469O = false;
        this.f17470P = -1;
        this.f17473S = new SparseIntArray();
        this.f17474T = new SparseIntArray();
        this.f17475U = new a();
        this.f17476V = new Rect();
        M3(i4);
    }

    public GridLayoutManager(Context context, int i4, int i5, boolean z3) {
        super(context, i5, z3);
        this.f17469O = false;
        this.f17470P = -1;
        this.f17473S = new SparseIntArray();
        this.f17474T = new SparseIntArray();
        this.f17475U = new a();
        this.f17476V = new Rect();
        M3(i4);
    }
}
