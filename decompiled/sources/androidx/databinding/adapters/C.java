package androidx.databinding.adapters;

import android.widget.TabHost;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class C {

    /* loaded from: classes.dex */
    class a implements TabHost.OnTabChangeListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ TabHost.OnTabChangeListener f14021E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14022F;

        a(TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
            this.f14021E = onTabChangeListener;
            this.f14022F = oVar;
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f14021E;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f14022F.a();
        }
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static int a(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static String b(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @InterfaceC0879d({"android:currentTab"})
    public static void c(TabHost tabHost, int i4) {
        if (tabHost.getCurrentTab() != i4) {
            tabHost.setCurrentTab(i4);
        }
    }

    @InterfaceC0879d({"android:currentTab"})
    public static void d(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag != null && !currentTabTag.equals(str)) || (currentTabTag == null && str != null)) {
            tabHost.setCurrentTabByTag(str);
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void e(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new a(onTabChangeListener, oVar));
        }
    }
}
