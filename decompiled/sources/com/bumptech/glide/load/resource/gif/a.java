package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.m;
import com.bumptech.glide.util.n;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class a implements com.bumptech.glide.load.g<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f26571f = "BufferGifDecoder";

    /* renamed from: g, reason: collision with root package name */
    private static final C0238a f26572g = new C0238a();

    /* renamed from: h, reason: collision with root package name */
    private static final b f26573h = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f26574a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f26575b;

    /* renamed from: c, reason: collision with root package name */
    private final b f26576c;

    /* renamed from: d, reason: collision with root package name */
    private final C0238a f26577d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.gif.b f26578e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0238a {
        C0238a() {
        }

        com.bumptech.glide.gifdecoder.a a(a.InterfaceC0221a interfaceC0221a, com.bumptech.glide.gifdecoder.c cVar, ByteBuffer byteBuffer, int i4) {
            return new com.bumptech.glide.gifdecoder.f(interfaceC0221a, cVar, byteBuffer, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<com.bumptech.glide.gifdecoder.d> f26579a = n.f(0);

        b() {
        }

        synchronized com.bumptech.glide.gifdecoder.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.gifdecoder.d poll;
            try {
                poll = this.f26579a.poll();
                if (poll == null) {
                    poll = new com.bumptech.glide.gifdecoder.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return poll.q(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.a();
            this.f26579a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, com.bumptech.glide.b.e(context).n().g(), com.bumptech.glide.b.e(context).h(), com.bumptech.glide.b.e(context).g());
    }

    @P
    private e c(ByteBuffer byteBuffer, int i4, int i5, com.bumptech.glide.gifdecoder.d dVar, com.bumptech.glide.load.f fVar) {
        Bitmap.Config config;
        long b4 = com.bumptech.glide.util.h.b();
        try {
            com.bumptech.glide.gifdecoder.c d4 = dVar.d();
            if (d4.b() > 0 && d4.c() == 0) {
                if (fVar.c(i.f26626a) == DecodeFormat.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                com.bumptech.glide.gifdecoder.a a4 = this.f26577d.a(this.f26578e, d4, byteBuffer, e(d4, i4, i5));
                a4.j(config);
                a4.f();
                Bitmap e4 = a4.e();
                if (e4 == null) {
                    if (Log.isLoggable(f26571f, 2)) {
                        Log.v(f26571f, "Decoded GIF from stream in " + com.bumptech.glide.util.h.a(b4));
                    }
                    return null;
                }
                e eVar = new e(new c(this.f26574a, a4, m.c(), i4, i5, e4));
                if (Log.isLoggable(f26571f, 2)) {
                    Log.v(f26571f, "Decoded GIF from stream in " + com.bumptech.glide.util.h.a(b4));
                }
                return eVar;
            }
            return null;
        } finally {
            if (Log.isLoggable(f26571f, 2)) {
                Log.v(f26571f, "Decoded GIF from stream in " + com.bumptech.glide.util.h.a(b4));
            }
        }
    }

    private static int e(com.bumptech.glide.gifdecoder.c cVar, int i4, int i5) {
        int highestOneBit;
        int min = Math.min(cVar.a() / i5, cVar.d() / i4);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable(f26571f, 2) && max > 1) {
            Log.v(f26571f, "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i4 + "x" + i5 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(@N ByteBuffer byteBuffer, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        com.bumptech.glide.gifdecoder.d a4 = this.f26576c.a(byteBuffer);
        try {
            return c(byteBuffer, i4, i5, a4, fVar);
        } finally {
            this.f26576c.b(a4);
        }
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(@N ByteBuffer byteBuffer, @N com.bumptech.glide.load.f fVar) throws IOException {
        if (!((Boolean) fVar.c(i.f26627b)).booleanValue() && com.bumptech.glide.load.b.f(this.f26575b, byteBuffer) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(context, list, eVar, bVar, f26573h, f26572g);
    }

    @i0
    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, b bVar2, C0238a c0238a) {
        this.f26574a = context.getApplicationContext();
        this.f26575b = list;
        this.f26577d = c0238a;
        this.f26578e = new com.bumptech.glide.load.resource.gif.b(eVar, bVar);
        this.f26576c = bVar2;
    }
}
