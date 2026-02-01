package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T1 extends androidx.collection.j {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ W1 f30414i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(W1 w12, int i4) {
        super(20);
        this.f30414i = w12;
    }

    @Override // androidx.collection.j
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        C1285y.h(str);
        return W1.q(this.f30414i, str);
    }
}
