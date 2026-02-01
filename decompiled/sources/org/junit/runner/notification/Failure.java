package org.junit.runner.notification;

import java.io.Serializable;
import org.junit.internal.l;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class Failure implements Serializable {

    /* renamed from: G, reason: collision with root package name */
    private static final long f55757G = 1;

    /* renamed from: E, reason: collision with root package name */
    private final Description f55758E;

    /* renamed from: F, reason: collision with root package name */
    private final Throwable f55759F;

    public Failure(Description description, Throwable th) {
        this.f55759F = th;
        this.f55758E = description;
    }

    public Description a() {
        return this.f55758E;
    }

    public Throwable b() {
        return this.f55759F;
    }

    public String c() {
        return b().getMessage();
    }

    public String d() {
        return this.f55758E.p();
    }

    public String e() {
        return l.g(b());
    }

    public String f() {
        return l.h(b());
    }

    public String toString() {
        return d() + ": " + this.f55759F.getMessage();
    }
}
