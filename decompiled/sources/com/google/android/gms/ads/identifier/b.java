package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Map f27729E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, Map map) {
        this.f27729E = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f27729E;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(buildUpon.build().toString());
    }
}
