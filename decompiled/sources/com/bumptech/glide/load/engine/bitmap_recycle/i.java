package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
public final class i implements a<int[]> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25895a = "IntegerArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int b(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i4) {
        return new int[i4];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String s() {
        return f25895a;
    }
}
