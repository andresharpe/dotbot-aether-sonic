package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class X extends Z {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f27990f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ X(Callable callable, W w3) {
        super();
        this.f27990f = callable;
    }

    @Override // com.google.android.gms.common.Z
    final String a() {
        try {
            return (String) this.f27990f.call();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
