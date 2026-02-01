package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.gifdecoder.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0221a {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26580a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26581b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(eVar, null);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0221a
    @N
    public Bitmap a(int i4, int i5, @N Bitmap.Config config) {
        return this.f26580a.g(i4, i5, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0221a
    @N
    public int[] b(int i4) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f26581b;
        if (bVar == null) {
            return new int[i4];
        }
        return (int[]) bVar.e(i4, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0221a
    public void c(@N Bitmap bitmap) {
        this.f26580a.d(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0221a
    public void d(@N byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f26581b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0221a
    @N
    public byte[] e(int i4) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f26581b;
        if (bVar == null) {
            return new byte[i4];
        }
        return (byte[]) bVar.e(i4, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0221a
    public void f(@N int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f26581b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @P com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f26580a = eVar;
        this.f26581b = bVar;
    }
}
