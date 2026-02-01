package com.bumptech.glide.load.engine;

import androidx.annotation.N;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class n implements com.bumptech.glide.load.c {

    /* renamed from: c, reason: collision with root package name */
    private final Object f26175c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26176d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26177e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f26178f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f26179g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.c f26180h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.i<?>> f26181i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.f f26182j;

    /* renamed from: k, reason: collision with root package name */
    private int f26183k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Object obj, com.bumptech.glide.load.c cVar, int i4, int i5, Map<Class<?>, com.bumptech.glide.load.i<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.f fVar) {
        this.f26175c = com.bumptech.glide.util.l.d(obj);
        this.f26180h = (com.bumptech.glide.load.c) com.bumptech.glide.util.l.e(cVar, "Signature must not be null");
        this.f26176d = i4;
        this.f26177e = i5;
        this.f26181i = (Map) com.bumptech.glide.util.l.d(map);
        this.f26178f = (Class) com.bumptech.glide.util.l.e(cls, "Resource class must not be null");
        this.f26179g = (Class) com.bumptech.glide.util.l.e(cls2, "Transcode class must not be null");
        this.f26182j = (com.bumptech.glide.load.f) com.bumptech.glide.util.l.d(fVar);
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f26175c.equals(nVar.f26175c) || !this.f26180h.equals(nVar.f26180h) || this.f26177e != nVar.f26177e || this.f26176d != nVar.f26176d || !this.f26181i.equals(nVar.f26181i) || !this.f26178f.equals(nVar.f26178f) || !this.f26179g.equals(nVar.f26179g) || !this.f26182j.equals(nVar.f26182j)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        if (this.f26183k == 0) {
            int hashCode = this.f26175c.hashCode();
            this.f26183k = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f26180h.hashCode()) * 31) + this.f26176d) * 31) + this.f26177e;
            this.f26183k = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f26181i.hashCode();
            this.f26183k = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f26178f.hashCode();
            this.f26183k = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f26179g.hashCode();
            this.f26183k = hashCode5;
            this.f26183k = (hashCode5 * 31) + this.f26182j.hashCode();
        }
        return this.f26183k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f26175c + ", width=" + this.f26176d + ", height=" + this.f26177e + ", resourceClass=" + this.f26178f + ", transcodeClass=" + this.f26179g + ", signature=" + this.f26180h + ", hashCode=" + this.f26183k + ", transformations=" + this.f26181i + ", options=" + this.f26182j + '}';
    }
}
