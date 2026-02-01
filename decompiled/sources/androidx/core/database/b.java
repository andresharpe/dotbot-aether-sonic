package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class b {

    @W(15)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static CursorWindow a(String str) {
            return new CursorWindow(str);
        }
    }

    @W(28)
    /* renamed from: androidx.core.database.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0084b {
        private C0084b() {
        }

        @InterfaceC0577u
        static CursorWindow a(String str, long j4) {
            return new CursorWindow(str, j4);
        }
    }

    private b() {
    }

    @N
    public static CursorWindow a(@P String str, long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0084b.a(str, j4);
        }
        return a.a(str);
    }
}
