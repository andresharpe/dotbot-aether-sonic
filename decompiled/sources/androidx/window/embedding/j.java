package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.InterfaceC0764e;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

@androidx.window.core.d
/* loaded from: classes.dex */
public interface j {
    void a(@l3.d Set<? extends m> set);

    @l3.d
    Set<m> b();

    void c(@l3.d m mVar);

    void d(@l3.d InterfaceC0764e<List<t>> interfaceC0764e);

    boolean e();

    void f(@l3.d m mVar);

    void g(@l3.d Activity activity, @l3.d Executor executor, @l3.d InterfaceC0764e<List<t>> interfaceC0764e);
}
