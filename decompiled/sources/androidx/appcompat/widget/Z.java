package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.C0591d;
import androidx.core.view.AbstractC0795b;
import d.C2042a;
import e.C2046a;

/* loaded from: classes.dex */
public class Z extends AbstractC0795b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f6049k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final String f6050l = "share_history.xml";

    /* renamed from: e, reason: collision with root package name */
    private int f6051e;

    /* renamed from: f, reason: collision with root package name */
    private final c f6052f;

    /* renamed from: g, reason: collision with root package name */
    final Context f6053g;

    /* renamed from: h, reason: collision with root package name */
    String f6054h;

    /* renamed from: i, reason: collision with root package name */
    a f6055i;

    /* renamed from: j, reason: collision with root package name */
    private C0591d.f f6056j;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(Z z3, Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements C0591d.f {
        b() {
        }

        @Override // androidx.appcompat.widget.C0591d.f
        public boolean a(C0591d c0591d, Intent intent) {
            Z z3 = Z.this;
            a aVar = z3.f6055i;
            if (aVar != null) {
                aVar.a(z3, intent);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    private class c implements MenuItem.OnMenuItemClickListener {
        c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Z z3 = Z.this;
            Intent b4 = C0591d.d(z3.f6053g, z3.f6054h).b(menuItem.getItemId());
            if (b4 != null) {
                String action = b4.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    Z.this.r(b4);
                }
                Z.this.f6053g.startActivity(b4);
                return true;
            }
            return true;
        }
    }

    public Z(Context context) {
        super(context);
        this.f6051e = 4;
        this.f6052f = new c();
        this.f6054h = f6050l;
        this.f6053g = context;
    }

    private void n() {
        if (this.f6055i == null) {
            return;
        }
        if (this.f6056j == null) {
            this.f6056j = new b();
        }
        C0591d.d(this.f6053g, this.f6054h).u(this.f6056j);
    }

    @Override // androidx.core.view.AbstractC0795b
    public boolean b() {
        return true;
    }

    @Override // androidx.core.view.AbstractC0795b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f6053g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C0591d.d(this.f6053g, this.f6054h));
        }
        TypedValue typedValue = new TypedValue();
        this.f6053g.getTheme().resolveAttribute(C2042a.b.f49091A, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C2046a.b(this.f6053g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C2042a.k.f49738z);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C2042a.k.f49737y);
        return activityChooserView;
    }

    @Override // androidx.core.view.AbstractC0795b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        C0591d d4 = C0591d.d(this.f6053g, this.f6054h);
        PackageManager packageManager = this.f6053g.getPackageManager();
        int f4 = d4.f();
        int min = Math.min(f4, this.f6051e);
        for (int i4 = 0; i4 < min; i4++) {
            ResolveInfo e4 = d4.e(i4);
            subMenu.add(0, i4, i4, e4.loadLabel(packageManager)).setIcon(e4.loadIcon(packageManager)).setOnMenuItemClickListener(this.f6052f);
        }
        if (min < f4) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f6053g.getString(C2042a.k.f49717e));
            for (int i5 = 0; i5 < f4; i5++) {
                ResolveInfo e5 = d4.e(i5);
                addSubMenu.add(0, i5, i5, e5.loadLabel(packageManager)).setIcon(e5.loadIcon(packageManager)).setOnMenuItemClickListener(this.f6052f);
            }
        }
    }

    public void o(a aVar) {
        this.f6055i = aVar;
        n();
    }

    public void p(String str) {
        this.f6054h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        C0591d.d(this.f6053g, this.f6054h).t(intent);
    }

    void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
