package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class s extends g implements SubMenu {

    /* renamed from: Q, reason: collision with root package name */
    private g f5456Q;

    /* renamed from: R, reason: collision with root package name */
    private j f5457R;

    public s(Context context, g gVar, j jVar) {
        super(context);
        this.f5456Q = gVar;
        this.f5457R = jVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public g G() {
        return this.f5456Q.G();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean I() {
        return this.f5456Q.I();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean J() {
        return this.f5456Q.J();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean K() {
        return this.f5456Q.K();
    }

    @Override // androidx.appcompat.view.menu.g
    public void X(g.a aVar) {
        this.f5456Q.X(aVar);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean g(j jVar) {
        return this.f5456Q.g(jVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f5457R;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.g
    public boolean i(@N g gVar, @N MenuItem menuItem) {
        if (!super.i(gVar, menuItem) && !this.f5456Q.i(gVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.g
    public void j0(boolean z3) {
        this.f5456Q.j0(z3);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean n(j jVar) {
        return this.f5456Q.n(jVar);
    }

    public Menu n0() {
        return this.f5456Q;
    }

    @Override // androidx.appcompat.view.menu.g, o.InterfaceMenuC2377a, android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f5456Q.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.c0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.f0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.g0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f5457R.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f5456Q.setQwertyMode(z3);
    }

    @Override // androidx.appcompat.view.menu.g
    public String w() {
        int i4;
        j jVar = this.f5457R;
        if (jVar != null) {
            i4 = jVar.getItemId();
        } else {
            i4 = 0;
        }
        if (i4 == 0) {
            return null;
        }
        return super.w() + ":" + i4;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        return (SubMenu) super.b0(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        return (SubMenu) super.e0(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.f5457R.setIcon(i4);
        return this;
    }
}
