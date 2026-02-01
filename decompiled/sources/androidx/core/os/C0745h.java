package androidx.core.os;

import android.os.Environment;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import java.io.File;

/* renamed from: androidx.core.os.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12737a = "EnvironmentCompat";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12738b = "unknown";

    @W(19)
    /* renamed from: androidx.core.os.h$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static String a(File file) {
            return Environment.getStorageState(file);
        }
    }

    @W(21)
    /* renamed from: androidx.core.os.h$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private C0745h() {
    }

    @androidx.annotation.N
    public static String a(@androidx.annotation.N File file) {
        return b.a(file);
    }
}
