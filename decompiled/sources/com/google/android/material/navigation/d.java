package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class d implements n {

    /* renamed from: E, reason: collision with root package name */
    private g f32809E;

    /* renamed from: F, reason: collision with root package name */
    private c f32810F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f32811G = false;

    /* renamed from: H, reason: collision with root package name */
    private int f32812H;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0291a();

        /* renamed from: E, reason: collision with root package name */
        int f32813E;

        /* renamed from: F, reason: collision with root package name */
        @P
        com.google.android.material.internal.n f32814F;

        /* renamed from: com.google.android.material.navigation.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0291a implements Parcelable.Creator<a> {
            C0291a() {
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(@N Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i4) {
                return new a[i4];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            parcel.writeInt(this.f32813E);
            parcel.writeParcelable(this.f32814F, 0);
        }

        a(@N Parcel parcel) {
            this.f32813E = parcel.readInt();
            this.f32814F = (com.google.android.material.internal.n) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i4) {
        this.f32812H = i4;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(@P g gVar, boolean z3) {
    }

    public void c(@N c cVar) {
        this.f32810F = cVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z3) {
        if (this.f32811G) {
            return;
        }
        if (z3) {
            this.f32810F.c();
        } else {
            this.f32810F.s();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(@P g gVar, @P j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(@P g gVar, @P j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f32812H;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(@P n.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(@N Context context, @N g gVar) {
        this.f32809E = gVar;
        this.f32810F.e(gVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(@N Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f32810F.r(aVar.f32813E);
            this.f32810F.p(com.google.android.material.badge.d.g(this.f32810F.getContext(), aVar.f32814F));
        }
    }

    public void k(boolean z3) {
        this.f32811G = z3;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(@P s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    @P
    public o m(@P ViewGroup viewGroup) {
        return this.f32810F;
    }

    @Override // androidx.appcompat.view.menu.n
    @N
    public Parcelable n() {
        a aVar = new a();
        aVar.f32813E = this.f32810F.getSelectedItemId();
        aVar.f32814F = com.google.android.material.badge.d.h(this.f32810F.getBadgeDrawables());
        return aVar;
    }
}
