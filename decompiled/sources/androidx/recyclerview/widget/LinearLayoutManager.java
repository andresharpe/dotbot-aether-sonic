package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements n.j, RecyclerView.B.b {

    /* renamed from: I, reason: collision with root package name */
    private static final String f17542I = "LinearLayoutManager";

    /* renamed from: J, reason: collision with root package name */
    static final boolean f17543J = false;

    /* renamed from: K, reason: collision with root package name */
    public static final int f17544K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final int f17545L = 1;

    /* renamed from: M, reason: collision with root package name */
    public static final int f17546M = Integer.MIN_VALUE;

    /* renamed from: N, reason: collision with root package name */
    private static final float f17547N = 0.33333334f;

    /* renamed from: A, reason: collision with root package name */
    int f17548A;

    /* renamed from: B, reason: collision with root package name */
    int f17549B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f17550C;

    /* renamed from: D, reason: collision with root package name */
    d f17551D;

    /* renamed from: E, reason: collision with root package name */
    final a f17552E;

    /* renamed from: F, reason: collision with root package name */
    private final b f17553F;

    /* renamed from: G, reason: collision with root package name */
    private int f17554G;

    /* renamed from: H, reason: collision with root package name */
    private int[] f17555H;

    /* renamed from: s, reason: collision with root package name */
    int f17556s;

    /* renamed from: t, reason: collision with root package name */
    private c f17557t;

    /* renamed from: u, reason: collision with root package name */
    y f17558u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17559v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17560w;

    /* renamed from: x, reason: collision with root package name */
    boolean f17561x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17562y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17563z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        y f17564a;

        /* renamed from: b, reason: collision with root package name */
        int f17565b;

        /* renamed from: c, reason: collision with root package name */
        int f17566c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17567d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17568e;

        a() {
            e();
        }

        void a() {
            int n4;
            if (this.f17567d) {
                n4 = this.f17564a.i();
            } else {
                n4 = this.f17564a.n();
            }
            this.f17566c = n4;
        }

        public void b(View view, int i4) {
            if (this.f17567d) {
                this.f17566c = this.f17564a.d(view) + this.f17564a.p();
            } else {
                this.f17566c = this.f17564a.g(view);
            }
            this.f17565b = i4;
        }

        public void c(View view, int i4) {
            int p4 = this.f17564a.p();
            if (p4 >= 0) {
                b(view, i4);
                return;
            }
            this.f17565b = i4;
            if (this.f17567d) {
                int i5 = (this.f17564a.i() - p4) - this.f17564a.d(view);
                this.f17566c = this.f17564a.i() - i5;
                if (i5 > 0) {
                    int e4 = this.f17566c - this.f17564a.e(view);
                    int n4 = this.f17564a.n();
                    int min = e4 - (n4 + Math.min(this.f17564a.g(view) - n4, 0));
                    if (min < 0) {
                        this.f17566c += Math.min(i5, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g4 = this.f17564a.g(view);
            int n5 = g4 - this.f17564a.n();
            this.f17566c = g4;
            if (n5 > 0) {
                int i6 = (this.f17564a.i() - Math.min(0, (this.f17564a.i() - p4) - this.f17564a.d(view))) - (g4 + this.f17564a.e(view));
                if (i6 < 0) {
                    this.f17566c -= Math.min(n5, -i6);
                }
            }
        }

        boolean d(View view, RecyclerView.C c4) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (!pVar.g() && pVar.d() >= 0 && pVar.d() < c4.d()) {
                return true;
            }
            return false;
        }

        void e() {
            this.f17565b = -1;
            this.f17566c = Integer.MIN_VALUE;
            this.f17567d = false;
            this.f17568e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f17565b + ", mCoordinate=" + this.f17566c + ", mLayoutFromEnd=" + this.f17567d + ", mValid=" + this.f17568e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f17569a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17570b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17571c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17572d;

        protected b() {
        }

        void a() {
            this.f17569a = 0;
            this.f17570b = false;
            this.f17571c = false;
            this.f17572d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: n, reason: collision with root package name */
        static final String f17573n = "LLM#LayoutState";

        /* renamed from: o, reason: collision with root package name */
        static final int f17574o = -1;

        /* renamed from: p, reason: collision with root package name */
        static final int f17575p = 1;

        /* renamed from: q, reason: collision with root package name */
        static final int f17576q = Integer.MIN_VALUE;

        /* renamed from: r, reason: collision with root package name */
        static final int f17577r = -1;

        /* renamed from: s, reason: collision with root package name */
        static final int f17578s = 1;

        /* renamed from: t, reason: collision with root package name */
        static final int f17579t = Integer.MIN_VALUE;

        /* renamed from: b, reason: collision with root package name */
        int f17581b;

        /* renamed from: c, reason: collision with root package name */
        int f17582c;

        /* renamed from: d, reason: collision with root package name */
        int f17583d;

        /* renamed from: e, reason: collision with root package name */
        int f17584e;

        /* renamed from: f, reason: collision with root package name */
        int f17585f;

        /* renamed from: g, reason: collision with root package name */
        int f17586g;

        /* renamed from: k, reason: collision with root package name */
        int f17590k;

        /* renamed from: m, reason: collision with root package name */
        boolean f17592m;

        /* renamed from: a, reason: collision with root package name */
        boolean f17580a = true;

        /* renamed from: h, reason: collision with root package name */
        int f17587h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f17588i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f17589j = false;

        /* renamed from: l, reason: collision with root package name */
        List<RecyclerView.F> f17591l = null;

        c() {
        }

        private View f() {
            int size = this.f17591l.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f17591l.get(i4).f17770a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.g() && this.f17583d == pVar.d()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View g4 = g(view);
            if (g4 == null) {
                this.f17583d = -1;
            } else {
                this.f17583d = ((RecyclerView.p) g4.getLayoutParams()).d();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(RecyclerView.C c4) {
            int i4 = this.f17583d;
            if (i4 >= 0 && i4 < c4.d()) {
                return true;
            }
            return false;
        }

        void d() {
            Log.d(f17573n, "avail:" + this.f17582c + ", ind:" + this.f17583d + ", dir:" + this.f17584e + ", offset:" + this.f17581b + ", layoutDir:" + this.f17585f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View e(RecyclerView.w wVar) {
            if (this.f17591l != null) {
                return f();
            }
            View p4 = wVar.p(this.f17583d);
            this.f17583d += this.f17584e;
            return p4;
        }

        public View g(View view) {
            int d4;
            int size = this.f17591l.size();
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                View view3 = this.f17591l.get(i5).f17770a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.g() && (d4 = (pVar.d() - this.f17583d) * this.f17584e) >= 0 && d4 < i4) {
                    view2 = view3;
                    if (d4 == 0) {
                        break;
                    }
                    i4 = d4;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        int f17593E;

        /* renamed from: F, reason: collision with root package name */
        int f17594F;

        /* renamed from: G, reason: collision with root package name */
        boolean f17595G;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        public d() {
        }

        boolean a() {
            if (this.f17593E >= 0) {
                return true;
            }
            return false;
        }

        void b() {
            this.f17593E = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f17593E);
            parcel.writeInt(this.f17594F);
            parcel.writeInt(this.f17595G ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f17593E = parcel.readInt();
            this.f17594F = parcel.readInt();
            this.f17595G = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f17593E = dVar.f17593E;
            this.f17594F = dVar.f17594F;
            this.f17595G = dVar.f17595G;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View D2() {
        if (this.f17561x) {
            return u2();
        }
        return z2();
    }

    private View E2() {
        if (this.f17561x) {
            return z2();
        }
        return u2();
    }

    private int G2(int i4, RecyclerView.w wVar, RecyclerView.C c4, boolean z3) {
        int i5;
        int i6 = this.f17558u.i() - i4;
        if (i6 > 0) {
            int i7 = -c3(-i6, wVar, c4);
            int i8 = i4 + i7;
            if (z3 && (i5 = this.f17558u.i() - i8) > 0) {
                this.f17558u.t(i5);
                return i5 + i7;
            }
            return i7;
        }
        return 0;
    }

    private int H2(int i4, RecyclerView.w wVar, RecyclerView.C c4, boolean z3) {
        int n4;
        int n5 = i4 - this.f17558u.n();
        if (n5 > 0) {
            int i5 = -c3(n5, wVar, c4);
            int i6 = i4 + i5;
            if (z3 && (n4 = i6 - this.f17558u.n()) > 0) {
                this.f17558u.t(-n4);
                return i5 - n4;
            }
            return i5;
        }
        return 0;
    }

    private View I2() {
        int Q3;
        if (this.f17561x) {
            Q3 = 0;
        } else {
            Q3 = Q() - 1;
        }
        return P(Q3);
    }

    private View J2() {
        int i4;
        if (this.f17561x) {
            i4 = Q() - 1;
        } else {
            i4 = 0;
        }
        return P(i4);
    }

    private void T2(RecyclerView.w wVar, RecyclerView.C c4, int i4, int i5) {
        boolean z3;
        if (c4.n() && Q() != 0 && !c4.j() && j2()) {
            List<RecyclerView.F> l4 = wVar.l();
            int size = l4.size();
            int s02 = s0(P(0));
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView.F f4 = l4.get(i8);
                if (!f4.z()) {
                    if (f4.p() < s02) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 != this.f17561x) {
                        i6 += this.f17558u.e(f4.f17770a);
                    } else {
                        i7 += this.f17558u.e(f4.f17770a);
                    }
                }
            }
            this.f17557t.f17591l = l4;
            if (i6 > 0) {
                q3(s0(J2()), i4);
                c cVar = this.f17557t;
                cVar.f17587h = i6;
                cVar.f17582c = 0;
                cVar.a();
                s2(wVar, this.f17557t, c4, false);
            }
            if (i7 > 0) {
                o3(s0(I2()), i5);
                c cVar2 = this.f17557t;
                cVar2.f17587h = i7;
                cVar2.f17582c = 0;
                cVar2.a();
                s2(wVar, this.f17557t, c4, false);
            }
            this.f17557t.f17591l = null;
        }
    }

    private void U2() {
        Log.d(f17542I, "internal representation of views on the screen");
        for (int i4 = 0; i4 < Q(); i4++) {
            View P3 = P(i4);
            Log.d(f17542I, "item " + s0(P3) + ", coord:" + this.f17558u.g(P3));
        }
        Log.d(f17542I, "==============");
    }

    private void W2(RecyclerView.w wVar, c cVar) {
        if (cVar.f17580a && !cVar.f17592m) {
            int i4 = cVar.f17586g;
            int i5 = cVar.f17588i;
            if (cVar.f17585f == -1) {
                Y2(wVar, i4, i5);
            } else {
                Z2(wVar, i4, i5);
            }
        }
    }

    private void X2(RecyclerView.w wVar, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 > i4) {
            for (int i6 = i5 - 1; i6 >= i4; i6--) {
                G1(i6, wVar);
            }
            return;
        }
        while (i4 > i5) {
            G1(i4, wVar);
            i4--;
        }
    }

    private void Y2(RecyclerView.w wVar, int i4, int i5) {
        int Q3 = Q();
        if (i4 < 0) {
            return;
        }
        int h4 = (this.f17558u.h() - i4) + i5;
        if (this.f17561x) {
            for (int i6 = 0; i6 < Q3; i6++) {
                View P3 = P(i6);
                if (this.f17558u.g(P3) < h4 || this.f17558u.r(P3) < h4) {
                    X2(wVar, 0, i6);
                    return;
                }
            }
            return;
        }
        int i7 = Q3 - 1;
        for (int i8 = i7; i8 >= 0; i8--) {
            View P4 = P(i8);
            if (this.f17558u.g(P4) < h4 || this.f17558u.r(P4) < h4) {
                X2(wVar, i7, i8);
                return;
            }
        }
    }

    private void Z2(RecyclerView.w wVar, int i4, int i5) {
        if (i4 < 0) {
            return;
        }
        int i6 = i4 - i5;
        int Q3 = Q();
        if (this.f17561x) {
            int i7 = Q3 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View P3 = P(i8);
                if (this.f17558u.d(P3) > i6 || this.f17558u.q(P3) > i6) {
                    X2(wVar, i7, i8);
                    return;
                }
            }
            return;
        }
        for (int i9 = 0; i9 < Q3; i9++) {
            View P4 = P(i9);
            if (this.f17558u.d(P4) > i6 || this.f17558u.q(P4) > i6) {
                X2(wVar, 0, i9);
                return;
            }
        }
    }

    private void b3() {
        if (this.f17556s != 1 && Q2()) {
            this.f17561x = !this.f17560w;
        } else {
            this.f17561x = this.f17560w;
        }
    }

    private boolean k3(RecyclerView.w wVar, RecyclerView.C c4, a aVar) {
        View F22;
        boolean z3;
        boolean z4 = false;
        if (Q() == 0) {
            return false;
        }
        View d02 = d0();
        if (d02 != null && aVar.d(d02, c4)) {
            aVar.c(d02, s0(d02));
            return true;
        }
        boolean z5 = this.f17559v;
        boolean z6 = this.f17562y;
        if (z5 != z6 || (F22 = F2(wVar, c4, aVar.f17567d, z6)) == null) {
            return false;
        }
        aVar.b(F22, s0(F22));
        if (!c4.j() && j2()) {
            int g4 = this.f17558u.g(F22);
            int d4 = this.f17558u.d(F22);
            int n4 = this.f17558u.n();
            int i4 = this.f17558u.i();
            if (d4 <= n4 && g4 < n4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g4 >= i4 && d4 > i4) {
                z4 = true;
            }
            if (z3 || z4) {
                if (aVar.f17567d) {
                    n4 = i4;
                }
                aVar.f17566c = n4;
            }
        }
        return true;
    }

    private boolean l3(RecyclerView.C c4, a aVar) {
        int i4;
        boolean z3;
        int g4;
        boolean z4 = false;
        if (!c4.j() && (i4 = this.f17548A) != -1) {
            if (i4 >= 0 && i4 < c4.d()) {
                aVar.f17565b = this.f17548A;
                d dVar = this.f17551D;
                if (dVar != null && dVar.a()) {
                    boolean z5 = this.f17551D.f17595G;
                    aVar.f17567d = z5;
                    if (z5) {
                        aVar.f17566c = this.f17558u.i() - this.f17551D.f17594F;
                    } else {
                        aVar.f17566c = this.f17558u.n() + this.f17551D.f17594F;
                    }
                    return true;
                }
                if (this.f17549B == Integer.MIN_VALUE) {
                    View J3 = J(this.f17548A);
                    if (J3 != null) {
                        if (this.f17558u.e(J3) > this.f17558u.o()) {
                            aVar.a();
                            return true;
                        }
                        if (this.f17558u.g(J3) - this.f17558u.n() < 0) {
                            aVar.f17566c = this.f17558u.n();
                            aVar.f17567d = false;
                            return true;
                        }
                        if (this.f17558u.i() - this.f17558u.d(J3) < 0) {
                            aVar.f17566c = this.f17558u.i();
                            aVar.f17567d = true;
                            return true;
                        }
                        if (aVar.f17567d) {
                            g4 = this.f17558u.d(J3) + this.f17558u.p();
                        } else {
                            g4 = this.f17558u.g(J3);
                        }
                        aVar.f17566c = g4;
                    } else {
                        if (Q() > 0) {
                            if (this.f17548A < s0(P(0))) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 == this.f17561x) {
                                z4 = true;
                            }
                            aVar.f17567d = z4;
                        }
                        aVar.a();
                    }
                    return true;
                }
                boolean z6 = this.f17561x;
                aVar.f17567d = z6;
                if (z6) {
                    aVar.f17566c = this.f17558u.i() - this.f17549B;
                } else {
                    aVar.f17566c = this.f17558u.n() + this.f17549B;
                }
                return true;
            }
            this.f17548A = -1;
            this.f17549B = Integer.MIN_VALUE;
        }
        return false;
    }

    private int m2(RecyclerView.C c4) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return B.a(c4, this.f17558u, w2(!this.f17563z, true), v2(!this.f17563z, true), this, this.f17563z);
    }

    private void m3(RecyclerView.w wVar, RecyclerView.C c4, a aVar) {
        int i4;
        if (l3(c4, aVar) || k3(wVar, c4, aVar)) {
            return;
        }
        aVar.a();
        if (this.f17562y) {
            i4 = c4.d() - 1;
        } else {
            i4 = 0;
        }
        aVar.f17565b = i4;
    }

    private int n2(RecyclerView.C c4) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return B.b(c4, this.f17558u, w2(!this.f17563z, true), v2(!this.f17563z, true), this, this.f17563z, this.f17561x);
    }

    private void n3(int i4, int i5, boolean z3, RecyclerView.C c4) {
        int i6;
        int n4;
        this.f17557t.f17592m = a3();
        this.f17557t.f17585f = i4;
        int[] iArr = this.f17555H;
        boolean z4 = false;
        iArr[0] = 0;
        int i7 = 1;
        iArr[1] = 0;
        k2(c4, iArr);
        int max = Math.max(0, this.f17555H[0]);
        int max2 = Math.max(0, this.f17555H[1]);
        if (i4 == 1) {
            z4 = true;
        }
        c cVar = this.f17557t;
        if (z4) {
            i6 = max2;
        } else {
            i6 = max;
        }
        cVar.f17587h = i6;
        if (!z4) {
            max = max2;
        }
        cVar.f17588i = max;
        if (z4) {
            cVar.f17587h = i6 + this.f17558u.j();
            View I22 = I2();
            c cVar2 = this.f17557t;
            if (this.f17561x) {
                i7 = -1;
            }
            cVar2.f17584e = i7;
            int s02 = s0(I22);
            c cVar3 = this.f17557t;
            cVar2.f17583d = s02 + cVar3.f17584e;
            cVar3.f17581b = this.f17558u.d(I22);
            n4 = this.f17558u.d(I22) - this.f17558u.i();
        } else {
            View J22 = J2();
            this.f17557t.f17587h += this.f17558u.n();
            c cVar4 = this.f17557t;
            if (!this.f17561x) {
                i7 = -1;
            }
            cVar4.f17584e = i7;
            int s03 = s0(J22);
            c cVar5 = this.f17557t;
            cVar4.f17583d = s03 + cVar5.f17584e;
            cVar5.f17581b = this.f17558u.g(J22);
            n4 = (-this.f17558u.g(J22)) + this.f17558u.n();
        }
        c cVar6 = this.f17557t;
        cVar6.f17582c = i5;
        if (z3) {
            cVar6.f17582c = i5 - n4;
        }
        cVar6.f17586g = n4;
    }

    private int o2(RecyclerView.C c4) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return B.c(c4, this.f17558u, w2(!this.f17563z, true), v2(!this.f17563z, true), this, this.f17563z);
    }

    private void o3(int i4, int i5) {
        int i6;
        this.f17557t.f17582c = this.f17558u.i() - i5;
        c cVar = this.f17557t;
        if (this.f17561x) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        cVar.f17584e = i6;
        cVar.f17583d = i4;
        cVar.f17585f = 1;
        cVar.f17581b = i5;
        cVar.f17586g = Integer.MIN_VALUE;
    }

    private void p3(a aVar) {
        o3(aVar.f17565b, aVar.f17566c);
    }

    private void q3(int i4, int i5) {
        int i6;
        this.f17557t.f17582c = i5 - this.f17558u.n();
        c cVar = this.f17557t;
        cVar.f17583d = i4;
        if (this.f17561x) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        cVar.f17584e = i6;
        cVar.f17585f = -1;
        cVar.f17581b = i5;
        cVar.f17586g = Integer.MIN_VALUE;
    }

    private void r3(a aVar) {
        q3(aVar.f17565b, aVar.f17566c);
    }

    private View u2() {
        return B2(0, Q());
    }

    private View z2() {
        return B2(Q() - 1, -1);
    }

    public int A2() {
        View C22 = C2(Q() - 1, -1, false, true);
        if (C22 == null) {
            return -1;
        }
        return s0(C22);
    }

    View B2(int i4, int i5) {
        int i6;
        int i7;
        r2();
        if (i5 > i4 || i5 < i4) {
            if (this.f17558u.g(P(i4)) < this.f17558u.n()) {
                i6 = 16644;
                i7 = 16388;
            } else {
                i6 = 4161;
                i7 = androidx.fragment.app.F.f14939I;
            }
            if (this.f17556s == 0) {
                return this.f17820e.a(i4, i5, i6, i7);
            }
            return this.f17821f.a(i4, i5, i6, i7);
        }
        return P(i4);
    }

    View C2(int i4, int i5, boolean z3, boolean z4) {
        int i6;
        r2();
        int i7 = 320;
        if (z3) {
            i6 = 24579;
        } else {
            i6 = 320;
        }
        if (!z4) {
            i7 = 0;
        }
        if (this.f17556s == 0) {
            return this.f17820e.a(i4, i5, i6, i7);
        }
        return this.f17821f.a(i4, i5, i6, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F0() {
        return true;
    }

    View F2(RecyclerView.w wVar, RecyclerView.C c4, boolean z3, boolean z4) {
        int i4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        r2();
        int Q3 = Q();
        if (z4) {
            i5 = Q() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = Q3;
            i5 = 0;
            i6 = 1;
        }
        int d4 = c4.d();
        int n4 = this.f17558u.n();
        int i7 = this.f17558u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i5 != i4) {
            View P3 = P(i5);
            int s02 = s0(P3);
            int g4 = this.f17558u.g(P3);
            int d5 = this.f17558u.d(P3);
            if (s02 >= 0 && s02 < d4) {
                if (((RecyclerView.p) P3.getLayoutParams()).g()) {
                    if (view3 == null) {
                        view3 = P3;
                    }
                } else {
                    if (d5 <= n4 && g4 < n4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (g4 >= i7 && d5 > i7) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z5 && !z6) {
                        return P3;
                    }
                    if (z3) {
                        if (!z6) {
                            if (view != null) {
                            }
                            view = P3;
                        }
                        view2 = P3;
                    } else {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = P3;
                        }
                        view2 = P3;
                    }
                }
            }
            i5 += i6;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J(int i4) {
        int Q3 = Q();
        if (Q3 == 0) {
            return null;
        }
        int s02 = i4 - s0(P(0));
        if (s02 >= 0 && s02 < Q3) {
            View P3 = P(s02);
            if (s0(P3) == i4) {
                return P3;
            }
        }
        return super.J(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        return new RecyclerView.p(-2, -2);
    }

    @Deprecated
    protected int K2(RecyclerView.C c4) {
        if (c4.h()) {
            return this.f17558u.o();
        }
        return 0;
    }

    public int L2() {
        return this.f17554G;
    }

    public int M2() {
        return this.f17556s;
    }

    public boolean N2() {
        return this.f17550C;
    }

    public boolean O2() {
        return this.f17560w;
    }

    public boolean P2() {
        return this.f17562y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        if (this.f17556s == 1) {
            return 0;
        }
        return c3(i4, wVar, c4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Q2() {
        if (i0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(int i4) {
        this.f17548A = i4;
        this.f17549B = Integer.MIN_VALUE;
        d dVar = this.f17551D;
        if (dVar != null) {
            dVar.b();
        }
        N1();
    }

    public boolean R2() {
        return this.f17563z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S1(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        if (this.f17556s == 0) {
            return 0;
        }
        return c3(i4, wVar, c4);
    }

    void S2(RecyclerView.w wVar, RecyclerView.C c4, c cVar, b bVar) {
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int f4;
        boolean z4;
        View e4 = cVar.e(wVar);
        if (e4 == null) {
            bVar.f17570b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) e4.getLayoutParams();
        if (cVar.f17591l == null) {
            boolean z5 = this.f17561x;
            if (cVar.f17585f == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z5 == z4) {
                e(e4);
            } else {
                f(e4, 0);
            }
        } else {
            boolean z6 = this.f17561x;
            if (cVar.f17585f == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z6 == z3) {
                c(e4);
            } else {
                d(e4, 0);
            }
        }
        R0(e4, 0, 0);
        bVar.f17569a = this.f17558u.e(e4);
        if (this.f17556s == 1) {
            if (Q2()) {
                f4 = z0() - p0();
                i7 = f4 - this.f17558u.f(e4);
            } else {
                i7 = o0();
                f4 = this.f17558u.f(e4) + i7;
            }
            if (cVar.f17585f == -1) {
                int i8 = cVar.f17581b;
                i6 = i8;
                i5 = f4;
                i4 = i8 - bVar.f17569a;
            } else {
                int i9 = cVar.f17581b;
                i4 = i9;
                i5 = f4;
                i6 = bVar.f17569a + i9;
            }
        } else {
            int r02 = r0();
            int f5 = this.f17558u.f(e4) + r02;
            if (cVar.f17585f == -1) {
                int i10 = cVar.f17581b;
                i5 = i10;
                i4 = r02;
                i6 = f5;
                i7 = i10 - bVar.f17569a;
            } else {
                int i11 = cVar.f17581b;
                i4 = r02;
                i5 = bVar.f17569a + i11;
                i6 = f5;
                i7 = i11;
            }
        }
        P0(e4, i7, i4, i5, i6);
        if (pVar.g() || pVar.f()) {
            bVar.f17571c = true;
        }
        bVar.f17572d = e4.hasFocusable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V2(RecyclerView.w wVar, RecyclerView.C c4, a aVar, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        if (this.f17550C) {
            D1(wVar);
            wVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B.b
    public PointF a(int i4) {
        if (Q() == 0) {
            return null;
        }
        boolean z3 = false;
        int i5 = 1;
        if (i4 < s0(P(0))) {
            z3 = true;
        }
        if (z3 != this.f17561x) {
            i5 = -1;
        }
        if (this.f17556s == 0) {
            return new PointF(i5, 0.0f);
        }
        return new PointF(0.0f, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a1(View view, int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        int p22;
        View D22;
        View I22;
        b3();
        if (Q() == 0 || (p22 = p2(i4)) == Integer.MIN_VALUE) {
            return null;
        }
        r2();
        n3(p22, (int) (this.f17558u.o() * f17547N), false, c4);
        c cVar = this.f17557t;
        cVar.f17586g = Integer.MIN_VALUE;
        cVar.f17580a = false;
        s2(wVar, cVar, c4, true);
        if (p22 == -1) {
            D22 = E2();
        } else {
            D22 = D2();
        }
        if (p22 == -1) {
            I22 = J2();
        } else {
            I22 = I2();
        }
        if (I22.hasFocusable()) {
            if (D22 == null) {
                return null;
            }
            return I22;
        }
        return D22;
    }

    boolean a3() {
        if (this.f17558u.l() == 0 && this.f17558u.h() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.j
    public void b(@N View view, @N View view2, int i4, int i5) {
        char c4;
        i("Cannot drop a view during a scroll or layout calculation");
        r2();
        b3();
        int s02 = s0(view);
        int s03 = s0(view2);
        if (s02 < s03) {
            c4 = 1;
        } else {
            c4 = 65535;
        }
        if (this.f17561x) {
            if (c4 == 1) {
                d3(s03, this.f17558u.i() - (this.f17558u.g(view2) + this.f17558u.e(view)));
                return;
            } else {
                d3(s03, this.f17558u.i() - this.f17558u.d(view2));
                return;
            }
        }
        if (c4 == 65535) {
            d3(s03, this.f17558u.g(view2));
        } else {
            d3(s03, this.f17558u.d(view2) - this.f17558u.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            accessibilityEvent.setFromIndex(x2());
            accessibilityEvent.setToIndex(A2());
        }
    }

    int c3(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        int i5;
        if (Q() == 0 || i4 == 0) {
            return 0;
        }
        r2();
        this.f17557t.f17580a = true;
        if (i4 > 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int abs = Math.abs(i4);
        n3(i5, abs, true, c4);
        c cVar = this.f17557t;
        int s22 = cVar.f17586g + s2(wVar, cVar, c4, false);
        if (s22 < 0) {
            return 0;
        }
        if (abs > s22) {
            i4 = i5 * s22;
        }
        this.f17558u.t(-i4);
        this.f17557t.f17590k = i4;
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean d2() {
        if (f0() != 1073741824 && A0() != 1073741824 && B0()) {
            return true;
        }
        return false;
    }

    public void d3(int i4, int i5) {
        this.f17548A = i4;
        this.f17549B = i5;
        d dVar = this.f17551D;
        if (dVar != null) {
            dVar.b();
        }
        N1();
    }

    public void e3(int i4) {
        this.f17554G = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.C c4, int i4) {
        r rVar = new r(recyclerView.getContext());
        rVar.q(i4);
        g2(rVar);
    }

    public void f3(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i4);
        }
        i(null);
        if (i4 != this.f17556s || this.f17558u == null) {
            y b4 = y.b(this, i4);
            this.f17558u = b4;
            this.f17552E.f17564a = b4;
            this.f17556s = i4;
            N1();
        }
    }

    public void g3(boolean z3) {
        this.f17550C = z3;
    }

    public void h3(boolean z3) {
        i(null);
        if (z3 == this.f17560w) {
            return;
        }
        this.f17560w = z3;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(String str) {
        if (this.f17551D == null) {
            super.i(str);
        }
    }

    public void i3(boolean z3) {
        this.f17563z = z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        if (this.f17551D == null && this.f17559v == this.f17562y) {
            return true;
        }
        return false;
    }

    public void j3(boolean z3) {
        i(null);
        if (this.f17562y == z3) {
            return;
        }
        this.f17562y = z3;
        N1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k2(@N RecyclerView.C c4, @N int[] iArr) {
        int i4;
        int K22 = K2(c4);
        if (this.f17557t.f17585f == -1) {
            i4 = 0;
        } else {
            i4 = K22;
            K22 = 0;
        }
        iArr[0] = K22;
        iArr[1] = i4;
    }

    void l2(RecyclerView.C c4, c cVar, RecyclerView.o.c cVar2) {
        int i4 = cVar.f17583d;
        if (i4 >= 0 && i4 < c4.d()) {
            cVar2.a(i4, Math.max(0, cVar.f17586g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n() {
        if (this.f17556s == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean o() {
        if (this.f17556s == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.C c4) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int G22;
        int i9;
        View J3;
        int g4;
        int i10;
        int i11 = -1;
        if ((this.f17551D != null || this.f17548A != -1) && c4.d() == 0) {
            D1(wVar);
            return;
        }
        d dVar = this.f17551D;
        if (dVar != null && dVar.a()) {
            this.f17548A = this.f17551D.f17593E;
        }
        r2();
        this.f17557t.f17580a = false;
        b3();
        View d02 = d0();
        a aVar = this.f17552E;
        if (aVar.f17568e && this.f17548A == -1 && this.f17551D == null) {
            if (d02 != null && (this.f17558u.g(d02) >= this.f17558u.i() || this.f17558u.d(d02) <= this.f17558u.n())) {
                this.f17552E.c(d02, s0(d02));
            }
        } else {
            aVar.e();
            a aVar2 = this.f17552E;
            aVar2.f17567d = this.f17561x ^ this.f17562y;
            m3(wVar, c4, aVar2);
            this.f17552E.f17568e = true;
        }
        c cVar = this.f17557t;
        if (cVar.f17590k >= 0) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        cVar.f17585f = i4;
        int[] iArr = this.f17555H;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(c4, iArr);
        int max = Math.max(0, this.f17555H[0]) + this.f17558u.n();
        int max2 = Math.max(0, this.f17555H[1]) + this.f17558u.j();
        if (c4.j() && (i9 = this.f17548A) != -1 && this.f17549B != Integer.MIN_VALUE && (J3 = J(i9)) != null) {
            if (this.f17561x) {
                i10 = this.f17558u.i() - this.f17558u.d(J3);
                g4 = this.f17549B;
            } else {
                g4 = this.f17558u.g(J3) - this.f17558u.n();
                i10 = this.f17549B;
            }
            int i12 = i10 - g4;
            if (i12 > 0) {
                max += i12;
            } else {
                max2 -= i12;
            }
        }
        a aVar3 = this.f17552E;
        if (!aVar3.f17567d ? !this.f17561x : this.f17561x) {
            i11 = 1;
        }
        V2(wVar, c4, aVar3, i11);
        z(wVar);
        this.f17557t.f17592m = a3();
        this.f17557t.f17589j = c4.j();
        this.f17557t.f17588i = 0;
        a aVar4 = this.f17552E;
        if (aVar4.f17567d) {
            r3(aVar4);
            c cVar2 = this.f17557t;
            cVar2.f17587h = max;
            s2(wVar, cVar2, c4, false);
            c cVar3 = this.f17557t;
            i6 = cVar3.f17581b;
            int i13 = cVar3.f17583d;
            int i14 = cVar3.f17582c;
            if (i14 > 0) {
                max2 += i14;
            }
            p3(this.f17552E);
            c cVar4 = this.f17557t;
            cVar4.f17587h = max2;
            cVar4.f17583d += cVar4.f17584e;
            s2(wVar, cVar4, c4, false);
            c cVar5 = this.f17557t;
            i5 = cVar5.f17581b;
            int i15 = cVar5.f17582c;
            if (i15 > 0) {
                q3(i13, i6);
                c cVar6 = this.f17557t;
                cVar6.f17587h = i15;
                s2(wVar, cVar6, c4, false);
                i6 = this.f17557t.f17581b;
            }
        } else {
            p3(aVar4);
            c cVar7 = this.f17557t;
            cVar7.f17587h = max2;
            s2(wVar, cVar7, c4, false);
            c cVar8 = this.f17557t;
            i5 = cVar8.f17581b;
            int i16 = cVar8.f17583d;
            int i17 = cVar8.f17582c;
            if (i17 > 0) {
                max += i17;
            }
            r3(this.f17552E);
            c cVar9 = this.f17557t;
            cVar9.f17587h = max;
            cVar9.f17583d += cVar9.f17584e;
            s2(wVar, cVar9, c4, false);
            c cVar10 = this.f17557t;
            i6 = cVar10.f17581b;
            int i18 = cVar10.f17582c;
            if (i18 > 0) {
                o3(i16, i5);
                c cVar11 = this.f17557t;
                cVar11.f17587h = i18;
                s2(wVar, cVar11, c4, false);
                i5 = this.f17557t.f17581b;
            }
        }
        if (Q() > 0) {
            if (this.f17561x ^ this.f17562y) {
                int G23 = G2(i5, wVar, c4, true);
                i7 = i6 + G23;
                i8 = i5 + G23;
                G22 = H2(i7, wVar, c4, false);
            } else {
                int H22 = H2(i6, wVar, c4, true);
                i7 = i6 + H22;
                i8 = i5 + H22;
                G22 = G2(i8, wVar, c4, false);
            }
            i6 = i7 + G22;
            i5 = i8 + G22;
        }
        T2(wVar, c4, i6, i5);
        if (!c4.j()) {
            this.f17558u.u();
        } else {
            this.f17552E.e();
        }
        this.f17559v = this.f17562y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.C c4) {
        super.p1(c4);
        this.f17551D = null;
        this.f17548A = -1;
        this.f17549B = Integer.MIN_VALUE;
        this.f17552E.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p2(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130 && this.f17556s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f17556s == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f17556s == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f17556s == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f17556s != 1 && Q2()) {
                return -1;
            }
            return 1;
        }
        if (this.f17556s == 1 || !Q2()) {
            return -1;
        }
        return 1;
    }

    c q2() {
        return new c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void r(int i4, int i5, RecyclerView.C c4, RecyclerView.o.c cVar) {
        int i6;
        if (this.f17556s != 0) {
            i4 = i5;
        }
        if (Q() != 0 && i4 != 0) {
            r2();
            if (i4 > 0) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            n3(i6, Math.abs(i4), true, c4);
            l2(c4, this.f17557t, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r2() {
        if (this.f17557t == null) {
            this.f17557t = q2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void s(int i4, RecyclerView.o.c cVar) {
        boolean z3;
        int i5;
        d dVar = this.f17551D;
        int i6 = -1;
        if (dVar != null && dVar.a()) {
            d dVar2 = this.f17551D;
            z3 = dVar2.f17595G;
            i5 = dVar2.f17593E;
        } else {
            b3();
            z3 = this.f17561x;
            i5 = this.f17548A;
            if (i5 == -1) {
                i5 = z3 ? i4 - 1 : 0;
            }
        }
        if (!z3) {
            i6 = 1;
        }
        for (int i7 = 0; i7 < this.f17554G && i5 >= 0 && i5 < i4; i7++) {
            cVar.a(i5, 0);
            i5 += i6;
        }
    }

    int s2(RecyclerView.w wVar, c cVar, RecyclerView.C c4, boolean z3) {
        int i4 = cVar.f17582c;
        int i5 = cVar.f17586g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                cVar.f17586g = i5 + i4;
            }
            W2(wVar, cVar);
        }
        int i6 = cVar.f17582c + cVar.f17587h;
        b bVar = this.f17553F;
        while (true) {
            if ((!cVar.f17592m && i6 <= 0) || !cVar.c(c4)) {
                break;
            }
            bVar.a();
            S2(wVar, c4, cVar, bVar);
            if (!bVar.f17570b) {
                cVar.f17581b += bVar.f17569a * cVar.f17585f;
                if (!bVar.f17571c || cVar.f17591l != null || !c4.j()) {
                    int i7 = cVar.f17582c;
                    int i8 = bVar.f17569a;
                    cVar.f17582c = i7 - i8;
                    i6 -= i8;
                }
                int i9 = cVar.f17586g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + bVar.f17569a;
                    cVar.f17586g = i10;
                    int i11 = cVar.f17582c;
                    if (i11 < 0) {
                        cVar.f17586g = i10 + i11;
                    }
                    W2(wVar, cVar);
                }
                if (z3 && bVar.f17572d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - cVar.f17582c;
    }

    void s3() {
        Log.d(f17542I, "validating child count " + Q());
        boolean z3 = true;
        if (Q() < 1) {
            return;
        }
        int s02 = s0(P(0));
        int g4 = this.f17558u.g(P(0));
        if (this.f17561x) {
            for (int i4 = 1; i4 < Q(); i4++) {
                View P3 = P(i4);
                int s03 = s0(P3);
                int g5 = this.f17558u.g(P3);
                if (s03 < s02) {
                    U2();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    if (g5 >= g4) {
                        z3 = false;
                    }
                    sb.append(z3);
                    throw new RuntimeException(sb.toString());
                }
                if (g5 > g4) {
                    U2();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i5 = 1; i5 < Q(); i5++) {
            View P4 = P(i5);
            int s04 = s0(P4);
            int g6 = this.f17558u.g(P4);
            if (s04 < s02) {
                U2();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                if (g6 >= g4) {
                    z3 = false;
                }
                sb2.append(z3);
                throw new RuntimeException(sb2.toString());
            }
            if (g6 < g4) {
                U2();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.C c4) {
        return m2(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f17551D = dVar;
            if (this.f17548A != -1) {
                dVar.b();
            }
            N1();
        }
    }

    public int t2() {
        View C22 = C2(0, Q(), true, false);
        if (C22 == null) {
            return -1;
        }
        return s0(C22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.C c4) {
        return n2(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable u1() {
        if (this.f17551D != null) {
            return new d(this.f17551D);
        }
        d dVar = new d();
        if (Q() > 0) {
            r2();
            boolean z3 = this.f17559v ^ this.f17561x;
            dVar.f17595G = z3;
            if (z3) {
                View I22 = I2();
                dVar.f17594F = this.f17558u.i() - this.f17558u.d(I22);
                dVar.f17593E = s0(I22);
            } else {
                View J22 = J2();
                dVar.f17593E = s0(J22);
                dVar.f17594F = this.f17558u.g(J22) - this.f17558u.n();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.C c4) {
        return o2(c4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View v2(boolean z3, boolean z4) {
        if (this.f17561x) {
            return C2(0, Q(), z3, z4);
        }
        return C2(Q() - 1, -1, z3, z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.C c4) {
        return m2(c4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View w2(boolean z3, boolean z4) {
        if (this.f17561x) {
            return C2(Q() - 1, -1, z3, z4);
        }
        return C2(0, Q(), z3, z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.C c4) {
        return n2(c4);
    }

    public int x2() {
        View C22 = C2(0, Q(), false, true);
        if (C22 == null) {
            return -1;
        }
        return s0(C22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.C c4) {
        return o2(c4);
    }

    public int y2() {
        View C22 = C2(Q() - 1, -1, true, false);
        if (C22 == null) {
            return -1;
        }
        return s0(C22);
    }

    public LinearLayoutManager(Context context, int i4, boolean z3) {
        this.f17556s = 1;
        this.f17560w = false;
        this.f17561x = false;
        this.f17562y = false;
        this.f17563z = true;
        this.f17548A = -1;
        this.f17549B = Integer.MIN_VALUE;
        this.f17551D = null;
        this.f17552E = new a();
        this.f17553F = new b();
        this.f17554G = 2;
        this.f17555H = new int[2];
        f3(i4);
        h3(z3);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f17556s = 1;
        this.f17560w = false;
        this.f17561x = false;
        this.f17562y = false;
        this.f17563z = true;
        this.f17548A = -1;
        this.f17549B = Integer.MIN_VALUE;
        this.f17551D = null;
        this.f17552E = new a();
        this.f17553F = new b();
        this.f17554G = 2;
        this.f17555H = new int[2];
        RecyclerView.o.d t02 = RecyclerView.o.t0(context, attributeSet, i4, i5);
        f3(t02.f17836a);
        h3(t02.f17838c);
        j3(t02.f17839d);
    }
}
