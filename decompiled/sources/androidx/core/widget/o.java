package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class o {

    @W(19)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static View.OnTouchListener a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    private o() {
    }

    @P
    public static View.OnTouchListener a(@N Object obj) {
        return a.a((PopupMenu) obj);
    }
}
