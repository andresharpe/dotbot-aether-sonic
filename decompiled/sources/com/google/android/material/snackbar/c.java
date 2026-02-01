package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.N;
import androidx.annotation.P;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    static final int f33433e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f33434f = 1500;

    /* renamed from: g, reason: collision with root package name */
    private static final int f33435g = 2750;

    /* renamed from: h, reason: collision with root package name */
    private static c f33436h;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Object f33437a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Handler f33438b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    @P
    private C0297c f33439c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private C0297c f33440d;

    /* loaded from: classes2.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@N Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0297c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0297c {

        /* renamed from: a, reason: collision with root package name */
        @N
        final WeakReference<b> f33442a;

        /* renamed from: b, reason: collision with root package name */
        int f33443b;

        /* renamed from: c, reason: collision with root package name */
        boolean f33444c;

        C0297c(int i4, b bVar) {
            this.f33442a = new WeakReference<>(bVar);
            this.f33443b = i4;
        }

        boolean a(@P b bVar) {
            if (bVar != null && this.f33442a.get() == bVar) {
                return true;
            }
            return false;
        }
    }

    private c() {
    }

    private boolean a(@N C0297c c0297c, int i4) {
        b bVar = c0297c.f33442a.get();
        if (bVar != null) {
            this.f33438b.removeCallbacksAndMessages(c0297c);
            bVar.b(i4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c c() {
        if (f33436h == null) {
            f33436h = new c();
        }
        return f33436h;
    }

    private boolean g(b bVar) {
        C0297c c0297c = this.f33439c;
        if (c0297c != null && c0297c.a(bVar)) {
            return true;
        }
        return false;
    }

    private boolean h(b bVar) {
        C0297c c0297c = this.f33440d;
        if (c0297c != null && c0297c.a(bVar)) {
            return true;
        }
        return false;
    }

    private void m(@N C0297c c0297c) {
        int i4 = c0297c.f33443b;
        if (i4 == -2) {
            return;
        }
        if (i4 <= 0) {
            if (i4 == -1) {
                i4 = 1500;
            } else {
                i4 = f33435g;
            }
        }
        this.f33438b.removeCallbacksAndMessages(c0297c);
        Handler handler = this.f33438b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0297c), i4);
    }

    private void o() {
        C0297c c0297c = this.f33440d;
        if (c0297c != null) {
            this.f33439c = c0297c;
            this.f33440d = null;
            b bVar = c0297c.f33442a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f33439c = null;
            }
        }
    }

    public void b(b bVar, int i4) {
        synchronized (this.f33437a) {
            try {
                if (g(bVar)) {
                    a(this.f33439c, i4);
                } else if (h(bVar)) {
                    a(this.f33440d, i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(@N C0297c c0297c) {
        synchronized (this.f33437a) {
            try {
                if (this.f33439c != c0297c) {
                    if (this.f33440d == c0297c) {
                    }
                }
                a(c0297c, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean g4;
        synchronized (this.f33437a) {
            g4 = g(bVar);
        }
        return g4;
    }

    public boolean f(b bVar) {
        boolean z3;
        synchronized (this.f33437a) {
            try {
                if (!g(bVar) && !h(bVar)) {
                    z3 = false;
                }
                z3 = true;
            } finally {
            }
        }
        return z3;
    }

    public void i(b bVar) {
        synchronized (this.f33437a) {
            try {
                if (g(bVar)) {
                    this.f33439c = null;
                    if (this.f33440d != null) {
                        o();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f33437a) {
            try {
                if (g(bVar)) {
                    m(this.f33439c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f33437a) {
            try {
                if (g(bVar)) {
                    C0297c c0297c = this.f33439c;
                    if (!c0297c.f33444c) {
                        c0297c.f33444c = true;
                        this.f33438b.removeCallbacksAndMessages(c0297c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f33437a) {
            try {
                if (g(bVar)) {
                    C0297c c0297c = this.f33439c;
                    if (c0297c.f33444c) {
                        c0297c.f33444c = false;
                        m(c0297c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(int i4, b bVar) {
        synchronized (this.f33437a) {
            try {
                if (g(bVar)) {
                    C0297c c0297c = this.f33439c;
                    c0297c.f33443b = i4;
                    this.f33438b.removeCallbacksAndMessages(c0297c);
                    m(this.f33439c);
                    return;
                }
                if (h(bVar)) {
                    this.f33440d.f33443b = i4;
                } else {
                    this.f33440d = new C0297c(i4, bVar);
                }
                C0297c c0297c2 = this.f33439c;
                if (c0297c2 != null && a(c0297c2, 4)) {
                    return;
                }
                this.f33439c = null;
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
