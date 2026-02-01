package com.google.android.gms.cloudmessaging;

import android.util.Log;

/* loaded from: classes.dex */
public final class i extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z3) throws ClassNotFoundException {
        if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
            if (Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return j.class;
            }
            return j.class;
        }
        return super.loadClass(str, z3);
    }
}
