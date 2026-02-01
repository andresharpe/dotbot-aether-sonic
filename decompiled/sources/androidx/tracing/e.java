package androidx.tracing;

import android.os.Trace;
import androidx.annotation.N;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;

@W(ConstraintLayout.b.a.f9571D)
/* loaded from: classes.dex */
final class e {
    private e() {
    }

    public static void a(@N String str, int i4) {
        Trace.beginAsyncSection(str, i4);
    }

    public static void b(@N String str, int i4) {
        Trace.endAsyncSection(str, i4);
    }

    public static void c(@N String str, int i4) {
        Trace.setCounter(str, i4);
    }
}
