package androidx.core.util;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.core.util.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0762c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f13013d = "AtomicFile";

    /* renamed from: a, reason: collision with root package name */
    private final File f13014a;

    /* renamed from: b, reason: collision with root package name */
    private final File f13015b;

    /* renamed from: c, reason: collision with root package name */
    private final File f13016c;

    public C0762c(@N File file) {
        this.f13014a = file;
        this.f13015b = new File(file.getPath() + ".new");
        this.f13016c = new File(file.getPath() + ".bak");
    }

    private static void g(@N File file, @N File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f13013d, "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e(f13013d, "Failed to rename " + file + " to " + file2);
        }
    }

    private static boolean i(@N FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f13014a.delete();
        this.f13015b.delete();
        this.f13016c.delete();
    }

    public void b(@P FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f13013d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            Log.e(f13013d, "Failed to close file output stream", e4);
        }
        if (!this.f13015b.delete()) {
            Log.e(f13013d, "Failed to delete new file " + this.f13015b);
        }
    }

    public void c(@P FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f13013d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            Log.e(f13013d, "Failed to close file output stream", e4);
        }
        g(this.f13015b, this.f13014a);
    }

    @N
    public File d() {
        return this.f13014a;
    }

    @N
    public FileInputStream e() throws FileNotFoundException {
        if (this.f13016c.exists()) {
            g(this.f13016c, this.f13014a);
        }
        if (this.f13015b.exists() && this.f13014a.exists() && !this.f13015b.delete()) {
            Log.e(f13013d, "Failed to delete outdated new file " + this.f13015b);
        }
        return new FileInputStream(this.f13014a);
    }

    @N
    public byte[] f() throws IOException {
        FileInputStream e4 = e();
        try {
            byte[] bArr = new byte[e4.available()];
            int i4 = 0;
            while (true) {
                int read = e4.read(bArr, i4, bArr.length - i4);
                if (read <= 0) {
                    return bArr;
                }
                i4 += read;
                int available = e4.available();
                if (available > bArr.length - i4) {
                    byte[] bArr2 = new byte[available + i4];
                    System.arraycopy(bArr, 0, bArr2, 0, i4);
                    bArr = bArr2;
                }
            }
        } finally {
            e4.close();
        }
    }

    @N
    public FileOutputStream h() throws IOException {
        if (this.f13016c.exists()) {
            g(this.f13016c, this.f13014a);
        }
        try {
            return new FileOutputStream(this.f13015b);
        } catch (FileNotFoundException unused) {
            if (this.f13015b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f13015b);
                } catch (FileNotFoundException e4) {
                    throw new IOException("Failed to create new file " + this.f13015b, e4);
                }
            }
            throw new IOException("Failed to create directory for " + this.f13015b);
        }
    }
}
