package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.Z0;
import com.google.android.gms.common.internal.a1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class K extends Z0 {

    /* renamed from: i, reason: collision with root package name */
    private final int f27961i;

    /* JADX INFO: Access modifiers changed from: protected */
    public K(byte[] bArr) {
        boolean z3;
        if (bArr.length == 25) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.a(z3);
        this.f27961i = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] G(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] O0();

    public final boolean equals(@androidx.annotation.P Object obj) {
        com.google.android.gms.dynamic.d zzd;
        if (obj != null && (obj instanceof a1)) {
            try {
                a1 a1Var = (a1) obj;
                if (a1Var.zzc() != this.f27961i || (zzd = a1Var.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(O0(), (byte[]) com.google.android.gms.dynamic.f.G(zzd));
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27961i;
    }

    @Override // com.google.android.gms.common.internal.a1
    public final int zzc() {
        return this.f27961i;
    }

    @Override // com.google.android.gms.common.internal.a1
    public final com.google.android.gms.dynamic.d zzd() {
        return com.google.android.gms.dynamic.f.O0(O0());
    }
}
