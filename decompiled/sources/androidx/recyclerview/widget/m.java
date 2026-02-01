package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: I, reason: collision with root package name */
    static final ThreadLocal<m> f18181I = new ThreadLocal<>();

    /* renamed from: J, reason: collision with root package name */
    static Comparator<c> f18182J = new a();

    /* renamed from: F, reason: collision with root package name */
    long f18184F;

    /* renamed from: G, reason: collision with root package name */
    long f18185G;

    /* renamed from: E, reason: collision with root package name */
    ArrayList<RecyclerView> f18183E = new ArrayList<>();

    /* renamed from: H, reason: collision with root package name */
    private ArrayList<c> f18186H = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            boolean z3;
            boolean z4;
            RecyclerView recyclerView = cVar.f18194d;
            if (recyclerView == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cVar2.f18194d == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 != z4) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z5 = cVar.f18191a;
            if (z5 != cVar2.f18191a) {
                if (!z5) {
                    return 1;
                }
                return -1;
            }
            int i4 = cVar2.f18192b - cVar.f18192b;
            if (i4 != 0) {
                return i4;
            }
            int i5 = cVar.f18193c - cVar2.f18193c;
            if (i5 == 0) {
                return 0;
            }
            return i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        int f18187a;

        /* renamed from: b, reason: collision with root package name */
        int f18188b;

        /* renamed from: c, reason: collision with root package name */
        int[] f18189c;

        /* renamed from: d, reason: collision with root package name */
        int f18190d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i4, int i5) {
            if (i4 >= 0) {
                if (i5 >= 0) {
                    int i6 = this.f18190d;
                    int i7 = i6 * 2;
                    int[] iArr = this.f18189c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f18189c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i7 >= iArr.length) {
                        int[] iArr3 = new int[i6 * 4];
                        this.f18189c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f18189c;
                    iArr4[i7] = i4;
                    iArr4[i7 + 1] = i5;
                    this.f18190d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f18189c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f18190d = 0;
        }

        void c(RecyclerView recyclerView, boolean z3) {
            this.f18190d = 0;
            int[] iArr = this.f18189c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f17660Q;
            if (recyclerView.f17658P != null && oVar != null && oVar.I0()) {
                if (z3) {
                    if (!recyclerView.f17642H.q()) {
                        oVar.s(recyclerView.f17658P.l(), this);
                    }
                } else if (!recyclerView.D0()) {
                    oVar.r(this.f18187a, this.f18188b, recyclerView.f17653M0, this);
                }
                int i4 = this.f18190d;
                if (i4 > oVar.f17828m) {
                    oVar.f17828m = i4;
                    oVar.f17829n = z3;
                    recyclerView.f17638F.L();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(int i4) {
            if (this.f18189c != null) {
                int i5 = this.f18190d * 2;
                for (int i6 = 0; i6 < i5; i6 += 2) {
                    if (this.f18189c[i6] == i4) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i4, int i5) {
            this.f18187a = i4;
            this.f18188b = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18191a;

        /* renamed from: b, reason: collision with root package name */
        public int f18192b;

        /* renamed from: c, reason: collision with root package name */
        public int f18193c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f18194d;

        /* renamed from: e, reason: collision with root package name */
        public int f18195e;

        c() {
        }

        public void a() {
            this.f18191a = false;
            this.f18192b = 0;
            this.f18193c = 0;
            this.f18194d = null;
            this.f18195e = 0;
        }
    }

    private void b() {
        c cVar;
        boolean z3;
        int size = this.f18183E.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView = this.f18183E.get(i5);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f17651L0.c(recyclerView, false);
                i4 += recyclerView.f17651L0.f18190d;
            }
        }
        this.f18186H.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = this.f18183E.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f17651L0;
                int abs = Math.abs(bVar.f18187a) + Math.abs(bVar.f18188b);
                for (int i8 = 0; i8 < bVar.f18190d * 2; i8 += 2) {
                    if (i6 >= this.f18186H.size()) {
                        cVar = new c();
                        this.f18186H.add(cVar);
                    } else {
                        cVar = this.f18186H.get(i6);
                    }
                    int[] iArr = bVar.f18189c;
                    int i9 = iArr[i8 + 1];
                    if (i9 <= abs) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f18191a = z3;
                    cVar.f18192b = abs;
                    cVar.f18193c = i9;
                    cVar.f18194d = recyclerView2;
                    cVar.f18195e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(this.f18186H, f18182J);
    }

    private void c(c cVar, long j4) {
        long j5;
        if (cVar.f18191a) {
            j5 = Long.MAX_VALUE;
        } else {
            j5 = j4;
        }
        RecyclerView.F i4 = i(cVar.f18194d, cVar.f18195e, j5);
        if (i4 != null && i4.f17771b != null && i4.w() && !i4.x()) {
            h(i4.f17771b.get(), j4);
        }
    }

    private void d(long j4) {
        for (int i4 = 0; i4 < this.f18186H.size(); i4++) {
            c cVar = this.f18186H.get(i4);
            if (cVar.f18194d != null) {
                c(cVar, j4);
                cVar.a();
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i4) {
        int j4 = recyclerView.f17644I.j();
        for (int i5 = 0; i5 < j4; i5++) {
            RecyclerView.F u02 = RecyclerView.u0(recyclerView.f17644I.i(i5));
            if (u02.f17772c == i4 && !u02.x()) {
                return true;
            }
        }
        return false;
    }

    private void h(@P RecyclerView recyclerView, long j4) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f17694l0 && recyclerView.f17644I.j() != 0) {
            recyclerView.q1();
        }
        b bVar = recyclerView.f17651L0;
        bVar.c(recyclerView, true);
        if (bVar.f18190d != 0) {
            try {
                androidx.core.os.L.b("RV Nested Prefetch");
                recyclerView.f17653M0.k(recyclerView.f17658P);
                for (int i4 = 0; i4 < bVar.f18190d * 2; i4 += 2) {
                    i(recyclerView, bVar.f18189c[i4], j4);
                }
            } finally {
                androidx.core.os.L.d();
            }
        }
    }

    private RecyclerView.F i(RecyclerView recyclerView, int i4, long j4) {
        if (e(recyclerView, i4)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f17638F;
        try {
            recyclerView.c1();
            RecyclerView.F J3 = wVar.J(i4, false, j4);
            if (J3 != null) {
                if (J3.w() && !J3.x()) {
                    wVar.C(J3.f17770a);
                } else {
                    wVar.a(J3, false);
                }
            }
            recyclerView.e1(false);
            return J3;
        } catch (Throwable th) {
            recyclerView.e1(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f18183E.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow() && this.f18184F == 0) {
            this.f18184F = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f17651L0.e(i4, i5);
    }

    void g(long j4) {
        b();
        d(j4);
    }

    public void j(RecyclerView recyclerView) {
        this.f18183E.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.L.b("RV Prefetch");
            if (!this.f18183E.isEmpty()) {
                int size = this.f18183E.size();
                long j4 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = this.f18183E.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j4) + this.f18185G);
                    this.f18184F = 0L;
                    androidx.core.os.L.d();
                }
            }
        } finally {
            this.f18184F = 0L;
            androidx.core.os.L.d();
        }
    }
}
