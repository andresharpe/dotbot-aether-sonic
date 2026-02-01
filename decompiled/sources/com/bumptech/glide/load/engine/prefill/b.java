package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.i0;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.prefill.d;
import com.bumptech.glide.util.n;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final j f26205a;

    /* renamed from: b, reason: collision with root package name */
    private final e f26206b;

    /* renamed from: c, reason: collision with root package name */
    private final DecodeFormat f26207c;

    /* renamed from: d, reason: collision with root package name */
    private a f26208d;

    public b(j jVar, e eVar, DecodeFormat decodeFormat) {
        this.f26205a = jVar;
        this.f26206b = eVar;
        this.f26207c = decodeFormat;
    }

    private static int b(d dVar) {
        return n.g(dVar.d(), dVar.b(), dVar.a());
    }

    @i0
    c a(d... dVarArr) {
        long e4 = (this.f26205a.e() - this.f26205a.d()) + this.f26206b.e();
        int i4 = 0;
        for (d dVar : dVarArr) {
            i4 += dVar.c();
        }
        float f4 = ((float) e4) / i4;
        HashMap hashMap = new HashMap();
        for (d dVar2 : dVarArr) {
            hashMap.put(dVar2, Integer.valueOf(Math.round(dVar2.c() * f4) / b(dVar2)));
        }
        return new c(hashMap);
    }

    public void c(d.a... aVarArr) {
        Bitmap.Config config;
        a aVar = this.f26208d;
        if (aVar != null) {
            aVar.b();
        }
        d[] dVarArr = new d[aVarArr.length];
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            d.a aVar2 = aVarArr[i4];
            if (aVar2.b() == null) {
                if (this.f26207c == DecodeFormat.PREFER_ARGB_8888) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                aVar2.c(config);
            }
            dVarArr[i4] = aVar2.a();
        }
        a aVar3 = new a(this.f26206b, this.f26205a, a(dVarArr));
        this.f26208d = aVar3;
        n.x(aVar3);
    }
}
