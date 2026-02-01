package com.google.android.gms.common.util;

import androidx.annotation.N;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1285y;
import java.util.Set;

@I0.a
/* loaded from: classes.dex */
public final class z {
    private z() {
    }

    @I0.a
    @N
    public static String[] a(@N Set<Scope> set) {
        C1285y.m(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        C1285y.m(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i4 = 0; i4 < scopeArr.length; i4++) {
            strArr[i4] = scopeArr[i4].c0();
        }
        return strArr;
    }
}
