package com.google.android.datatransport.cct.internal;

import androidx.annotation.P;
import com.google.android.datatransport.cct.internal.k;
import java.util.Arrays;

/* loaded from: classes.dex */
final class f extends k {

    /* renamed from: a, reason: collision with root package name */
    private final long f27290a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f27291b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27292c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f27293d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27294e;

    /* renamed from: f, reason: collision with root package name */
    private final long f27295f;

    /* renamed from: g, reason: collision with root package name */
    private final NetworkConnectionInfo f27296g;

    /* loaded from: classes.dex */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f27297a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f27298b;

        /* renamed from: c, reason: collision with root package name */
        private Long f27299c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f27300d;

        /* renamed from: e, reason: collision with root package name */
        private String f27301e;

        /* renamed from: f, reason: collision with root package name */
        private Long f27302f;

        /* renamed from: g, reason: collision with root package name */
        private NetworkConnectionInfo f27303g;

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k a() {
            String str = "";
            if (this.f27297a == null) {
                str = " eventTimeMs";
            }
            if (this.f27299c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f27302f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f27297a.longValue(), this.f27298b, this.f27299c.longValue(), this.f27300d, this.f27301e, this.f27302f.longValue(), this.f27303g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a b(@P Integer num) {
            this.f27298b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a c(long j4) {
            this.f27297a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a d(long j4) {
            this.f27299c = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a e(@P NetworkConnectionInfo networkConnectionInfo) {
            this.f27303g = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        k.a f(@P byte[] bArr) {
            this.f27300d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        k.a g(@P String str) {
            this.f27301e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a h(long j4) {
            this.f27302f = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public Integer b() {
        return this.f27291b;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public long c() {
        return this.f27290a;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public long d() {
        return this.f27292c;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public NetworkConnectionInfo e() {
        return this.f27296g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] f4;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f27290a == kVar.c() && ((num = this.f27291b) != null ? num.equals(kVar.b()) : kVar.b() == null) && this.f27292c == kVar.d()) {
            byte[] bArr = this.f27293d;
            if (kVar instanceof f) {
                f4 = ((f) kVar).f27293d;
            } else {
                f4 = kVar.f();
            }
            if (Arrays.equals(bArr, f4) && ((str = this.f27294e) != null ? str.equals(kVar.g()) : kVar.g() == null) && this.f27295f == kVar.h()) {
                NetworkConnectionInfo networkConnectionInfo = this.f27296g;
                if (networkConnectionInfo == null) {
                    if (kVar.e() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(kVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public byte[] f() {
        return this.f27293d;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public String g() {
        return this.f27294e;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public long h() {
        return this.f27295f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j4 = this.f27290a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f27291b;
        int i5 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j5 = this.f27292c;
        int hashCode3 = (((((i4 ^ hashCode) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f27293d)) * 1000003;
        String str = this.f27294e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j6 = this.f27295f;
        int i6 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f27296g;
        if (networkConnectionInfo != null) {
            i5 = networkConnectionInfo.hashCode();
        }
        return i6 ^ i5;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f27290a + ", eventCode=" + this.f27291b + ", eventUptimeMs=" + this.f27292c + ", sourceExtension=" + Arrays.toString(this.f27293d) + ", sourceExtensionJsonProto3=" + this.f27294e + ", timezoneOffsetSeconds=" + this.f27295f + ", networkConnectionInfo=" + this.f27296g + "}";
    }

    private f(long j4, @P Integer num, long j5, @P byte[] bArr, @P String str, long j6, @P NetworkConnectionInfo networkConnectionInfo) {
        this.f27290a = j4;
        this.f27291b = num;
        this.f27292c = j5;
        this.f27293d = bArr;
        this.f27294e = str;
        this.f27295f = j6;
        this.f27296g = networkConnectionInfo;
    }
}
