package com.google.android.datatransport.cct.internal;

import androidx.annotation.N;
import java.util.List;
import w1.InterfaceC2431a;

/* loaded from: classes.dex */
final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final List<l> f27285a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List<l> list) {
        if (list != null) {
            this.f27285a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // com.google.android.datatransport.cct.internal.j
    @InterfaceC2431a.InterfaceC0549a(name = "logRequest")
    @N
    public List<l> c() {
        return this.f27285a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f27285a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f27285a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f27285a + "}";
    }
}
