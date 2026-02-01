package com.google.firebase.platforminfo;

import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f37347a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37348b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        if (str != null) {
            this.f37347a = str;
            if (str2 != null) {
                this.f37348b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // com.google.firebase.platforminfo.f
    @Nonnull
    public String b() {
        return this.f37347a;
    }

    @Override // com.google.firebase.platforminfo.f
    @Nonnull
    public String c() {
        return this.f37348b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f37347a.equals(fVar.b()) && this.f37348b.equals(fVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f37347a.hashCode() ^ 1000003) * 1000003) ^ this.f37348b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f37347a + ", version=" + this.f37348b + "}";
    }
}
