package com.harman.sdk.utils;

import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f48741a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f48742b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f48743c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final String f48744d;

    public o(@l3.d String releaseUpdateUrl, @l3.d String debugUpdateUrl, @l3.d String releaseWhatsNewUrl, @l3.d String debugWhatsNewUrl) {
        F.p(releaseUpdateUrl, "releaseUpdateUrl");
        F.p(debugUpdateUrl, "debugUpdateUrl");
        F.p(releaseWhatsNewUrl, "releaseWhatsNewUrl");
        F.p(debugWhatsNewUrl, "debugWhatsNewUrl");
        this.f48741a = releaseUpdateUrl;
        this.f48742b = debugUpdateUrl;
        this.f48743c = releaseWhatsNewUrl;
        this.f48744d = debugWhatsNewUrl;
    }

    @l3.d
    public final String a() {
        return this.f48742b;
    }

    @l3.d
    public final String b() {
        return this.f48744d;
    }

    @l3.d
    public final String c() {
        return this.f48741a;
    }

    @l3.d
    public final String d() {
        return this.f48743c;
    }
}
