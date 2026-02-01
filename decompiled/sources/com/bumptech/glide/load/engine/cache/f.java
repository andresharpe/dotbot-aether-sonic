package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.d;
import java.io.File;

@Deprecated
/* loaded from: classes.dex */
public final class f extends d {

    /* loaded from: classes.dex */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25972b;

        a(Context context, String str) {
            this.f25971a = context;
            this.f25972b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir = this.f25971a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            if (this.f25972b != null) {
                return new File(externalCacheDir, this.f25972b);
            }
            return externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, a.InterfaceC0226a.f25950b, a.InterfaceC0226a.f25949a);
    }

    public f(Context context, int i4) {
        this(context, a.InterfaceC0226a.f25950b, i4);
    }

    public f(Context context, String str, int i4) {
        super(new a(context, str), i4);
    }
}
