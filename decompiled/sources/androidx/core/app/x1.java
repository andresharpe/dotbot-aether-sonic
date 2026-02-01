package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.InterfaceC0577u;
import androidx.core.content.C0672g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12135a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12136b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12137c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12138d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12139e = ".sharecompat_";

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static String a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @InterfaceC0577u
        static void b(@androidx.annotation.N Intent intent, @androidx.annotation.N ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(C0672g.f12215b), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i4 = 1; i4 < size; i4++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i4)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @InterfaceC0577u
        static void c(@androidx.annotation.N Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final Context f12140a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.N
        private final Intent f12141b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        private CharSequence f12142c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.P
        private ArrayList<String> f12143d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.P
        private ArrayList<String> f12144e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.P
        private ArrayList<String> f12145f;

        /* renamed from: g, reason: collision with root package name */
        @androidx.annotation.P
        private ArrayList<Uri> f12146g;

        public b(@androidx.annotation.N Context context) {
            Activity activity;
            this.f12140a = (Context) androidx.core.util.u.l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f12141b = action;
            action.putExtra(x1.f12135a, context.getPackageName());
            action.putExtra(x1.f12136b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f12141b.putExtra(x1.f12137c, componentName);
                this.f12141b.putExtra(x1.f12138d, componentName);
            }
        }

        private void h(String str, ArrayList<String> arrayList) {
            int i4;
            String[] stringArrayExtra = this.f12141b.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i4 = stringArrayExtra.length;
            } else {
                i4 = 0;
            }
            String[] strArr = new String[arrayList.size() + i4];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), i4);
            }
            this.f12141b.putExtra(str, strArr);
        }

        private void i(@androidx.annotation.P String str, @androidx.annotation.N String[] strArr) {
            int i4;
            Intent m4 = m();
            String[] stringArrayExtra = m4.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i4 = stringArrayExtra.length;
            } else {
                i4 = 0;
            }
            String[] strArr2 = new String[strArr.length + i4];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, i4);
            }
            System.arraycopy(strArr, 0, strArr2, i4, strArr.length);
            m4.putExtra(str, strArr2);
        }

        @androidx.annotation.N
        @Deprecated
        public static b k(@androidx.annotation.N Activity activity) {
            return new b(activity);
        }

        @androidx.annotation.N
        public b a(@androidx.annotation.N String str) {
            if (this.f12145f == null) {
                this.f12145f = new ArrayList<>();
            }
            this.f12145f.add(str);
            return this;
        }

        @androidx.annotation.N
        public b b(@androidx.annotation.N String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.N
        public b c(@androidx.annotation.N String str) {
            if (this.f12144e == null) {
                this.f12144e = new ArrayList<>();
            }
            this.f12144e.add(str);
            return this;
        }

        @androidx.annotation.N
        public b d(@androidx.annotation.N String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.N
        public b e(@androidx.annotation.N String str) {
            if (this.f12143d == null) {
                this.f12143d = new ArrayList<>();
            }
            this.f12143d.add(str);
            return this;
        }

        @androidx.annotation.N
        public b f(@androidx.annotation.N String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.N
        public b g(@androidx.annotation.N Uri uri) {
            if (this.f12146g == null) {
                this.f12146g = new ArrayList<>();
            }
            this.f12146g.add(uri);
            return this;
        }

        @androidx.annotation.N
        public Intent j() {
            return Intent.createChooser(m(), this.f12142c);
        }

        @androidx.annotation.N
        Context l() {
            return this.f12140a;
        }

        @androidx.annotation.N
        public Intent m() {
            ArrayList<String> arrayList = this.f12143d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.f12143d = null;
            }
            ArrayList<String> arrayList2 = this.f12144e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.f12144e = null;
            }
            ArrayList<String> arrayList3 = this.f12145f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f12145f = null;
            }
            ArrayList<Uri> arrayList4 = this.f12146g;
            if (arrayList4 != null && arrayList4.size() > 1) {
                this.f12141b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f12141b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f12146g);
                a.b(this.f12141b, this.f12146g);
            } else {
                this.f12141b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f12146g;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.f12141b.putExtra("android.intent.extra.STREAM", this.f12146g.get(0));
                    a.b(this.f12141b, this.f12146g);
                } else {
                    this.f12141b.removeExtra("android.intent.extra.STREAM");
                    a.c(this.f12141b);
                }
            }
            return this.f12141b;
        }

        @androidx.annotation.N
        public b n(@androidx.annotation.c0 int i4) {
            return o(this.f12140a.getText(i4));
        }

        @androidx.annotation.N
        public b o(@androidx.annotation.P CharSequence charSequence) {
            this.f12142c = charSequence;
            return this;
        }

        @androidx.annotation.N
        public b p(@androidx.annotation.P String[] strArr) {
            this.f12141b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.N
        public b q(@androidx.annotation.P String[] strArr) {
            this.f12141b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.N
        public b r(@androidx.annotation.P String[] strArr) {
            if (this.f12143d != null) {
                this.f12143d = null;
            }
            this.f12141b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.N
        public b s(@androidx.annotation.P String str) {
            this.f12141b.putExtra(C0672g.f12215b, str);
            if (!this.f12141b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @androidx.annotation.N
        public b t(@androidx.annotation.P Uri uri) {
            this.f12146g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @androidx.annotation.N
        public b u(@androidx.annotation.P String str) {
            this.f12141b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @androidx.annotation.N
        public b v(@androidx.annotation.P CharSequence charSequence) {
            this.f12141b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @androidx.annotation.N
        public b w(@androidx.annotation.P String str) {
            this.f12141b.setType(str);
            return this;
        }

        public void x() {
            this.f12140a.startActivity(j());
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: f, reason: collision with root package name */
        private static final String f12147f = "IntentReader";

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final Context f12148a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.N
        private final Intent f12149b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        private final String f12150c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.P
        private final ComponentName f12151d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.P
        private ArrayList<Uri> f12152e;

        public c(@androidx.annotation.N Activity activity) {
            this((Context) androidx.core.util.u.l(activity), activity.getIntent());
        }

        @androidx.annotation.N
        @Deprecated
        public static c a(@androidx.annotation.N Activity activity) {
            return new c(activity);
        }

        private static void t(StringBuilder sb, CharSequence charSequence, int i4, int i5) {
            while (i4 < i5) {
                char charAt = charSequence.charAt(i4);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt <= '~' && charAt >= ' ') {
                    if (charAt == ' ') {
                        while (true) {
                            int i6 = i4 + 1;
                            if (i6 >= i5 || charSequence.charAt(i6) != ' ') {
                                break;
                            }
                            sb.append("&nbsp;");
                            i4 = i6;
                        }
                        sb.append(' ');
                    } else {
                        sb.append(charAt);
                    }
                } else {
                    sb.append("&#");
                    sb.append((int) charAt);
                    sb.append(";");
                }
                i4++;
            }
        }

        @androidx.annotation.P
        public ComponentName b() {
            return this.f12151d;
        }

        @androidx.annotation.P
        public Drawable c() {
            if (this.f12151d == null) {
                return null;
            }
            try {
                return this.f12148a.getPackageManager().getActivityIcon(this.f12151d);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e(f12147f, "Could not retrieve icon for calling activity", e4);
                return null;
            }
        }

        @androidx.annotation.P
        public Drawable d() {
            if (this.f12150c == null) {
                return null;
            }
            try {
                return this.f12148a.getPackageManager().getApplicationIcon(this.f12150c);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e(f12147f, "Could not retrieve icon for calling application", e4);
                return null;
            }
        }

        @androidx.annotation.P
        public CharSequence e() {
            if (this.f12150c == null) {
                return null;
            }
            PackageManager packageManager = this.f12148a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f12150c, 0));
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e(f12147f, "Could not retrieve label for calling application", e4);
                return null;
            }
        }

        @androidx.annotation.P
        public String f() {
            return this.f12150c;
        }

        @androidx.annotation.P
        public String[] g() {
            return this.f12149b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @androidx.annotation.P
        public String[] h() {
            return this.f12149b.getStringArrayExtra("android.intent.extra.CC");
        }

        @androidx.annotation.P
        public String[] i() {
            return this.f12149b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @androidx.annotation.P
        public String j() {
            String stringExtra = this.f12149b.getStringExtra(C0672g.f12215b);
            if (stringExtra == null) {
                CharSequence o4 = o();
                if (o4 instanceof Spanned) {
                    return Html.toHtml((Spanned) o4);
                }
                if (o4 != null) {
                    return a.a(o4);
                }
                return stringExtra;
            }
            return stringExtra;
        }

        @androidx.annotation.P
        public Uri k() {
            return (Uri) this.f12149b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @androidx.annotation.P
        public Uri l(int i4) {
            if (this.f12152e == null && q()) {
                this.f12152e = this.f12149b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f12152e;
            if (arrayList != null) {
                return arrayList.get(i4);
            }
            if (i4 == 0) {
                return (Uri) this.f12149b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i4);
        }

        public int m() {
            if (this.f12152e == null && q()) {
                this.f12152e = this.f12149b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f12152e;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.f12149b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @androidx.annotation.P
        public String n() {
            return this.f12149b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @androidx.annotation.P
        public CharSequence o() {
            return this.f12149b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @androidx.annotation.P
        public String p() {
            return this.f12149b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f12149b.getAction());
        }

        public boolean r() {
            String action = this.f12149b.getAction();
            if (!"android.intent.action.SEND".equals(action) && !"android.intent.action.SEND_MULTIPLE".equals(action)) {
                return false;
            }
            return true;
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f12149b.getAction());
        }

        public c(@androidx.annotation.N Context context, @androidx.annotation.N Intent intent) {
            this.f12148a = (Context) androidx.core.util.u.l(context);
            this.f12149b = (Intent) androidx.core.util.u.l(intent);
            this.f12150c = x1.f(intent);
            this.f12151d = x1.d(intent);
        }
    }

    private x1() {
    }

    @Deprecated
    public static void a(@androidx.annotation.N Menu menu, @androidx.annotation.D int i4, @androidx.annotation.N b bVar) {
        MenuItem findItem = menu.findItem(i4);
        if (findItem != null) {
            b(findItem, bVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i4 + " in the supplied menu");
    }

    @Deprecated
    public static void b(@androidx.annotation.N MenuItem menuItem, @androidx.annotation.N b bVar) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(bVar.l());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(f12139e + bVar.l().getClass().getName());
        shareActionProvider.setShareIntent(bVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @androidx.annotation.P
    public static ComponentName c(@androidx.annotation.N Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return d(intent);
        }
        return callingActivity;
    }

    @androidx.annotation.P
    static ComponentName d(@androidx.annotation.N Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f12137c);
        if (componentName == null) {
            return (ComponentName) intent.getParcelableExtra(f12138d);
        }
        return componentName;
    }

    @androidx.annotation.P
    public static String e(@androidx.annotation.N Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        if (callingPackage == null && intent != null) {
            return f(intent);
        }
        return callingPackage;
    }

    @androidx.annotation.P
    static String f(@androidx.annotation.N Intent intent) {
        String stringExtra = intent.getStringExtra(f12135a);
        if (stringExtra == null) {
            return intent.getStringExtra(f12136b);
        }
        return stringExtra;
    }
}
