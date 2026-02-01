package org.junit.rules;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class j extends e {

    /* renamed from: d, reason: collision with root package name */
    private static final int f55682d = 10000;

    /* renamed from: e, reason: collision with root package name */
    private static final String f55683e = "junit";

    /* renamed from: a, reason: collision with root package name */
    private final File f55684a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55685b;

    /* renamed from: c, reason: collision with root package name */
    private File f55686c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private File f55687a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f55688b;

        protected a() {
        }

        public a c() {
            this.f55688b = true;
            return this;
        }

        public j d() {
            return new j(this);
        }

        public a e(File file) {
            this.f55687a = file;
            return this;
        }
    }

    public j() {
        this((File) null);
    }

    public static a e() {
        return new a();
    }

    private static File g(File file) throws IOException {
        try {
            return i(file);
        } catch (ClassNotFoundException unused) {
            return h(file);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                IOException iOException = new IOException("Failed to create temporary folder in " + file);
                iOException.initCause(cause);
                throw iOException;
            }
            throw ((IOException) cause);
        } catch (Exception e5) {
            throw new RuntimeException("Failed to create temporary folder in " + file, e5);
        }
    }

    private static File h(File file) throws IOException {
        File file2 = null;
        int i4 = 0;
        while (i4 < 10000) {
            File createTempFile = File.createTempFile(f55683e, ".tmp", file);
            File file3 = new File(createTempFile.toString().substring(0, r3.length() - 4));
            if (file3.mkdir()) {
                createTempFile.delete();
                return file3;
            }
            createTempFile.delete();
            i4++;
            file2 = file3;
        }
        throw new IOException("Unable to create temporary directory in: " + file.toString() + ". Tried 10000 times. Last attempted to create: " + file2.toString());
    }

    private static File i(File file) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object invoke;
        Class<?> cls = Class.forName("java.nio.file.Files");
        Object newInstance = Array.newInstance(Class.forName("java.nio.file.attribute.FileAttribute"), 0);
        Class<?> cls2 = Class.forName("java.nio.file.Path");
        if (file != null) {
            invoke = cls.getDeclaredMethod("createTempDirectory", cls2, String.class, newInstance.getClass()).invoke(null, File.class.getDeclaredMethod("toPath", new Class[0]).invoke(file, new Object[0]), f55683e, newInstance);
        } else {
            invoke = cls.getDeclaredMethod("createTempDirectory", String.class, newInstance.getClass()).invoke(null, f55683e, newInstance);
        }
        return (File) cls2.getDeclaredMethod("toFile", new Class[0]).invoke(invoke, new Object[0]);
    }

    private boolean q(File file) {
        if (file.delete()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!q(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private boolean r() {
        File file = this.f55686c;
        if (file == null) {
            return true;
        }
        return q(file);
    }

    @Override // org.junit.rules.e
    protected void b() {
        j();
    }

    @Override // org.junit.rules.e
    protected void c() throws Throwable {
        f();
    }

    public void f() throws IOException {
        this.f55686c = g(this.f55684a);
    }

    public void j() {
        if (!r() && this.f55685b) {
            org.junit.c.g0("Unable to clean up temporary folder " + this.f55686c);
        }
    }

    public File k() {
        File file = this.f55686c;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public File l() throws IOException {
        return File.createTempFile(f55683e, null, k());
    }

    public File m(String str) throws IOException {
        File file = new File(k(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException("a file with the name '" + str + "' already exists in the test folder");
    }

    public File n() throws IOException {
        return g(k());
    }

    public File o(String str) throws IOException {
        return p(str);
    }

    public File p(String... strArr) throws IOException {
        if (strArr.length != 0) {
            File k4 = k();
            int i4 = 0;
            for (String str : strArr) {
                if (new File(str).isAbsolute()) {
                    throw new IOException("folder path '" + str + "' is not a relative path");
                }
            }
            int length = strArr.length;
            boolean z3 = true;
            File file = null;
            File file2 = k4;
            while (i4 < length) {
                File file3 = new File(file, strArr[i4]);
                File file4 = new File(k4, file3.getPath());
                boolean mkdirs = file4.mkdirs();
                if (!mkdirs && !file4.isDirectory()) {
                    if (file4.exists()) {
                        throw new IOException("a file with the path '" + file3.getPath() + "' exists");
                    }
                    throw new IOException("could not create a folder with the path '" + file3.getPath() + "'");
                }
                i4++;
                file2 = file4;
                z3 = mkdirs;
                file = file3;
            }
            if (z3) {
                return file2;
            }
            throw new IOException("a folder with the path '" + file.getPath() + "' already exists");
        }
        throw new IllegalArgumentException("must pass at least one path");
    }

    public j(File file) {
        this.f55684a = file;
        this.f55685b = false;
    }

    protected j(a aVar) {
        this.f55684a = aVar.f55687a;
        this.f55685b = aVar.f55688b;
    }
}
