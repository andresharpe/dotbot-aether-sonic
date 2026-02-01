package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.b;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.tasks.C1771l;

@I0.a
/* loaded from: classes.dex */
public abstract class C<A extends C1164a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final C1205n.a<L> f28132a;

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public C(@androidx.annotation.N C1205n.a<L> aVar) {
        this.f28132a = aVar;
    }

    @I0.a
    @androidx.annotation.N
    public C1205n.a<L> a() {
        return this.f28132a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public abstract void b(@androidx.annotation.N A a4, @androidx.annotation.N C1771l<Boolean> c1771l) throws RemoteException;
}
