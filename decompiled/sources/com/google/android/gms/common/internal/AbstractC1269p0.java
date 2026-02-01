package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.InterfaceC0564g;
import com.google.android.gms.common.C1231c;

/* renamed from: com.google.android.gms.common.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1269p0 extends C0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f28798d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.P
    public final Bundle f28799e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1246e f28800f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC0564g
    public AbstractC1269p0(AbstractC1246e abstractC1246e, @androidx.annotation.P int i4, Bundle bundle) {
        super(abstractC1246e, Boolean.TRUE);
        this.f28800f = abstractC1246e;
        this.f28798d = i4;
        this.f28799e = bundle;
    }

    @Override // com.google.android.gms.common.internal.C0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.f28798d != 0) {
            this.f28800f.q0(1, null);
            Bundle bundle = this.f28799e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable(AbstractC1246e.f28687I);
            }
            f(new C1231c(this.f28798d, pendingIntent));
            return;
        }
        if (!g()) {
            this.f28800f.q0(1, null);
            f(new C1231c(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.C0
    public final void b() {
    }

    protected abstract void f(C1231c c1231c);

    protected abstract boolean g();
}
