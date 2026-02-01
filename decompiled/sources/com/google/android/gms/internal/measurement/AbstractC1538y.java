package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1538y {

    /* renamed from: a, reason: collision with root package name */
    final List f29837a = new ArrayList();

    public abstract r a(String str, C1398g2 c1398g2, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(String str) {
        if (this.f29837a.contains(H2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
