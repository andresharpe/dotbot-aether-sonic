package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.sdk.android.auth.b;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f28663a;

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f28664b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f28663a = parse;
        f28664b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent b(String str, @androidx.annotation.P String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(b.c.f48986a, "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent c(String str) {
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
