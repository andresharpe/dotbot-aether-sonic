package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@W(22)
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Method f12853a;

    @W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.telephony.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0097a {
        private C0097a() {
        }

        @InterfaceC0577u
        static int a(int i4) {
            return SubscriptionManager.getSlotIndex(i4);
        }
    }

    private a() {
    }

    public static int a(int i4) {
        if (i4 == -1) {
            return -1;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            return C0097a.a(i4);
        }
        try {
            if (f12853a == null) {
                if (i5 >= 26) {
                    f12853a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    f12853a = SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                f12853a.setAccessible(true);
            }
            Integer num = (Integer) f12853a.invoke(null, Integer.valueOf(i4));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
