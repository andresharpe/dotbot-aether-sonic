package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
class w implements C {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final File f35200a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    private final String f35201b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    private final String f35202c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N File file) {
        this.f35201b = str;
        this.f35202c = str2;
        this.f35200a = file;
    }

    @androidx.annotation.P
    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream b4 = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (b4 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (b4 != null) {
                            b4.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = b4.read(bArr);
                            if (read > 0) {
                                gZIPOutputStream.write(bArr, 0, read);
                            } else {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                b4.close();
                                return byteArray;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.C
    @androidx.annotation.N
    public String a() {
        return this.f35202c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.C
    @androidx.annotation.P
    public InputStream b() {
        if (this.f35200a.exists() && this.f35200a.isFile()) {
            try {
                return new FileInputStream(this.f35200a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.C
    @androidx.annotation.P
    public CrashlyticsReport.e.b c() {
        byte[] d4 = d();
        if (d4 != null) {
            return CrashlyticsReport.e.b.a().b(d4).c(this.f35201b).a();
        }
        return null;
    }
}
