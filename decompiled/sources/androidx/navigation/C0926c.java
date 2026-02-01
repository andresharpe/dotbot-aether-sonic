package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.RestrictTo;
import androidx.core.app.C0623e;
import androidx.core.content.C0669d;
import androidx.navigation.F;
import androidx.navigation.c0;
import androidx.navigation.i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

@c0.b("activity")
@kotlin.E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f \u0013B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Landroidx/navigation/c;", "Landroidx/navigation/c0;", "Landroidx/navigation/c$b;", "m", "()Landroidx/navigation/c$b;", "", "k", "()Z", FirebaseAnalytics.b.f34818z, "Landroid/os/Bundle;", "args", "Landroidx/navigation/T;", "navOptions", "Landroidx/navigation/c0$a;", "navigatorExtras", "Landroidx/navigation/F;", "o", "(Landroidx/navigation/c$b;Landroid/os/Bundle;Landroidx/navigation/T;Landroidx/navigation/c0$a;)Landroidx/navigation/F;", "Landroid/content/Context;", "c", "Landroid/content/Context;", "n", "()Landroid/content/Context;", "context", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "<init>", "(Landroid/content/Context;)V", "e", "a", com.harman.log.b.f47574c, "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.navigation.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0926c extends c0<b> {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final a f16390e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final String f16391f = "android-support-navigation:ActivityNavigator:source";

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final String f16392g = "android-support-navigation:ActivityNavigator:current";

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final String f16393h = "android-support-navigation:ActivityNavigator:popEnterAnim";

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private static final String f16394i = "android-support-navigation:ActivityNavigator:popExitAnim";

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private static final String f16395j = "ActivityNavigator";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final Context f16396c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final Activity f16397d;

    /* renamed from: androidx.navigation.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        public final void a(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(C0926c.f16393h, -1);
            int intExtra2 = intent.getIntExtra(C0926c.f16394i, -1);
            if (intExtra != -1 || intExtra2 != -1) {
                if (intExtra == -1) {
                    intExtra = 0;
                }
                if (intExtra2 == -1) {
                    intExtra2 = 0;
                }
                activity.overridePendingTransition(intExtra, intExtra2);
            }
        }

        private a() {
        }
    }

    @F.a(Activity.class)
    /* renamed from: androidx.navigation.c$b */
    /* loaded from: classes.dex */
    public static class b extends F {

        /* renamed from: P, reason: collision with root package name */
        @l3.e
        private Intent f16398P;

        /* renamed from: Q, reason: collision with root package name */
        @l3.e
        private String f16399Q;

        /* renamed from: R, reason: collision with root package name */
        @l3.e
        private String f16400R;

        /* renamed from: S, reason: collision with root package name */
        @l3.e
        private ComponentName f16401S;

        /* renamed from: T, reason: collision with root package name */
        @l3.e
        private String f16402T;

        /* renamed from: U, reason: collision with root package name */
        @l3.e
        private Uri f16403U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d c0<? extends b> activityNavigator) {
            super(activityNavigator);
            kotlin.jvm.internal.F.p(activityNavigator, "activityNavigator");
        }

        @Override // androidx.navigation.F
        @InterfaceC0566i
        public void B(@l3.d Context context, @l3.d AttributeSet attrs) {
            kotlin.jvm.internal.F.p(context, "context");
            kotlin.jvm.internal.F.p(attrs, "attrs");
            super.B(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, i0.c.f16491a);
            kotlin.jvm.internal.F.o(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(i0.c.f16496f);
            if (string != null) {
                String packageName = context.getPackageName();
                kotlin.jvm.internal.F.o(packageName, "context.packageName");
                string = kotlin.text.z.i2(string, S.f16330h, packageName, false, 4, null);
            }
            b0(string);
            String string2 = obtainAttributes.getString(i0.c.f16492b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = kotlin.jvm.internal.F.C(context.getPackageName(), string2);
                }
                X(new ComponentName(context, string2));
            }
            W(obtainAttributes.getString(i0.c.f16493c));
            String string3 = obtainAttributes.getString(i0.c.f16494d);
            if (string3 != null) {
                Y(Uri.parse(string3));
            }
            Z(obtainAttributes.getString(i0.c.f16495e));
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.F
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean N() {
            return false;
        }

        @l3.e
        public final String O() {
            Intent intent = this.f16398P;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        @l3.e
        public final ComponentName Q() {
            Intent intent = this.f16398P;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        @l3.e
        public final Uri S() {
            Intent intent = this.f16398P;
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }

        @l3.e
        public final String T() {
            return this.f16399Q;
        }

        @l3.e
        public final Intent U() {
            return this.f16398P;
        }

        @l3.e
        public final String V() {
            Intent intent = this.f16398P;
            if (intent == null) {
                return null;
            }
            return intent.getPackage();
        }

        @l3.d
        public final b W(@l3.e String str) {
            if (this.f16398P == null) {
                this.f16398P = new Intent();
            }
            Intent intent = this.f16398P;
            kotlin.jvm.internal.F.m(intent);
            intent.setAction(str);
            return this;
        }

        @l3.d
        public final b X(@l3.e ComponentName componentName) {
            if (this.f16398P == null) {
                this.f16398P = new Intent();
            }
            Intent intent = this.f16398P;
            kotlin.jvm.internal.F.m(intent);
            intent.setComponent(componentName);
            return this;
        }

        @l3.d
        public final b Y(@l3.e Uri uri) {
            if (this.f16398P == null) {
                this.f16398P = new Intent();
            }
            Intent intent = this.f16398P;
            kotlin.jvm.internal.F.m(intent);
            intent.setData(uri);
            return this;
        }

        @l3.d
        public final b Z(@l3.e String str) {
            this.f16399Q = str;
            return this;
        }

        @l3.d
        public final b a0(@l3.e Intent intent) {
            this.f16398P = intent;
            return this;
        }

        @l3.d
        public final b b0(@l3.e String str) {
            if (this.f16398P == null) {
                this.f16398P = new Intent();
            }
            Intent intent = this.f16398P;
            kotlin.jvm.internal.F.m(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.F
        public boolean equals(@l3.e Object obj) {
            Boolean valueOf;
            if (obj == null || !(obj instanceof b) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f16398P;
            if (intent == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(intent.filterEquals(((b) obj).f16398P));
            }
            if (valueOf == null) {
                if (((b) obj).f16398P != null) {
                    return false;
                }
            } else if (!valueOf.booleanValue()) {
                return false;
            }
            if (!kotlin.jvm.internal.F.g(this.f16399Q, ((b) obj).f16399Q)) {
                return false;
            }
            return true;
        }

        @Override // androidx.navigation.F
        public int hashCode() {
            int filterHashCode;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f16398P;
            int i4 = 0;
            if (intent == null) {
                filterHashCode = 0;
            } else {
                filterHashCode = intent.filterHashCode();
            }
            int i5 = (hashCode + filterHashCode) * 31;
            String str = this.f16399Q;
            if (str != null) {
                i4 = str.hashCode();
            }
            return i5 + i4;
        }

        @Override // androidx.navigation.F
        @l3.d
        public String toString() {
            ComponentName Q3 = Q();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (Q3 != null) {
                sb.append(" class=");
                sb.append(Q3.getClassName());
            } else {
                String O3 = O();
                if (O3 != null) {
                    sb.append(" action=");
                    sb.append(O3);
                }
            }
            String sb2 = sb.toString();
            kotlin.jvm.internal.F.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@l3.d d0 navigatorProvider) {
            this((c0<? extends b>) navigatorProvider.e(C0926c.class));
            kotlin.jvm.internal.F.p(navigatorProvider, "navigatorProvider");
        }
    }

    /* renamed from: androidx.navigation.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0156c implements c0.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f16404a;

        /* renamed from: b, reason: collision with root package name */
        @l3.e
        private final C0623e f16405b;

        /* renamed from: androidx.navigation.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f16406a;

            /* renamed from: b, reason: collision with root package name */
            @l3.e
            private C0623e f16407b;

            @l3.d
            public final a a(int i4) {
                this.f16406a = i4 | this.f16406a;
                return this;
            }

            @l3.d
            public final C0156c b() {
                return new C0156c(this.f16406a, this.f16407b);
            }

            @l3.d
            public final a c(@l3.d C0623e activityOptions) {
                kotlin.jvm.internal.F.p(activityOptions, "activityOptions");
                this.f16407b = activityOptions;
                return this;
            }
        }

        public C0156c(int i4, @l3.e C0623e c0623e) {
            this.f16404a = i4;
            this.f16405b = c0623e;
        }

        @l3.e
        public final C0623e a() {
            return this.f16405b;
        }

        public final int b() {
            return this.f16404a;
        }
    }

    /* renamed from: androidx.navigation.c$d */
    /* loaded from: classes.dex */
    static final class d extends Lambda implements X2.l<Context, Context> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f16408F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Context C(@l3.d Context it) {
            kotlin.jvm.internal.F.p(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public C0926c(@l3.d Context context) {
        kotlin.sequences.m n4;
        Object obj;
        kotlin.jvm.internal.F.p(context, "context");
        this.f16396c = context;
        n4 = kotlin.sequences.s.n(context, d.f16408F);
        Iterator it = n4.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f16397d = (Activity) obj;
    }

    @W2.n
    public static final void l(@l3.d Activity activity) {
        f16390e.a(activity);
    }

    @Override // androidx.navigation.c0
    public boolean k() {
        Activity activity = this.f16397d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // androidx.navigation.c0
    @l3.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context n() {
        return this.f16396c;
    }

    @Override // androidx.navigation.c0
    @l3.e
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public F d(@l3.d b destination, @l3.e Bundle bundle, @l3.e T t3, @l3.e c0.a aVar) {
        int u3;
        int u4;
        Intent intent;
        int intExtra;
        kotlin.jvm.internal.F.p(destination, "destination");
        if (destination.U() != null) {
            Intent intent2 = new Intent(destination.U());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String T3 = destination.T();
                if (T3 != null && T3.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(T3);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + ((Object) group) + " in " + bundle + " to fill data pattern " + ((Object) T3));
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z3 = aVar instanceof C0156c;
            if (z3) {
                intent2.addFlags(((C0156c) aVar).b());
            }
            if (this.f16397d == null) {
                intent2.addFlags(268435456);
            }
            if (t3 != null && t3.i()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f16397d;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(f16392g, 0)) != 0) {
                intent2.putExtra(f16391f, intExtra);
            }
            intent2.putExtra(f16392g, destination.t());
            Resources resources = this.f16396c.getResources();
            if (t3 != null) {
                int c4 = t3.c();
                int d4 = t3.d();
                if ((c4 > 0 && kotlin.jvm.internal.F.g(resources.getResourceTypeName(c4), "animator")) || (d4 > 0 && kotlin.jvm.internal.F.g(resources.getResourceTypeName(d4), "animator"))) {
                    Log.w(f16395j, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + ((Object) resources.getResourceName(c4)) + " and popExit resource " + ((Object) resources.getResourceName(d4)) + " when launching " + destination);
                } else {
                    intent2.putExtra(f16393h, c4);
                    intent2.putExtra(f16394i, d4);
                }
            }
            if (z3) {
                C0623e a4 = ((C0156c) aVar).a();
                if (a4 != null) {
                    C0669d.w(this.f16396c, intent2, a4.l());
                } else {
                    this.f16396c.startActivity(intent2);
                }
            } else {
                this.f16396c.startActivity(intent2);
            }
            if (t3 != null && this.f16397d != null) {
                int a5 = t3.a();
                int b4 = t3.b();
                if ((a5 > 0 && kotlin.jvm.internal.F.g(resources.getResourceTypeName(a5), "animator")) || (b4 > 0 && kotlin.jvm.internal.F.g(resources.getResourceTypeName(b4), "animator"))) {
                    Log.w(f16395j, "Activity destinations do not support Animator resource. Ignoring enter resource " + ((Object) resources.getResourceName(a5)) + " and exit resource " + ((Object) resources.getResourceName(b4)) + "when launching " + destination);
                    return null;
                }
                if (a5 >= 0 || b4 >= 0) {
                    u3 = kotlin.ranges.u.u(a5, 0);
                    u4 = kotlin.ranges.u.u(b4, 0);
                    this.f16397d.overridePendingTransition(u3, u4);
                    return null;
                }
                return null;
            }
            return null;
        }
        throw new IllegalStateException(("Destination " + destination.t() + " does not have an Intent set.").toString());
    }
}
