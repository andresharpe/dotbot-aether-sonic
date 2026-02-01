package R1;

import android.app.Application;
import com.blankj.utilcode.util.E0;
import com.github.anrwatchdog.ANRError;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a implements b {
    private final void c() {
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        Application a4 = E0.a();
        F.o(a4, "getApp(...)");
        aVar.r(a4);
        aVar.b();
    }

    private static final void e(ANRError error) {
        F.p(error, "error");
        StringWriter stringWriter = new StringWriter();
        error.printStackTrace(new PrintWriter(stringWriter));
        T1.a.b(stringWriter.toString());
    }

    @Override // R1.b
    public void b() {
        c();
        a();
        g();
        f();
        d();
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
