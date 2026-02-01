package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class W6 extends AbstractC1427k {

    /* renamed from: G, reason: collision with root package name */
    private final U6 f29545G;

    public W6(U6 u6) {
        super("internal.logger");
        this.f29545G = u6;
        this.f29700F.put("log", new V6(this, false, true));
        this.f29700F.put(androidx.core.app.C0.f11559Q0, new E6(this, androidx.core.app.C0.f11559Q0));
        ((AbstractC1427k) this.f29700F.get(androidx.core.app.C0.f11559Q0)).c("log", new V6(this, true, true));
        this.f29700F.put("unmonitored", new T6(this, "unmonitored"));
        ((AbstractC1427k) this.f29700F.get("unmonitored")).c("log", new V6(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        return r.f29754h;
    }
}
