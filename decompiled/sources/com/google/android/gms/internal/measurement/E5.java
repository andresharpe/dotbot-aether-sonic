package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class E5 extends AbstractC1427k {

    /* renamed from: G, reason: collision with root package name */
    private final InterfaceC1378d6 f29314G;

    public E5(String str, InterfaceC1378d6 interfaceC1378d6) {
        super("internal.remoteConfig");
        this.f29314G = interfaceC1378d6;
        this.f29700F.put("getValue", new C1385e5(this, "getValue", interfaceC1378d6));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        return r.f29754h;
    }
}
