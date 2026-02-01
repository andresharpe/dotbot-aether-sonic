package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.d;
import java.io.File;

/* loaded from: classes.dex */
public final class g extends d {

    /* loaded from: classes.dex */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25974b;

        a(Context context, String str) {
            this.f25973a = context;
            this.f25974b = str;
        }

        @P
        private File b() {
            File cacheDir = this.f25973a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f25974b != null) {
                return new File(cacheDir, this.f25974b);
            }
            return cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File b4 = b();
            if (b4 != null && b4.exists()) {
                return b4;
            }
            File externalCacheDir = this.f25973a.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.canWrite()) {
                if (this.f25974b != null) {
                    return new File(externalCacheDir, this.f25974b);
                }
                return externalCacheDir;
            }
            return b4;
        }
    }

    public g(Context context) {
        this(context, a.InterfaceC0226a.f25950b, 262144000L);
    }

    public g(Context context, long j4) {
        this(context, a.InterfaceC0226a.f25950b, j4);
    }

    public g(Context context, String str, long j4) {
        super(new a(context, str), j4);
    }
}
