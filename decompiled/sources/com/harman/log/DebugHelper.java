package com.harman.log;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;

/* loaded from: classes2.dex */
public class DebugHelper {

    /* renamed from: a, reason: collision with root package name */
    private static final String f47566a = "DebugHelper";

    /* renamed from: b, reason: collision with root package name */
    private static String f47567b;

    /* renamed from: c, reason: collision with root package name */
    private static String f47568c = System.getProperty("line.separator", "\r\n");

    /* renamed from: d, reason: collision with root package name */
    private static FileWriter f47569d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Context f47570e = null;

    /* loaded from: classes2.dex */
    public enum TYPE {
        SRC_JBL_HEADPHONE,
        SRC_HK_HEADPHONE,
        SRC_AKG_HEADPHONE,
        SRC_JBL_CONNECT,
        SRC_HK_CONTROLLER,
        SRC_MUSIC_LIFE
    }

    public static String a() {
        return f47567b;
    }

    private static String b() {
        File file;
        File[] externalFilesDirs = f47570e.getExternalFilesDirs(null);
        if (externalFilesDirs != null && externalFilesDirs.length > 0 && (file = externalFilesDirs[0]) != null && file.exists()) {
            return externalFilesDirs[0].getAbsolutePath();
        }
        return "";
    }

    public static void c(Context context) {
        String str = f47566a;
        Log.d(str, "init");
        f47570e = context.getApplicationContext();
        String b4 = b();
        if (b4 == null) {
            Log.e(str, "init don't support this source type");
            return;
        }
        String str2 = c.n(System.currentTimeMillis()) + ".txt";
        File file = new File(b4);
        if (!file.exists()) {
            Log.d(str, "init mkdirs success: " + file.mkdirs());
        }
        File file2 = new File(b4, str2);
        Log.d(str, "init dirName: " + b4 + ",fileName: " + str2);
        try {
            if (file2.exists()) {
                Log.d(str, "init delete success: " + file2.delete());
            }
            Log.d(str, "init createNewFile todayFile: " + file2.getAbsolutePath());
            Log.d(str, "init createNewFile success: " + file2.createNewFile());
            f47567b = file2.getPath();
            f47569d = new FileWriter(f47567b);
            d(f47568c);
            d("===========================init DebugHelper==================================");
            f.a(str, "init today file path is: " + f47567b);
        } catch (Exception e4) {
            String str3 = f47566a;
            f.b(str3, "Exception:" + e4.getLocalizedMessage());
            Log.e(str3, "Exception: " + e4.getLocalizedMessage());
            f47569d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(String str) {
        if (f47569d == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String d4 = c.d(System.currentTimeMillis());
            f47569d.write(d4 + ": ");
            f47569d.write(str);
            f47569d.write(f47568c);
        } catch (Exception e4) {
            f.b(f47566a, "Exception: " + e4.getLocalizedMessage());
            f47569d = null;
        }
    }
}
