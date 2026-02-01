package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1797e implements C {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private final byte[] f35042a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    private final String f35043b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    private final String f35044c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1797e(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.P byte[] bArr) {
        this.f35043b = str;
        this.f35044c = str2;
        this.f35042a = bArr;
    }

    @androidx.annotation.P
    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f35042a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f35042a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.common.C
    @androidx.annotation.N
    public String a() {
        return this.f35044c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.C
    @androidx.annotation.P
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f35042a);
    }

    @Override // com.google.firebase.crashlytics.internal.common.C
    @androidx.annotation.P
    public CrashlyticsReport.e.b c() {
        byte[] d4 = d();
        if (d4 == null) {
            return null;
        }
        return CrashlyticsReport.e.b.a().b(d4).c(this.f35043b).a();
    }
}
