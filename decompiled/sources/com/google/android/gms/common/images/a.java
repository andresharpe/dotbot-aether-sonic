package com.google.android.gms.common.images;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f28572a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28573b;

    public a(int i4, int i5) {
        this.f28572a = i4;
        this.f28573b = i5;
    }

    @N
    public static a c(@N String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new a(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw d(str);
                }
            }
            throw d(str);
        }
        throw new IllegalArgumentException("string must not be null");
    }

    private static NumberFormatException d(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public int a() {
        return this.f28573b;
    }

    public int b() {
        return this.f28572a;
    }

    public boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f28572a == aVar.f28572a && this.f28573b == aVar.f28573b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i4 = this.f28573b;
        int i5 = this.f28572a;
        return i4 ^ ((i5 >>> 16) | (i5 << 16));
    }

    @N
    public String toString() {
        int i4 = this.f28572a;
        int i5 = this.f28573b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i4);
        sb.append("x");
        sb.append(i5);
        return sb.toString();
    }
}
