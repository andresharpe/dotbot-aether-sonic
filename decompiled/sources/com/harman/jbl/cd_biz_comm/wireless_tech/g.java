package com.harman.jbl.cd_biz_comm.wireless_tech;

import java.util.Arrays;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final byte[] f38184a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f38185b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final byte[] f38186c;

    public g(@l3.d byte[] data, byte b4, @l3.e byte[] bArr) {
        F.p(data, "data");
        this.f38184a = data;
        this.f38185b = b4;
        this.f38186c = bArr;
    }

    public static /* synthetic */ g e(g gVar, byte[] bArr, byte b4, byte[] bArr2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bArr = gVar.f38184a;
        }
        if ((i4 & 2) != 0) {
            b4 = gVar.f38185b;
        }
        if ((i4 & 4) != 0) {
            bArr2 = gVar.f38186c;
        }
        return gVar.d(bArr, b4, bArr2);
    }

    @l3.d
    public final byte[] a() {
        return this.f38184a;
    }

    public final byte b() {
        return this.f38185b;
    }

    @l3.e
    public final byte[] c() {
        return this.f38186c;
    }

    @l3.d
    public final g d(@l3.d byte[] data, byte b4, @l3.e byte[] bArr) {
        F.p(data, "data");
        return new g(data, b4, bArr);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return F.g(this.f38184a, gVar.f38184a) && this.f38185b == gVar.f38185b && F.g(this.f38186c, gVar.f38186c);
    }

    public final byte f() {
        return this.f38185b;
    }

    @l3.d
    public final byte[] g() {
        return this.f38184a;
    }

    @l3.e
    public final byte[] h() {
        return this.f38186c;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f38184a) * 31) + Byte.hashCode(this.f38185b)) * 31;
        byte[] bArr = this.f38186c;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @l3.d
    public String toString() {
        String str;
        String f4 = com.harman.jbl.cd_biz_comm.utils.i.f(this.f38184a);
        String c4 = com.harman.jbl.cd_biz_comm.utils.i.c(this.f38185b);
        byte[] bArr = this.f38186c;
        if (bArr != null) {
            str = com.harman.jbl.cd_biz_comm.utils.i.f(bArr);
        } else {
            str = null;
        }
        return "DevNotify(data = " + f4 + " , cmd = " + c4 + " , payload = " + str + "})";
    }
}
