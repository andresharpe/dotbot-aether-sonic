package com.google.android.material.transition.platform;

import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    final int f34186a;

    /* renamed from: b, reason: collision with root package name */
    final int f34187b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f34188c;

    private c(int i4, int i5, boolean z3) {
        this.f34186a = i4;
        this.f34187b = i5;
        this.f34188c = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(int i4, int i5) {
        return new c(i4, i5, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c b(int i4, int i5) {
        return new c(i4, i5, false);
    }
}
