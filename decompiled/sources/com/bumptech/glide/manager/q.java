package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.c;
import com.bumptech.glide.load.resource.bitmap.A;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class q implements Handler.Callback {

    /* renamed from: l, reason: collision with root package name */
    @i0
    static final String f26683l = "com.bumptech.glide.manager";

    /* renamed from: m, reason: collision with root package name */
    private static final String f26684m = "RMRetriever";

    /* renamed from: n, reason: collision with root package name */
    private static final int f26685n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f26686o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final String f26687p = "key";

    /* renamed from: q, reason: collision with root package name */
    private static final b f26688q = new a();

    /* renamed from: c, reason: collision with root package name */
    private volatile com.bumptech.glide.j f26689c;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f26692f;

    /* renamed from: g, reason: collision with root package name */
    private final b f26693g;

    /* renamed from: k, reason: collision with root package name */
    private final k f26697k;

    /* renamed from: d, reason: collision with root package name */
    @i0
    final Map<FragmentManager, o> f26690d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    @i0
    final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f26691e = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f26694h = new androidx.collection.a<>();

    /* renamed from: i, reason: collision with root package name */
    private final androidx.collection.a<View, android.app.Fragment> f26695i = new androidx.collection.a<>();

    /* renamed from: j, reason: collision with root package name */
    private final Bundle f26696j = new Bundle();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.q.b
        @N
        public com.bumptech.glide.j a(@N com.bumptech.glide.b bVar, @N l lVar, @N r rVar, @N Context context) {
            return new com.bumptech.glide.j(bVar, lVar, rVar, context);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @N
        com.bumptech.glide.j a(@N com.bumptech.glide.b bVar, @N l lVar, @N r rVar, @N Context context);
    }

    public q(@P b bVar, com.bumptech.glide.e eVar) {
        this.f26693g = bVar == null ? f26688q : bVar;
        this.f26692f = new Handler(Looper.getMainLooper(), this);
        this.f26697k = b(eVar);
    }

    @TargetApi(17)
    private static void a(@N Activity activity) {
        if (!activity.isDestroyed()) {
        } else {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static k b(com.bumptech.glide.e eVar) {
        if (A.f26400i && A.f26399h) {
            if (eVar.b(c.f.class)) {
                return new i();
            }
            return new j();
        }
        return new g();
    }

    @P
    private static Activity c(@N Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    private void d(@N FragmentManager fragmentManager, @N androidx.collection.a<View, android.app.Fragment> aVar) {
        List<android.app.Fragment> fragments;
        if (Build.VERSION.SDK_INT >= 26) {
            fragments = fragmentManager.getFragments();
            for (android.app.Fragment fragment : fragments) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        e(fragmentManager, aVar);
    }

    @Deprecated
    private void e(@N FragmentManager fragmentManager, @N androidx.collection.a<View, android.app.Fragment> aVar) {
        android.app.Fragment fragment;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            this.f26696j.putInt(f26687p, i4);
            try {
                fragment = fragmentManager.getFragment(this.f26696j, f26687p);
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager(), aVar);
            }
            i4 = i5;
        }
    }

    private static void f(@P Collection<Fragment> collection, @N Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                f(fragment.getChildFragmentManager().E0(), map);
            }
        }
    }

    @P
    @Deprecated
    private android.app.Fragment g(@N View view, @N Activity activity) {
        this.f26695i.clear();
        d(activity.getFragmentManager(), this.f26695i);
        View findViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f26695i.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f26695i.clear();
        return fragment;
    }

    @P
    private Fragment h(@N View view, @N ActivityC0889g activityC0889g) {
        this.f26694h.clear();
        f(activityC0889g.S().E0(), this.f26694h);
        View findViewById = activityC0889g.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f26694h.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f26694h.clear();
        return fragment;
    }

    @N
    @Deprecated
    private com.bumptech.glide.j i(@N Context context, @N FragmentManager fragmentManager, @P android.app.Fragment fragment, boolean z3) {
        o r4 = r(fragmentManager, fragment);
        com.bumptech.glide.j e4 = r4.e();
        if (e4 == null) {
            e4 = this.f26693g.a(com.bumptech.glide.b.e(context), r4.c(), r4.f(), context);
            if (z3) {
                e4.b();
            }
            r4.k(e4);
        }
        return e4;
    }

    @N
    private com.bumptech.glide.j p(@N Context context) {
        if (this.f26689c == null) {
            synchronized (this) {
                try {
                    if (this.f26689c == null) {
                        this.f26689c = this.f26693g.a(com.bumptech.glide.b.e(context.getApplicationContext()), new com.bumptech.glide.manager.b(), new h(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f26689c;
    }

    @N
    private o r(@N FragmentManager fragmentManager, @P android.app.Fragment fragment) {
        o oVar = (o) fragmentManager.findFragmentByTag(f26683l);
        if (oVar == null) {
            o oVar2 = this.f26690d.get(fragmentManager);
            if (oVar2 == null) {
                o oVar3 = new o();
                oVar3.j(fragment);
                this.f26690d.put(fragmentManager, oVar3);
                fragmentManager.beginTransaction().add(oVar3, f26683l).commitAllowingStateLoss();
                this.f26692f.obtainMessage(1, fragmentManager).sendToTarget();
                return oVar3;
            }
            return oVar2;
        }
        return oVar;
    }

    @N
    private SupportRequestManagerFragment t(@N androidx.fragment.app.FragmentManager fragmentManager, @P Fragment fragment) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.o0(f26683l);
        if (supportRequestManagerFragment == null) {
            SupportRequestManagerFragment supportRequestManagerFragment2 = this.f26691e.get(fragmentManager);
            if (supportRequestManagerFragment2 == null) {
                SupportRequestManagerFragment supportRequestManagerFragment3 = new SupportRequestManagerFragment();
                supportRequestManagerFragment3.s0(fragment);
                this.f26691e.put(fragmentManager, supportRequestManagerFragment3);
                fragmentManager.q().k(supportRequestManagerFragment3, f26683l).r();
                this.f26692f.obtainMessage(2, fragmentManager).sendToTarget();
                return supportRequestManagerFragment3;
            }
            return supportRequestManagerFragment2;
        }
        return supportRequestManagerFragment;
    }

    private static boolean u(Context context) {
        Activity c4 = c(context);
        if (c4 != null && c4.isFinishing()) {
            return false;
        }
        return true;
    }

    @N
    private com.bumptech.glide.j v(@N Context context, @N androidx.fragment.app.FragmentManager fragmentManager, @P Fragment fragment, boolean z3) {
        SupportRequestManagerFragment t3 = t(fragmentManager, fragment);
        com.bumptech.glide.j requestManager = t3.getRequestManager();
        if (requestManager == null) {
            requestManager = this.f26693g.a(com.bumptech.glide.b.e(context), t3.m0(), t3.getRequestManagerTreeNode(), context);
            if (z3) {
                requestManager.b();
            }
            t3.setRequestManager(requestManager);
        }
        return requestManager;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        ComponentCallbacks remove;
        Object obj2;
        ComponentCallbacks componentCallbacks;
        int i4 = message.what;
        boolean z3 = true;
        if (i4 != 1) {
            if (i4 != 2) {
                componentCallbacks = null;
                z3 = false;
                obj2 = null;
                if (z3 && componentCallbacks == null && Log.isLoggable(f26684m, 5)) {
                    Log.w(f26684m, "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z3;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f26691e.remove(obj);
        } else {
            obj = (FragmentManager) message.obj;
            remove = this.f26690d.remove(obj);
        }
        ComponentCallbacks componentCallbacks2 = remove;
        obj2 = obj;
        componentCallbacks = componentCallbacks2;
        if (z3) {
            Log.w(f26684m, "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z3;
    }

    @N
    public com.bumptech.glide.j j(@N Activity activity) {
        if (com.bumptech.glide.util.n.t()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof ActivityC0889g) {
            return o((ActivityC0889g) activity);
        }
        a(activity);
        this.f26697k.a(activity);
        return i(activity, activity.getFragmentManager(), null, u(activity));
    }

    @N
    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.j k(@N android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!com.bumptech.glide.util.n.t()) {
                if (fragment.getActivity() != null) {
                    this.f26697k.a(fragment.getActivity());
                }
                return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return l(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    @N
    public com.bumptech.glide.j l(@N Context context) {
        if (context != null) {
            if (com.bumptech.glide.util.n.u() && !(context instanceof Application)) {
                if (context instanceof ActivityC0889g) {
                    return o((ActivityC0889g) context);
                }
                if (context instanceof Activity) {
                    return j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return l(contextWrapper.getBaseContext());
                    }
                }
            }
            return p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @N
    public com.bumptech.glide.j m(@N View view) {
        if (com.bumptech.glide.util.n.t()) {
            return l(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.l.d(view);
        com.bumptech.glide.util.l.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c4 = c(view.getContext());
        if (c4 == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (c4 instanceof ActivityC0889g) {
            ActivityC0889g activityC0889g = (ActivityC0889g) c4;
            Fragment h4 = h(view, activityC0889g);
            if (h4 != null) {
                return n(h4);
            }
            return o(activityC0889g);
        }
        android.app.Fragment g4 = g(view, c4);
        if (g4 == null) {
            return j(c4);
        }
        return k(g4);
    }

    @N
    public com.bumptech.glide.j n(@N Fragment fragment) {
        com.bumptech.glide.util.l.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.util.n.t()) {
            return l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f26697k.a(fragment.getActivity());
        }
        return v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @N
    public com.bumptech.glide.j o(@N ActivityC0889g activityC0889g) {
        if (com.bumptech.glide.util.n.t()) {
            return l(activityC0889g.getApplicationContext());
        }
        a(activityC0889g);
        this.f26697k.a(activityC0889g);
        return v(activityC0889g, activityC0889g.S(), null, u(activityC0889g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    @Deprecated
    public o q(Activity activity) {
        return r(activity.getFragmentManager(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public SupportRequestManagerFragment s(androidx.fragment.app.FragmentManager fragmentManager) {
        return t(fragmentManager, null);
    }
}
