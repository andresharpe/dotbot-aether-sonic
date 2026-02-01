package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: S, reason: collision with root package name */
    static final String f25417S = "journal";

    /* renamed from: T, reason: collision with root package name */
    static final String f25418T = "journal.tmp";

    /* renamed from: U, reason: collision with root package name */
    static final String f25419U = "journal.bkp";

    /* renamed from: V, reason: collision with root package name */
    static final String f25420V = "libcore.io.DiskLruCache";

    /* renamed from: W, reason: collision with root package name */
    static final String f25421W = "1";

    /* renamed from: X, reason: collision with root package name */
    static final long f25422X = -1;

    /* renamed from: Y, reason: collision with root package name */
    private static final String f25423Y = "CLEAN";

    /* renamed from: Z, reason: collision with root package name */
    private static final String f25424Z = "DIRTY";

    /* renamed from: a0, reason: collision with root package name */
    private static final String f25425a0 = "REMOVE";

    /* renamed from: b0, reason: collision with root package name */
    private static final String f25426b0 = "READ";

    /* renamed from: E, reason: collision with root package name */
    private final File f25427E;

    /* renamed from: F, reason: collision with root package name */
    private final File f25428F;

    /* renamed from: G, reason: collision with root package name */
    private final File f25429G;

    /* renamed from: H, reason: collision with root package name */
    private final File f25430H;

    /* renamed from: I, reason: collision with root package name */
    private final int f25431I;

    /* renamed from: J, reason: collision with root package name */
    private long f25432J;

    /* renamed from: K, reason: collision with root package name */
    private final int f25433K;

    /* renamed from: M, reason: collision with root package name */
    private Writer f25435M;

    /* renamed from: O, reason: collision with root package name */
    private int f25437O;

    /* renamed from: L, reason: collision with root package name */
    private long f25434L = 0;

    /* renamed from: N, reason: collision with root package name */
    private final LinkedHashMap<String, d> f25436N = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: P, reason: collision with root package name */
    private long f25438P = 0;

    /* renamed from: Q, reason: collision with root package name */
    final ThreadPoolExecutor f25439Q = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0220b(null));

    /* renamed from: R, reason: collision with root package name */
    private final Callable<Void> f25440R = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                try {
                    if (b.this.f25435M != null) {
                        b.this.F0();
                        if (b.this.a0()) {
                            b.this.x0();
                            b.this.f25437O = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class ThreadFactoryC0220b implements ThreadFactory {
        private ThreadFactoryC0220b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC0220b(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f25442a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f25443b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f25444c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        private InputStream h(int i4) throws IOException {
            synchronized (b.this) {
                if (this.f25442a.f25451f == this) {
                    if (!this.f25442a.f25450e) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.f25442a.j(i4));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public void a() throws IOException {
            b.this.t(this, false);
        }

        public void b() {
            if (!this.f25444c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() throws IOException {
            b.this.t(this, true);
            this.f25444c = true;
        }

        public File f(int i4) throws IOException {
            File k4;
            synchronized (b.this) {
                try {
                    if (this.f25442a.f25451f == this) {
                        if (!this.f25442a.f25450e) {
                            this.f25443b[i4] = true;
                        }
                        k4 = this.f25442a.k(i4);
                        b.this.f25427E.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k4;
        }

        public String g(int i4) throws IOException {
            InputStream h4 = h(i4);
            if (h4 != null) {
                return b.V(h4);
            }
            return null;
        }

        public void i(int i4, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i4)), com.bumptech.glide.disklrucache.d.f25468b);
                try {
                    outputStreamWriter2.write(str);
                    com.bumptech.glide.disklrucache.d.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    com.bumptech.glide.disklrucache.d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private c(d dVar) {
            this.f25442a = dVar;
            this.f25443b = dVar.f25450e ? null : new boolean[b.this.f25433K];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25446a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f25447b;

        /* renamed from: c, reason: collision with root package name */
        File[] f25448c;

        /* renamed from: d, reason: collision with root package name */
        File[] f25449d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f25450e;

        /* renamed from: f, reason: collision with root package name */
        private c f25451f;

        /* renamed from: g, reason: collision with root package name */
        private long f25452g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length == b.this.f25433K) {
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    try {
                        this.f25447b[i4] = Long.parseLong(strArr[i4]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i4) {
            return this.f25448c[i4];
        }

        public File k(int i4) {
            return this.f25449d[i4];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j4 : this.f25447b) {
                sb.append(' ');
                sb.append(j4);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f25446a = str;
            this.f25447b = new long[b.this.f25433K];
            this.f25448c = new File[b.this.f25433K];
            this.f25449d = new File[b.this.f25433K];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i4 = 0; i4 < b.this.f25433K; i4++) {
                sb.append(i4);
                this.f25448c[i4] = new File(b.this.f25427E, sb.toString());
                sb.append(".tmp");
                this.f25449d[i4] = new File(b.this.f25427E, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f25454a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25455b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f25456c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f25457d;

        /* synthetic */ e(b bVar, String str, long j4, File[] fileArr, long[] jArr, a aVar) {
            this(str, j4, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.D(this.f25454a, this.f25455b);
        }

        public File b(int i4) {
            return this.f25457d[i4];
        }

        public long c(int i4) {
            return this.f25456c[i4];
        }

        public String d(int i4) throws IOException {
            return b.V(new FileInputStream(this.f25457d[i4]));
        }

        private e(String str, long j4, File[] fileArr, long[] jArr) {
            this.f25454a = str;
            this.f25455b = j4;
            this.f25457d = fileArr;
            this.f25456c = jArr;
        }
    }

    private b(File file, int i4, int i5, long j4) {
        this.f25427E = file;
        this.f25431I = i4;
        this.f25428F = new File(file, f25417S);
        this.f25429G = new File(file, f25418T);
        this.f25430H = new File(file, f25419U);
        this.f25433K = i5;
        this.f25432J = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c D(String str, long j4) throws IOException {
        n();
        d dVar = this.f25436N.get(str);
        a aVar = null;
        if (j4 != -1 && (dVar == null || dVar.f25452g != j4)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f25436N.put(str, dVar);
        } else if (dVar.f25451f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f25451f = cVar;
        this.f25435M.append((CharSequence) f25424Z);
        this.f25435M.append(' ');
        this.f25435M.append((CharSequence) str);
        this.f25435M.append('\n');
        F(this.f25435M);
        return cVar;
    }

    @TargetApi(26)
    private static void F(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() throws IOException {
        while (this.f25434L > this.f25432J) {
            y0(this.f25436N.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String V(InputStream inputStream) throws IOException {
        return com.bumptech.glide.disklrucache.d.c(new InputStreamReader(inputStream, com.bumptech.glide.disklrucache.d.f25468b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a0() {
        int i4 = this.f25437O;
        if (i4 >= 2000 && i4 >= this.f25436N.size()) {
            return true;
        }
        return false;
    }

    public static b c0(File file, int i4, int i5, long j4) throws IOException {
        if (j4 > 0) {
            if (i5 > 0) {
                File file2 = new File(file, f25419U);
                if (file2.exists()) {
                    File file3 = new File(file, f25417S);
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        z0(file2, file3, false);
                    }
                }
                b bVar = new b(file, i4, i5, j4);
                if (bVar.f25428F.exists()) {
                    try {
                        bVar.i0();
                        bVar.e0();
                        return bVar;
                    } catch (IOException e4) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e4.getMessage() + ", removing");
                        bVar.v();
                    }
                }
                file.mkdirs();
                b bVar2 = new b(file, i4, i5, j4);
                bVar2.x0();
                return bVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void e0() throws IOException {
        z(this.f25429G);
        Iterator<d> it = this.f25436N.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i4 = 0;
            if (next.f25451f != null) {
                next.f25451f = null;
                while (i4 < this.f25433K) {
                    z(next.j(i4));
                    z(next.k(i4));
                    i4++;
                }
                it.remove();
            } else {
                while (i4 < this.f25433K) {
                    this.f25434L += next.f25447b[i4];
                    i4++;
                }
            }
        }
    }

    private void i0() throws IOException {
        com.bumptech.glide.disklrucache.c cVar = new com.bumptech.glide.disklrucache.c(new FileInputStream(this.f25428F), com.bumptech.glide.disklrucache.d.f25467a);
        try {
            String d4 = cVar.d();
            String d5 = cVar.d();
            String d6 = cVar.d();
            String d7 = cVar.d();
            String d8 = cVar.d();
            if (f25420V.equals(d4) && "1".equals(d5) && Integer.toString(this.f25431I).equals(d6) && Integer.toString(this.f25433K).equals(d7) && "".equals(d8)) {
                int i4 = 0;
                while (true) {
                    try {
                        u0(cVar.d());
                        i4++;
                    } catch (EOFException unused) {
                        this.f25437O = i4 - this.f25436N.size();
                        if (cVar.c()) {
                            x0();
                        } else {
                            this.f25435M = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25428F, true), com.bumptech.glide.disklrucache.d.f25467a));
                        }
                        com.bumptech.glide.disklrucache.d.a(cVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + d4 + ", " + d5 + ", " + d7 + ", " + d8 + "]");
            }
        } catch (Throwable th) {
            com.bumptech.glide.disklrucache.d.a(cVar);
            throw th;
        }
    }

    private void n() {
        if (this.f25435M != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void p(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void t(c cVar, boolean z3) throws IOException {
        d dVar = cVar.f25442a;
        if (dVar.f25451f == cVar) {
            if (z3 && !dVar.f25450e) {
                for (int i4 = 0; i4 < this.f25433K; i4++) {
                    if (cVar.f25443b[i4]) {
                        if (!dVar.k(i4).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i4);
                    }
                }
            }
            for (int i5 = 0; i5 < this.f25433K; i5++) {
                File k4 = dVar.k(i5);
                if (z3) {
                    if (k4.exists()) {
                        File j4 = dVar.j(i5);
                        k4.renameTo(j4);
                        long j5 = dVar.f25447b[i5];
                        long length = j4.length();
                        dVar.f25447b[i5] = length;
                        this.f25434L = (this.f25434L - j5) + length;
                    }
                } else {
                    z(k4);
                }
            }
            this.f25437O++;
            dVar.f25451f = null;
            if (dVar.f25450e | z3) {
                dVar.f25450e = true;
                this.f25435M.append((CharSequence) f25423Y);
                this.f25435M.append(' ');
                this.f25435M.append((CharSequence) dVar.f25446a);
                this.f25435M.append((CharSequence) dVar.l());
                this.f25435M.append('\n');
                if (z3) {
                    long j6 = this.f25438P;
                    this.f25438P = 1 + j6;
                    dVar.f25452g = j6;
                }
            } else {
                this.f25436N.remove(dVar.f25446a);
                this.f25435M.append((CharSequence) f25425a0);
                this.f25435M.append(' ');
                this.f25435M.append((CharSequence) dVar.f25446a);
                this.f25435M.append('\n');
            }
            F(this.f25435M);
            if (this.f25434L > this.f25432J || a0()) {
                this.f25439Q.submit(this.f25440R);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private void u0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i4 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i4);
            if (indexOf2 == -1) {
                substring = str.substring(i4);
                if (indexOf == 6 && str.startsWith(f25425a0)) {
                    this.f25436N.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i4, indexOf2);
            }
            d dVar = this.f25436N.get(substring);
            a aVar = null;
            if (dVar == null) {
                dVar = new d(this, substring, aVar);
                this.f25436N.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f25423Y)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f25450e = true;
                dVar.f25451f = null;
                dVar.n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f25424Z)) {
                dVar.f25451f = new c(this, dVar, aVar);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith(f25426b0)) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void x0() throws IOException {
        try {
            Writer writer = this.f25435M;
            if (writer != null) {
                p(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25429G), com.bumptech.glide.disklrucache.d.f25467a));
            try {
                bufferedWriter.write(f25420V);
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f25431I));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f25433K));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f25436N.values()) {
                    if (dVar.f25451f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f25446a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f25446a + dVar.l() + '\n');
                    }
                }
                p(bufferedWriter);
                if (this.f25428F.exists()) {
                    z0(this.f25428F, this.f25430H, true);
                }
                z0(this.f25429G, this.f25428F, false);
                this.f25430H.delete();
                this.f25435M = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25428F, true), com.bumptech.glide.disklrucache.d.f25467a));
            } catch (Throwable th) {
                p(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void z(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void z0(File file, File file2, boolean z3) throws IOException {
        if (z3) {
            z(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public c A(String str) throws IOException {
        return D(str, -1L);
    }

    public synchronized void B0(long j4) {
        this.f25432J = j4;
        this.f25439Q.submit(this.f25440R);
    }

    public synchronized long E0() {
        return this.f25434L;
    }

    public synchronized e G(String str) throws IOException {
        n();
        d dVar = this.f25436N.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f25450e) {
            return null;
        }
        for (File file : dVar.f25448c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f25437O++;
        this.f25435M.append((CharSequence) f25426b0);
        this.f25435M.append(' ');
        this.f25435M.append((CharSequence) str);
        this.f25435M.append('\n');
        if (a0()) {
            this.f25439Q.submit(this.f25440R);
        }
        return new e(this, str, dVar.f25452g, dVar.f25448c, dVar.f25447b, null);
    }

    public File H() {
        return this.f25427E;
    }

    public synchronized long P() {
        return this.f25432J;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f25435M == null) {
                return;
            }
            Iterator it = new ArrayList(this.f25436N.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f25451f != null) {
                    dVar.f25451f.a();
                }
            }
            F0();
            p(this.f25435M);
            this.f25435M = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        n();
        F0();
        F(this.f25435M);
    }

    public synchronized boolean isClosed() {
        boolean z3;
        if (this.f25435M == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return z3;
    }

    public void v() throws IOException {
        close();
        com.bumptech.glide.disklrucache.d.b(this.f25427E);
    }

    public synchronized boolean y0(String str) throws IOException {
        try {
            n();
            d dVar = this.f25436N.get(str);
            if (dVar != null && dVar.f25451f == null) {
                for (int i4 = 0; i4 < this.f25433K; i4++) {
                    File j4 = dVar.j(i4);
                    if (j4.exists() && !j4.delete()) {
                        throw new IOException("failed to delete " + j4);
                    }
                    this.f25434L -= dVar.f25447b[i4];
                    dVar.f25447b[i4] = 0;
                }
                this.f25437O++;
                this.f25435M.append((CharSequence) f25425a0);
                this.f25435M.append(' ');
                this.f25435M.append((CharSequence) str);
                this.f25435M.append('\n');
                this.f25436N.remove(str);
                if (a0()) {
                    this.f25439Q.submit(this.f25440R);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
