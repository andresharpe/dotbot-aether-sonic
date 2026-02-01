package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* loaded from: classes2.dex */
class z {

    /* renamed from: b, reason: collision with root package name */
    private static final String f35217b = "";

    /* renamed from: a, reason: collision with root package name */
    private String f35218a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        String str;
        try {
            if (this.f35218a == null) {
                this.f35218a = b(context);
            }
            if ("".equals(this.f35218a)) {
                str = null;
            } else {
                str = this.f35218a;
            }
        } finally {
        }
        return str;
    }
}
