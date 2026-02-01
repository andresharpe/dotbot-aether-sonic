package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends RecyclerView.t {

    /* renamed from: n, reason: collision with root package name */
    private static final int f20701n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f20702o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f20703p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f20704q = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final int f20705r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f20706s = -1;

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.j f20707a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final ViewPager2 f20708b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final RecyclerView f20709c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final LinearLayoutManager f20710d;

    /* renamed from: e, reason: collision with root package name */
    private int f20711e;

    /* renamed from: f, reason: collision with root package name */
    private int f20712f;

    /* renamed from: g, reason: collision with root package name */
    private a f20713g;

    /* renamed from: h, reason: collision with root package name */
    private int f20714h;

    /* renamed from: i, reason: collision with root package name */
    private int f20715i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20716j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20717k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20718l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20719m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f20720a;

        /* renamed from: b, reason: collision with root package name */
        float f20721b;

        /* renamed from: c, reason: collision with root package name */
        int f20722c;

        a() {
        }

        void a() {
            this.f20720a = -1;
            this.f20721b = 0.0f;
            this.f20722c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(@N ViewPager2 viewPager2) {
        this.f20708b = viewPager2;
        RecyclerView recyclerView = viewPager2.f20653N;
        this.f20709c = recyclerView;
        this.f20710d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f20713g = new a();
        q();
    }

    private void c(int i4, float f4, int i5) {
        ViewPager2.j jVar = this.f20707a;
        if (jVar != null) {
            jVar.b(i4, f4, i5);
        }
    }

    private void d(int i4) {
        ViewPager2.j jVar = this.f20707a;
        if (jVar != null) {
            jVar.c(i4);
        }
    }

    private void e(int i4) {
        if ((this.f20711e == 3 && this.f20712f == 0) || this.f20712f == i4) {
            return;
        }
        this.f20712f = i4;
        ViewPager2.j jVar = this.f20707a;
        if (jVar != null) {
            jVar.a(i4);
        }
    }

    private int f() {
        return this.f20710d.x2();
    }

    private boolean l() {
        int i4 = this.f20711e;
        if (i4 == 1 || i4 == 4) {
            return true;
        }
        return false;
    }

    private void q() {
        this.f20711e = 0;
        this.f20712f = 0;
        this.f20713g.a();
        this.f20714h = -1;
        this.f20715i = -1;
        this.f20716j = false;
        this.f20717k = false;
        this.f20719m = false;
        this.f20718l = false;
    }

    private void s(boolean z3) {
        int i4;
        this.f20719m = z3;
        if (z3) {
            i4 = 4;
        } else {
            i4 = 1;
        }
        this.f20711e = i4;
        int i5 = this.f20715i;
        if (i5 != -1) {
            this.f20714h = i5;
            this.f20715i = -1;
        } else if (this.f20714h == -1) {
            this.f20714h = f();
        }
        e(1);
    }

    private void t() {
        int top;
        float f4;
        a aVar = this.f20713g;
        int x22 = this.f20710d.x2();
        aVar.f20720a = x22;
        if (x22 == -1) {
            aVar.a();
            return;
        }
        View J3 = this.f20710d.J(x22);
        if (J3 == null) {
            aVar.a();
            return;
        }
        int j02 = this.f20710d.j0(J3);
        int u02 = this.f20710d.u0(J3);
        int x02 = this.f20710d.x0(J3);
        int O3 = this.f20710d.O(J3);
        ViewGroup.LayoutParams layoutParams = J3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            j02 += marginLayoutParams.leftMargin;
            u02 += marginLayoutParams.rightMargin;
            x02 += marginLayoutParams.topMargin;
            O3 += marginLayoutParams.bottomMargin;
        }
        int height = J3.getHeight() + x02 + O3;
        int width = J3.getWidth() + j02 + u02;
        if (this.f20710d.M2() == 0) {
            top = (J3.getLeft() - j02) - this.f20709c.getPaddingLeft();
            if (this.f20708b.k()) {
                top = -top;
            }
            height = width;
        } else {
            top = (J3.getTop() - x02) - this.f20709c.getPaddingTop();
        }
        int i4 = -top;
        aVar.f20722c = i4;
        if (i4 < 0) {
            if (new androidx.viewpager2.widget.a(this.f20710d).d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f20722c)));
        }
        if (height == 0) {
            f4 = 0.0f;
        } else {
            f4 = i4 / height;
        }
        aVar.f20721b = f4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(@N RecyclerView recyclerView, int i4) {
        if ((this.f20711e != 1 || this.f20712f != 1) && i4 == 1) {
            s(false);
            return;
        }
        if (l() && i4 == 2) {
            if (this.f20717k) {
                e(2);
                this.f20716j = true;
                return;
            }
            return;
        }
        if (l() && i4 == 0) {
            t();
            if (!this.f20717k) {
                int i5 = this.f20713g.f20720a;
                if (i5 != -1) {
                    c(i5, 0.0f, 0);
                }
            } else {
                a aVar = this.f20713g;
                if (aVar.f20722c == 0) {
                    int i6 = this.f20714h;
                    int i7 = aVar.f20720a;
                    if (i6 != i7) {
                        d(i7);
                    }
                }
            }
            e(0);
            q();
        }
        if (this.f20711e == 2 && i4 == 0 && this.f20718l) {
            t();
            a aVar2 = this.f20713g;
            if (aVar2.f20722c == 0) {
                int i8 = this.f20715i;
                int i9 = aVar2.f20720a;
                if (i8 != i9) {
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    d(i9);
                }
                e(0);
                q();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r5 == r3.f20708b.k()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(@androidx.annotation.N androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f20717k = r4
            r3.t()
            boolean r0 = r3.f20716j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f20716j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f20708b
            boolean r6 = r6.k()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.g$a r5 = r3.f20713g
            int r6 = r5.f20722c
            if (r6 == 0) goto L29
            int r5 = r5.f20720a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.g$a r5 = r3.f20713g
            int r5 = r5.f20720a
        L2d:
            r3.f20715i = r5
            int r6 = r3.f20714h
            if (r6 == r5) goto L45
            r3.d(r5)
            goto L45
        L37:
            int r5 = r3.f20711e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.g$a r5 = r3.f20713g
            int r5 = r5.f20720a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.d(r5)
        L45:
            androidx.viewpager2.widget.g$a r5 = r3.f20713g
            int r6 = r5.f20720a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f20721b
            int r5 = r5.f20722c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.g$a r5 = r3.f20713g
            int r6 = r5.f20720a
            int r0 = r3.f20715i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f20722c
            if (r5 != 0) goto L6b
            int r5 = r3.f20712f
            if (r5 == r4) goto L6b
            r3.e(r2)
            r3.q()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double g() {
        t();
        a aVar = this.f20713g;
        return aVar.f20720a + aVar.f20721b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f20712f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        if (this.f20712f == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f20719m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        if (this.f20712f == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        this.f20711e = 4;
        s(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        this.f20718l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (i() && !this.f20719m) {
            return;
        }
        this.f20719m = false;
        t();
        a aVar = this.f20713g;
        if (aVar.f20722c == 0) {
            int i4 = aVar.f20720a;
            if (i4 != this.f20714h) {
                d(i4);
            }
            e(0);
            q();
            return;
        }
        e(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i4, boolean z3) {
        int i5;
        if (z3) {
            i5 = 2;
        } else {
            i5 = 3;
        }
        this.f20711e = i5;
        boolean z4 = false;
        this.f20719m = false;
        if (this.f20715i != i4) {
            z4 = true;
        }
        this.f20715i = i4;
        e(2);
        if (z4) {
            d(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(ViewPager2.j jVar) {
        this.f20707a = jVar;
    }
}
