package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2210p {
    @kotlin.internal.e
    @Y(version = "1.1")
    public static void a(@l3.d Throwable th, @l3.d Throwable exception) {
        kotlin.jvm.internal.F.p(th, "<this>");
        kotlin.jvm.internal.F.p(exception, "exception");
        if (th != exception) {
            kotlin.internal.m.f52098a.a(th, exception);
        }
    }

    @l3.d
    public static final StackTraceElement[] b(@l3.d Throwable th) {
        kotlin.jvm.internal.F.p(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.F.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th) {
    }

    @l3.d
    public static final List<Throwable> d(@l3.d Throwable th) {
        kotlin.jvm.internal.F.p(th, "<this>");
        return kotlin.internal.m.f52098a.d(th);
    }

    @Y(version = "1.4")
    public static /* synthetic */ void e(Throwable th) {
    }

    @kotlin.internal.f
    private static final void f(Throwable th) {
        kotlin.jvm.internal.F.p(th, "<this>");
        th.printStackTrace();
    }

    @kotlin.internal.f
    private static final void g(Throwable th, PrintStream stream) {
        kotlin.jvm.internal.F.p(th, "<this>");
        kotlin.jvm.internal.F.p(stream, "stream");
        th.printStackTrace(stream);
    }

    @kotlin.internal.f
    private static final void h(Throwable th, PrintWriter writer) {
        kotlin.jvm.internal.F.p(th, "<this>");
        kotlin.jvm.internal.F.p(writer, "writer");
        th.printStackTrace(writer);
    }

    @l3.d
    @Y(version = "1.4")
    public static final String i(@l3.d Throwable th) {
        kotlin.jvm.internal.F.p(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.F.o(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
