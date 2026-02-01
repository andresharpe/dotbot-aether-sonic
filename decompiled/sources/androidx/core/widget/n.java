package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class n {

    @W(19)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(ListView listView, int i4) {
            return listView.canScrollList(i4);
        }

        @InterfaceC0577u
        static void b(ListView listView, int i4) {
            listView.scrollListBy(i4);
        }
    }

    private n() {
    }

    public static boolean a(@N ListView listView, int i4) {
        return a.a(listView, i4);
    }

    public static void b(@N ListView listView, int i4) {
        a.b(listView, i4);
    }
}
