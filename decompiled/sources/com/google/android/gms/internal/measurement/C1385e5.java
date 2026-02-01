package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1385e5 extends AbstractC1427k {

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ InterfaceC1378d6 f29629G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385e5(E5 e5, String str, InterfaceC1378d6 interfaceC1378d6) {
        super("getValue");
        this.f29629G = interfaceC1378d6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        H2.h("getValue", 2, list);
        r b4 = c1398g2.b((r) list.get(0));
        r b5 = c1398g2.b((r) list.get(1));
        String zza = this.f29629G.zza(b4.zzi());
        if (zza != null) {
            return new C1514v(zza);
        }
        return b5;
    }
}
