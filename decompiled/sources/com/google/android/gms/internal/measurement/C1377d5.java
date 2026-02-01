package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1377d5 extends C1465o5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1377d5(int i4) {
        super(i4, null);
    }

    @Override // com.google.android.gms.internal.measurement.C1465o5
    public final void a() {
        if (!n()) {
            for (int i4 = 0; i4 < c(); i4++) {
                Map.Entry k4 = k(i4);
                if (((InterfaceC1360b4) k4.getKey()).zzc()) {
                    k4.setValue(Collections.unmodifiableList((List) k4.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((InterfaceC1360b4) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
