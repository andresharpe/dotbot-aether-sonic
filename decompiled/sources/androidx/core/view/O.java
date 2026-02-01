package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class O {

    /* loaded from: classes.dex */
    public static final class a implements kotlin.sequences.m<MenuItem> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f13164a;

        a(Menu menu) {
            this.f13164a = menu;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<MenuItem> iterator() {
            return O.i(this.f13164a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<MenuItem>, Y2.d {

        /* renamed from: E, reason: collision with root package name */
        private int f13165E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Menu f13166F;

        b(Menu menu) {
            this.f13166F = menu;
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f13166F;
            int i4 = this.f13165E;
            this.f13165E = i4 + 1;
            MenuItem item = menu.getItem(i4);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13165E < this.f13166F.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            kotlin.H0 h02;
            Menu menu = this.f13166F;
            int i4 = this.f13165E - 1;
            this.f13165E = i4;
            MenuItem item = menu.getItem(i4);
            if (item != null) {
                kotlin.jvm.internal.F.o(item, "getItem(index)");
                menu.removeItem(item.getItemId());
                h02 = kotlin.H0.f51801a;
            } else {
                h02 = null;
            }
            if (h02 != null) {
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final boolean a(@l3.d Menu menu, @l3.d MenuItem item) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        kotlin.jvm.internal.F.p(item, "item");
        int size = menu.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (kotlin.jvm.internal.F.g(menu.getItem(i4), item)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@l3.d Menu menu, @l3.d X2.l<? super MenuItem, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int size = menu.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = menu.getItem(i4);
            kotlin.jvm.internal.F.o(item, "getItem(index)");
            action.C(item);
        }
    }

    public static final void c(@l3.d Menu menu, @l3.d X2.p<? super Integer, ? super MenuItem, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int size = menu.size();
        for (int i4 = 0; i4 < size; i4++) {
            Integer valueOf = Integer.valueOf(i4);
            MenuItem item = menu.getItem(i4);
            kotlin.jvm.internal.F.o(item, "getItem(index)");
            action.c0(valueOf, item);
        }
    }

    @l3.d
    public static final MenuItem d(@l3.d Menu menu, int i4) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        MenuItem item = menu.getItem(i4);
        kotlin.jvm.internal.F.o(item, "getItem(index)");
        return item;
    }

    @l3.d
    public static final kotlin.sequences.m<MenuItem> e(@l3.d Menu menu) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        return new a(menu);
    }

    public static final int f(@l3.d Menu menu) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        return menu.size();
    }

    public static final boolean g(@l3.d Menu menu) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(@l3.d Menu menu) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final Iterator<MenuItem> i(@l3.d Menu menu) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        return new b(menu);
    }

    public static final void j(@l3.d Menu menu, @l3.d MenuItem item) {
        kotlin.jvm.internal.F.p(menu, "<this>");
        kotlin.jvm.internal.F.p(item, "item");
        menu.removeItem(item.getItemId());
    }

    public static final void k(@l3.d Menu menu, int i4) {
        kotlin.H0 h02;
        kotlin.jvm.internal.F.p(menu, "<this>");
        MenuItem item = menu.getItem(i4);
        if (item != null) {
            menu.removeItem(item.getItemId());
            h02 = kotlin.H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 != null) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
