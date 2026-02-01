package com.bumptech.glide.load.engine.cache;

import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.u;

/* loaded from: classes.dex */
public class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private j.a f25978a;

    @Override // com.bumptech.glide.load.engine.cache.j
    public void a(int i4) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void b() {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void c(float f4) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public long d() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public long e() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @P
    public u<?> f(@N com.bumptech.glide.load.c cVar, @P u<?> uVar) {
        if (uVar != null) {
            this.f25978a.a(uVar);
            return null;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @P
    public u<?> g(@N com.bumptech.glide.load.c cVar) {
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void h(@N j.a aVar) {
        this.f25978a = aVar;
    }
}
