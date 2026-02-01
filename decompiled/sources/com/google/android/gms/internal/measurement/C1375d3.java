package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1375d3 extends AbstractC1423j3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1375d3(C1391f3 c1391f3, String str, Double d4, boolean z3) {
        super(c1391f3, "measurement.test.double_flag", d4, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1423j3
    @Nullable
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
