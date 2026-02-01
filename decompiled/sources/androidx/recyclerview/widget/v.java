package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.H;
import androidx.recyclerview.widget.I;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class v<T> implements H<T> {

    /* loaded from: classes.dex */
    class a implements H.b<T> {

        /* renamed from: f, reason: collision with root package name */
        static final int f18318f = 1;

        /* renamed from: g, reason: collision with root package name */
        static final int f18319g = 2;

        /* renamed from: h, reason: collision with root package name */
        static final int f18320h = 3;

        /* renamed from: a, reason: collision with root package name */
        final c f18321a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Handler f18322b = new Handler(Looper.getMainLooper());

        /* renamed from: c, reason: collision with root package name */
        private Runnable f18323c = new RunnableC0171a();

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H.b f18324d;

        /* renamed from: androidx.recyclerview.widget.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0171a implements Runnable {
            RunnableC0171a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d a4 = a.this.f18321a.a();
                while (a4 != null) {
                    int i4 = a4.f18342b;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                Log.e("ThreadUtil", "Unsupported message, what=" + a4.f18342b);
                            } else {
                                a.this.f18324d.b(a4.f18343c, a4.f18344d);
                            }
                        } else {
                            a.this.f18324d.a(a4.f18343c, (I.a) a4.f18348h);
                        }
                    } else {
                        a.this.f18324d.c(a4.f18343c, a4.f18344d);
                    }
                    a4 = a.this.f18321a.a();
                }
            }
        }

        a(H.b bVar) {
            this.f18324d = bVar;
        }

        private void d(d dVar) {
            this.f18321a.c(dVar);
            this.f18322b.post(this.f18323c);
        }

        @Override // androidx.recyclerview.widget.H.b
        public void a(int i4, I.a<T> aVar) {
            d(d.c(2, i4, aVar));
        }

        @Override // androidx.recyclerview.widget.H.b
        public void b(int i4, int i5) {
            d(d.a(3, i4, i5));
        }

        @Override // androidx.recyclerview.widget.H.b
        public void c(int i4, int i5) {
            d(d.a(1, i4, i5));
        }
    }

    /* loaded from: classes.dex */
    class b implements H.a<T> {

        /* renamed from: g, reason: collision with root package name */
        static final int f18327g = 1;

        /* renamed from: h, reason: collision with root package name */
        static final int f18328h = 2;

        /* renamed from: i, reason: collision with root package name */
        static final int f18329i = 3;

        /* renamed from: j, reason: collision with root package name */
        static final int f18330j = 4;

        /* renamed from: a, reason: collision with root package name */
        final c f18331a = new c();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f18332b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c, reason: collision with root package name */
        AtomicBoolean f18333c = new AtomicBoolean(false);

        /* renamed from: d, reason: collision with root package name */
        private Runnable f18334d = new a();

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H.a f18335e;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d a4 = b.this.f18331a.a();
                    if (a4 == null) {
                        b.this.f18333c.set(false);
                        return;
                    }
                    int i4 = a4.f18342b;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    Log.e("ThreadUtil", "Unsupported message, what=" + a4.f18342b);
                                } else {
                                    b.this.f18335e.b((I.a) a4.f18348h);
                                }
                            } else {
                                b.this.f18335e.c(a4.f18343c, a4.f18344d);
                            }
                        } else {
                            b.this.f18331a.b(2);
                            b.this.f18331a.b(3);
                            b.this.f18335e.a(a4.f18343c, a4.f18344d, a4.f18345e, a4.f18346f, a4.f18347g);
                        }
                    } else {
                        b.this.f18331a.b(1);
                        b.this.f18335e.d(a4.f18343c);
                    }
                }
            }
        }

        b(H.a aVar) {
            this.f18335e = aVar;
        }

        private void e() {
            if (this.f18333c.compareAndSet(false, true)) {
                this.f18332b.execute(this.f18334d);
            }
        }

        private void f(d dVar) {
            this.f18331a.c(dVar);
            e();
        }

        private void g(d dVar) {
            this.f18331a.d(dVar);
            e();
        }

        @Override // androidx.recyclerview.widget.H.a
        public void a(int i4, int i5, int i6, int i7, int i8) {
            g(d.b(2, i4, i5, i6, i7, i8, null));
        }

        @Override // androidx.recyclerview.widget.H.a
        public void b(I.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        @Override // androidx.recyclerview.widget.H.a
        public void c(int i4, int i5) {
            f(d.a(3, i4, i5));
        }

        @Override // androidx.recyclerview.widget.H.a
        public void d(int i4) {
            g(d.c(1, i4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private d f18338a;

        c() {
        }

        synchronized d a() {
            d dVar = this.f18338a;
            if (dVar == null) {
                return null;
            }
            this.f18338a = dVar.f18341a;
            return dVar;
        }

        synchronized void b(int i4) {
            d dVar;
            while (true) {
                try {
                    dVar = this.f18338a;
                    if (dVar == null || dVar.f18342b != i4) {
                        break;
                    }
                    this.f18338a = dVar.f18341a;
                    dVar.d();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (dVar != null) {
                d dVar2 = dVar.f18341a;
                while (dVar2 != null) {
                    d dVar3 = dVar2.f18341a;
                    if (dVar2.f18342b == i4) {
                        dVar.f18341a = dVar3;
                        dVar2.d();
                    } else {
                        dVar = dVar2;
                    }
                    dVar2 = dVar3;
                }
            }
        }

        synchronized void c(d dVar) {
            d dVar2 = this.f18338a;
            if (dVar2 == null) {
                this.f18338a = dVar;
                return;
            }
            while (true) {
                d dVar3 = dVar2.f18341a;
                if (dVar3 != null) {
                    dVar2 = dVar3;
                } else {
                    dVar2.f18341a = dVar;
                    return;
                }
            }
        }

        synchronized void d(d dVar) {
            dVar.f18341a = this.f18338a;
            this.f18338a = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: i, reason: collision with root package name */
        private static d f18339i;

        /* renamed from: j, reason: collision with root package name */
        private static final Object f18340j = new Object();

        /* renamed from: a, reason: collision with root package name */
        d f18341a;

        /* renamed from: b, reason: collision with root package name */
        public int f18342b;

        /* renamed from: c, reason: collision with root package name */
        public int f18343c;

        /* renamed from: d, reason: collision with root package name */
        public int f18344d;

        /* renamed from: e, reason: collision with root package name */
        public int f18345e;

        /* renamed from: f, reason: collision with root package name */
        public int f18346f;

        /* renamed from: g, reason: collision with root package name */
        public int f18347g;

        /* renamed from: h, reason: collision with root package name */
        public Object f18348h;

        d() {
        }

        static d a(int i4, int i5, int i6) {
            return b(i4, i5, i6, 0, 0, 0, null);
        }

        static d b(int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
            d dVar;
            synchronized (f18340j) {
                try {
                    dVar = f18339i;
                    if (dVar == null) {
                        dVar = new d();
                    } else {
                        f18339i = dVar.f18341a;
                        dVar.f18341a = null;
                    }
                    dVar.f18342b = i4;
                    dVar.f18343c = i5;
                    dVar.f18344d = i6;
                    dVar.f18345e = i7;
                    dVar.f18346f = i8;
                    dVar.f18347g = i9;
                    dVar.f18348h = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar;
        }

        static d c(int i4, int i5, Object obj) {
            return b(i4, i5, 0, 0, 0, 0, obj);
        }

        void d() {
            this.f18341a = null;
            this.f18347g = 0;
            this.f18346f = 0;
            this.f18345e = 0;
            this.f18344d = 0;
            this.f18343c = 0;
            this.f18342b = 0;
            this.f18348h = null;
            synchronized (f18340j) {
                try {
                    d dVar = f18339i;
                    if (dVar != null) {
                        this.f18341a = dVar;
                    }
                    f18339i = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.H
    public H.a<T> a(H.a<T> aVar) {
        return new b(aVar);
    }

    @Override // androidx.recyclerview.widget.H
    public H.b<T> b(H.b<T> bVar) {
        return new a(bVar);
    }
}
