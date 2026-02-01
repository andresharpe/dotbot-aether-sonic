package com.amazonaws.metrics;

/* loaded from: classes.dex */
public class m extends l implements k {

    /* renamed from: E, reason: collision with root package name */
    private final String f23835E;

    /* renamed from: F, reason: collision with root package name */
    private final String f23836F;

    public m(String str, String str2) {
        this.f23835E = str;
        this.f23836F = str2;
    }

    @Override // com.amazonaws.metrics.k
    public String b() {
        return this.f23836F;
    }

    @Override // com.amazonaws.metrics.l, com.amazonaws.metrics.f
    public String name() {
        return this.f23835E;
    }
}
