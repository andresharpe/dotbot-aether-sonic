package com.google.android.datatransport;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f27171a;

    private c(@N String str) {
        if (str != null) {
            this.f27171a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static c b(@N String str) {
        return new c(str);
    }

    public String a() {
        return this.f27171a;
    }

    public boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f27171a.equals(((c) obj).f27171a);
    }

    public int hashCode() {
        return this.f27171a.hashCode() ^ 1000003;
    }

    @N
    public String toString() {
        return "Encoding{name=\"" + this.f27171a + "\"}";
    }
}
