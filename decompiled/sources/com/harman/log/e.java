package com.harman.log;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static Toast f47585a;

    public static void a(Context context, int i4) {
        if (context != null) {
            b(context, context.getResources().getString(i4));
        }
    }

    public static void b(Context context, String str) {
        e();
        Toast makeText = Toast.makeText(context, str, 1);
        f47585a = makeText;
        makeText.show();
    }

    public static void c(Context context, int i4) {
        if (context != null) {
            d(context, context.getResources().getString(i4));
        }
    }

    private static void d(Context context, String str) {
        e();
        Toast makeText = Toast.makeText(context, str, 0);
        f47585a = makeText;
        makeText.show();
    }

    private static void e() {
        Toast toast = f47585a;
        if (toast != null) {
            toast.cancel();
            f47585a = null;
        }
    }
}
