package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1359b3 extends AbstractC1423j3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1359b3(C1391f3 c1391f3, String str, Long l4, boolean z3) {
        super(c1391f3, str, l4, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1423j3
    @Nullable
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
