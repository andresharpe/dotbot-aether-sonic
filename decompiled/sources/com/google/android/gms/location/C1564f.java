package com.google.android.gms.location;

import K0.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1248f;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@c.a(creator = "ActivityTransitionRequestCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1564f extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1564f> CREATOR = new T0();

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public static final Comparator<C1560d> f29990I = new S0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getActivityTransitions", id = 1)
    private final List<C1560d> f29991E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getTag", id = 2)
    private final String f29992F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getClients", id = 3)
    private final List<C1248f> f29993G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", getter = "getContextAttributionTag", id = 4)
    private String f29994H;

    public C1564f(@androidx.annotation.N List<C1560d> list) {
        this(list, null, null, null);
    }

    public void c0(@androidx.annotation.N Intent intent) {
        C1285y.l(intent);
        K0.d.n(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @androidx.annotation.N
    public final C1564f e0(@androidx.annotation.P String str) {
        this.f29994H = str;
        return this;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1564f c1564f = (C1564f) obj;
            if (C1281w.b(this.f29991E, c1564f.f29991E) && C1281w.b(this.f29992F, c1564f.f29992F) && C1281w.b(this.f29994H, c1564f.f29994H) && C1281w.b(this.f29993G, c1564f.f29993G)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int hashCode = this.f29991E.hashCode() * 31;
        String str = this.f29992F;
        int i6 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (hashCode + i4) * 31;
        List<C1248f> list = this.f29993G;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = (i7 + i5) * 31;
        String str2 = this.f29994H;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i8 + i6;
    }

    @androidx.annotation.N
    public String toString() {
        String valueOf = String.valueOf(this.f29991E);
        String str = this.f29992F;
        String valueOf2 = String.valueOf(this.f29993G);
        String str2 = this.f29994H;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + valueOf2.length() + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.d0(parcel, 1, this.f29991E, false);
        K0.b.Y(parcel, 2, this.f29992F, false);
        K0.b.d0(parcel, 3, this.f29993G, false);
        K0.b.Y(parcel, 4, this.f29994H, false);
        K0.b.b(parcel, a4);
    }

    @c.b
    public C1564f(@c.e(id = 1) @androidx.annotation.N List<C1560d> list, @c.e(id = 2) @androidx.annotation.P String str, @c.e(id = 3) @androidx.annotation.P List<C1248f> list2, @c.e(id = 4) @androidx.annotation.P String str2) {
        List<C1248f> unmodifiableList;
        C1285y.m(list, "transitions can't be null");
        C1285y.b(list.size() > 0, "transitions can't be empty.");
        C1285y.l(list);
        TreeSet treeSet = new TreeSet(f29990I);
        for (C1560d c1560d : list) {
            C1285y.b(treeSet.add(c1560d), String.format("Found duplicated transition: %s.", c1560d));
        }
        this.f29991E = Collections.unmodifiableList(list);
        this.f29992F = str;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.f29993G = unmodifiableList;
        this.f29994H = str2;
    }
}
