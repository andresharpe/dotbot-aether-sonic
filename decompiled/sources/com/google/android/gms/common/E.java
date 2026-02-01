package com.google.android.gms.common;

/* loaded from: classes.dex */
final class E {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i4) {
        int[] iArr = {1, 2, 3};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr[i5];
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (i7 == i4) {
                    return i6;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
