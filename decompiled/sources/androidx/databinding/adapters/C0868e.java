package androidx.databinding.adapters;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @androidx.databinding.g(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:selectedItemPosition", type = AdapterView.class), @androidx.databinding.p(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
/* renamed from: androidx.databinding.adapters.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0868e {

    /* renamed from: androidx.databinding.adapters.e$a */
    /* loaded from: classes.dex */
    public interface a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4);
    }

    /* renamed from: androidx.databinding.adapters.e$b */
    /* loaded from: classes.dex */
    public static class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: E, reason: collision with root package name */
        private final a f14048E;

        /* renamed from: F, reason: collision with root package name */
        private final c f14049F;

        /* renamed from: G, reason: collision with root package name */
        private final androidx.databinding.o f14050G;

        public b(a aVar, c cVar, androidx.databinding.o oVar) {
            this.f14048E = aVar;
            this.f14049F = cVar;
            this.f14050G = oVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            a aVar = this.f14048E;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i4, j4);
            }
            androidx.databinding.o oVar = this.f14050G;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            c cVar = this.f14049F;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            androidx.databinding.o oVar = this.f14050G;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    /* renamed from: androidx.databinding.adapters.e$c */
    /* loaded from: classes.dex */
    public interface c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void a(AdapterView adapterView, a aVar, c cVar, androidx.databinding.o oVar) {
        if (aVar == null && cVar == null && oVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new b(aVar, cVar, oVar));
        }
    }

    @InterfaceC0879d({"android:selectedItemPosition"})
    public static void b(AdapterView adapterView, int i4) {
        if (adapterView.getSelectedItemPosition() != i4) {
            adapterView.setSelection(i4);
        }
    }

    @InterfaceC0879d({"android:selectedItemPosition", "android:adapter"})
    public static void c(AdapterView adapterView, int i4, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i4);
        } else if (adapterView.getSelectedItemPosition() != i4) {
            adapterView.setSelection(i4);
        }
    }

    @InterfaceC0879d({"android:selection"})
    public static void d(AdapterView adapterView, int i4) {
        b(adapterView, i4);
    }

    @InterfaceC0879d({"android:selection", "android:adapter"})
    public static void e(AdapterView adapterView, int i4, Adapter adapter) {
        c(adapterView, i4, adapter);
    }
}
