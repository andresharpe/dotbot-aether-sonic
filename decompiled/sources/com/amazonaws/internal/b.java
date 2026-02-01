package com.amazonaws.internal;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23732a = new b();

    @Override // com.amazonaws.internal.a
    public int a(int i4) {
        if (i4 <= 0) {
            return 0;
        }
        int pow = ((int) Math.pow(2.0d, i4 - 1)) * 50;
        if (pow < 0) {
            return Integer.MAX_VALUE;
        }
        return pow;
    }
}
