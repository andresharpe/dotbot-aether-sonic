package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.u;

/* loaded from: classes.dex */
public class i extends com.bumptech.glide.util.i<com.bumptech.glide.load.c, u<?>> implements j {

    /* renamed from: e, reason: collision with root package name */
    private j.a f25977e;

    public i(long j4) {
        super(j4);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @SuppressLint({"InlinedApi"})
    public void a(int i4) {
        if (i4 >= 40) {
            b();
        } else if (i4 >= 20 || i4 == 15) {
            q(e() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @P
    public /* bridge */ /* synthetic */ u f(@N com.bumptech.glide.load.c cVar, @P u uVar) {
        return (u) super.o(cVar, uVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @P
    public /* bridge */ /* synthetic */ u g(@N com.bumptech.glide.load.c cVar) {
        return (u) super.p(cVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void h(@N j.a aVar) {
        this.f25977e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int m(@P u<?> uVar) {
        if (uVar == null) {
            return super.m(null);
        }
        return uVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(@N com.bumptech.glide.load.c cVar, @P u<?> uVar) {
        j.a aVar = this.f25977e;
        if (aVar != null && uVar != null) {
            aVar.a(uVar);
        }
    }
}
