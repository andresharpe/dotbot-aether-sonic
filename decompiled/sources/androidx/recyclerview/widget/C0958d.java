package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.C0957c;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0958d<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Executor f17961h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final u f17962a;

    /* renamed from: b, reason: collision with root package name */
    final C0957c<T> f17963b;

    /* renamed from: c, reason: collision with root package name */
    Executor f17964c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b<T>> f17965d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private List<T> f17966e;

    /* renamed from: f, reason: collision with root package name */
    @N
    private List<T> f17967f;

    /* renamed from: g, reason: collision with root package name */
    int f17968g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ List f17969E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ List f17970F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f17971G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Runnable f17972H;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0169a extends C0964j.b {
            C0169a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0964j.b
            public boolean a(int i4, int i5) {
                Object obj = a.this.f17969E.get(i4);
                Object obj2 = a.this.f17970F.get(i5);
                if (obj != null && obj2 != null) {
                    return C0958d.this.f17963b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0964j.b
            public boolean b(int i4, int i5) {
                Object obj = a.this.f17969E.get(i4);
                Object obj2 = a.this.f17970F.get(i5);
                if (obj != null && obj2 != null) {
                    return C0958d.this.f17963b.b().b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0964j.b
            @P
            public Object c(int i4, int i5) {
                Object obj = a.this.f17969E.get(i4);
                Object obj2 = a.this.f17970F.get(i5);
                if (obj != null && obj2 != null) {
                    return C0958d.this.f17963b.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.C0964j.b
            public int d() {
                return a.this.f17970F.size();
            }

            @Override // androidx.recyclerview.widget.C0964j.b
            public int e() {
                return a.this.f17969E.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C0964j.e f17975E;

            b(C0964j.e eVar) {
                this.f17975E = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C0958d c0958d = C0958d.this;
                if (c0958d.f17968g == aVar.f17971G) {
                    c0958d.c(aVar.f17970F, this.f17975E, aVar.f17972H);
                }
            }
        }

        a(List list, List list2, int i4, Runnable runnable) {
            this.f17969E = list;
            this.f17970F = list2;
            this.f17971G = i4;
            this.f17972H = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0958d.this.f17964c.execute(new b(C0964j.b(new C0169a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(@N List<T> list, @N List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private static class c implements Executor {

        /* renamed from: E, reason: collision with root package name */
        final Handler f17977E = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@N Runnable runnable) {
            this.f17977E.post(runnable);
        }
    }

    public C0958d(@N RecyclerView.Adapter adapter, @N C0964j.f<T> fVar) {
        this(new C0956b(adapter), new C0957c.a(fVar).a());
    }

    private void d(@N List<T> list, @P Runnable runnable) {
        Iterator<b<T>> it = this.f17965d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f17967f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(@N b<T> bVar) {
        this.f17965d.add(bVar);
    }

    @N
    public List<T> b() {
        return this.f17967f;
    }

    void c(@N List<T> list, @N C0964j.e eVar, @P Runnable runnable) {
        List<T> list2 = this.f17967f;
        this.f17966e = list;
        this.f17967f = Collections.unmodifiableList(list);
        eVar.d(this.f17962a);
        d(list2, runnable);
    }

    public void e(@N b<T> bVar) {
        this.f17965d.remove(bVar);
    }

    public void f(@P List<T> list) {
        g(list, null);
    }

    public void g(@P List<T> list, @P Runnable runnable) {
        int i4 = this.f17968g + 1;
        this.f17968g = i4;
        List<T> list2 = this.f17966e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f17967f;
        if (list == null) {
            int size = list2.size();
            this.f17966e = null;
            this.f17967f = Collections.emptyList();
            this.f17962a.c(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 == null) {
            this.f17966e = list;
            this.f17967f = Collections.unmodifiableList(list);
            this.f17962a.b(0, list.size());
            d(list3, runnable);
            return;
        }
        this.f17963b.a().execute(new a(list2, list, i4, runnable));
    }

    public C0958d(@N u uVar, @N C0957c<T> c0957c) {
        this.f17965d = new CopyOnWriteArrayList();
        this.f17967f = Collections.emptyList();
        this.f17962a = uVar;
        this.f17963b = c0957c;
        if (c0957c.c() != null) {
            this.f17964c = c0957c.c();
        } else {
            this.f17964c = f17961h;
        }
    }
}
