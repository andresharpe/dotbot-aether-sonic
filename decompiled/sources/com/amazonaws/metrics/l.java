package com.amazonaws.metrics;

/* loaded from: classes.dex */
public abstract class l implements f {
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return name().equals(((f) obj).name());
    }

    public final int hashCode() {
        return name().hashCode();
    }

    @Override // com.amazonaws.metrics.f
    public abstract String name();

    public final String toString() {
        return name();
    }
}
