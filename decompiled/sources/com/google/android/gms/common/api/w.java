package com.google.android.gms.common.api;

import com.google.android.gms.common.api.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w implements l.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1165b f28462a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(C1165b c1165b) {
        this.f28462a = c1165b;
    }

    @Override // com.google.android.gms.common.api.l.a
    public final void a(Status status) {
        Object obj;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        Status status2;
        l[] lVarArr;
        obj = this.f28462a.f28049e;
        synchronized (obj) {
            try {
                if (this.f28462a.isCanceled()) {
                    return;
                }
                if (status.y0()) {
                    this.f28462a.f28047c = true;
                } else if (!status.B0()) {
                    this.f28462a.f28046b = true;
                }
                C1165b c1165b = this.f28462a;
                i4 = c1165b.f28045a;
                c1165b.f28045a = i4 - 1;
                C1165b c1165b2 = this.f28462a;
                i5 = c1165b2.f28045a;
                if (i5 == 0) {
                    z3 = c1165b2.f28047c;
                    if (z3) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        z4 = c1165b2.f28046b;
                        if (z4) {
                            status2 = new Status(13);
                        } else {
                            status2 = Status.f28025K;
                        }
                        C1165b c1165b3 = this.f28462a;
                        lVarArr = c1165b3.f28048d;
                        c1165b3.setResult(new C1166c(status2, lVarArr));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
