package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static View.OnTouchListener a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    private l() {
    }

    @P
    public static View.OnTouchListener a(@N ListPopupWindow listPopupWindow, @N View view) {
        return a.a(listPopupWindow, view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}
