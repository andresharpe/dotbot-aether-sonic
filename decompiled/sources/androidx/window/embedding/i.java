package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class i {
    private final <F, S> F f(Pair<F, S> pair) {
        F.p(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S g(Pair<F, S> pair) {
        F.p(pair, "<this>");
        return (S) pair.second;
    }

    private final t h(SplitInfo splitInfo) {
        boolean z3;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        F.o(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z4 = false;
        try {
            z3 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z3 = false;
        }
        List activities = primaryActivityStack.getActivities();
        F.o(activities, "primaryActivityStack.activities");
        c cVar = new c(activities, z3);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        F.o(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z4 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        F.o(activities2, "secondaryActivityStack.activities");
        return new t(cVar, new c(activities2, z4), splitInfo.getSplitRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(i this$0, Set splitPairFilters, Pair pair) {
        F.p(this$0, "this$0");
        F.p(splitPairFilters, "$splitPairFilters");
        F.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Intent intent = (Intent) this$0.g(pair);
        if ((splitPairFilters instanceof Collection) && splitPairFilters.isEmpty()) {
            return false;
        }
        Iterator it = splitPairFilters.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).d(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(i this$0, Set splitPairFilters, Pair pair) {
        F.p(this$0, "this$0");
        F.p(splitPairFilters, "$splitPairFilters");
        F.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Activity activity2 = (Activity) this$0.g(pair);
        if ((splitPairFilters instanceof Collection) && splitPairFilters.isEmpty()) {
            return false;
        }
        Iterator it = splitPairFilters.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).e(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Set activityFilters, Activity activity) {
        F.p(activityFilters, "$activityFilters");
        if ((activityFilters instanceof Collection) && activityFilters.isEmpty()) {
            return false;
        }
        Iterator it = activityFilters.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            F.o(activity, "activity");
            if (aVar.c(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Set activityFilters, Intent intent) {
        F.p(activityFilters, "$activityFilters");
        if ((activityFilters instanceof Collection) && activityFilters.isEmpty()) {
            return false;
        }
        Iterator it = activityFilters.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            F.o(intent, "intent");
            if (aVar.d(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(x splitRule, WindowMetrics windowMetrics) {
        F.p(splitRule, "$splitRule");
        F.o(windowMetrics, "windowMetrics");
        return splitRule.a(windowMetrics);
    }

    @l3.d
    public final List<t> i(@l3.d List<? extends SplitInfo> splitInfoList) {
        int b02;
        F.p(splitInfoList, "splitInfoList");
        b02 = C2109w.b0(splitInfoList, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = splitInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(h((SplitInfo) it.next()));
        }
        return arrayList;
    }

    @l3.d
    public final Set<EmbeddingRule> j(@l3.d Set<? extends m> rules) {
        int b02;
        Set<EmbeddingRule> a6;
        SplitPairRule build;
        F.p(rules, "rules");
        b02 = C2109w.b0(rules, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (m mVar : rules) {
            if (mVar instanceof v) {
                v vVar = (v) mVar;
                build = new SplitPairRule.Builder(m(vVar.g()), k(vVar.g()), s((x) mVar)).setSplitRatio(vVar.e()).setLayoutDirection(vVar.b()).setShouldFinishPrimaryWithSecondary(vVar.h()).setShouldFinishSecondaryWithPrimary(vVar.i()).setShouldClearTop(vVar.f()).build();
                F.o(build, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (mVar instanceof w) {
                w wVar = (w) mVar;
                build = new SplitPlaceholderRule.Builder(wVar.g(), o(wVar.f()), q(wVar.f()), s((x) mVar)).setSplitRatio(wVar.e()).setLayoutDirection(wVar.b()).build();
                F.o(build, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (mVar instanceof b) {
                b bVar = (b) mVar;
                build = new ActivityRule.Builder(o(bVar.b()), q(bVar.b())).setShouldAlwaysExpand(bVar.a()).build();
                F.o(build, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((EmbeddingRule) build);
        }
        a6 = D.a6(arrayList);
        return a6;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> k(@l3.d final Set<u> splitPairFilters) {
        F.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean l4;
                l4 = i.l(i.this, splitPairFilters, (Pair) obj);
                return l4;
            }
        };
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> m(@l3.d final Set<u> splitPairFilters) {
        F.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean n4;
                n4 = i.n(i.this, splitPairFilters, (Pair) obj);
                return n4;
            }
        };
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> o(@l3.d final Set<a> activityFilters) {
        F.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean p4;
                p4 = i.p(activityFilters, (Activity) obj);
                return p4;
            }
        };
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> q(@l3.d final Set<a> activityFilters) {
        F.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean r4;
                r4 = i.r(activityFilters, (Intent) obj);
                return r4;
            }
        };
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> s(@l3.d final x splitRule) {
        F.p(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean t3;
                t3 = i.t(x.this, (WindowMetrics) obj);
                return t3;
            }
        };
    }
}
