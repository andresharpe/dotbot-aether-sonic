package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class q<S> extends Fragment {

    /* renamed from: N0, reason: collision with root package name */
    protected final LinkedHashSet<p<S>> f32247N0 = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean addOnSelectionChangedListener(p<S> pVar) {
        return this.f32247N0.add(pVar);
    }

    abstract f<S> getDateSelector();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k0() {
        this.f32247N0.clear();
    }

    boolean l0(p<S> pVar) {
        return this.f32247N0.remove(pVar);
    }
}
