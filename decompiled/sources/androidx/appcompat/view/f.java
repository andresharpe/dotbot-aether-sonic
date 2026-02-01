package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import androidx.collection.l;
import java.util.ArrayList;
import o.InterfaceMenuC2377a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f5126a;

    /* renamed from: b, reason: collision with root package name */
    final b f5127b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f5128a;

        /* renamed from: b, reason: collision with root package name */
        final Context f5129b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f5130c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final l<Menu, Menu> f5131d = new l<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f5129b = context;
            this.f5128a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f5131d.get(menu);
            if (menu2 == null) {
                p pVar = new p(this.f5129b, (InterfaceMenuC2377a) menu);
                this.f5131d.put(menu, pVar);
                return pVar;
            }
            return menu2;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f5128a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f5128a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f5128a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f5128a.onActionItemClicked(e(bVar), new k(this.f5129b, (o.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f5130c.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = this.f5130c.get(i4);
                if (fVar != null && fVar.f5127b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f5129b, bVar);
            this.f5130c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f5126a = context;
        this.f5127b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f5127b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f5127b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p(this.f5126a, (InterfaceMenuC2377a) this.f5127b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f5127b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f5127b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f5127b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f5127b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f5127b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f5127b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f5127b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f5127b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f5127b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f5127b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f5127b.s(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z3) {
        this.f5127b.t(z3);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i4) {
        this.f5127b.o(i4);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i4) {
        this.f5127b.r(i4);
    }
}
