package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.common.r;
import com.google.firebase.crashlytics.internal.model.A;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    private static final int f35615h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final String f35616i = "report-persistence";

    /* renamed from: j, reason: collision with root package name */
    private static final String f35617j = "sessions";

    /* renamed from: k, reason: collision with root package name */
    private static final String f35618k = "priority-reports";

    /* renamed from: l, reason: collision with root package name */
    private static final String f35619l = "native-reports";

    /* renamed from: m, reason: collision with root package name */
    private static final String f35620m = "reports";

    /* renamed from: n, reason: collision with root package name */
    private static final String f35621n = "report";

    /* renamed from: o, reason: collision with root package name */
    private static final String f35622o = "user";

    /* renamed from: p, reason: collision with root package name */
    private static final String f35623p = "app-exit-info";

    /* renamed from: q, reason: collision with root package name */
    private static final String f35624q = "start-time";

    /* renamed from: r, reason: collision with root package name */
    private static final String f35625r = "event";

    /* renamed from: s, reason: collision with root package name */
    private static final int f35626s = 10;

    /* renamed from: t, reason: collision with root package name */
    private static final String f35627t = "%010d";

    /* renamed from: v, reason: collision with root package name */
    private static final String f35629v = "_";

    /* renamed from: w, reason: collision with root package name */
    private static final String f35630w = "";

    /* renamed from: x, reason: collision with root package name */
    private static final String f35631x = "anr";

    /* renamed from: a, reason: collision with root package name */
    @N
    private final AtomicInteger f35634a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    @N
    private final File f35635b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final File f35636c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final File f35637d;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final File f35638e;

    /* renamed from: f, reason: collision with root package name */
    @N
    private final com.google.firebase.crashlytics.internal.settings.d f35639f;

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f35614g = Charset.forName("UTF-8");

    /* renamed from: u, reason: collision with root package name */
    private static final int f35628u = 15;

    /* renamed from: y, reason: collision with root package name */
    private static final com.google.firebase.crashlytics.internal.model.serialization.g f35632y = new com.google.firebase.crashlytics.internal.model.serialization.g();

    /* renamed from: z, reason: collision with root package name */
    private static final Comparator<? super File> f35633z = new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int C3;
            C3 = g.C((File) obj, (File) obj2);
            return C3;
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private static final FilenameFilter f35613A = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean D3;
            D3 = g.D(file, str);
            return D3;
        }
    };

    public g(@N File file, @N com.google.firebase.crashlytics.internal.settings.d dVar) {
        File file2 = new File(file, f35616i);
        this.f35635b = new File(file2, f35617j);
        this.f35636c = new File(file2, f35618k);
        this.f35637d = new File(file2, f35620m);
        this.f35638e = new File(file2, f35619l);
        this.f35639f = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(String str, File file) {
        if (file.isDirectory() && !file.getName().equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean B(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int C(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean D(File file, String str) {
        return str.startsWith("event");
    }

    private static boolean G(@N File file) {
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(@N File file, @N File file2) {
        return s(file.getName()).compareTo(s(file2.getName()));
    }

    @N
    private static File M(@N File file) throws IOException {
        if (G(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    @N
    private static String N(@N File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f35614g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static void O(@P File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                O(file2);
            }
        }
        file.delete();
    }

    @N
    private static List<File> P(@N List<File>... listArr) {
        for (List<File> list : listArr) {
            Collections.sort(list, f35633z);
        }
        return j(listArr);
    }

    private static void Q(@N File file, @N File file2, @N CrashlyticsReport.e eVar, @N String str) {
        try {
            com.google.firebase.crashlytics.internal.model.serialization.g gVar = f35632y;
            U(new File(M(file2), str), gVar.G(gVar.F(N(file)).n(eVar)));
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.f.f().n("Could not synthesize final native report file for " + file, e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void R(@androidx.annotation.N java.io.File r10, long r11) {
        /*
            r9 = this;
            java.io.FilenameFilter r0 = com.google.firebase.crashlytics.internal.persistence.g.f35613A
            java.util.List r0 = u(r10, r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2e
            com.google.firebase.crashlytics.internal.f r11 = com.google.firebase.crashlytics.internal.f.f()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Session "
            r12.append(r0)
            java.lang.String r10 = r10.getName()
            r12.append(r10)
            java.lang.String r10 = " has no events."
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.k(r10)
            return
        L2e:
            java.util.Collections.sort(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3b:
            r5 = r1
        L3c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            com.google.firebase.crashlytics.internal.model.serialization.g r4 = com.google.firebase.crashlytics.internal.persistence.g.f35632y     // Catch: java.io.IOException -> L62
            java.lang.String r6 = N(r3)     // Catch: java.io.IOException -> L62
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d r4 = r4.i(r6)     // Catch: java.io.IOException -> L62
            r2.add(r4)     // Catch: java.io.IOException -> L62
            if (r5 != 0) goto L64
            java.lang.String r4 = r3.getName()     // Catch: java.io.IOException -> L62
            boolean r3 = y(r4)     // Catch: java.io.IOException -> L62
            if (r3 == 0) goto L3b
            goto L64
        L62:
            r4 = move-exception
            goto L67
        L64:
            r3 = 1
            r5 = r3
            goto L3c
        L67:
            com.google.firebase.crashlytics.internal.f r6 = com.google.firebase.crashlytics.internal.f.f()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Could not add event to report for "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.n(r3, r4)
            goto L3c
        L80:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto La3
            com.google.firebase.crashlytics.internal.f r11 = com.google.firebase.crashlytics.internal.f.f()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Could not parse event files for session "
            r12.append(r0)
            java.lang.String r10 = r10.getName()
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.m(r10)
            return
        La3:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "user"
            r0.<init>(r10, r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Ld3
            java.lang.String r0 = N(r0)     // Catch: java.io.IOException -> Lb6
        Lb4:
            r6 = r0
            goto Ld5
        Lb6:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.f r1 = com.google.firebase.crashlytics.internal.f.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not read user ID file in "
            r3.append(r4)
            java.lang.String r4 = r10.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.n(r3, r0)
        Ld3:
            r0 = 0
            goto Lb4
        Ld5:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "report"
            r0.<init>(r10, r1)
            if (r5 == 0) goto Le2
            java.io.File r10 = r9.f35636c
        Le0:
            r1 = r10
            goto Le5
        Le2:
            java.io.File r10 = r9.f35637d
            goto Le0
        Le5:
            r3 = r11
            S(r0, r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.g.R(java.io.File, long):void");
    }

    private static void S(@N File file, @N File file2, @N List<CrashlyticsReport.f.d> list, long j4, boolean z3, @P String str) {
        try {
            com.google.firebase.crashlytics.internal.model.serialization.g gVar = f35632y;
            CrashlyticsReport m4 = gVar.F(N(file)).p(j4, z3, str).m(A.b(list));
            CrashlyticsReport.f j5 = m4.j();
            if (j5 == null) {
                return;
            }
            U(new File(M(file2), j5.h()), gVar.G(m4));
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.f.f().n("Could not synthesize final report file for " + file, e4);
        }
    }

    private static int T(@N File file, int i4) {
        List<File> u3 = u(file, new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                boolean z3;
                z3 = g.z(file2, str);
                return z3;
            }
        });
        Collections.sort(u3, new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int H3;
                H3 = g.H((File) obj, (File) obj2);
                return H3;
            }
        });
        return h(u3, i4);
    }

    private static void U(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f35614g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void V(File file, String str, long j4) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f35614g);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(k(j4));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @N
    private List<File> g(@P final String str) {
        List<File> t3 = t(this.f35635b, new FileFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.f
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean A3;
                A3 = g.A(str, file);
                return A3;
            }
        });
        Collections.sort(t3, f35633z);
        if (t3.size() <= 8) {
            return t3;
        }
        Iterator<File> it = t3.subList(8, t3.size()).iterator();
        while (it.hasNext()) {
            O(it.next());
        }
        return t3.subList(0, 8);
    }

    private static int h(List<File> list, int i4) {
        int size = list.size();
        for (File file : list) {
            if (size <= i4) {
                return size;
            }
            O(file);
            size--;
        }
        return size;
    }

    private void i() {
        int i4 = this.f35639f.b().e().f57350b;
        List<File> r4 = r();
        int size = r4.size();
        if (size <= i4) {
            return;
        }
        Iterator<File> it = r4.subList(i4, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @N
    private static List<File> j(@N List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (List<File> list : listArr) {
            i4 += list.size();
        }
        arrayList.ensureCapacity(i4);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private static long k(long j4) {
        return j4 * 1000;
    }

    @N
    private static String p(int i4, boolean z3) {
        String str;
        String format = String.format(Locale.US, f35627t, Integer.valueOf(i4));
        if (z3) {
            str = f35629v;
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    @N
    private static List<File> q(@N File file) {
        return t(file, null);
    }

    @N
    private List<File> r() {
        return P(j(q(this.f35636c), q(this.f35638e)), q(this.f35637d));
    }

    @N
    private static String s(@N String str) {
        return str.substring(0, f35628u);
    }

    @N
    private static List<File> t(@N File file, @P FileFilter fileFilter) {
        File[] listFiles;
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        if (fileFilter == null) {
            listFiles = file.listFiles();
        } else {
            listFiles = file.listFiles(fileFilter);
        }
        if (listFiles != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    @N
    private static List<File> u(@N File file, @P FilenameFilter filenameFilter) {
        File[] listFiles;
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        if (filenameFilter == null) {
            listFiles = file.listFiles();
        } else {
            listFiles = file.listFiles(filenameFilter);
        }
        if (listFiles != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    @N
    private File v(@N String str) {
        return new File(this.f35635b, str);
    }

    private static boolean y(@N String str) {
        if (str.startsWith("event") && str.endsWith(f35629v)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean z(@N File file, @N String str) {
        if (str.startsWith("event") && !str.endsWith(f35629v)) {
            return true;
        }
        return false;
    }

    @N
    public List<String> E() {
        List<File> q4 = q(this.f35635b);
        Collections.sort(q4, f35633z);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = q4.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @N
    public List<r> F() {
        List<File> r4 = r();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(r4.size());
        for (File file : r()) {
            try {
                arrayList.add(r.a(f35632y.F(N(file)), file.getName()));
            } catch (IOException e4) {
                com.google.firebase.crashlytics.internal.f.f().n("Could not load report file " + file + "; deleting", e4);
                file.delete();
            }
        }
        return arrayList;
    }

    public void I(@N CrashlyticsReport.f.d dVar, @N String str) {
        J(dVar, str, false);
    }

    public void J(@N CrashlyticsReport.f.d dVar, @N String str, boolean z3) {
        int i4 = this.f35639f.b().e().f57349a;
        File v3 = v(str);
        try {
            U(new File(v3, p(this.f35634a.getAndIncrement(), z3)), f35632y.j(dVar));
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.f.f().n("Could not persist event for session " + str, e4);
        }
        T(v3, i4);
    }

    public void K(@N CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.f j4 = crashlyticsReport.j();
        if (j4 == null) {
            com.google.firebase.crashlytics.internal.f.f().b("Could not get session for report");
            return;
        }
        String h4 = j4.h();
        try {
            File M3 = M(v(h4));
            U(new File(M3, f35621n), f35632y.G(crashlyticsReport));
            V(new File(M3, f35624q), "", j4.k());
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.f.f().c("Could not persist report for session " + h4, e4);
        }
    }

    public void L(@N String str, @N String str2) {
        try {
            U(new File(v(str2), f35622o), str);
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.f.f().n("Could not persist user ID for session " + str2, e4);
        }
    }

    public void l() {
        Iterator<File> it = r().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void m(final String str) {
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean B3;
                B3 = g.B(str, file, str2);
                return B3;
            }
        };
        Iterator<File> it = j(u(this.f35636c, filenameFilter), u(this.f35638e, filenameFilter), u(this.f35637d, filenameFilter)).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void n(@P String str, long j4) {
        for (File file : g(str)) {
            com.google.firebase.crashlytics.internal.f.f().k("Finalizing report for session " + file.getName());
            R(file, j4);
            O(file);
        }
        i();
    }

    public void o(@N String str, @N CrashlyticsReport.e eVar) {
        Q(new File(v(str), f35621n), this.f35638e, eVar, str);
    }

    public long w(String str) {
        return new File(v(str), f35624q).lastModified();
    }

    public boolean x() {
        return !r().isEmpty();
    }
}
