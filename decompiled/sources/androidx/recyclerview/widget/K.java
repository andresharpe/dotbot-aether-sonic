package androidx.recyclerview.widget;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.core.util.t;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class K {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f17519c = false;

    /* renamed from: a, reason: collision with root package name */
    @i0
    final androidx.collection.l<RecyclerView.F, a> f17520a = new androidx.collection.l<>();

    /* renamed from: b, reason: collision with root package name */
    @i0
    final androidx.collection.h<RecyclerView.F> f17521b = new androidx.collection.h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        static final int f17522d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f17523e = 2;

        /* renamed from: f, reason: collision with root package name */
        static final int f17524f = 4;

        /* renamed from: g, reason: collision with root package name */
        static final int f17525g = 8;

        /* renamed from: h, reason: collision with root package name */
        static final int f17526h = 3;

        /* renamed from: i, reason: collision with root package name */
        static final int f17527i = 12;

        /* renamed from: j, reason: collision with root package name */
        static final int f17528j = 14;

        /* renamed from: k, reason: collision with root package name */
        static t.a<a> f17529k = new t.b(20);

        /* renamed from: a, reason: collision with root package name */
        int f17530a;

        /* renamed from: b, reason: collision with root package name */
        @P
        RecyclerView.l.d f17531b;

        /* renamed from: c, reason: collision with root package name */
        @P
        RecyclerView.l.d f17532c;

        private a() {
        }

        static void a() {
            do {
            } while (f17529k.b() != null);
        }

        static a b() {
            a b4 = f17529k.b();
            if (b4 == null) {
                return new a();
            }
            return b4;
        }

        static void c(a aVar) {
            aVar.f17530a = 0;
            aVar.f17531b = null;
            aVar.f17532c = null;
            f17529k.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.F f4);

        void b(RecyclerView.F f4, @P RecyclerView.l.d dVar, RecyclerView.l.d dVar2);

        void c(RecyclerView.F f4, @N RecyclerView.l.d dVar, @P RecyclerView.l.d dVar2);

        void d(RecyclerView.F f4, @N RecyclerView.l.d dVar, @N RecyclerView.l.d dVar2);
    }

    private RecyclerView.l.d l(RecyclerView.F f4, int i4) {
        a q4;
        RecyclerView.l.d dVar;
        int j4 = this.f17520a.j(f4);
        if (j4 >= 0 && (q4 = this.f17520a.q(j4)) != null) {
            int i5 = q4.f17530a;
            if ((i5 & i4) != 0) {
                int i6 = (~i4) & i5;
                q4.f17530a = i6;
                if (i4 == 4) {
                    dVar = q4.f17531b;
                } else if (i4 == 8) {
                    dVar = q4.f17532c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i6 & 12) == 0) {
                    this.f17520a.o(j4);
                    a.c(q4);
                }
                return dVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.F f4, RecyclerView.l.d dVar) {
        a aVar = this.f17520a.get(f4);
        if (aVar == null) {
            aVar = a.b();
            this.f17520a.put(f4, aVar);
        }
        aVar.f17530a |= 2;
        aVar.f17531b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.F f4) {
        a aVar = this.f17520a.get(f4);
        if (aVar == null) {
            aVar = a.b();
            this.f17520a.put(f4, aVar);
        }
        aVar.f17530a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j4, RecyclerView.F f4) {
        this.f17521b.p(j4, f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.F f4, RecyclerView.l.d dVar) {
        a aVar = this.f17520a.get(f4);
        if (aVar == null) {
            aVar = a.b();
            this.f17520a.put(f4, aVar);
        }
        aVar.f17532c = dVar;
        aVar.f17530a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.F f4, RecyclerView.l.d dVar) {
        a aVar = this.f17520a.get(f4);
        if (aVar == null) {
            aVar = a.b();
            this.f17520a.put(f4, aVar);
        }
        aVar.f17531b = dVar;
        aVar.f17530a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f17520a.clear();
        this.f17521b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.F g(long j4) {
        return this.f17521b.i(j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.F f4) {
        a aVar = this.f17520a.get(f4);
        if (aVar != null && (aVar.f17530a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.F f4) {
        a aVar = this.f17520a.get(f4);
        if (aVar != null && (aVar.f17530a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.F f4) {
        p(f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public RecyclerView.l.d m(RecyclerView.F f4) {
        return l(f4, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public RecyclerView.l.d n(RecyclerView.F f4) {
        return l(f4, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f17520a.size() - 1; size >= 0; size--) {
            RecyclerView.F m4 = this.f17520a.m(size);
            a o4 = this.f17520a.o(size);
            int i4 = o4.f17530a;
            if ((i4 & 3) == 3) {
                bVar.a(m4);
            } else if ((i4 & 1) != 0) {
                RecyclerView.l.d dVar = o4.f17531b;
                if (dVar == null) {
                    bVar.a(m4);
                } else {
                    bVar.c(m4, dVar, o4.f17532c);
                }
            } else if ((i4 & 14) == 14) {
                bVar.b(m4, o4.f17531b, o4.f17532c);
            } else if ((i4 & 12) == 12) {
                bVar.d(m4, o4.f17531b, o4.f17532c);
            } else if ((i4 & 4) != 0) {
                bVar.c(m4, o4.f17531b, null);
            } else if ((i4 & 8) != 0) {
                bVar.b(m4, o4.f17531b, o4.f17532c);
            }
            a.c(o4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.F f4) {
        a aVar = this.f17520a.get(f4);
        if (aVar == null) {
            return;
        }
        aVar.f17530a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.F f4) {
        int A3 = this.f17521b.A() - 1;
        while (true) {
            if (A3 < 0) {
                break;
            }
            if (f4 == this.f17521b.B(A3)) {
                this.f17521b.u(A3);
                break;
            }
            A3--;
        }
        a remove = this.f17520a.remove(f4);
        if (remove != null) {
            a.c(remove);
        }
    }
}
