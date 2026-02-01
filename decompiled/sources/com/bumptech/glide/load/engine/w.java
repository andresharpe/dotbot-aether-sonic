package com.bumptech.glide.load.engine;

import androidx.annotation.N;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class w implements com.bumptech.glide.load.c {

    /* renamed from: k, reason: collision with root package name */
    private static final com.bumptech.glide.util.i<Class<?>, byte[]> f26243k = new com.bumptech.glide.util.i<>(50);

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26244c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.c f26245d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.c f26246e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26247f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26248g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f26249h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.f f26250i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.i<?> f26251j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.load.c cVar, com.bumptech.glide.load.c cVar2, int i4, int i5, com.bumptech.glide.load.i<?> iVar, Class<?> cls, com.bumptech.glide.load.f fVar) {
        this.f26244c = bVar;
        this.f26245d = cVar;
        this.f26246e = cVar2;
        this.f26247f = i4;
        this.f26248g = i5;
        this.f26251j = iVar;
        this.f26249h = cls;
        this.f26250i = fVar;
    }

    private byte[] c() {
        com.bumptech.glide.util.i<Class<?>, byte[]> iVar = f26243k;
        byte[] k4 = iVar.k(this.f26249h);
        if (k4 == null) {
            byte[] bytes = this.f26249h.getName().getBytes(com.bumptech.glide.load.c.f25784b);
            iVar.o(this.f26249h, bytes);
            return bytes;
        }
        return k4;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f26244c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f26247f).putInt(this.f26248g).array();
        this.f26246e.a(messageDigest);
        this.f26245d.a(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.i<?> iVar = this.f26251j;
        if (iVar != null) {
            iVar.a(messageDigest);
        }
        this.f26250i.a(messageDigest);
        messageDigest.update(c());
        this.f26244c.put(bArr);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f26248g != wVar.f26248g || this.f26247f != wVar.f26247f || !com.bumptech.glide.util.n.d(this.f26251j, wVar.f26251j) || !this.f26249h.equals(wVar.f26249h) || !this.f26245d.equals(wVar.f26245d) || !this.f26246e.equals(wVar.f26246e) || !this.f26250i.equals(wVar.f26250i)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        int hashCode = (((((this.f26245d.hashCode() * 31) + this.f26246e.hashCode()) * 31) + this.f26247f) * 31) + this.f26248g;
        com.bumptech.glide.load.i<?> iVar = this.f26251j;
        if (iVar != null) {
            hashCode = (hashCode * 31) + iVar.hashCode();
        }
        return (((hashCode * 31) + this.f26249h.hashCode()) * 31) + this.f26250i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f26245d + ", signature=" + this.f26246e + ", width=" + this.f26247f + ", height=" + this.f26248g + ", decodedResourceClass=" + this.f26249h + ", transformation='" + this.f26251j + "', options=" + this.f26250i + '}';
    }
}
