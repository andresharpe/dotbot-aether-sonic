package org.junit.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.FilterFactory;
import org.junit.runners.model.InitializationError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class JUnitCommandLineParseResult {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f55715a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<Class<?>> f55716b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<Throwable> f55717c = new ArrayList();

    /* loaded from: classes2.dex */
    public static class CommandLineParserError extends Exception {

        /* renamed from: E, reason: collision with root package name */
        private static final long f55718E = 1;

        public CommandLineParserError(String str) {
            super(str);
        }
    }

    JUnitCommandLineParseResult() {
    }

    private h a(h hVar) {
        try {
            Iterator<String> it = this.f55715a.iterator();
            while (it.hasNext()) {
                hVar = hVar.g(c.e(hVar, it.next()));
            }
            return hVar;
        } catch (FilterFactory.FilterNotCreatedException e4) {
            return d(e4);
        }
    }

    private String[] b(String[] strArr, int i4, int i5) {
        String[] strArr2 = new String[i5 - i4];
        for (int i6 = i4; i6 != i5; i6++) {
            strArr2[i6 - i4] = strArr[i6];
        }
        return strArr2;
    }

    private h d(Throwable th) {
        return h.e(JUnitCommandLineParseResult.class, th);
    }

    public static JUnitCommandLineParseResult g(String[] strArr) {
        JUnitCommandLineParseResult jUnitCommandLineParseResult = new JUnitCommandLineParseResult();
        jUnitCommandLineParseResult.h(strArr);
        return jUnitCommandLineParseResult;
    }

    private void h(String[] strArr) {
        j(i(strArr));
    }

    public h c(a aVar) {
        if (this.f55717c.isEmpty()) {
            List<Class<?>> list = this.f55716b;
            return a(h.c(aVar, (Class[]) list.toArray(new Class[list.size()])));
        }
        return d(new InitializationError(this.f55717c));
    }

    public List<Class<?>> e() {
        return Collections.unmodifiableList(this.f55716b);
    }

    public List<String> f() {
        return Collections.unmodifiableList(this.f55715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        return new java.lang.String[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String[] i(java.lang.String... r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.length
            if (r1 == r2) goto L94
            r2 = r8[r1]
            java.lang.String r3 = "--"
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L17
            int r1 = r1 + 1
            int r0 = r8.length
            java.lang.String[] r8 = r7.b(r8, r1, r0)
            return r8
        L17:
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L8e
            java.lang.String r3 = "--filter="
            boolean r3 = r2.startsWith(r3)
            java.lang.String r4 = "--filter"
            if (r3 != 0) goto L4f
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L2e
            goto L4f
        L2e:
            java.util.List<java.lang.Throwable> r3 = r7.f55717c
            org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError r4 = new org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "JUnit knows nothing about the "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = " option"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r3.add(r4)
            goto L8a
        L4f:
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L79
            int r1 = r1 + 1
            int r3 = r8.length
            if (r1 >= r3) goto L5d
            r2 = r8[r1]
            goto L85
        L5d:
            java.util.List<java.lang.Throwable> r8 = r7.f55717c
            org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError r1 = new org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " value not specified"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            r8.add(r1)
            goto L94
        L79:
            r3 = 61
            int r3 = r2.indexOf(r3)
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)
        L85:
            java.util.List<java.lang.String> r3 = r7.f55715a
            r3.add(r2)
        L8a:
            int r1 = r1 + 1
            goto L2
        L8e:
            int r0 = r8.length
            java.lang.String[] r8 = r7.b(r8, r1, r0)
            return r8
        L94:
            java.lang.String[] r8 = new java.lang.String[r0]
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.runner.JUnitCommandLineParseResult.i(java.lang.String[]):java.lang.String[]");
    }

    void j(String[] strArr) {
        for (String str : strArr) {
            try {
                this.f55716b.add(org.junit.internal.b.a(str));
            } catch (ClassNotFoundException e4) {
                this.f55717c.add(new IllegalArgumentException("Could not find class [" + str + "]", e4));
            }
        }
    }
}
