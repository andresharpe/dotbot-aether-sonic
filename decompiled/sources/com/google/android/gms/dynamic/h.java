package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.dynamic.c;

@I0.a
/* loaded from: classes.dex */
public final class h extends c.a {

    /* renamed from: i, reason: collision with root package name */
    private Fragment f29047i;

    private h(Fragment fragment) {
        this.f29047i = fragment;
    }

    @P
    @I0.a
    public static h G(@P Fragment fragment) {
        if (fragment != null) {
            return new h(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.c
    public final void B0(@N Intent intent, int i4) {
        this.f29047i.startActivityForResult(intent, i4);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean C() {
        return this.f29047i.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void C1(boolean z3) {
        this.f29047i.setUserVisibleHint(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean F() {
        return this.f29047i.isVisible();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean H() {
        return this.f29047i.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void I(boolean z3) {
        this.f29047i.setHasOptionsMenu(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void W(boolean z3) {
        this.f29047i.setMenuVisibility(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean c() {
        return this.f29047i.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean d() {
        return this.f29047i.isResumed();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void h1(@N d dVar) {
        View view = (View) f.G(dVar);
        Fragment fragment = this.f29047i;
        C1285y.l(view);
        fragment.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k1(@N d dVar) {
        View view = (View) f.G(dVar);
        Fragment fragment = this.f29047i;
        C1285y.l(view);
        fragment.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean n() {
        return this.f29047i.isHidden();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void q0(boolean z3) {
        this.f29047i.setRetainInstance(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean u() {
        return this.f29047i.isAdded();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void x0(@N Intent intent) {
        this.f29047i.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzb() {
        return this.f29047i.getId();
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzc() {
        return this.f29047i.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final Bundle zzd() {
        return this.f29047i.getArguments();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zze() {
        return G(this.f29047i.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zzf() {
        return G(this.f29047i.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final d zzg() {
        return f.O0(this.f29047i.getActivity());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final d zzh() {
        return f.O0(this.f29047i.getResources());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final d zzi() {
        return f.O0(this.f29047i.getView());
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final String zzj() {
        return this.f29047i.getTag();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzv() {
        return this.f29047i.isDetached();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzx() {
        return this.f29047i.isInLayout();
    }
}
