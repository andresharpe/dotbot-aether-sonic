package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: l, reason: collision with root package name */
    final Context f5266l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.collection.l<o.b, MenuItem> f5267m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.collection.l<o.c, SubMenu> f5268n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f5266l = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem e(MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            o.b bVar = (o.b) menuItem;
            if (this.f5267m == null) {
                this.f5267m = new androidx.collection.l<>();
            }
            MenuItem menuItem2 = this.f5267m.get(bVar);
            if (menuItem2 == null) {
                k kVar = new k(this.f5266l, bVar);
                this.f5267m.put(bVar, kVar);
                return kVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu f(SubMenu subMenu) {
        if (subMenu instanceof o.c) {
            o.c cVar = (o.c) subMenu;
            if (this.f5268n == null) {
                this.f5268n = new androidx.collection.l<>();
            }
            SubMenu subMenu2 = this.f5268n.get(cVar);
            if (subMenu2 == null) {
                t tVar = new t(this.f5266l, cVar);
                this.f5268n.put(cVar, tVar);
                return tVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        androidx.collection.l<o.b, MenuItem> lVar = this.f5267m;
        if (lVar != null) {
            lVar.clear();
        }
        androidx.collection.l<o.c, SubMenu> lVar2 = this.f5268n;
        if (lVar2 != null) {
            lVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i4) {
        if (this.f5267m == null) {
            return;
        }
        int i5 = 0;
        while (i5 < this.f5267m.size()) {
            if (this.f5267m.m(i5).getGroupId() == i4) {
                this.f5267m.o(i5);
                i5--;
            }
            i5++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i4) {
        if (this.f5267m == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f5267m.size(); i5++) {
            if (this.f5267m.m(i5).getItemId() == i4) {
                this.f5267m.o(i5);
                return;
            }
        }
    }
}
