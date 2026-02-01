package com.google.android.gms.internal.common;

import l1.InterfaceC2354a;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319g {
    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC2354a
    public static Object[] a(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException("at index " + i5);
            }
        }
        return objArr;
    }
}
