package com.blankj.utilcode.util;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0671f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class K {
    private K() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Intent A(@androidx.annotation.P String str, LinkedList<String> linkedList) {
        ArrayList arrayList = new ArrayList();
        if (linkedList != null) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                File P3 = H0.P(it.next());
                if (P3 != null) {
                    arrayList.add(P3);
                }
            }
        }
        return B(str, arrayList);
    }

    public static Intent B(@androidx.annotation.P String str, List<File> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                Uri C3 = H0.C(it.next());
                if (C3 != null) {
                    arrayList.add(C3);
                }
            }
        }
        return z(str, arrayList);
    }

    public static Intent C(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return l(Intent.createChooser(intent, ""), true);
    }

    public static Intent D() {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 26) {
            intent = new Intent("com.android.internal.intent.action.REQUEST_SHUTDOWN");
        } else {
            intent = new Intent("android.intent.action.ACTION_REQUEST_SHUTDOWN");
        }
        intent.putExtra("android.intent.extra.KEY_CONFIRM", false);
        return intent.addFlags(268435456);
    }

    public static Intent E(String str) {
        Intent intent = new Intent("android.intent.action.DELETE");
        intent.setData(Uri.parse("package:" + str));
        return intent.addFlags(268435456);
    }

    public static boolean F(Intent intent) {
        if (E0.a().getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    @androidx.annotation.Y("android.permission.CALL_PHONE")
    public static Intent a(@androidx.annotation.N String str) {
        return l(new Intent("android.intent.action.CALL", Uri.parse("tel:" + Uri.encode(str))), true);
    }

    public static Intent b(Uri uri) {
        return c(uri, false);
    }

    public static Intent c(Uri uri, boolean z3) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.addFlags(1);
        return l(intent, z3);
    }

    public static Intent d(String str, String str2) {
        return f(str, str2, null, false);
    }

    public static Intent e(String str, String str2, Bundle bundle) {
        return f(str, str2, bundle, false);
    }

    public static Intent f(String str, String str2, Bundle bundle, boolean z3) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        return l(intent, z3);
    }

    public static Intent g(String str, String str2, boolean z3) {
        return f(str, str2, null, z3);
    }

    public static Intent h(@androidx.annotation.N String str) {
        return l(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str))), true);
    }

    public static Intent i(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.setFlags(1);
        return intent.addFlags(268435456);
    }

    public static Intent j(File file) {
        if (!H0.u0(file)) {
            return null;
        }
        return i(C0671f.f(E0.a(), E0.a().getPackageName() + ".utilcode.fileprovider", file));
    }

    public static Intent k(String str) {
        return j(H0.P(str));
    }

    private static Intent l(Intent intent, boolean z3) {
        if (z3) {
            return intent.addFlags(268435456);
        }
        return intent;
    }

    public static Intent m(String str) {
        return n(str, false);
    }

    public static Intent n(String str, boolean z3) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        return l(intent, z3);
    }

    public static Intent o(String str) {
        String Z3 = H0.Z(str);
        if (H0.D0(Z3)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClassName(str, Z3);
        return intent.addFlags(268435456);
    }

    public static Intent p(@androidx.annotation.N String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + Uri.encode(str)));
        intent.putExtra("sms_body", str2);
        return l(intent, true);
    }

    public static Intent q(Uri uri) {
        return w("", uri);
    }

    public static Intent r(File file) {
        return x("", file);
    }

    public static Intent s(String str) {
        return y("", str);
    }

    public static Intent t(ArrayList<Uri> arrayList) {
        return z("", arrayList);
    }

    public static Intent u(LinkedList<String> linkedList) {
        return A("", linkedList);
    }

    public static Intent v(List<File> list) {
        return B("", list);
    }

    public static Intent w(@androidx.annotation.P String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/*");
        return l(Intent.createChooser(intent, ""), true);
    }

    public static Intent x(@androidx.annotation.P String str, File file) {
        return w(str, H0.C(file));
    }

    public static Intent y(@androidx.annotation.P String str, String str2) {
        return x(str, H0.P(str2));
    }

    public static Intent z(@androidx.annotation.P String str, ArrayList<Uri> arrayList) {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        intent.setType("image/*");
        return l(Intent.createChooser(intent, ""), true);
    }
}
