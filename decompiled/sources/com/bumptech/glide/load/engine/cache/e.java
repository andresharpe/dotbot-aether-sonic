package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.b;
import com.bumptech.glide.load.engine.cache.a;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f25962f = "DiskLruCacheWrapper";

    /* renamed from: g, reason: collision with root package name */
    private static final int f25963g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f25964h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static e f25965i;

    /* renamed from: b, reason: collision with root package name */
    private final File f25967b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25968c;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.disklrucache.b f25970e;

    /* renamed from: d, reason: collision with root package name */
    private final c f25969d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final m f25966a = new m();

    @Deprecated
    protected e(File file, long j4) {
        this.f25967b = file;
        this.f25968c = j4;
    }

    public static a d(File file, long j4) {
        return new e(file, j4);
    }

    @Deprecated
    public static synchronized a e(File file, long j4) {
        e eVar;
        synchronized (e.class) {
            try {
                if (f25965i == null) {
                    f25965i = new e(file, j4);
                }
                eVar = f25965i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    private synchronized com.bumptech.glide.disklrucache.b f() throws IOException {
        try {
            if (this.f25970e == null) {
                this.f25970e = com.bumptech.glide.disklrucache.b.c0(this.f25967b, 1, 1, this.f25968c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25970e;
    }

    private synchronized void g() {
        this.f25970e = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void a(com.bumptech.glide.load.c cVar, a.b bVar) {
        com.bumptech.glide.disklrucache.b f4;
        String b4 = this.f25966a.b(cVar);
        this.f25969d.a(b4);
        try {
            if (Log.isLoggable(f25962f, 2)) {
                Log.v(f25962f, "Put: Obtained: " + b4 + " for for Key: " + cVar);
            }
            try {
                f4 = f();
            } catch (IOException e4) {
                if (Log.isLoggable(f25962f, 5)) {
                    Log.w(f25962f, "Unable to put to disk cache", e4);
                }
            }
            if (f4.G(b4) != null) {
                return;
            }
            b.c A3 = f4.A(b4);
            if (A3 != null) {
                try {
                    if (bVar.a(A3.f(0))) {
                        A3.e();
                    }
                    A3.b();
                    return;
                } catch (Throwable th) {
                    A3.b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + b4);
        } finally {
            this.f25969d.b(b4);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public File b(com.bumptech.glide.load.c cVar) {
        String b4 = this.f25966a.b(cVar);
        if (Log.isLoggable(f25962f, 2)) {
            Log.v(f25962f, "Get: Obtained: " + b4 + " for for Key: " + cVar);
        }
        try {
            b.e G3 = f().G(b4);
            if (G3 == null) {
                return null;
            }
            return G3.b(0);
        } catch (IOException e4) {
            if (!Log.isLoggable(f25962f, 5)) {
                return null;
            }
            Log.w(f25962f, "Unable to get from disk cache", e4);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void c(com.bumptech.glide.load.c cVar) {
        try {
            f().y0(this.f25966a.b(cVar));
        } catch (IOException e4) {
            if (Log.isLoggable(f25962f, 5)) {
                Log.w(f25962f, "Unable to delete from disk cache", e4);
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public synchronized void clear() {
        try {
            try {
                f().v();
            } catch (IOException e4) {
                if (Log.isLoggable(f25962f, 5)) {
                    Log.w(f25962f, "Unable to clear disk cache or disk cache cleared externally", e4);
                }
            }
        } finally {
            g();
        }
    }
}
