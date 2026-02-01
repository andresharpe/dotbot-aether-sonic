package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.annotation.d0;
import d.C2042a;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f5113f;

    /* renamed from: a, reason: collision with root package name */
    private int f5114a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f5115b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f5116c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f5117d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f5118e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f5118e == null) {
            Configuration configuration = this.f5117d;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !e(configuration))) {
                this.f5118e = a.a(this, this.f5117d).getResources();
            } else {
                this.f5118e = super.getResources();
            }
        }
        return this.f5118e;
    }

    private void d() {
        boolean z3;
        if (this.f5115b == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f5115b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5115b.setTo(theme);
            }
        }
        f(this.f5115b, this.f5114a, z3);
    }

    @W(26)
    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f5113f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f5113f = configuration2;
        }
        return configuration.equals(f5113f);
    }

    public void a(Configuration configuration) {
        if (this.f5118e == null) {
            if (this.f5117d == null) {
                this.f5117d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f5114a;
    }

    protected void f(Resources.Theme theme, int i4, boolean z3) {
        theme.applyStyle(i4, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f5116c == null) {
                this.f5116c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f5116c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f5115b;
        if (theme != null) {
            return theme;
        }
        if (this.f5114a == 0) {
            this.f5114a = C2042a.l.c4;
        }
        d();
        return this.f5115b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        if (this.f5114a != i4) {
            this.f5114a = i4;
            d();
        }
    }

    public d(Context context, @d0 int i4) {
        super(context);
        this.f5114a = i4;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f5115b = theme;
    }
}
