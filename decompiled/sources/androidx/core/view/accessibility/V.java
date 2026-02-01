package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

/* loaded from: classes.dex */
public class V {

    /* renamed from: b, reason: collision with root package name */
    private static final int f13411b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13412c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13413d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13414e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13415f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13416g = 5;

    /* renamed from: a, reason: collision with root package name */
    private final Object f13417a;

    /* JADX INFO: Access modifiers changed from: private */
    @W(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @InterfaceC0577u
        static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i4) {
            return accessibilityWindowInfo.getChild(i4);
        }

        @InterfaceC0577u
        static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @InterfaceC0577u
        static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @InterfaceC0577u
        static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @InterfaceC0577u
        static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @InterfaceC0577u
        static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @InterfaceC0577u
        static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @InterfaceC0577u
        static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @InterfaceC0577u
        static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @InterfaceC0577u
        static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @InterfaceC0577u
        static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        @InterfaceC0577u
        static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        @InterfaceC0577u
        static void n(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        @InterfaceC0577u
        static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @InterfaceC0577u
        static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @W(33)
    /* loaded from: classes.dex */
    private static class c {
        private c() {
        }

        @InterfaceC0577u
        static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @InterfaceC0577u
        static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @InterfaceC0577u
        static boolean c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    private V(Object obj) {
        this.f13417a = obj;
    }

    @androidx.annotation.P
    public static V q() {
        return v(a.l());
    }

    @androidx.annotation.P
    public static V r(@androidx.annotation.P V v3) {
        if (v3 == null) {
            return null;
        }
        return v(a.m((AccessibilityWindowInfo) v3.f13417a));
    }

    private static String t(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return "<UNKNOWN>";
                    }
                    return "TYPE_ACCESSIBILITY_OVERLAY";
                }
                return "TYPE_SYSTEM";
            }
            return "TYPE_INPUT_METHOD";
        }
        return "TYPE_APPLICATION";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static V v(Object obj) {
        if (obj != null) {
            return new V(obj);
        }
        return null;
    }

    @androidx.annotation.P
    public M a() {
        return M.d2(b.a((AccessibilityWindowInfo) this.f13417a));
    }

    public void b(@androidx.annotation.N Rect rect) {
        a.a((AccessibilityWindowInfo) this.f13417a, rect);
    }

    @androidx.annotation.P
    public V c(int i4) {
        return v(a.b((AccessibilityWindowInfo) this.f13417a, i4));
    }

    public int d() {
        return a.c((AccessibilityWindowInfo) this.f13417a);
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a((AccessibilityWindowInfo) this.f13417a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof V)) {
            return false;
        }
        V v3 = (V) obj;
        Object obj2 = this.f13417a;
        if (obj2 == null) {
            if (v3.f13417a == null) {
                return true;
            }
            return false;
        }
        return obj2.equals(v3.f13417a);
    }

    public int f() {
        return a.d((AccessibilityWindowInfo) this.f13417a);
    }

    public int g() {
        return a.e((AccessibilityWindowInfo) this.f13417a);
    }

    @androidx.annotation.P
    public V h() {
        return v(a.f((AccessibilityWindowInfo) this.f13417a));
    }

    public int hashCode() {
        Object obj = this.f13417a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void i(@androidx.annotation.N Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b((AccessibilityWindowInfo) this.f13417a, region);
            return;
        }
        Rect rect = new Rect();
        a.a((AccessibilityWindowInfo) this.f13417a, rect);
        region.set(rect);
    }

    @androidx.annotation.P
    public M j() {
        return M.d2(a.g((AccessibilityWindowInfo) this.f13417a));
    }

    @androidx.annotation.P
    public CharSequence k() {
        return b.b((AccessibilityWindowInfo) this.f13417a);
    }

    public int l() {
        return a.h((AccessibilityWindowInfo) this.f13417a);
    }

    public boolean m() {
        return a.i((AccessibilityWindowInfo) this.f13417a);
    }

    public boolean n() {
        return a.j((AccessibilityWindowInfo) this.f13417a);
    }

    public boolean o() {
        return a.k((AccessibilityWindowInfo) this.f13417a);
    }

    public boolean p() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.c((AccessibilityWindowInfo) this.f13417a);
        }
        return false;
    }

    public void s() {
        a.n((AccessibilityWindowInfo) this.f13417a);
    }

    @androidx.annotation.N
    public String toString() {
        boolean z3;
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(f());
        sb.append(", type=");
        sb.append(t(l()));
        sb.append(", layer=");
        sb.append(g());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(o());
        sb.append(", active=");
        sb.append(n());
        sb.append(", hasParent=");
        boolean z4 = false;
        if (h() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sb.append(z3);
        sb.append(", hasChildren=");
        if (d() > 0) {
            z4 = true;
        }
        sb.append(z4);
        sb.append(']');
        return sb.toString();
    }

    @androidx.annotation.P
    public AccessibilityWindowInfo u() {
        return (AccessibilityWindowInfo) this.f13417a;
    }
}
