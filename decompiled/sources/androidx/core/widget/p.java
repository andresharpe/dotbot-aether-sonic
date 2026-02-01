package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13815a = "PopupWindowCompatApi21";

    /* renamed from: b, reason: collision with root package name */
    private static Method f13816b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13817c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f13818d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f13819e;

    /* renamed from: f, reason: collision with root package name */
    private static Field f13820f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f13821g;

    @W(19)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(PopupWindow popupWindow, View view, int i4, int i5, int i6) {
            popupWindow.showAsDropDown(view, i4, i5, i6);
        }
    }

    @W(23)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @InterfaceC0577u
        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @InterfaceC0577u
        static void c(PopupWindow popupWindow, boolean z3) {
            popupWindow.setOverlapAnchor(z3);
        }

        @InterfaceC0577u
        static void d(PopupWindow popupWindow, int i4) {
            popupWindow.setWindowLayoutType(i4);
        }
    }

    private p() {
    }

    public static boolean a(@N PopupWindow popupWindow) {
        return b.a(popupWindow);
    }

    public static int b(@N PopupWindow popupWindow) {
        return b.b(popupWindow);
    }

    public static void c(@N PopupWindow popupWindow, boolean z3) {
        b.c(popupWindow, z3);
    }

    public static void d(@N PopupWindow popupWindow, int i4) {
        b.d(popupWindow, i4);
    }

    public static void e(@N PopupWindow popupWindow, @N View view, int i4, int i5, int i6) {
        a.a(popupWindow, view, i4, i5, i6);
    }
}
