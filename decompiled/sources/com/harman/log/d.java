package com.harman.log;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f47583a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    private static final String f47584b = "d";

    public static void a(File file, File file2, boolean z3) {
        FileOutputStream fileOutputStream;
        if (!file.getAbsolutePath().equals(file2.getAbsolutePath()) && file.exists() && file.isFile() && file.canRead()) {
            c(file2);
            if (file2.exists() && z3) {
                file2.delete();
            }
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream2.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, read);
                                }
                            }
                            fileInputStream2.close();
                        } catch (FileNotFoundException unused) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream == null) {
                                return;
                            }
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused3) {
                                    throw th;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused4) {
                        fileOutputStream = null;
                    } catch (IOException unused5) {
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (IOException unused6) {
                    return;
                }
            } catch (FileNotFoundException unused7) {
                fileOutputStream = null;
            } catch (IOException unused8) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
            fileOutputStream.close();
        }
    }

    public static void b(String str, String str2, boolean z3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2)) {
            return;
        }
        a(new File(str), new File(str2), z3);
    }

    public static void c(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void d(String str) {
        if (str.endsWith("/")) {
            c(new File(str));
        } else {
            e(new File(str));
        }
    }

    public static void e(File file) {
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
    }

    public static void f(String str) {
        g(str, true);
    }

    public static void g(String str, boolean z3) {
        File[] listFiles;
        if (!q(str)) {
            return;
        }
        File file = new File(str);
        if (z3 && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    g(file2.getAbsolutePath(), true);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    public static void h(File file) {
        if (!p(file)) {
            return;
        }
        file.delete();
    }

    public static void i(String str) {
        if (!q(str)) {
            return;
        }
        new File(str).delete();
    }

    public static int j(Date date, Date date2) {
        return (int) ((date2.getTime() - date.getTime()) / 86400000);
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (!file.isFile()) {
            return "";
        }
        return file.getName();
    }

    public static long l(File file) {
        if (file == null) {
            return 0L;
        }
        return file.length();
    }

    public static long m(String str) {
        if (!q(str)) {
            return 0L;
        }
        return new File(str).length();
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new File(str).getParent();
    }

    public static boolean o(String str) {
        return new File(str).isDirectory();
    }

    public static boolean p(File file) {
        if (file == null) {
            return false;
        }
        return file.exists();
    }

    public static boolean q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String r(String str) throws IOException {
        return s(str, "UTF-8");
    }

    public static String s(String str, String str2) throws IOException {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream, str2);
            } catch (Throwable th) {
                th = th;
            }
            try {
                char[] cArr = new char[512];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                }
                String sb2 = sb.toString();
                try {
                    inputStreamReader.close();
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return sb2;
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static boolean t(File file, File file2) {
        if (!p(file)) {
            return false;
        }
        return file.renameTo(file2);
    }

    public static boolean u(String str, String str2) {
        if (!q(str)) {
            return false;
        }
        return new File(str).renameTo(new File(str2));
    }

    public static void v(String str, String str2) throws IOException {
        w(str, str2, "UTF-8");
    }

    public static void w(String str, String str2, String str3) throws IOException {
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        d(str);
        i(str);
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                outputStreamWriter = new OutputStreamWriter(fileOutputStream, str3);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            try {
                outputStreamWriter.close();
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter2 = outputStreamWriter;
            if (outputStreamWriter2 != null) {
                try {
                    outputStreamWriter2.close();
                } catch (IOException unused2) {
                    throw th;
                }
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }
}
