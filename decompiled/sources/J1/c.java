package J1;

import android.os.Trace;

/* loaded from: classes2.dex */
public final class c {
    private c() {
    }

    public static void a() {
        Trace.endSection();
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }
}
