package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

/* loaded from: classes.dex */
public class O {

    @W(24)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private O() {
    }

    public static boolean a(@androidx.annotation.N Context context) {
        return a.a(context);
    }
}
