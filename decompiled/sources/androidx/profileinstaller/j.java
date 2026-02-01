package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.j0;
import androidx.profileinstaller.j;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j {

    /* renamed from: A, reason: collision with root package name */
    public static final int f17340A = 14;

    /* renamed from: B, reason: collision with root package name */
    public static final int f17341B = 15;

    /* renamed from: C, reason: collision with root package name */
    public static final int f17342C = 16;

    /* renamed from: a, reason: collision with root package name */
    private static final String f17343a = "ProfileInstaller";

    /* renamed from: b, reason: collision with root package name */
    private static final String f17344b = "/data/misc/profiles/cur/0";

    /* renamed from: c, reason: collision with root package name */
    private static final String f17345c = "primary.prof";

    /* renamed from: d, reason: collision with root package name */
    private static final String f17346d = "dexopt/baseline.prof";

    /* renamed from: e, reason: collision with root package name */
    private static final String f17347e = "dexopt/baseline.profm";

    /* renamed from: f, reason: collision with root package name */
    private static final String f17348f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* renamed from: g, reason: collision with root package name */
    private static final d f17349g = new a();

    /* renamed from: h, reason: collision with root package name */
    @N
    static final d f17350h = new b();

    /* renamed from: i, reason: collision with root package name */
    public static final int f17351i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f17352j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17353k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17354l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17355m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17356n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17357o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17358p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f17359q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f17360r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final int f17361s = 6;

    /* renamed from: t, reason: collision with root package name */
    public static final int f17362t = 7;

    /* renamed from: u, reason: collision with root package name */
    public static final int f17363u = 8;

    /* renamed from: v, reason: collision with root package name */
    public static final int f17364v = 9;

    /* renamed from: w, reason: collision with root package name */
    public static final int f17365w = 10;

    /* renamed from: x, reason: collision with root package name */
    public static final int f17366x = 11;

    /* renamed from: y, reason: collision with root package name */
    public static final int f17367y = 12;

    /* renamed from: z, reason: collision with root package name */
    public static final int f17368z = 13;

    /* loaded from: classes.dex */
    class a implements d {
        a() {
        }

        @Override // androidx.profileinstaller.j.d
        public void a(int i4, @P Object obj) {
        }

        @Override // androidx.profileinstaller.j.d
        public void b(int i4, @P Object obj) {
        }
    }

    /* loaded from: classes.dex */
    class b implements d {

        /* renamed from: a, reason: collision with root package name */
        static final String f17369a = "ProfileInstaller";

        b() {
        }

        @Override // androidx.profileinstaller.j.d
        public void a(int i4, @P Object obj) {
            String str;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                str = "";
                            } else {
                                str = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
                            }
                        } else {
                            str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                        }
                    } else {
                        str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                    }
                } else {
                    str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                }
            } else {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            }
            Log.d(f17369a, str);
        }

        @Override // androidx.profileinstaller.j.d
        public void b(int i4, @P Object obj) {
            String str;
            switch (i4) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i4 != 6 && i4 != 7 && i4 != 8) {
                Log.d(f17369a, str);
            } else {
                Log.e(f17369a, str, (Throwable) obj);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i4, @P Object obj);

        void b(int i4, @P Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface e {
    }

    private j() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static boolean c(@N File file) {
        return new File(file, f17348f).delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0
    public static void d(@N Context context, @N Executor executor, @N d dVar) {
        c(context.getFilesDir());
        j(executor, dVar, 11, null);
    }

    static void e(@N Executor executor, @N final d dVar, final int i4, @P final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.i
            @Override // java.lang.Runnable
            public final void run() {
                j.d.this.a(i4, obj);
            }
        });
    }

    @j0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, f17348f);
        boolean z3 = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                if (readLong == packageInfo.lastUpdateTime) {
                    z3 = true;
                }
                if (z3) {
                    dVar.b(2, null);
                }
                return z3;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static void i(@N PackageInfo packageInfo, @N File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f17348f)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    static void j(@N Executor executor, @N final d dVar, final int i4, @P final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                j.d.this.b(i4, obj);
            }
        });
    }

    private static boolean k(@N AssetManager assetManager, @N String str, @N PackageInfo packageInfo, @N File file, @N String str2, @N Executor executor, @N d dVar) {
        androidx.profileinstaller.c cVar = new androidx.profileinstaller.c(assetManager, executor, dVar, str2, f17346d, f17347e, new File(new File(f17344b, str), f17345c));
        if (!cVar.e()) {
            return false;
        }
        boolean n4 = cVar.i().m().n();
        if (n4) {
            i(packageInfo, file);
        }
        return n4;
    }

    @j0
    public static void l(@N Context context) {
        m(context, new g(), f17349g);
    }

    @j0
    public static void m(@N Context context, @N Executor executor, @N d dVar) {
        n(context, executor, dVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0
    public static void n(@N Context context, @N Executor executor, @N d dVar, boolean z3) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z4 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3 && f(packageInfo, filesDir, dVar)) {
                Log.d(f17343a, "Skipping profile installation for " + context.getPackageName());
                p.e(context, false);
                return;
            }
            Log.d(f17343a, "Installing profile for " + context.getPackageName());
            if (k(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z3) {
                z4 = true;
            }
            p.e(context, z4);
        } catch (PackageManager.NameNotFoundException e4) {
            dVar.b(7, e4);
            p.e(context, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0
    public static void o(@N Context context, @N Executor executor, @N d dVar) {
        try {
            i(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            j(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e4) {
            j(executor, dVar, 7, e4);
        }
    }
}
