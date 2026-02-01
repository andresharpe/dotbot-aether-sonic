package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class M extends K {

    /* renamed from: k, reason: collision with root package name */
    private static final WeakReference f27963k = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f27964j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(byte[] bArr) {
        super(bArr);
        this.f27964j = f27963k;
    }

    protected abstract byte[] N1();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.K
    public final byte[] O0() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f27964j.get();
                if (bArr == null) {
                    bArr = N1();
                    this.f27964j = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }
}
