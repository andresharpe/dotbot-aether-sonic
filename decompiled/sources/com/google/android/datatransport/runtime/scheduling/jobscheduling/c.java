package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;

/* loaded from: classes.dex */
final class c extends SchedulerConfig {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27527e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Priority, SchedulerConfig.b> f27528f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.google.android.datatransport.runtime.time.a aVar, Map<Priority, SchedulerConfig.b> map) {
        if (aVar != null) {
            this.f27527e = aVar;
            if (map != null) {
                this.f27528f = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    com.google.android.datatransport.runtime.time.a e() {
        return this.f27527e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (this.f27527e.equals(schedulerConfig.e()) && this.f27528f.equals(schedulerConfig.i())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f27527e.hashCode() ^ 1000003) * 1000003) ^ this.f27528f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    Map<Priority, SchedulerConfig.b> i() {
        return this.f27528f;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f27527e + ", values=" + this.f27528f + "}";
    }
}
