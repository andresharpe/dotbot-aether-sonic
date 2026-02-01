package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: T0, reason: collision with root package name */
    private static final String f26655T0 = "SupportRMFragment";

    /* renamed from: N0, reason: collision with root package name */
    private final com.bumptech.glide.manager.a f26656N0;

    /* renamed from: O0, reason: collision with root package name */
    private final r f26657O0;

    /* renamed from: P0, reason: collision with root package name */
    private final Set<SupportRequestManagerFragment> f26658P0;

    /* renamed from: Q0, reason: collision with root package name */
    @P
    private SupportRequestManagerFragment f26659Q0;

    /* renamed from: R0, reason: collision with root package name */
    @P
    private com.bumptech.glide.j f26660R0;

    /* renamed from: S0, reason: collision with root package name */
    @P
    private Fragment f26661S0;

    /* loaded from: classes.dex */
    private class a implements r {
        a() {
        }

        @Override // com.bumptech.glide.manager.r
        @N
        public Set<com.bumptech.glide.j> a() {
            Set<SupportRequestManagerFragment> l02 = SupportRequestManagerFragment.this.l0();
            HashSet hashSet = new HashSet(l02.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : l02) {
                if (supportRequestManagerFragment.getRequestManager() != null) {
                    hashSet.add(supportRequestManagerFragment.getRequestManager());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new com.bumptech.glide.manager.a());
    }

    private void k0(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f26658P0.add(supportRequestManagerFragment);
    }

    @P
    private Fragment n0() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            return this.f26661S0;
        }
        return parentFragment;
    }

    @P
    private static FragmentManager o0(@N Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean p0(@N Fragment fragment) {
        Fragment n02 = n0();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null) {
                if (parentFragment.equals(n02)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    private void q0(@N Context context, @N FragmentManager fragmentManager) {
        t0();
        SupportRequestManagerFragment s4 = com.bumptech.glide.b.e(context).o().s(fragmentManager);
        this.f26659Q0 = s4;
        if (!equals(s4)) {
            this.f26659Q0.k0(this);
        }
    }

    private void r0(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f26658P0.remove(supportRequestManagerFragment);
    }

    private void t0() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f26659Q0;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.r0(this);
            this.f26659Q0 = null;
        }
    }

    @P
    public com.bumptech.glide.j getRequestManager() {
        return this.f26660R0;
    }

    @N
    public r getRequestManagerTreeNode() {
        return this.f26657O0;
    }

    @N
    Set<SupportRequestManagerFragment> l0() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f26659Q0;
        if (supportRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f26658P0);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.f26659Q0.l0()) {
            if (p0(supportRequestManagerFragment2.n0())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public com.bumptech.glide.manager.a m0() {
        return this.f26656N0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager o02 = o0(this);
        if (o02 == null) {
            if (Log.isLoggable(f26655T0, 5)) {
                Log.w(f26655T0, "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                q0(getContext(), o02);
            } catch (IllegalStateException e4) {
                if (Log.isLoggable(f26655T0, 5)) {
                    Log.w(f26655T0, "Unable to register fragment with root", e4);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f26656N0.c();
        t0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f26661S0 = null;
        t0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f26656N0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f26656N0.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s0(@P Fragment fragment) {
        FragmentManager o02;
        this.f26661S0 = fragment;
        if (fragment == null || fragment.getContext() == null || (o02 = o0(fragment)) == null) {
            return;
        }
        q0(fragment.getContext(), o02);
    }

    public void setRequestManager(@P com.bumptech.glide.j jVar) {
        this.f26660R0 = jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + n0() + "}";
    }

    @i0
    @SuppressLint({"ValidFragment"})
    public SupportRequestManagerFragment(@N com.bumptech.glide.manager.a aVar) {
        this.f26657O0 = new a();
        this.f26658P0 = new HashSet();
        this.f26656N0 = aVar;
    }
}
