package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import androidx.annotation.InterfaceC0577u;

/* loaded from: classes.dex */
public class k0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(26)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private k0() {
    }

    public static void a(@androidx.annotation.N View view, @androidx.annotation.P CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            n0.h(view, charSequence);
        }
    }
}
