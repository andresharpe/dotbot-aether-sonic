package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x extends B.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f35593a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35594b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35595c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35596d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35597e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35598f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(String str, String str2, String str3, String str4, int i4, @P String str5) {
        if (str != null) {
            this.f35593a = str;
            if (str2 != null) {
                this.f35594b = str2;
                if (str3 != null) {
                    this.f35595c = str3;
                    if (str4 != null) {
                        this.f35596d = str4;
                        this.f35597e = i4;
                        this.f35598f = str5;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.a
    public String a() {
        return this.f35593a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.a
    public int c() {
        return this.f35597e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.a
    public String d() {
        return this.f35596d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.a
    @P
    public String e() {
        return this.f35598f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a)) {
            return false;
        }
        B.a aVar = (B.a) obj;
        if (this.f35593a.equals(aVar.a()) && this.f35594b.equals(aVar.f()) && this.f35595c.equals(aVar.g()) && this.f35596d.equals(aVar.d()) && this.f35597e == aVar.c()) {
            String str = this.f35598f;
            if (str == null) {
                if (aVar.e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.a
    public String f() {
        return this.f35594b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.a
    public String g() {
        return this.f35595c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.f35593a.hashCode() ^ 1000003) * 1000003) ^ this.f35594b.hashCode()) * 1000003) ^ this.f35595c.hashCode()) * 1000003) ^ this.f35596d.hashCode()) * 1000003) ^ this.f35597e) * 1000003;
        String str = this.f35598f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f35593a + ", versionCode=" + this.f35594b + ", versionName=" + this.f35595c + ", installUuid=" + this.f35596d + ", deliveryMechanism=" + this.f35597e + ", unityVersion=" + this.f35598f + "}";
    }
}
