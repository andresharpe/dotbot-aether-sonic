package com.airbnb.lottie.parser.moshi;

import kotlin.text.F;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    static final int f21905a = 1;

    /* renamed from: b, reason: collision with root package name */
    static final int f21906b = 2;

    /* renamed from: c, reason: collision with root package name */
    static final int f21907c = 3;

    /* renamed from: d, reason: collision with root package name */
    static final int f21908d = 4;

    /* renamed from: e, reason: collision with root package name */
    static final int f21909e = 5;

    /* renamed from: f, reason: collision with root package name */
    static final int f21910f = 6;

    /* renamed from: g, reason: collision with root package name */
    static final int f21911g = 7;

    /* renamed from: h, reason: collision with root package name */
    static final int f21912h = 8;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i4, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append(F.f52747c);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            if (i6 != 1 && i6 != 2) {
                if (i6 == 3 || i6 == 4 || i6 == 5) {
                    sb.append('.');
                    String str = strArr[i5];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i5]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
}
