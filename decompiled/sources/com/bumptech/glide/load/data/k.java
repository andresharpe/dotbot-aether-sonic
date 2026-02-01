package com.bumptech.glide.load.data;

import androidx.annotation.N;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.F;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f25816b = 5242880;

    /* renamed from: a, reason: collision with root package name */
    private final F f25817a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f25818a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f25818a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f25818a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        F f4 = new F(inputStream, bVar);
        this.f25817a = f4;
        f4.mark(f25816b);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f25817a.release();
    }

    public void c() {
        this.f25817a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    @N
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f25817a.reset();
        return this.f25817a;
    }
}
