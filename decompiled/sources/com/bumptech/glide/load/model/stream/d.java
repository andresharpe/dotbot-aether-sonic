package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.N;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;

/* loaded from: classes.dex */
public class d implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26363a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26364a;

        public a(Context context) {
            this.f26364a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, InputStream> c(r rVar) {
            return new d(this.f26364a);
        }
    }

    public d(Context context) {
        this.f26363a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        if (com.bumptech.glide.load.data.mediastore.b.d(i4, i5)) {
            return new n.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.f(this.f26363a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.a(uri);
    }
}
