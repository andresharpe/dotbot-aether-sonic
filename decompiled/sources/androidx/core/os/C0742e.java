package androidx.core.os;

import android.os.CancellationSignal;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.P;
import androidx.annotation.W;

/* renamed from: androidx.core.os.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12732a;

    /* renamed from: b, reason: collision with root package name */
    private b f12733b;

    /* renamed from: c, reason: collision with root package name */
    private Object f12734c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12735d;

    @W(16)
    /* renamed from: androidx.core.os.e$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @InterfaceC0577u
        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.e$b */
    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    private void f() {
        while (this.f12735d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f12732a) {
                    return;
                }
                this.f12732a = true;
                this.f12735d = true;
                b bVar = this.f12733b;
                Object obj = this.f12734c;
                if (bVar != null) {
                    try {
                        bVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f12735d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    a.a(obj);
                }
                synchronized (this) {
                    this.f12735d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    @P
    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f12734c == null) {
                    CancellationSignal b4 = a.b();
                    this.f12734c = b4;
                    if (this.f12732a) {
                        a.a(b4);
                    }
                }
                obj = this.f12734c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean c() {
        boolean z3;
        synchronized (this) {
            z3 = this.f12732a;
        }
        return z3;
    }

    public void d(@P b bVar) {
        synchronized (this) {
            try {
                f();
                if (this.f12733b == bVar) {
                    return;
                }
                this.f12733b = bVar;
                if (this.f12732a && bVar != null) {
                    bVar.onCancel();
                }
            } finally {
            }
        }
    }

    public void e() {
        if (!c()) {
        } else {
            throw new OperationCanceledException();
        }
    }
}
