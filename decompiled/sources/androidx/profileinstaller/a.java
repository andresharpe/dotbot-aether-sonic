package androidx.profileinstaller;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.W;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
class a {

    @W(api = 21)
    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0164a {
        private C0164a() {
        }

        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @W(api = 24)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    private a() {
    }

    static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z3 = true;
            for (File file2 : listFiles) {
                if (a(file2) && z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            return z3;
        }
        file.delete();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@N Context context, @N ProfileInstallReceiver.a aVar) {
        if (a(b.a(context))) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
