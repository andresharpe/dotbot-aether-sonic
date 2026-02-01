package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0795b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f13457d = "ActionProvider(support)";

    /* renamed from: a, reason: collision with root package name */
    private final Context f13458a;

    /* renamed from: b, reason: collision with root package name */
    private a f13459b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0107b f13460c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.b$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z3);
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0107b {
        void onActionProviderVisibilityChanged(boolean z3);
    }

    public AbstractC0795b(@androidx.annotation.N Context context) {
        this.f13458a = context;
    }

    @androidx.annotation.N
    public Context a() {
        return this.f13458a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    @androidx.annotation.N
    public abstract View d();

    @androidx.annotation.N
    public View e(@androidx.annotation.N MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(@androidx.annotation.N SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f13460c != null && h()) {
            this.f13460c.onActionProviderVisibilityChanged(c());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f13460c = null;
        this.f13459b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k(@androidx.annotation.P a aVar) {
        this.f13459b = aVar;
    }

    public void l(@androidx.annotation.P InterfaceC0107b interfaceC0107b) {
        if (this.f13460c != null && interfaceC0107b != null) {
            Log.w(f13457d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f13460c = interfaceC0107b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void m(boolean z3) {
        a aVar = this.f13459b;
        if (aVar != null) {
            aVar.a(z3);
        }
    }
}
