package com.airbnb.lottie.model;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.util.q;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class h<T> {

    /* renamed from: a, reason: collision with root package name */
    @P
    T f21705a;

    /* renamed from: b, reason: collision with root package name */
    @P
    T f21706b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public void b(T t3, T t4) {
        this.f21705a = t3;
        this.f21706b = t4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!a(qVar.f13025a, this.f21705a) || !a(qVar.f13026b, this.f21706b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t3 = this.f21705a;
        int i4 = 0;
        if (t3 == null) {
            hashCode = 0;
        } else {
            hashCode = t3.hashCode();
        }
        T t4 = this.f21706b;
        if (t4 != null) {
            i4 = t4.hashCode();
        }
        return hashCode ^ i4;
    }

    public String toString() {
        return "Pair{" + this.f21705a + " " + this.f21706b + "}";
    }
}
