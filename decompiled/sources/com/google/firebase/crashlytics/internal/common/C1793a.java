package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import s1.InterfaceC2409b;

/* renamed from: com.google.firebase.crashlytics.internal.common.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1793a {

    /* renamed from: a, reason: collision with root package name */
    public final String f35028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35029b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35030c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35031d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35032e;

    /* renamed from: f, reason: collision with root package name */
    public final String f35033f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2409b f35034g;

    public C1793a(String str, String str2, String str3, String str4, String str5, String str6, InterfaceC2409b interfaceC2409b) {
        this.f35028a = str;
        this.f35029b = str2;
        this.f35030c = str3;
        this.f35031d = str4;
        this.f35032e = str5;
        this.f35033f = str6;
        this.f35034g = interfaceC2409b;
    }

    public static C1793a a(Context context, x xVar, String str, String str2, InterfaceC2409b interfaceC2409b) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g4 = xVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = x.f35203g;
        }
        return new C1793a(str, str2, g4, packageName, num, str3, interfaceC2409b);
    }
}
