package com.spotify.sdk.android.auth.webview;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

/* loaded from: classes2.dex */
class c {
    c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : cookie.split(";")) {
            String[] split = str2.split("=");
            if (split.length > 0) {
                cookieManager.setCookie(str, split[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        a(context, "facebook.com");
        a(context, ".facebook.com");
        a(context, "https://facebook.com");
        a(context, "https://.facebook.com");
    }
}
