package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import java.net.URL;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@androidx.annotation.j0
/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1705q3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final URL f30928E;

    /* renamed from: F, reason: collision with root package name */
    private final String f30929F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1710r3 f30930G;

    /* renamed from: H, reason: collision with root package name */
    private final C1626d2 f30931H;

    public RunnableC1705q3(C1710r3 c1710r3, String str, URL url, byte[] bArr, Map map, C1626d2 c1626d2, byte[] bArr2) {
        this.f30930G = c1710r3;
        C1285y.h(str);
        C1285y.l(url);
        C1285y.l(c1626d2);
        this.f30928E = url;
        this.f30931H = c1626d2;
        this.f30929F = str;
    }

    private final void b(final int i4, final Exception exc, final byte[] bArr, final Map map) {
        this.f30930G.f31060a.a().x(new Runnable() { // from class: com.google.android.gms.measurement.internal.p3
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC1705q3.this.a(i4, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i4, Exception exc, byte[] bArr, Map map) {
        C1626d2 c1626d2 = this.f30931H;
        c1626d2.f30585a.f(this.f30929F, i4, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.q3] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.r3 r0 = r10.f30930G
            r0.e()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.r3 r2 = r10.f30930G     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            java.net.URL r3 = r10.f30928E     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            if (r4 == 0) goto L86
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            com.google.android.gms.measurement.internal.f2 r4 = r2.f31060a     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            r4.x()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            com.google.android.gms.measurement.internal.f2 r2 = r2.f31060a     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            r2.x()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7c
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L54
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L54
            if (r8 <= 0) goto L56
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L54
            goto L4a
        L54:
            r0 = move-exception
            goto L6a
        L56:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L54
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            r3.disconnect()
            r10.b(r2, r1, r0, r4)
            return
        L64:
            r0 = move-exception
            goto L91
        L66:
            r0 = move-exception
            goto L9d
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L70:
            r0 = move-exception
            r4 = r1
            goto L91
        L73:
            r0 = move-exception
            r4 = r1
            goto L9d
        L76:
            r2 = move-exception
            r4 = r1
        L78:
            r9 = r2
            r2 = r0
            r0 = r9
            goto L91
        L7c:
            r2 = move-exception
            r4 = r1
        L7e:
            r9 = r2
            r2 = r0
            r0 = r9
            goto L9d
        L82:
            r2 = move-exception
            goto L8e
        L84:
            r2 = move-exception
            goto L9a
        L86:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
            throw r2     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L84
        L8e:
            r3 = r1
            r4 = r3
            goto L78
        L91:
            if (r3 == 0) goto L96
            r3.disconnect()
        L96:
            r10.b(r2, r1, r1, r4)
            throw r0
        L9a:
            r3 = r1
            r4 = r3
            goto L7e
        L9d:
            if (r3 == 0) goto La2
            r3.disconnect()
        La2:
            r10.b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC1705q3.run():void");
    }
}
