package com.google.android.gms.location;

import com.google.android.gms.common.internal.C1285y;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class S0 implements Comparator<C1560d> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C1560d c1560d, C1560d c1560d2) {
        C1560d c1560d3 = c1560d;
        C1560d c1560d4 = c1560d2;
        C1285y.l(c1560d3);
        C1285y.l(c1560d4);
        int c02 = c1560d3.c0();
        int c03 = c1560d4.c0();
        if (c02 != c03) {
            if (c02 < c03) {
                return -1;
            }
            return 1;
        }
        int e02 = c1560d3.e0();
        int e03 = c1560d4.e0();
        if (e02 == e03) {
            return 0;
        }
        if (e02 < e03) {
            return -1;
        }
        return 1;
    }
}
