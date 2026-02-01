package com.blankj.utilcode.util;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.C2191n;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24753a = System.getProperty("line.separator");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements FileFilter {
        b() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isFile();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements FileFilter {
        c() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(File file, File file2);
    }

    private G() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String A(String str) {
        int lastIndexOf;
        if (H0.D0(str) || (lastIndexOf = str.lastIndexOf(File.separator)) == -1) {
            return "";
        }
        return str.substring(0, lastIndexOf + 1);
    }

    public static List<File> A0(String str, FileFilter fileFilter, boolean z3) {
        return w0(C(str), fileFilter, z3);
    }

    private static String B(File file) {
        long y3 = y(file);
        if (y3 == -1) {
            return "";
        }
        return H0.i(y3);
    }

    public static List<File> B0(String str, FileFilter fileFilter, boolean z3, Comparator<File> comparator) {
        return x0(C(str), fileFilter, z3, comparator);
    }

    public static File C(String str) {
        if (H0.D0(str)) {
            return null;
        }
        return new File(str);
    }

    private static List<File> C0(File file, FileFilter fileFilter, boolean z3) {
        ArrayList arrayList = new ArrayList();
        if (!c0(file)) {
            return arrayList;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (fileFilter.accept(file2)) {
                    arrayList.add(file2);
                }
                if (z3 && file2.isDirectory()) {
                    arrayList.addAll(C0(file2, fileFilter, true));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String D(java.io.File r3) {
        /*
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            boolean r0 = k0(r3)
            if (r0 == 0) goto Le
            java.lang.String r3 = "UTF-8"
            return r3
        Le:
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            int r3 = r3 << 8
            int r0 = r1.read()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            int r3 = r3 + r0
            r1.close()     // Catch: java.io.IOException -> L28
            goto L44
        L28:
            r0 = move-exception
            r0.printStackTrace()
            goto L44
        L2d:
            r3 = move-exception
            r0 = r1
            goto L57
        L30:
            r3 = move-exception
            r0 = r1
            goto L36
        L33:
            r3 = move-exception
            goto L57
        L35:
            r3 = move-exception
        L36:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L43
            r0.close()     // Catch: java.io.IOException -> L3f
            goto L43
        L3f:
            r3 = move-exception
            r3.printStackTrace()
        L43:
            r3 = 0
        L44:
            r0 = 65279(0xfeff, float:9.1475E-41)
            if (r3 == r0) goto L54
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r3 == r0) goto L51
            java.lang.String r3 = "GBK"
            return r3
        L51:
            java.lang.String r3 = "Unicode"
            return r3
        L54:
            java.lang.String r3 = "UTF-16BE"
            return r3
        L57:
            if (r0 == 0) goto L61
            r0.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r0 = move-exception
            r0.printStackTrace()
        L61:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.G.D(java.io.File):java.lang.String");
    }

    public static boolean D0(File file, File file2) {
        return E0(file, file2, null);
    }

    public static String E(String str) {
        return D(C(str));
    }

    public static boolean E0(File file, File file2, d dVar) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return H0(file, file2, dVar);
        }
        return I0(file, file2, dVar);
    }

    public static String F(File file) {
        if (file == null) {
            return "";
        }
        return G(file.getPath());
    }

    public static boolean F0(String str, String str2) {
        return E0(C(str), C(str2), null);
    }

    public static String G(String str) {
        if (H0.D0(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf == -1 || lastIndexOf2 >= lastIndexOf) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    public static boolean G0(String str, String str2, d dVar) {
        return E0(C(str), C(str2), dVar);
    }

    public static long H(File file) {
        if (file == null) {
            return -1L;
        }
        return file.lastModified();
    }

    public static boolean H0(File file, File file2, d dVar) {
        return g(file, file2, dVar, true);
    }

    public static long I(String str) {
        return H(C(str));
    }

    public static boolean I0(File file, File file2, d dVar) {
        return h(file, file2, dVar, true);
    }

    private static long J(File file) {
        if (!e0(file)) {
            return -1L;
        }
        return file.length();
    }

    public static void J0(File file) {
        if (file != null && file.exists()) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.parse("file://" + file.getAbsolutePath()));
            E0.a().sendBroadcast(intent);
        }
    }

    public static long K(String str) {
        if (str.matches(r0.d.f57407g)) {
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpsURLConnection.connect();
                if (httpsURLConnection.getResponseCode() == 200) {
                    return httpsURLConnection.getContentLength();
                }
                return -1L;
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        return J(C(str));
    }

    public static void K0(String str) {
        J0(C(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == (-1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6 >= r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r1[r6] != 10) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r2.close();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        r3 = r2.read(r1, 0, 1024);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (r3 == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r6 >= r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r1[r6] != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0047, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (com.blankj.utilcode.util.G.f24753a.endsWith("\n") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r3 = r2.read(r1, 0, 1024);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x004f -> B:18:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int L(java.io.File r9) {
        /*
            r0 = 1
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r9]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L33
            java.lang.String r3 = com.blankj.utilcode.util.G.f24753a     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L33
            java.lang.String r4 = "\n"
            boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L33
            r4 = -1
            r5 = 0
            if (r3 == 0) goto L36
        L1c:
            int r3 = r2.read(r1, r5, r9)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L33
            if (r3 == r4) goto L4a
            r6 = r5
        L23:
            if (r6 >= r3) goto L1c
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L33
            r8 = 10
            if (r7 != r8) goto L2d
            int r0 = r0 + 1
        L2d:
            int r6 = r6 + 1
            goto L23
        L30:
            r9 = move-exception
            r1 = r2
            goto L5f
        L33:
            r9 = move-exception
            r1 = r2
            goto L56
        L36:
            int r3 = r2.read(r1, r5, r9)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L33
            if (r3 == r4) goto L4a
            r6 = r5
        L3d:
            if (r6 >= r3) goto L36
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L33
            r8 = 13
            if (r7 != r8) goto L47
            int r0 = r0 + 1
        L47:
            int r6 = r6 + 1
            goto L3d
        L4a:
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L5e
        L4e:
            r9 = move-exception
            r9.printStackTrace()
            goto L5e
        L53:
            r9 = move-exception
            goto L5f
        L55:
            r9 = move-exception
        L56:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L4e
        L5e:
            return r0
        L5f:
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.G.L(java.io.File):int");
    }

    public static boolean L0(File file, String str) {
        if (file == null || !file.exists() || H0.D0(str)) {
            return false;
        }
        if (str.equals(file.getName())) {
            return true;
        }
        File file2 = new File(file.getParent() + File.separator + str);
        if (file2.exists() || !file.renameTo(file2)) {
            return false;
        }
        return true;
    }

    public static int M(String str) {
        return L(C(str));
    }

    public static boolean M0(String str, String str2) {
        return L0(C(str), str2);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0030: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:49), block:B:46:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] N(java.io.File r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r3 = 262144(0x40000, float:3.67342E-40)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
        L18:
            int r1 = r2.read(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            if (r1 > 0) goto L18
            java.security.MessageDigest r3 = r2.getMessageDigest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            byte[] r3 = r3.digest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            return r3
        L2f:
            r3 = move-exception
            r0 = r2
            goto L4b
        L32:
            r3 = move-exception
            goto L3d
        L34:
            r3 = move-exception
            goto L3d
        L36:
            r3 = move-exception
            goto L4b
        L38:
            r3 = move-exception
        L39:
            r2 = r0
            goto L3d
        L3b:
            r3 = move-exception
            goto L39
        L3d:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r3 = move-exception
            r3.printStackTrace()
        L4a:
            return r0
        L4b:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.G.N(java.io.File):byte[]");
    }

    public static byte[] O(String str) {
        return N(C(str));
    }

    public static String P(File file) {
        return H0.l(N(file));
    }

    public static String Q(String str) {
        File file;
        if (H0.D0(str)) {
            file = null;
        } else {
            file = new File(str);
        }
        return P(file);
    }

    public static String R(File file) {
        if (file == null) {
            return "";
        }
        return S(file.getAbsolutePath());
    }

    public static String S(String str) {
        if (H0.D0(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1);
        }
        return str;
    }

    public static String T(File file) {
        if (file == null) {
            return "";
        }
        return U(file.getPath());
    }

    public static String U(String str) {
        if (H0.D0(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 == -1) {
            if (lastIndexOf != -1) {
                return str.substring(0, lastIndexOf);
            }
            return str;
        }
        if (lastIndexOf != -1 && lastIndexOf2 <= lastIndexOf) {
            return str.substring(lastIndexOf2 + 1, lastIndexOf);
        }
        return str.substring(lastIndexOf2 + 1);
    }

    private static String V(File file) {
        long J3 = J(file);
        if (J3 == -1) {
            return "";
        }
        return H0.i(J3);
    }

    public static long W(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static long X(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static long Y(File file) {
        if (file == null) {
            return 0L;
        }
        if (file.isDirectory()) {
            return y(file);
        }
        return J(file);
    }

    public static long Z(String str) {
        return Y(C(str));
    }

    public static boolean a(File file, File file2) {
        return b(file, file2, null);
    }

    public static String a0(File file) {
        if (file == null) {
            return "";
        }
        if (file.isDirectory()) {
            return B(file);
        }
        return V(file);
    }

    public static boolean b(File file, File file2, d dVar) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return e(file, file2, dVar);
        }
        return f(file, file2, dVar);
    }

    public static String b0(String str) {
        return a0(C(str));
    }

    public static boolean c(String str, String str2) {
        return b(C(str), C(str2), null);
    }

    public static boolean c0(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, d dVar) {
        return b(C(str), C(str2), dVar);
    }

    public static boolean d0(String str) {
        return c0(C(str));
    }

    private static boolean e(File file, File file2, d dVar) {
        return g(file, file2, dVar, false);
    }

    public static boolean e0(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return true;
        }
        return false;
    }

    private static boolean f(File file, File file2, d dVar) {
        return h(file, file2, dVar, false);
    }

    public static boolean f0(String str) {
        return e0(C(str));
    }

    private static boolean g(File file, File file2, d dVar, boolean z3) {
        if (file == null || file2 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        String str = File.separator;
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = file2.getPath() + str;
        if (str2.contains(sb2) || !file.exists() || !file.isDirectory() || !k(file2)) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file3 : listFiles) {
                File file4 = new File(str2 + file3.getName());
                if (file3.isFile()) {
                    if (!h(file3, file4, dVar, z3)) {
                        return false;
                    }
                } else if (file3.isDirectory() && !g(file3, file4, dVar, z3)) {
                    return false;
                }
            }
        }
        if (z3 && !s(file)) {
            return false;
        }
        return true;
    }

    public static boolean g0(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return h0(file.getAbsolutePath());
    }

    private static boolean h(File file, File file2, d dVar, boolean z3) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (dVar != null && !dVar.a(file, file2)) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!k(file2.getParentFile())) {
                return false;
            }
            try {
                if (!H0.i1(file2.getAbsolutePath(), new FileInputStream(file))) {
                    return false;
                }
                if (z3) {
                    if (!t(file)) {
                        return false;
                    }
                }
                return true;
            } catch (FileNotFoundException e4) {
                e4.printStackTrace();
            }
        }
        return false;
    }

    public static boolean h0(String str) {
        File C3 = C(str);
        if (C3 == null) {
            return false;
        }
        if (C3.exists()) {
            return true;
        }
        return i0(str);
    }

    public static boolean i(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !k(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private static boolean i0(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = E0.a().getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                if (openAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    openAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }

    public static boolean j(String str) {
        return i(C(str));
    }

    private static int j0(byte[] bArr) {
        if (bArr.length > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return 100;
        }
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length) {
            byte b4 = bArr[i4];
            if (b4 == -1 || (b4 & (-2)) == -2) {
                return 0;
            }
            if (i7 == 0) {
                if ((b4 & Byte.MAX_VALUE) == b4 && b4 != 0) {
                    i5++;
                } else if ((b4 & (-64)) == -64) {
                    int i8 = i7;
                    for (int i9 = 0; i9 < 8; i9++) {
                        byte b5 = (byte) (128 >> i9);
                        if ((bArr[i4] & b5) != b5) {
                            break;
                        }
                        i8 = i9;
                    }
                    i6++;
                    i7 = i8;
                }
                i4++;
            } else {
                if (bArr.length - i4 <= i7) {
                    i7 = bArr.length - i4;
                }
                boolean z3 = false;
                for (int i10 = 0; i10 < i7; i10++) {
                    byte b6 = bArr[i4 + i10];
                    if ((b6 & C2191n.f52349b) != -128) {
                        if ((b6 & Byte.MAX_VALUE) == b6 && bArr[i4] != 0) {
                            i5++;
                        }
                        z3 = true;
                    }
                }
                if (z3) {
                    i6--;
                    i4++;
                } else {
                    i6 += i7;
                    i4 += i7;
                }
                i7 = 0;
            }
        }
        if (i5 == length) {
            return 100;
        }
        return (int) (((i6 + i5) / length) * 100.0f);
    }

    public static boolean k(File file) {
        if (file != null && (!file.exists() ? file.mkdirs() : file.isDirectory())) {
            return true;
        }
        return false;
    }

    public static boolean k0(File file) {
        byte[] bArr;
        BufferedInputStream bufferedInputStream;
        boolean z3 = false;
        if (file == null) {
            return false;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bArr = new byte[24];
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e4) {
            e = e4;
        }
        try {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                byte[] bArr2 = new byte[read];
                System.arraycopy(bArr, 0, bArr2, 0, read);
                if (j0(bArr2) == 100) {
                    z3 = true;
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return z3;
            }
            try {
                bufferedInputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            return false;
        } catch (IOException e7) {
            e = e7;
            bufferedInputStream2 = bufferedInputStream;
            e.printStackTrace();
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean l(String str) {
        return k(C(str));
    }

    public static boolean l0(String str) {
        return k0(C(str));
    }

    public static boolean m(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!k(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static List<File> m0(File file) {
        return n0(file, null);
    }

    public static boolean n(String str) {
        return m(C(str));
    }

    public static List<File> n0(File file, Comparator<File> comparator) {
        return p0(file, false, comparator);
    }

    public static boolean o(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return s(file);
        }
        return t(file);
    }

    public static List<File> o0(File file, boolean z3) {
        return p0(file, z3, null);
    }

    public static boolean p(String str) {
        return o(C(str));
    }

    public static List<File> p0(File file, boolean z3, Comparator<File> comparator) {
        return x0(file, new c(), z3, comparator);
    }

    public static boolean q(File file) {
        return w(file, new a());
    }

    public static List<File> q0(String str) {
        return r0(str, null);
    }

    public static boolean r(String str) {
        return q(C(str));
    }

    public static List<File> r0(String str, Comparator<File> comparator) {
        return p0(C(str), false, comparator);
    }

    private static boolean s(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !s(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static List<File> s0(String str, boolean z3) {
        return o0(C(str), z3);
    }

    private static boolean t(File file) {
        if (file != null && (!file.exists() || (file.isFile() && file.delete()))) {
            return true;
        }
        return false;
    }

    public static List<File> t0(String str, boolean z3, Comparator<File> comparator) {
        return p0(C(str), z3, comparator);
    }

    public static boolean u(File file) {
        return w(file, new b());
    }

    public static List<File> u0(File file, FileFilter fileFilter) {
        return x0(file, fileFilter, false, null);
    }

    public static boolean v(String str) {
        return u(C(str));
    }

    public static List<File> v0(File file, FileFilter fileFilter, Comparator<File> comparator) {
        return x0(file, fileFilter, false, comparator);
    }

    public static boolean w(File file, FileFilter fileFilter) {
        if (file == null || fileFilter == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !s(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List<File> w0(File file, FileFilter fileFilter, boolean z3) {
        return x0(file, fileFilter, z3, null);
    }

    public static boolean x(String str, FileFilter fileFilter) {
        return w(C(str), fileFilter);
    }

    public static List<File> x0(File file, FileFilter fileFilter, boolean z3, Comparator<File> comparator) {
        List<File> C02 = C0(file, fileFilter, z3);
        if (comparator != null) {
            Collections.sort(C02, comparator);
        }
        return C02;
    }

    private static long y(File file) {
        long length;
        long j4 = 0;
        if (!c0(file)) {
            return 0L;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = y(file2);
                } else {
                    length = file2.length();
                }
                j4 += length;
            }
        }
        return j4;
    }

    public static List<File> y0(String str, FileFilter fileFilter) {
        return u0(C(str), fileFilter);
    }

    public static String z(File file) {
        if (file == null) {
            return "";
        }
        return A(file.getAbsolutePath());
    }

    public static List<File> z0(String str, FileFilter fileFilter, Comparator<File> comparator) {
        return v0(C(str), fileFilter, comparator);
    }
}
