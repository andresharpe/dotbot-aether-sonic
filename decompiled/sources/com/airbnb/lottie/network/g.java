package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.j0;
import com.airbnb.lottie.p;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final f f21811a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final e f21812b;

    public g(@N f fVar, @N e eVar) {
        this.f21811a = fVar;
        this.f21812b = eVar;
    }

    @P
    @j0
    private com.airbnb.lottie.g a(@N String str, @P String str2) {
        Pair<FileExtension, InputStream> b4;
        p<com.airbnb.lottie.g> k4;
        if (str2 == null || (b4 = this.f21811a.b(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) b4.first;
        InputStream inputStream = (InputStream) b4.second;
        if (fileExtension == FileExtension.ZIP) {
            k4 = com.airbnb.lottie.h.B(new ZipInputStream(inputStream), str);
        } else {
            k4 = com.airbnb.lottie.h.k(inputStream, str);
        }
        if (k4.b() == null) {
            return null;
        }
        return k4.b();
    }

    @j0
    @N
    private p<com.airbnb.lottie.g> b(@N String str, @P String str2) {
        boolean z3;
        com.airbnb.lottie.utils.f.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                c a4 = this.f21812b.a(str);
                if (a4.l()) {
                    p<com.airbnb.lottie.g> d4 = d(str, a4.o0(), a4.f0(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    if (d4.b() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sb.append(z3);
                    com.airbnb.lottie.utils.f.a(sb.toString());
                    try {
                        a4.close();
                    } catch (IOException e4) {
                        com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e4);
                    }
                    return d4;
                }
                p<com.airbnb.lottie.g> pVar = new p<>(new IllegalArgumentException(a4.h0()));
                try {
                    a4.close();
                } catch (IOException e5) {
                    com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e5);
                }
                return pVar;
            } catch (Exception e6) {
                p<com.airbnb.lottie.g> pVar2 = new p<>(e6);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e7) {
                        com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e7);
                    }
                }
                return pVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e8) {
                    com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e8);
                }
            }
            throw th;
        }
    }

    @N
    private p<com.airbnb.lottie.g> d(@N String str, @N InputStream inputStream, @P String str2, @P String str3) throws IOException {
        FileExtension fileExtension;
        p<com.airbnb.lottie.g> f4;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.f.a("Received json response.");
            fileExtension = FileExtension.JSON;
            f4 = e(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.f.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            f4 = f(str, inputStream, str3);
        }
        if (str3 != null && f4.b() != null) {
            this.f21811a.f(str, fileExtension);
        }
        return f4;
    }

    @N
    private p<com.airbnb.lottie.g> e(@N String str, @N InputStream inputStream, @P String str2) throws IOException {
        if (str2 == null) {
            return com.airbnb.lottie.h.k(inputStream, null);
        }
        return com.airbnb.lottie.h.k(new FileInputStream(this.f21811a.g(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    @N
    private p<com.airbnb.lottie.g> f(@N String str, @N InputStream inputStream, @P String str2) throws IOException {
        if (str2 == null) {
            return com.airbnb.lottie.h.B(new ZipInputStream(inputStream), null);
        }
        return com.airbnb.lottie.h.B(new ZipInputStream(new FileInputStream(this.f21811a.g(str, inputStream, FileExtension.ZIP))), str);
    }

    @j0
    @N
    public p<com.airbnb.lottie.g> c(@N String str, @P String str2) {
        com.airbnb.lottie.g a4 = a(str, str2);
        if (a4 != null) {
            return new p<>(a4);
        }
        com.airbnb.lottie.utils.f.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
