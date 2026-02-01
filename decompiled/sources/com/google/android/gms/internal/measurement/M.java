package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class M extends AbstractC1538y {
    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    public final r a(String str, C1398g2 c1398g2, List list) {
        if (str != null && !str.isEmpty() && c1398g2.h(str)) {
            r d4 = c1398g2.d(str);
            if (d4 instanceof AbstractC1427k) {
                return ((AbstractC1427k) d4).a(c1398g2, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
