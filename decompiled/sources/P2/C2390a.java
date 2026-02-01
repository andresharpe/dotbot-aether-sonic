package p2;

import androidx.annotation.P;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2390a {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File a(java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "httpUtils:"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r1 != 0) goto L9a
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto L11
            goto L9a
        L11:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            boolean r9 = r1.exists()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            if (r9 != 0) goto L26
            r1.createNewFile()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L26
        L20:
            r8 = move-exception
            goto L94
        L23:
            r8 = move-exception
            r9 = r2
            goto L87
        L26:
            java.net.URL r9 = new java.net.URL     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.net.URLConnection r8 = r9.openConnection()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r9 = 10000(0x2710, float:1.4013E-41)
            r8.setConnectTimeout(r9)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.io.InputStream r3 = r8.getInputStream()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
        L4d:
            int r5 = r9.read(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r6 = -1
            if (r5 == r6) goto L62
            r6 = 0
            r3.write(r4, r6, r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            goto L4d
        L59:
            r9 = move-exception
            r2 = r8
            r8 = r9
            goto L94
        L5d:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L87
        L62:
            r3.flush()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r9.close()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r3.close()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r9.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.lang.String r3 = "download file:"
            r9.append(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r9.append(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            android.util.Log.d(r0, r9)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r8.disconnect()
            return r1
        L87:
            java.lang.String r1 = ""
            android.util.Log.d(r0, r1, r8)     // Catch: java.lang.Throwable -> L92
            if (r9 == 0) goto L91
            r9.disconnect()
        L91:
            return r2
        L92:
            r8 = move-exception
            r2 = r9
        L94:
            if (r2 == 0) goto L99
            r2.disconnect()
        L99:
            throw r8
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C2390a.a(java.lang.String, java.lang.String):java.io.File");
    }

    @P
    public static String b(String str) {
        return c(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r1 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r4.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            if (r1 != 0) goto L25
            java.lang.String r1 = "Authorization"
            r4.setRequestProperty(r1, r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L25
        L20:
            r5 = move-exception
            r0 = r4
            goto L68
        L23:
            r5 = move-exception
            goto L5f
        L25:
            r4.connect()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.io.InputStream r2 = r4.getInputStream()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
        L3b:
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            if (r2 == 0) goto L4b
            java.lang.String r3 = "utf-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r1.append(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L3b
        L4b:
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r2.println(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r5.close()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r4.disconnect()
            return r5
        L5b:
            r5 = move-exception
            goto L68
        L5d:
            r5 = move-exception
            r4 = r0
        L5f:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L67
            r4.disconnect()
        L67:
            return r0
        L68:
            if (r0 == 0) goto L6d
            r0.disconnect()
        L6d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C2390a.c(java.lang.String, java.lang.String):java.lang.String");
    }
}
