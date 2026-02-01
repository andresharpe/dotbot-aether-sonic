package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.j0;
import androidx.core.graphics.a0;
import androidx.core.os.L;
import androidx.core.provider.h;
import androidx.core.util.u;
import androidx.emoji2.text.g;
import androidx.emoji2.text.m;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class m extends g.d {

    /* renamed from: j, reason: collision with root package name */
    private static final b f14522j = new b();

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final long f14523a;

        /* renamed from: b, reason: collision with root package name */
        private long f14524b;

        public a(long j4) {
            this.f14523a = j4;
        }

        @Override // androidx.emoji2.text.m.d
        public long a() {
            if (this.f14524b == 0) {
                this.f14524b = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f14524b;
            if (uptimeMillis > this.f14523a) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.f14523a - uptimeMillis);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {
        @P
        public Typeface a(@N Context context, @N h.c cVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.h.a(context, null, new h.c[]{cVar});
        }

        @N
        public h.b b(@N Context context, @N androidx.core.provider.f fVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.h.b(context, null, fVar);
        }

        public void c(@N Context context, @N Uri uri, @N ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(@N Context context, @N ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements g.i {

        /* renamed from: l, reason: collision with root package name */
        private static final String f14525l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* renamed from: a, reason: collision with root package name */
        @N
        private final Context f14526a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private final androidx.core.provider.f f14527b;

        /* renamed from: c, reason: collision with root package name */
        @N
        private final b f14528c;

        /* renamed from: d, reason: collision with root package name */
        @N
        private final Object f14529d = new Object();

        /* renamed from: e, reason: collision with root package name */
        @P
        @B("mLock")
        private Handler f14530e;

        /* renamed from: f, reason: collision with root package name */
        @P
        @B("mLock")
        private Executor f14531f;

        /* renamed from: g, reason: collision with root package name */
        @P
        @B("mLock")
        private ThreadPoolExecutor f14532g;

        /* renamed from: h, reason: collision with root package name */
        @P
        @B("mLock")
        private d f14533h;

        /* renamed from: i, reason: collision with root package name */
        @P
        @B("mLock")
        g.j f14534i;

        /* renamed from: j, reason: collision with root package name */
        @P
        @B("mLock")
        private ContentObserver f14535j;

        /* renamed from: k, reason: collision with root package name */
        @P
        @B("mLock")
        private Runnable f14536k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ContentObserver {
            a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z3, Uri uri) {
                c.this.d();
            }
        }

        c(@N Context context, @N androidx.core.provider.f fVar, @N b bVar) {
            u.m(context, "Context cannot be null");
            u.m(fVar, "FontRequest cannot be null");
            this.f14526a = context.getApplicationContext();
            this.f14527b = fVar;
            this.f14528c = bVar;
        }

        private void b() {
            synchronized (this.f14529d) {
                try {
                    this.f14534i = null;
                    ContentObserver contentObserver = this.f14535j;
                    if (contentObserver != null) {
                        this.f14528c.d(this.f14526a, contentObserver);
                        this.f14535j = null;
                    }
                    Handler handler = this.f14530e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f14536k);
                    }
                    this.f14530e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f14532g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f14531f = null;
                    this.f14532g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @j0
        private h.c e() {
            try {
                h.b b4 = this.f14528c.b(this.f14526a, this.f14527b);
                if (b4.c() == 0) {
                    h.c[] b5 = b4.b();
                    if (b5 != null && b5.length != 0) {
                        return b5[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b4.c() + ")");
            } catch (PackageManager.NameNotFoundException e4) {
                throw new RuntimeException("provider not found", e4);
            }
        }

        @j0
        @W(19)
        private void f(Uri uri, long j4) {
            synchronized (this.f14529d) {
                try {
                    Handler handler = this.f14530e;
                    if (handler == null) {
                        handler = androidx.emoji2.text.d.e();
                        this.f14530e = handler;
                    }
                    if (this.f14535j == null) {
                        a aVar = new a(handler);
                        this.f14535j = aVar;
                        this.f14528c.c(this.f14526a, uri, aVar);
                    }
                    if (this.f14536k == null) {
                        this.f14536k = new Runnable() { // from class: androidx.emoji2.text.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                m.c.this.d();
                            }
                        };
                    }
                    handler.postDelayed(this.f14536k, j4);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.emoji2.text.g.i
        @W(19)
        public void a(@N g.j jVar) {
            u.m(jVar, "LoaderCallback cannot be null");
            synchronized (this.f14529d) {
                this.f14534i = jVar;
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @j0
        @W(19)
        public void c() {
            synchronized (this.f14529d) {
                try {
                    if (this.f14534i == null) {
                        return;
                    }
                    try {
                        h.c e4 = e();
                        int b4 = e4.b();
                        if (b4 == 2) {
                            synchronized (this.f14529d) {
                                try {
                                    d dVar = this.f14533h;
                                    if (dVar != null) {
                                        long a4 = dVar.a();
                                        if (a4 >= 0) {
                                            f(e4.d(), a4);
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (b4 == 0) {
                            try {
                                L.b(f14525l);
                                Typeface a5 = this.f14528c.a(this.f14526a, e4);
                                ByteBuffer f4 = a0.f(this.f14526a, null, e4.d());
                                if (f4 != null && a5 != null) {
                                    q e5 = q.e(a5, f4);
                                    L.d();
                                    synchronized (this.f14529d) {
                                        try {
                                            g.j jVar = this.f14534i;
                                            if (jVar != null) {
                                                jVar.b(e5);
                                            }
                                        } finally {
                                        }
                                    }
                                    b();
                                    return;
                                }
                                throw new RuntimeException("Unable to open file.");
                            } catch (Throwable th) {
                                L.d();
                                throw th;
                            }
                        }
                        throw new RuntimeException("fetchFonts result is not OK. (" + b4 + ")");
                    } catch (Throwable th2) {
                        synchronized (this.f14529d) {
                            try {
                                g.j jVar2 = this.f14534i;
                                if (jVar2 != null) {
                                    jVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @W(19)
        public void d() {
            synchronized (this.f14529d) {
                try {
                    if (this.f14534i == null) {
                        return;
                    }
                    if (this.f14531f == null) {
                        ThreadPoolExecutor c4 = androidx.emoji2.text.d.c("emojiCompat");
                        this.f14532g = c4;
                        this.f14531f = c4;
                    }
                    this.f14531f.execute(new Runnable() { // from class: androidx.emoji2.text.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.c.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(@N Executor executor) {
            synchronized (this.f14529d) {
                this.f14531f = executor;
            }
        }

        public void h(@P d dVar) {
            synchronized (this.f14529d) {
                this.f14533h = dVar;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract long a();
    }

    public m(@N Context context, @N androidx.core.provider.f fVar) {
        super(new c(context, fVar, f14522j));
    }

    @N
    @Deprecated
    public m k(@P Handler handler) {
        if (handler == null) {
            return this;
        }
        l(androidx.emoji2.text.d.b(handler));
        return this;
    }

    @N
    public m l(@N Executor executor) {
        ((c) a()).g(executor);
        return this;
    }

    @N
    public m m(@P d dVar) {
        ((c) a()).h(dVar);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public m(@N Context context, @N androidx.core.provider.f fVar, @N b bVar) {
        super(new c(context, fVar, bVar));
    }
}
