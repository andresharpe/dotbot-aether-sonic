package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class t extends p implements SubMenu {

    /* renamed from: p, reason: collision with root package name */
    private final o.c f5458p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, o.c cVar) {
        super(context, cVar);
        this.f5458p = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f5458p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.f5458p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        this.f5458p.setHeaderIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        this.f5458p.setHeaderTitle(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f5458p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.f5458p.setIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f5458p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f5458p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f5458p.setIcon(drawable);
        return this;
    }
}
