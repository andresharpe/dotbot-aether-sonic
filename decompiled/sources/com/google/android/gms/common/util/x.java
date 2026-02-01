package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

@I0.a
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private static String f29026a;

    /* renamed from: b, reason: collision with root package name */
    private static int f29027b;

    private x() {
    }

    @P
    @I0.a
    public static String a() {
        BufferedReader bufferedReader;
        if (f29026a == null) {
            int i4 = f29027b;
            if (i4 == 0) {
                i4 = Process.myPid();
                f29027b = i4;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i4 > 0) {
                try {
                    String str2 = "/proc/" + i4 + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    C1285y.l(readLine);
                    str = readLine.trim();
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    q.b(bufferedReader2);
                    throw th;
                }
                q.b(bufferedReader);
            }
            f29026a = str;
        }
        return f29026a;
    }
}
