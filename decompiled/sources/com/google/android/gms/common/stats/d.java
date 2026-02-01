package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.N;

@I0.a
@Deprecated
/* loaded from: classes.dex */
public class d {
    @I0.a
    @N
    public static String a(@N PowerManager.WakeLock wakeLock, @N String str) {
        String valueOf = String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}
