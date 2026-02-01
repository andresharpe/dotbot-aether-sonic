package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1601y {

    /* renamed from: a, reason: collision with root package name */
    public static final int f30078a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f30079b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f30080c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f30081d = 1001;

    /* renamed from: e, reason: collision with root package name */
    public static final int f30082e = 1002;

    private C1601y() {
    }

    public static int a(int i4) {
        if ((i4 < 0 || i4 > 1) && (i4 < 1000 || i4 >= 1006)) {
            return 1;
        }
        return i4;
    }

    @androidx.annotation.N
    public static Status b(int i4) {
        if (i4 == 1) {
            i4 = 13;
        }
        return new Status(i4);
    }
}
