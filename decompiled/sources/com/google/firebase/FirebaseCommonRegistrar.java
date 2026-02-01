package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.h;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.W;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34465a = "fire-android";

    /* renamed from: b, reason: collision with root package name */
    private static final String f34466b = "fire-core";

    /* renamed from: c, reason: collision with root package name */
    private static final String f34467c = "device-name";

    /* renamed from: d, reason: collision with root package name */
    private static final String f34468d = "device-model";

    /* renamed from: e, reason: collision with root package name */
    private static final String f34469e = "device-brand";

    /* renamed from: f, reason: collision with root package name */
    private static final String f34470f = "android-target-sdk";

    /* renamed from: g, reason: collision with root package name */
    private static final String f34471g = "android-min-sdk";

    /* renamed from: h, reason: collision with root package name */
    private static final String f34472h = "android-platform";

    /* renamed from: i, reason: collision with root package name */
    private static final String f34473i = "android-installer";

    /* renamed from: j, reason: collision with root package name */
    private static final String f34474j = "kotlin";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i4 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return W.f52989c;
        }
        if (i4 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return i(installerPackageName);
        }
        return "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1792f<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.platforminfo.c.c());
        arrayList.add(com.google.firebase.heartbeatinfo.h.h());
        arrayList.add(com.google.firebase.platforminfo.h.b(f34465a, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(f34466b, a.f34480f));
        arrayList.add(com.google.firebase.platforminfo.h.b(f34467c, i(Build.PRODUCT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(f34468d, i(Build.DEVICE)));
        arrayList.add(com.google.firebase.platforminfo.h.b(f34469e, i(Build.BRAND)));
        arrayList.add(com.google.firebase.platforminfo.h.c(f34470f, new h.a() { // from class: com.google.firebase.g
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String e4;
                e4 = FirebaseCommonRegistrar.e((Context) obj);
                return e4;
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(f34471g, new h.a() { // from class: com.google.firebase.h
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String f4;
                f4 = FirebaseCommonRegistrar.f((Context) obj);
                return f4;
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(f34472h, new h.a() { // from class: com.google.firebase.i
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String g4;
                g4 = FirebaseCommonRegistrar.g((Context) obj);
                return g4;
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(f34473i, new h.a() { // from class: com.google.firebase.j
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String h4;
                h4 = FirebaseCommonRegistrar.h((Context) obj);
                return h4;
            }
        }));
        String a4 = com.google.firebase.platforminfo.e.a();
        if (a4 != null) {
            arrayList.add(com.google.firebase.platforminfo.h.b(f34474j, a4));
        }
        return arrayList;
    }
}
