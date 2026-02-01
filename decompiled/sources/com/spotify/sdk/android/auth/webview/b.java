package com.spotify.sdk.android.auth.webview;

import android.app.Activity;
import android.util.Log;
import com.spotify.sdk.android.auth.c;
import com.spotify.sdk.android.auth.d;

/* loaded from: classes2.dex */
public class b implements com.spotify.sdk.android.auth.c {

    /* renamed from: c, reason: collision with root package name */
    private static String f49049c = "b";

    /* renamed from: a, reason: collision with root package name */
    private a f49050a;

    /* renamed from: b, reason: collision with root package name */
    private c.a f49051b;

    @Override // com.spotify.sdk.android.auth.c
    public boolean a(Activity activity, d dVar) {
        Log.d(f49049c, "start");
        a aVar = new a(activity, dVar);
        this.f49050a = aVar;
        aVar.m(this.f49051b);
        this.f49050a.show();
        return true;
    }

    @Override // com.spotify.sdk.android.auth.c
    public void b(c.a aVar) {
        this.f49051b = aVar;
        a aVar2 = this.f49050a;
        if (aVar2 != null) {
            aVar2.m(aVar);
        }
    }

    @Override // com.spotify.sdk.android.auth.c
    public void stop() {
        Log.d(f49049c, "stop");
        a aVar = this.f49050a;
        if (aVar != null) {
            aVar.g();
            this.f49050a = null;
        }
    }
}
