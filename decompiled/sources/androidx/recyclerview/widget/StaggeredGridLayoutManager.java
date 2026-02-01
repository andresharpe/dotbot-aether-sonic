package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.B.b {

    /* renamed from: Q, reason: collision with root package name */
    private static final String f17863Q = "StaggeredGridLManager";

    /* renamed from: R, reason: collision with root package name */
    static final boolean f17864R = false;

    /* renamed from: S, reason: collision with root package name */
    public static final int f17865S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static final int f17866T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final int f17867U = 0;

    /* renamed from: V, reason: collision with root package name */
    @Deprecated
    public static final int f17868V = 1;

    /* renamed from: W, reason: collision with root package name */
    public static final int f17869W = 2;

    /* renamed from: X, reason: collision with root package name */
    static final int f17870X = Integer.MIN_VALUE;

    /* renamed from: Y, reason: collision with root package name */
    private static final float f17871Y = 0.33333334f;

    /* renamed from: B, reason: collision with root package name */
    private BitSet f17873B;

    /* renamed from: G, reason: collision with root package name */
    private boolean f17878G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f17879H;

    /* renamed from: I, reason: collision with root package name */
    private e f17880I;

    /* renamed from: J, reason: collision with root package name */
    private int f17881J;

    /* renamed from: O, reason: collision with root package name */
    private int[] f17886O;

    /* renamed from: t, reason: collision with root package name */
    f[] f17889t;

    /* renamed from: u, reason: collision with root package name */
    @N
    y f17890u;

    /* renamed from: v, reason: collision with root package name */
    @N
    y f17891v;

    /* renamed from: w, reason: collision with root package name */
    private int f17892w;

    /* renamed from: x, reason: collision with root package name */
    private int f17893x;

    /* renamed from: y, reason: collision with root package name */
    @N
    private final q f17894y;

    /* renamed from: s, reason: collision with root package name */
    private int f17888s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f17895z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f17872A = false;

    /* renamed from: C, reason: collision with root package name */
    int f17874C = -1;

    /* renamed from: D, reason: collision with root package name */
    int f17875D = Integer.MIN_VALUE;

    /* renamed from: E, reason: collision with root package name */
    d f17876E = new d();

    /* renamed from: F, reason: collision with root package name */
    private int f17877F = 2;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f17882K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    private final b f17883L = new b();

    /* renamed from: M, reason: collision with root package name */
    private boolean f17884M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f17885N = true;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f17887P = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        int f17897a;

        /* renamed from: b, reason: collision with root package name */
        int f17898b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17899c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17900d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17901e;

        /* renamed from: f, reason: collision with root package name */
        int[] f17902f;

        b() {
            c();
        }

        void a() {
            int n4;
            if (this.f17899c) {
                n4 = StaggeredGridLayoutManager.this.f17890u.i();
            } else {
                n4 = StaggeredGridLayoutManager.this.f17890u.n();
            }
            this.f17898b = n4;
        }

        void b(int i4) {
            if (this.f17899c) {
                this.f17898b = StaggeredGridLayoutManager.this.f17890u.i() - i4;
            } else {
                this.f17898b = StaggeredGridLayoutManager.this.f17890u.n() + i4;
            }
        }

        void c() {
            this.f17897a = -1;
            this.f17898b = Integer.MIN_VALUE;
            this.f17899c = false;
            this.f17900d = false;
            this.f17901e = false;
            int[] iArr = this.f17902f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f17902f;
            if (iArr == null || iArr.length < length) {
                this.f17902f = new int[StaggeredGridLayoutManager.this.f17889t.length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                this.f17902f[i4] = fVarArr[i4].u(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: g, reason: collision with root package name */
        public static final int f17904g = -1;

        /* renamed from: e, reason: collision with root package name */
        f f17905e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17906f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int j() {
            f fVar = this.f17905e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f17929e;
        }

        public boolean k() {
            return this.f17906f;
        }

        public void l(boolean z3) {
            this.f17906f = z3;
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(RecyclerView.p pVar) {
            super(pVar);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        int f17914E;

        /* renamed from: F, reason: collision with root package name */
        int f17915F;

        /* renamed from: G, reason: collision with root package name */
        int f17916G;

        /* renamed from: H, reason: collision with root package name */
        int[] f17917H;

        /* renamed from: I, reason: collision with root package name */
        int f17918I;

        /* renamed from: J, reason: collision with root package name */
        int[] f17919J;

        /* renamed from: K, reason: collision with root package name */
        List<d.a> f17920K;

        /* renamed from: L, reason: collision with root package name */
        boolean f17921L;

        /* renamed from: M, reason: collision with root package name */
        boolean f17922M;

        /* renamed from: N, reason: collision with root package name */
        boolean f17923N;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i4) {
                return new e[i4];
            }
        }

        public e() {
        }

        void a() {
            this.f17917H = null;
            this.f17916G = 0;
            this.f17914E = -1;
            this.f17915F = -1;
        }

        void b() {
            this.f17917H = null;
            this.f17916G = 0;
            this.f17918I = 0;
            this.f17919J = null;
            this.f17920K = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f17914E);
            parcel.writeInt(this.f17915F);
            parcel.writeInt(this.f17916G);
            if (this.f17916G > 0) {
                parcel.writeIntArray(this.f17917H);
            }
            parcel.writeInt(this.f17918I);
            if (this.f17918I > 0) {
                parcel.writeIntArray(this.f17919J);
            }
            parcel.writeInt(this.f17921L ? 1 : 0);
            parcel.writeInt(this.f17922M ? 1 : 0);
            parcel.writeInt(this.f17923N ? 1 : 0);
            parcel.writeList(this.f17920K);
        }

        e(Parcel parcel) {
            this.f17914E = parcel.readInt();
            this.f17915F = parcel.readInt();
            int readInt = parcel.readInt();
            this.f17916G = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f17917H = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f17918I = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f17919J = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f17921L = parcel.readInt() == 1;
            this.f17922M = parcel.readInt() == 1;
            this.f17923N = parcel.readInt() == 1;
            this.f17920K = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f17916G = eVar.f17916G;
            this.f17914E = eVar.f17914E;
            this.f17915F = eVar.f17915F;
            this.f17917H = eVar.f17917H;
            this.f17918I = eVar.f17918I;
            this.f17919J = eVar.f17919J;
            this.f17921L = eVar.f17921L;
            this.f17922M = eVar.f17922M;
            this.f17923N = eVar.f17923N;
            this.f17920K = eVar.f17920K;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f {

        /* renamed from: g, reason: collision with root package name */
        static final int f17924g = Integer.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f17925a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f17926b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f17927c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f17928d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f17929e;

        f(int i4) {
            this.f17929e = i4;
        }

        void A(int i4) {
            this.f17926b = i4;
            this.f17927c = i4;
        }

        void a(View view) {
            c s4 = s(view);
            s4.f17905e = this;
            this.f17925a.add(view);
            this.f17927c = Integer.MIN_VALUE;
            if (this.f17925a.size() == 1) {
                this.f17926b = Integer.MIN_VALUE;
            }
            if (s4.g() || s4.f()) {
                this.f17928d += StaggeredGridLayoutManager.this.f17890u.e(view);
            }
        }

        void b(boolean z3, int i4) {
            int u3;
            if (z3) {
                u3 = q(Integer.MIN_VALUE);
            } else {
                u3 = u(Integer.MIN_VALUE);
            }
            e();
            if (u3 == Integer.MIN_VALUE) {
                return;
            }
            if (!z3 || u3 >= StaggeredGridLayoutManager.this.f17890u.i()) {
                if (!z3 && u3 > StaggeredGridLayoutManager.this.f17890u.n()) {
                    return;
                }
                if (i4 != Integer.MIN_VALUE) {
                    u3 += i4;
                }
                this.f17927c = u3;
                this.f17926b = u3;
            }
        }

        void c() {
            d.a f4;
            ArrayList<View> arrayList = this.f17925a;
            View view = arrayList.get(arrayList.size() - 1);
            c s4 = s(view);
            this.f17927c = StaggeredGridLayoutManager.this.f17890u.d(view);
            if (s4.f17906f && (f4 = StaggeredGridLayoutManager.this.f17876E.f(s4.d())) != null && f4.f17911F == 1) {
                this.f17927c += f4.a(this.f17929e);
            }
        }

        void d() {
            d.a f4;
            View view = this.f17925a.get(0);
            c s4 = s(view);
            this.f17926b = StaggeredGridLayoutManager.this.f17890u.g(view);
            if (s4.f17906f && (f4 = StaggeredGridLayoutManager.this.f17876E.f(s4.d())) != null && f4.f17911F == -1) {
                this.f17926b -= f4.a(this.f17929e);
            }
        }

        void e() {
            this.f17925a.clear();
            v();
            this.f17928d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f17895z) {
                return n(this.f17925a.size() - 1, -1, true);
            }
            return n(0, this.f17925a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f17895z) {
                return m(this.f17925a.size() - 1, -1, true);
            }
            return m(0, this.f17925a.size(), true);
        }

        public int h() {
            if (StaggeredGridLayoutManager.this.f17895z) {
                return n(this.f17925a.size() - 1, -1, false);
            }
            return n(0, this.f17925a.size(), false);
        }

        public int i() {
            if (StaggeredGridLayoutManager.this.f17895z) {
                return n(0, this.f17925a.size(), true);
            }
            return n(this.f17925a.size() - 1, -1, true);
        }

        public int j() {
            if (StaggeredGridLayoutManager.this.f17895z) {
                return m(0, this.f17925a.size(), true);
            }
            return m(this.f17925a.size() - 1, -1, true);
        }

        public int k() {
            if (StaggeredGridLayoutManager.this.f17895z) {
                return n(0, this.f17925a.size(), false);
            }
            return n(this.f17925a.size() - 1, -1, false);
        }

        int l(int i4, int i5, boolean z3, boolean z4, boolean z5) {
            int i6;
            boolean z6;
            int n4 = StaggeredGridLayoutManager.this.f17890u.n();
            int i7 = StaggeredGridLayoutManager.this.f17890u.i();
            if (i5 > i4) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            while (i4 != i5) {
                View view = this.f17925a.get(i4);
                int g4 = StaggeredGridLayoutManager.this.f17890u.g(view);
                int d4 = StaggeredGridLayoutManager.this.f17890u.d(view);
                boolean z7 = false;
                if (!z5 ? g4 < i7 : g4 <= i7) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z5 ? d4 > n4 : d4 >= n4) {
                    z7 = true;
                }
                if (z6 && z7) {
                    if (z3 && z4) {
                        if (g4 >= n4 && d4 <= i7) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    } else {
                        if (z4) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                        if (g4 < n4 || d4 > i7) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    }
                }
                i4 += i6;
            }
            return -1;
        }

        int m(int i4, int i5, boolean z3) {
            return l(i4, i5, false, false, z3);
        }

        int n(int i4, int i5, boolean z3) {
            return l(i4, i5, z3, true, false);
        }

        public int o() {
            return this.f17928d;
        }

        int p() {
            int i4 = this.f17927c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            c();
            return this.f17927c;
        }

        int q(int i4) {
            int i5 = this.f17927c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f17925a.size() == 0) {
                return i4;
            }
            c();
            return this.f17927c;
        }

        public View r(int i4, int i5) {
            View view = null;
            if (i5 == -1) {
                int size = this.f17925a.size();
                int i6 = 0;
                while (i6 < size) {
                    View view2 = this.f17925a.get(i6);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f17895z && staggeredGridLayoutManager.s0(view2) <= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f17895z && staggeredGridLayoutManager2.s0(view2) >= i4) || !view2.hasFocusable()) {
                        break;
                    }
                    i6++;
                    view = view2;
                }
            } else {
                int size2 = this.f17925a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f17925a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f17895z && staggeredGridLayoutManager3.s0(view3) >= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f17895z && staggeredGridLayoutManager4.s0(view3) <= i4) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        c s(View view) {
            return (c) view.getLayoutParams();
        }

        int t() {
            int i4 = this.f17926b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            d();
            return this.f17926b;
        }

        int u(int i4) {
            int i5 = this.f17926b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f17925a.size() == 0) {
                return i4;
            }
            d();
            return this.f17926b;
        }

        void v() {
            this.f17926b = Integer.MIN_VALUE;
            this.f17927c = Integer.MIN_VALUE;
        }

        void w(int i4) {
            int i5 = this.f17926b;
            if (i5 != Integer.MIN_VALUE) {
                this.f17926b = i5 + i4;
            }
            int i6 = this.f17927c;
            if (i6 != Integer.MIN_VALUE) {
                this.f17927c = i6 + i4;
            }
        }

        void x() {
            int size = this.f17925a.size();
            View remove = this.f17925a.remove(size - 1);
            c s4 = s(remove);
            s4.f17905e = null;
            if (s4.g() || s4.f()) {
                this.f17928d -= StaggeredGridLayoutManager.this.f17890u.e(remove);
            }
            if (size == 1) {
                this.f17926b = Integer.MIN_VALUE;
            }
            this.f17927c = Integer.MIN_VALUE;
        }

        void y() {
            View remove = this.f17925a.remove(0);
            c s4 = s(remove);
            s4.f17905e = null;
            if (this.f17925a.size() == 0) {
                this.f17927c = Integer.MIN_VALUE;
            }
            if (s4.g() || s4.f()) {
                this.f17928d -= StaggeredGridLayoutManager.this.f17890u.e(remove);
            }
            this.f17926b = Integer.MIN_VALUE;
        }

        void z(View view) {
            c s4 = s(view);
            s4.f17905e = this;
            this.f17925a.add(0, view);
            this.f17926b = Integer.MIN_VALUE;
            if (this.f17925a.size() == 1) {
                this.f17927c = Integer.MIN_VALUE;
            }
            if (s4.g() || s4.f()) {
                this.f17928d += StaggeredGridLayoutManager.this.f17890u.e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.o.d t02 = RecyclerView.o.t0(context, attributeSet, i4, i5);
        p3(t02.f17836a);
        r3(t02.f17837b);
        q3(t02.f17838c);
        this.f17894y = new q();
        y2();
    }

    private int B2(int i4) {
        int Q3 = Q();
        for (int i5 = 0; i5 < Q3; i5++) {
            int s02 = s0(P(i5));
            if (s02 >= 0 && s02 < i4) {
                return s02;
            }
        }
        return 0;
    }

    private int H2(int i4) {
        for (int Q3 = Q() - 1; Q3 >= 0; Q3--) {
            int s02 = s0(P(Q3));
            if (s02 >= 0 && s02 < i4) {
                return s02;
            }
        }
        return 0;
    }

    private void J2(RecyclerView.w wVar, RecyclerView.C c4, boolean z3) {
        int i4;
        int O22 = O2(Integer.MIN_VALUE);
        if (O22 != Integer.MIN_VALUE && (i4 = this.f17890u.i() - O22) > 0) {
            int i5 = i4 - (-l3(-i4, wVar, c4));
            if (z3 && i5 > 0) {
                this.f17890u.t(i5);
            }
        }
    }

    private void K2(RecyclerView.w wVar, RecyclerView.C c4, boolean z3) {
        int n4;
        int R22 = R2(Integer.MAX_VALUE);
        if (R22 != Integer.MAX_VALUE && (n4 = R22 - this.f17890u.n()) > 0) {
            int l32 = n4 - l3(n4, wVar, c4);
            if (z3 && l32 > 0) {
                this.f17890u.t(-l32);
            }
        }
    }

    private int O2(int i4) {
        int q4 = this.f17889t[0].q(i4);
        for (int i5 = 1; i5 < this.f17888s; i5++) {
            int q5 = this.f17889t[i5].q(i4);
            if (q5 > q4) {
                q4 = q5;
            }
        }
        return q4;
    }

    private int P2(int i4) {
        int u3 = this.f17889t[0].u(i4);
        for (int i5 = 1; i5 < this.f17888s; i5++) {
            int u4 = this.f17889t[i5].u(i4);
            if (u4 > u3) {
                u3 = u4;
            }
        }
        return u3;
    }

    private int Q2(int i4) {
        int q4 = this.f17889t[0].q(i4);
        for (int i5 = 1; i5 < this.f17888s; i5++) {
            int q5 = this.f17889t[i5].q(i4);
            if (q5 < q4) {
                q4 = q5;
            }
        }
        return q4;
    }

    private int R2(int i4) {
        int u3 = this.f17889t[0].u(i4);
        for (int i5 = 1; i5 < this.f17888s; i5++) {
            int u4 = this.f17889t[i5].u(i4);
            if (u4 < u3) {
                u3 = u4;
            }
        }
        return u3;
    }

    private f S2(q qVar) {
        int i4;
        int i5;
        int i6;
        if (d3(qVar.f18292e)) {
            i5 = this.f17888s - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = this.f17888s;
            i5 = 0;
            i6 = 1;
        }
        f fVar = null;
        if (qVar.f18292e == 1) {
            int n4 = this.f17890u.n();
            int i7 = Integer.MAX_VALUE;
            while (i5 != i4) {
                f fVar2 = this.f17889t[i5];
                int q4 = fVar2.q(n4);
                if (q4 < i7) {
                    fVar = fVar2;
                    i7 = q4;
                }
                i5 += i6;
            }
            return fVar;
        }
        int i8 = this.f17890u.i();
        int i9 = Integer.MIN_VALUE;
        while (i5 != i4) {
            f fVar3 = this.f17889t[i5];
            int u3 = fVar3.u(i8);
            if (u3 > i9) {
                fVar = fVar3;
                i9 = u3;
            }
            i5 += i6;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void W2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f17872A
            if (r0 == 0) goto L9
            int r0 = r6.N2()
            goto Ld
        L9:
            int r0 = r6.L2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f17876E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f17876E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f17876E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f17876E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f17876E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f17872A
            if (r7 == 0) goto L4e
            int r7 = r6.L2()
            goto L52
        L4e:
            int r7 = r6.N2()
        L52:
            if (r3 > r7) goto L57
            r6.N1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W2(int, int, int):void");
    }

    private void a3(View view, int i4, int i5, boolean z3) {
        boolean c22;
        m(view, this.f17882K);
        c cVar = (c) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f17882K;
        int z32 = z3(i4, i6 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i7 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f17882K;
        int z33 = z3(i5, i7 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z3) {
            c22 = e2(view, z32, z33, cVar);
        } else {
            c22 = c2(view, z32, z33, cVar);
        }
        if (c22) {
            view.measure(z32, z33);
        }
    }

    private void b3(View view, c cVar, boolean z3) {
        if (cVar.f17906f) {
            if (this.f17892w == 1) {
                a3(view, this.f17881J, RecyclerView.o.R(e0(), f0(), r0() + m0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z3);
                return;
            } else {
                a3(view, RecyclerView.o.R(z0(), A0(), o0() + p0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f17881J, z3);
                return;
            }
        }
        if (this.f17892w == 1) {
            a3(view, RecyclerView.o.R(this.f17893x, A0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.R(e0(), f0(), r0() + m0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z3);
        } else {
            a3(view, RecyclerView.o.R(z0(), A0(), o0() + p0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.R(this.f17893x, f0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (q2() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c3(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.C r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$C, boolean):void");
    }

    private boolean d3(int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f17892w == 0) {
            if (i4 == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 == this.f17872A) {
                return false;
            }
            return true;
        }
        if (i4 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == this.f17872A) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != Z2()) {
            return false;
        }
        return true;
    }

    private void f3(View view) {
        for (int i4 = this.f17888s - 1; i4 >= 0; i4--) {
            this.f17889t[i4].z(view);
        }
    }

    private void g3(RecyclerView.w wVar, q qVar) {
        int min;
        int min2;
        if (qVar.f18288a && !qVar.f18296i) {
            if (qVar.f18289b == 0) {
                if (qVar.f18292e == -1) {
                    h3(wVar, qVar.f18294g);
                    return;
                } else {
                    i3(wVar, qVar.f18293f);
                    return;
                }
            }
            if (qVar.f18292e == -1) {
                int i4 = qVar.f18293f;
                int P22 = i4 - P2(i4);
                if (P22 < 0) {
                    min2 = qVar.f18294g;
                } else {
                    min2 = qVar.f18294g - Math.min(P22, qVar.f18289b);
                }
                h3(wVar, min2);
                return;
            }
            int Q22 = Q2(qVar.f18294g) - qVar.f18294g;
            if (Q22 < 0) {
                min = qVar.f18293f;
            } else {
                min = Math.min(Q22, qVar.f18289b) + qVar.f18293f;
            }
            i3(wVar, min);
        }
    }

    private void h3(RecyclerView.w wVar, int i4) {
        for (int Q3 = Q() - 1; Q3 >= 0; Q3--) {
            View P3 = P(Q3);
            if (this.f17890u.g(P3) >= i4 && this.f17890u.r(P3) >= i4) {
                c cVar = (c) P3.getLayoutParams();
                if (cVar.f17906f) {
                    for (int i5 = 0; i5 < this.f17888s; i5++) {
                        if (this.f17889t[i5].f17925a.size() == 1) {
                            return;
                        }
                    }
                    for (int i6 = 0; i6 < this.f17888s; i6++) {
                        this.f17889t[i6].x();
                    }
                } else if (cVar.f17905e.f17925a.size() == 1) {
                    return;
                } else {
                    cVar.f17905e.x();
                }
                F1(P3, wVar);
            } else {
                return;
            }
        }
    }

    private void i3(RecyclerView.w wVar, int i4) {
        while (Q() > 0) {
            View P3 = P(0);
            if (this.f17890u.d(P3) <= i4 && this.f17890u.q(P3) <= i4) {
                c cVar = (c) P3.getLayoutParams();
                if (cVar.f17906f) {
                    for (int i5 = 0; i5 < this.f17888s; i5++) {
                        if (this.f17889t[i5].f17925a.size() == 1) {
                            return;
                        }
                    }
                    for (int i6 = 0; i6 < this.f17888s; i6++) {
                        this.f17889t[i6].y();
                    }
                } else if (cVar.f17905e.f17925a.size() == 1) {
                    return;
                } else {
                    cVar.f17905e.y();
                }
                F1(P3, wVar);
            } else {
                return;
            }
        }
    }

    private void j3() {
        if (this.f17891v.l() == 1073741824) {
            return;
        }
        int Q3 = Q();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < Q3; i4++) {
            View P3 = P(i4);
            float e4 = this.f17891v.e(P3);
            if (e4 >= f4) {
                if (((c) P3.getLayoutParams()).k()) {
                    e4 = (e4 * 1.0f) / this.f17888s;
                }
                f4 = Math.max(f4, e4);
            }
        }
        int i5 = this.f17893x;
        int round = Math.round(f4 * this.f17888s);
        if (this.f17891v.l() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f17891v.o());
        }
        x3(round);
        if (this.f17893x == i5) {
            return;
        }
        for (int i6 = 0; i6 < Q3; i6++) {
            View P4 = P(i6);
            c cVar = (c) P4.getLayoutParams();
            if (!cVar.f17906f) {
                if (Z2() && this.f17892w == 1) {
                    int i7 = this.f17888s;
                    int i8 = cVar.f17905e.f17929e;
                    P4.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f17893x) - ((-((i7 - 1) - i8)) * i5));
                } else {
                    int i9 = cVar.f17905e.f17929e;
                    int i10 = this.f17893x * i9;
                    int i11 = i9 * i5;
                    if (this.f17892w == 1) {
                        P4.offsetLeftAndRight(i10 - i11);
                    } else {
                        P4.offsetTopAndBottom(i10 - i11);
                    }
                }
            }
        }
    }

    private void k2(View view) {
        for (int i4 = this.f17888s - 1; i4 >= 0; i4--) {
            this.f17889t[i4].a(view);
        }
    }

    private void k3() {
        if (this.f17892w != 1 && Z2()) {
            this.f17872A = !this.f17895z;
        } else {
            this.f17872A = this.f17895z;
        }
    }

    private void l2(b bVar) {
        int n4;
        e eVar = this.f17880I;
        int i4 = eVar.f17916G;
        if (i4 > 0) {
            if (i4 == this.f17888s) {
                for (int i5 = 0; i5 < this.f17888s; i5++) {
                    this.f17889t[i5].e();
                    e eVar2 = this.f17880I;
                    int i6 = eVar2.f17917H[i5];
                    if (i6 != Integer.MIN_VALUE) {
                        if (eVar2.f17922M) {
                            n4 = this.f17890u.i();
                        } else {
                            n4 = this.f17890u.n();
                        }
                        i6 += n4;
                    }
                    this.f17889t[i5].A(i6);
                }
            } else {
                eVar.b();
                e eVar3 = this.f17880I;
                eVar3.f17914E = eVar3.f17915F;
            }
        }
        e eVar4 = this.f17880I;
        this.f17879H = eVar4.f17923N;
        q3(eVar4.f17921L);
        k3();
        e eVar5 = this.f17880I;
        int i7 = eVar5.f17914E;
        if (i7 != -1) {
            this.f17874C = i7;
            bVar.f17899c = eVar5.f17922M;
        } else {
            bVar.f17899c = this.f17872A;
        }
        if (eVar5.f17918I > 1) {
            d dVar = this.f17876E;
            dVar.f17908a = eVar5.f17919J;
            dVar.f17909b = eVar5.f17920K;
        }
    }

    private void o2(View view, c cVar, q qVar) {
        if (qVar.f18292e == 1) {
            if (cVar.f17906f) {
                k2(view);
                return;
            } else {
                cVar.f17905e.a(view);
                return;
            }
        }
        if (cVar.f17906f) {
            f3(view);
        } else {
            cVar.f17905e.z(view);
        }
    }

    private void o3(int i4) {
        boolean z3;
        q qVar = this.f17894y;
        qVar.f18292e = i4;
        boolean z4 = this.f17872A;
        int i5 = 1;
        if (i4 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4 != z3) {
            i5 = -1;
        }
        qVar.f18291d = i5;
    }

    private int p2(int i4) {
        boolean z3;
        if (Q() == 0) {
            if (!this.f17872A) {
                return -1;
            }
            return 1;
        }
        if (i4 < L2()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != this.f17872A) {
            return -1;
        }
        return 1;
    }

    private boolean r2(f fVar) {
        if (this.f17872A) {
            if (fVar.p() < this.f17890u.i()) {
                ArrayList<View> arrayList = fVar.f17925a;
                return !fVar.s(arrayList.get(arrayList.size() - 1)).f17906f;
            }
        } else if (fVar.t() > this.f17890u.n()) {
            return !fVar.s(fVar.f17925a.get(0)).f17906f;
        }
        return false;
    }

    private int s2(RecyclerView.C c4) {
        if (Q() == 0) {
            return 0;
        }
        return B.a(c4, this.f17890u, D2(!this.f17885N), C2(!this.f17885N), this, this.f17885N);
    }

    private void s3(int i4, int i5) {
        for (int i6 = 0; i6 < this.f17888s; i6++) {
            if (!this.f17889t[i6].f17925a.isEmpty()) {
                y3(this.f17889t[i6], i4, i5);
            }
        }
    }

    private int t2(RecyclerView.C c4) {
        if (Q() == 0) {
            return 0;
        }
        return B.b(c4, this.f17890u, D2(!this.f17885N), C2(!this.f17885N), this, this.f17885N, this.f17872A);
    }

    private boolean t3(RecyclerView.C c4, b bVar) {
        int B22;
        if (this.f17878G) {
            B22 = H2(c4.d());
        } else {
            B22 = B2(c4.d());
        }
        bVar.f17897a = B22;
        bVar.f17898b = Integer.MIN_VALUE;
        return true;
    }

    private int u2(RecyclerView.C c4) {
        if (Q() == 0) {
            return 0;
        }
        return B.c(c4, this.f17890u, D2(!this.f17885N), C2(!this.f17885N), this, this.f17885N);
    }

    private int v2(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130 && this.f17892w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f17892w == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f17892w == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f17892w == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f17892w != 1 && Z2()) {
                return -1;
            }
            return 1;
        }
        if (this.f17892w == 1 || !Z2()) {
            return -1;
        }
        return 1;
    }

    private d.a w2(int i4) {
        d.a aVar = new d.a();
        aVar.f17912G = new int[this.f17888s];
        for (int i5 = 0; i5 < this.f17888s; i5++) {
            aVar.f17912G[i5] = i4 - this.f17889t[i5].q(i4);
        }
        return aVar;
    }

    private void w3(int i4, RecyclerView.C c4) {
        int i5;
        int i6;
        int g4;
        boolean z3;
        q qVar = this.f17894y;
        boolean z4 = false;
        qVar.f18289b = 0;
        qVar.f18290c = i4;
        if (M0() && (g4 = c4.g()) != -1) {
            boolean z5 = this.f17872A;
            if (g4 < i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z5 == z3) {
                i5 = this.f17890u.o();
                i6 = 0;
            } else {
                i6 = this.f17890u.o();
                i5 = 0;
            }
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (U()) {
            this.f17894y.f18293f = this.f17890u.n() - i6;
            this.f17894y.f18294g = this.f17890u.i() + i5;
        } else {
            this.f17894y.f18294g = this.f17890u.h() + i5;
            this.f17894y.f18293f = -i6;
        }
        q qVar2 = this.f17894y;
        qVar2.f18295h = false;
        qVar2.f18288a = true;
        if (this.f17890u.l() == 0 && this.f17890u.h() == 0) {
            z4 = true;
        }
        qVar2.f18296i = z4;
    }

    private d.a x2(int i4) {
        d.a aVar = new d.a();
        aVar.f17912G = new int[this.f17888s];
        for (int i5 = 0; i5 < this.f17888s; i5++) {
            aVar.f17912G[i5] = this.f17889t[i5].u(i4) - i4;
        }
        return aVar;
    }

    private void y2() {
        this.f17890u = y.b(this, this.f17892w);
        this.f17891v = y.b(this, 1 - this.f17892w);
    }

    private void y3(f fVar, int i4, int i5) {
        int o4 = fVar.o();
        if (i4 == -1) {
            if (fVar.t() + o4 <= i5) {
                this.f17873B.set(fVar.f17929e, false);
            }
        } else if (fVar.p() - o4 >= i5) {
            this.f17873B.set(fVar.f17929e, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int z2(RecyclerView.w wVar, q qVar, RecyclerView.C c4) {
        int i4;
        int n4;
        int O22;
        boolean z3;
        f fVar;
        int u3;
        int e4;
        int i5;
        int n5;
        int i6;
        int e5;
        boolean z4;
        int i7;
        boolean n22;
        int q4;
        ?? r9 = 0;
        this.f17873B.set(0, this.f17888s, true);
        if (this.f17894y.f18296i) {
            if (qVar.f18292e == 1) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = Integer.MIN_VALUE;
            }
        } else if (qVar.f18292e == 1) {
            i4 = qVar.f18294g + qVar.f18289b;
        } else {
            i4 = qVar.f18293f - qVar.f18289b;
        }
        int i8 = i4;
        s3(qVar.f18292e, i8);
        if (this.f17872A) {
            n4 = this.f17890u.i();
        } else {
            n4 = this.f17890u.n();
        }
        int i9 = n4;
        boolean z5 = false;
        while (qVar.a(c4) && (this.f17894y.f18296i || !this.f17873B.isEmpty())) {
            View b4 = qVar.b(wVar);
            c cVar = (c) b4.getLayoutParams();
            int d4 = cVar.d();
            int g4 = this.f17876E.g(d4);
            if (g4 == -1) {
                z3 = true;
            } else {
                z3 = r9;
            }
            if (z3) {
                if (cVar.f17906f) {
                    fVar = this.f17889t[r9];
                } else {
                    fVar = S2(qVar);
                }
                this.f17876E.n(d4, fVar);
            } else {
                fVar = this.f17889t[g4];
            }
            f fVar2 = fVar;
            cVar.f17905e = fVar2;
            if (qVar.f18292e == 1) {
                e(b4);
            } else {
                f(b4, r9);
            }
            b3(b4, cVar, r9);
            if (qVar.f18292e == 1) {
                if (cVar.f17906f) {
                    q4 = O2(i9);
                } else {
                    q4 = fVar2.q(i9);
                }
                int e6 = this.f17890u.e(b4) + q4;
                if (z3 && cVar.f17906f) {
                    d.a w22 = w2(q4);
                    w22.f17911F = -1;
                    w22.f17910E = d4;
                    this.f17876E.a(w22);
                }
                i5 = e6;
                e4 = q4;
            } else {
                if (cVar.f17906f) {
                    u3 = R2(i9);
                } else {
                    u3 = fVar2.u(i9);
                }
                e4 = u3 - this.f17890u.e(b4);
                if (z3 && cVar.f17906f) {
                    d.a x22 = x2(u3);
                    x22.f17911F = 1;
                    x22.f17910E = d4;
                    this.f17876E.a(x22);
                }
                i5 = u3;
            }
            if (cVar.f17906f && qVar.f18291d == -1) {
                if (z3) {
                    this.f17884M = true;
                } else {
                    if (qVar.f18292e == 1) {
                        n22 = m2();
                    } else {
                        n22 = n2();
                    }
                    if (!n22) {
                        d.a f4 = this.f17876E.f(d4);
                        if (f4 != null) {
                            f4.f17913H = true;
                        }
                        this.f17884M = true;
                    }
                }
            }
            o2(b4, cVar, qVar);
            if (Z2() && this.f17892w == 1) {
                if (cVar.f17906f) {
                    i7 = this.f17891v.i();
                } else {
                    i7 = this.f17891v.i() - (((this.f17888s - 1) - fVar2.f17929e) * this.f17893x);
                }
                e5 = i7;
                i6 = i7 - this.f17891v.e(b4);
            } else {
                if (cVar.f17906f) {
                    n5 = this.f17891v.n();
                } else {
                    n5 = (fVar2.f17929e * this.f17893x) + this.f17891v.n();
                }
                i6 = n5;
                e5 = this.f17891v.e(b4) + n5;
            }
            if (this.f17892w == 1) {
                P0(b4, i6, e4, e5, i5);
            } else {
                P0(b4, e4, i6, i5, e5);
            }
            if (cVar.f17906f) {
                s3(this.f17894y.f18292e, i8);
            } else {
                y3(fVar2, this.f17894y.f18292e, i8);
            }
            g3(wVar, this.f17894y);
            if (this.f17894y.f18295h && b4.hasFocusable()) {
                if (cVar.f17906f) {
                    this.f17873B.clear();
                } else {
                    z4 = false;
                    this.f17873B.set(fVar2.f17929e, false);
                    r9 = z4;
                    z5 = true;
                }
            }
            z4 = false;
            r9 = z4;
            z5 = true;
        }
        int i10 = r9;
        if (!z5) {
            g3(wVar, this.f17894y);
        }
        if (this.f17894y.f18292e == -1) {
            O22 = this.f17890u.n() - R2(this.f17890u.n());
        } else {
            O22 = O2(this.f17890u.i()) - this.f17890u.i();
        }
        if (O22 > 0) {
            return Math.min(qVar.f18289b, O22);
        }
        return i10;
    }

    private int z3(int i4, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i4;
        }
        int mode = View.MeasureSpec.getMode(i4);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i4;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode);
    }

    public int[] A2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f17888s];
        } else if (iArr.length < this.f17888s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f17888s + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f17888s; i4++) {
            iArr[i4] = this.f17889t[i4].f();
        }
        return iArr;
    }

    View C2(boolean z3) {
        int n4 = this.f17890u.n();
        int i4 = this.f17890u.i();
        View view = null;
        for (int Q3 = Q() - 1; Q3 >= 0; Q3--) {
            View P3 = P(Q3);
            int g4 = this.f17890u.g(P3);
            int d4 = this.f17890u.d(P3);
            if (d4 > n4 && g4 < i4) {
                if (d4 > i4 && z3) {
                    if (view == null) {
                        view = P3;
                    }
                } else {
                    return P3;
                }
            }
        }
        return view;
    }

    View D2(boolean z3) {
        int n4 = this.f17890u.n();
        int i4 = this.f17890u.i();
        int Q3 = Q();
        View view = null;
        for (int i5 = 0; i5 < Q3; i5++) {
            View P3 = P(i5);
            int g4 = this.f17890u.g(P3);
            if (this.f17890u.d(P3) > n4 && g4 < i4) {
                if (g4 < n4 && z3) {
                    if (view == null) {
                        view = P3;
                    }
                } else {
                    return P3;
                }
            }
        }
        return view;
    }

    int E2() {
        View D22;
        if (this.f17872A) {
            D22 = C2(true);
        } else {
            D22 = D2(true);
        }
        if (D22 == null) {
            return -1;
        }
        return s0(D22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F0() {
        if (this.f17877F != 0) {
            return true;
        }
        return false;
    }

    public int[] F2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f17888s];
        } else if (iArr.length < this.f17888s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f17888s + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f17888s; i4++) {
            iArr[i4] = this.f17889t[i4].h();
        }
        return iArr;
    }

    public int[] G2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f17888s];
        } else if (iArr.length < this.f17888s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f17888s + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f17888s; i4++) {
            iArr[i4] = this.f17889t[i4].i();
        }
        return iArr;
    }

    public int[] I2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f17888s];
        } else if (iArr.length < this.f17888s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f17888s + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f17888s; i4++) {
            iArr[i4] = this.f17889t[i4].k();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        if (this.f17892w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int L2() {
        if (Q() == 0) {
            return 0;
        }
        return s0(P(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public int M2() {
        return this.f17877F;
    }

    int N2() {
        int Q3 = Q();
        if (Q3 == 0) {
            return 0;
        }
        return s0(P(Q3 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        return l3(i4, wVar, c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(int i4) {
        e eVar = this.f17880I;
        if (eVar != null && eVar.f17914E != i4) {
            eVar.a();
        }
        this.f17874C = i4;
        this.f17875D = Integer.MIN_VALUE;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S1(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        return l3(i4, wVar, c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(int i4) {
        super.T0(i4);
        for (int i5 = 0; i5 < this.f17888s; i5++) {
            this.f17889t[i5].w(i4);
        }
    }

    public int T2() {
        return this.f17892w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(int i4) {
        super.U0(i4);
        for (int i5 = 0; i5 < this.f17888s; i5++) {
            this.f17889t[i5].w(i4);
        }
    }

    public boolean U2() {
        return this.f17895z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(@P RecyclerView.Adapter adapter, @P RecyclerView.Adapter adapter2) {
        this.f17876E.b();
        for (int i4 = 0; i4 < this.f17888s; i4++) {
            this.f17889t[i4].e();
        }
    }

    public int V2() {
        return this.f17888s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View X2() {
        /*
            r12 = this;
            int r0 = r12.Q()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f17888s
            r2.<init>(r3)
            int r3 = r12.f17888s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f17892w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.Z2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f17872A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.P(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f17905e
            int r9 = r9.f17929e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f17905e
            boolean r9 = r12.r2(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f17905e
            int r9 = r9.f17929e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f17906f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.P(r9)
            boolean r10 = r12.f17872A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.y r10 = r12.f17890u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.y r11 = r12.f17890u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.y r10 = r12.f17890u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.y r11 = r12.f17890u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f17905e
            int r8 = r8.f17929e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f17905e
            int r9 = r9.f17929e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y1(Rect rect, int i4, int i5) {
        int q4;
        int q5;
        int o02 = o0() + p0();
        int r02 = r0() + m0();
        if (this.f17892w == 1) {
            q5 = RecyclerView.o.q(i5, rect.height() + r02, k0());
            q4 = RecyclerView.o.q(i4, (this.f17893x * this.f17888s) + o02, l0());
        } else {
            q4 = RecyclerView.o.q(i4, rect.width() + o02, l0());
            q5 = RecyclerView.o.q(i5, (this.f17893x * this.f17888s) + r02, k0());
        }
        X1(q4, q5);
    }

    public void Y2() {
        this.f17876E.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        H1(this.f17887P);
        for (int i4 = 0; i4 < this.f17888s; i4++) {
            this.f17889t[i4].e();
        }
        recyclerView.requestLayout();
    }

    boolean Z2() {
        if (i0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B.b
    public PointF a(int i4) {
        int p22 = p2(i4);
        PointF pointF = new PointF();
        if (p22 == 0) {
            return null;
        }
        if (this.f17892w == 0) {
            pointF.x = p22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = p22;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @P
    public View a1(View view, int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        View I3;
        int L22;
        boolean z3;
        boolean z4;
        int j4;
        int j5;
        int j6;
        View r4;
        if (Q() == 0 || (I3 = I(view)) == null) {
            return null;
        }
        k3();
        int v22 = v2(i4);
        if (v22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) I3.getLayoutParams();
        boolean z5 = cVar.f17906f;
        f fVar = cVar.f17905e;
        if (v22 == 1) {
            L22 = N2();
        } else {
            L22 = L2();
        }
        w3(L22, c4);
        o3(v22);
        q qVar = this.f17894y;
        qVar.f18290c = qVar.f18291d + L22;
        qVar.f18289b = (int) (this.f17890u.o() * f17871Y);
        q qVar2 = this.f17894y;
        qVar2.f18295h = true;
        qVar2.f18288a = false;
        z2(wVar, qVar2, c4);
        this.f17878G = this.f17872A;
        if (!z5 && (r4 = fVar.r(L22, v22)) != null && r4 != I3) {
            return r4;
        }
        if (d3(v22)) {
            for (int i5 = this.f17888s - 1; i5 >= 0; i5--) {
                View r5 = this.f17889t[i5].r(L22, v22);
                if (r5 != null && r5 != I3) {
                    return r5;
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f17888s; i6++) {
                View r6 = this.f17889t[i6].r(L22, v22);
                if (r6 != null && r6 != I3) {
                    return r6;
                }
            }
        }
        boolean z6 = !this.f17895z;
        if (v22 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z6 == z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z5) {
            if (z4) {
                j6 = fVar.g();
            } else {
                j6 = fVar.j();
            }
            View J3 = J(j6);
            if (J3 != null && J3 != I3) {
                return J3;
            }
        }
        if (d3(v22)) {
            for (int i7 = this.f17888s - 1; i7 >= 0; i7--) {
                if (i7 != fVar.f17929e) {
                    if (z4) {
                        j5 = this.f17889t[i7].g();
                    } else {
                        j5 = this.f17889t[i7].j();
                    }
                    View J4 = J(j5);
                    if (J4 != null && J4 != I3) {
                        return J4;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f17888s; i8++) {
                if (z4) {
                    j4 = this.f17889t[i8].g();
                } else {
                    j4 = this.f17889t[i8].j();
                }
                View J5 = J(j4);
                if (J5 != null && J5 != I3) {
                    return J5;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            View D22 = D2(false);
            View C22 = C2(false);
            if (D22 != null && C22 != null) {
                int s02 = s0(D22);
                int s03 = s0(C22);
                if (s02 < s03) {
                    accessibilityEvent.setFromIndex(s02);
                    accessibilityEvent.setToIndex(s03);
                } else {
                    accessibilityEvent.setFromIndex(s03);
                    accessibilityEvent.setToIndex(s02);
                }
            }
        }
    }

    void e3(int i4, RecyclerView.C c4) {
        int L22;
        int i5;
        if (i4 > 0) {
            L22 = N2();
            i5 = 1;
        } else {
            L22 = L2();
            i5 = -1;
        }
        this.f17894y.f18288a = true;
        w3(L22, c4);
        o3(i5);
        q qVar = this.f17894y;
        qVar.f18290c = L22 + qVar.f18291d;
        qVar.f18289b = Math.abs(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.C c4, int i4) {
        r rVar = new r(recyclerView.getContext());
        rVar.q(i4);
        g2(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(String str) {
        if (this.f17880I == null) {
            super.i(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(RecyclerView recyclerView, int i4, int i5) {
        W2(i4, i5, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(RecyclerView recyclerView) {
        this.f17876E.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        if (this.f17880I == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k1(RecyclerView recyclerView, int i4, int i5, int i6) {
        W2(i4, i5, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView recyclerView, int i4, int i5) {
        W2(i4, i5, 2);
    }

    int l3(int i4, RecyclerView.w wVar, RecyclerView.C c4) {
        if (Q() == 0 || i4 == 0) {
            return 0;
        }
        e3(i4, c4);
        int z22 = z2(wVar, this.f17894y, c4);
        if (this.f17894y.f18289b >= z22) {
            if (i4 < 0) {
                i4 = -z22;
            } else {
                i4 = z22;
            }
        }
        this.f17890u.t(-i4);
        this.f17878G = this.f17872A;
        q qVar = this.f17894y;
        qVar.f18289b = 0;
        g3(wVar, qVar);
        return i4;
    }

    boolean m2() {
        int q4 = this.f17889t[0].q(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f17888s; i4++) {
            if (this.f17889t[i4].q(Integer.MIN_VALUE) != q4) {
                return false;
            }
        }
        return true;
    }

    public void m3(int i4, int i5) {
        e eVar = this.f17880I;
        if (eVar != null) {
            eVar.a();
        }
        this.f17874C = i4;
        this.f17875D = i5;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n() {
        if (this.f17892w == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i4, int i5, Object obj) {
        W2(i4, i5, 4);
    }

    boolean n2() {
        int u3 = this.f17889t[0].u(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f17888s; i4++) {
            if (this.f17889t[i4].u(Integer.MIN_VALUE) != u3) {
                return false;
            }
        }
        return true;
    }

    public void n3(int i4) {
        i(null);
        if (i4 == this.f17877F) {
            return;
        }
        if (i4 != 0 && i4 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f17877F = i4;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean o() {
        if (this.f17892w == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.C c4) {
        c3(wVar, c4, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.C c4) {
        super.p1(c4);
        this.f17874C = -1;
        this.f17875D = Integer.MIN_VALUE;
        this.f17880I = null;
        this.f17883L.c();
    }

    public void p3(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        i(null);
        if (i4 == this.f17892w) {
            return;
        }
        this.f17892w = i4;
        y yVar = this.f17890u;
        this.f17890u = this.f17891v;
        this.f17891v = yVar;
        N1();
    }

    boolean q2() {
        int L22;
        int N22;
        int i4;
        if (Q() == 0 || this.f17877F == 0 || !E0()) {
            return false;
        }
        if (this.f17872A) {
            L22 = N2();
            N22 = L2();
        } else {
            L22 = L2();
            N22 = N2();
        }
        if (L22 == 0 && X2() != null) {
            this.f17876E.b();
            O1();
            N1();
            return true;
        }
        if (!this.f17884M) {
            return false;
        }
        if (this.f17872A) {
            i4 = -1;
        } else {
            i4 = 1;
        }
        int i5 = N22 + 1;
        d.a e4 = this.f17876E.e(L22, i5, i4, true);
        if (e4 == null) {
            this.f17884M = false;
            this.f17876E.d(i5);
            return false;
        }
        d.a e5 = this.f17876E.e(L22, e4.f17910E, i4 * (-1), true);
        if (e5 == null) {
            this.f17876E.d(e4.f17910E);
        } else {
            this.f17876E.d(e5.f17910E + 1);
        }
        O1();
        N1();
        return true;
    }

    public void q3(boolean z3) {
        i(null);
        e eVar = this.f17880I;
        if (eVar != null && eVar.f17921L != z3) {
            eVar.f17921L = z3;
        }
        this.f17895z = z3;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r(int i4, int i5, RecyclerView.C c4, RecyclerView.o.c cVar) {
        int q4;
        int i6;
        if (this.f17892w != 0) {
            i4 = i5;
        }
        if (Q() != 0 && i4 != 0) {
            e3(i4, c4);
            int[] iArr = this.f17886O;
            if (iArr == null || iArr.length < this.f17888s) {
                this.f17886O = new int[this.f17888s];
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.f17888s; i8++) {
                q qVar = this.f17894y;
                if (qVar.f18291d == -1) {
                    q4 = qVar.f18293f;
                    i6 = this.f17889t[i8].u(q4);
                } else {
                    q4 = this.f17889t[i8].q(qVar.f18294g);
                    i6 = this.f17894y.f18294g;
                }
                int i9 = q4 - i6;
                if (i9 >= 0) {
                    this.f17886O[i7] = i9;
                    i7++;
                }
            }
            Arrays.sort(this.f17886O, 0, i7);
            for (int i10 = 0; i10 < i7 && this.f17894y.a(c4); i10++) {
                cVar.a(this.f17894y.f18290c, this.f17886O[i10]);
                q qVar2 = this.f17894y;
                qVar2.f18290c += qVar2.f18291d;
            }
        }
    }

    public void r3(int i4) {
        i(null);
        if (i4 != this.f17888s) {
            Y2();
            this.f17888s = i4;
            this.f17873B = new BitSet(this.f17888s);
            this.f17889t = new f[this.f17888s];
            for (int i5 = 0; i5 < this.f17888s; i5++) {
                this.f17889t[i5] = new f(i5);
            }
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.C c4) {
        return s2(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f17880I = eVar;
            if (this.f17874C != -1) {
                eVar.a();
                this.f17880I.b();
            }
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.C c4) {
        return t2(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable u1() {
        int L22;
        int u3;
        int n4;
        int[] iArr;
        if (this.f17880I != null) {
            return new e(this.f17880I);
        }
        e eVar = new e();
        eVar.f17921L = this.f17895z;
        eVar.f17922M = this.f17878G;
        eVar.f17923N = this.f17879H;
        d dVar = this.f17876E;
        if (dVar != null && (iArr = dVar.f17908a) != null) {
            eVar.f17919J = iArr;
            eVar.f17918I = iArr.length;
            eVar.f17920K = dVar.f17909b;
        } else {
            eVar.f17918I = 0;
        }
        if (Q() > 0) {
            if (this.f17878G) {
                L22 = N2();
            } else {
                L22 = L2();
            }
            eVar.f17914E = L22;
            eVar.f17915F = E2();
            int i4 = this.f17888s;
            eVar.f17916G = i4;
            eVar.f17917H = new int[i4];
            for (int i5 = 0; i5 < this.f17888s; i5++) {
                if (this.f17878G) {
                    u3 = this.f17889t[i5].q(Integer.MIN_VALUE);
                    if (u3 != Integer.MIN_VALUE) {
                        n4 = this.f17890u.i();
                        u3 -= n4;
                        eVar.f17917H[i5] = u3;
                    } else {
                        eVar.f17917H[i5] = u3;
                    }
                } else {
                    u3 = this.f17889t[i5].u(Integer.MIN_VALUE);
                    if (u3 != Integer.MIN_VALUE) {
                        n4 = this.f17890u.n();
                        u3 -= n4;
                        eVar.f17917H[i5] = u3;
                    } else {
                        eVar.f17917H[i5] = u3;
                    }
                }
            }
        } else {
            eVar.f17914E = -1;
            eVar.f17915F = -1;
            eVar.f17916G = 0;
        }
        return eVar;
    }

    boolean u3(RecyclerView.C c4, b bVar) {
        int i4;
        int L22;
        int n4;
        boolean z3 = false;
        if (!c4.j() && (i4 = this.f17874C) != -1) {
            if (i4 >= 0 && i4 < c4.d()) {
                e eVar = this.f17880I;
                if (eVar != null && eVar.f17914E != -1 && eVar.f17916G >= 1) {
                    bVar.f17898b = Integer.MIN_VALUE;
                    bVar.f17897a = this.f17874C;
                } else {
                    View J3 = J(this.f17874C);
                    if (J3 != null) {
                        if (this.f17872A) {
                            L22 = N2();
                        } else {
                            L22 = L2();
                        }
                        bVar.f17897a = L22;
                        if (this.f17875D != Integer.MIN_VALUE) {
                            if (bVar.f17899c) {
                                bVar.f17898b = (this.f17890u.i() - this.f17875D) - this.f17890u.d(J3);
                            } else {
                                bVar.f17898b = (this.f17890u.n() + this.f17875D) - this.f17890u.g(J3);
                            }
                            return true;
                        }
                        if (this.f17890u.e(J3) > this.f17890u.o()) {
                            if (bVar.f17899c) {
                                n4 = this.f17890u.i();
                            } else {
                                n4 = this.f17890u.n();
                            }
                            bVar.f17898b = n4;
                            return true;
                        }
                        int g4 = this.f17890u.g(J3) - this.f17890u.n();
                        if (g4 < 0) {
                            bVar.f17898b = -g4;
                            return true;
                        }
                        int i5 = this.f17890u.i() - this.f17890u.d(J3);
                        if (i5 < 0) {
                            bVar.f17898b = i5;
                            return true;
                        }
                        bVar.f17898b = Integer.MIN_VALUE;
                    } else {
                        int i6 = this.f17874C;
                        bVar.f17897a = i6;
                        int i7 = this.f17875D;
                        if (i7 == Integer.MIN_VALUE) {
                            if (p2(i6) == 1) {
                                z3 = true;
                            }
                            bVar.f17899c = z3;
                            bVar.a();
                        } else {
                            bVar.b(i7);
                        }
                        bVar.f17900d = true;
                    }
                }
                return true;
            }
            this.f17874C = -1;
            this.f17875D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.C c4) {
        return u2(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void v1(int i4) {
        if (i4 == 0) {
            q2();
        }
    }

    void v3(RecyclerView.C c4, b bVar) {
        if (u3(c4, bVar) || t3(c4, bVar)) {
            return;
        }
        bVar.a();
        bVar.f17897a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.C c4) {
        return s2(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.C c4) {
        return t2(c4);
    }

    void x3(int i4) {
        this.f17893x = i4 / this.f17888s;
        this.f17881J = View.MeasureSpec.makeMeasureSpec(i4, this.f17891v.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.C c4) {
        return u2(c4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: c, reason: collision with root package name */
        private static final int f17907c = 10;

        /* renamed from: a, reason: collision with root package name */
        int[] f17908a;

        /* renamed from: b, reason: collision with root package name */
        List<a> f17909b;

        d() {
        }

        private int i(int i4) {
            if (this.f17909b == null) {
                return -1;
            }
            a f4 = f(i4);
            if (f4 != null) {
                this.f17909b.remove(f4);
            }
            int size = this.f17909b.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    if (this.f17909b.get(i5).f17910E >= i4) {
                        break;
                    }
                    i5++;
                } else {
                    i5 = -1;
                    break;
                }
            }
            if (i5 == -1) {
                return -1;
            }
            a aVar = this.f17909b.get(i5);
            this.f17909b.remove(i5);
            return aVar.f17910E;
        }

        private void l(int i4, int i5) {
            List<a> list = this.f17909b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f17909b.get(size);
                int i6 = aVar.f17910E;
                if (i6 >= i4) {
                    aVar.f17910E = i6 + i5;
                }
            }
        }

        private void m(int i4, int i5) {
            List<a> list = this.f17909b;
            if (list == null) {
                return;
            }
            int i6 = i4 + i5;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f17909b.get(size);
                int i7 = aVar.f17910E;
                if (i7 >= i4) {
                    if (i7 < i6) {
                        this.f17909b.remove(size);
                    } else {
                        aVar.f17910E = i7 - i5;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f17909b == null) {
                this.f17909b = new ArrayList();
            }
            int size = this.f17909b.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar2 = this.f17909b.get(i4);
                if (aVar2.f17910E == aVar.f17910E) {
                    this.f17909b.remove(i4);
                }
                if (aVar2.f17910E >= aVar.f17910E) {
                    this.f17909b.add(i4, aVar);
                    return;
                }
            }
            this.f17909b.add(aVar);
        }

        void b() {
            int[] iArr = this.f17908a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f17909b = null;
        }

        void c(int i4) {
            int[] iArr = this.f17908a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i4, 10) + 1];
                this.f17908a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[o(i4)];
                this.f17908a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f17908a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i4) {
            List<a> list = this.f17909b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f17909b.get(size).f17910E >= i4) {
                        this.f17909b.remove(size);
                    }
                }
            }
            return h(i4);
        }

        public a e(int i4, int i5, int i6, boolean z3) {
            List<a> list = this.f17909b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                a aVar = this.f17909b.get(i7);
                int i8 = aVar.f17910E;
                if (i8 >= i5) {
                    return null;
                }
                if (i8 >= i4 && (i6 == 0 || aVar.f17911F == i6 || (z3 && aVar.f17913H))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i4) {
            List<a> list = this.f17909b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f17909b.get(size);
                if (aVar.f17910E == i4) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i4) {
            int[] iArr = this.f17908a;
            if (iArr != null && i4 < iArr.length) {
                return iArr[i4];
            }
            return -1;
        }

        int h(int i4) {
            int[] iArr = this.f17908a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            int i5 = i(i4);
            if (i5 == -1) {
                int[] iArr2 = this.f17908a;
                Arrays.fill(iArr2, i4, iArr2.length, -1);
                return this.f17908a.length;
            }
            int min = Math.min(i5 + 1, this.f17908a.length);
            Arrays.fill(this.f17908a, i4, min, -1);
            return min;
        }

        void j(int i4, int i5) {
            int[] iArr = this.f17908a;
            if (iArr != null && i4 < iArr.length) {
                int i6 = i4 + i5;
                c(i6);
                int[] iArr2 = this.f17908a;
                System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
                Arrays.fill(this.f17908a, i4, i6, -1);
                l(i4, i5);
            }
        }

        void k(int i4, int i5) {
            int[] iArr = this.f17908a;
            if (iArr != null && i4 < iArr.length) {
                int i6 = i4 + i5;
                c(i6);
                int[] iArr2 = this.f17908a;
                System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
                int[] iArr3 = this.f17908a;
                Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
                m(i4, i5);
            }
        }

        void n(int i4, f fVar) {
            c(i4);
            this.f17908a[i4] = fVar.f17929e;
        }

        int o(int i4) {
            int length = this.f17908a.length;
            while (length <= i4) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0167a();

            /* renamed from: E, reason: collision with root package name */
            int f17910E;

            /* renamed from: F, reason: collision with root package name */
            int f17911F;

            /* renamed from: G, reason: collision with root package name */
            int[] f17912G;

            /* renamed from: H, reason: collision with root package name */
            boolean f17913H;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0167a implements Parcelable.Creator<a> {
                C0167a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i4) {
                    return new a[i4];
                }
            }

            a(Parcel parcel) {
                this.f17910E = parcel.readInt();
                this.f17911F = parcel.readInt();
                this.f17913H = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f17912G = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i4) {
                int[] iArr = this.f17912G;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i4];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f17910E + ", mGapDir=" + this.f17911F + ", mHasUnwantedGapAfter=" + this.f17913H + ", mGapPerSpan=" + Arrays.toString(this.f17912G) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f17910E);
                parcel.writeInt(this.f17911F);
                parcel.writeInt(this.f17913H ? 1 : 0);
                int[] iArr = this.f17912G;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f17912G);
                } else {
                    parcel.writeInt(0);
                }
            }

            a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i4, int i5) {
        this.f17892w = i5;
        r3(i4);
        this.f17894y = new q();
        y2();
    }
}
