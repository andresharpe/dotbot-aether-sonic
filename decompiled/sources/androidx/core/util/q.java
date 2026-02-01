package androidx.core.util;

import androidx.annotation.N;

/* loaded from: classes.dex */
public class q<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f13025a;

    /* renamed from: b, reason: collision with root package name */
    public final S f13026b;

    public q(F f4, S s4) {
        this.f13025a = f4;
        this.f13026b = s4;
    }

    @N
    public static <A, B> q<A, B> a(A a4, B b4) {
        return new q<>(a4, b4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!p.a(qVar.f13025a, this.f13025a) || !p.a(qVar.f13026b, this.f13026b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        F f4 = this.f13025a;
        int i4 = 0;
        if (f4 == null) {
            hashCode = 0;
        } else {
            hashCode = f4.hashCode();
        }
        S s4 = this.f13026b;
        if (s4 != null) {
            i4 = s4.hashCode();
        }
        return hashCode ^ i4;
    }

    @N
    public String toString() {
        return "Pair{" + this.f13025a + " " + this.f13026b + "}";
    }
}
