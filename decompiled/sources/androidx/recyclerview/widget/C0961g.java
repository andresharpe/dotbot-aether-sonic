package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0961g {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f18018d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final String f18019e = "ChildrenHelper";

    /* renamed from: a, reason: collision with root package name */
    final b f18020a;

    /* renamed from: b, reason: collision with root package name */
    final a f18021b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f18022c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        static final int f18023c = 64;

        /* renamed from: d, reason: collision with root package name */
        static final long f18024d = Long.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        long f18025a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f18026b;

        a() {
        }

        private void c() {
            if (this.f18026b == null) {
                this.f18026b = new a();
            }
        }

        void a(int i4) {
            if (i4 >= 64) {
                a aVar = this.f18026b;
                if (aVar != null) {
                    aVar.a(i4 - 64);
                    return;
                }
                return;
            }
            this.f18025a &= ~(1 << i4);
        }

        int b(int i4) {
            a aVar = this.f18026b;
            if (aVar == null) {
                if (i4 >= 64) {
                    return Long.bitCount(this.f18025a);
                }
                return Long.bitCount(this.f18025a & ((1 << i4) - 1));
            }
            if (i4 < 64) {
                return Long.bitCount(this.f18025a & ((1 << i4) - 1));
            }
            return aVar.b(i4 - 64) + Long.bitCount(this.f18025a);
        }

        boolean d(int i4) {
            if (i4 >= 64) {
                c();
                return this.f18026b.d(i4 - 64);
            }
            if ((this.f18025a & (1 << i4)) != 0) {
                return true;
            }
            return false;
        }

        void e(int i4, boolean z3) {
            boolean z4;
            if (i4 >= 64) {
                c();
                this.f18026b.e(i4 - 64, z3);
                return;
            }
            long j4 = this.f18025a;
            if ((Long.MIN_VALUE & j4) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            long j5 = (1 << i4) - 1;
            this.f18025a = ((j4 & (~j5)) << 1) | (j4 & j5);
            if (z3) {
                h(i4);
            } else {
                a(i4);
            }
            if (z4 || this.f18026b != null) {
                c();
                this.f18026b.e(0, z4);
            }
        }

        boolean f(int i4) {
            boolean z3;
            if (i4 >= 64) {
                c();
                return this.f18026b.f(i4 - 64);
            }
            long j4 = 1 << i4;
            long j5 = this.f18025a;
            if ((j5 & j4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long j6 = j5 & (~j4);
            this.f18025a = j6;
            long j7 = j4 - 1;
            this.f18025a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
            a aVar = this.f18026b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f18026b.f(0);
            }
            return z3;
        }

        void g() {
            this.f18025a = 0L;
            a aVar = this.f18026b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i4) {
            if (i4 >= 64) {
                c();
                this.f18026b.h(i4 - 64);
            } else {
                this.f18025a |= 1 << i4;
            }
        }

        public String toString() {
            if (this.f18026b == null) {
                return Long.toBinaryString(this.f18025a);
            }
            return this.f18026b.toString() + "xx" + Long.toBinaryString(this.f18025a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.g$b */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i4);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.F f(View view);

        void g(int i4);

        void h(View view);

        void i(View view, int i4);

        void j(int i4);

        void k(View view, int i4, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0961g(b bVar) {
        this.f18020a = bVar;
    }

    private int h(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int c4 = this.f18020a.c();
        int i5 = i4;
        while (i5 < c4) {
            int b4 = i4 - (i5 - this.f18021b.b(i5));
            if (b4 == 0) {
                while (this.f18021b.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += b4;
        }
        return -1;
    }

    private void l(View view) {
        this.f18022c.add(view);
        this.f18020a.b(view);
    }

    private boolean t(View view) {
        if (this.f18022c.remove(view)) {
            this.f18020a.h(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i4, boolean z3) {
        int h4;
        if (i4 < 0) {
            h4 = this.f18020a.c();
        } else {
            h4 = h(i4);
        }
        this.f18021b.e(h4, z3);
        if (z3) {
            l(view);
        }
        this.f18020a.i(view, h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, boolean z3) {
        a(view, -1, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z3) {
        int h4;
        if (i4 < 0) {
            h4 = this.f18020a.c();
        } else {
            h4 = h(i4);
        }
        this.f18021b.e(h4, z3);
        if (z3) {
            l(view);
        }
        this.f18020a.k(view, h4, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i4) {
        int h4 = h(i4);
        this.f18021b.f(h4);
        this.f18020a.g(h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View e(int i4) {
        int size = this.f18022c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f18022c.get(i5);
            RecyclerView.F f4 = this.f18020a.f(view);
            if (f4.p() == i4 && !f4.x() && !f4.z()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f(int i4) {
        return this.f18020a.a(h(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f18020a.c() - this.f18022c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View i(int i4) {
        return this.f18020a.a(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f18020a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(View view) {
        int e4 = this.f18020a.e(view);
        if (e4 >= 0) {
            this.f18021b.h(e4);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(View view) {
        int e4 = this.f18020a.e(view);
        if (e4 == -1 || this.f18021b.d(e4)) {
            return -1;
        }
        return e4 - this.f18021b.b(e4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f18022c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.f18021b.g();
        for (int size = this.f18022c.size() - 1; size >= 0; size--) {
            this.f18020a.h(this.f18022c.get(size));
            this.f18022c.remove(size);
        }
        this.f18020a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(View view) {
        int e4 = this.f18020a.e(view);
        if (e4 < 0) {
            return;
        }
        if (this.f18021b.f(e4)) {
            t(view);
        }
        this.f18020a.j(e4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i4) {
        int h4 = h(i4);
        View a4 = this.f18020a.a(h4);
        if (a4 == null) {
            return;
        }
        if (this.f18021b.f(h4)) {
            t(a4);
        }
        this.f18020a.j(h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(View view) {
        int e4 = this.f18020a.e(view);
        if (e4 == -1) {
            t(view);
            return true;
        }
        if (this.f18021b.d(e4)) {
            this.f18021b.f(e4);
            t(view);
            this.f18020a.j(e4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(View view) {
        int e4 = this.f18020a.e(view);
        if (e4 >= 0) {
            if (this.f18021b.d(e4)) {
                this.f18021b.a(e4);
                t(view);
                return;
            } else {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f18021b.toString() + ", hidden list:" + this.f18022c.size();
    }
}
