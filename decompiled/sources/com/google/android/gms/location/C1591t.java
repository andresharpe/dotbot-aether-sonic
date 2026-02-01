package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@c.a(creator = "LocationSettingsRequestCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1591t extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1591t> CREATOR = new C1592t0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getLocationRequests", id = 1)
    private final List<LocationRequest> f30058E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = L1.a.t3, getter = "alwaysShow", id = 2)
    private final boolean f30059F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "needBle", id = 3)
    private final boolean f30060G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getConfiguration", id = 5)
    private C1588r0 f30061H;

    /* renamed from: com.google.android.gms.location.t$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<LocationRequest> f30062a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private boolean f30063b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30064c = false;

        @androidx.annotation.N
        public a a(@androidx.annotation.N Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.f30062a.add(locationRequest);
                }
            }
            return this;
        }

        @androidx.annotation.N
        public a b(@androidx.annotation.N LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f30062a.add(locationRequest);
            }
            return this;
        }

        @androidx.annotation.N
        public C1591t c() {
            return new C1591t(this.f30062a, this.f30063b, this.f30064c, null);
        }

        @androidx.annotation.N
        public a d(boolean z3) {
            this.f30063b = z3;
            return this;
        }

        @androidx.annotation.N
        public a e(boolean z3) {
            this.f30064c = z3;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1591t(@c.e(id = 1) List<LocationRequest> list, @c.e(id = 2) boolean z3, @c.e(id = 3) boolean z4, @c.e(id = 5) @androidx.annotation.P C1588r0 c1588r0) {
        this.f30058E = list;
        this.f30059F = z3;
        this.f30060G = z4;
        this.f30061H = c1588r0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.d0(parcel, 1, Collections.unmodifiableList(this.f30058E), false);
        K0.b.g(parcel, 2, this.f30059F);
        K0.b.g(parcel, 3, this.f30060G);
        K0.b.S(parcel, 5, this.f30061H, i4, false);
        K0.b.b(parcel, a4);
    }
}
