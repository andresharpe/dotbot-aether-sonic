package com.blankj.utilcode.util;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.blankj.utilcode.util.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char f24981a = File.separatorChar;

    private C1081b0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String A() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    public static String B() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS));
    }

    public static String C() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES));
    }

    public static String D() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStorageDirectory());
    }

    public static String E() {
        String m4 = m();
        if (TextUtils.isEmpty(m4)) {
            return K();
        }
        return m4;
    }

    public static String F() {
        return a(E0.a().getCacheDir());
    }

    public static String G() {
        return a(E0.a().getCodeCacheDir());
    }

    public static String H() {
        return a(E0.a().getDataDir());
    }

    public static String I(String str) {
        return a(E0.a().getDatabasePath(str));
    }

    public static String J() {
        return E0.a().getApplicationInfo().dataDir + "/databases";
    }

    public static String K() {
        return a(E0.a().getFilesDir());
    }

    public static String L() {
        return a(E0.a().getNoBackupFilesDir());
    }

    public static String M() {
        return E0.a().getApplicationInfo().dataDir + "/shared_prefs";
    }

    private static String N(String str) {
        char[] charArray = str.toCharArray();
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < charArray.length; i6++) {
            if (charArray[i6] != f24981a) {
                if (i4 == -1) {
                    i4 = i6;
                }
                i5 = i6;
            }
        }
        if (i4 >= 0 && i5 >= i4) {
            return str.substring(i4, i5 + 1);
        }
        throw new IllegalArgumentException("segment of <" + str + "> is illegal");
    }

    public static String O() {
        return a(Environment.getRootDirectory());
    }

    public static String P() {
        String D3 = D();
        if (TextUtils.isEmpty(D3)) {
            return O();
        }
        return D3;
    }

    public static String Q(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str == null) {
            str = "";
        }
        int length = str.length();
        String N3 = N(str2);
        if (length == 0) {
            return f24981a + N3;
        }
        char charAt = str.charAt(length - 1);
        char c4 = f24981a;
        if (charAt == c4) {
            return str + N3;
        }
        return str + c4 + N3;
    }

    private static String a(File file) {
        if (file == null) {
            return "";
        }
        return file.getAbsolutePath();
    }

    public static String b() {
        String i4 = i();
        if (TextUtils.isEmpty(i4)) {
            return H();
        }
        return i4;
    }

    public static String c() {
        String h4 = h();
        if (TextUtils.isEmpty(h4)) {
            return F();
        }
        return h4;
    }

    public static String d() {
        return a(Environment.getDataDirectory());
    }

    public static String e() {
        return a(Environment.getDownloadCacheDirectory());
    }

    public static String f() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS));
    }

    public static String g() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_ALARMS));
    }

    public static String h() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalCacheDir());
    }

    public static String i() {
        File externalCacheDir;
        if (!H0.A0() || (externalCacheDir = E0.a().getExternalCacheDir()) == null) {
            return "";
        }
        return a(externalCacheDir.getParentFile());
    }

    public static String j() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_DCIM));
    }

    public static String k() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS));
    }

    public static String l() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
    }

    public static String m() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(null));
    }

    public static String n() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_MOVIES));
    }

    public static String o() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_MUSIC));
    }

    public static String p() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_NOTIFICATIONS));
    }

    public static String q() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getObbDir());
    }

    public static String r() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    public static String s() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_PODCASTS));
    }

    public static String t() {
        if (!H0.A0()) {
            return "";
        }
        return a(E0.a().getExternalFilesDir(Environment.DIRECTORY_RINGTONES));
    }

    public static String u() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    public static String v() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS));
    }

    public static String w() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
    }

    public static String x() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
    }

    public static String y() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC));
    }

    public static String z() {
        if (!H0.A0()) {
            return "";
        }
        return a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS));
    }
}
