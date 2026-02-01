package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776c {

    @Deprecated
    /* renamed from: androidx.core.view.accessibility.c$a */
    /* loaded from: classes.dex */
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z3);
    }

    @Deprecated
    /* renamed from: androidx.core.view.accessibility.c$b */
    /* loaded from: classes.dex */
    public static abstract class b implements a {
    }

    /* renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class AccessibilityManagerAccessibilityStateChangeListenerC0106c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        a f13452a;

        AccessibilityManagerAccessibilityStateChangeListenerC0106c(@androidx.annotation.N a aVar) {
            this.f13452a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0106c)) {
                return false;
            }
            return this.f13452a.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0106c) obj).f13452a);
        }

        public int hashCode() {
            return this.f13452a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z3) {
            this.f13452a.onAccessibilityStateChanged(z3);
        }
    }

    @W(19)
    /* renamed from: androidx.core.view.accessibility.c$d */
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @InterfaceC0577u
        static boolean a(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
        }

        @InterfaceC0577u
        static boolean b(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$e */
    /* loaded from: classes.dex */
    public interface e {
        void onTouchExplorationStateChanged(boolean z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(19)
    /* renamed from: androidx.core.view.accessibility.c$f */
    /* loaded from: classes.dex */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final e f13453a;

        f(@androidx.annotation.N e eVar) {
            this.f13453a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return this.f13453a.equals(((f) obj).f13453a);
        }

        public int hashCode() {
            return this.f13453a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z3) {
            this.f13453a.onTouchExplorationStateChanged(z3);
        }
    }

    private C0776c() {
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0106c(aVar));
    }

    public static boolean b(@androidx.annotation.N AccessibilityManager accessibilityManager, @androidx.annotation.N e eVar) {
        return d.a(accessibilityManager, eVar);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i4) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i4);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0106c(aVar));
    }

    public static boolean g(@androidx.annotation.N AccessibilityManager accessibilityManager, @androidx.annotation.N e eVar) {
        return d.b(accessibilityManager, eVar);
    }
}
