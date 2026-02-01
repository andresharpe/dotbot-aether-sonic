package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameLayout f29055a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LayoutInflater f29056b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewGroup f29057c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f29058d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f29059e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f29059e = aVar;
        this.f29055a = frameLayout;
        this.f29056b = layoutInflater;
        this.f29057c = viewGroup;
        this.f29058d = bundle;
    }

    @Override // com.google.android.gms.dynamic.p
    public final void a(e eVar) {
        e eVar2;
        this.f29055a.removeAllViews();
        FrameLayout frameLayout = this.f29055a;
        eVar2 = this.f29059e.f29041a;
        frameLayout.addView(eVar2.g(this.f29056b, this.f29057c, this.f29058d));
    }

    @Override // com.google.android.gms.dynamic.p
    public final int b() {
        return 2;
    }
}
