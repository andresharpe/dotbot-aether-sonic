package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z extends B.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f35608a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35609b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35610c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, String str2, boolean z3) {
        if (str != null) {
            this.f35608a = str;
            if (str2 != null) {
                this.f35609b = str2;
                this.f35610c = z3;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.c
    public boolean b() {
        return this.f35610c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.c
    public String c() {
        return this.f35609b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.c
    public String d() {
        return this.f35608a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.c)) {
            return false;
        }
        B.c cVar = (B.c) obj;
        if (this.f35608a.equals(cVar.d()) && this.f35609b.equals(cVar.c()) && this.f35610c == cVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = (((this.f35608a.hashCode() ^ 1000003) * 1000003) ^ this.f35609b.hashCode()) * 1000003;
        if (this.f35610c) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode ^ i4;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f35608a + ", osCodeName=" + this.f35609b + ", isRooted=" + this.f35610c + "}";
    }
}
