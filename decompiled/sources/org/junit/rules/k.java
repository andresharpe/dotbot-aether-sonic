package org.junit.rules;

import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class k extends m {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f55689a;

    @Override // org.junit.rules.m
    protected void n(Description description) {
        this.f55689a = description.q();
    }

    public String r() {
        return this.f55689a;
    }
}
