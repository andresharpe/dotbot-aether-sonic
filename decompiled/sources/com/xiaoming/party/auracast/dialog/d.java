package com.xiaoming.party.auracast.dialog;

import androidx.annotation.InterfaceC0578v;
import androidx.annotation.c0;
import l3.e;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f49062a;

    /* renamed from: b, reason: collision with root package name */
    private final int f49063b;

    /* renamed from: c, reason: collision with root package name */
    private final int f49064c;

    public d(@InterfaceC0578v int i4, @InterfaceC0578v int i5, @c0 int i6) {
        this.f49062a = i4;
        this.f49063b = i5;
        this.f49064c = i6;
    }

    public static /* synthetic */ d e(d dVar, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = dVar.f49062a;
        }
        if ((i7 & 2) != 0) {
            i5 = dVar.f49063b;
        }
        if ((i7 & 4) != 0) {
            i6 = dVar.f49064c;
        }
        return dVar.d(i4, i5, i6);
    }

    public final int a() {
        return this.f49062a;
    }

    public final int b() {
        return this.f49063b;
    }

    public final int c() {
        return this.f49064c;
    }

    @l3.d
    public final d d(@InterfaceC0578v int i4, @InterfaceC0578v int i5, @c0 int i6) {
        return new d(i4, i5, i6);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f49062a == dVar.f49062a && this.f49063b == dVar.f49063b && this.f49064c == dVar.f49064c;
    }

    public final int f() {
        return this.f49062a;
    }

    public final int g() {
        return this.f49063b;
    }

    public final int h() {
        return this.f49064c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f49062a) * 31) + Integer.hashCode(this.f49063b)) * 31) + Integer.hashCode(this.f49064c);
    }

    @l3.d
    public String toString() {
        return "OnWelcomeSlide(animation=" + this.f49062a + ", icon=" + this.f49063b + ", tips=" + this.f49064c + ")";
    }
}
