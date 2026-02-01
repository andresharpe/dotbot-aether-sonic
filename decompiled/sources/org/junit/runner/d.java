package org.junit.runner;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Description f55739a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55740b;

    public d(Description description, String str) {
        if (str != null && description != null) {
            this.f55739a = description;
            this.f55740b = str;
            return;
        }
        throw null;
    }

    public String a() {
        return this.f55740b;
    }

    public Description b() {
        return this.f55739a;
    }
}
