package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: K, reason: collision with root package name */
    private static final long f25853K = 1;

    /* renamed from: L, reason: collision with root package name */
    private static final StackTraceElement[] f25854L = new StackTraceElement[0];

    /* renamed from: E, reason: collision with root package name */
    private final List<Throwable> f25855E;

    /* renamed from: F, reason: collision with root package name */
    private com.bumptech.glide.load.c f25856F;

    /* renamed from: G, reason: collision with root package name */
    private DataSource f25857G;

    /* renamed from: H, reason: collision with root package name */
    private Class<?> f25858H;

    /* renamed from: I, reason: collision with root package name */
    private String f25859I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private Exception f25860J;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            Iterator<Throwable> it = ((GlideException) th).e().iterator();
            while (it.hasNext()) {
                a(it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            appendable.append("Cause (").append(String.valueOf(i5)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i4);
            if (th instanceof GlideException) {
                ((GlideException) th).i(appendable);
            } else {
                d(th, appendable);
            }
            i4 = i5;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void i(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f25855E;
    }

    @P
    public Exception f() {
        return this.f25860J;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> g() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f25859I);
        String str3 = "";
        if (this.f25858H == null) {
            str = "";
        } else {
            str = ", " + this.f25858H;
        }
        sb.append(str);
        if (this.f25857G == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f25857G;
        }
        sb.append(str2);
        if (this.f25856F != null) {
            str3 = ", " + this.f25856F;
        }
        sb.append(str3);
        List<Throwable> g4 = g();
        if (g4.isEmpty()) {
            return sb.toString();
        }
        if (g4.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(g4.size());
            sb.append(" root causes:");
        }
        for (Throwable th : g4) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void h(String str) {
        List<Throwable> g4 = g();
        int size = g4.size();
        int i4 = 0;
        while (i4 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i5 = i4 + 1;
            sb.append(i5);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), g4.get(i4));
            i4 = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(com.bumptech.glide.load.c cVar, DataSource dataSource) {
        k(cVar, dataSource, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(com.bumptech.glide.load.c cVar, DataSource dataSource, Class<?> cls) {
        this.f25856F = cVar;
        this.f25857G = dataSource;
        this.f25858H = cls;
    }

    public void l(@P Exception exc) {
        this.f25860J = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        i(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f25859I = str;
        setStackTrace(f25854L);
        this.f25855E = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        i(printWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: G, reason: collision with root package name */
        private static final String f25861G = "";

        /* renamed from: H, reason: collision with root package name */
        private static final String f25862H = "  ";

        /* renamed from: E, reason: collision with root package name */
        private final Appendable f25863E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f25864F = true;

        a(Appendable appendable) {
            this.f25863E = appendable;
        }

        @N
        private CharSequence a(@P CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            return charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c4) throws IOException {
            if (this.f25864F) {
                this.f25864F = false;
                this.f25863E.append(f25862H);
            }
            this.f25864F = c4 == '\n';
            this.f25863E.append(c4);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@P CharSequence charSequence) throws IOException {
            CharSequence a4 = a(charSequence);
            return append(a4, 0, a4.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@P CharSequence charSequence, int i4, int i5) throws IOException {
            CharSequence a4 = a(charSequence);
            boolean z3 = false;
            if (this.f25864F) {
                this.f25864F = false;
                this.f25863E.append(f25862H);
            }
            if (a4.length() > 0 && a4.charAt(i5 - 1) == '\n') {
                z3 = true;
            }
            this.f25864F = z3;
            this.f25863E.append(a4, i4, i5);
            return this;
        }
    }
}
