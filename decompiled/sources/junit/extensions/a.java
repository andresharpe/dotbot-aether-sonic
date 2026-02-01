package junit.extensions;

import junit.framework.f;
import junit.framework.g;
import junit.framework.j;
import junit.framework.k;

/* loaded from: classes2.dex */
public class a extends k {

    /* renamed from: c, reason: collision with root package name */
    private volatile int f51482c;

    /* renamed from: junit.extensions.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0450a extends Thread {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ f f51483E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ j f51484F;

        C0450a(f fVar, j jVar) {
            this.f51483E = fVar;
            this.f51484F = jVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f51483E.d(this.f51484F);
            } finally {
                a.this.s();
            }
        }
    }

    public a() {
    }

    @Override // junit.framework.k, junit.framework.f
    public void d(j jVar) {
        this.f51482c = 0;
        super.d(jVar);
        t();
    }

    @Override // junit.framework.k
    public void l(f fVar, j jVar) {
        new C0450a(fVar, jVar).start();
    }

    public synchronized void s() {
        this.f51482c++;
        notifyAll();
    }

    synchronized void t() {
        while (this.f51482c < p()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public a(Class<? extends g> cls) {
        super(cls);
    }

    public a(String str) {
        super(str);
    }

    public a(Class<? extends g> cls, String str) {
        super(cls, str);
    }
}
