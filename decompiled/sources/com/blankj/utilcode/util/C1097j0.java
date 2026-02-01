package com.blankj.utilcode.util;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.blankj.utilcode.util.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097j0 {
    private C1097j0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.Y("android.permission.KILL_BACKGROUND_PROCESSES")
    public static Set<String> a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) E0.a().getSystemService("activity")).getRunningAppProcesses();
        HashSet hashSet = new HashSet();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                Collections.addAll(hashSet, it.next().pkgList);
            }
        }
        return hashSet;
    }

    public static String b() {
        String d4 = d();
        if (!TextUtils.isEmpty(d4)) {
            return d4;
        }
        String c4 = c();
        if (!TextUtils.isEmpty(c4)) {
            return c4;
        }
        return e();
    }

    private static String c() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) E0.a().getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid && (str = runningAppProcessInfo.processName) != null) {
                        return str;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static String d() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String trim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return trim;
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    private static String e() {
        try {
            Application a4 = E0.a();
            Field field = a4.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(a4);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static String f() {
        List<UsageStats> list;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) E0.a().getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        PackageManager packageManager = E0.a().getPackageManager();
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        Log.i("ProcessUtils", queryIntentActivities.toString());
        if (queryIntentActivities.size() <= 0) {
            Log.i("ProcessUtils", "getForegroundProcessName: noun of access to usage information.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(E0.a().getPackageName(), 0);
            AppOpsManager appOpsManager = (AppOpsManager) E0.a().getSystemService("appops");
            if (appOpsManager.checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) != 0) {
                intent.addFlags(268435456);
                E0.a().startActivity(intent);
            }
            if (appOpsManager.checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) != 0) {
                Log.i("ProcessUtils", "getForegroundProcessName: refuse to device usage stats.");
                return "";
            }
            UsageStatsManager usageStatsManager = (UsageStatsManager) E0.a().getSystemService("usagestats");
            if (usageStatsManager != null) {
                long currentTimeMillis = System.currentTimeMillis();
                list = usageStatsManager.queryUsageStats(4, currentTimeMillis - 604800000, currentTimeMillis);
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                UsageStats usageStats = null;
                for (UsageStats usageStats2 : list) {
                    if (usageStats == null || usageStats2.getLastTimeUsed() > usageStats.getLastTimeUsed()) {
                        usageStats = usageStats2;
                    }
                }
                if (usageStats == null) {
                    return null;
                }
                return usageStats.getPackageName();
            }
            return "";
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static boolean g() {
        return E0.a().getPackageName().equals(b());
    }

    @androidx.annotation.Y("android.permission.KILL_BACKGROUND_PROCESSES")
    public static Set<String> h() {
        ActivityManager activityManager = (ActivityManager) E0.a().getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        HashSet hashSet = new HashSet();
        if (runningAppProcesses == null) {
            return hashSet;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            for (String str : it.next().pkgList) {
                activityManager.killBackgroundProcesses(str);
                hashSet.add(str);
            }
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it2 = activityManager.getRunningAppProcesses().iterator();
        while (it2.hasNext()) {
            for (String str2 : it2.next().pkgList) {
                hashSet.remove(str2);
            }
        }
        return hashSet;
    }

    @androidx.annotation.Y("android.permission.KILL_BACKGROUND_PROCESSES")
    public static boolean i(@androidx.annotation.N String str) {
        ActivityManager activityManager = (ActivityManager) E0.a().getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                if (Arrays.asList(it.next().pkgList).contains(str)) {
                    activityManager.killBackgroundProcesses(str);
                }
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses2 = activityManager.getRunningAppProcesses();
            if (runningAppProcesses2 != null && runningAppProcesses2.size() != 0) {
                Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses2.iterator();
                while (it2.hasNext()) {
                    if (Arrays.asList(it2.next().pkgList).contains(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
