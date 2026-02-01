package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;

/* loaded from: classes2.dex */
final class u {
    private u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@N Context context, @d0 int i4) {
        Resources.Theme b4;
        context.getTheme().applyStyle(i4, true);
        if ((context instanceof Activity) && (b4 = b((Activity) context)) != null) {
            b4.applyStyle(i4, true);
        }
    }

    @P
    private static Resources.Theme b(@N Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window != null && (peekDecorView = window.peekDecorView()) != null && (context = peekDecorView.getContext()) != null) {
            return context.getTheme();
        }
        return null;
    }
}
