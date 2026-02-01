package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27370a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27371b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27372c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.a
    public i(Context context, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2) {
        this.f27370a = context;
        this.f27371b = aVar;
        this.f27372c = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h a(String str) {
        return h.b(this.f27370a, this.f27371b, this.f27372c, str);
    }
}
