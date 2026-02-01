package com.harman.jbl.partybox;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.appcompat.app.ActivityC0587e;
import androidx.core.content.C0669d;
import androidx.lifecycle.C0900b;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a extends C0900b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@l3.d Application application) {
        super(application);
        F.p(application, "application");
    }

    public final boolean A(@l3.d Context context) {
        F.p(context, "context");
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        if (C0669d.a(context, "android.permission.BLUETOOTH_SCAN") == 0 && C0669d.a(context, "android.permission.BLUETOOTH_CONNECT") == 0) {
            return true;
        }
        return false;
    }

    public final boolean B(@l3.d Context context) {
        F.p(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.b.f34811s);
        F.n(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }

    public final boolean C(@l3.d Context context) {
        F.p(context, "context");
        if (C0669d.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && C0669d.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public final void D(@l3.d ActivityC0587e activity, @l3.d String[] permissions, @l3.d int[] grantResults) {
        F.p(activity, "activity");
        F.p(permissions, "permissions");
        F.p(grantResults, "grantResults");
        if (w(activity)) {
            activity.S().i1();
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42074j, false);
            com.harman.jbl.partybox.persistence.a.A("did_user_deny_location_access_forever", false);
        } else if (!v(activity, permissions, grantResults)) {
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42074j, false);
            com.harman.jbl.partybox.persistence.a.A("did_user_deny_location_access_forever", true);
        } else {
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42074j, true);
        }
    }

    public final void E(@l3.d ActivityC0587e activity, @l3.d String[] permissions, @l3.d int[] grantResults) {
        F.p(activity, "activity");
        F.p(permissions, "permissions");
        F.p(grantResults, "grantResults");
        if (w(activity)) {
            activity.S().i1();
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42077m, false);
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42076l, false);
        } else if (!v(activity, permissions, grantResults)) {
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42077m, false);
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42076l, true);
        } else {
            com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.persistence.a.f42074j, true);
        }
    }

    public final boolean v(@l3.d Activity activity, @l3.d String[] permissions, @l3.d int[] grantResults) {
        Boolean bool;
        F.p(activity, "activity");
        F.p(permissions, "permissions");
        F.p(grantResults, "grantResults");
        if (permissions.length == 0 || grantResults.length == 0) {
            return true;
        }
        int length = permissions.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (grantResults[i4] != 0) {
                String str = permissions[i4];
                if (str != null) {
                    bool = Boolean.valueOf(activity.shouldShowRequestPermissionRationale(str));
                } else {
                    bool = null;
                }
                F.m(bool);
                if (!bool.booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean w(@l3.d Context context) {
        F.p(context, "context");
        if (z() && x(context) && y(context)) {
            return true;
        }
        return false;
    }

    public final boolean x(@l3.d Context context) {
        F.p(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return com.harman.sdk.b.f47608a.r(context);
    }

    public final boolean y(@l3.d Context context) {
        F.p(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            if (C0669d.a(context, "android.permission.BLUETOOTH_SCAN") != 0 || C0669d.a(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
                return false;
            }
        } else if (C0669d.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0 || C0669d.a(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        return com.harman.sdk.b.f47608a.p();
    }
}
