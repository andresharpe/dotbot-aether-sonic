package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class F implements l.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f28152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f28153b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(H h4, BasePendingResult basePendingResult) {
        this.f28153b = h4;
        this.f28152a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.l.a
    public final void a(Status status) {
        Map map;
        map = this.f28153b.f28157a;
        map.remove(this.f28152a);
    }
}
