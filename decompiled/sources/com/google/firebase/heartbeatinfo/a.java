package com.google.firebase.heartbeatinfo;

import java.util.List;

/* loaded from: classes2.dex */
final class a extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f35958a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f35959b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List<String> list) {
        if (str != null) {
            this.f35958a = str;
            if (list != null) {
                this.f35959b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public List<String> b() {
        return this.f35959b;
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public String c() {
        return this.f35958a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f35958a.equals(sVar.c()) && this.f35959b.equals(sVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f35958a.hashCode() ^ 1000003) * 1000003) ^ this.f35959b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f35958a + ", usedDates=" + this.f35959b + "}";
    }
}
