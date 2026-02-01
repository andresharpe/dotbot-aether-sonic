package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1502t3 {
    public static InterfaceC1471p3 a(InterfaceC1471p3 interfaceC1471p3) {
        if (!(interfaceC1471p3 instanceof C1486r3) && !(interfaceC1471p3 instanceof C1479q3)) {
            if (interfaceC1471p3 instanceof Serializable) {
                return new C1479q3(interfaceC1471p3);
            }
            return new C1486r3(interfaceC1471p3);
        }
        return interfaceC1471p3;
    }

    public static InterfaceC1471p3 b(Object obj) {
        return new C1494s3(obj);
    }
}
