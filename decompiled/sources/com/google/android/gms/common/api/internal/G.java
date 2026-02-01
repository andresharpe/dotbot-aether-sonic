package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.InterfaceC1764e;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class G implements InterfaceC1764e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1771l f28154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f28155b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(H h4, C1771l c1771l) {
        this.f28155b = h4;
        this.f28154a = c1771l;
    }

    @Override // com.google.android.gms.tasks.InterfaceC1764e
    public final void a(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        Map map;
        map = this.f28155b.f28158b;
        map.remove(this.f28154a);
    }
}
