package com.harman.jbl.partybox.ui.equalizer;

import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte f43621a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f43622b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43623c;

    /* renamed from: d, reason: collision with root package name */
    private final int f43624d;

    /* renamed from: e, reason: collision with root package name */
    private final int f43625e;

    public b(byte b4, @l3.d String eqName, int i4, int i5, int i6) {
        F.p(eqName, "eqName");
        this.f43621a = b4;
        this.f43622b = eqName;
        this.f43623c = i4;
        this.f43624d = i5;
        this.f43625e = i6;
    }

    public static /* synthetic */ b g(b bVar, byte b4, String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            b4 = bVar.f43621a;
        }
        if ((i7 & 2) != 0) {
            str = bVar.f43622b;
        }
        String str2 = str;
        if ((i7 & 4) != 0) {
            i4 = bVar.f43623c;
        }
        int i8 = i4;
        if ((i7 & 8) != 0) {
            i5 = bVar.f43624d;
        }
        int i9 = i5;
        if ((i7 & 16) != 0) {
            i6 = bVar.f43625e;
        }
        return bVar.f(b4, str2, i8, i9, i6);
    }

    public final byte a() {
        return this.f43621a;
    }

    @l3.d
    public final String b() {
        return this.f43622b;
    }

    public final int c() {
        return this.f43623c;
    }

    public final int d() {
        return this.f43624d;
    }

    public final int e() {
        return this.f43625e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f43621a == bVar.f43621a && F.g(this.f43622b, bVar.f43622b) && this.f43623c == bVar.f43623c && this.f43624d == bVar.f43624d && this.f43625e == bVar.f43625e;
    }

    @l3.d
    public final b f(byte b4, @l3.d String eqName, int i4, int i5, int i6) {
        F.p(eqName, "eqName");
        return new b(b4, eqName, i4, i5, i6);
    }

    public final byte h() {
        return this.f43621a;
    }

    public int hashCode() {
        return (((((((Byte.hashCode(this.f43621a) * 31) + this.f43622b.hashCode()) * 31) + Integer.hashCode(this.f43623c)) * 31) + Integer.hashCode(this.f43624d)) * 31) + Integer.hashCode(this.f43625e);
    }

    public final int i() {
        return this.f43625e;
    }

    @l3.d
    public final String j() {
        return this.f43622b;
    }

    public final int k() {
        return this.f43624d;
    }

    public final int l() {
        return this.f43623c;
    }

    @l3.d
    public String toString() {
        byte b4 = this.f43621a;
        return "EQModel(eqId=" + ((int) b4) + ", eqName=" + this.f43622b + ", presetOnResId=" + this.f43623c + ", presetOffResId=" + this.f43624d + ", eqIndex=" + this.f43625e + ")";
    }
}
