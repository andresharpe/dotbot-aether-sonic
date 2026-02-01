package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.N;

/* loaded from: classes.dex */
class b {
    private b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
