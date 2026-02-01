package com.google.firebase.encoders.proto;

import androidx.annotation.N;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class b extends OutputStream {

    /* renamed from: E, reason: collision with root package name */
    private long f35936E = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f35936E;
    }

    @Override // java.io.OutputStream
    public void write(int i4) {
        this.f35936E++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f35936E += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@N byte[] bArr, int i4, int i5) {
        int i6;
        if (i4 >= 0 && i4 <= bArr.length && i5 >= 0 && (i6 = i4 + i5) <= bArr.length && i6 >= 0) {
            this.f35936E += i5;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
