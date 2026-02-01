package com.google.android.play.core.review.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.P;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f34427a;

    public i(String str) {
        this.f34427a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String f(String str, String str2, @P Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e4) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e4);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.f34427a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int b(String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f34427a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int c(Throwable th, String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f34427a, str, objArr), th);
        }
        return 0;
    }

    public final int d(String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.f34427a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.f34427a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
