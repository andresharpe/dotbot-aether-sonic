package com.google.android.gms.location;

import com.google.android.gms.common.internal.C1285y;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class V0 implements Comparator<C1568h> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C1568h c1568h, C1568h c1568h2) {
        C1568h c1568h3 = c1568h;
        C1568h c1568h4 = c1568h2;
        C1285y.l(c1568h3);
        C1285y.l(c1568h4);
        int compareTo = Integer.valueOf(c1568h4.c0()).compareTo(Integer.valueOf(c1568h3.c0()));
        if (compareTo == 0) {
            return Integer.valueOf(c1568h3.e0()).compareTo(Integer.valueOf(c1568h4.e0()));
        }
        return compareTo;
    }
}
