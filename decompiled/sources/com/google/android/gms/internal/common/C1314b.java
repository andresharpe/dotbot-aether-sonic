package com.google.android.gms.internal.common;

import java.util.Arrays;
import l1.InterfaceC2354a;

/* renamed from: com.google.android.gms.internal.common.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1314b extends C1315c {

    /* renamed from: a, reason: collision with root package name */
    Object[] f29143a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f29144b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f29145c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1314b(int i4) {
    }

    private final void b(int i4) {
        Object[] objArr = this.f29143a;
        int length = objArr.length;
        if (length < i4) {
            int i5 = length + (length >> 1) + 1;
            if (i5 < i4) {
                int highestOneBit = Integer.highestOneBit(i4 - 1);
                i5 = highestOneBit + highestOneBit;
            }
            if (i5 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            this.f29143a = Arrays.copyOf(objArr, i5);
            this.f29145c = false;
            return;
        }
        if (this.f29145c) {
            this.f29143a = (Object[]) objArr.clone();
            this.f29145c = false;
        }
    }

    @InterfaceC2354a
    public final C1314b a(Object obj) {
        obj.getClass();
        b(this.f29144b + 1);
        Object[] objArr = this.f29143a;
        int i4 = this.f29144b;
        this.f29144b = i4 + 1;
        objArr[i4] = obj;
        return this;
    }
}
