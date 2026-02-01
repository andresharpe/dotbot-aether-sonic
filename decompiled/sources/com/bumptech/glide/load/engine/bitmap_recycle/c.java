package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.i0;

/* loaded from: classes.dex */
class c implements m {

    /* renamed from: a, reason: collision with root package name */
    private final b f25880a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f25881b = new h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final b f25882a;

        /* renamed from: b, reason: collision with root package name */
        private int f25883b;

        /* renamed from: c, reason: collision with root package name */
        private int f25884c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap.Config f25885d;

        public a(b bVar) {
            this.f25882a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
            this.f25882a.c(this);
        }

        public void b(int i4, int i5, Bitmap.Config config) {
            this.f25883b = i4;
            this.f25884c = i5;
            this.f25885d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25883b != aVar.f25883b || this.f25884c != aVar.f25884c || this.f25885d != aVar.f25885d) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i4;
            int i5 = ((this.f25883b * 31) + this.f25884c) * 31;
            Bitmap.Config config = this.f25885d;
            if (config != null) {
                i4 = config.hashCode();
            } else {
                i4 = 0;
            }
            return i5 + i4;
        }

        public String toString() {
            return c.e(this.f25883b, this.f25884c, this.f25885d);
        }
    }

    @i0
    /* loaded from: classes.dex */
    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i4, int i5, Bitmap.Config config) {
            a b4 = b();
            b4.b(i4, i5, config);
            return b4;
        }
    }

    c() {
    }

    static String e(int i4, int i5, Bitmap.Config config) {
        return "[" + i4 + "x" + i5 + "], " + config;
    }

    private static String g(Bitmap bitmap) {
        return e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public String a(int i4, int i5, Bitmap.Config config) {
        return e(i4, i5, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.n.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public void d(Bitmap bitmap) {
        this.f25881b.d(this.f25880a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        return this.f25881b.a(this.f25880a.e(i4, i5, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public Bitmap removeLast() {
        return this.f25881b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f25881b;
    }
}
