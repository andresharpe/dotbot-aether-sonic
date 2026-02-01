package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1282w0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.r;
import javax.annotation.concurrent.GuardedBy;

@I0.a
@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1196j {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f28315e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("sLock")
    private static C1196j f28316f;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28317a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f28318b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28319c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28320d;

    @I0.a
    @com.google.android.gms.common.util.D
    C1196j(String str, boolean z3) {
        this.f28317a = str;
        this.f28318b = Status.f28025K;
        this.f28319c = z3;
        this.f28320d = !z3;
    }

    @I0.a
    private static C1196j b(String str) {
        C1196j c1196j;
        synchronized (f28315e) {
            try {
                c1196j = f28316f;
                if (c1196j == null) {
                    throw new IllegalStateException("Initialize must be called before " + str + ".");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1196j;
    }

    @I0.a
    @com.google.android.gms.common.util.D
    static void c() {
        synchronized (f28315e) {
            f28316f = null;
        }
    }

    @androidx.annotation.P
    @I0.a
    public static String d() {
        return b("getGoogleAppId").f28317a;
    }

    @I0.a
    @androidx.annotation.N
    public static Status e(@androidx.annotation.N Context context) {
        Status status;
        C1285y.m(context, "Context must not be null.");
        synchronized (f28315e) {
            try {
                if (f28316f == null) {
                    f28316f = new C1196j(context);
                }
                status = f28316f.f28318b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return status;
    }

    @I0.a
    @androidx.annotation.N
    public static Status f(@androidx.annotation.N Context context, @androidx.annotation.N String str, boolean z3) {
        C1285y.m(context, "Context must not be null.");
        C1285y.i(str, "App ID must be nonempty.");
        synchronized (f28315e) {
            try {
                C1196j c1196j = f28316f;
                if (c1196j != null) {
                    return c1196j.a(str);
                }
                C1196j c1196j2 = new C1196j(str, z3);
                f28316f = c1196j2;
                return c1196j2.f28318b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    public static boolean g() {
        C1196j b4 = b("isMeasurementEnabled");
        if (b4.f28318b.B0() && b4.f28319c) {
            return true;
        }
        return false;
    }

    @I0.a
    public static boolean h() {
        return b("isMeasurementExplicitlyDisabled").f28320d;
    }

    @I0.a
    @com.google.android.gms.common.util.D
    Status a(String str) {
        String str2 = this.f28317a;
        if (str2 != null && !str2.equals(str)) {
            return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + this.f28317a + "'.");
        }
        return Status.f28025K;
    }

    @I0.a
    @com.google.android.gms.common.util.D
    C1196j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", v.b.f7400b, resources.getResourcePackageName(r.b.f28867a));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z3 = integer == 0;
            r2 = integer != 0;
            this.f28320d = z3;
        } else {
            this.f28320d = false;
        }
        this.f28319c = r2;
        String b4 = C1282w0.b(context);
        b4 = b4 == null ? new com.google.android.gms.common.internal.E(context).a("google_app_id") : b4;
        if (TextUtils.isEmpty(b4)) {
            this.f28318b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f28317a = null;
        } else {
            this.f28317a = b4;
            this.f28318b = Status.f28025K;
        }
    }
}
