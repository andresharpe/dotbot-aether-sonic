package com.bumptech.glide.util;

import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.f;

/* loaded from: classes.dex */
public class g<T> implements f.b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f26947a;

    public g(int i4, int i5) {
        this.f26947a = new int[]{i4, i5};
    }

    @Override // com.bumptech.glide.f.b
    @P
    public int[] a(@N T t3, int i4, int i5) {
        return this.f26947a;
    }
}
