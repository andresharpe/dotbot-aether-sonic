package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@c.a(creator = "ActivityTransitionCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1560d extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1560d> CREATOR = new Q0();

    /* renamed from: G, reason: collision with root package name */
    public static final int f29978G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final int f29979H = 1;

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getActivityType", id = 1)
    private final int f29980E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTransitionType", id = 2)
    private final int f29981F;

    /* renamed from: com.google.android.gms.location.d$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f29982a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f29983b = -1;

        @androidx.annotation.N
        public C1560d a() {
            boolean z3;
            boolean z4 = false;
            if (this.f29982a != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.s(z3, "Activity type not set.");
            if (this.f29983b != -1) {
                z4 = true;
            }
            C1285y.s(z4, "Activity transition type not set.");
            return new C1560d(this.f29982a, this.f29983b);
        }

        @androidx.annotation.N
        public a b(int i4) {
            C1560d.i0(i4);
            this.f29983b = i4;
            return this;
        }

        @androidx.annotation.N
        public a c(int i4) {
            this.f29982a = i4;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.location.d$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1560d(@c.e(id = 1) int i4, @c.e(id = 2) int i5) {
        this.f29980E = i4;
        this.f29981F = i5;
    }

    public static void i0(int i4) {
        boolean z3 = false;
        if (i4 >= 0 && i4 <= 1) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i4);
        sb.append(" is not valid.");
        C1285y.b(z3, sb.toString());
    }

    public int c0() {
        return this.f29980E;
    }

    public int e0() {
        return this.f29981F;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1560d)) {
            return false;
        }
        C1560d c1560d = (C1560d) obj;
        if (this.f29980E == c1560d.f29980E && this.f29981F == c1560d.f29981F) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f29980E), Integer.valueOf(this.f29981F));
    }

    @androidx.annotation.N
    public String toString() {
        int i4 = this.f29980E;
        int i5 = this.f29981F;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i4);
        sb.append(", mTransitionType=");
        sb.append(i5);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, c0());
        K0.b.F(parcel, 2, e0());
        K0.b.b(parcel, a4);
    }
}
