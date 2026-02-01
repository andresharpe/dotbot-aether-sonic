package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.h0;
import androidx.annotation.j0;
import androidx.recyclerview.widget.H;
import androidx.recyclerview.widget.I;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0959e<T> {

    /* renamed from: s, reason: collision with root package name */
    static final String f17978s = "AsyncListUtil";

    /* renamed from: t, reason: collision with root package name */
    static final boolean f17979t = false;

    /* renamed from: a, reason: collision with root package name */
    final Class<T> f17980a;

    /* renamed from: b, reason: collision with root package name */
    final int f17981b;

    /* renamed from: c, reason: collision with root package name */
    final c<T> f17982c;

    /* renamed from: d, reason: collision with root package name */
    final d f17983d;

    /* renamed from: e, reason: collision with root package name */
    final I<T> f17984e;

    /* renamed from: f, reason: collision with root package name */
    final H.b<T> f17985f;

    /* renamed from: g, reason: collision with root package name */
    final H.a<T> f17986g;

    /* renamed from: k, reason: collision with root package name */
    boolean f17990k;

    /* renamed from: q, reason: collision with root package name */
    private final H.b<T> f17996q;

    /* renamed from: r, reason: collision with root package name */
    private final H.a<T> f17997r;

    /* renamed from: h, reason: collision with root package name */
    final int[] f17987h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    final int[] f17988i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    final int[] f17989j = new int[2];

    /* renamed from: l, reason: collision with root package name */
    private int f17991l = 0;

    /* renamed from: m, reason: collision with root package name */
    int f17992m = 0;

    /* renamed from: n, reason: collision with root package name */
    int f17993n = 0;

    /* renamed from: o, reason: collision with root package name */
    int f17994o = 0;

    /* renamed from: p, reason: collision with root package name */
    final SparseIntArray f17995p = new SparseIntArray();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    class a implements H.b<T> {
        a() {
        }

        private boolean d(int i4) {
            if (i4 == C0959e.this.f17994o) {
                return true;
            }
            return false;
        }

        private void e() {
            for (int i4 = 0; i4 < C0959e.this.f17984e.f(); i4++) {
                C0959e c0959e = C0959e.this;
                c0959e.f17986g.b(c0959e.f17984e.c(i4));
            }
            C0959e.this.f17984e.b();
        }

        @Override // androidx.recyclerview.widget.H.b
        public void a(int i4, I.a<T> aVar) {
            if (!d(i4)) {
                C0959e.this.f17986g.b(aVar);
                return;
            }
            I.a<T> a4 = C0959e.this.f17984e.a(aVar);
            if (a4 != null) {
                Log.e(C0959e.f17978s, "duplicate tile @" + a4.f17489b);
                C0959e.this.f17986g.b(a4);
            }
            int i5 = aVar.f17489b + aVar.f17490c;
            int i6 = 0;
            while (i6 < C0959e.this.f17995p.size()) {
                int keyAt = C0959e.this.f17995p.keyAt(i6);
                if (aVar.f17489b <= keyAt && keyAt < i5) {
                    C0959e.this.f17995p.removeAt(i6);
                    C0959e.this.f17983d.d(keyAt);
                } else {
                    i6++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.H.b
        public void b(int i4, int i5) {
            if (!d(i4)) {
                return;
            }
            I.a<T> e4 = C0959e.this.f17984e.e(i5);
            if (e4 == null) {
                Log.e(C0959e.f17978s, "tile not found @" + i5);
                return;
            }
            C0959e.this.f17986g.b(e4);
        }

        @Override // androidx.recyclerview.widget.H.b
        public void c(int i4, int i5) {
            if (!d(i4)) {
                return;
            }
            C0959e c0959e = C0959e.this;
            c0959e.f17992m = i5;
            c0959e.f17983d.c();
            C0959e c0959e2 = C0959e.this;
            c0959e2.f17993n = c0959e2.f17994o;
            e();
            C0959e c0959e3 = C0959e.this;
            c0959e3.f17990k = false;
            c0959e3.g();
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    class b implements H.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private I.a<T> f17999a;

        /* renamed from: b, reason: collision with root package name */
        final SparseBooleanArray f18000b = new SparseBooleanArray();

        /* renamed from: c, reason: collision with root package name */
        private int f18001c;

        /* renamed from: d, reason: collision with root package name */
        private int f18002d;

        /* renamed from: e, reason: collision with root package name */
        private int f18003e;

        /* renamed from: f, reason: collision with root package name */
        private int f18004f;

        b() {
        }

        private I.a<T> e() {
            I.a<T> aVar = this.f17999a;
            if (aVar != null) {
                this.f17999a = aVar.f17491d;
                return aVar;
            }
            C0959e c0959e = C0959e.this;
            return new I.a<>(c0959e.f17980a, c0959e.f17981b);
        }

        private void f(I.a<T> aVar) {
            this.f18000b.put(aVar.f17489b, true);
            C0959e.this.f17985f.a(this.f18001c, aVar);
        }

        private void g(int i4) {
            int b4 = C0959e.this.f17982c.b();
            while (this.f18000b.size() >= b4) {
                int keyAt = this.f18000b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f18000b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i5 = this.f18003e - keyAt;
                int i6 = keyAt2 - this.f18004f;
                if (i5 > 0 && (i5 >= i6 || i4 == 2)) {
                    k(keyAt);
                } else if (i6 > 0) {
                    if (i5 < i6 || i4 == 1) {
                        k(keyAt2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        private int h(int i4) {
            return i4 - (i4 % C0959e.this.f17981b);
        }

        private boolean i(int i4) {
            return this.f18000b.get(i4);
        }

        private void j(String str, Object... objArr) {
            Log.d(C0959e.f17978s, "[BKGR] " + String.format(str, objArr));
        }

        private void k(int i4) {
            this.f18000b.delete(i4);
            C0959e.this.f17985f.b(this.f18001c, i4);
        }

        private void l(int i4, int i5, int i6, boolean z3) {
            int i7;
            int i8 = i4;
            while (i8 <= i5) {
                if (z3) {
                    i7 = (i5 + i4) - i8;
                } else {
                    i7 = i8;
                }
                C0959e.this.f17986g.c(i7, i6);
                i8 += C0959e.this.f17981b;
            }
        }

        @Override // androidx.recyclerview.widget.H.a
        public void a(int i4, int i5, int i6, int i7, int i8) {
            if (i4 > i5) {
                return;
            }
            int h4 = h(i4);
            int h5 = h(i5);
            this.f18003e = h(i6);
            int h6 = h(i7);
            this.f18004f = h6;
            if (i8 == 1) {
                l(this.f18003e, h5, i8, true);
                l(h5 + C0959e.this.f17981b, this.f18004f, i8, false);
            } else {
                l(h4, h6, i8, false);
                l(this.f18003e, h4 - C0959e.this.f17981b, i8, true);
            }
        }

        @Override // androidx.recyclerview.widget.H.a
        public void b(I.a<T> aVar) {
            C0959e.this.f17982c.c(aVar.f17488a, aVar.f17490c);
            aVar.f17491d = this.f17999a;
            this.f17999a = aVar;
        }

        @Override // androidx.recyclerview.widget.H.a
        public void c(int i4, int i5) {
            if (i(i4)) {
                return;
            }
            I.a<T> e4 = e();
            e4.f17489b = i4;
            int min = Math.min(C0959e.this.f17981b, this.f18002d - i4);
            e4.f17490c = min;
            C0959e.this.f17982c.a(e4.f17488a, e4.f17489b, min);
            g(i5);
            f(e4);
        }

        @Override // androidx.recyclerview.widget.H.a
        public void d(int i4) {
            this.f18001c = i4;
            this.f18000b.clear();
            int d4 = C0959e.this.f17982c.d();
            this.f18002d = d4;
            C0959e.this.f17985f.c(this.f18001c, d4);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    public static abstract class c<T> {
        @j0
        public abstract void a(@N T[] tArr, int i4, int i5);

        @j0
        public int b() {
            return 10;
        }

        @j0
        public void c(@N T[] tArr, int i4) {
        }

        @j0
        public abstract int d();
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f18006a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f18007b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f18008c = 2;

        @h0
        public void a(@N int[] iArr, @N int[] iArr2, int i4) {
            int i5;
            int i6 = iArr[1];
            int i7 = iArr[0];
            int i8 = (i6 - i7) + 1;
            int i9 = i8 / 2;
            if (i4 == 1) {
                i5 = i8;
            } else {
                i5 = i9;
            }
            iArr2[0] = i7 - i5;
            if (i4 != 2) {
                i8 = i9;
            }
            iArr2[1] = i6 + i8;
        }

        @h0
        public abstract void b(@N int[] iArr);

        @h0
        public abstract void c();

        @h0
        public abstract void d(int i4);
    }

    public C0959e(@N Class<T> cls, int i4, @N c<T> cVar, @N d dVar) {
        a aVar = new a();
        this.f17996q = aVar;
        b bVar = new b();
        this.f17997r = bVar;
        this.f17980a = cls;
        this.f17981b = i4;
        this.f17982c = cVar;
        this.f17983d = dVar;
        this.f17984e = new I<>(i4);
        v vVar = new v();
        this.f17985f = vVar.b(aVar);
        this.f17986g = vVar.a(bVar);
        f();
    }

    private boolean c() {
        if (this.f17994o != this.f17993n) {
            return true;
        }
        return false;
    }

    @P
    public T a(int i4) {
        if (i4 >= 0 && i4 < this.f17992m) {
            T d4 = this.f17984e.d(i4);
            if (d4 == null && !c()) {
                this.f17995p.put(i4, 0);
            }
            return d4;
        }
        throw new IndexOutOfBoundsException(i4 + " is not within 0 and " + this.f17992m);
    }

    public int b() {
        return this.f17992m;
    }

    void d(String str, Object... objArr) {
        Log.d(f17978s, "[MAIN] " + String.format(str, objArr));
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.f17990k = true;
    }

    public void f() {
        this.f17995p.clear();
        H.a<T> aVar = this.f17986g;
        int i4 = this.f17994o + 1;
        this.f17994o = i4;
        aVar.d(i4);
    }

    void g() {
        int i4;
        this.f17983d.b(this.f17987h);
        int[] iArr = this.f17987h;
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (i5 > i6 || i5 < 0 || i6 >= this.f17992m) {
            return;
        }
        if (!this.f17990k) {
            this.f17991l = 0;
        } else {
            int[] iArr2 = this.f17988i;
            if (i5 <= iArr2[1] && (i4 = iArr2[0]) <= i6) {
                if (i5 < i4) {
                    this.f17991l = 1;
                } else if (i5 > i4) {
                    this.f17991l = 2;
                }
            } else {
                this.f17991l = 0;
            }
        }
        int[] iArr3 = this.f17988i;
        iArr3[0] = i5;
        iArr3[1] = i6;
        this.f17983d.a(iArr, this.f17989j, this.f17991l);
        int[] iArr4 = this.f17989j;
        iArr4[0] = Math.min(this.f17987h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f17989j;
        iArr5[1] = Math.max(this.f17987h[1], Math.min(iArr5[1], this.f17992m - 1));
        H.a<T> aVar = this.f17986g;
        int[] iArr6 = this.f17987h;
        int i7 = iArr6[0];
        int i8 = iArr6[1];
        int[] iArr7 = this.f17989j;
        aVar.a(i7, i8, iArr7[0], iArr7[1], this.f17991l);
    }
}
