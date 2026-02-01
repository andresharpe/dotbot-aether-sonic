package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177c1 extends A {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A.a f28259d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177c1(A.a aVar, C1233e[] c1233eArr, boolean z3, int i4) {
        super(c1233eArr, z3, i4);
        this.f28259d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.A
    public final void b(C1164a.b bVar, C1771l c1771l) throws RemoteException {
        InterfaceC1220v interfaceC1220v;
        interfaceC1220v = this.f28259d.f28118a;
        interfaceC1220v.a(bVar, c1771l);
    }
}
