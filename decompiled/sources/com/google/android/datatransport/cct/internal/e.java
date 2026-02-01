package com.google.android.datatransport.cct.internal;

import androidx.annotation.P;
import com.google.android.datatransport.cct.internal.ClientInfo;

/* loaded from: classes.dex */
final class e extends ClientInfo {

    /* renamed from: a, reason: collision with root package name */
    private final ClientInfo.ClientType f27286a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.cct.internal.a f27287b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends ClientInfo.a {

        /* renamed from: a, reason: collision with root package name */
        private ClientInfo.ClientType f27288a;

        /* renamed from: b, reason: collision with root package name */
        private com.google.android.datatransport.cct.internal.a f27289b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public ClientInfo a() {
            return new e(this.f27288a, this.f27289b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public ClientInfo.a b(@P com.google.android.datatransport.cct.internal.a aVar) {
            this.f27289b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public ClientInfo.a c(@P ClientInfo.ClientType clientType) {
            this.f27288a = clientType;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @P
    public com.google.android.datatransport.cct.internal.a b() {
        return this.f27287b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @P
    public ClientInfo.ClientType c() {
        return this.f27286a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f27286a;
        if (clientType != null ? clientType.equals(clientInfo.c()) : clientInfo.c() == null) {
            com.google.android.datatransport.cct.internal.a aVar = this.f27287b;
            if (aVar == null) {
                if (clientInfo.b() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        ClientInfo.ClientType clientType = this.f27286a;
        int i4 = 0;
        if (clientType == null) {
            hashCode = 0;
        } else {
            hashCode = clientType.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.a aVar = this.f27287b;
        if (aVar != null) {
            i4 = aVar.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f27286a + ", androidClientInfo=" + this.f27287b + "}";
    }

    private e(@P ClientInfo.ClientType clientType, @P com.google.android.datatransport.cct.internal.a aVar) {
        this.f27286a = clientType;
        this.f27287b = aVar;
    }
}
