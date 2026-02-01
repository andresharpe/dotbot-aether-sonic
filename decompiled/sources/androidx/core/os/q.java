package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f12753a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f12754b = true;

    @W(22)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(Message message) {
            return message.isAsynchronous();
        }

        @InterfaceC0577u
        static void b(Message message, boolean z3) {
            message.setAsynchronous(z3);
        }
    }

    private q() {
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@androidx.annotation.N Message message) {
        return a.a(message);
    }

    @SuppressLint({"NewApi"})
    public static void b(@androidx.annotation.N Message message, boolean z3) {
        a.b(message, z3);
    }
}
