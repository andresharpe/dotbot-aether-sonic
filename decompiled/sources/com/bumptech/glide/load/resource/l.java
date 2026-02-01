package com.bumptech.glide.load.resource;

import androidx.annotation.N;
import com.bumptech.glide.load.engine.u;

/* loaded from: classes.dex */
public class l<T> implements u<T> {

    /* renamed from: E, reason: collision with root package name */
    protected final T f26642E;

    public l(@N T t3) {
        this.f26642E = (T) com.bumptech.glide.util.l.d(t3);
    }

    @Override // com.bumptech.glide.load.engine.u
    public void a() {
    }

    @Override // com.bumptech.glide.load.engine.u
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Class<T> d() {
        return (Class<T>) this.f26642E.getClass();
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public final T get() {
        return this.f26642E;
    }
}
