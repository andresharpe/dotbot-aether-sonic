package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class X6 extends AbstractC1427k {

    /* renamed from: G, reason: collision with root package name */
    private final Callable f29562G;

    public X6(String str, Callable callable) {
        super("internal.appMetadata");
        this.f29562G = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        try {
            return C1415i3.b(this.f29562G.call());
        } catch (Exception unused) {
            return r.f29754h;
        }
    }
}
