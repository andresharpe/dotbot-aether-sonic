package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

@I0.a
@Deprecated
/* renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1277u {

    /* renamed from: b, reason: collision with root package name */
    private static final C1264n f28815b = new C1264n("LibraryVersion", "");

    /* renamed from: c, reason: collision with root package name */
    private static C1277u f28816c = new C1277u();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f28817a = new ConcurrentHashMap();

    @com.google.android.gms.common.util.D
    protected C1277u() {
    }

    @I0.a
    @androidx.annotation.N
    public static C1277u a() {
        return f28816c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    @I0.a
    @androidx.annotation.N
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(@androidx.annotation.N java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.C1285y.i(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f28817a
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L1a
            java.util.concurrent.ConcurrentHashMap r0 = r8.f28817a
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            java.lang.Class<com.google.android.gms.common.internal.u> r5 = com.google.android.gms.common.internal.C1277u.class
            java.lang.String r6 = "/%s.properties"
            java.lang.String r4 = java.lang.String.format(r6, r4)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            if (r4 == 0) goto L5c
            r2.load(r4)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            com.google.android.gms.common.internal.n r2 = com.google.android.gms.common.internal.C1277u.f28815b     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.append(r9)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.append(r3)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r2.l(r1, r5)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            goto L70
        L55:
            r9 = move-exception
            goto L76
        L57:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L7c
        L5c:
            com.google.android.gms.common.internal.n r2 = com.google.android.gms.common.internal.C1277u.f28815b     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.append(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.append(r9)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r2.n(r1, r5)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L70:
            if (r4 == 0) goto L96
            com.google.android.gms.common.util.q.b(r4)
            goto L96
        L76:
            r3 = r4
            goto La7
        L78:
            r9 = move-exception
            goto La7
        L7a:
            r2 = move-exception
            r4 = r3
        L7c:
            com.google.android.gms.common.internal.n r5 = com.google.android.gms.common.internal.C1277u.f28815b     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r6.<init>()     // Catch: java.lang.Throwable -> L78
            r6.append(r0)     // Catch: java.lang.Throwable -> L78
            r6.append(r9)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L78
            r5.f(r1, r0, r2)     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L95
            com.google.android.gms.common.util.q.b(r3)
        L95:
            r3 = r4
        L96:
            if (r3 != 0) goto La1
            com.google.android.gms.common.internal.n r0 = com.google.android.gms.common.internal.C1277u.f28815b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.c(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        La1:
            java.util.concurrent.ConcurrentHashMap r0 = r8.f28817a
            r0.put(r9, r3)
            return r3
        La7:
            if (r3 == 0) goto Lac
            com.google.android.gms.common.util.q.b(r3)
        Lac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1277u.b(java.lang.String):java.lang.String");
    }
}
