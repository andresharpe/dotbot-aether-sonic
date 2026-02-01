package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.api.internal.InterfaceC1199k;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC1224x extends InterfaceC1199k.a {

    /* renamed from: i, reason: collision with root package name */
    @I0.a
    private final C1181e.b<Status> f28449i;

    @I0.a
    public BinderC1224x(@androidx.annotation.N C1181e.b<Status> bVar) {
        this.f28449i = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1199k
    @I0.a
    public void v0(@androidx.annotation.N Status status) {
        this.f28449i.b(status);
    }
}
