package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.i0;
import com.android.volley.e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements com.android.volley.e {

    /* renamed from: e, reason: collision with root package name */
    private static final int f24593e = 5242880;

    /* renamed from: f, reason: collision with root package name */
    @i0
    static final float f24594f = 0.9f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f24595g = 538247942;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f24596a;

    /* renamed from: b, reason: collision with root package name */
    private long f24597b;

    /* renamed from: c, reason: collision with root package name */
    private final d f24598c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24599d;

    /* loaded from: classes.dex */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f24600a;

        a(File file) {
            this.f24600a = file;
        }

        @Override // com.android.volley.toolbox.j.d
        public File get() {
            return this.f24600a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        File get();
    }

    public j(File file, int i4) {
        this.f24596a = new LinkedHashMap(16, 0.75f, true);
        this.f24597b = 0L;
        this.f24598c = new a(file);
        this.f24599d = i4;
    }

    private String i(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void j() {
        if (!this.f24598c.get().exists()) {
            com.android.volley.s.b("Re-initializing cache after external clearing.", new Object[0]);
            this.f24596a.clear();
            this.f24597b = 0L;
            b();
        }
    }

    private void k() {
        if (this.f24597b < this.f24599d) {
            return;
        }
        int i4 = 0;
        if (com.android.volley.s.f24525b) {
            com.android.volley.s.f("Pruning old cache entries.", new Object[0]);
        }
        long j4 = this.f24597b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, b>> it = this.f24596a.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (h(value.f24603b).delete()) {
                this.f24597b -= value.f24602a;
            } else {
                String str = value.f24603b;
                com.android.volley.s.b("Could not delete cache entry for key=%s, filename=%s", str, i(str));
            }
            it.remove();
            i4++;
            if (((float) this.f24597b) < this.f24599d * f24594f) {
                break;
            }
        }
        if (com.android.volley.s.f24525b) {
            com.android.volley.s.f("pruned %d files, %d bytes, %d ms", Integer.valueOf(i4), Long.valueOf(this.f24597b - j4), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void l(String str, b bVar) {
        if (!this.f24596a.containsKey(str)) {
            this.f24597b += bVar.f24602a;
        } else {
            this.f24597b += bVar.f24602a - this.f24596a.get(str).f24602a;
        }
        this.f24596a.put(str, bVar);
    }

    private static int m(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static List<com.android.volley.i> n(c cVar) throws IOException {
        List<com.android.volley.i> arrayList;
        int o4 = o(cVar);
        if (o4 >= 0) {
            if (o4 == 0) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
            }
            for (int i4 = 0; i4 < o4; i4++) {
                arrayList.add(new com.android.volley.i(q(cVar).intern(), q(cVar).intern()));
            }
            return arrayList;
        }
        throw new IOException("readHeaderList size=" + o4);
    }

    static int o(InputStream inputStream) throws IOException {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    static long p(InputStream inputStream) throws IOException {
        return (m(inputStream) & 255) | ((m(inputStream) & 255) << 8) | ((m(inputStream) & 255) << 16) | ((m(inputStream) & 255) << 24) | ((m(inputStream) & 255) << 32) | ((m(inputStream) & 255) << 40) | ((m(inputStream) & 255) << 48) | ((255 & m(inputStream)) << 56);
    }

    static String q(c cVar) throws IOException {
        return new String(s(cVar, p(cVar)), "UTF-8");
    }

    private void r(String str) {
        b remove = this.f24596a.remove(str);
        if (remove != null) {
            this.f24597b -= remove.f24602a;
        }
    }

    @i0
    static byte[] s(c cVar, long j4) throws IOException {
        long b4 = cVar.b();
        if (j4 >= 0 && j4 <= b4) {
            int i4 = (int) j4;
            if (i4 == j4) {
                byte[] bArr = new byte[i4];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j4 + ", maxLength=" + b4);
    }

    static void t(List<com.android.volley.i> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            u(outputStream, list.size());
            for (com.android.volley.i iVar : list) {
                w(outputStream, iVar.a());
                w(outputStream, iVar.b());
            }
            return;
        }
        u(outputStream, 0);
    }

    static void u(OutputStream outputStream, int i4) throws IOException {
        outputStream.write(i4 & 255);
        outputStream.write((i4 >> 8) & 255);
        outputStream.write((i4 >> 16) & 255);
        outputStream.write((i4 >> 24) & 255);
    }

    static void v(OutputStream outputStream, long j4) throws IOException {
        outputStream.write((byte) j4);
        outputStream.write((byte) (j4 >>> 8));
        outputStream.write((byte) (j4 >>> 16));
        outputStream.write((byte) (j4 >>> 24));
        outputStream.write((byte) (j4 >>> 32));
        outputStream.write((byte) (j4 >>> 40));
        outputStream.write((byte) (j4 >>> 48));
        outputStream.write((byte) (j4 >>> 56));
    }

    static void w(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        v(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.e
    public synchronized e.a a(String str) {
        b bVar = this.f24596a.get(str);
        if (bVar == null) {
            return null;
        }
        File h4 = h(str);
        try {
            c cVar = new c(new BufferedInputStream(f(h4)), h4.length());
            try {
                b b4 = b.b(cVar);
                if (!TextUtils.equals(str, b4.f24603b)) {
                    com.android.volley.s.b("%s: key=%s, found=%s", h4.getAbsolutePath(), str, b4.f24603b);
                    r(str);
                    return null;
                }
                return bVar.c(s(cVar, cVar.b()));
            } finally {
                cVar.close();
            }
        } catch (IOException e4) {
            com.android.volley.s.b("%s: %s", h4.getAbsolutePath(), e4.toString());
            e(str);
            return null;
        }
    }

    @Override // com.android.volley.e
    public synchronized void b() {
        long length;
        c cVar;
        File file = this.f24598c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                com.android.volley.s.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                length = file2.length();
                cVar = new c(new BufferedInputStream(f(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                b b4 = b.b(cVar);
                b4.f24602a = length;
                l(b4.f24603b, b4);
                cVar.close();
            } catch (Throwable th) {
                cVar.close();
                throw th;
                break;
            }
        }
    }

    @Override // com.android.volley.e
    public synchronized void c(String str, boolean z3) {
        try {
            e.a a4 = a(str);
            if (a4 != null) {
                a4.f24461f = 0L;
                if (z3) {
                    a4.f24460e = 0L;
                }
                d(str, a4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.e
    public synchronized void clear() {
        try {
            File[] listFiles = this.f24598c.get().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            this.f24596a.clear();
            this.f24597b = 0L;
            com.android.volley.s.b("Cache cleared.", new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.e
    public synchronized void d(String str, e.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j4 = this.f24597b;
        byte[] bArr = aVar.f24456a;
        long length = j4 + bArr.length;
        int i4 = this.f24599d;
        if (length > i4 && bArr.length > i4 * f24594f) {
            return;
        }
        File h4 = h(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(g(h4));
            bVar = new b(str, aVar);
        } catch (IOException unused) {
            if (!h4.delete()) {
                com.android.volley.s.b("Could not clean up file %s", h4.getAbsolutePath());
            }
            j();
        }
        if (bVar.d(bufferedOutputStream)) {
            bufferedOutputStream.write(aVar.f24456a);
            bufferedOutputStream.close();
            bVar.f24602a = h4.length();
            l(str, bVar);
            k();
            return;
        }
        bufferedOutputStream.close();
        com.android.volley.s.b("Failed to write header for %s", h4.getAbsolutePath());
        throw new IOException();
    }

    @Override // com.android.volley.e
    public synchronized void e(String str) {
        boolean delete = h(str).delete();
        r(str);
        if (!delete) {
            com.android.volley.s.b("Could not delete cache entry for key=%s, filename=%s", str, i(str));
        }
    }

    @i0
    InputStream f(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @i0
    OutputStream g(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    public File h(String str) {
        return new File(this.f24598c.get(), i(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class c extends FilterInputStream {

        /* renamed from: E, reason: collision with root package name */
        private final long f24610E;

        /* renamed from: F, reason: collision with root package name */
        private long f24611F;

        c(InputStream inputStream, long j4) {
            super(inputStream);
            this.f24610E = j4;
        }

        @i0
        long a() {
            return this.f24611F;
        }

        long b() {
            return this.f24610E - this.f24611F;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f24611F++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            int read = super.read(bArr, i4, i5);
            if (read != -1) {
                this.f24611F += read;
            }
            return read;
        }
    }

    public j(d dVar, int i4) {
        this.f24596a = new LinkedHashMap(16, 0.75f, true);
        this.f24597b = 0L;
        this.f24598c = dVar;
        this.f24599d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        long f24602a;

        /* renamed from: b, reason: collision with root package name */
        final String f24603b;

        /* renamed from: c, reason: collision with root package name */
        final String f24604c;

        /* renamed from: d, reason: collision with root package name */
        final long f24605d;

        /* renamed from: e, reason: collision with root package name */
        final long f24606e;

        /* renamed from: f, reason: collision with root package name */
        final long f24607f;

        /* renamed from: g, reason: collision with root package name */
        final long f24608g;

        /* renamed from: h, reason: collision with root package name */
        final List<com.android.volley.i> f24609h;

        private b(String str, String str2, long j4, long j5, long j6, long j7, List<com.android.volley.i> list) {
            this.f24603b = str;
            this.f24604c = "".equals(str2) ? null : str2;
            this.f24605d = j4;
            this.f24606e = j5;
            this.f24607f = j6;
            this.f24608g = j7;
            this.f24609h = list;
        }

        private static List<com.android.volley.i> a(e.a aVar) {
            List<com.android.volley.i> list = aVar.f24463h;
            if (list != null) {
                return list;
            }
            return m.i(aVar.f24462g);
        }

        static b b(c cVar) throws IOException {
            if (j.o(cVar) == j.f24595g) {
                return new b(j.q(cVar), j.q(cVar), j.p(cVar), j.p(cVar), j.p(cVar), j.p(cVar), j.n(cVar));
            }
            throw new IOException();
        }

        e.a c(byte[] bArr) {
            e.a aVar = new e.a();
            aVar.f24456a = bArr;
            aVar.f24457b = this.f24604c;
            aVar.f24458c = this.f24605d;
            aVar.f24459d = this.f24606e;
            aVar.f24460e = this.f24607f;
            aVar.f24461f = this.f24608g;
            aVar.f24462g = m.j(this.f24609h);
            aVar.f24463h = Collections.unmodifiableList(this.f24609h);
            return aVar;
        }

        boolean d(OutputStream outputStream) {
            try {
                j.u(outputStream, j.f24595g);
                j.w(outputStream, this.f24603b);
                String str = this.f24604c;
                if (str == null) {
                    str = "";
                }
                j.w(outputStream, str);
                j.v(outputStream, this.f24605d);
                j.v(outputStream, this.f24606e);
                j.v(outputStream, this.f24607f);
                j.v(outputStream, this.f24608g);
                j.t(this.f24609h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e4) {
                com.android.volley.s.b("%s", e4.toString());
                return false;
            }
        }

        b(String str, e.a aVar) {
            this(str, aVar.f24457b, aVar.f24458c, aVar.f24459d, aVar.f24460e, aVar.f24461f, a(aVar));
        }
    }

    public j(File file) {
        this(file, f24593e);
    }

    public j(d dVar) {
        this(dVar, f24593e);
    }
}
