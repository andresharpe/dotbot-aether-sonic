package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0572o;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import androidx.appcompat.app.C0584b;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p0;
import androidx.core.app.C0617b;
import androidx.core.app.C0660x;
import androidx.core.app.z1;
import androidx.core.os.C0750m;
import androidx.fragment.app.ActivityC0889g;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.savedstate.c;

/* renamed from: androidx.appcompat.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC0587e extends ActivityC0889g implements f, z1.b, C0584b.c {

    /* renamed from: g0, reason: collision with root package name */
    private static final String f4845g0 = "androidx:appcompat";

    /* renamed from: e0, reason: collision with root package name */
    private i f4846e0;

    /* renamed from: f0, reason: collision with root package name */
    private Resources f4847f0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.e$a */
    /* loaded from: classes.dex */
    public class a implements c.InterfaceC0173c {
        a() {
        }

        @Override // androidx.savedstate.c.InterfaceC0173c
        @N
        public Bundle a() {
            Bundle bundle = new Bundle();
            ActivityC0587e.this.l0().Q(bundle);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.e$b */
    /* loaded from: classes.dex */
    public class b implements androidx.activity.contextaware.c {
        b() {
        }

        @Override // androidx.activity.contextaware.c
        public void a(@N Context context) {
            i l02 = ActivityC0587e.this.l0();
            l02.E();
            l02.M(ActivityC0587e.this.getSavedStateRegistry().b(ActivityC0587e.f4845g0));
        }
    }

    public ActivityC0587e() {
        n0();
    }

    private void L() {
        s0.b(getWindow().getDecorView(), this);
        u0.b(getWindow().getDecorView(), this);
        androidx.savedstate.g.b(getWindow().getDecorView(), this);
        androidx.activity.t.b(getWindow().getDecorView(), this);
    }

    private void n0() {
        getSavedStateRegistry().j(f4845g0, new a());
        z(new b());
    }

    private boolean u0(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @P
    public androidx.appcompat.view.b A0(@N b.a aVar) {
        return l0().k0(aVar);
    }

    public void B0(@N Intent intent) {
        C0660x.g(this, intent);
    }

    public boolean C0(int i4) {
        return l0().V(i4);
    }

    public boolean D0(@N Intent intent) {
        return C0660x.h(this, intent);
    }

    @Override // androidx.appcompat.app.C0584b.c
    @P
    public C0584b.InterfaceC0042b a() {
        return l0().w();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        l0().f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(l0().m(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0583a m02 = m0();
        if (getWindow().hasFeature(0)) {
            if (m02 == null || !m02.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0637l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0583a m02 = m0();
        if (keyCode == 82 && m02 != null && m02.L(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@androidx.annotation.D int i4) {
        return (T) l0().s(i4);
    }

    @Override // androidx.appcompat.app.f
    @InterfaceC0566i
    public void g(@N androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Activity
    @N
    public MenuInflater getMenuInflater() {
        return l0().z();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f4847f0 == null && p0.d()) {
            this.f4847f0 = new p0(this, super.getResources());
        }
        Resources resources = this.f4847f0;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    @Override // androidx.appcompat.app.f
    @InterfaceC0566i
    public void h(@N androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.fragment.app.ActivityC0889g
    public void i0() {
        l0().F();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        l0().F();
    }

    @N
    public i l0() {
        if (this.f4846e0 == null) {
            this.f4846e0 = i.n(this, this);
        }
        return this.f4846e0;
    }

    @P
    public AbstractC0583a m0() {
        return l0().C();
    }

    public void o0(@N z1 z1Var) {
        z1Var.d(this);
    }

    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l0().L(configuration);
        if (this.f4847f0 != null) {
            this.f4847f0.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        s0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l0().N();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (u0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, @N MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        AbstractC0583a m02 = m0();
        if (menuItem.getItemId() == 16908332 && m02 != null && (m02.p() & 4) != 0) {
            return t0();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, @N Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(@P Bundle bundle) {
        super.onPostCreate(bundle);
        l0().O(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        l0().P();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onStart() {
        super.onStart();
        l0().R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onStop() {
        super.onStop();
        l0().S();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        l0().j0(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0583a m02 = m0();
        if (getWindow().hasFeature(0)) {
            if (m02 == null || !m02.M()) {
                super.openOptionsMenu();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p0(@N C0750m c0750m) {
    }

    @Override // androidx.core.app.z1.b
    @P
    public Intent q() {
        return C0660x.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q0(int i4) {
    }

    public void r0(@N z1 z1Var) {
    }

    @Override // androidx.appcompat.app.f
    @P
    public androidx.appcompat.view.b s(@N b.a aVar) {
        return null;
    }

    @Deprecated
    public void s0() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@I int i4) {
        L();
        l0().Z(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@d0 int i4) {
        super.setTheme(i4);
        l0().i0(i4);
    }

    public boolean t0() {
        Intent q4 = q();
        if (q4 != null) {
            if (D0(q4)) {
                z1 j4 = z1.j(this);
                o0(j4);
                r0(j4);
                j4.r();
                try {
                    C0617b.z(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            B0(q4);
            return true;
        }
        return false;
    }

    public void v0(@P Toolbar toolbar) {
        l0().h0(toolbar);
    }

    @Deprecated
    public void w0(int i4) {
    }

    @Deprecated
    public void x0(boolean z3) {
    }

    @Deprecated
    public void y0(boolean z3) {
    }

    @Deprecated
    public void z0(boolean z3) {
    }

    @InterfaceC0572o
    public ActivityC0587e(@I int i4) {
        super(i4);
        n0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        L();
        l0().a0(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        l0().b0(view, layoutParams);
    }
}
