package Q1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.remoteconfig.u;
import java.io.File;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: d, reason: collision with root package name */
    public static final String f1720d = "CrashExceptionHandler";

    /* renamed from: e, reason: collision with root package name */
    private static b f1721e;

    /* renamed from: a, reason: collision with root package name */
    private Context f1722a;

    /* renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f1723b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f1724c = new HashMap();

    private b(Context context) {
        g(context);
    }

    private void b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            if (packageInfo != null) {
                String str = packageInfo.versionName;
                if (str == null) {
                    str = "null";
                }
                String str2 = packageInfo.versionCode + "";
                this.f1724c.put("versionName", str);
                this.f1724c.put("versionCode", str2);
                this.f1724c.put(u.b.f37787e0, context.getPackageName());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f1720d, "collect device info error");
        }
        try {
            for (Field field : Build.class.getDeclaredFields()) {
                field.setAccessible(true);
                this.f1724c.put(field.getName(), field.get(null).toString());
            }
        } catch (Exception unused2) {
            Log.e(f1720d, "收集crash信息时出错。");
        }
    }

    public static b d(Context context) {
        if (f1721e == null) {
            f1721e = new b(context);
        }
        return f1721e;
    }

    private static String e(Context context) {
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        if (externalFilesDirs != null && externalFilesDirs.length > 0) {
            return externalFilesDirs[0].getAbsolutePath();
        }
        return "";
    }

    private boolean f(Throwable th, Thread thread) {
        if (th == null) {
            return true;
        }
        b(this.f1722a);
        i(th);
        return true;
    }

    private void g(Context context) {
        this.f1722a = context;
        this.f1723b = Thread.getDefaultUncaughtExceptionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("=");
        sb.append(this.f1724c.get(str));
        sb.append("\n");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    @android.annotation.SuppressLint({"SimpleDateFormat"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(java.lang.Throwable r7) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.b.i(java.lang.Throwable):void");
    }

    public File c(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        long currentTimeMillis = System.currentTimeMillis();
        String str = simpleDateFormat.format(new Date()) + "-" + currentTimeMillis + ".txt";
        File file = new File(e(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, AppMeasurement.f30086b);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2.getAbsolutePath() + File.separator + str);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (f(th, thread) && (uncaughtExceptionHandler = this.f1723b) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            Process.killProcess(Process.myPid());
            System.exit(10);
            return;
        }
        this.f1723b.uncaughtException(thread, th);
    }
}
