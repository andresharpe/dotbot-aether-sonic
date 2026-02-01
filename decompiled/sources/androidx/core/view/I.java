package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.InterfaceC0577u;
import o.InterfaceMenuC2377a;

/* loaded from: classes.dex */
public final class I {

    @androidx.annotation.W(28)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(Menu menu, boolean z3) {
            menu.setGroupDividerEnabled(z3);
        }
    }

    private I() {
    }

    public static void a(@androidx.annotation.N Menu menu, boolean z3) {
        if (menu instanceof InterfaceMenuC2377a) {
            ((InterfaceMenuC2377a) menu).setGroupDividerEnabled(z3);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z3);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i4) {
        menuItem.setShowAsAction(i4);
    }
}
