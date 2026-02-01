package com.blankj.utilcode.util;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24817a = 8192;

    private M0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static List<String> a(File file) throws IOException {
        if (file == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            arrayList.add(entries.nextElement().getComment());
        }
        zipFile.close();
        return arrayList;
    }

    public static List<String> b(String str) throws IOException {
        return a(H0.P(str));
    }

    public static List<String> c(File file) throws IOException {
        if (file == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            String replace = entries.nextElement().getName().replace("\\", "/");
            if (replace.contains("../")) {
                Log.e("ZipUtils", "entryName: " + replace + " is dangerous!");
                arrayList.add(replace);
            } else {
                arrayList.add(replace);
            }
        }
        zipFile.close();
        return arrayList;
    }

    public static List<String> d(String str) throws IOException {
        return c(H0.P(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean e(java.io.File r1, java.util.List<java.io.File> r2, java.util.zip.ZipFile r3, java.util.zip.ZipEntry r4, java.lang.String r5) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r5)
            r2.add(r0)
            boolean r1 = r4.isDirectory()
            if (r1 == 0) goto L13
            boolean r1 = com.blankj.utilcode.util.H0.s(r0)
            return r1
        L13:
            boolean r1 = com.blankj.utilcode.util.H0.t(r0)
            r2 = 0
            if (r1 != 0) goto L1b
            return r2
        L1b:
            r1 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4c
            java.io.InputStream r3 = r3.getInputStream(r4)     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L48
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L48
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L3e
        L33:
            int r4 = r5.read(r1)     // Catch: java.lang.Throwable -> L3e
            r0 = -1
            if (r4 == r0) goto L40
            r3.write(r1, r2, r4)     // Catch: java.lang.Throwable -> L3e
            goto L33
        L3e:
            r1 = move-exception
            goto L50
        L40:
            r5.close()
            r3.close()
            r1 = 1
            return r1
        L48:
            r2 = move-exception
            r3 = r1
        L4a:
            r1 = r2
            goto L50
        L4c:
            r2 = move-exception
            r3 = r1
            r5 = r3
            goto L4a
        L50:
            if (r5 == 0) goto L55
            r5.close()
        L55:
            if (r3 == 0) goto L5a
            r3.close()
        L5a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.M0.e(java.io.File, java.util.List, java.util.zip.ZipFile, java.util.zip.ZipEntry, java.lang.String):boolean");
    }

    public static List<File> f(File file, File file2) throws IOException {
        return h(file, file2, null);
    }

    public static List<File> g(String str, String str2) throws IOException {
        return i(str, str2, null);
    }

    public static List<File> h(File file, File file2, String str) throws IOException {
        if (file != null && file2 != null) {
            ArrayList arrayList = new ArrayList();
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            try {
                if (H0.D0(str)) {
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        String replace = nextElement.getName().replace("\\", "/");
                        if (replace.contains("../")) {
                            Log.e("ZipUtils", "entryName: " + replace + " is dangerous!");
                        } else if (!e(file2, arrayList, zipFile, nextElement, replace)) {
                            zipFile.close();
                            return arrayList;
                        }
                    }
                } else {
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement2 = entries.nextElement();
                        String replace2 = nextElement2.getName().replace("\\", "/");
                        if (replace2.contains("../")) {
                            Log.e("ZipUtils", "entryName: " + replace2 + " is dangerous!");
                        } else if (replace2.contains(str) && !e(file2, arrayList, zipFile, nextElement2, replace2)) {
                            zipFile.close();
                            return arrayList;
                        }
                    }
                }
                zipFile.close();
                return arrayList;
            } catch (Throwable th) {
                zipFile.close();
                throw th;
            }
        }
        return null;
    }

    public static List<File> i(String str, String str2, String str3) throws IOException {
        return h(H0.P(str), H0.P(str2), str3);
    }

    public static boolean j(File file, File file2) throws IOException {
        return k(file, file2, null);
    }

    public static boolean k(File file, File file2, String str) throws IOException {
        if (file != null && file2 != null) {
            ZipOutputStream zipOutputStream = null;
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file2));
                try {
                    boolean l4 = l(file, "", zipOutputStream2, str);
                    zipOutputStream2.close();
                    return l4;
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = zipOutputStream2;
                    if (zipOutputStream != null) {
                        zipOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            return false;
        }
    }

    private static boolean l(File file, String str, ZipOutputStream zipOutputStream, String str2) throws IOException {
        String str3;
        BufferedInputStream bufferedInputStream;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (H0.D0(str)) {
            str3 = "";
        } else {
            str3 = File.separator;
        }
        sb.append(str3);
        sb.append(file.getName());
        String sb2 = sb.toString();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (!l(file2, sb2, zipOutputStream, str2)) {
                        return false;
                    }
                }
                return true;
            }
            ZipEntry zipEntry = new ZipEntry(sb2 + '/');
            zipEntry.setComment(str2);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            return true;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            ZipEntry zipEntry2 = new ZipEntry(sb2);
            zipEntry2.setComment(str2);
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    zipOutputStream.closeEntry();
                    bufferedInputStream.close();
                    return true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
    }

    public static boolean m(String str, String str2) throws IOException {
        return k(H0.P(str), H0.P(str2), null);
    }

    public static boolean n(String str, String str2, String str3) throws IOException {
        return k(H0.P(str), H0.P(str2), str3);
    }

    public static boolean o(Collection<File> collection, File file) throws IOException {
        return p(collection, file, null);
    }

    public static boolean p(Collection<File> collection, File file, String str) throws IOException {
        if (collection == null || file == null) {
            return false;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file));
            try {
                Iterator<File> it = collection.iterator();
                while (it.hasNext()) {
                    if (!l(it.next(), "", zipOutputStream2, str)) {
                        zipOutputStream2.finish();
                        zipOutputStream2.close();
                        return false;
                    }
                }
                zipOutputStream2.finish();
                zipOutputStream2.close();
                return true;
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean q(Collection<String> collection, String str) throws IOException {
        return r(collection, str, null);
    }

    public static boolean r(Collection<String> collection, String str, String str2) throws IOException {
        if (collection == null || str == null) {
            return false;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    if (!l(H0.P(it.next()), "", zipOutputStream2, str2)) {
                        zipOutputStream2.finish();
                        zipOutputStream2.close();
                        return false;
                    }
                }
                zipOutputStream2.finish();
                zipOutputStream2.close();
                return true;
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
