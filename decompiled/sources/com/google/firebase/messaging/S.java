package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36500a = "com.google.firebase.messaging";

    private S() {
    }

    private static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public static boolean b(Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public static void c(Context context, boolean z3) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z3);
        edit.apply();
    }
}
