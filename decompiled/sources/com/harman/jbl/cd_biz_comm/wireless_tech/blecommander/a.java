package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final C0346a f38062c = new C0346a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte f38063a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38064b;

    /* renamed from: com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0346a {
        public /* synthetic */ C0346a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final a a(@l3.d byte[] bytes) {
            F.p(bytes, "bytes");
            boolean z3 = false;
            byte b4 = bytes[0];
            if (bytes[1] == 0) {
                z3 = true;
            }
            return new a(b4, z3);
        }

        private C0346a() {
        }
    }

    public a(byte b4, boolean z3) {
        this.f38063a = b4;
        this.f38064b = z3;
    }

    public static /* synthetic */ a d(a aVar, byte b4, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            b4 = aVar.f38063a;
        }
        if ((i4 & 2) != 0) {
            z3 = aVar.f38064b;
        }
        return aVar.c(b4, z3);
    }

    public final byte a() {
        return this.f38063a;
    }

    public final boolean b() {
        return this.f38064b;
    }

    @l3.d
    public final a c(byte b4, boolean z3) {
        return new a(b4, z3);
    }

    public final byte e() {
        return this.f38063a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f38063a == aVar.f38063a && this.f38064b == aVar.f38064b;
    }

    public final boolean f() {
        return this.f38064b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Byte.hashCode(this.f38063a) * 31;
        boolean z3 = this.f38064b;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    @l3.d
    public String toString() {
        return "AckResp(reqCmd=" + com.harman.jbl.cd_biz_comm.utils.i.c(this.f38063a) + " , success=" + this.f38064b + ")";
    }
}
