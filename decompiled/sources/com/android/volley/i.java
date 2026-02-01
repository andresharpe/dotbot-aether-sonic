package com.android.volley;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f24486a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24487b;

    public i(String str, String str2) {
        this.f24486a = str;
        this.f24487b = str2;
    }

    public final String a() {
        return this.f24486a;
    }

    public final String b() {
        return this.f24487b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (TextUtils.equals(this.f24486a, iVar.f24486a) && TextUtils.equals(this.f24487b, iVar.f24487b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f24486a.hashCode() * 31) + this.f24487b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f24486a + ",value=" + this.f24487b + "]";
    }
}
