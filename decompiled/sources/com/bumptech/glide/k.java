package com.bumptech.glide;

import androidx.annotation.N;
import com.bumptech.glide.k;
import com.bumptech.glide.request.transition.j;
import com.bumptech.glide.util.l;

/* loaded from: classes.dex */
public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: E, reason: collision with root package name */
    private com.bumptech.glide.request.transition.g<? super TranscodeType> f25769E = com.bumptech.glide.request.transition.e.c();

    private CHILD e() {
        return this;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    @N
    public final CHILD b() {
        return g(com.bumptech.glide.request.transition.e.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.bumptech.glide.request.transition.g<? super TranscodeType> d() {
        return this.f25769E;
    }

    @N
    public final CHILD f(int i4) {
        return g(new com.bumptech.glide.request.transition.h(i4));
    }

    @N
    public final CHILD g(@N com.bumptech.glide.request.transition.g<? super TranscodeType> gVar) {
        this.f25769E = (com.bumptech.glide.request.transition.g) l.d(gVar);
        return e();
    }

    @N
    public final CHILD h(@N j.a aVar) {
        return g(new com.bumptech.glide.request.transition.i(aVar));
    }
}
