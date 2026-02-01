package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1190h implements com.google.android.gms.common.api.q, com.google.android.gms.common.api.n {

    /* renamed from: E, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    protected final Status f28277E;

    /* renamed from: F, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    protected final DataHolder f28278F;

    @I0.a
    protected AbstractC1190h(@androidx.annotation.N DataHolder dataHolder, @androidx.annotation.N Status status) {
        this.f28277E = status;
        this.f28278F = dataHolder;
    }

    @Override // com.google.android.gms.common.api.q
    @I0.a
    @androidx.annotation.N
    public Status getStatus() {
        return this.f28277E;
    }

    @Override // com.google.android.gms.common.api.n
    @I0.a
    public void release() {
        DataHolder dataHolder = this.f28278F;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @I0.a
    protected AbstractC1190h(@androidx.annotation.N DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.z0()));
    }
}
