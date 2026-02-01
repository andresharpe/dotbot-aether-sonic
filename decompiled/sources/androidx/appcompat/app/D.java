package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.Y;
import androidx.annotation.i0;
import androidx.core.content.K;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* loaded from: classes.dex */
class D {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4746d = "TwilightManager";

    /* renamed from: e, reason: collision with root package name */
    private static final int f4747e = 6;

    /* renamed from: f, reason: collision with root package name */
    private static final int f4748f = 22;

    /* renamed from: g, reason: collision with root package name */
    private static D f4749g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4750a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f4751b;

    /* renamed from: c, reason: collision with root package name */
    private final a f4752c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f4753a;

        /* renamed from: b, reason: collision with root package name */
        long f4754b;

        a() {
        }
    }

    @i0
    D(@N Context context, @N LocationManager locationManager) {
        this.f4750a = context;
        this.f4751b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D a(@N Context context) {
        if (f4749g == null) {
            Context applicationContext = context.getApplicationContext();
            f4749g = new D(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.b.f34811s));
        }
        return f4749g;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location;
        Location location2 = null;
        if (K.d(this.f4750a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = c("network");
        } else {
            location = null;
        }
        if (K.d(this.f4750a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        }
        if (location2 != null) {
            return location2;
        }
        return location;
    }

    @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String str) {
        try {
            if (this.f4751b.isProviderEnabled(str)) {
                return this.f4751b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e4) {
            Log.d(f4746d, "Failed to get last known location", e4);
            return null;
        }
    }

    private boolean e() {
        if (this.f4752c.f4754b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    @i0
    static void f(D d4) {
        f4749g = d4;
    }

    private void g(@N Location location) {
        long j4;
        a aVar = this.f4752c;
        long currentTimeMillis = System.currentTimeMillis();
        C b4 = C.b();
        b4.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b4.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z3 = true;
        if (b4.f4745c != 1) {
            z3 = false;
        }
        boolean z4 = z3;
        long j5 = b4.f4744b;
        long j6 = b4.f4743a;
        b4.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j7 = b4.f4744b;
        if (j5 != -1 && j6 != -1) {
            if (currentTimeMillis <= j6) {
                if (currentTimeMillis > j5) {
                    j7 = j6;
                } else {
                    j7 = j5;
                }
            }
            j4 = j7 + com.harman.jbl.partybox.ui.party.b.f44883c;
        } else {
            j4 = currentTimeMillis + 43200000;
        }
        aVar.f4753a = z4;
        aVar.f4754b = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f4752c;
        if (e()) {
            return aVar.f4753a;
        }
        Location b4 = b();
        if (b4 != null) {
            g(b4);
            return aVar.f4753a;
        }
        Log.i(f4746d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i4 = Calendar.getInstance().get(11);
        if (i4 >= 6 && i4 < 22) {
            return false;
        }
        return true;
    }
}
