package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1131a extends AbstractC1135e {

    /* renamed from: g, reason: collision with root package name */
    private final long f27652g;

    /* renamed from: h, reason: collision with root package name */
    private final int f27653h;

    /* renamed from: i, reason: collision with root package name */
    private final int f27654i;

    /* renamed from: j, reason: collision with root package name */
    private final long f27655j;

    /* renamed from: k, reason: collision with root package name */
    private final int f27656k;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC1135e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f27657a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f27658b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f27659c;

        /* renamed from: d, reason: collision with root package name */
        private Long f27660d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f27661e;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e.a
        AbstractC1135e a() {
            String str = "";
            if (this.f27657a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f27658b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f27659c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f27660d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f27661e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1131a(this.f27657a.longValue(), this.f27658b.intValue(), this.f27659c.intValue(), this.f27660d.longValue(), this.f27661e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e.a
        AbstractC1135e.a b(int i4) {
            this.f27659c = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e.a
        AbstractC1135e.a c(long j4) {
            this.f27660d = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e.a
        AbstractC1135e.a d(int i4) {
            this.f27658b = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e.a
        AbstractC1135e.a e(int i4) {
            this.f27661e = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e.a
        AbstractC1135e.a f(long j4) {
            this.f27657a = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e
    int b() {
        return this.f27654i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e
    long c() {
        return this.f27655j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e
    int d() {
        return this.f27653h;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e
    int e() {
        return this.f27656k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1135e)) {
            return false;
        }
        AbstractC1135e abstractC1135e = (AbstractC1135e) obj;
        if (this.f27652g == abstractC1135e.f() && this.f27653h == abstractC1135e.d() && this.f27654i == abstractC1135e.b() && this.f27655j == abstractC1135e.c() && this.f27656k == abstractC1135e.e()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1135e
    long f() {
        return this.f27652g;
    }

    public int hashCode() {
        long j4 = this.f27652g;
        int i4 = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f27653h) * 1000003) ^ this.f27654i) * 1000003;
        long j5 = this.f27655j;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f27656k;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f27652g + ", loadBatchSize=" + this.f27653h + ", criticalSectionEnterTimeoutMs=" + this.f27654i + ", eventCleanUpAge=" + this.f27655j + ", maxBlobByteSizePerRow=" + this.f27656k + "}";
    }

    private C1131a(long j4, int i4, int i5, long j5, int i6) {
        this.f27652g = j4;
        this.f27653h = i4;
        this.f27654i = i5;
        this.f27655j = j5;
        this.f27656k = i6;
    }
}
