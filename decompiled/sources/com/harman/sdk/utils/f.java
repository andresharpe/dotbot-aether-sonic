package com.harman.sdk.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.N;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f48550a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f48551b;

    /* renamed from: c, reason: collision with root package name */
    public static String f48552c;

    /* renamed from: d, reason: collision with root package name */
    private static String f48553d;

    static {
        String file = Environment.getExternalStorageDirectory().toString();
        f48550a = file;
        String str = file + "/0JBL_PartyBox";
        f48551b = str;
        f48552c = "";
        f48553d = "";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdir();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        File filesDir = context.getFilesDir();
        f48553d = context.getFilesDir().getAbsolutePath();
        b(filesDir, "Firmware");
    }

    private static void b(File file, String str) {
        File file2 = new File(file, str);
        f48552c = f48553d + "/Firmware";
        file2.mkdir();
    }

    public static void c(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static File d(String str) {
        if (str != null && !str.isEmpty()) {
            return new File(f48552c, str);
        }
        return null;
    }

    public static File e(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(str, str2);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            file2.createNewFile();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return file2;
    }

    public static void f(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.isFile()) {
                file.delete();
            }
        }
    }

    public static void g(String str) {
        if (str != null && !str.isEmpty()) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            if (file.delete()) {
                com.harman.log.f.a("OTA_LOG", " File delete successful: strPath=" + str);
                return;
            }
            com.harman.log.f.a("OTA_LOG", " File delete not successful: strPath=" + str);
        }
    }

    public static void h(String str, boolean z3) {
        if (str != null && !str.isEmpty()) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            if (z3) {
                file.deleteOnExit();
            } else {
                file.delete();
                System.gc();
            }
        }
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.substring(str.lastIndexOf(".") + 1).trim();
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.substring(str.lastIndexOf("/") + 1).trim();
    }

    public static String k(String str) {
        return new File(str).getParent();
    }

    public static String l(Context context, String str) {
        String str2 = "";
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().getAssets().open(str));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str2 = str2 + readLine;
            }
            bufferedReader.close();
            inputStreamReader.close();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return str2;
    }

    public static String m(@N Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openFileInput.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return new String(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static String n(Context context, int i4) {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i4)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = str + readLine;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return str;
    }

    public static boolean o(String str) {
        if (str != null && !str.isEmpty()) {
            return new File(str).exists();
        }
        return false;
    }

    public static boolean p(String str) {
        if (str != null && !str.isEmpty()) {
            return new File(str).exists();
        }
        return false;
    }

    public static void q(String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            File file = new File(str);
            File file2 = new File(str2);
            if (!file.exists()) {
                return;
            }
            file.renameTo(file2);
        }
    }

    public static boolean r(File file, File file2) {
        return file.renameTo(file2);
    }
}
