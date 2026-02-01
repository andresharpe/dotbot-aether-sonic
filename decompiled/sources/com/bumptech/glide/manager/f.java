package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.N;
import androidx.core.content.C0669d;
import com.bumptech.glide.manager.c;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26673a = "ConnectivityMonitor";

    /* renamed from: b, reason: collision with root package name */
    private static final String f26674b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // com.bumptech.glide.manager.d
    @N
    public c a(@N Context context, @N c.a aVar) {
        boolean z3;
        String str;
        if (C0669d.a(context, f26674b) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Log.isLoggable(f26673a, 3)) {
            if (z3) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d(f26673a, str);
        }
        if (z3) {
            return new e(context, aVar);
        }
        return new n();
    }
}
