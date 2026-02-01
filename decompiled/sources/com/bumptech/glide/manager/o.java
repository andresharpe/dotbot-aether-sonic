package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class o extends Fragment {

    /* renamed from: K, reason: collision with root package name */
    private static final String f26675K = "RMFragment";

    /* renamed from: E, reason: collision with root package name */
    private final com.bumptech.glide.manager.a f26676E;

    /* renamed from: F, reason: collision with root package name */
    private final r f26677F;

    /* renamed from: G, reason: collision with root package name */
    private final Set<o> f26678G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private com.bumptech.glide.j f26679H;

    /* renamed from: I, reason: collision with root package name */
    @P
    private o f26680I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private Fragment f26681J;

    /* loaded from: classes.dex */
    private class a implements r {
        a() {
        }

        @Override // com.bumptech.glide.manager.r
        @N
        public Set<com.bumptech.glide.j> a() {
            Set<o> b4 = o.this.b();
            HashSet hashSet = new HashSet(b4.size());
            for (o oVar : b4) {
                if (oVar.e() != null) {
                    hashSet.add(oVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new com.bumptech.glide.manager.a());
    }

    private void a(o oVar) {
        this.f26678G.add(oVar);
    }

    @P
    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            return this.f26681J;
        }
        return parentFragment;
    }

    @TargetApi(17)
    private boolean g(@N Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 != null) {
                if (parentFragment2.equals(parentFragment)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    private void h(@N Activity activity) {
        l();
        o q4 = com.bumptech.glide.b.e(activity).o().q(activity);
        this.f26680I = q4;
        if (!equals(q4)) {
            this.f26680I.a(this);
        }
    }

    private void i(o oVar) {
        this.f26678G.remove(oVar);
    }

    private void l() {
        o oVar = this.f26680I;
        if (oVar != null) {
            oVar.i(this);
            this.f26680I = null;
        }
    }

    @N
    @TargetApi(17)
    Set<o> b() {
        if (equals(this.f26680I)) {
            return Collections.unmodifiableSet(this.f26678G);
        }
        if (this.f26680I != null) {
            HashSet hashSet = new HashSet();
            for (o oVar : this.f26680I.b()) {
                if (g(oVar.getParentFragment())) {
                    hashSet.add(oVar);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public com.bumptech.glide.manager.a c() {
        return this.f26676E;
    }

    @P
    public com.bumptech.glide.j e() {
        return this.f26679H;
    }

    @N
    public r f() {
        return this.f26677F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(@P Fragment fragment) {
        this.f26681J = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            h(fragment.getActivity());
        }
    }

    public void k(@P com.bumptech.glide.j jVar) {
        this.f26679H = jVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e4) {
            if (Log.isLoggable(f26675K, 5)) {
                Log.w(f26675K, "Unable to register fragment with root", e4);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f26676E.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f26676E.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f26676E.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @i0
    @SuppressLint({"ValidFragment"})
    o(@N com.bumptech.glide.manager.a aVar) {
        this.f26677F = new a();
        this.f26678G = new HashSet();
        this.f26676E = aVar;
    }
}
