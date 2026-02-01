package com.amazonaws.metrics;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class a extends b {

    /* renamed from: d, reason: collision with root package name */
    private static final int f23818d = 10;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(o oVar) {
        super(oVar);
    }

    @Override // com.amazonaws.metrics.b
    public void e(int i4, long j4) {
        super.e(i4, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (a() > 0) {
            AwsSdkMetrics.u().a(this);
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        if (TimeUnit.NANOSECONDS.toSeconds(b()) > 10) {
            g();
        }
        return System.nanoTime();
    }
}
