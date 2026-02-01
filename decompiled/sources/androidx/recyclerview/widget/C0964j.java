package androidx.recyclerview.widget;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0964j {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f18090a = new a();

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f18093a - dVar2.f18093a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i4, int i5);

        public abstract boolean b(int i4, int i5);

        @P
        public Object c(int i4, int i5) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f18091a;

        /* renamed from: b, reason: collision with root package name */
        private final int f18092b;

        c(int i4) {
            int[] iArr = new int[i4];
            this.f18091a = iArr;
            this.f18092b = iArr.length / 2;
        }

        int[] a() {
            return this.f18091a;
        }

        public void b(int i4) {
            Arrays.fill(this.f18091a, i4);
        }

        int c(int i4) {
            return this.f18091a[i4 + this.f18092b];
        }

        void d(int i4, int i5) {
            this.f18091a[i4 + this.f18092b] = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f18093a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18094b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18095c;

        d(int i4, int i5, int i6) {
            this.f18093a = i4;
            this.f18094b = i5;
            this.f18095c = i6;
        }

        int a() {
            return this.f18093a + this.f18095c;
        }

        int b() {
            return this.f18094b + this.f18095c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: h, reason: collision with root package name */
        public static final int f18096h = -1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f18097i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f18098j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final int f18099k = 4;

        /* renamed from: l, reason: collision with root package name */
        private static final int f18100l = 8;

        /* renamed from: m, reason: collision with root package name */
        private static final int f18101m = 12;

        /* renamed from: n, reason: collision with root package name */
        private static final int f18102n = 4;

        /* renamed from: o, reason: collision with root package name */
        private static final int f18103o = 15;

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f18104a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f18105b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f18106c;

        /* renamed from: d, reason: collision with root package name */
        private final b f18107d;

        /* renamed from: e, reason: collision with root package name */
        private final int f18108e;

        /* renamed from: f, reason: collision with root package name */
        private final int f18109f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f18110g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z3) {
            this.f18104a = list;
            this.f18105b = iArr;
            this.f18106c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f18107d = bVar;
            this.f18108e = bVar.e();
            this.f18109f = bVar.d();
            this.f18110g = z3;
            a();
            g();
        }

        private void a() {
            d dVar;
            if (this.f18104a.isEmpty()) {
                dVar = null;
            } else {
                dVar = this.f18104a.get(0);
            }
            if (dVar == null || dVar.f18093a != 0 || dVar.f18094b != 0) {
                this.f18104a.add(0, new d(0, 0, 0));
            }
            this.f18104a.add(new d(this.f18108e, this.f18109f, 0));
        }

        private void f(int i4) {
            int i5;
            int size = this.f18104a.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = this.f18104a.get(i7);
                while (i6 < dVar.f18094b) {
                    if (this.f18106c[i6] == 0 && this.f18107d.b(i4, i6)) {
                        if (this.f18107d.a(i4, i6)) {
                            i5 = 8;
                        } else {
                            i5 = 4;
                        }
                        this.f18105b[i4] = (i6 << 4) | i5;
                        this.f18106c[i6] = (i4 << 4) | i5;
                        return;
                    }
                    i6++;
                }
                i6 = dVar.b();
            }
        }

        private void g() {
            int i4;
            for (d dVar : this.f18104a) {
                for (int i5 = 0; i5 < dVar.f18095c; i5++) {
                    int i6 = dVar.f18093a + i5;
                    int i7 = dVar.f18094b + i5;
                    if (this.f18107d.a(i6, i7)) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    this.f18105b[i6] = (i7 << 4) | i4;
                    this.f18106c[i7] = (i6 << 4) | i4;
                }
            }
            if (this.f18110g) {
                h();
            }
        }

        private void h() {
            int i4 = 0;
            for (d dVar : this.f18104a) {
                while (i4 < dVar.f18093a) {
                    if (this.f18105b[i4] == 0) {
                        f(i4);
                    }
                    i4++;
                }
                i4 = dVar.a();
            }
        }

        @P
        private static g i(Collection<g> collection, int i4, boolean z3) {
            g gVar;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = it.next();
                    if (gVar.f18111a == i4 && gVar.f18113c == z3) {
                        it.remove();
                        break;
                    }
                } else {
                    gVar = null;
                    break;
                }
            }
            while (it.hasNext()) {
                g next = it.next();
                if (z3) {
                    next.f18112b--;
                } else {
                    next.f18112b++;
                }
            }
            return gVar;
        }

        public int b(@androidx.annotation.F(from = 0) int i4) {
            if (i4 >= 0 && i4 < this.f18109f) {
                int i5 = this.f18106c[i4];
                if ((i5 & 15) == 0) {
                    return -1;
                }
                return i5 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i4 + ", new list size = " + this.f18109f);
        }

        public int c(@androidx.annotation.F(from = 0) int i4) {
            if (i4 >= 0 && i4 < this.f18108e) {
                int i5 = this.f18105b[i4];
                if ((i5 & 15) == 0) {
                    return -1;
                }
                return i5 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i4 + ", old list size = " + this.f18108e);
        }

        public void d(@N u uVar) {
            C0960f c0960f;
            int i4;
            if (uVar instanceof C0960f) {
                c0960f = (C0960f) uVar;
            } else {
                c0960f = new C0960f(uVar);
            }
            int i5 = this.f18108e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i6 = this.f18108e;
            int i7 = this.f18109f;
            for (int size = this.f18104a.size() - 1; size >= 0; size--) {
                d dVar = this.f18104a.get(size);
                int a4 = dVar.a();
                int b4 = dVar.b();
                while (true) {
                    if (i6 <= a4) {
                        break;
                    }
                    i6--;
                    int i8 = this.f18105b[i6];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g i10 = i(arrayDeque, i9, false);
                        if (i10 != null) {
                            int i11 = (i5 - i10.f18112b) - 1;
                            c0960f.a(i6, i11);
                            if ((i8 & 4) != 0) {
                                c0960f.d(i11, 1, this.f18107d.c(i6, i9));
                            }
                        } else {
                            arrayDeque.add(new g(i6, (i5 - i6) - 1, true));
                        }
                    } else {
                        c0960f.c(i6, 1);
                        i5--;
                    }
                }
                while (i7 > b4) {
                    i7--;
                    int i12 = this.f18106c[i7];
                    if ((i12 & 12) != 0) {
                        int i13 = i12 >> 4;
                        g i14 = i(arrayDeque, i13, true);
                        if (i14 == null) {
                            arrayDeque.add(new g(i7, i5 - i6, false));
                        } else {
                            c0960f.a((i5 - i14.f18112b) - 1, i6);
                            if ((i12 & 4) != 0) {
                                c0960f.d(i6, 1, this.f18107d.c(i13, i7));
                            }
                        }
                    } else {
                        c0960f.b(i6, 1);
                        i5++;
                    }
                }
                int i15 = dVar.f18093a;
                int i16 = dVar.f18094b;
                for (i4 = 0; i4 < dVar.f18095c; i4++) {
                    if ((this.f18105b[i15] & 15) == 2) {
                        c0960f.d(i15, 1, this.f18107d.c(i15, i16));
                    }
                    i15++;
                    i16++;
                }
                i6 = dVar.f18093a;
                i7 = dVar.f18094b;
            }
            c0960f.e();
        }

        public void e(@N RecyclerView.Adapter adapter) {
            d(new C0956b(adapter));
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$f */
    /* loaded from: classes.dex */
    public static abstract class f<T> {
        public abstract boolean a(@N T t3, @N T t4);

        public abstract boolean b(@N T t3, @N T t4);

        @P
        public Object c(@N T t3, @N T t4) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.j$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        int f18111a;

        /* renamed from: b, reason: collision with root package name */
        int f18112b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18113c;

        g(int i4, int i5, boolean z3) {
            this.f18111a = i4;
            this.f18112b = i5;
            this.f18113c = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        int f18114a;

        /* renamed from: b, reason: collision with root package name */
        int f18115b;

        /* renamed from: c, reason: collision with root package name */
        int f18116c;

        /* renamed from: d, reason: collision with root package name */
        int f18117d;

        public h() {
        }

        int a() {
            return this.f18117d - this.f18116c;
        }

        int b() {
            return this.f18115b - this.f18114a;
        }

        public h(int i4, int i5, int i6, int i7) {
            this.f18114a = i4;
            this.f18115b = i5;
            this.f18116c = i6;
            this.f18117d = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$i */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f18118a;

        /* renamed from: b, reason: collision with root package name */
        public int f18119b;

        /* renamed from: c, reason: collision with root package name */
        public int f18120c;

        /* renamed from: d, reason: collision with root package name */
        public int f18121d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f18122e;

        i() {
        }

        int a() {
            return Math.min(this.f18120c - this.f18118a, this.f18121d - this.f18119b);
        }

        boolean b() {
            if (this.f18121d - this.f18119b != this.f18120c - this.f18118a) {
                return true;
            }
            return false;
        }

        boolean c() {
            if (this.f18121d - this.f18119b > this.f18120c - this.f18118a) {
                return true;
            }
            return false;
        }

        @N
        d d() {
            if (b()) {
                if (this.f18122e) {
                    return new d(this.f18118a, this.f18119b, a());
                }
                if (c()) {
                    return new d(this.f18118a, this.f18119b + 1, a());
                }
                return new d(this.f18118a + 1, this.f18119b, a());
            }
            int i4 = this.f18118a;
            return new d(i4, this.f18119b, this.f18120c - i4);
        }
    }

    private C0964j() {
    }

    @P
    private static i a(h hVar, b bVar, c cVar, c cVar2, int i4) {
        boolean z3;
        int c4;
        int i5;
        int i6;
        int i7;
        if ((hVar.b() - hVar.a()) % 2 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int b4 = hVar.b() - hVar.a();
        int i8 = -i4;
        for (int i9 = i8; i9 <= i4; i9 += 2) {
            if (i9 != i8 && (i9 == i4 || cVar2.c(i9 + 1) >= cVar2.c(i9 - 1))) {
                c4 = cVar2.c(i9 - 1);
                i5 = c4 - 1;
            } else {
                c4 = cVar2.c(i9 + 1);
                i5 = c4;
            }
            int i10 = hVar.f18117d - ((hVar.f18115b - i5) - i9);
            if (i4 != 0 && i5 == c4) {
                i6 = i10 + 1;
            } else {
                i6 = i10;
            }
            while (i5 > hVar.f18114a && i10 > hVar.f18116c && bVar.b(i5 - 1, i10 - 1)) {
                i5--;
                i10--;
            }
            cVar2.d(i9, i5);
            if (z3 && (i7 = b4 - i9) >= i8 && i7 <= i4 && cVar.c(i7) >= i5) {
                i iVar = new i();
                iVar.f18118a = i5;
                iVar.f18119b = i10;
                iVar.f18120c = c4;
                iVar.f18121d = i6;
                iVar.f18122e = true;
                return iVar;
            }
        }
        return null;
    }

    @N
    public static e b(@N b bVar) {
        return c(bVar, true);
    }

    @N
    public static e c(@N b bVar, boolean z3) {
        h hVar;
        int e4 = bVar.e();
        int d4 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, e4, 0, d4));
        int i4 = ((((e4 + d4) + 1) / 2) * 2) + 1;
        c cVar = new c(i4);
        c cVar2 = new c(i4);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar2 = (h) arrayList2.remove(arrayList2.size() - 1);
            i e5 = e(hVar2, bVar, cVar, cVar2);
            if (e5 != null) {
                if (e5.a() > 0) {
                    arrayList.add(e5.d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new h();
                } else {
                    hVar = (h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f18114a = hVar2.f18114a;
                hVar.f18116c = hVar2.f18116c;
                hVar.f18115b = e5.f18118a;
                hVar.f18117d = e5.f18119b;
                arrayList2.add(hVar);
                hVar2.f18115b = hVar2.f18115b;
                hVar2.f18117d = hVar2.f18117d;
                hVar2.f18114a = e5.f18120c;
                hVar2.f18116c = e5.f18121d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f18090a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z3);
    }

    @P
    private static i d(h hVar, b bVar, c cVar, c cVar2, int i4) {
        int c4;
        int i5;
        int i6;
        boolean z3 = true;
        if (Math.abs(hVar.b() - hVar.a()) % 2 != 1) {
            z3 = false;
        }
        int b4 = hVar.b() - hVar.a();
        int i7 = -i4;
        for (int i8 = i7; i8 <= i4; i8 += 2) {
            if (i8 != i7 && (i8 == i4 || cVar.c(i8 + 1) <= cVar.c(i8 - 1))) {
                c4 = cVar.c(i8 - 1);
                i5 = c4 + 1;
            } else {
                c4 = cVar.c(i8 + 1);
                i5 = c4;
            }
            int i9 = (hVar.f18116c + (i5 - hVar.f18114a)) - i8;
            int i10 = (i4 != 0 && i5 == c4) ? i9 - 1 : i9;
            while (i5 < hVar.f18115b && i9 < hVar.f18117d && bVar.b(i5, i9)) {
                i5++;
                i9++;
            }
            cVar.d(i8, i5);
            if (z3 && (i6 = b4 - i8) >= i7 + 1 && i6 <= i4 - 1 && cVar2.c(i6) <= i5) {
                i iVar = new i();
                iVar.f18118a = c4;
                iVar.f18119b = i10;
                iVar.f18120c = i5;
                iVar.f18121d = i9;
                iVar.f18122e = false;
                return iVar;
            }
        }
        return null;
    }

    @P
    private static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b4 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.d(1, hVar.f18114a);
            cVar2.d(1, hVar.f18115b);
            for (int i4 = 0; i4 < b4; i4++) {
                i d4 = d(hVar, bVar, cVar, cVar2, i4);
                if (d4 != null) {
                    return d4;
                }
                i a4 = a(hVar, bVar, cVar, cVar2, i4);
                if (a4 != null) {
                    return a4;
                }
            }
        }
        return null;
    }
}
