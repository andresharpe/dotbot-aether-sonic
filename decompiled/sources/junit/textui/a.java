package junit.textui;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;
import junit.framework.AssertionFailedError;
import junit.framework.f;
import junit.framework.h;
import junit.framework.i;
import junit.framework.j;

/* loaded from: classes2.dex */
public class a implements i {

    /* renamed from: a, reason: collision with root package name */
    PrintStream f51531a;

    /* renamed from: b, reason: collision with root package name */
    int f51532b = 0;

    public a(PrintStream printStream) {
        this.f51531a = printStream;
    }

    @Override // junit.framework.i
    public void a(f fVar, Throwable th) {
        f().print(androidx.exifinterface.media.a.U4);
    }

    @Override // junit.framework.i
    public void b(f fVar, AssertionFailedError assertionFailedError) {
        f().print("F");
    }

    @Override // junit.framework.i
    public void c(f fVar) {
    }

    @Override // junit.framework.i
    public void d(f fVar) {
        f().print(".");
        int i4 = this.f51532b;
        this.f51532b = i4 + 1;
        if (i4 >= 40) {
            f().println();
            this.f51532b = 0;
        }
    }

    protected String e(long j4) {
        return NumberFormat.getInstance().format(j4 / 1000.0d);
    }

    public PrintStream f() {
        return this.f51531a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g(j jVar, long j4) {
        o(j4);
        l(jVar);
        m(jVar);
        n(jVar);
    }

    public void h(h hVar, int i4) {
        i(hVar, i4);
        j(hVar);
    }

    protected void i(h hVar, int i4) {
        f().print(i4 + ") " + hVar.b());
    }

    protected void j(h hVar) {
        f().print(junit.runner.a.i(hVar.e()));
    }

    protected void k(Enumeration<h> enumeration, int i4, String str) {
        if (i4 == 0) {
            return;
        }
        if (i4 == 1) {
            f().println("There was " + i4 + " " + str + ":");
        } else {
            f().println("There were " + i4 + " " + str + "s:");
        }
        int i5 = 1;
        while (enumeration.hasMoreElements()) {
            h(enumeration.nextElement(), i5);
            i5++;
        }
    }

    protected void l(j jVar) {
        k(jVar.g(), jVar.f(), "error");
    }

    protected void m(j jVar) {
        k(jVar.i(), jVar.h(), "failure");
    }

    protected void n(j jVar) {
        String str;
        if (jVar.q()) {
            f().println();
            f().print("OK");
            PrintStream f4 = f();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(jVar.l());
            sb.append(" test");
            if (jVar.l() == 1) {
                str = "";
            } else {
                str = "s";
            }
            sb.append(str);
            sb.append(")");
            f4.println(sb.toString());
        } else {
            f().println();
            f().println("FAILURES!!!");
            f().println("Tests run: " + jVar.l() + ",  Failures: " + jVar.h() + ",  Errors: " + jVar.f());
        }
        f().println();
    }

    protected void o(long j4) {
        f().println();
        f().println("Time: " + e(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        f().println();
        f().println("<RETURN> to continue");
    }
}
