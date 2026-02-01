package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.i0;
import java.util.NavigableMap;

@W(19)
/* loaded from: classes.dex */
final class r implements m {

    /* renamed from: d, reason: collision with root package name */
    private static final int f25934d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final b f25935a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f25936b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    private final NavigableMap<Integer, Integer> f25937c = new o();

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final b f25938a;

        /* renamed from: b, reason: collision with root package name */
        int f25939b;

        a(b bVar) {
            this.f25938a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
            this.f25938a.c(this);
        }

        public void b(int i4) {
            this.f25939b = i4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || this.f25939b != ((a) obj).f25939b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f25939b;
        }

        public String toString() {
            return r.g(this.f25939b);
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

        public a e(int i4) {
            a aVar = (a) super.b();
            aVar.b(i4);
            return aVar;
        }
    }

    r() {
    }

    private void e(Integer num) {
        Integer num2 = this.f25937c.get(num);
        if (num2.intValue() == 1) {
            this.f25937c.remove(num);
        } else {
            this.f25937c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    static String g(int i4) {
        return "[" + i4 + "]";
    }

    private static String h(Bitmap bitmap) {
        return g(com.bumptech.glide.util.n.h(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public String a(int i4, int i5, Bitmap.Config config) {
        return g(com.bumptech.glide.util.n.g(i4, i5, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.n.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public void d(Bitmap bitmap) {
        a e4 = this.f25935a.e(com.bumptech.glide.util.n.h(bitmap));
        this.f25936b.d(e4, bitmap);
        Integer num = this.f25937c.get(Integer.valueOf(e4.f25939b));
        NavigableMap<Integer, Integer> navigableMap = this.f25937c;
        Integer valueOf = Integer.valueOf(e4.f25939b);
        int i4 = 1;
        if (num != null) {
            i4 = 1 + num.intValue();
        }
        navigableMap.put(valueOf, Integer.valueOf(i4));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @P
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        int g4 = com.bumptech.glide.util.n.g(i4, i5, config);
        a e4 = this.f25935a.e(g4);
        Integer ceilingKey = this.f25937c.ceilingKey(Integer.valueOf(g4));
        if (ceilingKey != null && ceilingKey.intValue() != g4 && ceilingKey.intValue() <= g4 * 8) {
            this.f25935a.c(e4);
            e4 = this.f25935a.e(ceilingKey.intValue());
        }
        Bitmap a4 = this.f25936b.a(e4);
        if (a4 != null) {
            a4.reconfigure(i4, i5, config);
            e(ceilingKey);
        }
        return a4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @P
    public Bitmap removeLast() {
        Bitmap f4 = this.f25936b.f();
        if (f4 != null) {
            e(Integer.valueOf(com.bumptech.glide.util.n.h(f4)));
        }
        return f4;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f25936b + "\n  SortedSizes" + this.f25937c;
    }
}
