package com.google.android.gms.location;

import K0.c;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1285y;
import java.util.Collections;
import java.util.List;

@c.a(creator = "ActivityTransitionResultCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1566g extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1566g> CREATOR = new U0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTransitionEvents", id = 1)
    private final List<C1562e> f29995E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getExtras", id = 2)
    private Bundle f29996F;

    public C1566g(@c.e(id = 1) @androidx.annotation.N List<C1562e> list) {
        this.f29996F = null;
        C1285y.m(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i4 = 1; i4 < list.size(); i4++) {
                C1285y.a(list.get(i4).e0() >= list.get(i4 + (-1)).e0());
            }
        }
        this.f29995E = Collections.unmodifiableList(list);
    }

    @androidx.annotation.P
    public static C1566g c0(@androidx.annotation.N Intent intent) {
        if (!i0(intent)) {
            return null;
        }
        return (C1566g) K0.d.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
    }

    public static boolean i0(@androidx.annotation.P Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    @androidx.annotation.N
    public List<C1562e> e0() {
        return this.f29995E;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f29995E.equals(((C1566g) obj).f29995E);
        }
        return false;
    }

    public int hashCode() {
        return this.f29995E.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.d0(parcel, 1, e0(), false);
        K0.b.k(parcel, 2, this.f29996F, false);
        K0.b.b(parcel, a4);
    }

    @com.google.android.gms.common.internal.D
    @c.b
    public C1566g(@c.e(id = 1) @androidx.annotation.N List<C1562e> list, @c.e(id = 2) @androidx.annotation.P Bundle bundle) {
        this(list);
        this.f29996F = bundle;
    }
}
