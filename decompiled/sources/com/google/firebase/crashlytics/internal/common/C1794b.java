package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.common.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1794b extends r {

    /* renamed from: a, reason: collision with root package name */
    private final CrashlyticsReport f35035a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35036b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1794b(CrashlyticsReport crashlyticsReport, String str) {
        if (crashlyticsReport != null) {
            this.f35035a = crashlyticsReport;
            if (str != null) {
                this.f35036b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // com.google.firebase.crashlytics.internal.common.r
    public CrashlyticsReport b() {
        return this.f35035a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.r
    public String c() {
        return this.f35036b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f35035a.equals(rVar.b()) && this.f35036b.equals(rVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f35035a.hashCode() ^ 1000003) * 1000003) ^ this.f35036b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f35035a + ", sessionId=" + this.f35036b + "}";
    }
}
