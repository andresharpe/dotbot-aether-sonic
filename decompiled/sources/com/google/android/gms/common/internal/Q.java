package com.google.android.gms.common.internal;

import H0.a;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.os.C0743f;
import com.google.android.gms.common.C1289j;
import com.google.android.gms.common.r;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("sCache")
    private static final androidx.collection.l<String, String> f28645a = new androidx.collection.l<>();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("sCache")
    private static Locale f28646b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.wrappers.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(a.e.f884g);
    }

    @androidx.annotation.N
    public static String c(Context context, int i4) {
        Resources resources = context.getResources();
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(a.e.f878a);
            }
            return resources.getString(a.e.f887j);
        }
        return resources.getString(a.e.f881d);
    }

    @androidx.annotation.N
    public static String d(Context context, int i4) {
        Resources resources = context.getResources();
        String a4 = a(context);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 7) {
                            if (i4 != 9) {
                                if (i4 != 20) {
                                    switch (i4) {
                                        case 16:
                                            return h(context, "common_google_play_services_api_unavailable_text", a4);
                                        case 17:
                                            return h(context, "common_google_play_services_sign_in_failed_text", a4);
                                        case 18:
                                            return resources.getString(a.e.f890m, a4);
                                        default:
                                            return resources.getString(r.b.f28867a, a4);
                                    }
                                }
                                return h(context, "common_google_play_services_restricted_profile_text", a4);
                            }
                            return resources.getString(a.e.f886i, a4);
                        }
                        return h(context, "common_google_play_services_network_error_text", a4);
                    }
                    return h(context, "common_google_play_services_invalid_account_text", a4);
                }
                return resources.getString(a.e.f879b, a4);
            }
            if (com.google.android.gms.common.util.l.l(context)) {
                return resources.getString(a.e.f891n);
            }
            return resources.getString(a.e.f888k, a4);
        }
        return resources.getString(a.e.f882e, a4);
    }

    @androidx.annotation.N
    public static String e(Context context, int i4) {
        if (i4 != 6 && i4 != 19) {
            return d(context, i4);
        }
        return h(context, "common_google_play_services_resolution_required_text", a(context));
    }

    @androidx.annotation.N
    public static String f(Context context, int i4) {
        String g4;
        if (i4 == 6) {
            g4 = i(context, "common_google_play_services_resolution_required_title");
        } else {
            g4 = g(context, i4);
        }
        if (g4 == null) {
            return context.getResources().getString(a.e.f885h);
        }
        return g4;
    }

    @androidx.annotation.P
    public static String g(Context context, int i4) {
        Resources resources = context.getResources();
        switch (i4) {
            case 1:
                return resources.getString(a.e.f883f);
            case 2:
                return resources.getString(a.e.f889l);
            case 3:
                return resources.getString(a.e.f880c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i4);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i4 = i(context, str);
        if (i4 == null) {
            i4 = resources.getString(r.b.f28867a);
        }
        return String.format(resources.getConfiguration().locale, i4, str2);
    }

    @androidx.annotation.P
    private static String i(Context context, String str) {
        String str2;
        String str3;
        androidx.collection.l<String, String> lVar = f28645a;
        synchronized (lVar) {
            try {
                Locale d4 = C0743f.a(context.getResources().getConfiguration()).d(0);
                if (!d4.equals(f28646b)) {
                    lVar.clear();
                    f28646b = d4;
                }
                String str4 = lVar.get(str);
                if (str4 != null) {
                    return str4;
                }
                Resources j4 = C1289j.j(context);
                if (j4 == null) {
                    return null;
                }
                int identifier = j4.getIdentifier(str, v.b.f7403e, "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        str3 = "Missing resource: ".concat(str);
                    } else {
                        str3 = new String("Missing resource: ");
                    }
                    Log.w("GoogleApiAvailability", str3);
                    return null;
                }
                String string = j4.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    if (str.length() != 0) {
                        str2 = "Got empty resource: ".concat(str);
                    } else {
                        str2 = new String("Got empty resource: ");
                    }
                    Log.w("GoogleApiAvailability", str2);
                    return null;
                }
                lVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
