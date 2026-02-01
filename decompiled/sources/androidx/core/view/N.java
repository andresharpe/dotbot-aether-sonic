package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.InterfaceC0577u;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13157a = "MenuItemCompat";

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f13158b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f13159c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f13160d = 2;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f13161e = 4;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f13162f = 8;

    /* loaded from: classes.dex */
    class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f13163a;

        a(c cVar) {
            this.f13163a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f13163a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f13163a.onMenuItemActionExpand(menuItem);
        }
    }

    @androidx.annotation.W(26)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @InterfaceC0577u
        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @InterfaceC0577u
        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @InterfaceC0577u
        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @InterfaceC0577u
        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @InterfaceC0577u
        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @InterfaceC0577u
        static MenuItem g(MenuItem menuItem, char c4, int i4) {
            return menuItem.setAlphabeticShortcut(c4, i4);
        }

        @InterfaceC0577u
        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @InterfaceC0577u
        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @InterfaceC0577u
        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @InterfaceC0577u
        static MenuItem k(MenuItem menuItem, char c4, int i4) {
            return menuItem.setNumericShortcut(c4, i4);
        }

        @InterfaceC0577u
        static MenuItem l(MenuItem menuItem, char c4, char c5, int i4, int i5) {
            return menuItem.setShortcut(c4, c5, i4, i5);
        }

        @InterfaceC0577u
        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private N() {
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @androidx.annotation.P
    public static AbstractC0795b c(@androidx.annotation.N MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).b();
        }
        Log.w(f13157a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@androidx.annotation.N MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(menuItem);
        }
        return 0;
    }

    @androidx.annotation.P
    public static CharSequence f(@androidx.annotation.N MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(menuItem);
        }
        return null;
    }

    @androidx.annotation.P
    public static ColorStateList g(@androidx.annotation.N MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(menuItem);
        }
        return null;
    }

    @androidx.annotation.P
    public static PorterDuff.Mode h(@androidx.annotation.N MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.d(menuItem);
        }
        return null;
    }

    public static int i(@androidx.annotation.N MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.e(menuItem);
        }
        return 0;
    }

    @androidx.annotation.P
    public static CharSequence j(@androidx.annotation.N MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @androidx.annotation.P
    public static MenuItem l(@androidx.annotation.N MenuItem menuItem, @androidx.annotation.P AbstractC0795b abstractC0795b) {
        if (menuItem instanceof o.b) {
            return ((o.b) menuItem).a(abstractC0795b);
        }
        Log.w(f13157a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i4) {
        return menuItem.setActionView(i4);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@androidx.annotation.N MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof o.b) {
            ((o.b) menuItem).setAlphabeticShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c4, i4);
        }
    }

    public static void p(@androidx.annotation.N MenuItem menuItem, @androidx.annotation.P CharSequence charSequence) {
        if (menuItem instanceof o.b) {
            ((o.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@androidx.annotation.N MenuItem menuItem, @androidx.annotation.P ColorStateList colorStateList) {
        if (menuItem instanceof o.b) {
            ((o.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@androidx.annotation.N MenuItem menuItem, @androidx.annotation.P PorterDuff.Mode mode) {
        if (menuItem instanceof o.b) {
            ((o.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void s(@androidx.annotation.N MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof o.b) {
            ((o.b) menuItem).setNumericShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c4, i4);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@androidx.annotation.N MenuItem menuItem, char c4, char c5, int i4, int i5) {
        if (menuItem instanceof o.b) {
            ((o.b) menuItem).setShortcut(c4, c5, i4, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.l(menuItem, c4, c5, i4, i5);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i4) {
        menuItem.setShowAsAction(i4);
    }

    public static void w(@androidx.annotation.N MenuItem menuItem, @androidx.annotation.P CharSequence charSequence) {
        if (menuItem instanceof o.b) {
            ((o.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }
}
