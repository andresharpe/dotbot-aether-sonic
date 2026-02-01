package androidx.recyclerview.widget;

import androidx.core.util.t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955a implements x.a {

    /* renamed from: i, reason: collision with root package name */
    static final int f17931i = 0;

    /* renamed from: j, reason: collision with root package name */
    static final int f17932j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f17933k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final String f17934l = "AHT";

    /* renamed from: a, reason: collision with root package name */
    private t.a<b> f17935a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f17936b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f17937c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0168a f17938d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f17939e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f17940f;

    /* renamed from: g, reason: collision with root package name */
    final x f17941g;

    /* renamed from: h, reason: collision with root package name */
    private int f17942h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0168a {
        void a(int i4, int i5);

        void b(b bVar);

        void c(int i4, int i5, Object obj);

        void d(b bVar);

        RecyclerView.F e(int i4);

        void f(int i4, int i5);

        void g(int i4, int i5);

        void h(int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final int f17943e = 1;

        /* renamed from: f, reason: collision with root package name */
        static final int f17944f = 2;

        /* renamed from: g, reason: collision with root package name */
        static final int f17945g = 4;

        /* renamed from: h, reason: collision with root package name */
        static final int f17946h = 8;

        /* renamed from: i, reason: collision with root package name */
        static final int f17947i = 30;

        /* renamed from: a, reason: collision with root package name */
        int f17948a;

        /* renamed from: b, reason: collision with root package name */
        int f17949b;

        /* renamed from: c, reason: collision with root package name */
        Object f17950c;

        /* renamed from: d, reason: collision with root package name */
        int f17951d;

        b(int i4, int i5, int i6, Object obj) {
            this.f17948a = i4;
            this.f17949b = i5;
            this.f17951d = i6;
            this.f17950c = obj;
        }

        String a() {
            int i4 = this.f17948a;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 != 8) {
                            return "??";
                        }
                        return "mv";
                    }
                    return "up";
                }
                return "rm";
            }
            return com.google.android.gms.analytics.ecommerce.b.f27773d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i4 = this.f17948a;
            if (i4 != bVar.f17948a) {
                return false;
            }
            if (i4 == 8 && Math.abs(this.f17951d - this.f17949b) == 1 && this.f17951d == bVar.f17949b && this.f17949b == bVar.f17951d) {
                return true;
            }
            if (this.f17951d != bVar.f17951d || this.f17949b != bVar.f17949b) {
                return false;
            }
            Object obj2 = this.f17950c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f17950c)) {
                    return false;
                }
            } else if (bVar.f17950c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f17948a * 31) + this.f17949b) * 31) + this.f17951d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f17949b + "c:" + this.f17951d + ",p:" + this.f17950c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0955a(InterfaceC0168a interfaceC0168a) {
        this(interfaceC0168a, false);
    }

    private int A(int i4, int i5) {
        int i6;
        int i7;
        for (int size = this.f17937c.size() - 1; size >= 0; size--) {
            b bVar = this.f17937c.get(size);
            int i8 = bVar.f17948a;
            if (i8 == 8) {
                int i9 = bVar.f17949b;
                int i10 = bVar.f17951d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 >= i7 && i4 <= i6) {
                    if (i7 == i9) {
                        if (i5 == 1) {
                            bVar.f17951d = i10 + 1;
                        } else if (i5 == 2) {
                            bVar.f17951d = i10 - 1;
                        }
                        i4++;
                    } else {
                        if (i5 == 1) {
                            bVar.f17949b = i9 + 1;
                        } else if (i5 == 2) {
                            bVar.f17949b = i9 - 1;
                        }
                        i4--;
                    }
                } else if (i4 < i9) {
                    if (i5 == 1) {
                        bVar.f17949b = i9 + 1;
                        bVar.f17951d = i10 + 1;
                    } else if (i5 == 2) {
                        bVar.f17949b = i9 - 1;
                        bVar.f17951d = i10 - 1;
                    }
                }
            } else {
                int i11 = bVar.f17949b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= bVar.f17951d;
                    } else if (i8 == 2) {
                        i4 += bVar.f17951d;
                    }
                } else if (i5 == 1) {
                    bVar.f17949b = i11 + 1;
                } else if (i5 == 2) {
                    bVar.f17949b = i11 - 1;
                }
            }
        }
        for (int size2 = this.f17937c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f17937c.get(size2);
            if (bVar2.f17948a == 8) {
                int i12 = bVar2.f17951d;
                if (i12 == bVar2.f17949b || i12 < 0) {
                    this.f17937c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f17951d <= 0) {
                this.f17937c.remove(size2);
                a(bVar2);
            }
        }
        return i4;
    }

    private void d(b bVar) {
        w(bVar);
    }

    private void e(b bVar) {
        w(bVar);
    }

    private void g(b bVar) {
        boolean z3;
        char c4;
        int i4 = bVar.f17949b;
        int i5 = bVar.f17951d + i4;
        char c5 = 65535;
        int i6 = i4;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f17938d.e(i6) == null && !i(i6)) {
                if (c5 == 1) {
                    w(b(2, i4, i7, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                c4 = 0;
            } else {
                if (c5 == 0) {
                    l(b(2, i4, i7, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                c4 = 1;
            }
            if (z3) {
                i6 -= i7;
                i5 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
            c5 = c4;
        }
        if (i7 != bVar.f17951d) {
            a(bVar);
            bVar = b(2, i4, i7, null);
        }
        if (c5 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private void h(b bVar) {
        int i4 = bVar.f17949b;
        int i5 = bVar.f17951d + i4;
        int i6 = 0;
        boolean z3 = -1;
        int i7 = i4;
        while (i4 < i5) {
            if (this.f17938d.e(i4) == null && !i(i4)) {
                if (z3) {
                    w(b(4, i7, i6, bVar.f17950c));
                    i7 = i4;
                    i6 = 0;
                }
                z3 = false;
            } else {
                if (!z3) {
                    l(b(4, i7, i6, bVar.f17950c));
                    i7 = i4;
                    i6 = 0;
                }
                z3 = true;
            }
            i6++;
            i4++;
        }
        if (i6 != bVar.f17951d) {
            Object obj = bVar.f17950c;
            a(bVar);
            bVar = b(4, i7, i6, obj);
        }
        if (!z3) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private boolean i(int i4) {
        int size = this.f17937c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f17937c.get(i5);
            int i6 = bVar.f17948a;
            if (i6 == 8) {
                if (o(bVar.f17951d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = bVar.f17949b;
                int i8 = bVar.f17951d + i7;
                while (i7 < i8) {
                    if (o(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void l(b bVar) {
        int i4;
        int i5 = bVar.f17948a;
        if (i5 != 1 && i5 != 8) {
            int A3 = A(bVar.f17949b, i5);
            int i6 = bVar.f17949b;
            int i7 = bVar.f17948a;
            if (i7 != 2) {
                if (i7 == 4) {
                    i4 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i4 = 0;
            }
            int i8 = 1;
            for (int i9 = 1; i9 < bVar.f17951d; i9++) {
                int A4 = A(bVar.f17949b + (i4 * i9), bVar.f17948a);
                int i10 = bVar.f17948a;
                if (i10 == 2 ? A4 == A3 : !(i10 != 4 || A4 != A3 + 1)) {
                    i8++;
                } else {
                    b b4 = b(i10, A3, i8, bVar.f17950c);
                    m(b4, i6);
                    a(b4);
                    if (bVar.f17948a == 4) {
                        i6 += i8;
                    }
                    i8 = 1;
                    A3 = A4;
                }
            }
            Object obj = bVar.f17950c;
            a(bVar);
            if (i8 > 0) {
                b b5 = b(bVar.f17948a, A3, i8, obj);
                m(b5, i6);
                a(b5);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void w(b bVar) {
        this.f17937c.add(bVar);
        int i4 = bVar.f17948a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 == 8) {
                        this.f17938d.a(bVar.f17949b, bVar.f17951d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                this.f17938d.c(bVar.f17949b, bVar.f17951d, bVar.f17950c);
                return;
            }
            this.f17938d.f(bVar.f17949b, bVar.f17951d);
            return;
        }
        this.f17938d.g(bVar.f17949b, bVar.f17951d);
    }

    @Override // androidx.recyclerview.widget.x.a
    public void a(b bVar) {
        if (!this.f17940f) {
            bVar.f17950c = null;
            this.f17935a.a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.x.a
    public b b(int i4, int i5, int i6, Object obj) {
        b b4 = this.f17935a.b();
        if (b4 == null) {
            return new b(i4, i5, i6, obj);
        }
        b4.f17948a = i4;
        b4.f17949b = i5;
        b4.f17951d = i6;
        b4.f17950c = obj;
        return b4;
    }

    C0955a c(b... bVarArr) {
        Collections.addAll(this.f17936b, bVarArr);
        return this;
    }

    public int f(int i4) {
        int size = this.f17936b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f17936b.get(i5);
            int i6 = bVar.f17948a;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 8) {
                        int i7 = bVar.f17949b;
                        if (i7 == i4) {
                            i4 = bVar.f17951d;
                        } else {
                            if (i7 < i4) {
                                i4--;
                            }
                            if (bVar.f17951d <= i4) {
                                i4++;
                            }
                        }
                    }
                } else {
                    int i8 = bVar.f17949b;
                    if (i8 <= i4) {
                        int i9 = bVar.f17951d;
                        if (i8 + i9 > i4) {
                            return -1;
                        }
                        i4 -= i9;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.f17949b <= i4) {
                i4 += bVar.f17951d;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        int size = this.f17937c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f17938d.d(this.f17937c.get(i4));
        }
        y(this.f17937c);
        this.f17942h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        j();
        int size = this.f17936b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f17936b.get(i4);
            int i5 = bVar.f17948a;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8) {
                            this.f17938d.d(bVar);
                            this.f17938d.a(bVar.f17949b, bVar.f17951d);
                        }
                    } else {
                        this.f17938d.d(bVar);
                        this.f17938d.c(bVar.f17949b, bVar.f17951d, bVar.f17950c);
                    }
                } else {
                    this.f17938d.d(bVar);
                    this.f17938d.h(bVar.f17949b, bVar.f17951d);
                }
            } else {
                this.f17938d.d(bVar);
                this.f17938d.g(bVar.f17949b, bVar.f17951d);
            }
            Runnable runnable = this.f17939e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f17936b);
        this.f17942h = 0;
    }

    void m(b bVar, int i4) {
        this.f17938d.b(bVar);
        int i5 = bVar.f17948a;
        if (i5 != 2) {
            if (i5 == 4) {
                this.f17938d.c(i4, bVar.f17951d, bVar.f17950c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f17938d.h(i4, bVar.f17951d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n(int i4) {
        return o(i4, 0);
    }

    int o(int i4, int i5) {
        int size = this.f17937c.size();
        while (i5 < size) {
            b bVar = this.f17937c.get(i5);
            int i6 = bVar.f17948a;
            if (i6 == 8) {
                int i7 = bVar.f17949b;
                if (i7 == i4) {
                    i4 = bVar.f17951d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (bVar.f17951d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = bVar.f17949b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = bVar.f17951d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += bVar.f17951d;
                }
            }
            i5++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(int i4) {
        if ((i4 & this.f17942h) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        if (this.f17936b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        if (!this.f17937c.isEmpty() && !this.f17936b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(int i4, int i5, Object obj) {
        if (i5 < 1) {
            return false;
        }
        this.f17936b.add(b(4, i4, i5, obj));
        this.f17942h |= 4;
        if (this.f17936b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f17936b.add(b(1, i4, i5, null));
        this.f17942h |= 1;
        if (this.f17936b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i4, int i5, int i6) {
        if (i4 == i5) {
            return false;
        }
        if (i6 == 1) {
            this.f17936b.add(b(8, i4, i5, null));
            this.f17942h |= 8;
            if (this.f17936b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f17936b.add(b(2, i4, i5, null));
        this.f17942h |= 2;
        if (this.f17936b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        this.f17941g.b(this.f17936b);
        int size = this.f17936b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f17936b.get(i4);
            int i5 = bVar.f17948a;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8) {
                            e(bVar);
                        }
                    } else {
                        h(bVar);
                    }
                } else {
                    g(bVar);
                }
            } else {
                d(bVar);
            }
            Runnable runnable = this.f17939e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f17936b.clear();
    }

    void y(List<b> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a(list.get(i4));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        y(this.f17936b);
        y(this.f17937c);
        this.f17942h = 0;
    }

    C0955a(InterfaceC0168a interfaceC0168a, boolean z3) {
        this.f17935a = new t.b(30);
        this.f17936b = new ArrayList<>();
        this.f17937c = new ArrayList<>();
        this.f17942h = 0;
        this.f17938d = interfaceC0168a;
        this.f17940f = z3;
        this.f17941g = new x(this);
    }
}
