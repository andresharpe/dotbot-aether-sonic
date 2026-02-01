package com.google.android.datatransport.runtime;

import androidx.annotation.N;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.c f27479a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27480b;

    public i(@N com.google.android.datatransport.c cVar, @N byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f27479a = cVar;
                this.f27480b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.f27480b;
    }

    public com.google.android.datatransport.c b() {
        return this.f27479a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f27479a.equals(iVar.f27479a)) {
            return false;
        }
        return Arrays.equals(this.f27480b, iVar.f27480b);
    }

    public int hashCode() {
        return ((this.f27479a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27480b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f27479a + ", bytes=[...]}";
    }
}
