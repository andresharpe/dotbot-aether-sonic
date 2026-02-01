package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28393a;

    public p1(int i4) {
        this.f28393a = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(@androidx.annotation.N Status status);

    public abstract void b(@androidx.annotation.N Exception exc);

    public abstract void c(C1223w0<?> c1223w0) throws DeadObjectException;

    public abstract void d(@androidx.annotation.N H h4, boolean z3);
}
