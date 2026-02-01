package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.F;
import kotlin.text.A;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final ComponentName f20802a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final ComponentName f20803b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final String f20804c;

    public u(@l3.d ComponentName primaryActivityName, @l3.d ComponentName secondaryActivityName, @l3.e String str) {
        boolean T22;
        boolean T23;
        Object obj;
        int i4;
        boolean z3;
        CharSequence charSequence;
        String str2;
        boolean T24;
        boolean T25;
        int p32;
        int p33;
        int p34;
        int p35;
        F.p(primaryActivityName, "primaryActivityName");
        F.p(secondaryActivityName, "secondaryActivityName");
        this.f20802a = primaryActivityName;
        this.f20803b = secondaryActivityName;
        this.f20804c = str;
        String packageName = primaryActivityName.getPackageName();
        F.o(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        F.o(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        F.o(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        F.o(className2, "secondaryActivityName.className");
        if (packageName.length() != 0 && packageName2.length() != 0) {
            if (className.length() != 0 && className2.length() != 0) {
                T22 = A.T2(packageName, "*", false, 2, null);
                if (T22) {
                    p35 = A.p3(packageName, "*", 0, false, 6, null);
                    if (p35 != packageName.length() - 1) {
                        throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                    }
                }
                T23 = A.T2(className, "*", false, 2, null);
                if (T23) {
                    obj = null;
                    i4 = 2;
                    z3 = false;
                    charSequence = "*";
                    str2 = className2;
                    p34 = A.p3(className, "*", 0, false, 6, null);
                    if (p34 != className.length() - 1) {
                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                    }
                } else {
                    obj = null;
                    i4 = 2;
                    z3 = false;
                    charSequence = "*";
                    str2 = className2;
                }
                T24 = A.T2(packageName2, charSequence, z3, i4, obj);
                if (T24) {
                    p33 = A.p3(packageName2, "*", 0, false, 6, null);
                    if (p33 != packageName2.length() - 1) {
                        throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                    }
                }
                T25 = A.T2(str2, charSequence, z3, i4, obj);
                if (T25) {
                    p32 = A.p3(str2, "*", 0, false, 6, null);
                    if (p32 != str2.length() - 1) {
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
        return this.f20802a;
    }

    @l3.e
    public final String b() {
        return this.f20804c;
    }

    @l3.d
    public final ComponentName c() {
        return this.f20803b;
    }

    public final boolean d(@l3.d Activity primaryActivity, @l3.d Intent secondaryActivityIntent) {
        F.p(primaryActivity, "primaryActivity");
        F.p(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        r rVar = r.f20790a;
        if (!rVar.b(componentName, this.f20802a) || !rVar.b(secondaryActivityIntent.getComponent(), this.f20803b)) {
            return false;
        }
        String str = this.f20804c;
        if (str != null && !F.g(str, secondaryActivityIntent.getAction())) {
            return false;
        }
        return true;
    }

    public final boolean e(@l3.d Activity primaryActivity, @l3.d Activity secondaryActivity) {
        boolean z3;
        F.p(primaryActivity, "primaryActivity");
        F.p(secondaryActivity, "secondaryActivity");
        r rVar = r.f20790a;
        boolean z4 = false;
        if (rVar.b(primaryActivity.getComponentName(), this.f20802a) && rVar.b(secondaryActivity.getComponentName(), this.f20803b)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (secondaryActivity.getIntent() != null) {
            if (z3) {
                Intent intent = secondaryActivity.getIntent();
                F.o(intent, "secondaryActivity.intent");
                if (d(primaryActivity, intent)) {
                    z4 = true;
                }
            }
            return z4;
        }
        return z3;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (F.g(this.f20802a, uVar.f20802a) && F.g(this.f20803b, uVar.f20803b) && F.g(this.f20804c, uVar.f20804c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f20802a.hashCode() * 31) + this.f20803b.hashCode()) * 31;
        String str = this.f20804c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @l3.d
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.f20802a + ", secondaryActivityName=" + this.f20803b + ", secondaryActivityAction=" + ((Object) this.f20804c) + '}';
    }
}
