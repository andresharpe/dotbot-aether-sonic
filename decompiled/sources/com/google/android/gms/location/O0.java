package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
final class O0 implements C1181e.b<Status> {

    /* renamed from: a, reason: collision with root package name */
    private final C1771l<Void> f29941a;

    public O0(C1771l<Void> c1771l) {
        C1285y.l(c1771l);
        this.f29941a = c1771l;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.b
    public final void a(@androidx.annotation.P Status status) {
        if (status == null) {
            return;
        }
        this.f29941a.b(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.b
    public final /* bridge */ /* synthetic */ void b(Status status) {
        com.google.android.gms.common.api.internal.B.b(status, null, this.f29941a);
    }
}
