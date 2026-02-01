package com.bumptech.glide.load.model.stream;

import androidx.annotation.N;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class i implements n<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final n<com.bumptech.glide.load.model.g, InputStream> f26384a;

    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<URL, InputStream> c(r rVar) {
            return new i(rVar.d(com.bumptech.glide.load.model.g.class, InputStream.class));
        }
    }

    public i(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this.f26384a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@N URL url, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return this.f26384a.b(new com.bumptech.glide.load.model.g(url), i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N URL url) {
        return true;
    }
}
