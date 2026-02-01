package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.content.C0672g;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0631i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11951a = "android.support.AppLaunchChecker";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11952b = "startedFromLauncher";

    @Deprecated
    public C0631i() {
    }

    public static boolean a(@androidx.annotation.N Context context) {
        return context.getSharedPreferences(f11951a, 0).getBoolean(f11952b, false);
    }

    public static void b(@androidx.annotation.N Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f11951a, 0);
        if (!sharedPreferences.getBoolean(f11952b, false) && (intent = activity.getIntent()) != null && "android.intent.action.MAIN".equals(intent.getAction())) {
            if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C0672g.f12218e)) {
                sharedPreferences.edit().putBoolean(f11952b, true).apply();
            }
        }
    }
}
