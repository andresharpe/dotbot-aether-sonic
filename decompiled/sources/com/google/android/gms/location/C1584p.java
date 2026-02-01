package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1285y;
import java.util.ArrayList;
import java.util.List;

@c.a(creator = "GeofencingRequestCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1584p extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1584p> CREATOR = new C1557b0();

    /* renamed from: I, reason: collision with root package name */
    public static final int f30035I = 1;

    /* renamed from: J, reason: collision with root package name */
    public static final int f30036J = 2;

    /* renamed from: K, reason: collision with root package name */
    public static final int f30037K = 4;

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getParcelableGeofences", id = 1)
    private final List<com.google.android.gms.internal.location.G> f30038E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getInitialTrigger", id = 2)
    @b
    private final int f30039F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "", getter = "getTag", id = 3)
    private final String f30040G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getContextAttributionTag", id = 4)
    private final String f30041H;

    /* renamed from: com.google.android.gms.location.p$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.google.android.gms.internal.location.G> f30042a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @b
        private int f30043b = 5;

        /* renamed from: c, reason: collision with root package name */
        private String f30044c = "";

        @androidx.annotation.N
        public a a(@androidx.annotation.N InterfaceC1574k interfaceC1574k) {
            C1285y.m(interfaceC1574k, "geofence can't be null.");
            C1285y.b(interfaceC1574k instanceof com.google.android.gms.internal.location.G, "Geofence must be created using Geofence.Builder.");
            this.f30042a.add((com.google.android.gms.internal.location.G) interfaceC1574k);
            return this;
        }

        @androidx.annotation.N
        public a b(@androidx.annotation.N List<InterfaceC1574k> list) {
            if (list != null && !list.isEmpty()) {
                for (InterfaceC1574k interfaceC1574k : list) {
                    if (interfaceC1574k != null) {
                        a(interfaceC1574k);
                    }
                }
            }
            return this;
        }

        @androidx.annotation.N
        public C1584p c() {
            C1285y.b(!this.f30042a.isEmpty(), "No geofence has been added to this request.");
            return new C1584p(this.f30042a, this.f30043b, this.f30044c, null);
        }

        @androidx.annotation.N
        public a d(@b int i4) {
            this.f30043b = i4 & 7;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.location.p$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1584p(@c.e(id = 1) List<com.google.android.gms.internal.location.G> list, @c.e(id = 2) @b int i4, @c.e(id = 3) String str, @c.e(id = 4) @androidx.annotation.P String str2) {
        this.f30038E = list;
        this.f30039F = i4;
        this.f30040G = str;
        this.f30041H = str2;
    }

    @androidx.annotation.N
    public List<InterfaceC1574k> c0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f30038E);
        return arrayList;
    }

    @b
    public int e0() {
        return this.f30039F;
    }

    @androidx.annotation.N
    public final C1584p i0(@androidx.annotation.P String str) {
        return new C1584p(this.f30038E, this.f30039F, this.f30040G, str);
    }

    @androidx.annotation.N
    public String toString() {
        return "GeofencingRequest[geofences=" + this.f30038E + ", initialTrigger=" + this.f30039F + ", tag=" + this.f30040G + ", attributionTag=" + this.f30041H + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.d0(parcel, 1, this.f30038E, false);
        K0.b.F(parcel, 2, e0());
        K0.b.Y(parcel, 3, this.f30040G, false);
        K0.b.Y(parcel, 4, this.f30041H, false);
        K0.b.b(parcel, a4);
    }
}
