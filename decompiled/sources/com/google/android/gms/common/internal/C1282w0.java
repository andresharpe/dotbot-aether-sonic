package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282w0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f28829a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("sLock")
    private static boolean f28830b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private static String f28831c;

    /* renamed from: d, reason: collision with root package name */
    private static int f28832d;

    public static int a(Context context) {
        c(context);
        return f28832d;
    }

    @androidx.annotation.P
    public static String b(Context context) {
        c(context);
        return f28831c;
    }

    private static void c(Context context) {
        Bundle bundle;
        synchronized (f28829a) {
            try {
                if (f28830b) {
                    return;
                }
                f28830b = true;
                try {
                    bundle = com.google.android.gms.common.wrappers.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e4);
                }
                if (bundle == null) {
                    return;
                }
                f28831c = bundle.getString("com.google.app.id");
                f28832d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
