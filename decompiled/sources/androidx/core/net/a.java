package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.Y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12702a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12703b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12704c = 3;

    @W(16)
    /* renamed from: androidx.core.net.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0092a {
        private C0092a() {
        }

        @Y("android.permission.ACCESS_NETWORK_STATE")
        @InterfaceC0577u
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface c {
    }

    private a() {
    }

    @P
    @Y("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    public static NetworkInfo a(@N ConnectivityManager connectivityManager, @N Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@N ConnectivityManager connectivityManager) {
        return b.a(connectivityManager);
    }

    @Y("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@N ConnectivityManager connectivityManager) {
        return C0092a.a(connectivityManager);
    }
}
