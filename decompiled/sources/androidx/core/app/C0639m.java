package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0639m {

    @androidx.annotation.W(28)
    /* renamed from: androidx.core.app.m$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static <T> T a(Dialog dialog, int i4) {
            return (T) dialog.requireViewById(i4);
        }
    }

    private C0639m() {
    }

    @androidx.annotation.N
    public static View a(@androidx.annotation.N Dialog dialog, int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i4);
        }
        View findViewById = dialog.findViewById(i4);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
