package com.blankj.utilcode.util;

import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes.dex */
public class L0 {
    public static int a(int i4) {
        return ((AudioManager) E0.a().getSystemService("audio")).getStreamMaxVolume(i4);
    }

    public static int b(int i4) {
        int streamMinVolume;
        AudioManager audioManager = (AudioManager) E0.a().getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 28) {
            streamMinVolume = audioManager.getStreamMinVolume(i4);
            return streamMinVolume;
        }
        return 0;
    }

    public static int c(int i4) {
        return ((AudioManager) E0.a().getSystemService("audio")).getStreamVolume(i4);
    }

    public static void d(int i4, int i5, int i6) {
        try {
            ((AudioManager) E0.a().getSystemService("audio")).setStreamVolume(i4, i5, i6);
        } catch (SecurityException unused) {
        }
    }
}
