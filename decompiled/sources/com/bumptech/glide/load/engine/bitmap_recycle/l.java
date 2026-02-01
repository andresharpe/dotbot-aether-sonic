package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class l implements e {

    /* renamed from: k, reason: collision with root package name */
    private static final String f25908k = "LruBitmapPool";

    /* renamed from: l, reason: collision with root package name */
    private static final Bitmap.Config f25909l = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final m f25910a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f25911b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25912c;

    /* renamed from: d, reason: collision with root package name */
    private final a f25913d;

    /* renamed from: e, reason: collision with root package name */
    private long f25914e;

    /* renamed from: f, reason: collision with root package name */
    private long f25915f;

    /* renamed from: g, reason: collision with root package name */
    private int f25916g;

    /* renamed from: h, reason: collision with root package name */
    private int f25917h;

    /* renamed from: i, reason: collision with root package name */
    private int f25918i;

    /* renamed from: j, reason: collision with root package name */
    private int f25919j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void b(Bitmap bitmap) {
        }
    }

    /* loaded from: classes.dex */
    private static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Bitmap> f25920a = Collections.synchronizedSet(new HashSet());

        private c() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void a(Bitmap bitmap) {
            if (this.f25920a.contains(bitmap)) {
                this.f25920a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void b(Bitmap bitmap) {
            if (!this.f25920a.contains(bitmap)) {
                this.f25920a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }
    }

    l(long j4, m mVar, Set<Bitmap.Config> set) {
        this.f25912c = j4;
        this.f25914e = j4;
        this.f25910a = mVar;
        this.f25911b = set;
        this.f25913d = new b();
    }

    @TargetApi(26)
    private static void h(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config != config2) {
                return;
            }
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @N
    private static Bitmap i(int i4, int i5, @P Bitmap.Config config) {
        if (config == null) {
            config = f25909l;
        }
        return Bitmap.createBitmap(i4, i5, config);
    }

    private void j() {
        if (Log.isLoggable(f25908k, 2)) {
            k();
        }
    }

    private void k() {
        Log.v(f25908k, "Hits=" + this.f25916g + ", misses=" + this.f25917h + ", puts=" + this.f25918i + ", evictions=" + this.f25919j + ", currentSize=" + this.f25915f + ", maxSize=" + this.f25914e + "\nStrategy=" + this.f25910a);
    }

    private void l() {
        v(this.f25914e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> o() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i4 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i4 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static m p() {
        return new q();
    }

    @P
    private synchronized Bitmap q(int i4, int i5, @P Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap f4;
        try {
            h(config);
            m mVar = this.f25910a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f25909l;
            }
            f4 = mVar.f(i4, i5, config2);
            if (f4 == null) {
                if (Log.isLoggable(f25908k, 3)) {
                    Log.d(f25908k, "Missing bitmap=" + this.f25910a.a(i4, i5, config));
                }
                this.f25917h++;
            } else {
                this.f25916g++;
                this.f25915f -= this.f25910a.b(f4);
                this.f25913d.a(f4);
                u(f4);
            }
            if (Log.isLoggable(f25908k, 2)) {
                Log.v(f25908k, "Get bitmap=" + this.f25910a.a(i4, i5, config));
            }
            j();
        } catch (Throwable th) {
            throw th;
        }
        return f4;
    }

    @TargetApi(19)
    private static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        s(bitmap);
    }

    private synchronized void v(long j4) {
        while (this.f25915f > j4) {
            try {
                Bitmap removeLast = this.f25910a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable(f25908k, 5)) {
                        Log.w(f25908k, "Size mismatch, resetting");
                        k();
                    }
                    this.f25915f = 0L;
                    return;
                }
                this.f25913d.a(removeLast);
                this.f25915f -= this.f25910a.b(removeLast);
                this.f25919j++;
                if (Log.isLoggable(f25908k, 3)) {
                    Log.d(f25908k, "Evicting bitmap=" + this.f25910a.c(removeLast));
                }
                j();
                removeLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @SuppressLint({"InlinedApi"})
    public void a(int i4) {
        if (Log.isLoggable(f25908k, 3)) {
            Log.d(f25908k, "trimMemory, level=" + i4);
        }
        if (i4 < 40 && i4 < 20) {
            if (i4 >= 20 || i4 == 15) {
                v(e() / 2);
                return;
            }
            return;
        }
        b();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
        if (Log.isLoggable(f25908k, 3)) {
            Log.d(f25908k, "clearMemory");
        }
        v(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void c(float f4) {
        this.f25914e = Math.round(((float) this.f25912c) * f4);
        l();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f25910a.b(bitmap) <= this.f25914e && this.f25911b.contains(bitmap.getConfig())) {
                        int b4 = this.f25910a.b(bitmap);
                        this.f25910a.d(bitmap);
                        this.f25913d.b(bitmap);
                        this.f25918i++;
                        this.f25915f += b4;
                        if (Log.isLoggable(f25908k, 2)) {
                            Log.v(f25908k, "Put bitmap in pool=" + this.f25910a.c(bitmap));
                        }
                        j();
                        l();
                        return;
                    }
                    if (Log.isLoggable(f25908k, 2)) {
                        Log.v(f25908k, "Reject bitmap from pool, bitmap: " + this.f25910a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f25911b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long e() {
        return this.f25914e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        Bitmap q4 = q(i4, i5, config);
        if (q4 != null) {
            q4.eraseColor(0);
            return q4;
        }
        return i(i4, i5, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public Bitmap g(int i4, int i5, Bitmap.Config config) {
        Bitmap q4 = q(i4, i5, config);
        if (q4 == null) {
            return i(i4, i5, config);
        }
        return q4;
    }

    public long m() {
        return this.f25919j;
    }

    public long n() {
        return this.f25915f;
    }

    public long r() {
        return this.f25916g;
    }

    public long t() {
        return this.f25917h;
    }

    public l(long j4) {
        this(j4, p(), o());
    }

    public l(long j4, Set<Bitmap.Config> set) {
        this(j4, p(), set);
    }
}
