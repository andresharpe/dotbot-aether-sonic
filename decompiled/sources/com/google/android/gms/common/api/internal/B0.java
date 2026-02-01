package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.d;
import com.google.android.gms.common.api.internal.C1181e;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class B0<O extends C1164a.d> extends K {

    /* renamed from: f, reason: collision with root package name */
    @NotOnlyInitialized
    private final com.google.android.gms.common.api.h<O> f28131f;

    public B0(com.google.android.gms.common.api.h<O> hVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f28131f = hVar;
    }

    @Override // com.google.android.gms.common.api.i
    public final void H(C1195i1 c1195i1) {
    }

    @Override // com.google.android.gms.common.api.i
    public final void I(C1195i1 c1195i1) {
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T l(@androidx.annotation.N T t3) {
        return (T) this.f28131f.h(t3);
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T m(@androidx.annotation.N T t3) {
        return (T) this.f28131f.n(t3);
    }

    @Override // com.google.android.gms.common.api.i
    public final Context q() {
        return this.f28131f.q();
    }

    @Override // com.google.android.gms.common.api.i
    public final Looper r() {
        return this.f28131f.t();
    }
}
