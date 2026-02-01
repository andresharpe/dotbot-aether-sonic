package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.d;
import java.io.File;

/* loaded from: classes.dex */
public final class h extends d {

    /* loaded from: classes.dex */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25975a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25976b;

        a(Context context, String str) {
            this.f25975a = context;
            this.f25976b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File cacheDir = this.f25975a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f25976b != null) {
                return new File(cacheDir, this.f25976b);
            }
            return cacheDir;
        }
    }

    public h(Context context) {
        this(context, a.InterfaceC0226a.f25950b, 262144000L);
    }

    public h(Context context, long j4) {
        this(context, a.InterfaceC0226a.f25950b, j4);
    }

    public h(Context context, String str, long j4) {
        super(new a(context, str), j4);
    }
}
