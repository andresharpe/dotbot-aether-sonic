package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.i0;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.resource.bitmap.C1122g;
import com.bumptech.glide.util.n;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: M, reason: collision with root package name */
    @i0
    static final String f26191M = "PreFillRunner";

    /* renamed from: O, reason: collision with root package name */
    static final long f26193O = 32;

    /* renamed from: P, reason: collision with root package name */
    static final long f26194P = 40;

    /* renamed from: Q, reason: collision with root package name */
    static final int f26195Q = 4;

    /* renamed from: E, reason: collision with root package name */
    private final e f26197E;

    /* renamed from: F, reason: collision with root package name */
    private final j f26198F;

    /* renamed from: G, reason: collision with root package name */
    private final c f26199G;

    /* renamed from: H, reason: collision with root package name */
    private final C0233a f26200H;

    /* renamed from: I, reason: collision with root package name */
    private final Set<d> f26201I;

    /* renamed from: J, reason: collision with root package name */
    private final Handler f26202J;

    /* renamed from: K, reason: collision with root package name */
    private long f26203K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f26204L;

    /* renamed from: N, reason: collision with root package name */
    private static final C0233a f26192N = new C0233a();

    /* renamed from: R, reason: collision with root package name */
    static final long f26196R = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0233a {
        C0233a() {
        }

        long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements com.bumptech.glide.load.c {
        b() {
        }

        @Override // com.bumptech.glide.load.c
        public void a(@N MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(e eVar, j jVar, c cVar) {
        this(eVar, jVar, cVar, f26192N, new Handler(Looper.getMainLooper()));
    }

    private long c() {
        return this.f26198F.e() - this.f26198F.d();
    }

    private long d() {
        long j4 = this.f26203K;
        this.f26203K = Math.min(4 * j4, f26196R);
        return j4;
    }

    private boolean e(long j4) {
        if (this.f26200H.a() - j4 >= 32) {
            return true;
        }
        return false;
    }

    @i0
    boolean a() {
        Bitmap createBitmap;
        long a4 = this.f26200H.a();
        while (!this.f26199G.b() && !e(a4)) {
            d c4 = this.f26199G.c();
            if (!this.f26201I.contains(c4)) {
                this.f26201I.add(c4);
                createBitmap = this.f26197E.g(c4.d(), c4.b(), c4.a());
            } else {
                createBitmap = Bitmap.createBitmap(c4.d(), c4.b(), c4.a());
            }
            int h4 = n.h(createBitmap);
            if (c() >= h4) {
                this.f26198F.f(new b(), C1122g.f(createBitmap, this.f26197E));
            } else {
                this.f26197E.d(createBitmap);
            }
            if (Log.isLoggable(f26191M, 3)) {
                Log.d(f26191M, "allocated [" + c4.d() + "x" + c4.b() + "] " + c4.a() + " size: " + h4);
            }
        }
        if (!this.f26204L && !this.f26199G.b()) {
            return true;
        }
        return false;
    }

    public void b() {
        this.f26204L = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f26202J.postDelayed(this, d());
        }
    }

    @i0
    a(e eVar, j jVar, c cVar, C0233a c0233a, Handler handler) {
        this.f26201I = new HashSet();
        this.f26203K = f26194P;
        this.f26197E = eVar;
        this.f26198F = jVar;
        this.f26199G = cVar;
        this.f26200H = c0233a;
        this.f26202J = handler;
    }
}
