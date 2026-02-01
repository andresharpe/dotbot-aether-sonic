package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12133a = "NavUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12134b = "android.support.PARENT_ACTIVITY";

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(16)
    /* renamed from: androidx.core.app.x$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @InterfaceC0577u
        static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @InterfaceC0577u
        static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    private C0660x() {
    }

    @androidx.annotation.P
    public static Intent a(@androidx.annotation.N Activity activity) {
        Intent a4 = a.a(activity);
        if (a4 != null) {
            return a4;
        }
        String d4 = d(activity);
        if (d4 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d4);
        try {
            if (e(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f12133a, "getParentActivityIntent: bad parentActivityName '" + d4 + "' in manifest");
            return null;
        }
    }

    @androidx.annotation.P
    public static Intent b(@androidx.annotation.N Context context, @androidx.annotation.N ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e4 = e(context, componentName);
        if (e4 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e4);
        if (e(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    @androidx.annotation.P
    public static Intent c(@androidx.annotation.N Context context, @androidx.annotation.N Class<?> cls) throws PackageManager.NameNotFoundException {
        String e4 = e(context, new ComponentName(context, cls));
        if (e4 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e4);
        if (e(context, componentName) == null) {
            return Intent.makeMainActivity(componentName);
        }
        return new Intent().setComponent(componentName);
    }

    @androidx.annotation.P
    public static String d(@androidx.annotation.N Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @androidx.annotation.P
    public static String e(@androidx.annotation.N Context context, @androidx.annotation.N ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i4;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i4 = 269222528;
        } else {
            i4 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i4);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f12134b)) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static void f(@androidx.annotation.N Activity activity) {
        Intent a4 = a(activity);
        if (a4 != null) {
            g(activity, a4);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static void g(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent) {
        a.b(activity, intent);
    }

    public static boolean h(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent) {
        return a.c(activity, intent);
    }
}
