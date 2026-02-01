package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.dynamic.c;

@I0.a
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class b extends c.a {

    /* renamed from: i, reason: collision with root package name */
    private Fragment f29045i;

    private b(Fragment fragment) {
        this.f29045i = fragment;
    }

    @P
    @I0.a
    public static b G(@P Fragment fragment) {
        if (fragment != null) {
            return new b(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.c
    public final void B0(@N Intent intent, int i4) {
        this.f29045i.startActivityForResult(intent, i4);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean C() {
        return this.f29045i.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void C1(boolean z3) {
        this.f29045i.setUserVisibleHint(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean F() {
        return this.f29045i.isVisible();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean H() {
        return this.f29045i.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void I(boolean z3) {
        this.f29045i.setHasOptionsMenu(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void W(boolean z3) {
        this.f29045i.setMenuVisibility(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean c() {
        return this.f29045i.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean d() {
        return this.f29045i.isResumed();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void h1(@N d dVar) {
        View view = (View) f.G(dVar);
        Fragment fragment = this.f29045i;
        C1285y.l(view);
        fragment.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k1(@N d dVar) {
        View view = (View) f.G(dVar);
        Fragment fragment = this.f29045i;
        C1285y.l(view);
        fragment.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean n() {
        return this.f29045i.isHidden();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void q0(boolean z3) {
        this.f29045i.setRetainInstance(z3);
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean u() {
        return this.f29045i.isAdded();
    }

    @Override // com.google.android.gms.dynamic.c
    public final void x0(@N Intent intent) {
        this.f29045i.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzb() {
        return this.f29045i.getId();
    }

    @Override // com.google.android.gms.dynamic.c
    public final int zzc() {
        return this.f29045i.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final Bundle zzd() {
        return this.f29045i.getArguments();
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zze() {
        return G(this.f29045i.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final c zzf() {
        return G(this.f29045i.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final d zzg() {
        return f.O0(this.f29045i.getActivity());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final d zzh() {
        return f.O0(this.f29045i.getResources());
    }

    @Override // com.google.android.gms.dynamic.c
    @N
    public final d zzi() {
        return f.O0(this.f29045i.getView());
    }

    @Override // com.google.android.gms.dynamic.c
    @P
    public final String zzj() {
        return this.f29045i.getTag();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzv() {
        return this.f29045i.isDetached();
    }

    @Override // com.google.android.gms.dynamic.c
    public final boolean zzx() {
        return this.f29045i.isInLayout();
    }
}
