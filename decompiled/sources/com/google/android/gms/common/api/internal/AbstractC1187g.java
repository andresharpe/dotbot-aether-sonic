package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.data.DataHolder;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1187g<L> implements C1205n.b<L> {

    /* renamed from: a, reason: collision with root package name */
    private final DataHolder f28274a;

    @I0.a
    protected AbstractC1187g(@androidx.annotation.N DataHolder dataHolder) {
        this.f28274a = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    @I0.a
    public final void a(@androidx.annotation.N L l4) {
        c(l4, this.f28274a);
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    @I0.a
    public void b() {
        DataHolder dataHolder = this.f28274a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @I0.a
    protected abstract void c(@androidx.annotation.N L l4, @androidx.annotation.N DataHolder dataHolder);
}
