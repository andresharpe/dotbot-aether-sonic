package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import com.google.firebase.messaging.C1821f;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, a> f12562b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final String f12563c = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a, reason: collision with root package name */
    private final Context f12564a;

    @W(17)
    /* renamed from: androidx.core.hardware.display.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0087a {
        private C0087a() {
        }

        @InterfaceC0577u
        static Display a(DisplayManager displayManager, int i4) {
            return displayManager.getDisplay(i4);
        }

        @InterfaceC0577u
        static Display[] b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    private a(Context context) {
        this.f12564a = context;
    }

    @N
    public static a d(@N Context context) {
        a aVar;
        WeakHashMap<Context, a> weakHashMap = f12562b;
        synchronized (weakHashMap) {
            try {
                aVar = weakHashMap.get(context);
                if (aVar == null) {
                    aVar = new a(context);
                    weakHashMap.put(context, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @P
    public Display a(int i4) {
        return C0087a.a((DisplayManager) this.f12564a.getSystemService(C1821f.C0339f.a.f37007S), i4);
    }

    @N
    public Display[] b() {
        return C0087a.b((DisplayManager) this.f12564a.getSystemService(C1821f.C0339f.a.f37007S));
    }

    @N
    public Display[] c(@P String str) {
        return C0087a.b((DisplayManager) this.f12564a.getSystemService(C1821f.C0339f.a.f37007S));
    }
}
