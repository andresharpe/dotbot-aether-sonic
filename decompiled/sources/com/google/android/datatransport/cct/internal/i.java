package com.google.android.datatransport.cct.internal;

import androidx.annotation.P;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* loaded from: classes.dex */
final class i extends NetworkConnectionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkConnectionInfo.NetworkType f27319a;

    /* renamed from: b, reason: collision with root package name */
    private final NetworkConnectionInfo.MobileSubtype f27320b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends NetworkConnectionInfo.a {

        /* renamed from: a, reason: collision with root package name */
        private NetworkConnectionInfo.NetworkType f27321a;

        /* renamed from: b, reason: collision with root package name */
        private NetworkConnectionInfo.MobileSubtype f27322b;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.a
        public NetworkConnectionInfo a() {
            return new i(this.f27321a, this.f27322b);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.a
        public NetworkConnectionInfo.a b(@P NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f27322b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.a
        public NetworkConnectionInfo.a c(@P NetworkConnectionInfo.NetworkType networkType) {
            this.f27321a = networkType;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @P
    public NetworkConnectionInfo.MobileSubtype b() {
        return this.f27320b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @P
    public NetworkConnectionInfo.NetworkType c() {
        return this.f27319a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f27319a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.c()) : networkConnectionInfo.c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f27320b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        NetworkConnectionInfo.NetworkType networkType = this.f27319a;
        int i4 = 0;
        if (networkType == null) {
            hashCode = 0;
        } else {
            hashCode = networkType.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f27320b;
        if (mobileSubtype != null) {
            i4 = mobileSubtype.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f27319a + ", mobileSubtype=" + this.f27320b + "}";
    }

    private i(@P NetworkConnectionInfo.NetworkType networkType, @P NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f27319a = networkType;
        this.f27320b = mobileSubtype;
    }
}
