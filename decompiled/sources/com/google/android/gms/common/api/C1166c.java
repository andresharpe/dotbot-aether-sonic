package com.google.android.gms.common.api;

import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166c implements q {

    /* renamed from: E, reason: collision with root package name */
    private final Status f28052E;

    /* renamed from: F, reason: collision with root package name */
    private final l<?>[] f28053F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1166c(Status status, l<?>[] lVarArr) {
        this.f28052E = status;
        this.f28053F = lVarArr;
    }

    @N
    public <R extends q> R a(@N C1167d<R> c1167d) {
        boolean z3;
        if (c1167d.f28054a < this.f28053F.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "The result token does not belong to this batch");
        return (R) this.f28053F[c1167d.f28054a].await(0L, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.common.api.q
    @N
    public Status getStatus() {
        return this.f28052E;
    }
}
