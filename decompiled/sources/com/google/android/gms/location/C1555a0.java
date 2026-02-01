package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.tasks.C1771l;

/* renamed from: com.google.android.gms.location.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1555a0 implements C1181e.b<Status> {

    /* renamed from: a, reason: collision with root package name */
    private final C1771l<Void> f29970a;

    public C1555a0(C1771l<Void> c1771l) {
        this.f29970a = c1771l;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.b
    public final void a(Status status) {
        this.f29970a.b(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.b
    public final /* bridge */ /* synthetic */ void b(Status status) {
        com.google.android.gms.common.api.internal.B.b(status, null, this.f29970a);
    }
}
