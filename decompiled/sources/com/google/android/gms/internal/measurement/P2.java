package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes2.dex */
public final /* synthetic */ class P2 {
    public static Object a(Q2 q22) {
        try {
            return q22.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return q22.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
