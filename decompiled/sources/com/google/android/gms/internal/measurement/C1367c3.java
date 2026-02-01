package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1367c3 extends AbstractC1423j3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1367c3(C1391f3 c1391f3, String str, Boolean bool, boolean z3) {
        super(c1391f3, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC1423j3
    @Nullable
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (G2.f29331c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (G2.f29332d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.c() + ": " + ((String) obj));
        return null;
    }
}
