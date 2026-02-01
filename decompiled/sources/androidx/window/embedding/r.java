package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.F;
import kotlin.text.A;
import kotlin.text.z;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final r f20790a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f20791b = false;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final String f20792c = "SplitRuleResolution";

    private r() {
    }

    private final boolean c(String str, String str2) {
        boolean T22;
        int p32;
        int D3;
        boolean J12;
        boolean s22;
        T22 = A.T2(str2, "*", false, 2, null);
        if (!T22) {
            return false;
        }
        if (!F.g(str2, "*")) {
            p32 = A.p3(str2, "*", 0, false, 6, null);
            D3 = A.D3(str2, "*", 0, false, 6, null);
            if (p32 == D3) {
                J12 = z.J1(str2, "*", false, 2, null);
                if (J12) {
                    String substring = str2.substring(0, str2.length() - 1);
                    F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    s22 = z.s2(str, substring, false, 2, null);
                    return s22;
                }
            }
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        return true;
    }

    public final boolean a(@l3.d Activity activity, @l3.d ComponentName ruleComponent) {
        ComponentName component;
        F.p(activity, "activity");
        F.p(ruleComponent, "ruleComponent");
        if (b(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f20790a.b(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(@l3.e android.content.ComponentName r7, @l3.d android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.F.p(r8, r0)
            java.lang.String r0 = "*"
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L21
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.F.g(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.F.g(r7, r0)
            if (r7 == 0) goto L20
            r1 = r2
        L20:
            return r1
        L21:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.F.o(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.q.T2(r3, r0, r1, r4, r5)
            r0 = r0 ^ r2
            if (r0 == 0) goto L8d
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.F.g(r0, r3)
            if (r0 != 0) goto L5c
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.F.o(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.F.o(r3, r4)
            boolean r0 = r6.c(r0, r3)
            if (r0 == 0) goto L5a
            goto L5c
        L5a:
            r0 = r1
            goto L5d
        L5c:
            r0 = r2
        L5d:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.F.g(r3, r4)
            if (r3 != 0) goto L86
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.F.o(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.F.o(r8, r3)
            boolean r7 = r6.c(r7, r8)
            if (r7 == 0) goto L84
            goto L86
        L84:
            r7 = r1
            goto L87
        L86:
            r7 = r2
        L87:
            if (r0 == 0) goto L8c
            if (r7 == 0) goto L8c
            r1 = r2
        L8c:
            return r1
        L8d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.r.b(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
