package org.junit.internal;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* loaded from: classes2.dex */
public class k extends org.junit.runner.notification.a {

    /* renamed from: a, reason: collision with root package name */
    private final PrintStream f55565a;

    public k(f fVar) {
        this(fVar.a());
    }

    private PrintStream k() {
        return this.f55565a;
    }

    @Override // org.junit.runner.notification.a
    public void b(Failure failure) {
        this.f55565a.append('E');
    }

    @Override // org.junit.runner.notification.a
    public void d(Description description) {
        this.f55565a.append('I');
    }

    @Override // org.junit.runner.notification.a
    public void e(Result result) {
        o(result.m());
        m(result);
        n(result);
    }

    @Override // org.junit.runner.notification.a
    public void g(Description description) {
        this.f55565a.append('.');
    }

    protected String j(long j4) {
        return NumberFormat.getInstance().format(j4 / 1000.0d);
    }

    protected void l(Failure failure, String str) {
        k().println(str + ") " + failure.d());
        k().print(failure.f());
    }

    protected void m(Result result) {
        List<Failure> j4 = result.j();
        if (j4.isEmpty()) {
            return;
        }
        int i4 = 1;
        if (j4.size() == 1) {
            k().println("There was " + j4.size() + " failure:");
        } else {
            k().println("There were " + j4.size() + " failures:");
        }
        Iterator<Failure> it = j4.iterator();
        while (it.hasNext()) {
            l(it.next(), "" + i4);
            i4++;
        }
    }

    protected void n(Result result) {
        String str;
        if (result.p()) {
            k().println();
            k().print("OK");
            PrintStream k4 = k();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(result.l());
            sb.append(" test");
            if (result.l() == 1) {
                str = "";
            } else {
                str = "s";
            }
            sb.append(str);
            sb.append(")");
            k4.println(sb.toString());
        } else {
            k().println();
            k().println("FAILURES!!!");
            k().println("Tests run: " + result.l() + ",  Failures: " + result.i());
        }
        k().println();
    }

    protected void o(long j4) {
        k().println();
        k().println("Time: " + j(j4));
    }

    public k(PrintStream printStream) {
        this.f55565a = printStream;
    }
}
