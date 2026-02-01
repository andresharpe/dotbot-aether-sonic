package com.bumptech.glide.load.model.stream;

import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;

/* loaded from: classes.dex */
public class b implements n<com.bumptech.glide.load.model.g, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Integer> f26360b = com.bumptech.glide.load.e.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(com.android.volley.g.f24473e));

    /* renamed from: a, reason: collision with root package name */
    @P
    private final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f26361a;

    /* loaded from: classes.dex */
    public static class a implements o<com.bumptech.glide.load.model.g, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f26362a = new m<>(500);

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<com.bumptech.glide.load.model.g, InputStream> c(r rVar) {
            return new b(this.f26362a);
        }
    }

    public b() {
        this(null);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@N com.bumptech.glide.load.model.g gVar, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar = this.f26361a;
        if (mVar != null) {
            com.bumptech.glide.load.model.g b4 = mVar.b(gVar, 0, 0);
            if (b4 == null) {
                this.f26361a.c(gVar, 0, 0, gVar);
            } else {
                gVar = b4;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) fVar.c(f26360b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N com.bumptech.glide.load.model.g gVar) {
        return true;
    }

    public b(@P m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar) {
        this.f26361a = mVar;
    }
}
