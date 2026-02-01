package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C1285y;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;
import javax.annotation.Nullable;

@com.google.android.gms.common.internal.D
@I0.a
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@l1.b
/* renamed from: com.google.android.gms.common.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1291l {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static C1291l f28850c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile Set f28851d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28852a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f28853b;

    public C1291l(@androidx.annotation.N Context context) {
        this.f28852a = context.getApplicationContext();
    }

    @I0.a
    @androidx.annotation.N
    public static C1291l a(@androidx.annotation.N Context context) {
        C1285y.l(context);
        synchronized (C1291l.class) {
            try {
                if (f28850c == null) {
                    O.e(context);
                    f28850c = new C1291l(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f28850c;
    }

    @Nullable
    static final K e(PackageInfo packageInfo, K... kArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        L l4 = new L(packageInfo.signatures[0].toByteArray());
        for (int i4 = 0; i4 < kArr.length; i4++) {
            if (kArr[i4].equals(l4)) {
                return kArr[i4];
            }
        }
        return null;
    }

    public static final boolean f(@androidx.annotation.N PackageInfo packageInfo, boolean z3) {
        K e4;
        if (z3 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z3) {
                e4 = e(packageInfo, N.f27965a);
            } else {
                e4 = e(packageInfo, N.f27965a[0]);
            }
            if (e4 != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final Z g(String str, boolean z3, boolean z4) {
        Z c4;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return Z.c("null pkg");
        }
        if (!str.equals(this.f28853b)) {
            if (O.g()) {
                c4 = O.b(str, C1290k.k(this.f28852a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f28852a.getPackageManager().getPackageInfo(str, 64);
                    boolean k4 = C1290k.k(this.f28852a);
                    if (packageInfo == null) {
                        c4 = Z.c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            L l4 = new L(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            Z a4 = O.a(str2, l4, k4, false);
                            if (a4.f27992a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && O.a(str2, l4, false, true).f27992a) {
                                c4 = Z.c("debuggable release cert app rejected");
                            } else {
                                c4 = a4;
                            }
                        } else {
                            c4 = Z.c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    return Z.d("no pkg ".concat(str), e4);
                }
            }
            if (c4.f27992a) {
                this.f28853b = str;
            }
            return c4;
        }
        return Z.b();
    }

    @I0.a
    public boolean b(@androidx.annotation.N PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (C1290k.k(this.f28852a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public boolean c(@androidx.annotation.N String str) {
        Z g4 = g(str, false, false);
        g4.e();
        return g4.f27992a;
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public boolean d(int i4) {
        Z c4;
        int length;
        String[] packagesForUid = this.f28852a.getPackageManager().getPackagesForUid(i4);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c4 = null;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    c4 = g(packagesForUid[i5], false, false);
                    if (c4.f27992a) {
                        break;
                    }
                    i5++;
                } else {
                    C1285y.l(c4);
                    break;
                }
            }
        } else {
            c4 = Z.c("no pkgs");
        }
        c4.e();
        return c4.f27992a;
    }
}
