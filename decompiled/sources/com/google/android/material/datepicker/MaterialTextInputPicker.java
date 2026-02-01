package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class MaterialTextInputPicker<S> extends q<S> {

    /* renamed from: R0, reason: collision with root package name */
    private static final String f32164R0 = "THEME_RES_ID_KEY";

    /* renamed from: S0, reason: collision with root package name */
    private static final String f32165S0 = "DATE_SELECTOR_KEY";

    /* renamed from: T0, reason: collision with root package name */
    private static final String f32166T0 = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: O0, reason: collision with root package name */
    @d0
    private int f32167O0;

    /* renamed from: P0, reason: collision with root package name */
    @P
    private f<S> f32168P0;

    /* renamed from: Q0, reason: collision with root package name */
    @P
    private com.google.android.material.datepicker.a f32169Q0;

    /* loaded from: classes2.dex */
    class a extends p<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.p
        public void a() {
            Iterator<p<S>> it = MaterialTextInputPicker.this.f32247N0.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.p
        public void b(S s4) {
            Iterator<p<S>> it = MaterialTextInputPicker.this.f32247N0.iterator();
            while (it.hasNext()) {
                it.next().b(s4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static <T> MaterialTextInputPicker<T> m0(f<T> fVar, @d0 int i4, @N com.google.android.material.datepicker.a aVar) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f32164R0, i4);
        bundle.putParcelable(f32165S0, fVar);
        bundle.putParcelable(f32166T0, aVar);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // com.google.android.material.datepicker.q
    @N
    public f<S> getDateSelector() {
        f<S> fVar = this.f32168P0;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32167O0 = bundle.getInt(f32164R0);
        this.f32168P0 = (f) bundle.getParcelable(f32165S0);
        this.f32169Q0 = (com.google.android.material.datepicker.a) bundle.getParcelable(f32166T0);
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        return this.f32168P0.p(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f32167O0)), viewGroup, bundle, this.f32169Q0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f32164R0, this.f32167O0);
        bundle.putParcelable(f32165S0, this.f32168P0);
        bundle.putParcelable(f32166T0, this.f32169Q0);
    }
}
