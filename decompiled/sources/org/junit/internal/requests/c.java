package org.junit.internal.requests;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.runner.h;
import org.junit.runner.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Lock f55590a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private volatile j f55591b;

    @Override // org.junit.runner.h
    public final j h() {
        if (this.f55591b == null) {
            this.f55590a.lock();
            try {
                if (this.f55591b == null) {
                    this.f55591b = m();
                }
            } finally {
                this.f55590a.unlock();
            }
        }
        return this.f55591b;
    }

    protected abstract j m();
}
