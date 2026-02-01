package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.core.content.C0669d;
import androidx.core.view.AbstractC0795b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceMenuC2377a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g implements InterfaceMenuC2377a {

    /* renamed from: L, reason: collision with root package name */
    private static final String f5329L = "MenuBuilder";

    /* renamed from: M, reason: collision with root package name */
    private static final String f5330M = "android:menu:presenters";

    /* renamed from: N, reason: collision with root package name */
    private static final String f5331N = "android:menu:actionviewstates";

    /* renamed from: O, reason: collision with root package name */
    private static final String f5332O = "android:menu:expandedactionview";

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f5333P = {1, 4, 5, 3, 2, 0};

    /* renamed from: A, reason: collision with root package name */
    View f5334A;

    /* renamed from: I, reason: collision with root package name */
    private j f5342I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f5344K;

    /* renamed from: l, reason: collision with root package name */
    private final Context f5345l;

    /* renamed from: m, reason: collision with root package name */
    private final Resources f5346m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5347n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5348o;

    /* renamed from: p, reason: collision with root package name */
    private a f5349p;

    /* renamed from: x, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f5357x;

    /* renamed from: y, reason: collision with root package name */
    CharSequence f5358y;

    /* renamed from: z, reason: collision with root package name */
    Drawable f5359z;

    /* renamed from: w, reason: collision with root package name */
    private int f5356w = 0;

    /* renamed from: B, reason: collision with root package name */
    private boolean f5335B = false;

    /* renamed from: C, reason: collision with root package name */
    private boolean f5336C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f5337D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f5338E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f5339F = false;

    /* renamed from: G, reason: collision with root package name */
    private ArrayList<j> f5340G = new ArrayList<>();

    /* renamed from: H, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<n>> f5341H = new CopyOnWriteArrayList<>();

    /* renamed from: J, reason: collision with root package name */
    private boolean f5343J = false;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<j> f5350q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<j> f5351r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private boolean f5352s = true;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<j> f5353t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<j> f5354u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    private boolean f5355v = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        boolean a(@N g gVar, @N MenuItem menuItem);

        void b(@N g gVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface b {
        boolean a(j jVar);
    }

    public g(Context context) {
        this.f5345l = context;
        this.f5346m = context.getResources();
        k0(true);
    }

    private static int E(int i4) {
        int i5 = ((-65536) & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = f5333P;
            if (i5 < iArr.length) {
                return (i4 & 65535) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void R(int i4, boolean z3) {
        if (i4 >= 0 && i4 < this.f5350q.size()) {
            this.f5350q.remove(i4);
            if (z3) {
                N(true);
            }
        }
    }

    private void d0(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources F3 = F();
        if (view != null) {
            this.f5334A = view;
            this.f5358y = null;
            this.f5359z = null;
        } else {
            if (i4 > 0) {
                this.f5358y = F3.getText(i4);
            } else if (charSequence != null) {
                this.f5358y = charSequence;
            }
            if (i5 > 0) {
                this.f5359z = C0669d.i(x(), i5);
            } else if (drawable != null) {
                this.f5359z = drawable;
            }
            this.f5334A = null;
        }
        N(false);
    }

    private j h(int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        return new j(this, i4, i5, i6, i7, charSequence, i8);
    }

    private void j(boolean z3) {
        if (this.f5341H.isEmpty()) {
            return;
        }
        m0();
        Iterator<WeakReference<n>> it = this.f5341H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.f5341H.remove(next);
            } else {
                nVar.d(z3);
            }
        }
        l0();
    }

    private void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f5330M);
        if (sparseParcelableArray != null && !this.f5341H.isEmpty()) {
            Iterator<WeakReference<n>> it = this.f5341H.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.f5341H.remove(next);
                } else {
                    int id = nVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        nVar.j(parcelable);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.C0832m0.g(android.view.ViewConfiguration.get(r2.f5345l), r2.f5345l) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f5346m
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f5345l
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f5345l
            boolean r3 = androidx.core.view.C0832m0.g(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f5348o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.k0(boolean):void");
    }

    private void l(Bundle bundle) {
        Parcelable n4;
        if (this.f5341H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<n>> it = this.f5341H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.f5341H.remove(next);
            } else {
                int id = nVar.getId();
                if (id > 0 && (n4 = nVar.n()) != null) {
                    sparseArray.put(id, n4);
                }
            }
        }
        bundle.putSparseParcelableArray(f5330M, sparseArray);
    }

    private boolean m(s sVar, n nVar) {
        boolean z3 = false;
        if (this.f5341H.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z3 = nVar.l(sVar);
        }
        Iterator<WeakReference<n>> it = this.f5341H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null) {
                this.f5341H.remove(next);
            } else if (!z3) {
                z3 = nVar2.l(sVar);
            }
        }
        return z3;
    }

    private static int q(ArrayList<j> arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f5358y;
    }

    public View B() {
        return this.f5334A;
    }

    public ArrayList<j> C() {
        u();
        return this.f5354u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        return this.f5338E;
    }

    Resources F() {
        return this.f5346m;
    }

    public g G() {
        return this;
    }

    @N
    public ArrayList<j> H() {
        if (!this.f5352s) {
            return this.f5351r;
        }
        this.f5351r.clear();
        int size = this.f5350q.size();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = this.f5350q.get(i4);
            if (jVar.isVisible()) {
                this.f5351r.add(jVar);
            }
        }
        this.f5352s = false;
        this.f5355v = true;
        return this.f5351r;
    }

    public boolean I() {
        return this.f5343J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J() {
        return this.f5347n;
    }

    public boolean K() {
        return this.f5348o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(j jVar) {
        this.f5355v = true;
        N(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(j jVar) {
        this.f5352s = true;
        N(true);
    }

    public void N(boolean z3) {
        if (!this.f5335B) {
            if (z3) {
                this.f5352s = true;
                this.f5355v = true;
            }
            j(z3);
            return;
        }
        this.f5336C = true;
        if (z3) {
            this.f5337D = true;
        }
    }

    public boolean O(MenuItem menuItem, int i4) {
        return P(menuItem, null, i4);
    }

    public boolean P(MenuItem menuItem, n nVar, int i4) {
        boolean z3;
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean n4 = jVar.n();
        AbstractC0795b b4 = jVar.b();
        if (b4 != null && b4.b()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar.m()) {
            n4 |= jVar.expandActionView();
            if (n4) {
                f(true);
            }
        } else if (!jVar.hasSubMenu() && !z3) {
            if ((i4 & 1) == 0) {
                f(true);
            }
        } else {
            if ((i4 & 4) == 0) {
                f(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.A(new s(x(), this, jVar));
            }
            s sVar = (s) jVar.getSubMenu();
            if (z3) {
                b4.g(sVar);
            }
            n4 |= m(sVar, nVar);
            if (!n4) {
                f(true);
            }
        }
        return n4;
    }

    public void Q(int i4) {
        R(i4, true);
    }

    public void S(n nVar) {
        Iterator<WeakReference<n>> it = this.f5341H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.f5341H.remove(next);
            }
        }
    }

    public void T(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).T(bundle);
            }
        }
        int i5 = bundle.getInt(f5332O);
        if (i5 > 0 && (findItem = findItem(i5)) != null) {
            findItem.expandActionView();
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(f5332O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void W(Bundle bundle) {
        l(bundle);
    }

    public void X(a aVar) {
        this.f5349p = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f5357x = contextMenuInfo;
    }

    public g Z(int i4) {
        this.f5356w = i4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuItem a(int i4, int i5, int i6, CharSequence charSequence) {
        int E3 = E(i6);
        j h4 = h(i4, i5, i6, E3, charSequence, this.f5356w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f5357x;
        if (contextMenuInfo != null) {
            h4.y(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.f5350q;
        arrayList.add(q(arrayList, E3), h4);
        N(true);
        return h4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(MenuItem menuItem) {
        boolean z3;
        int groupId = menuItem.getGroupId();
        int size = this.f5350q.size();
        m0();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = this.f5350q.get(i4);
            if (jVar.getGroupId() == groupId && jVar.p() && jVar.isCheckable()) {
                if (jVar == menuItem) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jVar.v(z3);
            }
        }
        l0();
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        Intent intent2;
        int i9;
        PackageManager packageManager = this.f5345l.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i8 = queryIntentActivityOptions.size();
        } else {
            i8 = 0;
        }
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i10);
            int i11 = resolveInfo.specificIndex;
            if (i11 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i11];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i9 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i9] = intent4;
            }
        }
        return i8;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(n nVar) {
        c(nVar, this.f5345l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g b0(int i4) {
        d0(0, null, i4, null, null);
        return this;
    }

    public void c(n nVar, Context context) {
        this.f5341H.add(new WeakReference<>(nVar));
        nVar.i(context, this);
        this.f5355v = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g c0(Drawable drawable) {
        d0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.f5342I;
        if (jVar != null) {
            g(jVar);
        }
        this.f5350q.clear();
        N(true);
    }

    public void clearHeader() {
        this.f5359z = null;
        this.f5358y = null;
        this.f5334A = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f5349p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void e() {
        this.f5335B = true;
        clear();
        clearHeader();
        this.f5341H.clear();
        this.f5335B = false;
        this.f5336C = false;
        this.f5337D = false;
        N(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g e0(int i4) {
        d0(i4, null, 0, null, null);
        return this;
    }

    public final void f(boolean z3) {
        if (this.f5339F) {
            return;
        }
        this.f5339F = true;
        Iterator<WeakReference<n>> it = this.f5341H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.f5341H.remove(next);
            } else {
                nVar.b(this, z3);
            }
        }
        this.f5339F = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g f0(CharSequence charSequence) {
        d0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        MenuItem findItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = this.f5350q.get(i5);
            if (jVar.getItemId() == i4) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(j jVar) {
        boolean z3 = false;
        if (!this.f5341H.isEmpty() && this.f5342I == jVar) {
            m0();
            Iterator<WeakReference<n>> it = this.f5341H.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.f5341H.remove(next);
                } else {
                    z3 = nVar.f(this, jVar);
                    if (z3) {
                        break;
                    }
                }
            }
            l0();
            if (z3) {
                this.f5342I = null;
            }
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g g0(View view) {
        d0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return this.f5350q.get(i4);
    }

    public void h0(boolean z3) {
        this.f5338E = z3;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f5344K) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f5350q.get(i4).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(@N g gVar, @N MenuItem menuItem) {
        a aVar = this.f5349p;
        if (aVar != null && aVar.a(gVar, menuItem)) {
            return true;
        }
        return false;
    }

    public void i0(boolean z3) {
        this.f5344K = z3;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        if (s(i4, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public void j0(boolean z3) {
        if (this.f5348o == z3) {
            return;
        }
        k0(z3);
        N(false);
    }

    public void l0() {
        this.f5335B = false;
        if (this.f5336C) {
            this.f5336C = false;
            N(this.f5337D);
        }
    }

    public void m0() {
        if (!this.f5335B) {
            this.f5335B = true;
            this.f5336C = false;
            this.f5337D = false;
        }
    }

    public boolean n(j jVar) {
        boolean z3 = false;
        if (this.f5341H.isEmpty()) {
            return false;
        }
        m0();
        Iterator<WeakReference<n>> it = this.f5341H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.f5341H.remove(next);
            } else {
                z3 = nVar.g(this, jVar);
                if (z3) {
                    break;
                }
            }
        }
        l0();
        if (z3) {
            this.f5342I = jVar;
        }
        return z3;
    }

    public int o(int i4) {
        return p(i4, 0);
    }

    public int p(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (this.f5350q.get(i5).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return O(findItem(i4), i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        boolean z3;
        j s4 = s(i4, keyEvent);
        if (s4 != null) {
            z3 = O(s4, i5);
        } else {
            z3 = false;
        }
        if ((i5 & 2) != 0) {
            f(true);
        }
        return z3;
    }

    public int r(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f5350q.get(i5).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        int o4 = o(i4);
        if (o4 >= 0) {
            int size = this.f5350q.size() - o4;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || this.f5350q.get(o4).getGroupId() != i4) {
                    break;
                }
                R(o4, false);
                i5 = i6;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        R(r(i4), true);
    }

    j s(int i4, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<j> arrayList = this.f5340G;
        arrayList.clear();
        t(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean J3 = J();
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = arrayList.get(i5);
            if (J3) {
                numericShortcut = jVar.getAlphabeticShortcut();
            } else {
                numericShortcut = jVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (J3 && numericShortcut == '\b' && i4 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        int size = this.f5350q.size();
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = this.f5350q.get(i5);
            if (jVar.getGroupId() == i4) {
                jVar.w(z4);
                jVar.setCheckable(z3);
            }
        }
    }

    @Override // o.InterfaceMenuC2377a, android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f5343J = z3;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z3) {
        int size = this.f5350q.size();
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = this.f5350q.get(i5);
            if (jVar.getGroupId() == i4) {
                jVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z3) {
        int size = this.f5350q.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = this.f5350q.get(i5);
            if (jVar.getGroupId() == i4 && jVar.B(z3)) {
                z4 = true;
            }
        }
        if (z4) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f5347n = z3;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f5350q.size();
    }

    void t(List<j> list, int i4, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean J3 = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i4 != 67) {
            return;
        }
        int size = this.f5350q.size();
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = this.f5350q.get(i5);
            if (jVar.hasSubMenu()) {
                ((g) jVar.getSubMenu()).t(list, i4, keyEvent);
            }
            if (J3) {
                numericShortcut = jVar.getAlphabeticShortcut();
            } else {
                numericShortcut = jVar.getNumericShortcut();
            }
            if (J3) {
                numericModifiers = jVar.getAlphabeticModifiers();
            } else {
                numericModifiers = jVar.getNumericModifiers();
            }
            if ((modifiers & InterfaceMenuC2377a.f55292e) == (numericModifiers & InterfaceMenuC2377a.f55292e) && numericShortcut != 0) {
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (J3 && numericShortcut == '\b' && i4 == 67)) && jVar.isEnabled()) {
                    list.add(jVar);
                }
            }
        }
    }

    public void u() {
        ArrayList<j> H3 = H();
        if (!this.f5355v) {
            return;
        }
        Iterator<WeakReference<n>> it = this.f5341H.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.f5341H.remove(next);
            } else {
                z3 |= nVar.e();
            }
        }
        if (z3) {
            this.f5353t.clear();
            this.f5354u.clear();
            int size = H3.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = H3.get(i4);
                if (jVar.o()) {
                    this.f5353t.add(jVar);
                } else {
                    this.f5354u.add(jVar);
                }
            }
        } else {
            this.f5353t.clear();
            this.f5354u.clear();
            this.f5354u.addAll(H());
        }
        this.f5355v = false;
    }

    public ArrayList<j> v() {
        u();
        return this.f5353t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String w() {
        return f5331N;
    }

    public Context x() {
        return this.f5345l;
    }

    public j y() {
        return this.f5342I;
    }

    public Drawable z() {
        return this.f5359z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return a(0, 0, 0, this.f5346m.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f5346m.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        j jVar = (j) a(i4, i5, i6, charSequence);
        s sVar = new s(this.f5345l, this, jVar);
        jVar.A(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f5346m.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f5346m.getString(i7));
    }
}
