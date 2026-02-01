package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.W;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* renamed from: a, reason: collision with root package name */
    private static final long f27511a = 86400000;

    /* renamed from: b, reason: collision with root package name */
    private static final long f27512b = 30000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f27513c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private static final long f27514d = 10000;

    /* loaded from: classes.dex */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.datatransport.runtime.time.a f27515a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Priority, b> f27516b = new HashMap();

        public a a(Priority priority, b bVar) {
            this.f27516b.put(priority, bVar);
            return this;
        }

        public SchedulerConfig b() {
            if (this.f27515a != null) {
                if (this.f27516b.keySet().size() >= Priority.values().length) {
                    Map<Priority, b> map = this.f27516b;
                    this.f27516b = new HashMap();
                    return SchedulerConfig.d(this.f27515a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(com.google.android.datatransport.runtime.time.a aVar) {
            this.f27515a = aVar;
            return this;
        }
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {

        @AutoValue.Builder
        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j4);

            public abstract a c(Set<Flag> set);

            public abstract a d(long j4);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<Flag> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    private long a(int i4, long j4) {
        long j5;
        int i5 = i4 - 1;
        if (j4 > 1) {
            j5 = j4;
        } else {
            j5 = 2;
        }
        return (long) (Math.pow(3.0d, i5) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j5 * i5)));
    }

    public static a b() {
        return new a();
    }

    static SchedulerConfig d(com.google.android.datatransport.runtime.time.a aVar, Map<Priority, b> map) {
        return new c(aVar, map);
    }

    public static SchedulerConfig f(com.google.android.datatransport.runtime.time.a aVar) {
        return b().a(Priority.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(Priority.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(Priority.VERY_LOW, b.a().b(86400000L).d(86400000L).c(j(Flag.NETWORK_UNMETERED, Flag.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @W(api = 21)
    private void k(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @W(api = 21)
    public JobInfo.Builder c(JobInfo.Builder builder, Priority priority, long j4, int i4) {
        builder.setMinimumLatency(h(priority, j4, i4));
        k(builder, i().get(priority).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract com.google.android.datatransport.runtime.time.a e();

    public Set<Flag> g(Priority priority) {
        return i().get(priority).c();
    }

    public long h(Priority priority, long j4, int i4) {
        long a4 = j4 - e().a();
        b bVar = i().get(priority);
        return Math.min(Math.max(a(i4, bVar.b()), a4), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<Priority, b> i();
}
