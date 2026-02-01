package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y extends B.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f35599a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35600b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35601c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35602d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35603e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35604f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35605g;

    /* renamed from: h, reason: collision with root package name */
    private final String f35606h;

    /* renamed from: i, reason: collision with root package name */
    private final String f35607i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(int i4, String str, int i5, long j4, long j5, boolean z3, int i6, String str2, String str3) {
        this.f35599a = i4;
        if (str != null) {
            this.f35600b = str;
            this.f35601c = i5;
            this.f35602d = j4;
            this.f35603e = j5;
            this.f35604f = z3;
            this.f35605g = i6;
            if (str2 != null) {
                this.f35606h = str2;
                if (str3 != null) {
                    this.f35607i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public int a() {
        return this.f35599a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public int b() {
        return this.f35601c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public long d() {
        return this.f35603e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public boolean e() {
        return this.f35604f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.b)) {
            return false;
        }
        B.b bVar = (B.b) obj;
        if (this.f35599a == bVar.a() && this.f35600b.equals(bVar.g()) && this.f35601c == bVar.b() && this.f35602d == bVar.j() && this.f35603e == bVar.d() && this.f35604f == bVar.e() && this.f35605g == bVar.i() && this.f35606h.equals(bVar.f()) && this.f35607i.equals(bVar.h())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public String f() {
        return this.f35606h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public String g() {
        return this.f35600b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public String h() {
        return this.f35607i;
    }

    public int hashCode() {
        int i4;
        int hashCode = (((((this.f35599a ^ 1000003) * 1000003) ^ this.f35600b.hashCode()) * 1000003) ^ this.f35601c) * 1000003;
        long j4 = this.f35602d;
        int i5 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f35603e;
        int i6 = (i5 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        if (this.f35604f) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((((((i6 ^ i4) * 1000003) ^ this.f35605g) * 1000003) ^ this.f35606h.hashCode()) * 1000003) ^ this.f35607i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public int i() {
        return this.f35605g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B.b
    public long j() {
        return this.f35602d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f35599a + ", model=" + this.f35600b + ", availableProcessors=" + this.f35601c + ", totalRam=" + this.f35602d + ", diskSpace=" + this.f35603e + ", isEmulator=" + this.f35604f + ", state=" + this.f35605g + ", manufacturer=" + this.f35606h + ", modelClass=" + this.f35607i + "}";
    }
}
