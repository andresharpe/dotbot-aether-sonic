package androidx.tracing;

import android.os.Trace;
import androidx.annotation.N;
import androidx.annotation.W;

@W(18)
/* loaded from: classes.dex */
final class d {
    private d() {
    }

    public static void a(@N String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
