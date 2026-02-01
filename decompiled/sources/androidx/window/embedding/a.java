package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.F;
import kotlin.text.A;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final ComponentName f20754a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final String f20755b;

    public a(@l3.d ComponentName componentName, @l3.e String str) {
        boolean T22;
        boolean T23;
        int p32;
        int p33;
        F.p(componentName, "componentName");
        this.f20754a = componentName;
        this.f20755b = str;
        String packageName = componentName.getPackageName();
        F.o(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        F.o(className, "componentName.className");
        if (packageName.length() > 0) {
            if (className.length() > 0) {
                T22 = A.T2(packageName, "*", false, 2, null);
                if (T22) {
                    p33 = A.p3(packageName, "*", 0, false, 6, null);
                    if (p33 != packageName.length() - 1) {
                        throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                    }
                }
                T23 = A.T2(className, "*", false, 2, null);
                if (T23) {
                    p32 = A.p3(className, "*", 0, false, 6, null);
                    if (p32 != className.length() - 1) {
                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    @l3.d
    public final ComponentName a() {
        return this.f20754a;
    }

    @l3.e
    public final String b() {
        return this.f20755b;
    }

    public final boolean c(@l3.d Activity activity) {
        String action;
        F.p(activity, "activity");
        if (r.f20790a.a(activity, this.f20754a)) {
            String str = this.f20755b;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    action = null;
                } else {
                    action = intent.getAction();
                }
                if (F.g(str, action)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(@l3.d Intent intent) {
        F.p(intent, "intent");
        if (!r.f20790a.b(intent.getComponent(), this.f20754a)) {
            return false;
        }
        String str = this.f20755b;
        if (str != null && !F.g(str, intent.getAction())) {
            return false;
        }
        return true;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (F.g(this.f20754a, aVar.f20754a) && F.g(this.f20755b, aVar.f20755b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f20754a.hashCode() * 31;
        String str = this.f20755b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @l3.d
    public String toString() {
        return "ActivityFilter(componentName=" + this.f20754a + ", intentAction=" + ((Object) this.f20755b) + ')';
    }
}
