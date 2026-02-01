package com.harman.jbl.partybox.firmware;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.text.A;
import kotlin.text.y;

/* loaded from: classes2.dex */
public final class f {
    public static final int a(@l3.e String str, @l3.e String str2) {
        String str3;
        List R4;
        String str4;
        List R42;
        List<Pair> i6;
        Integer X02;
        int i4;
        Integer X03;
        int i5;
        if (F.g(str, str2)) {
            return 0;
        }
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        R4 = A.R4(str3, new String[]{"."}, false, 0, 6, null);
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        R42 = A.R4(str4, new String[]{"."}, false, 0, 6, null);
        i6 = D.i6(R4, R42);
        for (Pair pair : i6) {
            String str5 = (String) pair.a();
            String str6 = (String) pair.b();
            X02 = y.X0(str5);
            if (X02 != null) {
                i4 = X02.intValue();
            } else {
                i4 = 0;
            }
            X03 = y.X0(str6);
            if (X03 != null) {
                i5 = X03.intValue();
            } else {
                i5 = 0;
            }
            if (i4 > i5) {
                return 1;
            }
            if (i4 < i5) {
                return -1;
            }
        }
        if (R4.size() > R42.size()) {
            return 1;
        }
        if (R4.size() >= R42.size()) {
            return 0;
        }
        return -1;
    }
}
