package org.junit.runners.model;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.TestCouldNotBeSkippedException;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.l;

/* loaded from: classes2.dex */
public class MultipleFailureException extends Exception {

    /* renamed from: F, reason: collision with root package name */
    private static final long f55831F = 1;

    /* renamed from: E, reason: collision with root package name */
    private final List<Throwable> f55832E;

    public MultipleFailureException(List<Throwable> list) {
        if (!list.isEmpty()) {
            this.f55832E = new ArrayList(list.size());
            for (Throwable th : list) {
                if (th instanceof AssumptionViolatedException) {
                    th = new TestCouldNotBeSkippedException((AssumptionViolatedException) th);
                }
                this.f55832E.add(th);
            }
            return;
        }
        throw new IllegalArgumentException("List of Throwables must not be empty");
    }

    public static void a(List<Throwable> list) throws Exception {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            throw l.p(list.get(0));
        }
        throw new org.junit.internal.runners.model.MultipleFailureException(list);
    }

    public List<Throwable> b() {
        return Collections.unmodifiableList(this.f55832E);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.f55832E.size())));
        for (Throwable th : this.f55832E) {
            sb.append(String.format("%n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        Iterator<Throwable> it = this.f55832E.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Iterator<Throwable> it = this.f55832E.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Iterator<Throwable> it = this.f55832E.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace(printWriter);
        }
    }
}
