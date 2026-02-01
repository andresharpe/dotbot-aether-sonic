package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class a {

    @W(28)
    /* renamed from: androidx.core.database.sqlite.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0085a {
        private C0085a() {
        }

        @InterfaceC0577u
        static void a(SQLiteCursor sQLiteCursor, boolean z3) {
            sQLiteCursor.setFillWindowForwardOnly(z3);
        }
    }

    private a() {
    }

    public static void a(@N SQLiteCursor sQLiteCursor, boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0085a.a(sQLiteCursor, z3);
        }
    }
}
