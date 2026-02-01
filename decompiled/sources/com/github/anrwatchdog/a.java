package com.github.anrwatchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* loaded from: classes.dex */
public class a extends Thread {

    /* renamed from: P, reason: collision with root package name */
    private static final int f27146P = 5000;

    /* renamed from: Q, reason: collision with root package name */
    private static final f f27147Q = new C0250a();

    /* renamed from: R, reason: collision with root package name */
    private static final e f27148R = new b();

    /* renamed from: S, reason: collision with root package name */
    private static final g f27149S = new c();

    /* renamed from: E, reason: collision with root package name */
    private f f27150E;

    /* renamed from: F, reason: collision with root package name */
    private e f27151F;

    /* renamed from: G, reason: collision with root package name */
    private g f27152G;

    /* renamed from: H, reason: collision with root package name */
    private final Handler f27153H;

    /* renamed from: I, reason: collision with root package name */
    private final int f27154I;

    /* renamed from: J, reason: collision with root package name */
    private String f27155J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f27156K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f27157L;

    /* renamed from: M, reason: collision with root package name */
    private volatile long f27158M;

    /* renamed from: N, reason: collision with root package name */
    private volatile boolean f27159N;

    /* renamed from: O, reason: collision with root package name */
    private final Runnable f27160O;

    /* loaded from: classes.dex */
    static class b implements e {
        b() {
        }

        @Override // com.github.anrwatchdog.a.e
        public long a(long j4) {
            return 0L;
        }
    }

    /* loaded from: classes.dex */
    static class c implements g {
        c() {
        }

        @Override // com.github.anrwatchdog.a.g
        public void a(InterruptedException interruptedException) {
            Log.w("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f27158M = 0L;
            a.this.f27159N = false;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        long a(long j4);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(ANRError aNRError);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(InterruptedException interruptedException);
    }

    public a() {
        this(f27146P);
    }

    public int c() {
        return this.f27154I;
    }

    public a d(e eVar) {
        if (eVar == null) {
            this.f27151F = f27148R;
        } else {
            this.f27151F = eVar;
        }
        return this;
    }

    public a e(f fVar) {
        if (fVar == null) {
            this.f27150E = f27147Q;
        } else {
            this.f27150E = fVar;
        }
        return this;
    }

    public a f(boolean z3) {
        this.f27157L = z3;
        return this;
    }

    public a g(g gVar) {
        if (gVar == null) {
            this.f27152G = f27149S;
        } else {
            this.f27152G = gVar;
        }
        return this;
    }

    public a h(boolean z3) {
        this.f27156K = z3;
        return this;
    }

    public a i() {
        this.f27155J = "";
        return this;
    }

    public a j() {
        this.f27155J = null;
        return this;
    }

    public a k(String str) {
        if (str == null) {
            str = "";
        }
        this.f27155J = str;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z3;
        ANRError b4;
        setName("|ANR-WatchDog|");
        long j4 = this.f27154I;
        while (!isInterrupted()) {
            if (this.f27158M == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f27158M += j4;
            if (z3) {
                this.f27153H.post(this.f27160O);
            }
            try {
                Thread.sleep(j4);
                if (this.f27158M != 0 && !this.f27159N) {
                    if (!this.f27157L && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        Log.w("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        this.f27159N = true;
                    } else {
                        j4 = this.f27151F.a(this.f27158M);
                        if (j4 <= 0) {
                            if (this.f27155J != null) {
                                b4 = ANRError.a(this.f27158M, this.f27155J, this.f27156K);
                            } else {
                                b4 = ANRError.b(this.f27158M);
                            }
                            this.f27150E.a(b4);
                            j4 = this.f27154I;
                            this.f27159N = true;
                        }
                    }
                }
            } catch (InterruptedException e4) {
                this.f27152G.a(e4);
                return;
            }
        }
    }

    public a(int i4) {
        this.f27150E = f27147Q;
        this.f27151F = f27148R;
        this.f27152G = f27149S;
        this.f27153H = new Handler(Looper.getMainLooper());
        this.f27155J = "";
        this.f27156K = false;
        this.f27157L = false;
        this.f27158M = 0L;
        this.f27159N = false;
        this.f27160O = new d();
        this.f27154I = i4;
    }

    /* renamed from: com.github.anrwatchdog.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0250a implements f {
        C0250a() {
        }

        @Override // com.github.anrwatchdog.a.f
        public void a(ANRError aNRError) {
            throw aNRError;
        }
    }
}
