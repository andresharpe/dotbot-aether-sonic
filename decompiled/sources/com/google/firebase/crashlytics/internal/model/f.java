package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class f extends CrashlyticsReport.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f35435a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f35436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f35437a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f35438b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b.a
        public CrashlyticsReport.e.b a() {
            String str = "";
            if (this.f35437a == null) {
                str = " filename";
            }
            if (this.f35438b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new f(this.f35437a, this.f35438b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b.a
        public CrashlyticsReport.e.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.f35438b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b.a
        public CrashlyticsReport.e.b.a c(String str) {
            if (str != null) {
                this.f35437a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b
    @N
    public byte[] b() {
        return this.f35436b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b
    @N
    public String c() {
        return this.f35435a;
    }

    public boolean equals(Object obj) {
        byte[] b4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.e.b)) {
            return false;
        }
        CrashlyticsReport.e.b bVar = (CrashlyticsReport.e.b) obj;
        if (this.f35435a.equals(bVar.c())) {
            byte[] bArr = this.f35436b;
            if (bVar instanceof f) {
                b4 = ((f) bVar).f35436b;
            } else {
                b4 = bVar.b();
            }
            if (Arrays.equals(bArr, b4)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f35435a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f35436b);
    }

    public String toString() {
        return "File{filename=" + this.f35435a + ", contents=" + Arrays.toString(this.f35436b) + "}";
    }

    private f(String str, byte[] bArr) {
        this.f35435a = str;
        this.f35436b = bArr;
    }
}
