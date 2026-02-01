package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final d f21810a;

    public f(@N d dVar) {
        this.f21810a = dVar;
    }

    private static String c(String str, FileExtension fileExtension, boolean z3) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z3) {
            str2 = fileExtension.b();
        } else {
            str2 = fileExtension.extension;
        }
        sb.append(str2);
        return sb.toString();
    }

    @P
    private File d(String str) throws FileNotFoundException {
        File file = new File(e(), c(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), c(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File e() {
        File a4 = this.f21810a.a();
        if (a4.isFile()) {
            a4.delete();
        }
        if (!a4.exists()) {
            a4.mkdirs();
        }
        return a4;
    }

    public void a() {
        File e4 = e();
        if (e4.exists()) {
            File[] listFiles = e4.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : e4.listFiles()) {
                    file.delete();
                }
            }
            e4.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    @j0
    public Pair<FileExtension, InputStream> b(String str) {
        FileExtension fileExtension;
        try {
            File d4 = d(str);
            if (d4 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d4);
            if (d4.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            com.airbnb.lottie.utils.f.a("Cache hit for " + str + " at " + d4.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(String str, FileExtension fileExtension) {
        File file = new File(e(), c(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        com.airbnb.lottie.utils.f.a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            com.airbnb.lottie.utils.f.e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File g(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(e(), c(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
