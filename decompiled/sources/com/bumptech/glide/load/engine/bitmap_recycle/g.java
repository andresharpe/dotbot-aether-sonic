package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
public final class g implements a<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25888a = "ByteArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i4) {
        return new byte[i4];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String s() {
        return f25888a;
    }
}
