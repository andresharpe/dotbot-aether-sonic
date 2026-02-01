package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* loaded from: classes.dex */
final class d extends SchedulerConfig.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f27529a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27530b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<SchedulerConfig.Flag> f27531c;

    /* loaded from: classes.dex */
    static final class b extends SchedulerConfig.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f27532a;

        /* renamed from: b, reason: collision with root package name */
        private Long f27533b;

        /* renamed from: c, reason: collision with root package name */
        private Set<SchedulerConfig.Flag> f27534c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b a() {
            String str = "";
            if (this.f27532a == null) {
                str = " delta";
            }
            if (this.f27533b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f27534c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f27532a.longValue(), this.f27533b.longValue(), this.f27534c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a b(long j4) {
            this.f27532a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a c(Set<SchedulerConfig.Flag> set) {
            if (set != null) {
                this.f27534c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a d(long j4) {
            this.f27533b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    long b() {
        return this.f27529a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    Set<SchedulerConfig.Flag> c() {
        return this.f27531c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    long d() {
        return this.f27530b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.b)) {
            return false;
        }
        SchedulerConfig.b bVar = (SchedulerConfig.b) obj;
        if (this.f27529a == bVar.b() && this.f27530b == bVar.d() && this.f27531c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f27529a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f27530b;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f27531c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f27529a + ", maxAllowedDelay=" + this.f27530b + ", flags=" + this.f27531c + "}";
    }

    private d(long j4, long j5, Set<SchedulerConfig.Flag> set) {
        this.f27529a = j4;
        this.f27530b = j5;
        this.f27531c = set;
    }
}
