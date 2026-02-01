package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes.dex */
final class L extends K {

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f27962j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f27962j = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.K
    public final byte[] O0() {
        return this.f27962j;
    }
}
