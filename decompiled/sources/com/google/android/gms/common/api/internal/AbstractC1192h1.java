package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1192h1<T> extends G0 {

    /* renamed from: b, reason: collision with root package name */
    protected final C1771l<T> f28283b;

    public AbstractC1192h1(int i4, C1771l<T> c1771l) {
        super(i4);
        this.f28283b = c1771l;
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(@androidx.annotation.N Status status) {
        this.f28283b.d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void b(@androidx.annotation.N Exception exc) {
        this.f28283b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(C1223w0<?> c1223w0) throws DeadObjectException {
        try {
            h(c1223w0);
        } catch (DeadObjectException e4) {
            a(p1.e(e4));
            throw e4;
        } catch (RemoteException e5) {
            a(p1.e(e5));
        } catch (RuntimeException e6) {
            this.f28283b.d(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public void d(@androidx.annotation.N H h4, boolean z3) {
    }

    protected abstract void h(C1223w0<?> c1223w0) throws RemoteException;
}
