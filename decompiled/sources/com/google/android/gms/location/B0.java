package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
final class B0 implements C1181e.b<C1595v> {

    /* renamed from: a, reason: collision with root package name */
    private final C1771l<C1593u> f29865a;

    public B0(C1771l<C1593u> c1771l) {
        this.f29865a = c1771l;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.b
    public final void a(Status status) {
        this.f29865a.b(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.b
    public final /* bridge */ /* synthetic */ void b(C1595v c1595v) {
        C1595v c1595v2 = c1595v;
        Status status = c1595v2.getStatus();
        if (status.B0()) {
            this.f29865a.c(new C1593u(c1595v2));
        } else if (status.x0()) {
            this.f29865a.b(new ResolvableApiException(status));
        } else {
            this.f29865a.b(new ApiException(status));
        }
    }
}
