package org.junit.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f55566a = k();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f55567b = {"org.junit.runner.", "org.junit.runners.", "org.junit.experimental.runners.", "org.junit.internal.", "junit.extensions", "junit.framework", "junit.runner", "junit.textui"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f55568c = {"org.junit.internal.StackTracesTest"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f55569d = {"sun.reflect.", "java.lang.reflect.", "jdk.internal.reflect.", "org.junit.rules.RunRules.<init>(", "org.junit.rules.RunRules.applyAll(", "org.junit.runners.RuleContainer.apply(", "junit.framework.TestCase.runBare("};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static class a<T> extends AbstractList<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ List f55570E;

        a(List list) {
            this.f55570E = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i4) {
            return (T) this.f55570E.get((r0.size() - i4) - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55570E.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static abstract class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DONE;
        public static final b PROCESSING_OTHER_CODE;
        public static final b PROCESSING_REFLECTION_CODE;
        public static final b PROCESSING_TEST_FRAMEWORK_CODE;

        /* loaded from: classes2.dex */
        enum a extends b {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.junit.internal.l.b
            public b b(String str) {
                if (l.n(str)) {
                    return b.PROCESSING_TEST_FRAMEWORK_CODE;
                }
                return this;
            }
        }

        /* renamed from: org.junit.internal.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        enum C0524b extends b {
            C0524b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.junit.internal.l.b
            public b b(String str) {
                if (l.m(str)) {
                    return b.PROCESSING_REFLECTION_CODE;
                }
                if (l.n(str)) {
                    return this;
                }
                return b.PROCESSING_OTHER_CODE;
            }
        }

        /* loaded from: classes2.dex */
        enum c extends b {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.junit.internal.l.b
            public b b(String str) {
                if (l.m(str)) {
                    return this;
                }
                if (l.n(str)) {
                    return b.PROCESSING_TEST_FRAMEWORK_CODE;
                }
                return b.DONE;
            }
        }

        /* loaded from: classes2.dex */
        enum d extends b {
            d(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.junit.internal.l.b
            public b b(String str) {
                return this;
            }
        }

        static {
            a aVar = new a("PROCESSING_OTHER_CODE", 0);
            PROCESSING_OTHER_CODE = aVar;
            C0524b c0524b = new C0524b("PROCESSING_TEST_FRAMEWORK_CODE", 1);
            PROCESSING_TEST_FRAMEWORK_CODE = c0524b;
            c cVar = new c("PROCESSING_REFLECTION_CODE", 2);
            PROCESSING_REFLECTION_CODE = cVar;
            d dVar = new d("DONE", 3);
            DONE = dVar;
            $VALUES = new b[]{aVar, c0524b, cVar, dVar};
        }

        private b(String str, int i4) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        protected abstract b b(String str);

        public final b e(StackTraceElement stackTraceElement) {
            return b(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "()");
        }

        /* synthetic */ b(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    private l() {
    }

    private static void c(List<String> list, StringBuilder sb) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(String.format("%s%n", it.next()));
        }
    }

    private static <T> List<T> d(List<T> list) {
        return new a(list);
    }

    private static List<String> e(Throwable th) {
        String readLine;
        if (th.getCause() != null || j(th)) {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(f(th).substring(th.toString().length())));
            ArrayList arrayList = new ArrayList();
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.startsWith("Caused by: ")) {
                            break;
                        }
                    }
                } catch (IOException unused) {
                }
            } while (!readLine.trim().startsWith("Suppressed: "));
            arrayList.add(readLine);
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 != null) {
                    arrayList.add(readLine2);
                } else {
                    return arrayList;
                }
            }
        }
        return Collections.emptyList();
    }

    private static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String h(Throwable th) {
        List<String> i4 = i(th);
        if (i4.isEmpty()) {
            return f(th);
        }
        StringBuilder sb = new StringBuilder(th.toString());
        c(i4, sb);
        c(e(th), sb);
        return sb.toString();
    }

    private static List<String> i(Throwable th) {
        List asList = Arrays.asList(th.getStackTrace());
        int size = asList.size();
        b bVar = b.PROCESSING_OTHER_CODE;
        Iterator it = d(asList).iterator();
        while (it.hasNext()) {
            bVar = bVar.e((StackTraceElement) it.next());
            if (bVar == b.DONE) {
                ArrayList arrayList = new ArrayList(size + 2);
                arrayList.add("");
                Iterator it2 = asList.subList(0, size).iterator();
                while (it2.hasNext()) {
                    arrayList.add("\tat " + ((StackTraceElement) it2.next()));
                }
                if (th.getCause() != null) {
                    arrayList.add("\t... " + (asList.size() - arrayList.size()) + " trimmed");
                }
                return arrayList;
            }
            size--;
        }
        return Collections.emptyList();
    }

    private static boolean j(Throwable th) {
        Method method = f55566a;
        if (method == null) {
            return false;
        }
        try {
            if (((Throwable[]) method.invoke(th, new Object[0])).length == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Method k() {
        try {
            return Throwable.class.getMethod("getSuppressed", new Class[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean l(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(String str) {
        return l(str, f55569d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(String str) {
        if (l(str, f55567b) && !l(str, f55568c)) {
            return true;
        }
        return false;
    }

    public static Exception p(Throwable th) throws Exception {
        o(th);
        return null;
    }

    private static <T extends Throwable> void o(Throwable th) throws Throwable {
        throw th;
    }
}
