package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.u;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class J implements com.bumptech.glide.load.g<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final u f26477a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26478b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements u.b {

        /* renamed from: a, reason: collision with root package name */
        private final F f26479a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.util.e f26480b;

        a(F f4, com.bumptech.glide.util.e eVar) {
            this.f26479a = f4;
            this.f26480b = eVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException {
            IOException b4 = this.f26480b.b();
            if (b4 != null) {
                if (bitmap != null) {
                    eVar.d(bitmap);
                    throw b4;
                }
                throw b4;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void b() {
            this.f26479a.b();
        }
    }

    public J(u uVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f26477a = uVar;
        this.f26478b = bVar;
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N InputStream inputStream, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        boolean z3;
        F f4;
        if (inputStream instanceof F) {
            f4 = (F) inputStream;
            z3 = false;
        } else {
            z3 = true;
            f4 = new F(inputStream, this.f26478b);
        }
        com.bumptech.glide.util.e c4 = com.bumptech.glide.util.e.c(f4);
        try {
            return this.f26477a.g(new com.bumptech.glide.util.j(c4), i4, i5, fVar, new a(f4, c4));
        } finally {
            c4.release();
            if (z3) {
                f4.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N InputStream inputStream, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return this.f26477a.p(inputStream);
    }
}
