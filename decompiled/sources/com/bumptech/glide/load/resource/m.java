package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.N;
import com.bumptech.glide.load.engine.u;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class m<T> implements com.bumptech.glide.load.i<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final com.bumptech.glide.load.i<?> f26643c = new m();

    private m() {
    }

    @N
    public static <T> m<T> c() {
        return (m) f26643c;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.i
    @N
    public u<T> b(@N Context context, @N u<T> uVar, int i4, int i5) {
        return uVar;
    }
}
